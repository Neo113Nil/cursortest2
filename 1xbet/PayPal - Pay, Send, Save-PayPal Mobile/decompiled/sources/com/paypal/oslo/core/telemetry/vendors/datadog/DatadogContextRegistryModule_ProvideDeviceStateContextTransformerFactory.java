package com.paypal.oslo.core.telemetry.vendors.datadog;

/* loaded from: classes5.dex */
public final class DatadogContextRegistryModule_ProvideDeviceStateContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideDeviceStateContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideDeviceStateContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideDeviceStateContextTransformerFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideDeviceStateContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule.INSTANCE.provideDeviceStateContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideDeviceStateContextTransformerFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogContextRegistryModule_ProvideDeviceStateContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
