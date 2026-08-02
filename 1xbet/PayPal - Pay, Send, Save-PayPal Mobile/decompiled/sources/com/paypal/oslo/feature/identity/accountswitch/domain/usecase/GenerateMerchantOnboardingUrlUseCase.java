package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GenerateMerchantOnboardingUrlUseCase;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;", "pkceGenerator", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "authenticationConfig", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;)V", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/MerchantOnboardingUrlResult;", "invoke", "()Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/MerchantOnboardingUrlResult;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GenerateMerchantOnboardingUrlUseCase {

    @java.lang.Deprecated
    public static final java.lang.String PARAM_CODE_CHALLENGE = "codeChallenge";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_CODE_CHALLENGE_METHOD = "codeChallengeMethod";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_COUNTRY = "country.x";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_FAILED_PARAM = "failedParam";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_LINK_ACCOUNT = "linkAccount";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_LOCALE = "locale.x";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_NATIVE_CLIENT_ID = "nativeClientId";

    @java.lang.Deprecated
    public static final java.lang.String PARAM_RETURN_URI = "returnUri";

    @java.lang.Deprecated
    public static final java.lang.String PATH_ENTRY = "entry";

    @java.lang.Deprecated
    public static final java.lang.String PATH_UNIFIED_ONBOARDING = "unifiedonboarding";

    @java.lang.Deprecated
    public static final java.lang.String VALUE_COUNTRY = "US";

    @java.lang.Deprecated
    public static final java.lang.String VALUE_FAILED_PARAM = "failedBecause";

    @java.lang.Deprecated
    public static final java.lang.String VALUE_LINK_ACCOUNT = "true";

    @java.lang.Deprecated
    public static final java.lang.String VALUE_LOCALE = "en_US";

    @java.lang.Deprecated
    public static final java.lang.String VALUE_RETURN_URI = "/nativeReturnUri";
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.Companion Companion = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public GenerateMerchantOnboardingUrlUseCase(com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator pKCEGenerator, com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pKCEGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = pKCEGenerator;
        this.getHighSpeedVideoSizes = authenticationConfig;
        this.Camera2StreamConfigurationMap = webEnvironmentProvider;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GenerateMerchantOnboardingUrlUseCase$Companion;", "", "<init>", "()V", "", "PARAM_RETURN_URI", "Ljava/lang/String;", "PARAM_CODE_CHALLENGE", "PARAM_CODE_CHALLENGE_METHOD", "PARAM_NATIVE_CLIENT_ID", "PARAM_FAILED_PARAM", "PARAM_LINK_ACCOUNT", "PARAM_COUNTRY", "PARAM_LOCALE", "VALUE_RETURN_URI", "VALUE_FAILED_PARAM", "VALUE_LINK_ACCOUNT", "VALUE_COUNTRY", "VALUE_LOCALE", "PATH_UNIFIED_ONBOARDING", "PATH_ENTRY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.MerchantOnboardingUrlResult invoke() {
        com.paypal.oslo.feature.identity.shared.domain.model.PKCEPair generate = this.getHighResolutionOutputSizeshNQ4ISI.generate();
        java.lang.String webBaseUrl = this.Camera2StreamConfigurationMap.getWebBaseUrl();
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("returnUri", "/nativeReturnUri"), kotlin.TuplesKt.to(PARAM_CODE_CHALLENGE, generate.getChallenge()), kotlin.TuplesKt.to(PARAM_CODE_CHALLENGE_METHOD, generate.getMethod()), kotlin.TuplesKt.to(PARAM_NATIVE_CLIENT_ID, this.getHighSpeedVideoSizes.getFirstPartyClientId()), kotlin.TuplesKt.to(PARAM_FAILED_PARAM, "failedBecause"), kotlin.TuplesKt.to(PARAM_LINK_ACCOUNT, "true"), kotlin.TuplesKt.to("country.x", "US"), kotlin.TuplesKt.to("locale.x", "en_US"));
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("webBaseUrl", webBaseUrl);
        pairArr[1] = kotlin.TuplesKt.to(PARAM_CODE_CHALLENGE_METHOD, generate.getMethod());
        pairArr[2] = kotlin.TuplesKt.to("hasCodeChallenge", java.lang.String.valueOf(generate.getChallenge().length() > 0));
        com.paypal.android.logger.Logger.d$default(logger, "Generated merchant onboarding URL", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(webBaseUrl).buildUpon();
        buildUpon.appendPath(PATH_UNIFIED_ONBOARDING);
        buildUpon.appendPath(PATH_ENTRY);
        for (java.util.Map.Entry entry : mapOf.entrySet()) {
            buildUpon.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String obj = buildUpon.build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.MerchantOnboardingUrlResult(obj, generate.getVerifier());
    }
}
