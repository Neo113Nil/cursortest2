package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabWebBaseUrlProvider;", "", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "graphQlConfig", "<init>", "(Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;)V", "", "getWebBaseUrl", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IabWebBaseUrlProvider {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.graphql.config.GraphQlConfig getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public IabWebBaseUrlProvider(com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQlConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = graphQlConfig;
    }

    public final java.lang.String getWebBaseUrl() {
        java.lang.String baseUrl = this.getHighResolutionOutputSizeshNQ4ISI.getBaseUrl();
        java.lang.String str = baseUrl;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "paypal.com", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "stage", false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL;
        }
        java.net.URI uri = new java.net.URI(baseUrl);
        java.lang.String host = uri.getHost();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "");
        java.lang.String replaceFirst$default = kotlin.text.StringsKt.replaceFirst$default(host, "api.", "www.", false, 4, (java.lang.Object) null);
        java.lang.String scheme = uri.getScheme();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(scheme);
        sb.append("://");
        sb.append(replaceFirst$default);
        return sb.toString();
    }
}
