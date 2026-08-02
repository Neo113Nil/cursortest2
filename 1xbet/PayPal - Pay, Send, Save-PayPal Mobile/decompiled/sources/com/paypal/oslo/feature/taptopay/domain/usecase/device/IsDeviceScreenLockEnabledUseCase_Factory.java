package com.paypal.oslo.feature.taptopay.domain.usecase.device;

/* loaded from: classes15.dex */
public final class IsDeviceScreenLockEnabledUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> getHighSpeedVideoSizes;

    private IsDeviceScreenLockEnabledUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase newInstance(com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability tapToPayDeviceCapability) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase(tapToPayDeviceCapability);
    }
}
