package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.y;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class L implements RewardedInterstitialAdShowListener, AdShowListener {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdShowListener f10590a;
    public final RewardedInterstitialAdShowListener b;
    public final Function0<com.moloco.sdk.internal.ortb.model.D> c;
    public final com.moloco.sdk.internal.y d;

    public L(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, Function0<com.moloco.sdk.internal.ortb.model.D> provideSdkEvents, com.moloco.sdk.internal.y sdkEventUrlTracker) {
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        this.f10590a = C4795j.a(rewardedInterstitialAdShowListener);
        this.b = rewardedInterstitialAdShowListener;
        this.c = provideSdkEvents;
        this.d = sdkEventUrlTracker;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10590a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10590a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10590a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(MolocoAd molocoAd) {
        String onRewardedVideoCompleted;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.D invoke = this.c.invoke();
        if (invoke != null && (onRewardedVideoCompleted = invoke.getOnRewardedVideoCompleted()) != null) {
            y.a.a(this.d, onRewardedVideoCompleted, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(MolocoAd molocoAd) {
        String onRewardedVideoStarted;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.D invoke = this.c.invoke();
        if (invoke != null && (onRewardedVideoStarted = invoke.getOnRewardedVideoStarted()) != null) {
            y.a.a(this.d, onRewardedVideoStarted, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(MolocoAd molocoAd) {
        String onUserRewarded;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.D invoke = this.c.invoke();
        if (invoke != null && (onUserRewarded = invoke.getOnUserRewarded()) != null) {
            y.a.a(this.d, onUserRewarded, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
