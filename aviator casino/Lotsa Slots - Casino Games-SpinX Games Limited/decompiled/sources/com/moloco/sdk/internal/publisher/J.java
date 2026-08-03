package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class J implements com.moloco.sdk.internal.publisher.E {
    public static final int j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.publisher.RewardedInterstitialAdShowListener f7077a;
    public final boolean b;
    public final kotlin.jvm.functions.Function0<java.lang.Boolean> c;
    public final java.lang.String d;
    public final boolean e;
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> f;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder g;
    public final java.lang.String h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public J(com.moloco.sdk.publisher.RewardedInterstitialAdShowListener listenerTracker, boolean z, kotlin.jvm.functions.Function0<java.lang.Boolean> isAdForciblyClosed, java.lang.String adUnitId, boolean z2, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> getCreativeType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listenerTracker, "listenerTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCreativeType, "getCreativeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7077a = listenerTracker;
        this.b = z;
        this.c = isAdForciblyClosed;
        this.d = adUnitId;
        this.e = z2;
        this.f = getCreativeType;
        this.g = metricsRecorder;
        this.h = "RewardedInterstitialAdShowListenerImpl";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        java.lang.String lowerCase;
        java.lang.String name;
        if (this.i) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "issuing of reward is already handled", false, 4, null);
            return;
        }
        this.i = true;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.c.invoke(), java.lang.Boolean.FALSE)) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "reward can't be issued: ad was forcibly closed or ad was missing", false, 4, null);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i invoke = this.f.invoke();
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "issuing of reward... creativeType: " + invoke, false, 4, null);
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.g;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.X.c());
        java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.h.c();
        if (invoke != null && (name = invoke.name()) != null) {
            lowerCase = name.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        lowerCase = "UNKNOWN".toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
        onUserRewarded(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7077a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        a(molocoAd);
        this.f7077a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        this.f7077a.onAdShowFailed(molocoAdError);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7077a.onAdShowSuccess(molocoAd);
        if (this.b) {
            onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        a(molocoAd);
        this.f7077a.onRewardedVideoCompleted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7077a.onRewardedVideoStarted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7077a.onUserRewarded(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.E
    public void a() {
        if (this.e) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "onCloseOrSkipButtonShown called - granting reward as skip button is now available (feature flag enabled)", null, false, 12, null);
            a(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        } else {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "onCloseOrSkipButtonShown called - skip button shown but reward requires user click (feature flag disabled)", null, false, 12, null);
        }
    }
}
