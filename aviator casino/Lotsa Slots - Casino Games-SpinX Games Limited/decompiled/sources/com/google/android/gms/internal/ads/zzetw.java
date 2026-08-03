package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzetw implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzetr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdoc zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzetz zze;

    zzetw(com.google.android.gms.internal.ads.zzetz zzetzVar, com.google.android.gms.internal.ads.zzetr zzetrVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzdoc zzdocVar) {
        this.zza = zzetrVar;
        this.zzb = zzfqgVar;
        this.zzc = zzfpwVar;
        this.zzd = zzdocVar;
        java.util.Objects.requireNonNull(zzetzVar);
        this.zze = zzetzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        com.google.android.gms.internal.ads.zzdoc zzdocVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdocVar.zza().zzg(th);
        zzdocVar.zzb().zzdJ(zzg);
        com.google.android.gms.internal.ads.zzetz zzetzVar = this.zze;
        zzetzVar.zze().zzb().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzetu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzetw.this.zze.zzf().zze().zzdJ(zzg);
            }
        });
        com.google.android.gms.internal.ads.zzflv.zza(zzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
            com.google.android.gms.internal.ads.zzfqj zzg2 = zzetzVar.zzg();
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
            zzfpwVar.zzh(zzg);
            zzfpwVar.zzj(th);
            zzfpwVar.zzd(false);
            zzg2.zzb(zzfpwVar.zzm());
            return;
        }
        zzfqgVar.zzf(zzg);
        com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzc;
        zzfpwVar2.zzj(th);
        zzfpwVar2.zzd(false);
        zzfqgVar.zza(zzfpwVar2);
        zzfqgVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        com.google.android.gms.internal.ads.zzetz zzetzVar = this.zze;
        com.google.android.gms.internal.ads.zzcxt zzcxtVar = (com.google.android.gms.internal.ads.zzcxt) obj;
        synchronized (zzetzVar) {
            if (zzcxtVar != null) {
                zzcxtVar.zzt();
            }
            zzcxtVar.zzq().zza(zzetzVar.zzf().zzc());
            this.zza.zzb(zzcxtVar);
            zzetzVar.zze().zzb().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzetv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzetw.this.zze.zzf().zzd().zzg();
                }
            });
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzfqgVar = this.zzb) == null) {
                com.google.android.gms.internal.ads.zzfqj zzg = zzetzVar.zzg();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzc;
                zzfpwVar.zzg(zzcxtVar.zzr().zzb);
                zzfpwVar.zzi(zzcxtVar.zzn().zze());
                zzfpwVar.zzd(true);
                zzg.zzb(zzfpwVar.zzm());
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
