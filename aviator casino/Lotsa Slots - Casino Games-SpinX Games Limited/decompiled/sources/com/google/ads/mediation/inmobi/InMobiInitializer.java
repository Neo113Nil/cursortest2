package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiInitializer implements com.inmobi.sdk.SdkInitializationListener {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    public static final int UNINITIALIZED = 0;
    private static com.google.ads.mediation.inmobi.InMobiInitializer instance;
    private final com.google.ads.mediation.inmobi.InMobiSdkWrapper inMobiSdkWrapper;
    int initializationStatus;
    final java.util.ArrayList<com.google.ads.mediation.inmobi.InMobiInitializer.Listener> listeners;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InitializationStatus {
    }

    public interface Listener {
        void onInitializeError(com.google.android.gms.ads.AdError adError);

        void onInitializeSuccess();
    }

    private InMobiInitializer() {
        this.listeners = new java.util.ArrayList<>();
        this.initializationStatus = 0;
        this.inMobiSdkWrapper = new com.google.ads.mediation.inmobi.InMobiSdkWrapper();
    }

    public static com.google.ads.mediation.inmobi.InMobiInitializer getInstance() {
        if (instance == null) {
            instance = new com.google.ads.mediation.inmobi.InMobiInitializer();
        }
        return instance;
    }

    InMobiInitializer(com.google.ads.mediation.inmobi.InMobiSdkWrapper inMobiSdkWrapper) {
        this.listeners = new java.util.ArrayList<>();
        this.initializationStatus = 0;
        this.inMobiSdkWrapper = inMobiSdkWrapper;
    }

    public void init(android.content.Context context, java.lang.String str, com.google.ads.mediation.inmobi.InMobiInitializer.Listener listener) {
        if (this.initializationStatus == 2) {
            listener.onInitializeSuccess();
            return;
        }
        this.listeners.add(listener);
        if (this.initializationStatus == 1) {
            return;
        }
        this.initializationStatus = 1;
        this.inMobiSdkWrapper.init(context, str, com.google.ads.mediation.inmobi.InMobiConsent.getConsentObj(), this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(java.lang.Error error) {
        if (error == null) {
            android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi SDK initialized.");
            this.initializationStatus = 2;
            java.util.Iterator<com.google.ads.mediation.inmobi.InMobiInitializer.Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onInitializeSuccess();
            }
        } else {
            this.initializationStatus = 0;
            com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(101, error.getLocalizedMessage());
            java.util.Iterator<com.google.ads.mediation.inmobi.InMobiInitializer.Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onInitializeError(createAdapterError);
            }
        }
        this.listeners.clear();
    }
}
