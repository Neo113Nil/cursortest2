package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class SE implements com.facebook.ads.RewardedVideoAdExtendedListener, com.facebook.ads.S2SRewardedVideoAdListener, com.facebook.ads.S2SRewardedVideoAdExtendedListener {
    public final com.facebook.ads.RewardedInterstitialAdListener A00;

    public SE(com.facebook.ads.RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
        this.A00.onAdClicked(ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        this.A00.onAdLoaded(ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        this.A00.onError(ad, adError);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        this.A00.onLoggingImpression(ad);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        if (this.A00 instanceof com.facebook.ads.S2SRewardedInterstitialAdListener) {
            ((com.facebook.ads.S2SRewardedInterstitialAdListener) this.A00).onRewardServerFailed();
        }
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        if (this.A00 instanceof com.facebook.ads.S2SRewardedInterstitialAdListener) {
            ((com.facebook.ads.S2SRewardedInterstitialAdListener) this.A00).onRewardServerSuccess();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        if (this.A00 instanceof com.facebook.ads.RewardedInterstitialAdExtendedListener) {
            ((com.facebook.ads.RewardedInterstitialAdExtendedListener) this.A00).onRewardedInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
