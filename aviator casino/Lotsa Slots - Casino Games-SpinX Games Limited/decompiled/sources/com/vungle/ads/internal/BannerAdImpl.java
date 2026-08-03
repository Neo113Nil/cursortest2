package com.vungle.ads.internal;

/* compiled from: BannerAdImpl.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/BannerAdImpl;", "Lcom/vungle/ads/BaseAd;", "context", "Landroid/content/Context;", "placementId", "", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;)V", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "getAdPlayCallback$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "constructAdInternal", "Lcom/vungle/ads/internal/BannerAdInternal;", "constructAdInternal$vungle_ads_release", "getAdViewSize", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerAdImpl extends com.vungle.ads.BaseAd {
    private final com.vungle.ads.internal.presenter.AdPlayCallbackWrapper adPlayCallback;
    private final com.vungle.ads.VungleAdSize adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdImpl(android.content.Context context, java.lang.String placementId, com.vungle.ads.VungleAdSize adSize, com.vungle.ads.AdConfig adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.adSize = adSize;
        com.vungle.ads.internal.AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((com.vungle.ads.internal.BannerAdInternal) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new com.vungle.ads.internal.presenter.AdPlayCallback() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(java.lang.String id) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(java.lang.String id) {
                com.vungle.ads.internal.BannerAdImpl.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                com.vungle.ads.internal.BannerAdImpl.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.BannerAdImpl.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), com.vungle.ads.internal.BannerAdImpl.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                com.vungle.ads.internal.BannerAdImpl.this.getPresentToDisplayMetric().markStart();
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.internal.BannerAdImpl bannerAdImpl = com.vungle.ads.internal.BannerAdImpl.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdStart$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.internal.BannerAdImpl.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(com.vungle.ads.internal.BannerAdImpl.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.internal.BannerAdImpl bannerAdImpl = com.vungle.ads.internal.BannerAdImpl.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdImpression$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.internal.BannerAdImpl.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(com.vungle.ads.internal.BannerAdImpl.this);
                        }
                    }
                });
                com.vungle.ads.internal.BannerAdImpl.this.getPresentToDisplayMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.BannerAdImpl.this.getPresentToDisplayMetric(), com.vungle.ads.internal.BannerAdImpl.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                com.vungle.ads.internal.BannerAdImpl.this.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.internal.BannerAdImpl bannerAdImpl = com.vungle.ads.internal.BannerAdImpl.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdEnd$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.internal.BannerAdImpl.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(com.vungle.ads.internal.BannerAdImpl.this);
                        }
                    }
                });
                com.vungle.ads.internal.BannerAdImpl.this.getShowToCloseMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.BannerAdImpl.this.getShowToCloseMetric(), com.vungle.ads.internal.BannerAdImpl.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.internal.BannerAdImpl bannerAdImpl = com.vungle.ads.internal.BannerAdImpl.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdClick$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.internal.BannerAdImpl.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(com.vungle.ads.internal.BannerAdImpl.this);
                        }
                    }
                });
                com.vungle.ads.internal.BannerAdImpl.this.getDisplayToClickMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.BannerAdImpl.this.getDisplayToClickMetric(), com.vungle.ads.internal.BannerAdImpl.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.internal.BannerAdImpl bannerAdImpl = com.vungle.ads.internal.BannerAdImpl.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdLeftApplication$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.internal.BannerAdImpl.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(com.vungle.ads.internal.BannerAdImpl.this);
                        }
                    }
                });
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.internal.BannerAdImpl.this.getLeaveApplicationMetric(), com.vungle.ads.internal.BannerAdImpl.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final com.vungle.ads.VungleError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.internal.BannerAdImpl bannerAdImpl = com.vungle.ads.internal.BannerAdImpl.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onFailure$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.internal.BannerAdImpl.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(com.vungle.ads.internal.BannerAdImpl.this, error);
                        }
                    }
                });
                com.vungle.ads.internal.BannerAdImpl.this.getShowToFailMetric().markEnd();
                com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.BannerAdImpl.this.getShowToFailMetric(), com.vungle.ads.internal.BannerAdImpl.this.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        });
    }

    @Override // com.vungle.ads.BaseAd
    public com.vungle.ads.internal.BannerAdInternal constructAdInternal$vungle_ads_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new com.vungle.ads.internal.BannerAdInternal(context, this.adSize);
    }

    public final com.vungle.ads.VungleAdSize getAdViewSize() {
        com.vungle.ads.internal.AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        com.vungle.ads.VungleAdSize updatedAdSize = ((com.vungle.ads.internal.BannerAdInternal) adInternal$vungle_ads_release).getUpdatedAdSize();
        return updatedAdSize == null ? this.adSize : updatedAdSize;
    }

    /* renamed from: getAdPlayCallback$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.presenter.AdPlayCallbackWrapper getAdPlayCallback() {
        return this.adPlayCallback;
    }
}
