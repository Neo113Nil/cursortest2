package com.ironsource.mediationsdk.ads.nativead.internal;

/* loaded from: classes5.dex */
public interface InternalNativeAdListener {
    void onNativeAdClicked(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    void onNativeAdImpression(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    void onNativeAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onNativeAdLoaded(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo, com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder adapterNativeAdViewBinder);
}
