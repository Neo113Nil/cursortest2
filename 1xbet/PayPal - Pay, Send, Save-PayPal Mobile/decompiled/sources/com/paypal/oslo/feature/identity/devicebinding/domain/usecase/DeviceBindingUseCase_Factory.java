package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

/* loaded from: classes12.dex */
public final class DeviceBindingUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DeviceBindingUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository> provider2) {
        return new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase newInstance(com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository deviceBindingRepository, com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository deviceBindingEligibilityRepository) {
        return new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase(deviceBindingRepository, deviceBindingEligibilityRepository);
    }
}
