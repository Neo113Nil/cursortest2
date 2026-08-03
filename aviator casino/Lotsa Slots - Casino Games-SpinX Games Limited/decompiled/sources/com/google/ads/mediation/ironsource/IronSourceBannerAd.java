package com.google.ads.mediation.ironsource;

/* loaded from: classes3.dex */
public class IronSourceBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd {
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceBannerAd>> availableBannerInstances = new java.util.concurrent.ConcurrentHashMap<>();
    private static final com.google.ads.mediation.ironsource.IronSourceBannerAdListener ironSourceBannerListener = new com.google.ads.mediation.ironsource.IronSourceBannerAdListener();
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private com.ironsource.mediationsdk.ISBannerSize bannerSizeIronSource;
    private android.widget.FrameLayout ironSourceAdView;
    private com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout ironSourceBannerLayout;

    public IronSourceBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        this.adLoadCallback = mediationAdLoadCallback;
    }

    com.google.android.gms.ads.mediation.MediationBannerAdCallback getBannerAdCallback() {
        return this.bannerAdCallback;
    }

    com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> getAdLoadCallback() {
        return this.adLoadCallback;
    }

    void setBannerAdCallback(com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback) {
        this.bannerAdCallback = mediationBannerAdCallback;
    }

    com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout getIronSourceBannerLayout() {
        return this.ironSourceBannerLayout;
    }

    android.widget.FrameLayout getIronSourceAdView() {
        return this.ironSourceAdView;
    }

    static com.google.ads.mediation.ironsource.IronSourceBannerAd getFromAvailableInstances(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceBannerAd>> concurrentHashMap = availableBannerInstances;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    static void removeFromAvailableInstances(java.lang.String str) {
        availableBannerInstances.remove(str);
    }

    static void clearAllAvailableInstancesExceptOne(java.lang.String str) {
        for (java.lang.String str2 : availableBannerInstances.keySet()) {
            if (!str2.equals(str)) {
                android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource Banner Destroy ad with instance ID: %s", str2));
                com.ironsource.mediationsdk.IronSource.destroyISDemandOnlyBanner(str2);
                removeFromAvailableInstances(str2);
            }
        }
    }

    public void loadAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.ads.mediation.ironsource.MediationUtilsWrapper mediationUtilsWrapper) {
        if (isParamsValid(mediationBannerAdConfiguration, mediationUtilsWrapper)) {
            java.lang.String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
            android.content.Context context = mediationBannerAdConfiguration.getContext();
            android.app.Activity activity = (android.app.Activity) context;
            availableBannerInstances.put(string, new java.lang.ref.WeakReference<>(this));
            this.ironSourceAdView = new android.widget.FrameLayout(context);
            com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout createBannerForDemandOnly = com.ironsource.mediationsdk.IronSource.createBannerForDemandOnly(activity, this.bannerSizeIronSource);
            this.ironSourceBannerLayout = createBannerForDemandOnly;
            createBannerForDemandOnly.setBannerDemandOnlyListener(ironSourceBannerListener);
            android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Loading IronSource banner ad with instance ID: %s", string));
            com.ironsource.mediationsdk.IronSource.loadISDemandOnlyBanner(activity, this.ironSourceBannerLayout, string);
        }
    }

    private boolean isParamsValid(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.ads.mediation.ironsource.MediationUtilsWrapper mediationUtilsWrapper) {
        java.lang.String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        android.content.Context context = mediationBannerAdConfiguration.getContext();
        com.google.android.gms.ads.AdError validateIronSourceAdLoadParams = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.validateIronSourceAdLoadParams(context, string);
        if (validateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(validateIronSourceAdLoadParams);
            return false;
        }
        if (!com.google.ads.mediation.ironsource.IronSourceAdapterUtils.canLoadIronSourceAdInstance(string, availableBannerInstances)) {
            onAdFailedToLoad(new com.google.android.gms.ads.AdError(103, "An IronSource banner is already loaded for instance ID: " + string, "com.google.ads.mediation.ironsource"));
            return false;
        }
        com.google.android.gms.ads.AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        com.ironsource.mediationsdk.ISBannerSize iSBannerSizeFromGoogleAdSize = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getISBannerSizeFromGoogleAdSize(context, adSize, mediationUtilsWrapper);
        this.bannerSizeIronSource = iSBannerSizeFromGoogleAdSize;
        if (iSBannerSizeFromGoogleAdSize != null) {
            return true;
        }
        onAdFailedToLoad(new com.google.android.gms.ads.AdError(105, "There is no matching IronSource banner ad size for Google ad size: " + adSize, "com.google.ads.mediation.ironsource"));
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.ironSourceAdView;
    }

    private void onAdFailedToLoad(com.google.android.gms.ads.AdError adError) {
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback = this.adLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }
}
