package com.google.ads.mediation.fyber;

/* loaded from: classes3.dex */
public class FyberRewardedVideoRenderer implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener {
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
    private com.fyber.inneractive.sdk.external.InneractiveAdSpot rewardedSpot;
    private com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController unitController;

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
    }

    FyberRewardedVideoRenderer(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.adLoadCallback = mediationAdLoadCallback;
    }

    void loadWaterfallAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        java.lang.String string = mediationRewardedAdConfiguration.getServerParameters().getString("spotId");
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Spot ID is null or empty.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError.getMessage());
            this.adLoadCallback.onFailure(adError);
        } else {
            initializeFyberClasses(mediationRewardedAdConfiguration);
            this.rewardedSpot.requestAd(new com.fyber.inneractive.sdk.external.InneractiveAdRequest(string));
        }
    }

    void loadRtbAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        java.lang.String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        initializeFyberClasses(mediationRewardedAdConfiguration);
        this.rewardedSpot.loadAd(bidResponse);
    }

    private void initializeFyberClasses(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.rewardedSpot = com.google.ads.mediation.fyber.FyberFactory.createRewardedAdSpot();
        com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController createInneractiveFullscreenUnitController = com.google.ads.mediation.fyber.FyberFactory.createInneractiveFullscreenUnitController();
        this.unitController = createInneractiveFullscreenUnitController;
        this.rewardedSpot.addUnitController(createInneractiveFullscreenUnitController);
        this.rewardedSpot.setRequestListener(this);
        com.google.ads.mediation.fyber.FyberAdapterUtils.updateFyberExtraParams(mediationRewardedAdConfiguration.getMediationExtras());
    }

    private void registerFyberAdListeners() {
        this.unitController.setEventsListener(this);
        this.unitController.setRewardedListener(this);
        this.unitController.addContentController(new com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController());
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        if (!(context instanceof android.app.Activity)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(107, "Cannot show a rewarded ad without an activity context.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError.getMessage());
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.rewardedSpot;
        if (inneractiveAdSpot != null && this.unitController != null && inneractiveAdSpot.isReady()) {
            this.unitController.show((android.app.Activity) context);
        } else if (this.rewardedAdCallback != null) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(106, "DT Exchange's rewarded spot is not ready.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError2.getMessage());
            this.rewardedAdCallback.onAdFailedToShow(adError2);
        }
    }

    private boolean isVideoAdAvailable(com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        return (inneractiveFullscreenUnitController == null || inneractiveFullscreenUnitController.getSelectedContentController() == null || !(inneractiveFullscreenUnitController.getSelectedContentController() instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController)) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.rewardedAdCallback = this.adLoadCallback.onSuccess(this);
        registerFyberAdListeners();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode) {
        com.google.android.gms.ads.AdError adError = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(inneractiveErrorCode);
        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError.getMessage());
        this.adLoadCallback.onFailure(adError);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.rewardedAdCallback.onAdOpened();
        if (isVideoAdAvailable(this.unitController)) {
            this.rewardedAdCallback.onVideoStart();
        }
        this.rewardedAdCallback.reportAdImpression();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.rewardedAdCallback.reportAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.rewardedAdCallback.onAdClosed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public void onAdRewarded(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.rewardedAdCallback.onUserEarnedReward();
        this.rewardedAdCallback.onVideoComplete();
    }
}
