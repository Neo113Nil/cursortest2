package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzebn extends com.google.android.gms.internal.ads.zzbrs {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zze;
    final /* synthetic */ com.google.android.gms.internal.ads.zzebw zzf;

    zzebn(com.google.android.gms.internal.ads.zzebw zzebwVar, java.lang.Object obj, java.lang.String str, long j, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfpwVar;
        this.zze = zzcfwVar;
        java.util.Objects.requireNonNull(zzebwVar);
        this.zzf = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zze() {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzebw zzebwVar = this.zzf;
            java.lang.String str = this.zzb;
            zzebwVar.zzm(str, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzebwVar.zzr().zzb(str);
            zzebwVar.zzs().zzb(str);
            com.google.android.gms.internal.ads.zzfqj zzt = zzebwVar.zzt();
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzd;
            zzfpwVar.zzd(true);
            zzt.zzb(zzfpwVar.zzm());
            this.zze.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzf(java.lang.String str) {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzebw zzebwVar = this.zzf;
            java.lang.String str2 = this.zzb;
            zzebwVar.zzm(str2, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzebwVar.zzr().zzc(str2, "error");
            zzebwVar.zzs().zzc(str2, "error");
            com.google.android.gms.internal.ads.zzfqj zzt = zzebwVar.zzt();
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzd;
            zzfpwVar.zzk(str);
            zzfpwVar.zzd(false);
            zzt.zzb(zzfpwVar.zzm());
            this.zze.zzc(false);
        }
    }
}
