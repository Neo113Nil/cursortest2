package com.paypal.oslo.core.telemetry.analytics.context.global.di;

/* loaded from: classes10.dex */
public final class GlobalContextModule_ProvideUserContextProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider> getHighSpeedVideoFpsRanges;

    private GlobalContextModule_ProvideUserContextProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider get() {
        return provideUserContextProvider(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideUserContextProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideUserContextProviderFactory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideUserContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider userContextProvider) {
        return (com.paypal.oslo.core.telemetry.analytics.context.ContextProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule.INSTANCE.provideUserContextProvider(userContextProvider));
    }
}
