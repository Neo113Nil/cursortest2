package com.ironsource.mediationsdk.ads.nativead.interfaces;

/* loaded from: classes5.dex */
public interface NativeAdSmashListener {
    void onNativeAdClicked();

    void onNativeAdInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onNativeAdInitSuccess();

    void onNativeAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onNativeAdLoaded(com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder adapterNativeAdViewBinder);

    void onNativeAdShown();
}
