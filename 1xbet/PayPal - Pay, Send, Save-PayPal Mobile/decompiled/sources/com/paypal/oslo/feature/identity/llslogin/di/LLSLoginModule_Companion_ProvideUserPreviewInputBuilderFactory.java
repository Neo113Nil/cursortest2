package com.paypal.oslo.feature.identity.llslogin.di;

/* loaded from: classes5.dex */
public final class LLSLoginModule_Companion_ProvideUserPreviewInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return provideUserPreviewInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule_Companion_ProvideUserPreviewInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule_Companion_ProvideUserPreviewInputBuilderFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideUserPreviewInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule.INSTANCE.provideUserPreviewInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule_Companion_ProvideUserPreviewInputBuilderFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.llslogin.di.LLSLoginModule_Companion_ProvideUserPreviewInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
