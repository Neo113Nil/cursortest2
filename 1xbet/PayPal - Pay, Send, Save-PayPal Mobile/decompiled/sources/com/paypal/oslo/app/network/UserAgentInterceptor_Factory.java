package com.paypal.oslo.app.network;

/* loaded from: classes10.dex */
public final class UserAgentInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.app.network.UserAgentInterceptor> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.network.UserAgentInterceptor get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.network.UserAgentInterceptor_Factory create() {
        return com.paypal.oslo.app.network.UserAgentInterceptor_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.app.network.UserAgentInterceptor newInstance() {
        return new com.paypal.oslo.app.network.UserAgentInterceptor();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.network.UserAgentInterceptor_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.app.network.UserAgentInterceptor_Factory();

        private InstanceHolder() {
        }
    }
}
