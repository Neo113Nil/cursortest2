package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmv implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zze;

    zzmv(com.google.android.gms.measurement.internal.zznk zznkVar, java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = zzcuVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zze = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        com.google.android.gms.measurement.internal.zzpo zzk;
        com.google.android.gms.measurement.internal.zznk zznkVar;
        com.google.android.gms.measurement.internal.zzga zzZ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
                zznkVar = this.zze;
                zzZ = zznkVar.zzZ();
            } catch (android.os.RemoteException e) {
                this.zze.zzu.zzaV().zzb().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            }
            if (zzZ == null) {
                com.google.android.gms.measurement.internal.zzib zzibVar = zznkVar.zzu;
                zzibVar.zzaV().zzb().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                zzk = zzibVar.zzk();
                zzcuVar = this.zzd;
                zzk.zzar(zzcuVar, arrayList);
            }
            com.google.android.gms.measurement.internal.zzr zzrVar = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
            arrayList = com.google.android.gms.measurement.internal.zzpo.zzas(zzZ.zzr(this.zza, this.zzb, zzrVar));
            zznkVar.zzV();
            com.google.android.gms.measurement.internal.zznk zznkVar2 = this.zze;
            zzcuVar = this.zzd;
            zzk = zznkVar2.zzu.zzk();
            zzk.zzar(zzcuVar, arrayList);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.measurement.internal.zznk zznkVar3 = this.zze;
            zznkVar3.zzu.zzk().zzar(this.zzd, arrayList);
            throw th;
        }
    }
}
