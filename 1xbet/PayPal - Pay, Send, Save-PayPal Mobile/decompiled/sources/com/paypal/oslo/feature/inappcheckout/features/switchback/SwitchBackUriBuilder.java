package com.paypal.oslo.feature.inappcheckout.features.switchback;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUriBuilder;", "", "<init>", "()V", "", "bridgeUrl", "Landroid/net/Uri;", "webViewUri", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/WebIntegrationSwitchBackHash;", "status", "buttonSessionId", "buildBridgeUri", "(Ljava/lang/String;Landroid/net/Uri;Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/WebIntegrationSwitchBackHash;Ljava/lang/String;)Landroid/net/Uri;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "merchantIntegration", "switchBackUri", "buildMerchantReturnUri", "(Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;Landroid/net/Uri;Landroid/net/Uri;Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/WebIntegrationSwitchBackHash;Ljava/lang/String;)Landroid/net/Uri;", "", "currentTimeMillis", "()J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public class SwitchBackUriBuilder {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SwitchBackUriBuilder() {
    }

    public final android.net.Uri buildMerchantReturnUri(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration merchantIntegration, android.net.Uri webViewUri, android.net.Uri switchBackUri, com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash status, java.lang.String buttonSessionId) {
        java.util.Map<java.lang.String, java.lang.String> queryParameters;
        java.util.Map mutableMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantIntegration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchBackUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        if (!(merchantIntegration instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.WebApp)) {
            if (!(merchantIntegration instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.NativeApp)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (webViewUri == null) {
                webViewUri = switchBackUri;
            }
            android.net.Uri.Builder buildUpon = webViewUri.buildUpon();
            java.lang.String str = buttonSessionId;
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                buildUpon.appendQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.ButtonSessionId.getValue(), buttonSessionId);
            }
            buildUpon.appendQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.SwitchInitiatedTime.getValue(), java.lang.String.valueOf(currentTimeMillis()));
            android.net.Uri build = buildUpon.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }
        java.lang.String encodedFragment = switchBackUri.getEncodedFragment();
        if (encodedFragment == null) {
            encodedFragment = "";
        }
        java.util.Map removeAll = (webViewUri == null || (queryParameters = com.paypal.oslo.feature.inappcheckout.extensions.UriExtensionKt.getQueryParameters(webViewUri)) == null || (mutableMap = kotlin.collections.MapsKt.toMutableMap(queryParameters)) == null) ? null : com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.removeAll(mutableMap, com.paypal.oslo.feature.inappcheckout.extensions.UriExtensionKt.getQueryParameters(switchBackUri));
        if (removeAll == null) {
            removeAll = kotlin.collections.MapsKt.emptyMap();
        }
        java.lang.String encodedQuery = com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.getEncodedQuery(com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.putIfNotBlank(com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.putIfNotBlank(kotlin.collections.MapsKt.toMutableMap(removeAll), com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.ButtonSessionId, buttonSessionId), com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.SwitchInitiatedTime, java.lang.String.valueOf(currentTimeMillis())));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(status.getValue());
        if (encodedQuery.length() > 0) {
            sb.append("&");
            sb.append(encodedQuery);
        }
        if (encodedFragment.length() > 0) {
            sb.append("&");
            sb.append(encodedFragment);
        }
        android.net.Uri build2 = switchBackUri.buildUpon().encodedFragment(sb.toString()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        return build2;
    }

    protected long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    public final android.net.Uri buildBridgeUri(java.lang.String bridgeUrl, android.net.Uri webViewUri, com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash status, java.lang.String buttonSessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridgeUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        android.net.Uri parse = android.net.Uri.parse(bridgeUrl);
        java.util.Map<java.lang.String, java.lang.String> queryParameters = webViewUri != null ? com.paypal.oslo.feature.inappcheckout.extensions.UriExtensionKt.getQueryParameters(webViewUri) : null;
        if (queryParameters == null) {
            queryParameters = kotlin.collections.MapsKt.emptyMap();
        }
        java.lang.String encodedQuery = com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.getEncodedQuery(com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.putIfNotBlank(com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.putIfNotBlank(kotlin.collections.MapsKt.toMutableMap(queryParameters), com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.ButtonSessionId, buttonSessionId), com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.SwitchInitiatedTime, java.lang.String.valueOf(currentTimeMillis())));
        java.lang.String encodedFragment = webViewUri != null ? webViewUri.getEncodedFragment() : null;
        if (encodedFragment == null) {
            encodedFragment = "";
        }
        java.lang.String encodedFragment2 = parse.getEncodedFragment();
        if (encodedFragment2 == null) {
            encodedFragment2 = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(status.getValue());
        if (encodedQuery.length() > 0) {
            sb.append("&");
            sb.append(encodedQuery);
        }
        if (encodedFragment.length() > 0) {
            sb.append("&");
            sb.append(encodedFragment);
        }
        if (encodedFragment2.length() > 0) {
            sb.append("&");
            sb.append(encodedFragment2);
        }
        android.net.Uri build = parse.buildUpon().encodedFragment(sb.toString()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
