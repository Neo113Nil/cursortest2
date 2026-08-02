package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/app/di/AdsConfigurationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "Lcom/paypal/oslo/app/config/AdsConfigurationProvider;", "configProvider", "Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", "provideAdsConfiguration", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;Lcom/paypal/oslo/app/config/AdsConfigurationProvider;)Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class AdsConfigurationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.di.AdsConfigurationModule INSTANCE = new com.paypal.oslo.app.di.AdsConfigurationModule();

    private AdsConfigurationModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.ads.api.config.AdsConfiguration provideAdsConfiguration(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider, com.paypal.oslo.app.config.AdsConfigurationProvider configProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configProvider, "");
        return configProvider.provideConfiguration(environmentProvider.getEnvironment(), com.paypal.oslo.app.SecretsAccessor.INSTANCE.paypalAdsApiKeyProd(), com.paypal.oslo.app.SecretsAccessor.INSTANCE.paypalAdsApiKeyStaging());
    }
}
