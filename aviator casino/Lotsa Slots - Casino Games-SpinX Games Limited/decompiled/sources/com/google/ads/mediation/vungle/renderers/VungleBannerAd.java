package com.google.ads.mediation.vungle.renderers;

/* loaded from: classes3.dex */
public abstract class VungleBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.vungle.ads.BannerAdListener {
    private com.vungle.ads.VungleBannerView bannerAdView;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback;
    private final com.google.ads.mediation.vungle.VungleFactory vungleFactory;

    protected abstract void loadAd(com.vungle.ads.VungleBannerView vungleBannerView, com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(com.vungle.ads.BaseAd baseAd) {
    }

    public VungleBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    public void validateParamsAndLoadAd(final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        android.os.Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.e(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.getMessage());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string2)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.e(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError2.getMessage());
            this.mediationAdLoadCallback.onFailure(adError2);
        } else {
            final android.content.Context context = mediationBannerAdConfiguration.getContext();
            final com.vungle.ads.VungleAdSize vungleBannerAdSizeFromGoogleAdSize = com.vungle.mediation.VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(mediationBannerAdConfiguration.getAdSize(), string2);
            com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(string, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.renderers.VungleBannerAd.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    com.google.ads.mediation.vungle.renderers.VungleBannerAd.this.createBannerViewAndLoadAd(context, string2, vungleBannerAdSizeFromGoogleAdSize, mediationBannerAdConfiguration);
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(com.google.android.gms.ads.AdError adError3) {
                    android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError3.toString());
                    com.google.ads.mediation.vungle.renderers.VungleBannerAd.this.mediationAdLoadCallback.onFailure(adError3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createBannerViewAndLoadAd(android.content.Context context, java.lang.String str, com.vungle.ads.VungleAdSize vungleAdSize, com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        com.vungle.ads.VungleBannerView createBannerAd = this.vungleFactory.createBannerAd(context, str, vungleAdSize);
        this.bannerAdView = createBannerAd;
        createBannerAd.setAdListener(this);
        this.bannerAdView.setAdapterAdFormat("VungleBannerAd");
        com.google.ads.mediation.vungle.VungleSdkWrapper.logCustomSizeForBannerPlacement(this.bannerAdView, "VungleBannerAd-custom", str, mediationBannerAdConfiguration.getAdSize());
        loadAd(this.bannerAdView, mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.bannerAdView;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
        this.mediationBannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        com.google.android.gms.ads.AdError adError = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError);
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
        this.mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }
}
