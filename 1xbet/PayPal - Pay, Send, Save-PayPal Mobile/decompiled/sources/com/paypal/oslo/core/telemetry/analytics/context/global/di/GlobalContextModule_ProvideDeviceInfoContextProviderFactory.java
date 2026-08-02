package com.paypal.oslo.core.telemetry.analytics.context.global.di;

/* loaded from: classes10.dex */
public final class GlobalContextModule_ProvideDeviceInfoContextProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider> getHighSpeedVideoFpsRangesFor;

    private GlobalContextModule_ProvideDeviceInfoContextProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider get() {
        return provideDeviceInfoContextProvider(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideDeviceInfoContextProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideDeviceInfoContextProviderFactory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideDeviceInfoContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider deviceInfoContextProvider) {
        return (com.paypal.oslo.core.telemetry.analytics.context.ContextProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule.INSTANCE.provideDeviceInfoContextProvider(deviceInfoContextProvider));
    }
}
