package com.paypal.oslo.feature.p2p.ui.transfer.mapper;

/* loaded from: classes13.dex */
public final class RecommendedContactToP2PContactItemMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper_Factory();

        private InstanceHolder() {
        }
    }
}
