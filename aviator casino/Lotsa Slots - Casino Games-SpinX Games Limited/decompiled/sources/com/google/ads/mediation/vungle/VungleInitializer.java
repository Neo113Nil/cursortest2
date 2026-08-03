package com.google.ads.mediation.vungle;

/* loaded from: classes3.dex */
public class VungleInitializer implements com.vungle.ads.InitializationListener {
    private static final com.google.ads.mediation.vungle.VungleInitializer instance = new com.google.ads.mediation.vungle.VungleInitializer();
    private final java.util.concurrent.atomic.AtomicBoolean isInitializing = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.ArrayList<com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener> initListeners = new java.util.ArrayList<>();

    public interface VungleInitializationListener {
        void onInitializeError(com.google.android.gms.ads.AdError adError);

        void onInitializeSuccess();
    }

    public static com.google.ads.mediation.vungle.VungleInitializer getInstance() {
        return instance;
    }

    private VungleInitializer() {
        com.vungle.ads.VungleAds.setIntegrationName(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB, com.vungle.mediation.BuildConfig.ADAPTER_VERSION.replace('.', '_'));
    }

    public void initialize(java.lang.String str, android.content.Context context, com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener vungleInitializationListener) {
        if (com.google.ads.mediation.vungle.VungleSdkWrapper.delegate.isInitialized()) {
            vungleInitializationListener.onInitializeSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                this.initListeners.add(vungleInitializationListener);
                return;
            }
            updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
            com.google.ads.mediation.vungle.VungleSdkWrapper.delegate.init(context, str, this);
            this.initListeners.add(vungleInitializationListener);
        }
    }

    @Override // com.vungle.ads.InitializationListener
    public void onSuccess() {
        java.util.Iterator<com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.initListeners.clear();
        this.isInitializing.set(false);
    }

    @Override // com.vungle.ads.InitializationListener
    public void onError(com.vungle.ads.VungleError vungleError) {
        com.google.android.gms.ads.AdError adError = com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError);
        java.util.Iterator<com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adError);
        }
        this.initListeners.clear();
        this.isInitializing.set(false);
    }

    public void updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            com.vungle.ads.VunglePrivacySettings.setCOPPAStatus(true);
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            com.vungle.ads.VunglePrivacySettings.setCOPPAStatus(false);
        }
    }
}
