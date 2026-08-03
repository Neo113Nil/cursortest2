package com.google.ads.mediation.fyber;

/* compiled from: DTExchangeBannerAd.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u001c\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u001d\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010!\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\"\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot$RequestListener;", "Lcom/fyber/inneractive/sdk/external/InneractiveAdViewEventsListener;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "adSpot", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;", "wrapperView", "Landroid/widget/RelativeLayout;", "bannerAdCallback", "loadAd", "", "mediationBannerAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "onInneractiveSuccessfulAdRequest", "iAdSpot", "onInneractiveFailedAdRequest", "errorCode", "Lcom/fyber/inneractive/sdk/external/InneractiveErrorCode;", "getView", "Landroid/view/View;", "onAdImpression", com.ironsource.Vf.f, "onAdWillCloseInternalBrowser", "onAdWillOpenExternalApp", "onAdEnteredErrorState", "displayError", "Lcom/fyber/inneractive/sdk/external/InneractiveUnitController$AdDisplayError;", "onAdExpanded", "onAdResized", "onAdCollapsed", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "dtexchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DTExchangeBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.fyber.DTExchangeBannerAd.class).getSimpleName();
    private com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback;
    private android.widget.RelativeLayout wrapperView;

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot, com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError displayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot) {
    }

    public DTExchangeBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    public final void loadAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(com.google.ads.mediation.fyber.FyberMediationAdapter.MEDIATOR_NAME);
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(com.google.android.gms.ads.MobileAds.getVersion().toString());
        java.lang.String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
        this.adSpot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().createSpot();
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = new com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController();
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.adSpot;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot = null;
        }
        inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
        com.google.android.gms.ads.AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSize, "getAdSize(...)");
        android.content.Context context = mediationBannerAdConfiguration.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        this.wrapperView = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot3 = this.adSpot;
        if (inneractiveAdSpot3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot3 = null;
        }
        inneractiveAdSpot3.setRequestListener(this);
        inneractiveAdViewUnitController.setEventsListener(this);
        com.google.ads.mediation.fyber.FyberAdapterUtils.updateFyberExtraParams(mediationBannerAdConfiguration.getMediationExtras());
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot4 = this.adSpot;
        if (inneractiveAdSpot4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot4;
        }
        inneractiveAdSpot2.loadAd(bidResponse);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot iAdSpot) {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.adSpot;
        android.widget.RelativeLayout relativeLayout = null;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = null;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot3 = null;
        if (inneractiveAdSpot == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot = null;
        }
        if (!inneractiveAdSpot.isReady()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "DT Exchange's banner ad spot is not ready.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.getMessage());
            this.mediationAdLoadCallback.onFailure(adError);
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot4 = this.adSpot;
            if (inneractiveAdSpot4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            } else {
                inneractiveAdSpot2 = inneractiveAdSpot4;
            }
            inneractiveAdSpot2.destroy();
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot5 = this.adSpot;
        if (inneractiveAdSpot5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            inneractiveAdSpot5 = null;
        }
        com.fyber.inneractive.sdk.external.InneractiveUnitController selectedUnitController = inneractiveAdSpot5.getSelectedUnitController();
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController ? (com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) selectedUnitController : null;
        if (inneractiveAdViewUnitController == null) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(105, "Unexpected controller type.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError2.getMessage());
            this.mediationAdLoadCallback.onFailure(adError2);
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot6 = this.adSpot;
            if (inneractiveAdSpot6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adSpot");
            } else {
                inneractiveAdSpot3 = inneractiveAdSpot6;
            }
            inneractiveAdSpot3.destroy();
            return;
        }
        android.widget.RelativeLayout relativeLayout2 = this.wrapperView;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("wrapperView");
        } else {
            relativeLayout = relativeLayout2;
        }
        inneractiveAdViewUnitController.bindView(relativeLayout);
        this.bannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(errorCode));
        if (adSpot != null) {
            adSpot.destroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        android.widget.RelativeLayout relativeLayout = this.wrapperView;
        if (relativeLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("wrapperView");
            relativeLayout = null;
        }
        return relativeLayout;
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
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }
}
