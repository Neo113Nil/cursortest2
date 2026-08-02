package com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase;

/* loaded from: classes12.dex */
public final class VerifySnaUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository> getHighSpeedVideoSizes;

    private VerifySnaUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider2) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase newInstance(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository snaVerificationRepository, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase(snaVerificationRepository, validateChallengeUseCase);
    }
}
