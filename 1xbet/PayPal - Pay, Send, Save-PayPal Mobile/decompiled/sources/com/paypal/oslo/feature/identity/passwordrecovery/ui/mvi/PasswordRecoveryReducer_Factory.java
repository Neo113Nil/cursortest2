package com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi;

/* loaded from: classes13.dex */
public final class PasswordRecoveryReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer_Factory create() {
        return com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer newInstance() {
        return new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer_Factory();

        private InstanceHolder() {
        }
    }
}
