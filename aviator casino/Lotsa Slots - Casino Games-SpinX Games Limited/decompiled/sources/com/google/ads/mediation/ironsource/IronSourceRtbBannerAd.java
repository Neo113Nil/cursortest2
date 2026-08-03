package com.google.ads.mediation.ironsource;

/* loaded from: classes3.dex */
public class IronSourceRtbBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.unity3d.ironsourceads.banner.BannerAdLoaderListener, com.unity3d.ironsourceads.banner.BannerAdViewListener {
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback adLifecycleCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback;
    private android.widget.FrameLayout ironSourceAdView;

    public IronSourceRtbBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        this.adLoadCallback = mediationAdLoadCallback;
    }

    public void loadRtbAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.ads.mediation.ironsource.MediationUtilsWrapper mediationUtilsWrapper) {
        java.lang.String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "");
        if (android.text.TextUtils.isEmpty(string)) {
            this.adLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
            return;
        }
        java.lang.String watermark = mediationBannerAdConfiguration.getWatermark();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("google_watermark", watermark);
        android.content.Context context = mediationBannerAdConfiguration.getContext();
        com.unity3d.ironsourceads.banner.BannerAdRequest build = new com.unity3d.ironsourceads.banner.BannerAdRequest.Builder(context, string, mediationBannerAdConfiguration.getBidResponse(), com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getAdSizeFromGoogleAdSize(context, mediationBannerAdConfiguration.getAdSize(), mediationUtilsWrapper)).withExtraParams(bundle).build();
        this.ironSourceAdView = new android.widget.FrameLayout(context);
        com.unity3d.ironsourceads.banner.BannerAdLoader.loadAd(build, this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.ironSourceAdView;
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoaded(com.unity3d.ironsourceads.banner.BannerAdView bannerAdView) {
        if (this.ironSourceAdView == null || this.adLoadCallback == null) {
            return;
        }
        bannerAdView.setListener(this);
        this.ironSourceAdView.addView(bannerAdView);
        this.adLifecycleCallback = this.adLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.adLoadCallback == null) {
            return;
        }
        this.adLoadCallback.onFailure(new com.google.android.gms.ads.AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdClicked(com.unity3d.ironsourceads.banner.BannerAdView bannerAdView) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.adLifecycleCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdOpened();
        this.adLifecycleCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdShown(com.unity3d.ironsourceads.banner.BannerAdView bannerAdView) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.adLifecycleCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
