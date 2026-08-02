package com.paypal.oslo.feature.identity.passwordlogin.domain.validator;

/* loaded from: classes12.dex */
public final class PasswordValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator_Factory create() {
        return com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator newInstance() {
        return new com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator_Factory();

        private InstanceHolder() {
        }
    }
}
