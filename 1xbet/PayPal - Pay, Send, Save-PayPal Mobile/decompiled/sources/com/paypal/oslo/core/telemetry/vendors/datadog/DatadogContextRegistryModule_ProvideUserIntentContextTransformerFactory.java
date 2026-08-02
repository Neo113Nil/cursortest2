package com.paypal.oslo.core.telemetry.vendors.datadog;

/* loaded from: classes5.dex */
public final class DatadogContextRegistryModule_ProvideUserIntentContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideUserIntentContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideUserIntentContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideUserIntentContextTransformerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUserIntentContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule.INSTANCE.provideUserIntentContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideUserIntentContextTransformerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideUserIntentContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
