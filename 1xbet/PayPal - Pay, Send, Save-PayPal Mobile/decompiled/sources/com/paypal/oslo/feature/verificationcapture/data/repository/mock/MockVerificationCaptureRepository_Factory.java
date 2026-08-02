package com.paypal.oslo.feature.verificationcapture.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockVerificationCaptureRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockVerificationCaptureRepository_Factory();

        private InstanceHolder() {
        }
    }
}
