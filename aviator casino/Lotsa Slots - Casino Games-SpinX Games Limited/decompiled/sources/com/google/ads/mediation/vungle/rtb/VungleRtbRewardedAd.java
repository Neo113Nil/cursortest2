package com.google.ads.mediation.vungle.rtb;

/* loaded from: classes3.dex */
public class VungleRtbRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.vungle.ads.RewardedAdListener {
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;
    private com.vungle.ads.RewardedAd rewardedAd;
    private final com.google.ads.mediation.vungle.VungleFactory vungleFactory;

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
    }

    public VungleRtbRewardedAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    public void render(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        android.os.Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        android.os.Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        final java.lang.String string = mediationExtras.getString("userId");
        java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string2)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final java.lang.String string3 = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string3)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError2.toString());
            this.mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        final java.lang.String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        final com.vungle.ads.AdConfig createAdConfig = this.vungleFactory.createAdConfig();
        if (mediationExtras.containsKey(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION)) {
            createAdConfig.setAdOrientation(mediationExtras.getInt(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION, 2));
        }
        java.lang.String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!android.text.TextUtils.isEmpty(watermark)) {
            createAdConfig.setWatermark(watermark);
        }
        final android.content.Context context = mediationRewardedAdConfiguration.getContext();
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(string2, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.1
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd vungleRtbRewardedAd = com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.this;
                vungleRtbRewardedAd.rewardedAd = vungleRtbRewardedAd.vungleFactory.createRewardedAd(context, string3, createAdConfig);
                com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.this.rewardedAd.setAdListener(com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.this);
                com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.this.rewardedAd.setAdapterAdFormat("VungleRtbRewardedAd");
                if (!android.text.TextUtils.isEmpty(string)) {
                    com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.this.rewardedAd.setUserId(string);
                }
                com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.this.rewardedAd.load(bidResponse);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(com.google.android.gms.ads.AdError adError3) {
                android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError3.toString());
                com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.this.mediationAdLoadCallback.onFailure(adError3);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        com.vungle.ads.RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
        this.mediationRewardedAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        com.google.android.gms.ads.AdError adError = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError);
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
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
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.mediationRewardedAdCallback.reportAdImpression();
        }
    }
}
