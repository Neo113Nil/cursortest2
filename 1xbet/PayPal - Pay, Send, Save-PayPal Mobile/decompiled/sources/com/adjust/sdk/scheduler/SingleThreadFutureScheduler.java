package com.adjust.sdk.scheduler;

/* loaded from: classes7.dex */
public class SingleThreadFutureScheduler implements com.adjust.sdk.scheduler.FutureScheduler {
    private java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public SingleThreadFutureScheduler(final java.lang.String str, boolean z) {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.adjust.sdk.scheduler.ThreadFactoryWrapper(str), new java.util.concurrent.RejectedExecutionHandler() { // from class: com.adjust.sdk.scheduler.SingleThreadFutureScheduler.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                com.adjust.sdk.AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        if (z) {
            return;
        }
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public java.util.concurrent.ScheduledFuture<?> scheduleFuture(java.lang.Runnable runnable, long j) {
        return this.scheduledThreadPoolExecutor.schedule(new com.adjust.sdk.scheduler.RunnableWrapper(runnable), j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public java.util.concurrent.ScheduledFuture<?> scheduleFutureWithFixedDelay(java.lang.Runnable runnable, long j, long j2) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new com.adjust.sdk.scheduler.RunnableWrapper(runnable), j, j2, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public <V> java.util.concurrent.ScheduledFuture<V> scheduleFutureWithReturn(final java.util.concurrent.Callable<V> callable, long j) {
        return this.scheduledThreadPoolExecutor.schedule(new java.util.concurrent.Callable<V>() { // from class: com.adjust.sdk.scheduler.SingleThreadFutureScheduler.2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                try {
                    return callable.call();
                } catch (java.lang.Throwable th) {
                    com.adjust.sdk.AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
                    return null;
                }
            }
        }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}
