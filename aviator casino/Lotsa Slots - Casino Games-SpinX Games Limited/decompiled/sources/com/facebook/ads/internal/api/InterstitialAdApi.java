package com.facebook.ads.internal.api;

/* loaded from: classes2.dex */
public interface InterstitialAdApi extends com.facebook.ads.FullScreenAd {
    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig();

    boolean isAdLoaded();

    void loadAd(com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig);

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    void setExtraHints(com.facebook.ads.ExtraHints extraHints);

    @Override // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(com.facebook.ads.InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig);

    /* renamed from: com.facebook.ads.internal.api.InterstitialAdApi$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
