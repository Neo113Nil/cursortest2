package com.paypal.oslo.core.telemetry.vendors.fpti.transformer;

/* loaded from: classes5.dex */
public final class FPTIContextRegistryModule_ProvideUIContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideUIContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUIContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUIContextTransformerFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUIContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule.INSTANCE.provideUIContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUIContextTransformerFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule_ProvideUIContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
