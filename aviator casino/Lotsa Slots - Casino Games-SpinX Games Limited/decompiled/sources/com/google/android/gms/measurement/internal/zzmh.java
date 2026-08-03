package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmh implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzc;

    zzmh(com.google.android.gms.measurement.internal.zznk zznkVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzc = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.gms.measurement.internal.zznk zznkVar;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznkVar = this.zzc;
                    zzibVar = zznkVar.zzu;
                } catch (android.os.RemoteException e) {
                    this.zzc.zzu.zzaV().zzb().zzb("Failed to get app instance id", e);
                    atomicReference = this.zza;
                }
                if (!zzibVar.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                    zzibVar.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
                    zznkVar.zzu.zzj().zzR(null);
                    zzibVar.zzd().zze.zzb(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                    return;
                }
                com.google.android.gms.measurement.internal.zzga zzZ = zznkVar.zzZ();
                if (zzZ == null) {
                    zzibVar.zzaV().zzb().zza("Failed to get app instance id");
                    atomicReference2.notify();
                    return;
                }
                com.google.android.gms.measurement.internal.zzr zzrVar = this.zzb;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                atomicReference2.set(zzZ.zzm(zzrVar));
                java.lang.String str = (java.lang.String) atomicReference2.get();
                if (str != null) {
                    zznkVar.zzu.zzj().zzR(str);
                    zzibVar.zzd().zze.zzb(str);
                }
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
