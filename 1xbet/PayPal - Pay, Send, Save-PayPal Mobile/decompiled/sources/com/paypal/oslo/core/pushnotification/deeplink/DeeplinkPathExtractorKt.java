package com.paypal.oslo.core.pushnotification.deeplink;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003"}, d2 = {"", "deeplink", "classifyDeeplinkScheme", "(Ljava/lang/String;)Ljava/lang/String;", "extractDeeplinkPath"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeeplinkPathExtractorKt {
    public static final java.lang.String classifyDeeplinkScheme(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.startsWith$default(str, "https://", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str, "http://", false, 2, (java.lang.Object) null)) {
            return "https";
        }
        return kotlin.text.StringsKt.startsWith$default(str, "paypal://", false, 2, (java.lang.Object) null) ? "paypal" : kotlin.text.StringsKt.startsWith$default(str, "paypal-internal://", false, 2, (java.lang.Object) null) ? com.paypal.oslo.feature.notificationcenter.data.impl.DeeplinkValidatorImpl.SCHEME_PAYPAL_INTERNAL : kotlin.text.StringsKt.startsWith$default(str, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null) ? "path_only" : "other";
    }

    public static final java.lang.String extractDeeplinkPath(java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String scheme = parse.getScheme();
        java.lang.String host = parse.getHost();
        java.lang.String path = parse.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.String encodedQuery = parse.getEncodedQuery();
        java.lang.String concat = encodedQuery != null ? com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION.concat(java.lang.String.valueOf(encodedQuery)) : null;
        java.lang.String str3 = concat != null ? concat : "";
        if (!kotlin.jvm.internal.Intrinsics.areEqual(scheme, "http") && !kotlin.jvm.internal.Intrinsics.areEqual(scheme, "https") && (str2 = host) != null && str2.length() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(host);
            sb.append(path);
            path = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(path);
        sb2.append(str3);
        return sb2.toString();
    }
}
