package com.paypal.oslo.feature.identity.challenges.shared.domain.usecase;

/* loaded from: classes12.dex */
public final class ValidateChallengeBaseUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.repository.ValidateChallengeRepository> getHighSpeedVideoFpsRanges;

    private ValidateChallengeBaseUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.repository.ValidateChallengeRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.repository.ValidateChallengeRepository> provider) {
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase newInstance(com.paypal.oslo.feature.identity.challenges.shared.domain.repository.ValidateChallengeRepository validateChallengeRepository) {
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase(validateChallengeRepository);
    }
}
