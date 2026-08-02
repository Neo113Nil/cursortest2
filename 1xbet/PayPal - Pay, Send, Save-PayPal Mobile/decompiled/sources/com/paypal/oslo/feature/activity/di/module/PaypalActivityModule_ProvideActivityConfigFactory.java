package com.paypal.oslo.feature.activity.di.module;

/* loaded from: classes10.dex */
public final class PaypalActivityModule_ProvideActivityConfigFactory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private PaypalActivityModule_ProvideActivityConfigFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig get() {
        return provideActivityConfig(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.di.module.PaypalActivityModule_ProvideActivityConfigFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.activity.di.module.PaypalActivityModule_ProvideActivityConfigFactory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig provideActivityConfig(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.module.PaypalActivityModule.INSTANCE.provideActivityConfig(appNavigator));
    }
}
