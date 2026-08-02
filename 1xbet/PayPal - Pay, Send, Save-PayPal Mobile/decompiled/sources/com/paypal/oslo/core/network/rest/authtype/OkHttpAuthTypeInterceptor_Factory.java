package com.paypal.oslo.core.network.rest.authtype;

/* loaded from: classes10.dex */
public final class OkHttpAuthTypeInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor_Factory create() {
        return com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor newInstance() {
        return new com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.network.rest.authtype.OkHttpAuthTypeInterceptor_Factory();

        private InstanceHolder() {
        }
    }
}
