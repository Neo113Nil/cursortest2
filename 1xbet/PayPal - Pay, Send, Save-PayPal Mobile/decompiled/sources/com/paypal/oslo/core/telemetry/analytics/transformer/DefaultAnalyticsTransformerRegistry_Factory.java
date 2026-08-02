package com.paypal.oslo.core.telemetry.analytics.transformer;

/* loaded from: classes10.dex */
public final class DefaultAnalyticsTransformerRegistry_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> getHighSpeedVideoFpsRangesFor;

    private DefaultAnalyticsTransformerRegistry_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> provider2) {
        return new com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry newInstance(java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> set, com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate transformationDelegate) {
        return new com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry(set, transformationDelegate);
    }
}
