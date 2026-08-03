package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SG implements com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final com.facebook.ads.redexgen.core.SJ A00;

    public SG(com.facebook.ads.redexgen.core.SJ sj) {
        this.A00 = sj;
    }

    public final com.facebook.ads.redexgen.core.SJ A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i) {
        this.A00.withAppOrientation(i);
        return this;
    }
}
