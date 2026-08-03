package com.helpshift.concurrency;

/* loaded from: classes.dex */
public class HSThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String poolName;
    private final java.util.concurrent.atomic.AtomicInteger threadNumber = new java.util.concurrent.atomic.AtomicInteger(1);

    public HSThreadFactory(java.lang.String str) {
        this.poolName = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "HS-" + this.poolName + "-t-" + this.threadNumber.getAndIncrement());
    }
}
