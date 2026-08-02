package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvm implements java.util.concurrent.ScheduledExecutorService {
    final java.util.concurrent.ScheduledExecutorService zza;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.zza.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) throws java.lang.InterruptedException {
        return this.zza.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return this.zza.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException("Restricted: shutdown() is not allowed");
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return this.zza.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.zza.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return this.zza.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return this.zza.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return this.zza.submit(callable);
    }
}
