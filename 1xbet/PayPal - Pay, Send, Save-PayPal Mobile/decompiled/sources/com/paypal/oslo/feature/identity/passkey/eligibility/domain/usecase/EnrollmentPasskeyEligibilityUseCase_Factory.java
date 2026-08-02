package com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase;

/* loaded from: classes12.dex */
public final class EnrollmentPasskeyEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> getHighSpeedVideoSizes;

    private EnrollmentPasskeyEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider2) {
        return new com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase newInstance(com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        return new com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase(systemPasskeyEligibilityUseCase, rememberedLoginRepository);
    }
}
