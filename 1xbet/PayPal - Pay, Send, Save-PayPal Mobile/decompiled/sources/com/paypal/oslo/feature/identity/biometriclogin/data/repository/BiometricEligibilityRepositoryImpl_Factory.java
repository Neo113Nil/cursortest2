package com.paypal.oslo.feature.identity.biometriclogin.data.repository;

/* loaded from: classes12.dex */
public final class BiometricEligibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getHighSpeedVideoFpsRanges;

    private BiometricEligibilityRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker> provider3) {
        return new com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl newInstance(com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker biometricCapabilityChecker) {
        return new com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl(deviceBindingTokenStorage, featureGate, biometricCapabilityChecker);
    }
}
