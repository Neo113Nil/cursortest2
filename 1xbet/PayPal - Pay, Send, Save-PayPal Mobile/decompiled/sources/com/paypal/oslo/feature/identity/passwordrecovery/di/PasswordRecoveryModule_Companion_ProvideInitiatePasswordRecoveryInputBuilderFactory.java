package com.paypal.oslo.feature.identity.passwordrecovery.di;

/* loaded from: classes5.dex */
public final class PasswordRecoveryModule_Companion_ProvideInitiatePasswordRecoveryInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return provideInitiatePasswordRecoveryInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule_Companion_ProvideInitiatePasswordRecoveryInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule_Companion_ProvideInitiatePasswordRecoveryInputBuilderFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideInitiatePasswordRecoveryInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule.INSTANCE.provideInitiatePasswordRecoveryInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule_Companion_ProvideInitiatePasswordRecoveryInputBuilderFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule_Companion_ProvideInitiatePasswordRecoveryInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
