package com.paypal.oslo.core.telemetry.vendors.fpti.transformer;

/* loaded from: classes5.dex */
public final class FPTIContextRegistryModule_ProvideRegistryFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> getHighSpeedVideoFpsRanges;

    private FPTIContextRegistryModule_ProvideRegistryFactory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry get() {
        return provideRegistry(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideRegistryFactory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>>> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> provider2) {
        return new com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideRegistryFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry provideRegistry(java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> set, com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate transformationDelegate) {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule.INSTANCE.provideRegistry(set, transformationDelegate));
    }
}
