package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/config/ZettleConfigProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/core/auth/PayPalUatTokenProviderSuspending;", "uatTokenProvider", "Lcom/zettle/sdk/Configuration;", "provideConfiguration", "(Landroid/content/Context;Lcom/zettle/sdk/core/auth/PayPalUatTokenProviderSuspending;)Lcom/zettle/sdk/Configuration;", "", "getHighSpeedVideoFpsRanges", "Z", "", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "ZettleConfigurationSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ZettleConfigProvider {
    public static final int $stable = 0;
    public static final java.lang.String PROD_CLIENT_ID = "AXlbHzHUVdNRD8Aq7BZGLlkh-HRQsOe3EgnMwEZI77SGaEjp2lWepKrt34SpaijsiHF2ck7l8uqsFcD3";
    public static final java.lang.String STAGING_CLIENT_ID = "B_Ah7Qi2jfJRHa_05GSv1LoLKeQpvtyzvm4l93QA2bgPxeAwAEbBneKeA1DbUg7YuOxWS9G_6-TUBFl7VE";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    public ZettleConfigProvider() {
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges ? STAGING_CLIENT_ID : PROD_CLIENT_ID;
    }

    public final com.zettle.sdk.Configuration provideConfiguration(android.content.Context context, final com.zettle.sdk.core.auth.PayPalUatTokenProviderSuspending uatTokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uatTokenProvider, "");
        com.zettle.sdk.Configuration configuration = new com.zettle.sdk.Configuration(context, com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider.ZettleConfigurationSettings.INSTANCE);
        configuration.addFeature(com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.INSTANCE);
        if (this.getHighSpeedVideoFpsRanges) {
            com.zettle.sdk.ConfigurationExtKt.setStagingEnvironment(configuration);
        }
        configuration.auth(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider.$r8$lambda$hVLAs0dFBd8ug3JlPNWraNEWd7E(com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider.this, uatTokenProvider, (com.zettle.sdk.AuthConfig) obj);
            }
        });
        return configuration;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/config/ZettleConfigProvider$ZettleConfigurationSettings;", "Lcom/zettle/sdk/ConfigurationSettings;", "<init>", "()V", "", "isUatMode", "Z", "()Z", "isSimplifiedUserConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ZettleConfigurationSettings implements com.zettle.sdk.ConfigurationSettings {
        public static final int $stable = 0;
        private static final boolean isSimplifiedUserConfig = false;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider.ZettleConfigurationSettings INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider.ZettleConfigurationSettings();
        private static final boolean isUatMode = true;

        private ZettleConfigurationSettings() {
        }

        @Override // com.zettle.sdk.ConfigurationSettings
        /* renamed from: isUatMode */
        public final boolean getGetHighSpeedVideoSizes() {
            return isUatMode;
        }

        @Override // com.zettle.sdk.ConfigurationSettings
        /* renamed from: isSimplifiedUserConfig */
        public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
            return isSimplifiedUserConfig;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hVLAs0dFBd8ug3JlPNWraNEWd7E(com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider zettleConfigProvider, com.zettle.sdk.core.auth.PayPalUatTokenProviderSuspending payPalUatTokenProviderSuspending, com.zettle.sdk.AuthConfig authConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "");
        authConfig.setClientId(zettleConfigProvider.getHighResolutionOutputSizeshNQ4ISI);
        authConfig.setRedirectUrl("");
        authConfig.setTokenProvider(payPalUatTokenProviderSuspending);
        return kotlin.Unit.INSTANCE;
    }
}
