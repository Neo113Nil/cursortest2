package com.ironsource.mediationsdk.ads.nativead.interfaces;

/* loaded from: classes5.dex */
public interface NativeAdLoadListener {
    void onAdLoadFailed(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd levelPlayNativeAd, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onAdLoaded(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd levelPlayNativeAd, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo);
}
