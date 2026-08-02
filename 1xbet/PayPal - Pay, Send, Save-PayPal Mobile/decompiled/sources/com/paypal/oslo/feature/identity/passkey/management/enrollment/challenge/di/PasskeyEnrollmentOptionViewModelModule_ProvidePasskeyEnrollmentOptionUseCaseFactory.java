package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.di;

/* loaded from: classes12.dex */
public final class PasskeyEnrollmentOptionViewModelModule_ProvidePasskeyEnrollmentOptionUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository> getHighSpeedVideoSizes;

    private PasskeyEnrollmentOptionViewModelModule_ProvidePasskeyEnrollmentOptionUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase get() {
        return providePasskeyEnrollmentOptionUseCase(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.di.PasskeyEnrollmentOptionViewModelModule_ProvidePasskeyEnrollmentOptionUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.di.PasskeyEnrollmentOptionViewModelModule_ProvidePasskeyEnrollmentOptionUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase providePasskeyEnrollmentOptionUseCase(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository passkeyCreateChallengeRepository) {
        return (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.di.PasskeyEnrollmentOptionViewModelModule.INSTANCE.providePasskeyEnrollmentOptionUseCase(passkeyCreateChallengeRepository));
    }
}
