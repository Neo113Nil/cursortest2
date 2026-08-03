package com.ironsource.mediationsdk.sdk;

/* loaded from: classes5.dex */
public interface BannerSmashListener {

    /* renamed from: com.ironsource.mediationsdk.sdk.BannerSmashListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onBannerAdClicked();

    void onBannerAdClicked(java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerAdLeftApplication();

    void onBannerAdLeftApplication(java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams);

    void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerAdScreenDismissed();

    void onBannerAdScreenDismissed(java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerAdScreenPresented();

    void onBannerAdScreenPresented(java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerAdShown();

    void onBannerAdShown(java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onBannerInitSuccess();

    void onBannerInitSuccess(java.util.Map<java.lang.String, java.lang.Object> map);
}
