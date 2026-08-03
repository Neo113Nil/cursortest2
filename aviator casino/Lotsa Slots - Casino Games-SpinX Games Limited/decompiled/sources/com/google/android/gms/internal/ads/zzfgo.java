package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfgo implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcwq zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgs zzd;

    zzfgo(com.google.android.gms.internal.ads.zzfgs zzfgsVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzcwq zzcwqVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfpwVar;
        this.zzc = zzcwqVar;
        java.util.Objects.requireNonNull(zzfgsVar);
        this.zzd = zzfgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        com.google.android.gms.internal.ads.zzfgs zzfgsVar = this.zzd;
        synchronized (zzfgsVar) {
            com.google.android.gms.internal.ads.zzcwq zzcwqVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zzg = zzcwqVar.zzc().zzg(th);
            zzfgsVar.zzs(zzg);
            zzcwqVar.zzb().zzdJ(zzg);
            com.google.android.gms.internal.ads.zzflv.zza(zzg.zza, th, "BannerAdLoader.onFailure");
            if (zzfgsVar.zzr()) {
                zzfgsVar.zzn();
                zzfgsVar.zzo().zzd(zzfgsVar.zzq().zzc());
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zza) == null) {
                com.google.android.gms.internal.ads.zzfqj zzp = zzfgsVar.zzp();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
                zzfpwVar.zzh(zzg);
                zzfpwVar.zzj(th);
                zzfpwVar.zzd(false);
                zzp.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zzf(zzg);
                com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzb;
                zzfpwVar2.zzj(th);
                zzfpwVar2.zzd(false);
                zzfqgVar.zza(zzfpwVar2);
                zzfqgVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        com.google.android.gms.internal.ads.zzfgs zzfgsVar = this.zzd;
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = (com.google.android.gms.internal.ads.zzcvl) obj;
        synchronized (zzfgsVar) {
            if (zzcvlVar != null) {
                zzcvlVar.zzt();
            }
            if (zzfgsVar.zzr()) {
                zzfgsVar.zzc();
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zza) == null) {
                com.google.android.gms.internal.ads.zzfqj zzp = zzfgsVar.zzp();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
                zzfpwVar.zzg(zzcvlVar.zzr().zzb);
                zzfpwVar.zzi(zzcvlVar.zzn().zze());
                zzfpwVar.zzd(true);
                zzp.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zze(zzcvlVar.zzr().zzb);
                zzfqgVar.zzg(zzcvlVar.zzn().zze());
                com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzb;
                zzfpwVar2.zzd(true);
                zzfqgVar.zza(zzfpwVar2);
                zzfqgVar.zzh();
            }
        }
    }
}
