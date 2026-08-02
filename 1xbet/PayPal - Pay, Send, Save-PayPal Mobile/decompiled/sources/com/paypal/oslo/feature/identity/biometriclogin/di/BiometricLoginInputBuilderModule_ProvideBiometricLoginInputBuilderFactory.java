package com.paypal.oslo.feature.identity.biometriclogin.di;

/* loaded from: classes5.dex */
public final class BiometricLoginInputBuilderModule_ProvideBiometricLoginInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return provideBiometricLoginInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginInputBuilderModule_ProvideBiometricLoginInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginInputBuilderModule_ProvideBiometricLoginInputBuilderFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideBiometricLoginInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginInputBuilderModule.INSTANCE.provideBiometricLoginInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginInputBuilderModule_ProvideBiometricLoginInputBuilderFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginInputBuilderModule_ProvideBiometricLoginInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
