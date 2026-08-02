package com.paypal.oslo.feature.identity.llslogin.data.repository;

/* loaded from: classes12.dex */
public final class LLSEligibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getHighSpeedVideoFpsRangesFor;

    private LLSEligibilityRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> provider3) {
        return new com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl newInstance(com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker deviceLockCapabilityChecker) {
        return new com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl(deviceBindingTokenStorage, featureGate, deviceLockCapabilityChecker);
    }
}
