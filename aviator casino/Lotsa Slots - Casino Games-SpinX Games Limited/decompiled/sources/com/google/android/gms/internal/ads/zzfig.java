package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfig implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzetr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdng zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfii zze;

    zzfig(com.google.android.gms.internal.ads.zzfii zzfiiVar, com.google.android.gms.internal.ads.zzetr zzetrVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzdng zzdngVar) {
        this.zza = zzetrVar;
        this.zzb = zzfqgVar;
        this.zzc = zzfpwVar;
        this.zzd = zzdngVar;
        java.util.Objects.requireNonNull(zzfiiVar);
        this.zze = zzfiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        com.google.android.gms.internal.ads.zzdng zzdngVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdngVar.zzb().zzg(th);
        com.google.android.gms.internal.ads.zzfii zzfiiVar = this.zze;
        synchronized (zzfiiVar) {
            zzfiiVar.zzi(null);
            zzdngVar.zza().zzdJ(zzg);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjw)).booleanValue()) {
                zzfiiVar.zze().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfid
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfig.this.zze.zzf().zzdJ(zzg);
                    }
                });
                zzfiiVar.zze().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfie
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfig.this.zze.zzg().zzdJ(zzg);
                    }
                });
            }
            com.google.android.gms.internal.ads.zzflv.zza(zzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfqj zzh = zzfiiVar.zzh();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzh(zzg);
                zzfpwVar.zzj(th);
                zzfpwVar.zzd(false);
                zzh.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zzf(zzg);
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
        com.google.android.gms.internal.ads.zzfii zzfiiVar = this.zze;
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = (com.google.android.gms.internal.ads.zzdlz) obj;
        synchronized (zzfiiVar) {
            if (zzdlzVar != null) {
                zzdlzVar.zzt();
            }
            zzfiiVar.zzi(null);
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzjw;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                com.google.android.gms.internal.ads.zzdgh zzq = zzdlzVar.zzq();
                zzq.zza(zzfiiVar.zzf());
                zzq.zzd(zzfiiVar.zzg());
            }
            this.zza.zzb(zzdlzVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                zzfiiVar.zze().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfif
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfig.this.zze.zzf().zzg();
                    }
                });
                zzfiiVar.zze().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfic
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfig.this.zze.zzg().zzg();
                    }
                });
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfqj zzh = zzfiiVar.zzh();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzg(zzdlzVar.zzr().zzb);
                zzfpwVar.zzi(zzdlzVar.zzn().zze());
                zzfpwVar.zzd(true);
                zzh.zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zze(zzdlzVar.zzr().zzb);
                zzfqgVar.zzg(zzdlzVar.zzn().zze());
                com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzc;
                zzfpwVar2.zzd(true);
                zzfqgVar.zza(zzfpwVar2);
                zzfqgVar.zzh();
            }
        }
    }
}
