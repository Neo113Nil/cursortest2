package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzedg extends com.google.android.gms.ads.rewarded.RewardedAdLoadCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzedo zzb;

    zzedg(com.google.android.gms.internal.ads.zzedo zzedoVar, java.lang.String str) {
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
    public final /* bridge */ /* synthetic */ void onAdLoaded(com.google.android.gms.ads.rewarded.RewardedAd rewardedAd) {
        this.zzb.zzf(this.zza, rewardedAd);
    }
}
