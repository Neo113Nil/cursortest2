package com.paypal.oslo.feature.identity.devicebinding.data.repository;

/* loaded from: classes12.dex */
public final class DeviceBindingEligibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingEligibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DeviceBindingEligibilityRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingEligibilityRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingEligibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository> provider2) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingEligibilityRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingEligibilityRepositoryImpl newInstance(com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository biometricBindEligibilityRepository, com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository lLSBindEligibilityRepository) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingEligibilityRepositoryImpl(biometricBindEligibilityRepository, lLSBindEligibilityRepository);
    }
}
