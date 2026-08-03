package com.google.ads.mediation.ironsource;

/* loaded from: classes3.dex */
public class IronSourceRtbInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd, com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener, com.unity3d.ironsourceads.interstitial.InterstitialAdListener {
    private com.unity3d.ironsourceads.interstitial.InterstitialAd ad = null;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback;

    public IronSourceRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void loadRtbAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        java.lang.String string = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "");
        if (android.text.TextUtils.isEmpty(string)) {
            this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
        } else {
            java.lang.String watermark = mediationInterstitialAdConfiguration.getWatermark();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("google_watermark", watermark);
            com.unity3d.ironsourceads.interstitial.InterstitialAdLoader.loadAd(new com.unity3d.ironsourceads.interstitial.InterstitialAdRequest.Builder(string, mediationInterstitialAdConfiguration.getBidResponse()).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        if (this.ad == null) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(107, "ad is null"));
            return;
        }
        try {
            android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, "Showing IronSource interstitial ad");
            this.ad.setListener(this);
            this.ad.show((android.app.Activity) context);
        } catch (java.lang.ClassCastException unused) {
            reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(102, "IronSource requires an Activity context to load ads."));
        }
    }

    private void reportAdFailedToShow(com.google.android.gms.ads.AdError adError) {
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdClicked(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdDismissed(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdFailedToShow(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        reportAdFailedToShow(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdShown(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        this.interstitialAdCallback.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, ironSourceError.toString());
        this.mediationAdLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorIronSourceDomain(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoaded(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd) {
        this.ad = interstitialAd;
        this.interstitialAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }
}
