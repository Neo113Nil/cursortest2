package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
final class zzx implements java.io.Closeable {
    final /* synthetic */ com.google.mlkit.common.sdkinternal.TaskQueue zza;

    /* synthetic */ zzx(com.google.mlkit.common.sdkinternal.TaskQueue taskQueue, com.google.mlkit.common.sdkinternal.zzw zzwVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        this.zza = taskQueue;
        atomicReference = taskQueue.zzd;
        com.google.android.gms.common.internal.Preconditions.checkState(((java.lang.Thread) atomicReference.getAndSet(java.lang.Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        atomicReference = this.zza.zzd;
        atomicReference.set(null);
        this.zza.zzc();
    }
}
