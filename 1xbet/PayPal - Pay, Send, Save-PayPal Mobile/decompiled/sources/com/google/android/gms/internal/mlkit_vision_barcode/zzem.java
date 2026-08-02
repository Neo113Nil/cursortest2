package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzem implements com.google.android.gms.internal.mlkit_vision_barcode.zzet {
    private static final com.google.android.gms.internal.mlkit_vision_barcode.zzes zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzes(com.google.android.gms.internal.mlkit_vision_barcode.zzem.class);
    private final java.lang.Object zzb;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        timeUnit.getClass();
        return this.zzb;
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
        java.lang.Object obj = this.zzb;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzet
    public final void zzl(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzc(executor, "Executor was null.");
        try {
            runnable.run();
        } catch (java.lang.Exception e) {
            zza.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.zzb;
    }

    zzem(java.lang.Object obj) {
        this.zzb = obj;
    }
}
