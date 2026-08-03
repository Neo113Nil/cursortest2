package com.unity3d.mediation.rewarded;

/* loaded from: classes5.dex */
public interface LevelPlayRewardedAdListener {

    /* renamed from: com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAdDisplayFailed(com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener _this, com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        }
    }

    void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError levelPlayAdError, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError levelPlayAdError);

    void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);
}
