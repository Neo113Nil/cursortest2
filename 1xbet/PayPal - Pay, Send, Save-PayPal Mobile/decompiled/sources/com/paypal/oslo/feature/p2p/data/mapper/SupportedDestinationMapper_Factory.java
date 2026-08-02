package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class SupportedDestinationMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper_Factory();

        private InstanceHolder() {
        }
    }
}
