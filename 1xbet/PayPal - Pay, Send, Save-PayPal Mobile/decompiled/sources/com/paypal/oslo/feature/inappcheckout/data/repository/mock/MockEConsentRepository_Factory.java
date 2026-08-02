package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockEConsentRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository_Factory();

        private InstanceHolder() {
        }
    }
}
