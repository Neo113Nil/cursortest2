package com.bytedance.pcc.pcc.sf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class pcc {
    private static ExecutorService pcc;
    private static ExecutorService sf;

    public static ExecutorService pcc() {
        if (pcc == null) {
            synchronized (pcc.class) {
                if (pcc == null) {
                    pcc = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.bytedance.pcc.pcc.sf.pcc.1
                        final AtomicInteger pcc = new AtomicInteger(0);

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            return new Thread(null, runnable, "ALOG_UP_" + this.pcc.getAndIncrement());
                        }
                    });
                }
            }
        }
        return pcc;
    }

    public static ExecutorService sf() {
        if (sf == null) {
            synchronized (pcc.class) {
                if (sf == null) {
                    sf = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactory() { // from class: com.bytedance.pcc.pcc.sf.pcc.2
                        final AtomicInteger pcc = new AtomicInteger(0);

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            return new Thread(null, runnable, "ALOG_SA_" + this.pcc.getAndIncrement());
                        }
                    });
                }
            }
        }
        return sf;
    }
}
