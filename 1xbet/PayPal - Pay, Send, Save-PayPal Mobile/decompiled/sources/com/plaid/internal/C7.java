package com.plaid.internal;

/* loaded from: classes16.dex */
public final class C7 {
    public static final java.lang.String a(android.webkit.WebResourceResponse webResourceResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceResponse, "");
        java.lang.String mimeType = webResourceResponse.getMimeType();
        java.lang.String encoding = webResourceResponse.getEncoding();
        int statusCode = webResourceResponse.getStatusCode();
        java.lang.String reasonPhrase = webResourceResponse.getReasonPhrase();
        java.util.Map<java.lang.String, java.lang.String> responseHeaders = webResourceResponse.getResponseHeaders();
        java.io.InputStream data = webResourceResponse.getData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebResourceResponse{, MimeType='");
        sb.append(mimeType);
        sb.append("', Encoding='");
        sb.append(encoding);
        sb.append("', StatusCode=");
        sb.append(statusCode);
        sb.append(", ReasonPhrase='");
        sb.append(reasonPhrase);
        sb.append("', ResponseHeaders=");
        sb.append(responseHeaders);
        sb.append(", data=");
        sb.append(data);
        sb.append("}");
        return sb.toString();
    }
}
