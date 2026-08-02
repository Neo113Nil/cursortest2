package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/app/config/AdsConfigurationProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/app/environment/Environment;", "appEnvironment", "", "prodApiKey", "stagingApiKey", "Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", "provideConfiguration", "(Lcom/paypal/oslo/app/environment/Environment;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdsConfigurationProvider {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AdsConfigurationProvider() {
    }

    public final com.paypal.oslo.feature.ads.api.config.AdsConfiguration provideConfiguration(com.paypal.oslo.app.environment.Environment appEnvironment, java.lang.String prodApiKey, java.lang.String stagingApiKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEnvironment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prodApiKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stagingApiKey, "");
        if (appEnvironment instanceof com.paypal.oslo.app.environment.Environment.Production) {
            return com.paypal.oslo.feature.ads.api.config.AdsConfiguration.INSTANCE.production(prodApiKey);
        }
        if (appEnvironment instanceof com.paypal.oslo.app.environment.Environment.Stage) {
            return com.paypal.oslo.feature.ads.api.config.AdsConfiguration.INSTANCE.staging(stagingApiKey);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
