package com.paypal.oslo.feature.verificationcapture.data.repository;

/* loaded from: classes15.dex */
public final class DocumentValidationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.data.repository.DocumentValidationRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
