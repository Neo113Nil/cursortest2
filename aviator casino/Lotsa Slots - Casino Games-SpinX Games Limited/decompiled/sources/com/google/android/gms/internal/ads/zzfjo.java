package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfjo implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzetr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfjr zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfjs zze;

    zzfjo(com.google.android.gms.internal.ads.zzfjs zzfjsVar, com.google.android.gms.internal.ads.zzetr zzetrVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzfjr zzfjrVar) {
        this.zza = zzetrVar;
        this.zzb = zzfqgVar;
        this.zzc = zzfpwVar;
        this.zzd = zzfjrVar;
        java.util.Objects.requireNonNull(zzfjsVar);
        this.zze = zzfjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        com.google.android.gms.internal.ads.zzfjs zzfjsVar = this.zze;
        com.google.android.gms.internal.ads.zzdvr zzdvrVar = (com.google.android.gms.internal.ads.zzdvr) zzfjsVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdvrVar == null ? com.google.android.gms.internal.ads.zzfma.zzb(th, null) : zzdvrVar.zza().zzg(th);
        synchronized (zzfjsVar) {
            if (zzdvrVar != null) {
                zzdvrVar.zze().zzdJ(zzb);
                zzfjsVar.zzf().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfjn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfjo.this.zze.zzg().zzdJ(zzb);
                    }
                });
            } else {
                zzfjsVar.zzg().zzdJ(zzb);
                zzfjsVar.zze(this.zzd).zzh().zza().zzd().zzo();
            }
            com.google.android.gms.internal.ads.zzflv.zza(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfqj zzi = zzfjsVar.zzi();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzh(zzb);
                zzfpwVar.zzj(th);
                zzfpwVar.zzd(false);
                zzi.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zzf(zzb);
                com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzc;
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
        com.google.android.gms.internal.ads.zzfjs zzfjsVar = this.zze;
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = (com.google.android.gms.internal.ads.zzdvm) obj;
        synchronized (zzfjsVar) {
            if (zzdvmVar != null) {
                zzdvmVar.zzt();
            }
            zzdvmVar.zzq().zzd(zzfjsVar.zzg());
            this.zza.zzb(zzdvmVar);
            java.util.concurrent.Executor zzf = zzfjsVar.zzf();
            final com.google.android.gms.internal.ads.zzfjj zzg = zzfjsVar.zzg();
            java.util.Objects.requireNonNull(zzg);
            zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfjm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfjj.this.zzg();
                }
            });
            zzfjsVar.zzg().onAdMetadataChanged();
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfqj zzi = zzfjsVar.zzi();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzg(zzdvmVar.zzr().zzb);
                zzfpwVar.zzi(zzdvmVar.zzn().zze());
                zzfpwVar.zzd(true);
                zzi.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zze(zzdvmVar.zzr().zzb);
                zzfqgVar.zzg(zzdvmVar.zzn().zze());
                com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzc;
                zzfpwVar2.zzd(true);
                zzfqgVar.zza(zzfpwVar2);
                zzfqgVar.zzh();
            }
        }
    }
}
