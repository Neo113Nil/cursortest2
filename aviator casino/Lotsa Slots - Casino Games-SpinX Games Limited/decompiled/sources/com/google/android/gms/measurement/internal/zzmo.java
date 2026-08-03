package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbg zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzd;

    zzmo(com.google.android.gms.measurement.internal.zznk zznkVar, com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzbgVar;
        this.zzb = str;
        this.zzc = zzcuVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        com.google.android.gms.measurement.internal.zzpo zzk;
        com.google.android.gms.measurement.internal.zznk zznkVar;
        com.google.android.gms.measurement.internal.zzga zzZ;
        byte[] bArr = null;
        try {
            try {
                zznkVar = this.zzd;
                zzZ = zznkVar.zzZ();
            } catch (android.os.RemoteException e) {
                this.zzd.zzu.zzaV().zzb().zzb("Failed to send event to the service to bundle", e);
            }
            if (zzZ == null) {
                com.google.android.gms.measurement.internal.zzib zzibVar = zznkVar.zzu;
                zzibVar.zzaV().zzb().zza("Discarding data. Failed to send event to service to bundle");
                zzk = zzibVar.zzk();
                zzcuVar = this.zzc;
                zzk.zzao(zzcuVar, bArr);
            }
            bArr = zzZ.zzk(this.zza, this.zzb);
            zznkVar.zzV();
            com.google.android.gms.measurement.internal.zznk zznkVar2 = this.zzd;
            zzcuVar = this.zzc;
            zzk = zznkVar2.zzu.zzk();
            zzk.zzao(zzcuVar, bArr);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.measurement.internal.zznk zznkVar3 = this.zzd;
            zznkVar3.zzu.zzk().zzao(this.zzc, null);
            throw th;
        }
    }
}
