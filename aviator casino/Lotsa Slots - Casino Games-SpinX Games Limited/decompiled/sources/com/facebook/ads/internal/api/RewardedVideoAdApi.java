package com.facebook.ads.internal.api;

/* loaded from: classes2.dex */
public interface RewardedVideoAdApi extends com.facebook.ads.FullScreenAd {
    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder buildShowAdConfig();

    @Override // com.facebook.ads.Ad
    void destroy();

    @Override // com.facebook.ads.Ad
    java.lang.String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    @Override // com.facebook.ads.Ad
    void loadAd();

    void loadAd(com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig);

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    void setExtraHints(com.facebook.ads.ExtraHints extraHints);

    @Override // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig);

    /* renamed from: com.facebook.ads.internal.api.RewardedVideoAdApi$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
