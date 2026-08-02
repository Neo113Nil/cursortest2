package com.paypal.oslo.core.telemetry.vendors.datadog;

/* loaded from: classes5.dex */
public final class DatadogContextRegistryModule_ProvideNotificationContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideNotificationContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideNotificationContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideNotificationContextTransformerFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideNotificationContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule.INSTANCE.provideNotificationContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideNotificationContextTransformerFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideNotificationContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
