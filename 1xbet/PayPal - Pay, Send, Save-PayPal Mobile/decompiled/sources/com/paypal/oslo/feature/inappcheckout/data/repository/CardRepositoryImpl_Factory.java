package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class CardRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
