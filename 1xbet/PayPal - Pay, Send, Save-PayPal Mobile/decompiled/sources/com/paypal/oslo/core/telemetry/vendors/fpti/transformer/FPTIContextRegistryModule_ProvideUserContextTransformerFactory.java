package com.paypal.oslo.core.telemetry.vendors.fpti.transformer;

/* loaded from: classes5.dex */
public final class FPTIContextRegistryModule_ProvideUserContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideUserContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUserContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUserContextTransformerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUserContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule.INSTANCE.provideUserContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUserContextTransformerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUserContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
