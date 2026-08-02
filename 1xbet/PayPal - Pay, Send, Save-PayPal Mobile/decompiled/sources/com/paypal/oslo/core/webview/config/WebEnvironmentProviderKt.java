package com.paypal.oslo.core.webview.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "", "urlOrPath", "resolveWebUrl", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebEnvironmentProviderKt {
    public static final java.lang.String resolveWebUrl(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        if (kotlin.text.StringsKt.isBlank(str2)) {
            return null;
        }
        if (kotlin.text.StringsKt.startsWith$default(str, "https://", false, 2, (java.lang.Object) null)) {
            return str;
        }
        if (new kotlin.text.Regex("^[a-zA-Z][a-zA-Z0-9+.-]*:").containsMatchIn(str2)) {
            return null;
        }
        java.lang.String trimEnd = kotlin.text.StringsKt.trimEnd(webEnvironmentProvider.getWebBaseUrl(), kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        java.lang.String trimStart = kotlin.text.StringsKt.trimStart(str, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(trimEnd);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(trimStart);
        return sb.toString();
    }
}
