package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class StartLivenessCheckUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository> getHighSpeedVideoSizes;

    private StartLivenessCheckUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository> provider) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase newInstance(com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository) {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase(livenessRepository);
    }
}
