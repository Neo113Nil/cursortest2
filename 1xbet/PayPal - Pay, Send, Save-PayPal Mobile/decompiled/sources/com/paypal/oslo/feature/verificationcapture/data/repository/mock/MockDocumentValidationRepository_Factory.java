package com.paypal.oslo.feature.verificationcapture.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockDocumentValidationRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.verificationcapture.data.repository.mock.MockDocumentValidationRepository_Factory();

        private InstanceHolder() {
        }
    }
}
