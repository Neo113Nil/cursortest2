package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzc;

    zzmi(com.google.android.gms.measurement.internal.zznk zznkVar, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzrVar;
        this.zzb = zzcuVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzc = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        com.google.android.gms.measurement.internal.zzpo zzk;
        com.google.android.gms.measurement.internal.zznk zznkVar;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        java.lang.String str = null;
        try {
            try {
                zznkVar = this.zzc;
                zzibVar = zznkVar.zzu;
            } catch (android.os.RemoteException e) {
                this.zzc.zzu.zzaV().zzb().zzb("Failed to get app instance id", e);
            }
            if (zzibVar.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                com.google.android.gms.measurement.internal.zzga zzZ = zznkVar.zzZ();
                if (zzZ != null) {
                    com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                    str = zzZ.zzm(zzrVar);
                    if (str != null) {
                        zznkVar.zzu.zzj().zzR(str);
                        zzibVar.zzd().zze.zzb(str);
                    }
                    zznkVar.zzV();
                    com.google.android.gms.measurement.internal.zznk zznkVar2 = this.zzc;
                    zzcuVar = this.zzb;
                    zzk = zznkVar2.zzu.zzk();
                    zzk.zzal(zzcuVar, str);
                }
                zzibVar.zzaV().zzb().zza("Failed to get app instance id");
            } else {
                zzibVar.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
                zznkVar.zzu.zzj().zzR(null);
                zzibVar.zzd().zze.zzb(null);
            }
            zzk = zzibVar.zzk();
            zzcuVar = this.zzb;
            zzk.zzal(zzcuVar, str);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.measurement.internal.zznk zznkVar3 = this.zzc;
            zznkVar3.zzu.zzk().zzal(this.zzb, null);
            throw th;
        }
    }
}
