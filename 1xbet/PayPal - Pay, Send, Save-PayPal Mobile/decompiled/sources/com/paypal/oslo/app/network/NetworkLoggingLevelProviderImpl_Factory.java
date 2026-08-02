package com.paypal.oslo.app.network;

/* loaded from: classes10.dex */
public final class NetworkLoggingLevelProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl_Factory create() {
        return com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl newInstance() {
        return new com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.app.network.NetworkLoggingLevelProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
