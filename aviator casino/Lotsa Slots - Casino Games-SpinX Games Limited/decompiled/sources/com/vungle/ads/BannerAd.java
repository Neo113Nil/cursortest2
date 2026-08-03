package com.vungle.ads;

/* compiled from: BannerAd.kt */
@kotlin.Deprecated(message = "Use VungleBannerView instead")
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0007J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/vungle/ads/BannerAd;", "Lcom/vungle/ads/BaseAd;", "context", "Landroid/content/Context;", "placementId", "", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "Lcom/vungle/ads/BannerAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/BannerAdSize;)V", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;)V", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "bannerView", "Lcom/vungle/ads/BannerView;", "constructAdInternal", "Lcom/vungle/ads/internal/BannerAdInternal;", "constructAdInternal$vungle_ads_release", "finishAd", "", "getAdViewSize", "getBannerView", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerAd extends com.vungle.ads.BaseAd {
    private final com.vungle.ads.internal.presenter.AdPlayCallbackWrapper adPlayCallback;
    private final com.vungle.ads.VungleAdSize adSize;
    private com.vungle.ads.BannerView bannerView;

    /* compiled from: BannerAd.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.vungle.ads.BannerAdSize.values().length];
            iArr[com.vungle.ads.BannerAdSize.BANNER.ordinal()] = 1;
            iArr[com.vungle.ads.BannerAdSize.BANNER_SHORT.ordinal()] = 2;
            iArr[com.vungle.ads.BannerAdSize.BANNER_LEADERBOARD.ordinal()] = 3;
            iArr[com.vungle.ads.BannerAdSize.VUNGLE_MREC.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BannerAd(android.content.Context context, java.lang.String str, com.vungle.ads.VungleAdSize vungleAdSize, com.vungle.ads.AdConfig adConfig) {
        super(context, str, adConfig);
        this.adSize = vungleAdSize;
        com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.DEPRECATED_API_USED), getLogEntry(), "BannerAd is deprecated");
        com.vungle.ads.internal.AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((com.vungle.ads.internal.BannerAdInternal) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new com.vungle.ads.internal.presenter.AdPlayCallback() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(java.lang.String id) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(java.lang.String id) {
                com.vungle.ads.BannerAd.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                com.vungle.ads.BannerAd.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BannerAd.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), com.vungle.ads.BannerAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                com.vungle.ads.BannerAd.this.getPresentToDisplayMetric().markStart();
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BannerAd bannerAd = com.vungle.ads.BannerAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdStart$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(com.vungle.ads.BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BannerAd bannerAd = com.vungle.ads.BannerAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdImpression$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(com.vungle.ads.BannerAd.this);
                        }
                    }
                });
                com.vungle.ads.BannerAd.this.getPresentToDisplayMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BannerAd.this.getPresentToDisplayMetric(), com.vungle.ads.BannerAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                com.vungle.ads.BannerAd.this.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BannerAd bannerAd = com.vungle.ads.BannerAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdEnd$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(com.vungle.ads.BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BannerAd bannerAd = com.vungle.ads.BannerAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdClick$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(com.vungle.ads.BannerAd.this);
                        }
                    }
                });
                com.vungle.ads.BannerAd.this.getDisplayToClickMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, com.vungle.ads.BannerAd.this.getDisplayToClickMetric(), com.vungle.ads.BannerAd.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(java.lang.String id) {
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BannerAd bannerAd = com.vungle.ads.BannerAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdLeftApplication$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(com.vungle.ads.BannerAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final com.vungle.ads.VungleError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                com.vungle.ads.BannerAd.this.getShowToFailMetric().markEnd();
                com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.BannerAd.this.getShowToFailMetric(), com.vungle.ads.BannerAd.this.getLogEntry(), java.lang.String.valueOf(error.getCode()));
                com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                final com.vungle.ads.BannerAd bannerAd = com.vungle.ads.BannerAd.this;
                threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onFailure$1
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
                        com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BannerAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(com.vungle.ads.BannerAd.this, error);
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAd(android.content.Context context, java.lang.String placementId, com.vungle.ads.VungleAdSize adSize) {
        this(context, placementId, adSize, new com.vungle.ads.AdConfig());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.Deprecated(message = "Use VungleAdSize instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAd(android.content.Context context, java.lang.String placementId, com.vungle.ads.BannerAdSize adSize) {
        this(context, placementId, r4, new com.vungle.ads.AdConfig());
        com.vungle.ads.VungleAdSize vungleAdSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        com.vungle.ads.VungleAdSize.Companion companion = com.vungle.ads.VungleAdSize.INSTANCE;
        int i = com.vungle.ads.BannerAd.WhenMappings.$EnumSwitchMapping$0[adSize.ordinal()];
        if (i == 1) {
            vungleAdSize = com.vungle.ads.VungleAdSize.BANNER;
        } else if (i == 2) {
            vungleAdSize = com.vungle.ads.VungleAdSize.BANNER_SHORT;
        } else if (i == 3) {
            vungleAdSize = com.vungle.ads.VungleAdSize.BANNER_LEADERBOARD;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            vungleAdSize = com.vungle.ads.VungleAdSize.MREC;
        }
    }

    public final com.vungle.ads.VungleAdSize getAdViewSize() {
        com.vungle.ads.internal.AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        com.vungle.ads.VungleAdSize updatedAdSize = ((com.vungle.ads.internal.BannerAdInternal) adInternal$vungle_ads_release).getUpdatedAdSize();
        return updatedAdSize == null ? this.adSize : updatedAdSize;
    }

    @Override // com.vungle.ads.BaseAd
    public com.vungle.ads.internal.BannerAdInternal constructAdInternal$vungle_ads_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new com.vungle.ads.internal.BannerAdInternal(context, this.adSize);
    }

    public final void finishAd() {
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$finishAd$1
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
                com.vungle.ads.BannerView bannerView;
                bannerView = com.vungle.ads.BannerAd.this.bannerView;
                if (bannerView != null) {
                    bannerView.finishAdInternal(true);
                }
            }
        });
    }

    public final com.vungle.ads.BannerView getBannerView() {
        com.vungle.ads.internal.model.Placement placement;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
        com.vungle.ads.BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            return bannerView;
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        final com.vungle.ads.VungleError canPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (canPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(com.vungle.ads.internal.AdInternal.AdState.ERROR);
            }
            com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.BannerAd$getBannerView$1
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
                    com.vungle.ads.BaseAdListener adListener = com.vungle.ads.BannerAd.this.getAdListener();
                    if (adListener != null) {
                        adListener.onAdFailedToPlay(com.vungle.ads.BannerAd.this, canPlayAd);
                    }
                }
            });
            return null;
        }
        com.vungle.ads.internal.model.AdPayload advertisement = getAdInternal$vungle_ads_release().getAdvertisement();
        if (advertisement == null || (placement = getAdInternal$vungle_ads_release().getPlacement()) == null) {
            return null;
        }
        getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        try {
            try {
                this.bannerView = new com.vungle.ads.BannerView(getContext(), placement, advertisement, getAdViewSize(), getAdConfig(), this.adPlayCallback);
                getResponseToShowMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
                return this.bannerView;
            } catch (java.lang.InstantiationException e) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e("BannerAd", "Can not create banner view: " + e.getMessage(), e);
                getResponseToShowMetric().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                return null;
            }
        } catch (java.lang.Throwable th) {
            getResponseToShowMetric().markEnd();
            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
            throw th;
        }
    }
}
