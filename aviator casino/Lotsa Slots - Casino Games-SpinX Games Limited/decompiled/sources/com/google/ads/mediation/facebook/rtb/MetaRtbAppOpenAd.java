package com.google.ads.mediation.facebook.rtb;

/* compiled from: MetaRtbAppOpenAd.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/google/ads/mediation/facebook/rtb/MetaRtbAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/facebook/ads/InterstitialAdExtendedListener;", "loadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "metaFactory", "Lcom/google/ads/mediation/facebook/MetaFactory;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/facebook/MetaFactory;)V", "appOpenAd", "Lcom/facebook/ads/InterstitialAd;", "appOpenAdCallback", "showAdCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "didAppOpenAdClose", "loadAd", "", "adConfiguration", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "showAd", "context", "Landroid/content/Context;", "onInterstitialDisplayed", "ad", "Lcom/facebook/ads/Ad;", "onInterstitialDismissed", "onError", "adError", "Lcom/facebook/ads/AdError;", com.ironsource.Vf.j, com.ironsource.Vf.f, "onLoggingImpression", "onInterstitialActivityDestroyed", "onRewardedAdCompleted", "onRewardedAdServerSucceeded", "onRewardedAdServerFailed", "meta_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetaRtbAppOpenAd implements com.google.android.gms.ads.mediation.MediationAppOpenAd, com.facebook.ads.InterstitialAdExtendedListener {
    private com.facebook.ads.InterstitialAd appOpenAd;
    private com.google.android.gms.ads.mediation.MediationAppOpenAdCallback appOpenAdCallback;
    private final java.util.concurrent.atomic.AtomicBoolean didAppOpenAdClose;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> loadCallback;
    private final com.google.ads.mediation.facebook.MetaFactory metaFactory;
    private final java.util.concurrent.atomic.AtomicBoolean showAdCalled;

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    public MetaRtbAppOpenAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> loadCallback, com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metaFactory, "metaFactory");
        this.loadCallback = loadCallback;
        this.metaFactory = metaFactory;
        this.showAdCalled = new java.util.concurrent.atomic.AtomicBoolean();
        this.didAppOpenAdClose = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public final void loadAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration adConfiguration) {
        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig;
        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withBid;
        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener;
        com.facebook.ads.InterstitialAd interstitialAd;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        android.os.Bundle serverParameters = adConfiguration.getServerParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        java.lang.String placementID = com.google.ads.mediation.facebook.FacebookMediationAdapter.getPlacementID(serverParameters);
        if (android.text.TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty. ", "com.google.ads.mediation.facebook");
            android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
            this.loadCallback.onFailure(adError);
            return;
        }
        com.google.ads.mediation.facebook.FacebookMediationAdapter.setMixedAudience(adConfiguration);
        this.appOpenAd = this.metaFactory.createAppOpenAd(adConfiguration.getContext(), placementID);
        if (!android.text.TextUtils.isEmpty(adConfiguration.getWatermark()) && (interstitialAd = this.appOpenAd) != null) {
            interstitialAd.setExtraHints(new com.facebook.ads.ExtraHints.Builder().mediationData(adConfiguration.getWatermark()).build());
        }
        com.facebook.ads.InterstitialAd interstitialAd2 = this.appOpenAd;
        if (interstitialAd2 != null) {
            interstitialAd2.loadAd((interstitialAd2 == null || (buildLoadAdConfig = interstitialAd2.buildLoadAdConfig()) == null || (withBid = buildLoadAdConfig.withBid(adConfiguration.getBidResponse())) == null || (withAdListener = withBid.withAdListener(this)) == null) ? null : withAdListener.build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.showAdCalled.set(true);
        com.facebook.ads.InterstitialAd interstitialAd = this.appOpenAd;
        if (interstitialAd == null || interstitialAd.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present app open ad.", "com.google.ads.mediation.facebook");
        android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.didAppOpenAdClose.getAndSet(true) || (mediationAppOpenAdCallback = this.appOpenAdCallback) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.AdListener
    public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adError, "adError");
        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.facebook.FacebookMediationAdapter.getAdError(adError);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
        if (this.showAdCalled.get()) {
            com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
            if (mediationAppOpenAdCallback != null) {
                mediationAppOpenAdCallback.onAdFailedToShow(adError2);
                return;
            }
            return;
        }
        this.loadCallback.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(com.facebook.ads.Ad ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        this.appOpenAdCallback = this.loadCallback.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(com.facebook.ads.Ad ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(com.facebook.ads.Ad ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        com.google.android.gms.ads.mediation.MediationAppOpenAdCallback mediationAppOpenAdCallback;
        if (this.didAppOpenAdClose.getAndSet(true) || (mediationAppOpenAdCallback = this.appOpenAdCallback) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }
}
