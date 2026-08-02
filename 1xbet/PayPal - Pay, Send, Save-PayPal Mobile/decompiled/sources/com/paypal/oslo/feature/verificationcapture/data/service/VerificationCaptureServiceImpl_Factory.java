package com.paypal.oslo.feature.verificationcapture.data.service;

/* loaded from: classes15.dex */
public final class VerificationCaptureServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> getHighResolutionOutputSizeshNQ4ISI;

    private VerificationCaptureServiceImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        return new com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl(verificationCaptureRepository);
    }
}
