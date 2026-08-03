package com.google.ads.mediation.fyber;

/* compiled from: DTExchangeWaterfallBannerAd.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u001f\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010#\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010$\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeWaterfallBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot$RequestListener;", "Lcom/fyber/inneractive/sdk/external/InneractiveAdViewEventsListener;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "bannerAdCallback", "requestedAdSize", "Lcom/google/android/gms/ads/AdSize;", "bannerSpot", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;", "bannerWrapperView", "Landroid/view/ViewGroup;", "loadAd", "", "adConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "getView", "Landroid/view/View;", "onInneractiveSuccessfulAdRequest", "adSpot", "onInneractiveFailedAdRequest", "inneractiveErrorCode", "Lcom/fyber/inneractive/sdk/external/InneractiveErrorCode;", "onAdImpression", com.ironsource.Vf.f, "onAdWillCloseInternalBrowser", "onAdWillOpenExternalApp", "onAdEnteredErrorState", "adDisplayError", "Lcom/fyber/inneractive/sdk/external/InneractiveUnitController$AdDisplayError;", "onAdExpanded", "onAdResized", "onAdCollapsed", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "dtexchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DTExchangeWaterfallBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.class).getSimpleName();
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private com.fyber.inneractive.sdk.external.InneractiveAdSpot bannerSpot;
    private android.view.ViewGroup bannerWrapperView;
    private com.google.android.gms.ads.AdSize requestedAdSize;

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot, com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
    }

    public DTExchangeWaterfallBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        this.adLoadCallback = adLoadCallback;
    }

    public final void loadAd(final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration adConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        final android.os.Bundle serverParameters = adConfiguration.getServerParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        java.lang.String string = serverParameters.getString("applicationId");
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "App ID is null or empty.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(com.google.ads.mediation.fyber.FyberMediationAdapter.MEDIATOR_NAME);
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(com.google.android.gms.ads.MobileAds.getVersion().toString());
            com.fyber.inneractive.sdk.external.InneractiveAdManager.initialize(adConfiguration.getContext(), string, new com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd$loadAd$1
                @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                public void onFyberMarketplaceInitialized(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                    com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot;
                    com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2;
                    com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot3;
                    java.lang.String str;
                    com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback;
                    java.lang.String str2;
                    com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fyberInitStatus, "fyberInitStatus");
                    if (fyberInitStatus != com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(fyberInitStatus);
                        str2 = com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.TAG;
                        android.util.Log.w(str2, adError2.toString());
                        mediationAdLoadCallback2 = com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this.adLoadCallback;
                        mediationAdLoadCallback2.onFailure(adError2);
                        return;
                    }
                    java.lang.String string2 = serverParameters.getString("spotId");
                    if (android.text.TextUtils.isEmpty(string2)) {
                        com.google.android.gms.ads.AdError adError3 = new com.google.android.gms.ads.AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
                        str = com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.TAG;
                        android.util.Log.w(str, adError3.toString());
                        mediationAdLoadCallback = com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this.adLoadCallback;
                        mediationAdLoadCallback.onFailure(adError3);
                        return;
                    }
                    com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this.bannerSpot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().createSpot();
                    com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = new com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController();
                    inneractiveAdSpot = com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this.bannerSpot;
                    com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot4 = null;
                    if (inneractiveAdSpot == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                        inneractiveAdSpot = null;
                    }
                    inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
                    com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this.bannerWrapperView = new android.widget.RelativeLayout(adConfiguration.getContext());
                    com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd dTExchangeWaterfallBannerAd = com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this;
                    com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd dTExchangeWaterfallBannerAd2 = dTExchangeWaterfallBannerAd;
                    inneractiveAdSpot2 = dTExchangeWaterfallBannerAd.bannerSpot;
                    if (inneractiveAdSpot2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                        inneractiveAdSpot2 = null;
                    }
                    inneractiveAdSpot2.setRequestListener(dTExchangeWaterfallBannerAd2);
                    com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this.requestedAdSize = adConfiguration.getAdSize();
                    com.google.ads.mediation.fyber.FyberAdapterUtils.updateFyberExtraParams(adConfiguration.getMediationExtras());
                    com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = new com.fyber.inneractive.sdk.external.InneractiveAdRequest(string2);
                    inneractiveAdSpot3 = com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.this.bannerSpot;
                    if (inneractiveAdSpot3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                    } else {
                        inneractiveAdSpot4 = inneractiveAdSpot3;
                    }
                    inneractiveAdSpot4.requestAd(inneractiveAdRequest);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.bannerWrapperView;
        if (viewGroup == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerWrapperView");
            viewGroup = null;
        }
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.bannerSpot;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
            inneractiveAdSpot = null;
        }
        if (!(inneractiveAdSpot.getSelectedUnitController() instanceof com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController)) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = com.fyber.inneractive.sdk.external.InneractiveUnitController.class.getName();
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot3 = this.bannerSpot;
            if (inneractiveAdSpot3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                inneractiveAdSpot3 = null;
            }
            objArr[1] = inneractiveAdSpot3.getSelectedUnitController().getClass().getName();
            java.lang.String format = java.lang.String.format("Unexpected controller type. Expected: %s. Actual: %s", java.util.Arrays.copyOf(objArr, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(105, format, com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot4 = this.bannerSpot;
            if (inneractiveAdSpot4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                inneractiveAdSpot4 = null;
            }
            inneractiveAdSpot4.destroy();
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot5 = this.bannerSpot;
        if (inneractiveAdSpot5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
            inneractiveAdSpot5 = null;
        }
        com.fyber.inneractive.sdk.external.InneractiveUnitController selectedUnitController = inneractiveAdSpot5.getSelectedUnitController();
        kotlin.jvm.internal.Intrinsics.checkNotNull(selectedUnitController, "null cannot be cast to non-null type com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController");
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = (com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) selectedUnitController;
        inneractiveAdViewUnitController.setEventsListener(this);
        android.view.ViewGroup viewGroup = this.bannerWrapperView;
        if (viewGroup == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerWrapperView");
            viewGroup = null;
        }
        inneractiveAdViewUnitController.bindView(viewGroup);
        android.view.ViewGroup viewGroup2 = this.bannerWrapperView;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerWrapperView");
            viewGroup2 = null;
        }
        android.content.Context context = viewGroup2.getContext();
        float f = context.getResources().getDisplayMetrics().density;
        int roundToInt = kotlin.math.MathKt.roundToInt(inneractiveAdViewUnitController.getAdContentWidth() / f);
        int roundToInt2 = kotlin.math.MathKt.roundToInt(inneractiveAdViewUnitController.getAdContentHeight() / f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.google.android.gms.ads.AdSize(roundToInt, roundToInt2));
        com.google.android.gms.ads.AdSize adSize = this.requestedAdSize;
        if (adSize == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("requestedAdSize");
            adSize = null;
        }
        if (com.google.android.gms.ads.MediationUtils.findClosestSize(context, adSize, arrayList) == null) {
            com.google.android.gms.ads.AdSize adSize2 = this.requestedAdSize;
            if (adSize2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("requestedAdSize");
                adSize2 = null;
            }
            int roundToInt3 = kotlin.math.MathKt.roundToInt(adSize2.getWidthInPixels(context) / f);
            com.google.android.gms.ads.AdSize adSize3 = this.requestedAdSize;
            if (adSize3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("requestedAdSize");
                adSize3 = null;
            }
            int roundToInt4 = kotlin.math.MathKt.roundToInt(adSize3.getHeightInPixels(context) / f);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format2 = java.lang.String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(roundToInt3), java.lang.Integer.valueOf(roundToInt4), java.lang.Integer.valueOf(roundToInt), java.lang.Integer.valueOf(roundToInt2)}, 4));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(103, format2, com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError2.toString());
            this.adLoadCallback.onFailure(adError2);
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot6 = this.bannerSpot;
            if (inneractiveAdSpot6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
            } else {
                inneractiveAdSpot2 = inneractiveAdSpot6;
            }
            inneractiveAdSpot2.destroy();
            return;
        }
        this.bannerAdCallback = this.adLoadCallback.onSuccess(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inneractiveErrorCode, "inneractiveErrorCode");
        com.google.android.gms.ads.AdError adError = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(inneractiveErrorCode);
        android.util.Log.w(TAG, adError.toString());
        this.adLoadCallback.onFailure(adError);
        if (adSpot != null) {
            adSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback2 = this.bannerAdCallback;
        if (mediationBannerAdCallback2 != null) {
            mediationBannerAdCallback2.onAdOpened();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }
}
