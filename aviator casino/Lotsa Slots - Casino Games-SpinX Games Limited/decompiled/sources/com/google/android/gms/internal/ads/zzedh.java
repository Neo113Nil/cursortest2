package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzedh extends com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzedo zzb;

    zzedh(com.google.android.gms.internal.ads.zzedo zzedoVar, java.lang.String str) {
        this.zza = str;
        java.util.Objects.requireNonNull(zzedoVar);
        this.zzb = zzedoVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        java.lang.String zzm;
        com.google.android.gms.internal.ads.zzedo zzedoVar = this.zzb;
        zzm = com.google.android.gms.internal.ads.zzedo.zzm(loadAdError);
        zzedoVar.zzg(zzm);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd rewardedInterstitialAd) {
        this.zzb.zzf(this.zza, rewardedInterstitialAd);
    }
}
