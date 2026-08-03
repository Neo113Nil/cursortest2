package com.google.ads.mediation.fyber;

/* loaded from: classes3.dex */
public class FyberMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter {
    static final java.lang.String KEY_APP_ID = "applicationId";
    public static final java.lang.String KEY_MUTE_VIDEO = "muteVideo";
    static final java.lang.String KEY_SPOT_ID = "spotId";
    protected static final com.fyber.inneractive.sdk.external.InneractiveMediationName MEDIATOR_NAME = com.fyber.inneractive.sdk.external.InneractiveMediationName.ADMOB;
    static final java.lang.String TAG = "FyberMediationAdapter";
    private com.google.ads.mediation.fyber.DTExchangeBannerAd bannerRtbAd;
    private com.fyber.inneractive.sdk.external.InneractiveAdSpot bannerSpot;
    private com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd bannerWaterfallAd;
    private android.view.ViewGroup bannerWrapperView;
    private java.lang.ref.WeakReference<android.app.Activity> interstitialActivityRef;
    private com.google.ads.mediation.fyber.DTExchangeInterstitialAd interstitialRtbAd;
    private com.fyber.inneractive.sdk.external.InneractiveAdSpot interstitialSpot;
    private com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener;
    private com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener;
    private com.google.ads.mediation.fyber.DTExchangeNativeAdMapper nativeAdMapper;
    private com.google.android.gms.ads.AdSize requestedAdSize;
    private com.google.ads.mediation.fyber.FyberRewardedVideoRenderer rewardedRenderer;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(final com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        java.lang.String string = mediationRewardedAdConfiguration.getServerParameters().getString(KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "App ID is null or empty.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
        } else {
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(MEDIATOR_NAME);
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(com.google.android.gms.ads.MobileAds.getVersion().toString());
            com.fyber.inneractive.sdk.external.InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.1
                @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                public void onFyberMarketplaceInitialized(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                    if (fyberInitStatus != com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(fyberInitStatus);
                        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError2.getMessage());
                        mediationAdLoadCallback.onFailure(adError2);
                    } else {
                        com.google.ads.mediation.fyber.FyberMediationAdapter.this.rewardedRenderer = new com.google.ads.mediation.fyber.FyberRewardedVideoRenderer(mediationAdLoadCallback);
                        com.google.ads.mediation.fyber.FyberMediationAdapter.this.rewardedRenderer.loadWaterfallAd(mediationRewardedAdConfiguration);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        if (com.google.ads.mediation.fyber.FyberSdkWrapper.getDelegate().isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString(KEY_APP_ID);
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "DT Exchange SDK requires an appId to be configured on the AdMob UI.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            java.lang.String str = (java.lang.String) hashSet.iterator().next();
            if (hashSet.size() > 1) {
                android.util.Log.w(TAG, java.lang.String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the DT Exchange SDK.", KEY_APP_ID, hashSet, str));
            }
            configureDTExchangePrivacy();
            com.fyber.inneractive.sdk.external.InneractiveAdManager.initialize(context, str, new com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.2
                @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                public void onFyberMarketplaceInitialized(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                    if (fyberInitStatus != com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(fyberInitStatus);
                        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError2.getMessage());
                        initializationCompleteCallback.onInitializationFailed(adError2.getMessage());
                        return;
                    }
                    initializationCompleteCallback.onInitializationSucceeded();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        java.lang.String bidderToken = com.fyber.inneractive.sdk.external.BidTokenProvider.getBidderToken();
        if (android.text.TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        signalCallbacks.onSuccess(bidderToken);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        java.lang.String adapterVersion = com.google.ads.mediation.fyber.FyberAdapterUtils.getAdapterVersion();
        java.lang.String[] split = adapterVersion.split("\\.");
        if (split.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), (java.lang.Integer.parseInt(split[2]) * 100) + java.lang.Integer.parseInt(split[3]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String sdkVersion = com.google.ads.mediation.fyber.FyberAdapterUtils.getSdkVersion();
        java.lang.String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final android.content.Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, final android.os.Bundle bundle, final com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, final android.os.Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        java.lang.String string = bundle.getString(KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "App ID is null or empty.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.getMessage());
            this.mediationBannerListener.onAdFailedToLoad(this, adError);
        } else {
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(MEDIATOR_NAME);
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(com.google.android.gms.ads.MobileAds.getVersion().toString());
            com.fyber.inneractive.sdk.external.InneractiveAdManager.initialize(context, string, new com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.3
                @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                public void onFyberMarketplaceInitialized(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                    if (fyberInitStatus != com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(fyberInitStatus);
                        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError2.getMessage());
                        com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError2);
                        return;
                    }
                    java.lang.String string2 = bundle.getString("spotId");
                    if (android.text.TextUtils.isEmpty(string2)) {
                        com.google.android.gms.ads.AdError adError3 = new com.google.android.gms.ads.AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
                        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError3.getMessage());
                        com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError3);
                        return;
                    }
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().createSpot();
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.addUnitController(new com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController());
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerWrapperView = new android.widget.RelativeLayout(context);
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.setRequestListener(com.google.ads.mediation.fyber.FyberMediationAdapter.this.createFyberBannerAdListener());
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.requestedAdSize = adSize;
                    com.google.ads.mediation.fyber.FyberAdapterUtils.updateFyberExtraParams(bundle2);
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.requestAd(new com.fyber.inneractive.sdk.external.InneractiveAdRequest(string2));
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.bannerWrapperView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.bannerSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.bannerSpot = null;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = this.interstitialSpot;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.interstitialSpot = null;
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.interstitialActivityRef;
        if (weakReference != null) {
            weakReference.clear();
            this.interstitialActivityRef = null;
        }
        com.google.ads.mediation.fyber.DTExchangeNativeAdMapper dTExchangeNativeAdMapper = this.nativeAdMapper;
        if (dTExchangeNativeAdMapper != null) {
            dTExchangeNativeAdMapper.destroy();
            this.nativeAdMapper = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener createFyberBannerAdListener() {
        return new com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.4
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                if (!(com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.getSelectedUnitController() instanceof com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController)) {
                    com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(105, java.lang.String.format("Unexpected controller type. Expected: %s. Actual: %s", com.fyber.inneractive.sdk.external.InneractiveUnitController.class.getName(), com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.getSelectedUnitController().getClass().getName()), com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
                    android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError.getMessage());
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError);
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.destroy();
                }
                com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = (com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.getSelectedUnitController();
                inneractiveAdViewUnitController.setEventsListener(com.google.ads.mediation.fyber.FyberMediationAdapter.this.createFyberAdViewListener());
                inneractiveAdViewUnitController.bindView(com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerWrapperView);
                android.content.Context context = com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerWrapperView.getContext();
                float f = context.getResources().getDisplayMetrics().density;
                int round = java.lang.Math.round(inneractiveAdViewUnitController.getAdContentWidth() / f);
                int round2 = java.lang.Math.round(inneractiveAdViewUnitController.getAdContentHeight() / f);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new com.google.android.gms.ads.AdSize(round, round2));
                if (com.google.android.gms.ads.MediationUtils.findClosestSize(context, com.google.ads.mediation.fyber.FyberMediationAdapter.this.requestedAdSize, arrayList) == null) {
                    com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(103, java.lang.String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", java.lang.Integer.valueOf(java.lang.Math.round(com.google.ads.mediation.fyber.FyberMediationAdapter.this.requestedAdSize.getWidthInPixels(context) / f)), java.lang.Integer.valueOf(java.lang.Math.round(com.google.ads.mediation.fyber.FyberMediationAdapter.this.requestedAdSize.getHeightInPixels(context) / f)), java.lang.Integer.valueOf(round), java.lang.Integer.valueOf(round2)), com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
                    android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError2.getMessage());
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError2);
                    return;
                }
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdLoaded(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode) {
                com.google.android.gms.ads.AdError adError = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(inneractiveErrorCode);
                android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError.getMessage());
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError);
                if (inneractiveAdSpot != null) {
                    inneractiveAdSpot.destroy();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener createFyberAdViewListener() {
        return new com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.5
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdClicked(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdOpened(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdClosed(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationBannerListener.onAdLeftApplication(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }
        };
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(final android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, final android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, final android.os.Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        java.lang.String string = bundle.getString(KEY_APP_ID);
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "App ID is null or empty.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
        if (android.text.TextUtils.isEmpty(string)) {
            android.util.Log.w(TAG, adError.getMessage());
            this.mediationInterstitialListener.onAdFailedToLoad(this, adError);
        } else {
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(MEDIATOR_NAME);
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(com.google.android.gms.ads.MobileAds.getVersion().toString());
            com.fyber.inneractive.sdk.external.InneractiveAdManager.initialize(context, string, new com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.6
                @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                public void onFyberMarketplaceInitialized(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                    if (fyberInitStatus != com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(fyberInitStatus);
                        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError2.getMessage());
                        com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError2);
                        return;
                    }
                    java.lang.String string2 = bundle.getString("spotId");
                    if (android.text.TextUtils.isEmpty(string2)) {
                        com.google.android.gms.ads.AdError adError3 = new com.google.android.gms.ads.AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
                        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError3.getMessage());
                        com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError3);
                        return;
                    }
                    if (!(context instanceof android.app.Activity)) {
                        com.google.android.gms.ads.AdError adError4 = new com.google.android.gms.ads.AdError(107, "Cannot request an interstitial ad without an activity context.", com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
                        android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError4.getMessage());
                        if (com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener != null) {
                            com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError4);
                            return;
                        }
                        return;
                    }
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialActivityRef = new java.lang.ref.WeakReference((android.app.Activity) context);
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialSpot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().createSpot();
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialSpot.addUnitController(new com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController());
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialSpot.setRequestListener(com.google.ads.mediation.fyber.FyberMediationAdapter.this.createFyberInterstitialAdListener());
                    com.google.ads.mediation.fyber.FyberAdapterUtils.updateFyberExtraParams(bundle2);
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialSpot.requestAd(new com.fyber.inneractive.sdk.external.InneractiveAdRequest(string2));
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.interstitialActivityRef;
        android.app.Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            android.util.Log.w(TAG, "showInterstitial called, but activity reference was lost.");
            this.mediationInterstitialListener.onAdOpened(this);
            this.mediationInterstitialListener.onAdClosed(this);
        } else {
            if (!(this.interstitialSpot.getSelectedUnitController() instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController)) {
                android.util.Log.w(TAG, "showInterstitial called, but wrong spot has been used (should not happen).");
                this.mediationInterstitialListener.onAdOpened(this);
                this.mediationInterstitialListener.onAdClosed(this);
                return;
            }
            com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController) this.interstitialSpot.getSelectedUnitController();
            if (!this.interstitialSpot.isReady()) {
                android.util.Log.w(TAG, "showInterstitial called, but Ad has expired.");
                this.mediationInterstitialListener.onAdOpened(this);
                this.mediationInterstitialListener.onAdClosed(this);
                return;
            }
            inneractiveFullscreenUnitController.show(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener createFyberInterstitialAdListener() {
        return new com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.7
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                if (!(com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialSpot.getSelectedUnitController() instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController)) {
                    com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(105, java.lang.String.format("Unexpected controller type. Expected: %s. Actual: %s", com.fyber.inneractive.sdk.external.InneractiveUnitController.class.getName(), com.google.ads.mediation.fyber.FyberMediationAdapter.this.bannerSpot.getSelectedUnitController().getClass().getName()), com.google.ads.mediation.fyber.DTExchangeErrorCodes.ERROR_DOMAIN);
                    android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError.getMessage());
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError);
                    com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialSpot.destroy();
                }
                ((com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController) com.google.ads.mediation.fyber.FyberMediationAdapter.this.interstitialSpot.getSelectedUnitController()).setEventsListener(com.google.ads.mediation.fyber.FyberMediationAdapter.this.createFyberInterstitialListener());
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdLoaded(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode) {
                com.google.android.gms.ads.AdError adError = com.google.ads.mediation.fyber.DTExchangeErrorCodes.getAdError(inneractiveErrorCode);
                android.util.Log.w(com.google.ads.mediation.fyber.FyberMediationAdapter.TAG, adError.getMessage());
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.google.ads.mediation.fyber.FyberMediationAdapter.this, adError);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener createFyberInterstitialListener() {
        return new com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.8
            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdOpened(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdClicked(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
            public void onAdDismissed(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdClosed(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
                com.google.ads.mediation.fyber.FyberMediationAdapter.this.mediationInterstitialListener.onAdLeftApplication(com.google.ads.mediation.fyber.FyberMediationAdapter.this);
            }
        };
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd dTExchangeWaterfallBannerAd = new com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd(mediationAdLoadCallback);
        this.bannerWaterfallAd = dTExchangeWaterfallBannerAd;
        dTExchangeWaterfallBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.fyber.DTExchangeBannerAd dTExchangeBannerAd = new com.google.ads.mediation.fyber.DTExchangeBannerAd(mediationAdLoadCallback);
        this.bannerRtbAd = dTExchangeBannerAd;
        dTExchangeBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.fyber.DTExchangeInterstitialAd dTExchangeInterstitialAd = new com.google.ads.mediation.fyber.DTExchangeInterstitialAd(mediationAdLoadCallback);
        this.interstitialRtbAd = dTExchangeInterstitialAd;
        dTExchangeInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.rewardedRenderer = new com.google.ads.mediation.fyber.FyberRewardedVideoRenderer(mediationAdLoadCallback);
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(MEDIATOR_NAME);
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(com.google.android.gms.ads.MobileAds.getVersion().toString());
        this.rewardedRenderer.loadRtbAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.NativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.fyber.DTExchangeNativeAdMapper dTExchangeNativeAdMapper = this.nativeAdMapper;
        if (dTExchangeNativeAdMapper != null) {
            dTExchangeNativeAdMapper.destroy();
            this.nativeAdMapper = null;
        }
        com.google.ads.mediation.fyber.DTExchangeNativeAdMapper dTExchangeNativeAdMapper2 = new com.google.ads.mediation.fyber.DTExchangeNativeAdMapper(mediationAdLoadCallback);
        this.nativeAdMapper = dTExchangeNativeAdMapper2;
        dTExchangeNativeAdMapper2.loadAd(mediationNativeAdConfiguration);
    }

    private void configureDTExchangePrivacy() {
        com.google.android.gms.ads.RequestConfiguration requestConfiguration = com.google.android.gms.ads.MobileAds.getRequestConfiguration();
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            com.fyber.inneractive.sdk.external.InneractiveAdManager.currentAudienceAppliesToCoppa();
        }
    }
}
