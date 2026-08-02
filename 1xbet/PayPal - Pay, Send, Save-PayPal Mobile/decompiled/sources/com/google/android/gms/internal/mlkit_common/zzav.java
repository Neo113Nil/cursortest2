package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public abstract class zzav extends com.google.android.gms.internal.mlkit_common.zzx implements java.util.concurrent.ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return zzb().awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        zzb().execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) throws java.lang.InterruptedException {
        return zzb().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return zzb().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return zzb().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return zzb().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        zzb().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return zzb().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return zzb().submit(runnable);
    }

    protected abstract java.util.concurrent.ExecutorService zzb();

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return zzb().invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return zzb().invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return zzb().submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return zzb().submit(callable);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzx
    protected /* bridge */ /* synthetic */ java.lang.Object zza() {
        throw null;
    }
}
