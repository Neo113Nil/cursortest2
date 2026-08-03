package com.ironsource.mediationsdk.sdk;

/* loaded from: classes5.dex */
public interface InterstitialSmashListener {

    /* renamed from: com.ironsource.mediationsdk.sdk.InterstitialSmashListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onInterstitialAdClicked();

    void onInterstitialAdClicked(java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialAdClosed();

    void onInterstitialAdClosed(java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialAdOpened();

    void onInterstitialAdOpened(java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialAdReady();

    void onInterstitialAdReady(java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialAdShowSucceeded();

    void onInterstitialAdShowSucceeded(java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialAdVisible();

    void onInterstitialAdVisible(java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onInterstitialInitSuccess();

    void onInterstitialInitSuccess(java.util.Map<java.lang.String, java.lang.Object> map);
}
