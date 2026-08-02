package com.paypal.oslo.feature.identity.passkey.login.auth.di;

/* loaded from: classes5.dex */
public final class PasskeyLoginModule_ProvidePasskeyInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return providePasskeyInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.passkey.login.auth.di.PasskeyLoginModule_ProvidePasskeyInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.passkey.login.auth.di.PasskeyLoginModule_ProvidePasskeyInputBuilderFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> providePasskeyInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.passkey.login.auth.di.PasskeyLoginModule.INSTANCE.providePasskeyInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passkey.login.auth.di.PasskeyLoginModule_ProvidePasskeyInputBuilderFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.passkey.login.auth.di.PasskeyLoginModule_ProvidePasskeyInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
