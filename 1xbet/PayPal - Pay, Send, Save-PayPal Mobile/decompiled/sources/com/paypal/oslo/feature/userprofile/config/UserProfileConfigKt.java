package com.paypal.oslo.feature.userprofile.config;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "baseUrl", "Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "getConfigForUrl", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserProfileConfigKt {
    public static final com.paypal.oslo.feature.userprofile.config.UserProfileConfig getConfigForUrl(java.lang.String str) {
        com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "UserProfileConfig: Determining config from baseUrl", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("baseUrl", str)), null, 4, null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "https://api-m.paypal.com") || kotlin.text.StringsKt.startsWith$default(str, "https://api-m.paypal.com", false, 2, (java.lang.Object) null)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "UserProfileConfig: Using production configuration", null, null, 6, null);
            userProfileConfig = new com.paypal.oslo.feature.userprofile.config.UserProfileConfig(com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "UserProfileConfig: Using stage configuration", null, null, 6, null);
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(str, com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.HTTPS_PREFIX, "https://www.", false, 4, (java.lang.Object) null);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "UserProfileConfig: Transformed API URL to web URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("apiBaseUrl", str), kotlin.TuplesKt.to("webBaseUrl", replace$default)), null, 4, null);
            userProfileConfig = new com.paypal.oslo.feature.userprofile.config.UserProfileConfig(replace$default);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "UserProfileConfig: Config created", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("webBaseUrl", userProfileConfig.getWebBaseUrl())), null, 4, null);
        return userProfileConfig;
    }
}
