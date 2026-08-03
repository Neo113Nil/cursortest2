package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhca implements com.google.common.util.concurrent.ListenableFuture {
    static final com.google.common.util.concurrent.ListenableFuture zza = new com.google.android.gms.internal.ads.zzhca(null);
    private static final com.google.android.gms.internal.ads.zzhce zzb = new com.google.android.gms.internal.ads.zzhce(com.google.android.gms.internal.ads.zzhca.class);
    private final java.lang.Object zzc;

    zzhca(java.lang.Object obj) {
        this.zzc = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzgtj.zzk(runnable, "Runnable was null.");
        com.google.android.gms.internal.ads.zzgtj.zzk(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            java.util.logging.Logger zza2 = zzb.zza();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            java.lang.String valueOf = java.lang.String.valueOf(runnable);
            java.lang.String valueOf2 = java.lang.String.valueOf(executor);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 57 + java.lang.String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            zza2.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.zzc;
        java.lang.String obj2 = super.toString();
        java.lang.String valueOf = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(obj2).length() + 25 + java.lang.String.valueOf(valueOf).length() + 2);
        sb.append(obj2);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
