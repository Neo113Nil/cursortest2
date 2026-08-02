package com.paypal.oslo.feature.identity.otplogin.verifyotp.di;

/* loaded from: classes5.dex */
public final class OtpVerificationModule_ProvideOtpInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return provideOtpInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.otplogin.verifyotp.di.OtpVerificationModule_ProvideOtpInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.otplogin.verifyotp.di.OtpVerificationModule_ProvideOtpInputBuilderFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideOtpInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.otplogin.verifyotp.di.OtpVerificationModule.INSTANCE.provideOtpInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.otplogin.verifyotp.di.OtpVerificationModule_ProvideOtpInputBuilderFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.otplogin.verifyotp.di.OtpVerificationModule_ProvideOtpInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
