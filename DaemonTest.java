package test;
//here we cretaed test as my which that organizes a set of related classes and interfaces.
public class DaemonTest extends Thread {
	
	public void run(){
		//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread : " + Thread.currentThread().getName());
			//system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.
		}
		else
		{
			System.out.println("user thread : " + Thread.currentThread().getName());
			//system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.
		}
	}

          public static void main(String[]args)
          	//public : it can be called from anywhere.
  			//static : doesn't belong to a specific object.
          	//void : returns to no value.
  			//main : is special because it will start the program.
			//declares method String[]
			//String[]args means arguments will be passed into main method and says that main() as a parameter
          {
        	  DaemonTest test1 = new DaemonTest();//deamontest
        	  test1.setName("Thread 1");//thread1
        	  DaemonTest test2 = new DaemonTest();//deamontest2
        	  test2.setName("Thread 2");//thread2
        	  
        	  test1.setDaemon(true);//true
        	  test1.start();//starting test1
        	  test2.start();//starting test2
          }
}



	