package com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase;

/* loaded from: classes12.dex */
public final class PasskeyLoginChallengeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.repository.PasskeyLoginChallengeRepository> getHighSpeedVideoFpsRanges;

    private PasskeyLoginChallengeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.repository.PasskeyLoginChallengeRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.repository.PasskeyLoginChallengeRepository> provider) {
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase newInstance(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.repository.PasskeyLoginChallengeRepository passkeyLoginChallengeRepository) {
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase(passkeyLoginChallengeRepository);
    }
}
