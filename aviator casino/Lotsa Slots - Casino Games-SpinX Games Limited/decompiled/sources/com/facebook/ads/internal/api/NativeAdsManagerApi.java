package com.facebook.ads.internal.api;

/* loaded from: classes2.dex */
public interface NativeAdsManagerApi {
    void disableAutoRefresh();

    int getUniqueNativeAdCount();

    boolean isLoaded();

    void loadAds();

    void loadAds(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag);

    com.facebook.ads.NativeAd nextNativeAd();

    com.facebook.ads.NativeAd nextNativeAd(com.facebook.ads.NativeAdListener nativeAdListener);

    void setExtraHints(java.lang.String str);

    void setListener(com.facebook.ads.NativeAdsManager.Listener listener);

    void setNativeOption(com.facebook.ads.NativeAd.NativeOptions nativeOptions);
}
