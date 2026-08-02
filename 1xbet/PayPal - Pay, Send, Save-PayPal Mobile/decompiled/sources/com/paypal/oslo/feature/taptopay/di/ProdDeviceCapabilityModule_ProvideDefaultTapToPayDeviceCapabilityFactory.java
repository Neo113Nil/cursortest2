package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ProdDeviceCapabilityModule_ProvideDefaultTapToPayDeviceCapabilityFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> Camera2StreamConfigurationMap;

    private ProdDeviceCapabilityModule_ProvideDefaultTapToPayDeviceCapabilityFactory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability get() {
        return provideDefaultTapToPayDeviceCapability(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ProdDeviceCapabilityModule_ProvideDefaultTapToPayDeviceCapabilityFactory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability> provider) {
        return new com.paypal.oslo.feature.taptopay.di.ProdDeviceCapabilityModule_ProvideDefaultTapToPayDeviceCapabilityFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability provideDefaultTapToPayDeviceCapability(com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability tapToPayDeviceCapability) {
        return (com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.ProdDeviceCapabilityModule.INSTANCE.provideDefaultTapToPayDeviceCapability(tapToPayDeviceCapability));
    }
}
