package com.paypal.oslo.feature.dataprivacy.data.repository;

/* loaded from: classes12.dex */
public final class FakeUserAccountRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository_Factory create() {
        return com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository newInstance() {
        return new com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.dataprivacy.data.repository.FakeUserAccountRepository_Factory();

        private InstanceHolder() {
        }
    }
}
