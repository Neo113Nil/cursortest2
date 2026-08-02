package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class PostTransferDisclosureMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper_Factory();

        private InstanceHolder() {
        }
    }
}
