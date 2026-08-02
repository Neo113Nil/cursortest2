package com.adjust.sdk.scheduler;

/* loaded from: classes7.dex */
public class ThreadFactoryWrapper implements java.util.concurrent.ThreadFactory {
    private java.lang.String source;

    public ThreadFactoryWrapper(java.lang.String str) {
        this.source = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(9);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.adjust.sdk.Constants.THREAD_PREFIX);
        sb.append(newThread.getName());
        sb.append("-");
        sb.append(this.source);
        newThread.setName(sb.toString());
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.adjust.sdk.scheduler.ThreadFactoryWrapper.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                com.adjust.sdk.AdjustFactory.getLogger().error("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
            }
        });
        return newThread;
    }
}
