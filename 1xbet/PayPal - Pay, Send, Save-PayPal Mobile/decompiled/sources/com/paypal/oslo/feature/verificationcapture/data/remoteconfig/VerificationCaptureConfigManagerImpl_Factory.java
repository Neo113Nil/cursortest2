package com.paypal.oslo.feature.verificationcapture.data.remoteconfig;

/* loaded from: classes15.dex */
public final class VerificationCaptureConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.remoteconfig.VerificationCaptureConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private VerificationCaptureConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.remoteconfig.VerificationCaptureConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.data.remoteconfig.VerificationCaptureConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.data.remoteconfig.VerificationCaptureConfigManagerImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.remoteconfig.VerificationCaptureConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.verificationcapture.data.remoteconfig.VerificationCaptureConfigManagerImpl(featureGate, dynamicConfiguration);
    }
}
