package com.unity3d.services.banners;

/* loaded from: classes5.dex */
public interface IUnityBannerListener {
    void onUnityBannerClick(java.lang.String str);

    void onUnityBannerError(java.lang.String str);

    void onUnityBannerHide(java.lang.String str);

    void onUnityBannerLoaded(java.lang.String str, android.view.View view);

    void onUnityBannerShow(java.lang.String str);

    void onUnityBannerUnloaded(java.lang.String str);
}
