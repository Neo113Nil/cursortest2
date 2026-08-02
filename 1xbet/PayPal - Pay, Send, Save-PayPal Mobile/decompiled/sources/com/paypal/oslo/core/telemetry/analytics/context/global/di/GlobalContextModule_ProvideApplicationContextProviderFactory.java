package com.paypal.oslo.core.telemetry.analytics.context.global.di;

/* loaded from: classes10.dex */
public final class GlobalContextModule_ProvideApplicationContextProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider> getHighResolutionOutputSizeshNQ4ISI;

    private GlobalContextModule_ProvideApplicationContextProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider get() {
        return provideApplicationContextProvider(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideApplicationContextProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule_ProvideApplicationContextProviderFactory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideApplicationContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider applicationContextProvider) {
        return (com.paypal.oslo.core.telemetry.analytics.context.ContextProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule.INSTANCE.provideApplicationContextProvider(applicationContextProvider));
    }
}
