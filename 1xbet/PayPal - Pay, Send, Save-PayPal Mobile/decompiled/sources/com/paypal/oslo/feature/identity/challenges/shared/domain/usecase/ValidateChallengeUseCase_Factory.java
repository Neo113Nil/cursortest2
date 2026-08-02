package com.paypal.oslo.feature.identity.challenges.shared.domain.usecase;

/* loaded from: classes12.dex */
public final class ValidateChallengeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase> getHighSpeedVideoFpsRangesFor;

    private ValidateChallengeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase> provider2) {
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase newInstance(com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase validateChallengeBaseUseCase) {
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase(loginUseCase, validateChallengeBaseUseCase);
    }
}
