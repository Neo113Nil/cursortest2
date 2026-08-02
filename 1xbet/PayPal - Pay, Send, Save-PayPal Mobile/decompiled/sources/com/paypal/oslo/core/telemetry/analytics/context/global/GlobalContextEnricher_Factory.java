package com.paypal.oslo.core.telemetry.analytics.context.global;

/* loaded from: classes10.dex */
public final class GlobalContextEnricher_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider>> getHighSpeedVideoSizes;

    private GlobalContextEnricher_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider>> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider>> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher newInstance(java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> set) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher(set);
    }
}
