package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class P2PMoneyFragmentMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper_Factory();

        private InstanceHolder() {
        }
    }
}
