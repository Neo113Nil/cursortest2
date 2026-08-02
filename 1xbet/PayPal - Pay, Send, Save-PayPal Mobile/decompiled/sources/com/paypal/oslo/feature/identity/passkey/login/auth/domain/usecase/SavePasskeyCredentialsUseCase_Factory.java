package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

/* loaded from: classes12.dex */
public final class SavePasskeyCredentialsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> getHighSpeedVideoFpsRangesFor;

    private SavePasskeyCredentialsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository> provider) {
        return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase newInstance(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase(rememberedLoginRepository);
    }
}
