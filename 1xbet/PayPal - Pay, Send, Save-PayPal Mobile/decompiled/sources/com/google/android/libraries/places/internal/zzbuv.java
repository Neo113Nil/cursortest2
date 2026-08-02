package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuv implements java.util.concurrent.Executor {
    private final com.google.android.libraries.places.internal.zzbwo zza;
    private java.util.concurrent.Executor zzb;

    zzbuv(com.google.android.libraries.places.internal.zzbwo zzbwoVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbwo) com.google.common.base.Preconditions.checkNotNull(zzbwoVar, "executorPool");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        zza().execute(runnable);
    }

    final java.util.concurrent.Executor zza() {
        java.util.concurrent.Executor executor;
        synchronized (this) {
            if (this.zzb == null) {
                this.zzb = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull((java.util.concurrent.Executor) this.zza.zza(), "%s.getObject()", this.zzb);
            }
            executor = this.zzb;
        }
        return executor;
    }

    final void zzb() {
        synchronized (this) {
            java.util.concurrent.Executor executor = this.zzb;
            if (executor != null) {
                this.zza.zzb(executor);
                this.zzb = null;
            }
        }
    }
}
