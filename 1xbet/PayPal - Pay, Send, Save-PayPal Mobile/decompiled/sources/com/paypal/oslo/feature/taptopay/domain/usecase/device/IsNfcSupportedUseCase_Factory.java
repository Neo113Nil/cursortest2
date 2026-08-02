package com.paypal.oslo.feature.taptopay.domain.usecase.device;

/* loaded from: classes15.dex */
public final class IsNfcSupportedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> Camera2StreamConfigurationMap;

    private IsNfcSupportedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase newInstance(com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability tapToPayDeviceCapability) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase(tapToPayDeviceCapability);
    }
}
