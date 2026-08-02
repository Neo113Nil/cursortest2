package com.plaid.internal;

/* loaded from: classes16.dex */
public final class B7 {
    public static final java.lang.String a(android.webkit.WebResourceError webResourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceError, "");
        int errorCode = webResourceError.getErrorCode();
        java.lang.CharSequence description = webResourceError.getDescription();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebResourceError { Error Code: ");
        sb.append(errorCode);
        sb.append(" ; Description: ");
        sb.append((java.lang.Object) description);
        sb.append(" }");
        return sb.toString();
    }
}
