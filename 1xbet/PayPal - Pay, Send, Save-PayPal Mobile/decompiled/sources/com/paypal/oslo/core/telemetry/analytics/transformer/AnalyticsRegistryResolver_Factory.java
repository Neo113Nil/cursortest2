package com.paypal.oslo.core.telemetry.analytics.transformer;

/* loaded from: classes10.dex */
public final class AnalyticsRegistryResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> {
    private final dagger.internal.Provider<java.util.Map<com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry>> getHighResolutionOutputSizeshNQ4ISI;

    private AnalyticsRegistryResolver_Factory(dagger.internal.Provider<java.util.Map<com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry>> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver_Factory create(dagger.internal.Provider<java.util.Map<com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry>> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver newInstance(java.util.Map<com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry> map) {
        return new com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver(map);
    }
}
