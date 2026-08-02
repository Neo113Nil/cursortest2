package com.paypal.oslo.core.network.http.cronet;

/* loaded from: classes10.dex */
public final class CronetBuilderProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl_Factory create() {
        return com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl newInstance() {
        return new com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
