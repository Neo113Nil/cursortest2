package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccv extends com.google.android.gms.internal.ads.zzcco {
    private final com.google.android.gms.ads.rewarded.RewardedAdLoadCallback zza;
    private final com.google.android.gms.ads.rewarded.RewardedAd zzb;

    public zzccv(com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback, com.google.android.gms.ads.rewarded.RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze() {
        com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
