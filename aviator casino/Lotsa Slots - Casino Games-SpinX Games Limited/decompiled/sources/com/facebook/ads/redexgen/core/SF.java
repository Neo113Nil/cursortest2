package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SF implements com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig {
    public final com.facebook.ads.redexgen.core.SI A00;

    public SF(com.facebook.ads.redexgen.core.SI si) {
        this.A00 = si;
        this.A00.withAdExperience(com.facebook.ads.AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL);
    }

    public final void A00() {
        this.A00.A00();
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withAdListener(com.facebook.ads.RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00.withAdListener(new com.facebook.ads.redexgen.core.SE(rewardedInterstitialAdListener));
        return this;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withBid(java.lang.String str) {
        this.A00.withBid(str);
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z) {
        this.A00.withFailOnCacheFailureEnabled(z);
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData) {
        this.A00.withRewardData(rewardData);
        return this;
    }
}
