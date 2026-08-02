package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningUrls;", "", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;)V", "", "intent", "buildProvisioningUrl", "(Ljava/lang/String;)Ljava/lang/String;", "url", "", "isCompletionUrl", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoEopProvisioningUrls {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public CryptoEopProvisioningUrls(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = webEnvironmentProvider;
    }

    public final java.lang.String buildProvisioningUrl(java.lang.String intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        java.lang.String webBaseUrl = this.getHighResolutionOutputSizeshNQ4ISI.getWebBaseUrl();
        java.lang.String str = kotlin.text.StringsKt.equals(intent, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, true) ? "crypto,crypto_pro" : "crypto";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/mep/dashboard?identityVerificationStatus=COMPLETE");
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("{\"returnUrl\":\"");
        sb2.append(obj);
        sb2.append("\",\"cancelUrl\":\"");
        sb2.append(obj);
        sb2.append("\"}");
        java.lang.String encode = java.net.URLEncoder.encode(sb2.toString(), "UTF-8");
        kotlin.io.encoding.Base64 urlSafe = kotlin.io.encoding.Base64.INSTANCE.getUrlSafe();
        kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
        byte[] bytes = encode.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String trimEnd = kotlin.text.StringsKt.trimEnd(kotlin.io.encoding.Base64.encode$default(urlSafe, bytes, 0, 0, 6, null), '=');
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(webBaseUrl);
        sb3.append("/unifiedonboarding/after-login?products=");
        sb3.append(str);
        sb3.append("&flowId=");
        sb3.append(trimEnd);
        return sb3.toString();
    }

    public final boolean isCompletionUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String str = url;
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/mep/dashboard", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "identityVerificationStatus=COMPLETE", false, 2, (java.lang.Object) null);
    }
}
