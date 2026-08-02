package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/net/Uri;", "zettleEOPBaseUrl", "()Landroid/net/Uri;", "", "baseUrl", "getExternalHelpCenterUrl", "(Ljava/lang/String;)Landroid/net/Uri;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExternalUrlHelperKt {
    public static final android.net.Uri zettleEOPBaseUrl() {
        android.net.Uri destinationAsPayPalUri = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.utils.DeeplinkConstantsKt.destinationAsPayPalUri("");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n        {\n            \"returnUrl\": \"");
        sb.append(destinationAsPayPalUri);
        sb.append("\",\n            \"skipDonePage\": true,\n            \"skipGetStartedPage\": true\n        }\n    ");
        java.lang.String trimIndent = kotlin.text.StringsKt.trimIndent(sb.toString());
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = trimIndent.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        android.net.Uri build = android.net.Uri.parse("https://www.paypal.com/unifiedonboarding/after-login").buildUpon().appendQueryParameter(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Products, "ZETTLE_TAP_TO_PAY").appendQueryParameter(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, android.util.Base64.encodeToString(bytes, 2)).appendQueryParameter("origin", "CONSUMER_TTP").build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static final android.net.Uri getExternalHelpCenterUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.net.Uri build = android.net.Uri.parse(str).buildUpon().appendPath("us").appendPath("cshelp").appendPath("contact-us").build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
