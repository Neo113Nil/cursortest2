package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzedx implements com.google.android.gms.internal.ads.zzasa {
    final /* synthetic */ com.google.android.gms.internal.ads.zzedy zza;

    zzedx(com.google.android.gms.internal.ads.zzedy zzedyVar) {
        java.util.Objects.requireNonNull(zzedyVar);
        this.zza = zzedyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zza(int i) {
        com.google.android.gms.internal.ads.zzasb zzd;
        try {
            com.google.android.gms.internal.ads.zzfqt zza = com.google.android.gms.internal.ads.zzfqu.zza();
            zza.zzh(i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3);
            if (i == 0 && (zzd = this.zza.zzc().zzd()) != null) {
                zza.zzb(zzd.zzb());
                zza.zzc(zzd.zzc());
                zza.zzd(zzd.zzd());
                zza.zze(zzd.zze());
                zza.zzf(zzd.zzf());
                if (!android.text.TextUtils.isEmpty(zzd.zza())) {
                    zza.zza(zzd.zza());
                }
                if (!android.text.TextUtils.isEmpty(zzd.zzg())) {
                    zza.zzg(zzd.zzg());
                }
            }
            com.google.android.gms.internal.ads.zzedy zzedyVar = this.zza;
            zzedyVar.zzc().zzc();
            com.google.android.gms.internal.ads.zzdzl zzd2 = zzedyVar.zzd();
            java.lang.String encodeToString = android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzfqu) zza.zzbu()).zzaN(), 1);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfP)).booleanValue()) {
                com.google.android.gms.internal.ads.zzdzk zza2 = zzd2.zza();
                zza2.zzc("action", "irda");
                zza2.zzc("irdd", encodeToString);
                zza2.zzf();
            }
            zzedyVar.zze().zzQ(true);
        } catch (java.lang.Exception e) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfQ)).booleanValue()) {
                com.google.android.gms.internal.ads.zzedy zzedyVar2 = this.zza;
                if (zzedyVar2.zzb == null) {
                    zzedyVar2.zzb = com.google.android.gms.internal.ads.zzbzy.zzc(zzedyVar2.zzb());
                }
                zzedyVar2.zzb.zzh(e, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            com.google.android.gms.internal.ads.zzedy zzedyVar3 = this.zza;
            if (zzedyVar3.zza == null) {
                zzedyVar3.zza = com.google.android.gms.internal.ads.zzbzy.zza(zzedyVar3.zzb());
            }
            zzedyVar3.zza.zzh(e, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
