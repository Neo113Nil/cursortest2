package com.paypal.oslo.feature.p2p.domain.contacts;

/* loaded from: classes13.dex */
public final class ReceiverTypeResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver_Factory create() {
        return com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver newInstance() {
        return new com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver_Factory();

        private InstanceHolder() {
        }
    }
}
