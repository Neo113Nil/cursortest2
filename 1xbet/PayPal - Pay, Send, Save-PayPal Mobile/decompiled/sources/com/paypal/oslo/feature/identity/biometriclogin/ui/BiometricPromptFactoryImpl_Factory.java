package com.paypal.oslo.feature.identity.biometriclogin.ui;

/* loaded from: classes12.dex */
public final class BiometricPromptFactoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl_Factory create() {
        return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl newInstance() {
        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
