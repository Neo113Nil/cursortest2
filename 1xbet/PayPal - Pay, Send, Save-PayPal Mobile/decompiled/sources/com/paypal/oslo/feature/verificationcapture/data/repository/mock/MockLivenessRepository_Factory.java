package com.paypal.oslo.feature.verificationcapture.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockLivenessRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockLivenessRepository_Factory();

        private InstanceHolder() {
        }
    }
}
