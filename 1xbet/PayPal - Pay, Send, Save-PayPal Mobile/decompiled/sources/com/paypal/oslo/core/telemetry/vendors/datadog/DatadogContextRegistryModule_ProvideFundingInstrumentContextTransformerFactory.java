package com.paypal.oslo.core.telemetry.vendors.datadog;

/* loaded from: classes5.dex */
public final class DatadogContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideFundingInstrumentContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideFundingInstrumentContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule.INSTANCE.provideFundingInstrumentContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
