package com.paypal.oslo.core.network.http.cronet;

/* loaded from: classes10.dex */
public final class CronetInterceptorFactoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl_Factory create() {
        return com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl newInstance() {
        return new com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
