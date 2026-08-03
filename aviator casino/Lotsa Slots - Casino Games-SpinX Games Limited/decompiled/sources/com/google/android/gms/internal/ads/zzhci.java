package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzhci extends com.google.android.gms.internal.ads.zzhas {
    private final java.util.concurrent.ExecutorService zza;

    zzhci(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.zza.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zza.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final java.lang.String toString() {
        java.util.concurrent.ExecutorService executorService = this.zza;
        java.lang.String obj = super.toString();
        java.lang.String valueOf = java.lang.String.valueOf(executorService);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 1 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append(obj);
        sb.append(com.ironsource.X3.j.d);
        sb.append(valueOf);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }
}
