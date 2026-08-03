package com.google.ads.mediation.unity;

/* loaded from: classes3.dex */
class UnityBannerViewFactory {
    UnityBannerViewFactory() {
    }

    com.google.ads.mediation.unity.UnityBannerViewWrapper createBannerView(android.app.Activity activity, java.lang.String str, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        return new com.google.ads.mediation.unity.UnityBannerViewWrapper(new com.unity3d.services.banners.BannerView(activity, str, unityBannerSize));
    }
}
