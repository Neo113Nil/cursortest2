package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbxi implements com.google.android.gms.ads.mediation.MediationAdLoadCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbws zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvi zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbxo zzc;

    zzbxi(com.google.android.gms.internal.ads.zzbxo zzbxoVar, com.google.android.gms.internal.ads.zzbws zzbwsVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) {
        this.zza = zzbwsVar;
        this.zzb = zzbviVar;
        java.util.Objects.requireNonNull(zzbxoVar);
        this.zzc = zzbxoVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(com.google.android.gms.ads.AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ java.lang.Object onSuccess(java.lang.Object obj) {
        com.google.android.gms.ads.mediation.MediationInterstitialAd mediationInterstitialAd = (com.google.android.gms.ads.mediation.MediationInterstitialAd) obj;
        if (mediationInterstitialAd != null) {
            try {
                this.zzc.zzc(mediationInterstitialAd);
                this.zza.zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            }
            return new com.google.android.gms.internal.ads.zzbxp(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }
}
