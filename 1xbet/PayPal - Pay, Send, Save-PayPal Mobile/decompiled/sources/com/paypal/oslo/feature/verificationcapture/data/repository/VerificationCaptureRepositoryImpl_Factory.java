package com.paypal.oslo.feature.verificationcapture.data.repository;

/* loaded from: classes15.dex */
public final class VerificationCaptureRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi> getHighSpeedVideoFpsRangesFor;

    private VerificationCaptureRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl newInstance(com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi documentUploadApi, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl(documentUploadApi, json);
    }
}
