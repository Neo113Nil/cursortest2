package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1013Rt implements com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder, com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig {
    public com.facebook.ads.redexgen.core.C1012Rs A00;
    public java.lang.String A01;
    public java.util.EnumSet<com.facebook.ads.CacheFlag> A02;

    public C1013Rt(com.facebook.ads.redexgen.core.C1012Rs c1012Rs) {
        this.A00 = c1012Rs;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = com.facebook.ads.CacheFlag.ALL;
        }
        this.A00.A05(this.A02, this.A01);
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener(com.facebook.ads.InterstitialAdListener interstitialAdListener) {
        this.A00.A02(interstitialAdListener);
        if (interstitialAdListener instanceof com.facebook.ads.InterstitialAdExtendedListener) {
            this.A00.A04((com.facebook.ads.InterstitialAdExtendedListener) interstitialAdListener);
        }
        return this;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withBid(java.lang.String str) {
        this.A01 = str;
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags(java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags) {
        this.A02 = cacheFlags;
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData) {
        this.A00.A03(rewardData);
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withRewardedAdListener(com.facebook.ads.RewardedAdListener rewardedAdListener) {
        this.A00.A04(rewardedAdListener);
        return this;
    }
}
