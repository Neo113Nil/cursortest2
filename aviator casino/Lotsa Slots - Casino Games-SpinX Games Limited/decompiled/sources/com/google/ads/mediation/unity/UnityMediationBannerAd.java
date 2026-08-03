package com.google.ads.mediation.unity;

/* loaded from: classes3.dex */
public class UnityMediationBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.unity3d.services.banners.BannerView.IListener {
    static final java.lang.String ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID = "Unity Ads initialization failed for game ID '%s' with error message: %s";
    static final java.lang.String ERROR_MSG_NO_MATCHING_AD_SIZE = "There is no matching Unity Ads ad size for Google ad size: ";
    private java.lang.String bannerPlacementId;
    private java.lang.String gameId;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationBannerAdLoadCallback;
    private final com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader;
    private final com.google.ads.mediation.unity.UnityBannerViewFactory unityBannerViewFactory;
    private com.google.ads.mediation.unity.UnityBannerViewWrapper unityBannerViewWrapper;
    private final com.google.ads.mediation.unity.UnityInitializer unityInitializer;

    public UnityMediationBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.unity.UnityInitializer unityInitializer, com.google.ads.mediation.unity.UnityBannerViewFactory unityBannerViewFactory, com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader) {
        this.mediationBannerAdLoadCallback = mediationAdLoadCallback;
        this.unityBannerViewFactory = unityBannerViewFactory;
        this.unityInitializer = unityInitializer;
        this.unityAdsLoader = unityAdsLoader;
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(com.unity3d.services.banners.BannerView bannerView) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads finished loading banner ad for placement ID: %s", bannerView.getPlacementId()));
        this.mediationBannerAdCallback = this.mediationBannerAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(com.unity3d.services.banners.BannerView bannerView) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads banner ad was clicked for placement ID: %s", bannerView.getPlacementId()));
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.reportAdClicked();
        this.mediationBannerAdCallback.onAdOpened();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(com.unity3d.services.banners.BannerView bannerView, com.unity3d.services.banners.BannerErrorInfo bannerErrorInfo) {
        com.google.android.gms.ads.AdError createAdError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createAdError(com.google.ads.mediation.unity.UnityAdsAdapterUtils.getMediationErrorCode(bannerErrorInfo), bannerErrorInfo.errorMessage);
        android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, createAdError.toString());
        this.mediationBannerAdLoadCallback.onFailure(createAdError);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(com.unity3d.services.banners.BannerView bannerView) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads banner ad left application for placement ID: %s", bannerView.getPlacementId()));
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerShown(com.unity3d.services.banners.BannerView bannerView) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads banner ad was shown for placement ID: %s", bannerView.getPlacementId()));
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public void loadAd(final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.ads.mediation.unity.MediationUtilsWrapper mediationUtilsWrapper) {
        final android.content.Context context = mediationBannerAdConfiguration.getContext();
        android.os.Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        com.google.android.gms.ads.AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        this.gameId = serverParameters.getString(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID);
        java.lang.String string = serverParameters.getString("zoneId");
        this.bannerPlacementId = string;
        if (!com.google.ads.mediation.unity.UnityAdsAdapterUtils.areValidIds(this.gameId, string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity");
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adError.toString());
            this.mediationBannerAdLoadCallback.onFailure(adError);
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(105, "Unity Ads requires an Activity context to load ads.", "com.google.ads.mediation.unity");
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adError2.toString());
            this.mediationBannerAdLoadCallback.onFailure(adError2);
            return;
        }
        final android.app.Activity activity = (android.app.Activity) context;
        final java.lang.String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        final com.unity3d.services.banners.UnityBannerSize unityBannerSize = com.google.ads.mediation.unity.UnityAdsAdapterUtils.getUnityBannerSize(context, adSize, !android.text.TextUtils.isEmpty(bidResponse), mediationUtilsWrapper);
        if (unityBannerSize == null) {
            com.google.android.gms.ads.AdError adError3 = new com.google.android.gms.ads.AdError(110, ERROR_MSG_NO_MATCHING_AD_SIZE + adSize, "com.google.ads.mediation.unity");
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adError3.toString());
            this.mediationBannerAdLoadCallback.onFailure(adError3);
            return;
        }
        this.unityInitializer.initializeUnityAds(context, this.gameId, new com.unity3d.ads.IUnityAdsInitializationListener() { // from class: com.google.ads.mediation.unity.UnityMediationBannerAd.1
            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationComplete() {
                android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", com.google.ads.mediation.unity.UnityMediationBannerAd.this.gameId, com.google.ads.mediation.unity.UnityMediationBannerAd.this.bannerPlacementId));
                com.google.ads.mediation.unity.UnityAdsAdapterUtils.setUnityAdsPrivacy(com.google.android.gms.ads.MobileAds.getRequestConfiguration(), new com.unity3d.ads.metadata.MetaData(context));
                if (com.google.ads.mediation.unity.UnityMediationBannerAd.this.unityBannerViewWrapper == null) {
                    com.google.ads.mediation.unity.UnityMediationBannerAd unityMediationBannerAd = com.google.ads.mediation.unity.UnityMediationBannerAd.this;
                    unityMediationBannerAd.unityBannerViewWrapper = unityMediationBannerAd.unityBannerViewFactory.createBannerView(activity, com.google.ads.mediation.unity.UnityMediationBannerAd.this.bannerPlacementId, unityBannerSize);
                }
                com.google.ads.mediation.unity.UnityMediationBannerAd.this.unityBannerViewWrapper.setListener(com.google.ads.mediation.unity.UnityMediationBannerAd.this);
                com.unity3d.ads.UnityAdsLoadOptions createUnityAdsLoadOptionsWithId = com.google.ads.mediation.unity.UnityMediationBannerAd.this.unityAdsLoader.createUnityAdsLoadOptionsWithId(java.util.UUID.randomUUID().toString());
                createUnityAdsLoadOptionsWithId.set("watermark", mediationBannerAdConfiguration.getWatermark());
                java.lang.String str = bidResponse;
                if (str != null) {
                    createUnityAdsLoadOptionsWithId.setAdMarkup(str);
                }
                com.google.ads.mediation.unity.UnityMediationBannerAd.this.unityBannerViewWrapper.load(createUnityAdsLoadOptionsWithId);
            }

            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str) {
                com.google.android.gms.ads.AdError createSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, java.lang.String.format(com.google.ads.mediation.unity.UnityMediationBannerAd.ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID, com.google.ads.mediation.unity.UnityMediationBannerAd.this.gameId, str));
                android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, createSDKError.toString());
                com.google.ads.mediation.unity.UnityMediationBannerAd.this.mediationBannerAdLoadCallback.onFailure(createSDKError);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.unityBannerViewWrapper.getBannerView();
    }
}
