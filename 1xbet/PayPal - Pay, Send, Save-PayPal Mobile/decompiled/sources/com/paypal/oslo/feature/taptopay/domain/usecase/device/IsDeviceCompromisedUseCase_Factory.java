package com.paypal.oslo.feature.taptopay.domain.usecase.device;

/* loaded from: classes15.dex */
public final class IsDeviceCompromisedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker> getHighSpeedVideoSizes;

    private IsDeviceCompromisedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker deviceIntegrityChecker) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase(deviceIntegrityChecker);
    }
}
