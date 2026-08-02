package com.paypal.oslo.feature.checkcapture.ingo;

/* loaded from: classes11.dex */
public final class IngoSdkLauncher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider> getHighResolutionOutputSizeshNQ4ISI;

    private IngoSdkLauncher_Factory(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider> provider2) {
        return new com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher newInstance(com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager checkCaptureFraudForceManager, com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider ingoConfigurationProvider) {
        return new com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher(checkCaptureFraudForceManager, ingoConfigurationProvider);
    }
}
