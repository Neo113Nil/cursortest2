package com.paypal.oslo.feature.taptopay.domain.usecase.device;

/* loaded from: classes15.dex */
public final class IsNfcEnabledUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> getHighResolutionOutputSizeshNQ4ISI;

    private IsNfcEnabledUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase newInstance(com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability tapToPayDeviceCapability) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase(tapToPayDeviceCapability);
    }
}
