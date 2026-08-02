package com.paypal.oslo.core.telemetry.analytics.context.global.di;

/* loaded from: classes10.dex */
public final class GlobalContextModule_ProvideSessionLaunchSourceContextProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider> getHighResolutionOutputSizeshNQ4ISI;

    private GlobalContextModule_ProvideSessionLaunchSourceContextProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider get() {
        return provideSessionLaunchSourceContextProvider(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideSessionLaunchSourceContextProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideSessionLaunchSourceContextProviderFactory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideSessionLaunchSourceContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider sessionLaunchTrafficSourceContextProvider) {
        return (com.paypal.oslo.core.telemetry.analytics.context.ContextProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule.INSTANCE.provideSessionLaunchSourceContextProvider(sessionLaunchTrafficSourceContextProvider));
    }
}
