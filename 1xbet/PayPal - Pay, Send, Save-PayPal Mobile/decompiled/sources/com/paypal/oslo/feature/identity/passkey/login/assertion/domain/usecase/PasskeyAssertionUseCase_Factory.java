package com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase;

/* loaded from: classes12.dex */
public final class PasskeyAssertionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.repository.PasskeyAssertionRepository> getHighSpeedVideoFpsRangesFor;

    private PasskeyAssertionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.repository.PasskeyAssertionRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.repository.PasskeyAssertionRepository> provider) {
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase newInstance(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.repository.PasskeyAssertionRepository passkeyAssertionRepository) {
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase(passkeyAssertionRepository);
    }
}
