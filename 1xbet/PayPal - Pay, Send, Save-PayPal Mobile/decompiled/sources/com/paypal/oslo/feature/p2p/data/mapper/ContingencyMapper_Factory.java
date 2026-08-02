package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class ContingencyMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper_Factory();

        private InstanceHolder() {
        }
    }
}
