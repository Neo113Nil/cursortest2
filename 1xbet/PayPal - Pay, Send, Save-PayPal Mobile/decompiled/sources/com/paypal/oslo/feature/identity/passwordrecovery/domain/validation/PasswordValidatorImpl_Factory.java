package com.paypal.oslo.feature.identity.passwordrecovery.domain.validation;

/* loaded from: classes13.dex */
public final class PasswordValidatorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl_Factory create() {
        return com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl newInstance() {
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl_Factory();

        private InstanceHolder() {
        }
    }
}
