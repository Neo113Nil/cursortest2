package com.vungle.mediation;

/* loaded from: classes6.dex */
public class VungleInterstitialAdapter extends com.google.ads.mediation.vungle.VungleMediationAdapter implements com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationBannerAdapter {
    private com.vungle.ads.VungleBannerView bannerAdView;
    private com.vungle.ads.InterstitialAd interstitialAd;
    private com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener;
    private com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(final android.content.Context context, final com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        java.lang.String string = bundle.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        final java.lang.String string2 = bundle.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string2)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError2.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError2);
        } else {
            com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
            final com.vungle.ads.AdConfig adConfig = new com.vungle.ads.AdConfig();
            if (bundle2 != null && bundle2.containsKey(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION)) {
                adConfig.setAdOrientation(bundle2.getInt(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION, 2));
            }
            com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(string, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.vungle.mediation.VungleInterstitialAdapter.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    com.vungle.mediation.VungleInterstitialAdapter.this.interstitialAd = new com.vungle.ads.InterstitialAd(context, string2, adConfig);
                    com.vungle.mediation.VungleInterstitialAdapter.this.interstitialAd.setAdListener(new com.vungle.mediation.VungleInterstitialAdapter.VungleInterstitialListener());
                    com.vungle.mediation.VungleInterstitialAdapter.this.interstitialAd.setAdapterAdFormat("VungleInterstitialAdapter-interstitial");
                    com.vungle.mediation.VungleInterstitialAdapter.this.interstitialAd.load((java.lang.String) null);
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(com.google.android.gms.ads.AdError adError3) {
                    mediationInterstitialListener.onAdFailedToLoad(com.vungle.mediation.VungleInterstitialAdapter.this, adError3);
                    android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError3.toString());
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        com.vungle.ads.InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.play(null);
        }
    }

    private class VungleInterstitialListener implements com.vungle.ads.InterstitialAdListener {
        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
        }

        private VungleInterstitialListener() {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLoaded(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener.onAdOpened(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClosed(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClicked(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLeftApplication(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
            com.google.android.gms.ads.AdError adError = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.vungle.mediation.VungleInterstitialAdapter.this, adError);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        android.util.Log.d(TAG, "onDestroy: " + hashCode());
        com.vungle.ads.VungleBannerView vungleBannerView = this.bannerAdView;
        if (vungleBannerView != null) {
            vungleBannerView.finishAd();
            this.bannerAdView = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final android.content.Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, android.os.Bundle bundle, final com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        java.lang.String string = bundle.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        final java.lang.String string2 = bundle.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string2)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(TAG, adError2.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        final com.vungle.ads.VungleAdSize vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(adSize, string2);
        android.util.Log.d(TAG, "requestBannerAd for Placement: " + string2 + " ### Adapter instance: " + hashCode());
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(string, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.vungle.mediation.VungleInterstitialAdapter.2
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                com.vungle.mediation.VungleInterstitialAdapter.this.bannerAdView = new com.vungle.ads.VungleBannerView(context, string2, vungleBannerAdSizeFromGoogleAdSize);
                com.vungle.mediation.VungleInterstitialAdapter.this.bannerAdView.setAdListener(new com.vungle.mediation.VungleInterstitialAdapter.VungleBannerListener());
                com.vungle.mediation.VungleInterstitialAdapter.this.bannerAdView.setAdapterAdFormat("VungleInterstitialAdapter-banner");
                com.google.ads.mediation.vungle.VungleSdkWrapper.logCustomSizeForBannerPlacement(com.vungle.mediation.VungleInterstitialAdapter.this.bannerAdView, "VungleInterstitialAdapter-banner-custom", string2, adSize);
                com.vungle.mediation.VungleInterstitialAdapter.this.bannerAdView.load((java.lang.String) null);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(com.google.android.gms.ads.AdError adError3) {
                android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError3.toString());
                if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener != null) {
                    com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(com.vungle.mediation.VungleInterstitialAdapter.this, adError3);
                }
            }
        });
    }

    private class VungleBannerListener implements com.vungle.ads.BannerAdListener {
        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(com.vungle.ads.BaseAd baseAd) {
        }

        private VungleBannerListener() {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener.onAdClicked(com.vungle.mediation.VungleInterstitialAdapter.this);
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener.onAdOpened(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener.onAdLoaded(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
            com.google.android.gms.ads.AdError adError = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(com.vungle.mediation.VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
            if (com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener != null) {
                com.vungle.mediation.VungleInterstitialAdapter.this.mediationBannerListener.onAdLeftApplication(com.vungle.mediation.VungleInterstitialAdapter.this);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        android.util.Log.d(TAG, "getBannerView # instance: " + hashCode());
        return this.bannerAdView;
    }

    public static com.vungle.ads.VungleAdSize getVungleBannerAdSizeFromGoogleAdSize(com.google.android.gms.ads.AdSize adSize, java.lang.String str) {
        com.vungle.ads.VungleAdSize validAdSizeFromSize = com.vungle.ads.VungleAdSize.getValidAdSizeFromSize(adSize.getWidth(), adSize.getHeight(), str);
        android.util.Log.d(TAG, "The requested ad size: " + adSize + "; placementId=" + str + "; vngAdSize=" + validAdSizeFromSize);
        return validAdSizeFromSize;
    }
}
