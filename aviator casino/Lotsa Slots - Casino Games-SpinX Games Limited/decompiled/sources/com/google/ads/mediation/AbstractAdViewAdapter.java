package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza {
    public static final java.lang.String AD_UNIT_ID_PARAMETER = "pubid";
    private com.google.android.gms.ads.AdLoader adLoader;
    protected com.google.android.gms.ads.AdView mAdView;
    protected com.google.android.gms.ads.interstitial.InterstitialAd mInterstitialAd;

    com.google.android.gms.ads.AdRequest buildAdRequest(android.content.Context context, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle, android.os.Bundle bundle2) {
        com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
        java.util.Set<java.lang.String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            java.util.Iterator<java.lang.String> it = keywords.iterator();
            while (it.hasNext()) {
                builder.addKeyword(it.next());
            }
        }
        if (mediationAdRequest.isTesting()) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            builder.zzb(com.google.android.gms.ads.internal.util.client.zzf.zzF(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.zzc(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.zzd(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return builder.build();
    }

    protected abstract android.os.Bundle buildExtrasBundle(android.os.Bundle bundle, android.os.Bundle bundle2);

    public java.lang.String getAdUnitId(android.os.Bundle bundle) {
        return bundle.getString("pubid");
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.mAdView;
    }

    com.google.android.gms.ads.interstitial.InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public com.google.android.gms.ads.internal.client.zzea getVideoController() {
        com.google.android.gms.ads.AdView adView = this.mAdView;
        if (adView != null) {
            return adView.zza().zzb();
        }
        return null;
    }

    com.google.android.gms.ads.AdLoader.Builder newAdLoader(android.content.Context context, java.lang.String str) {
        return new com.google.android.gms.ads.AdLoader.Builder(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        com.google.android.gms.ads.AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        com.google.android.gms.ads.AdView adView = this.mAdView;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        com.google.android.gms.ads.AdView adView = this.mAdView;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, android.os.Bundle bundle, com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        com.google.android.gms.ads.AdView adView = new com.google.android.gms.ads.AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new com.google.android.gms.ads.AdSize(adSize.getWidth(), adSize.getHeight()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new com.google.ads.mediation.zzb(this, mediationBannerListener));
        this.mAdView.loadAd(buildAdRequest(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        com.google.android.gms.ads.interstitial.InterstitialAd.load(context, getAdUnitId(bundle), buildAdRequest(context, mediationAdRequest, bundle2, bundle), new com.google.ads.mediation.zzc(this, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationNativeListener mediationNativeListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.NativeMediationAdRequest nativeMediationAdRequest, android.os.Bundle bundle2) {
        com.google.ads.mediation.zze zzeVar = new com.google.ads.mediation.zze(this, mediationNativeListener);
        com.google.android.gms.ads.AdLoader.Builder withAdListener = newAdLoader(context, bundle.getString("pubid")).withAdListener(zzeVar);
        withAdListener.zzc(nativeMediationAdRequest.getNativeAdOptions());
        withAdListener.withNativeAdOptions(nativeMediationAdRequest.getNativeAdRequestOptions());
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.zza(zzeVar);
        }
        if (nativeMediationAdRequest.zza()) {
            for (java.lang.String str : nativeMediationAdRequest.zzb().keySet()) {
                withAdListener.zzb(str, zzeVar, true != ((java.lang.Boolean) nativeMediationAdRequest.zzb().get(str)).booleanValue() ? null : zzeVar);
            }
        }
        com.google.android.gms.ads.AdLoader build = withAdListener.build();
        this.adLoader = build;
        build.loadAd(buildAdRequest(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(null);
        }
    }
}
