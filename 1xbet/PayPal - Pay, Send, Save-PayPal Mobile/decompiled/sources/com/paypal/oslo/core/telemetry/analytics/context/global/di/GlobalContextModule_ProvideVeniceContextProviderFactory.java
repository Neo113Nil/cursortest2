package com.paypal.oslo.core.telemetry.analytics.context.global.di;

/* loaded from: classes10.dex */
public final class GlobalContextModule_ProvideVeniceContextProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider> getHighSpeedVideoFpsRanges;

    private GlobalContextModule_ProvideVeniceContextProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider get() {
        return provideVeniceContextProvider(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideVeniceContextProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideVeniceContextProviderFactory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideVeniceContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider veniceContextProvider) {
        return (com.paypal.oslo.core.telemetry.analytics.context.ContextProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule.INSTANCE.provideVeniceContextProvider(veniceContextProvider));
    }
}
