package com.paypal.oslo.feature.userprofile.ui.utils.email;

/* loaded from: classes15.dex */
public final class EmailValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator_Factory create() {
        return com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator newInstance() {
        return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator_Factory();

        private InstanceHolder() {
        }
    }
}
