package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes5.dex */
public final class AdobeContextRegistryModule_ProvideAppContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideAppContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideAppContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideAppContextTransformerFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideAppContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule.INSTANCE.provideAppContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideAppContextTransformerFactory getHighSpeedVideoSizes = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideAppContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
