package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes5.dex */
public final class AdobeContextRegistryModule_ProvideUserContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideUserContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideUserContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideUserContextTransformerFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUserContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule.INSTANCE.provideUserContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideUserContextTransformerFactory getHighSpeedVideoSizes = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideUserContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
