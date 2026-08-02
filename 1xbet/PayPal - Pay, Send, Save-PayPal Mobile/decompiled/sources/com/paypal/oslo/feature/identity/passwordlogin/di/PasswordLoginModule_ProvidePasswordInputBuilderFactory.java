package com.paypal.oslo.feature.identity.passwordlogin.di;

/* loaded from: classes5.dex */
public final class PasswordLoginModule_ProvidePasswordInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return providePasswordInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.passwordlogin.di.PasswordLoginModule_ProvidePasswordInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.passwordlogin.di.PasswordLoginModule_ProvidePasswordInputBuilderFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> providePasswordInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.passwordlogin.di.PasswordLoginModule.INSTANCE.providePasswordInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passwordlogin.di.PasswordLoginModule_ProvidePasswordInputBuilderFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.passwordlogin.di.PasswordLoginModule_ProvidePasswordInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
