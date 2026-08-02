package com.paypal.oslo.feature.taptopay.domain.api;

/* loaded from: classes15.dex */
public final class IsTapToPayEnabledImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.api.IsTapToPayEnabledImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> getHighSpeedVideoSizes;

    private IsTapToPayEnabledImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.api.IsTapToPayEnabledImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.IsTapToPayEnabledImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase> provider3) {
        return new com.paypal.oslo.feature.taptopay.domain.api.IsTapToPayEnabledImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.domain.api.IsTapToPayEnabledImpl newInstance(com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability tapToPayDeviceCapability, com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase isDeviceCompromisedUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.api.IsTapToPayEnabledImpl(tapToPayDeviceCapability, manager, isDeviceCompromisedUseCase);
    }
}
