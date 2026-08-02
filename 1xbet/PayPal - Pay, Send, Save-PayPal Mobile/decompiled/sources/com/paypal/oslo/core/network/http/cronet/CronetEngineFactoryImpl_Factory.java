package com.paypal.oslo.core.network.http.cronet;

/* loaded from: classes10.dex */
public final class CronetEngineFactoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider> getHighSpeedVideoFpsRanges;

    private CronetEngineFactoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider> provider) {
        return new com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl newInstance(com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider cronetBuilderProvider) {
        return new com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl(cronetBuilderProvider);
    }
}
