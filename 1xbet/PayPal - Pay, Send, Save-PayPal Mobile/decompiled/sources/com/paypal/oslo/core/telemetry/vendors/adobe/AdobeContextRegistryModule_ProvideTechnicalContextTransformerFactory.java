package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes5.dex */
public final class AdobeContextRegistryModule_ProvideTechnicalContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideTechnicalContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideTechnicalContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideTechnicalContextTransformerFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTechnicalContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule.INSTANCE.provideTechnicalContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideTechnicalContextTransformerFactory getHighSpeedVideoSizes = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideTechnicalContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
