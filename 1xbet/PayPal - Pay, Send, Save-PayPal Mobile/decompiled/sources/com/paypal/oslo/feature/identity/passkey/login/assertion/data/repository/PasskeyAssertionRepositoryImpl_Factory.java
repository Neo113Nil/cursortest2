package com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository;

/* loaded from: classes12.dex */
public final class PasskeyAssertionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource> Camera2StreamConfigurationMap;

    private PasskeyAssertionRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource> provider) {
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl newInstance(com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource passkeyCredentialDataSource) {
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl(passkeyCredentialDataSource);
    }
}
