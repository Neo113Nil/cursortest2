package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcdb extends com.google.android.gms.internal.ads.zzcco {
    private final com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback zza;
    private final com.google.android.gms.internal.ads.zzcdc zzb;

    public zzcdb(com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, com.google.android.gms.internal.ads.zzcdc zzcdcVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze() {
        com.google.android.gms.internal.ads.zzcdc zzcdcVar;
        com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcdcVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
