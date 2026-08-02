package com.paypal.oslo.feature.checkcapture.ingo;

/* loaded from: classes11.dex */
public final class IngoConfigurationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager> getHighSpeedVideoFpsRanges;

    private IngoConfigurationProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager> provider) {
        return new com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider newInstance(com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager manager) {
        return new com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider(manager);
    }
}
