package com.google.ads.mediation.ironsource;

/* loaded from: classes3.dex */
public class IronSourceInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd {
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceInterstitialAd>> availableInterstitialInstances = new java.util.concurrent.ConcurrentHashMap<>();
    private static final com.google.ads.mediation.ironsource.IronSourceInterstitialAdListener ironSourceInterstitialListener = new com.google.ads.mediation.ironsource.IronSourceInterstitialAdListener();
    private final java.lang.String instanceID;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback;

    public IronSourceInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    static com.google.ads.mediation.ironsource.IronSourceInterstitialAd getFromAvailableInstances(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceInterstitialAd>> concurrentHashMap = availableInterstitialInstances;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    static void removeFromAvailableInstances(java.lang.String str) {
        availableInterstitialInstances.remove(str);
    }

    static com.google.ads.mediation.ironsource.IronSourceInterstitialAdListener getIronSourceInterstitialListener() {
        return ironSourceInterstitialListener;
    }

    com.google.android.gms.ads.mediation.MediationInterstitialAdCallback getInterstitialAdCallback() {
        return this.interstitialAdCallback;
    }

    void setInterstitialAdCallback(com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.interstitialAdCallback = mediationInterstitialAdCallback;
    }

    public com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> getMediationAdLoadCallback() {
        return this.mediationAdLoadCallback;
    }

    public void loadWaterfallAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (loadValidConfig(mediationInterstitialAdConfiguration)) {
            com.ironsource.mediationsdk.IronSource.loadISDemandOnlyInterstitial((android.app.Activity) mediationInterstitialAdConfiguration.getContext(), this.instanceID);
        }
    }

    private boolean loadValidConfig(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (!isParamsValid(mediationInterstitialAdConfiguration.getContext())) {
            return false;
        }
        availableInterstitialInstances.put(this.instanceID, new java.lang.ref.WeakReference<>(this));
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Loading IronSource interstitial ad with instance ID: %s", this.instanceID));
        return true;
    }

    private boolean isParamsValid(android.content.Context context) {
        com.google.android.gms.ads.AdError validateIronSourceAdLoadParams = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.validateIronSourceAdLoadParams(context, this.instanceID);
        if (validateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(validateIronSourceAdLoadParams);
            return false;
        }
        if (com.google.ads.mediation.ironsource.IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.instanceID, availableInterstitialInstances)) {
            return true;
        }
        onAdFailedToLoad(new com.google.android.gms.ads.AdError(103, java.lang.String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.instanceID), "com.google.ads.mediation.ironsource"));
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        com.ironsource.mediationsdk.IronSource.showISDemandOnlyInterstitial(this.instanceID);
    }

    private void onAdFailedToLoad(com.google.android.gms.ads.AdError adError) {
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }
}
