package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class SubflowIntentMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper_Factory();

        private InstanceHolder() {
        }
    }
}
