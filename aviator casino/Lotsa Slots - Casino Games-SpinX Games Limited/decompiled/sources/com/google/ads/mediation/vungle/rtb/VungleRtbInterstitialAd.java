package com.google.ads.mediation.vungle.rtb;

/* loaded from: classes3.dex */
public class VungleRtbInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd, com.vungle.ads.InterstitialAdListener {
    private com.vungle.ads.InterstitialAd interstitialAd;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback;
    private final com.google.ads.mediation.vungle.VungleFactory vungleFactory;

    public VungleRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    public void render(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        android.os.Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        android.os.Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string2)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError2.toString());
            this.mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        final java.lang.String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        final com.vungle.ads.AdConfig createAdConfig = this.vungleFactory.createAdConfig();
        if (mediationExtras.containsKey(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION)) {
            createAdConfig.setAdOrientation(mediationExtras.getInt(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION, 2));
        }
        java.lang.String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!android.text.TextUtils.isEmpty(watermark)) {
            createAdConfig.setWatermark(watermark);
        }
        final android.content.Context context = mediationInterstitialAdConfiguration.getContext();
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(string, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.1
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd vungleRtbInterstitialAd = com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.this;
                vungleRtbInterstitialAd.interstitialAd = vungleRtbInterstitialAd.vungleFactory.createInterstitialAd(context, string2, createAdConfig);
                com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.this.interstitialAd.setAdListener(com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.this);
                com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.this.interstitialAd.setAdapterAdFormat("VungleRtbInterstitialAd");
                com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.this.interstitialAd.load(bidResponse);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(com.google.android.gms.ads.AdError adError3) {
                android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError3.toString());
                com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.this.mediationAdLoadCallback.onFailure(adError3);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        com.vungle.ads.InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.play(context);
        } else if (this.mediationInterstitialAdCallback != null) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            this.mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
        this.mediationInterstitialAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        com.google.android.gms.ads.AdError adError = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError);
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        com.google.android.gms.ads.AdError adError = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError);
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
        this.mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mediationInterstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }
}
