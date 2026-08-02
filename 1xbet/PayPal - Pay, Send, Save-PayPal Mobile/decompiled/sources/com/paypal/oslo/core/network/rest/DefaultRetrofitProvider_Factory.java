package com.paypal.oslo.core.network.rest;

/* loaded from: classes10.dex */
public final class DefaultRetrofitProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.rest.DefaultRetrofitProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.rest.DefaultRetrofitProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.network.rest.DefaultRetrofitProvider_Factory create() {
        return com.paypal.oslo.core.network.rest.DefaultRetrofitProvider_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.network.rest.DefaultRetrofitProvider newInstance() {
        return new com.paypal.oslo.core.network.rest.DefaultRetrofitProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.network.rest.DefaultRetrofitProvider_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.network.rest.DefaultRetrofitProvider_Factory();

        private InstanceHolder() {
        }
    }
}
