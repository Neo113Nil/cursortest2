package com.paypal.oslo.feature.verificationcapture.manager;

/* loaded from: classes15.dex */
public final class VerificationCaptureFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.manager.VerificationCaptureFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighResolutionOutputSizeshNQ4ISI;

    private VerificationCaptureFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.manager.VerificationCaptureFeatureManager get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.manager.VerificationCaptureFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.verificationcapture.manager.VerificationCaptureFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.manager.VerificationCaptureFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.verificationcapture.manager.VerificationCaptureFeatureManager(featureGate);
    }
}
