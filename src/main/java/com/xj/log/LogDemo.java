package com.xj.log;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;

public class LogDemo {
	private Logger logger = Logger.getLogger(LogDemo.class);
	@Test
	public void outputLog() throws InterruptedException
	{
//		System.out.println(logger); 
		while(true)
		{
//			Thread.sleep(100);
			logger.error("hahahahahhahaha");
		}
		
	}
}
