package com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource;

/* loaded from: classes12.dex */
public final class PasskeyCredentialDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource_Factory create() {
        return com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource newInstance() {
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.passkey.login.assertion.data.datasource.PasskeyCredentialDataSource_Factory();

        private InstanceHolder() {
        }
    }
}
