package com.paypal.oslo.core.telemetry.vendors.datadog;

/* loaded from: classes5.dex */
public final class DatadogContextRegistryModule_ProvideTransitionTypeContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideTransitionTypeContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideTransitionTypeContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideTransitionTypeContextTransformerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTransitionTypeContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule.INSTANCE.provideTransitionTypeContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideTransitionTypeContextTransformerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideTransitionTypeContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
