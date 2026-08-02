package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes5.dex */
public final class AdobeContextRegistryModule_ProvideRegistryFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> getHighSpeedVideoFpsRanges;

    private AdobeContextRegistryModule_ProvideRegistryFactory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry get() {
        return provideRegistry(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideRegistryFactory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> provider2) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideRegistryFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry provideRegistry(java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> set, com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate transformationDelegate) {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule.INSTANCE.provideRegistry(set, transformationDelegate));
    }
}
