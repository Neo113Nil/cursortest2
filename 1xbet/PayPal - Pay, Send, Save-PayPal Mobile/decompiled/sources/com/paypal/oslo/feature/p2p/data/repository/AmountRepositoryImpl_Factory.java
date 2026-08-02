package com.paypal.oslo.feature.p2p.data.repository;

/* loaded from: classes13.dex */
public final class AmountRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
