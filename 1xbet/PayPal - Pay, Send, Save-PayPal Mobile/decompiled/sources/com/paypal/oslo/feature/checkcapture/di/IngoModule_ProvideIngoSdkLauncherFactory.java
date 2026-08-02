package com.paypal.oslo.feature.checkcapture.di;

/* loaded from: classes5.dex */
public final class IngoModule_ProvideIngoSdkLauncherFactory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider> getHighSpeedVideoFpsRanges;

    private IngoModule_ProvideIngoSdkLauncherFactory(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher get() {
        return provideIngoSdkLauncher(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.checkcapture.di.IngoModule_ProvideIngoSdkLauncherFactory create(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider> provider2) {
        return new com.paypal.oslo.feature.checkcapture.di.IngoModule_ProvideIngoSdkLauncherFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher provideIngoSdkLauncher(com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager checkCaptureFraudForceManager, com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider ingoConfigurationProvider) {
        return (com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.checkcapture.di.IngoModule.INSTANCE.provideIngoSdkLauncher(checkCaptureFraudForceManager, ingoConfigurationProvider));
    }
}
