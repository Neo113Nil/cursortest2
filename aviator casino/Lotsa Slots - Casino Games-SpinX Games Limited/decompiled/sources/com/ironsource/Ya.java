package com.ironsource;

/* loaded from: classes5.dex */
public interface Ya {

    /* renamed from: com.ironsource.Ya$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAdRewarded(com.ironsource.Ya _this, com.unity3d.mediation.rewarded.LevelPlayReward reward, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
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
