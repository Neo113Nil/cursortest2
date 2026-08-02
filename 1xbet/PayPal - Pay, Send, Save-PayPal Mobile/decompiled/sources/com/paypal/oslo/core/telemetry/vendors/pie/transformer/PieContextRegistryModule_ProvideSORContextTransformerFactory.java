package com.paypal.oslo.core.telemetry.vendors.pie.transformer;

/* loaded from: classes5.dex */
public final class PieContextRegistryModule_ProvideSORContextTransformerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> get() {
        return provideSORContextTransformer();
    }

    public static com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule_ProvideSORContextTransformerFactory create() {
        return com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule_ProvideSORContextTransformerFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideSORContextTransformer() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule.INSTANCE.provideSORContextTransformer());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule_ProvideSORContextTransformerFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule_ProvideSORContextTransformerFactory();

        private InstanceHolder() {
        }
    }
}
