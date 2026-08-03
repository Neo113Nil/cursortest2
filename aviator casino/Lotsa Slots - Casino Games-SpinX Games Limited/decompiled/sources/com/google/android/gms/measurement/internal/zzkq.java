package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkq implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzkq(com.google.android.gms.measurement.internal.zzli zzliVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
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
                atomicReference.set(java.lang.Double.valueOf(zzliVar.zzu.zzc().zzo(zzliVar.zzu.zzv().zzj(), com.google.android.gms.measurement.internal.zzfx.zzae)));
            } finally {
                this.zza.notify();
            }
        }
    }
}
