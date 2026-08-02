package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class WrappingScheduledExecutorService extends com.google.common.util.concurrent.WrappingExecutorService implements java.util.concurrent.ScheduledExecutorService {
    final java.util.concurrent.ScheduledExecutorService delegate;

    protected WrappingScheduledExecutorService(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.delegate = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.delegate.schedule(wrapTask(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.delegate.schedule(wrapTask(callable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.delegate.scheduleAtFixedRate(wrapTask(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.delegate.scheduleWithFixedDelay(wrapTask(runnable), j, j2, timeUnit);
    }
}
