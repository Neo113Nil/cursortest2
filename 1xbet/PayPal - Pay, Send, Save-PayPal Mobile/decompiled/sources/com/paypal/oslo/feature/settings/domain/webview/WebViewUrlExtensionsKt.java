package com.paypal.oslo.feature.settings.domain.webview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "", "getWebViewUrl", "(Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WebViewUrlExtensionsKt {
    public static final java.lang.String getWebViewUrl(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigConfig, "");
        com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment environment = remoteConfigConfig.getEnvironment();
        if (kotlin.jvm.internal.Intrinsics.areEqual(environment, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Production.INSTANCE)) {
            return com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(environment, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Development.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String baseUrl = remoteConfigConfig.getBaseUrl();
        return kotlin.text.StringsKt.startsWith$default(baseUrl, com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.HTTPS_PREFIX, false, 2, (java.lang.Object) null) ? kotlin.text.StringsKt.replace$default(baseUrl, com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.HTTPS_PREFIX, "https://www.", false, 4, (java.lang.Object) null) : baseUrl;
    }
}
