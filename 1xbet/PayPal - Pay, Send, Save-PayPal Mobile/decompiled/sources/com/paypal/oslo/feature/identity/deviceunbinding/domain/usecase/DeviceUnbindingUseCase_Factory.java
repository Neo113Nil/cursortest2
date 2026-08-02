package com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase;

/* loaded from: classes12.dex */
public final class DeviceUnbindingUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceunbinding.domain.repository.DeviceUnbindingRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DeviceUnbindingUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceunbinding.domain.repository.DeviceUnbindingRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceunbinding.domain.repository.DeviceUnbindingRepository> provider) {
        return new com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase newInstance(com.paypal.oslo.feature.identity.deviceunbinding.domain.repository.DeviceUnbindingRepository deviceUnbindingRepository) {
        return new com.paypal.oslo.feature.identity.deviceunbinding.domain.usecase.DeviceUnbindingUseCase(deviceUnbindingRepository);
    }
}
