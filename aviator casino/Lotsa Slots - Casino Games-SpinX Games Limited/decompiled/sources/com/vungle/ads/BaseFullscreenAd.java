package com.vungle.ads;

/* compiled from: BaseFullscreenAd.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0010¢\u0006\u0002\b\u0014J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/BaseFullscreenAd;", "Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/FullscreenAd;", "context", "Landroid/content/Context;", "placementId", "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "fullscreenAdInternal", "Lcom/vungle/ads/internal/FullscreenAdInternal;", "getFullscreenAdInternal", "()Lcom/vungle/ads/internal/FullscreenAdInternal;", "load", "", "adMarkup", com.ironsource.Vf.j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "play", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseFullscreenAd extends com.vungle.ads.BaseAd implements com.vungle.ads.FullscreenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFullscreenAd(android.content.Context context, java.lang.String placementId, com.vungle.ads.AdConfig adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    private final com.vungle.ads.internal.FullscreenAdInternal getFullscreenAdInternal() {
        com.vungle.ads.internal.AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.FullscreenAdInternal");
        return (com.vungle.ads.internal.FullscreenAdInternal) adInternal$vungle_ads_release;
    }

    @Override // com.vungle.ads.BaseAd, com.vungle.ads.Ad
    public void load(java.lang.String adMarkup) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().getSignaledAd(getPlacementId()));
        super.load(adMarkup);
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.AdPayload advertisement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        com.vungle.ads.internal.signals.SignaledAd signaledAd$vungle_ads_release = getSignaledAd();
        if (signaledAd$vungle_ads_release == null) {
            return;
        }
        signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(java.lang.System.currentTimeMillis());
    }

    @Override // com.vungle.ads.FullscreenAd
    public void play(android.content.Context context) {
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        getResponseToShowMetric().markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        getShowToFailMetric().markStart();
        getShowToCloseMetric().markStart();
        com.vungle.ads.internal.signals.SignaledAd signaledAd$vungle_ads_release = getSignaledAd();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(java.lang.System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager$vungle_ads_release().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getFullscreenAdInternal().play(context, new com.vungle.ads.internal.presenter.AdPlayCallback() { // from class: com.vungle.ads.BaseFullscreenAd$play$2
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(java.lang.String id) {
                com.vungle.ads.BaseFullscreenAd.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                com.vungle.ads.BaseFullscreenAd.this.getPresentToDisplayMetric().markStart();
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BaseFullscreenAd baseFullscreenAd = com.vungle.ads.BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(com.vungle.ads.BaseFullscreenAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BaseFullscreenAd baseFullscreenAd = com.vungle.ads.BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(com.vungle.ads.BaseFullscreenAd.this);
                        }
                    }
                });
                com.vungle.ads.BaseFullscreenAd.this.getPresentToDisplayMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BaseFullscreenAd.this.getPresentToDisplayMetric(), com.vungle.ads.BaseFullscreenAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                com.vungle.ads.BaseFullscreenAd.this.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BaseFullscreenAd baseFullscreenAd = com.vungle.ads.BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(com.vungle.ads.BaseFullscreenAd.this);
                        }
                    }
                });
                com.vungle.ads.BaseFullscreenAd.this.getShowToCloseMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BaseFullscreenAd.this.getShowToCloseMetric(), com.vungle.ads.BaseFullscreenAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BaseFullscreenAd baseFullscreenAd = com.vungle.ads.BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(com.vungle.ads.BaseFullscreenAd.this);
                        }
                    }
                });
                com.vungle.ads.BaseFullscreenAd.this.getDisplayToClickMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BaseFullscreenAd.this.getDisplayToClickMetric(), com.vungle.ads.BaseFullscreenAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BaseFullscreenAd baseFullscreenAd = com.vungle.ads.BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdRewarded$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseFullscreenAd.this.getAdListener();
                        com.vungle.ads.RewardedAdListener rewardedAdListener = adListener instanceof com.vungle.ads.RewardedAdListener ? (com.vungle.ads.RewardedAdListener) adListener : null;
                        if (rewardedAdListener != null) {
                            rewardedAdListener.onAdRewarded(com.vungle.ads.BaseFullscreenAd.this);
                        }
                    }
                });
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BaseFullscreenAd.this.getRewardedMetric(), com.vungle.ads.BaseFullscreenAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BaseFullscreenAd baseFullscreenAd = com.vungle.ads.BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(com.vungle.ads.BaseFullscreenAd.this);
                        }
                    }
                });
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BaseFullscreenAd.this.getLeaveApplicationMetric(), com.vungle.ads.BaseFullscreenAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final com.vungle.ads.VungleError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BaseFullscreenAd baseFullscreenAd = com.vungle.ads.BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(com.vungle.ads.BaseFullscreenAd.this, error);
                        }
                    }
                });
                com.vungle.ads.BaseFullscreenAd.this.getShowToFailMetric().markEnd();
                com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.BaseFullscreenAd.this.getShowToFailMetric(), com.vungle.ads.BaseFullscreenAd.this.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        });
    }
}
