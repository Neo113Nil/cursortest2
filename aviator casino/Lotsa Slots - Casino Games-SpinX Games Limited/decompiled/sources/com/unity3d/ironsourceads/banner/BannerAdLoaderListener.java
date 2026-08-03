package com.unity3d.ironsourceads.banner;

/* loaded from: classes5.dex */
public interface BannerAdLoaderListener {
    void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onBannerAdLoaded(com.unity3d.ironsourceads.banner.BannerAdView bannerAdView);
}
