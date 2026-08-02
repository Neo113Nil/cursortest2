package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes5.dex */
public final class AdobeContextRegistryModule_ProvideMetadataContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideMetadataContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideMetadataContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideMetadataContextTransformerFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideMetadataContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule.INSTANCE.provideMetadataContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideMetadataContextTransformerFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule_ProvideMetadataContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
