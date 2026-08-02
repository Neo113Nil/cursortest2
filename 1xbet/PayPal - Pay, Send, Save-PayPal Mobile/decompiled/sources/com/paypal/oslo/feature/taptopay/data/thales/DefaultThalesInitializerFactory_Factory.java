package com.paypal.oslo.feature.taptopay.data.thales;

/* loaded from: classes15.dex */
public final class DefaultThalesInitializerFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory_Factory create() {
        return com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory newInstance() {
        return new com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory_Factory();

        private InstanceHolder() {
        }
    }
}
