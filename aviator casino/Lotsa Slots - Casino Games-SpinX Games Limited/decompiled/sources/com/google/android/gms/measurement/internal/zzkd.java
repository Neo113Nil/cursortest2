package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkd implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzkd(com.google.android.gms.measurement.internal.zzli zzliVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zza = atomicReference;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
                atomicReference.set(java.lang.Boolean.valueOf(zzliVar.zzu.zzc().zzp(zzliVar.zzu.zzv().zzj(), com.google.android.gms.measurement.internal.zzfx.zzaa)));
            } finally {
                this.zza.notify();
            }
        }
    }
}
