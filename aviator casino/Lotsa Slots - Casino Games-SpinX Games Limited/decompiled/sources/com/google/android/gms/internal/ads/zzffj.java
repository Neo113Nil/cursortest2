package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzffj implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzetr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzffk zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzffn zze;

    zzffj(com.google.android.gms.internal.ads.zzffn zzffnVar, com.google.android.gms.internal.ads.zzetr zzetrVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzffk zzffkVar) {
        this.zza = zzetrVar;
        this.zzb = zzfqgVar;
        this.zzc = zzfpwVar;
        this.zzd = zzffkVar;
        java.util.Objects.requireNonNull(zzffnVar);
        this.zze = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        com.google.android.gms.internal.ads.zzffn zzffnVar = this.zze;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) zzffnVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcuvVar == null ? com.google.android.gms.internal.ads.zzfma.zzb(th, null) : zzcuvVar.zza().zzg(th);
        synchronized (zzffnVar) {
            zzffnVar.zzl(null);
            if (zzcuvVar != null) {
                zzcuvVar.zze().zzdJ(zzb);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjv)).booleanValue()) {
                    zzffnVar.zzh().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzffi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzffj.this.zze.zzi().zzdJ(zzb);
                        }
                    });
                }
            } else {
                zzffnVar.zzi().zzdJ(zzb);
                ((com.google.android.gms.internal.ads.zzcuv) zzffnVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            com.google.android.gms.internal.ads.zzflv.zza(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfqj zzk = zzffnVar.zzk();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzh(zzb);
                zzfpwVar.zzj(th);
                zzfpwVar.zzd(false);
                zzk.zzb(zzfpwVar.zzm());
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
        com.google.android.gms.internal.ads.zzffn zzffnVar = this.zze;
        com.google.android.gms.internal.ads.zzcxt zzcxtVar = (com.google.android.gms.internal.ads.zzcxt) obj;
        synchronized (zzffnVar) {
            if (zzcxtVar != null) {
                zzcxtVar.zzt();
            }
            zzffnVar.zzl(null);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjv)).booleanValue()) {
                zzcxtVar.zzq().zzc(zzffnVar.zzi());
            }
            this.zza.zzb(zzcxtVar);
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfqj zzk = zzffnVar.zzk();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzg(zzcxtVar.zzr().zzb);
                zzfpwVar.zzi(zzcxtVar.zzn().zze());
                zzfpwVar.zzd(true);
                zzk.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zze(zzcxtVar.zzr().zzb);
                zzfqgVar.zzg(zzcxtVar.zzn().zze());
                com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzc;
                zzfpwVar2.zzd(true);
                zzfqgVar.zza(zzfpwVar2);
                zzfqgVar.zzh();
            }
        }
    }
}
