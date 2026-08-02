package com.paypal.oslo.app.network;

/* loaded from: classes10.dex */
public final class ChuckerInterceptorProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.network.ChuckerInterceptorProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.network.ChuckerInterceptorProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.network.ChuckerInterceptorProvider_Factory create() {
        return com.paypal.oslo.app.network.ChuckerInterceptorProvider_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.app.network.ChuckerInterceptorProvider newInstance() {
        return new com.paypal.oslo.app.network.ChuckerInterceptorProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.network.ChuckerInterceptorProvider_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.app.network.ChuckerInterceptorProvider_Factory();

        private InstanceHolder() {
        }
    }
}
