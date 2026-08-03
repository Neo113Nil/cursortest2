package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmc implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzd;

    zzmc(com.google.android.gms.measurement.internal.zznk zznkVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        this.zzc = z;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.gms.measurement.internal.zznk zznkVar;
        com.google.android.gms.measurement.internal.zzga zzZ;
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznkVar = this.zzd;
                    zzZ = zznkVar.zzZ();
                } catch (android.os.RemoteException e) {
                    this.zzd.zzu.zzaV().zzb().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.zza;
                }
                if (zzZ == null) {
                    zznkVar.zzu.zzaV().zzb().zza("Failed to get all user properties; not connected to service");
                    atomicReference2.notify();
                    return;
                }
                com.google.android.gms.measurement.internal.zzr zzrVar = this.zzb;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                atomicReference2.set(zzZ.zzj(zzrVar, this.zzc));
                zznkVar.zzV();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
