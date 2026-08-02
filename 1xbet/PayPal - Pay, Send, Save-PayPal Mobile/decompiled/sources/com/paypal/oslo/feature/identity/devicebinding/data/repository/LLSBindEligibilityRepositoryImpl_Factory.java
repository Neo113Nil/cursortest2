package com.paypal.oslo.feature.identity.devicebinding.data.repository;

/* loaded from: classes12.dex */
public final class LLSBindEligibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.data.repository.LLSBindEligibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private LLSBindEligibilityRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.data.repository.LLSBindEligibilityRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.repository.LLSBindEligibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> provider2) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.repository.LLSBindEligibilityRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.repository.LLSBindEligibilityRepositoryImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker deviceLockCapabilityChecker) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.repository.LLSBindEligibilityRepositoryImpl(featureGate, deviceLockCapabilityChecker);
    }
}
