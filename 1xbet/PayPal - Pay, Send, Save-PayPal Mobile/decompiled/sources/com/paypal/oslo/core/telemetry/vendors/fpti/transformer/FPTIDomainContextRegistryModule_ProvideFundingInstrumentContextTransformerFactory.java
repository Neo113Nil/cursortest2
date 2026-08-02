package com.paypal.oslo.core.telemetry.vendors.fpti.transformer;

/* loaded from: classes5.dex */
public final class FPTIDomainContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideFundingInstrumentContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideFundingInstrumentContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule.INSTANCE.provideFundingInstrumentContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule_ProvideFundingInstrumentContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
