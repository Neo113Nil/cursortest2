package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase;

/* loaded from: classes12.dex */
public final class PasskeyCreateChallengeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository> Camera2StreamConfigurationMap;

    private PasskeyCreateChallengeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase newInstance(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository passkeyCreateChallengeRepository) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase(passkeyCreateChallengeRepository);
    }
}
