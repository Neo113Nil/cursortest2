package com.unity3d.mediation.banner;

/* loaded from: classes5.dex */
public interface LevelPlayBannerAdViewListener {

    /* renamed from: com.unity3d.mediation.banner.LevelPlayBannerAdViewListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAdDisplayFailed(com.unity3d.mediation.banner.LevelPlayBannerAdViewListener _this, com.unity3d.mediation.LevelPlayAdInfo adInfo, com.unity3d.mediation.LevelPlayAdError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdCollapsed(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, com.unity3d.mediation.LevelPlayAdError levelPlayAdError);

    void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdExpanded(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError levelPlayAdError);

    void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);
}
