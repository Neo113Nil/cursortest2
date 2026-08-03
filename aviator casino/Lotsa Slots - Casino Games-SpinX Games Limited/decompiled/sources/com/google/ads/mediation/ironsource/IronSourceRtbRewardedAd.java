package com.google.ads.mediation.ironsource;

/* loaded from: classes3.dex */
public class IronSourceRtbRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener, com.unity3d.ironsourceads.rewarded.RewardedAdListener {
    private com.unity3d.ironsourceads.rewarded.RewardedAd ad = null;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;

    public IronSourceRtbRewardedAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void loadRtbAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        java.lang.String string = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "");
        if (android.text.TextUtils.isEmpty(string)) {
            this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
        } else {
            java.lang.String watermark = mediationRewardedAdConfiguration.getWatermark();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("google_watermark", watermark);
            com.unity3d.ironsourceads.rewarded.RewardedAdLoader.loadAd(new com.unity3d.ironsourceads.rewarded.RewardedAdRequest.Builder(string, mediationRewardedAdConfiguration.getBidResponse()).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        if (this.ad == null) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(107, "ad is null"));
            return;
        }
        try {
            android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, "Showing IronSource rewarded ad");
            this.ad.setListener(this);
            this.ad.show((android.app.Activity) context);
        } catch (java.lang.ClassCastException unused) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(102, "IronSource requires an Activity context to load ads."));
        }
    }

    private void reportAdFailedToShow(com.google.android.gms.ads.AdError adError) {
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdClicked(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoaded(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        this.ad = rewardedAd;
        this.mediationRewardedAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdDismissed(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdFailedToShow(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdShown(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onUserEarnedReward(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
        this.mediationRewardedAdCallback.onUserEarnedReward();
    }
}
