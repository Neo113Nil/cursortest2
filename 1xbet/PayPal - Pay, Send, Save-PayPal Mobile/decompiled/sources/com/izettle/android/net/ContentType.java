package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/izettle/android/net/ContentType;", "", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "<init>", "(Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/Charset;", "getCharset", "()Ljava/nio/charset/Charset;", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "getMimeType", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentType {
    private final java.nio.charset.Charset charset;
    private final java.lang.String displayName;
    private final java.lang.String mimeType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.net.ContentType.Companion INSTANCE = new com.izettle.android.net.ContentType.Companion(null);
    private static final com.izettle.android.net.ContentType TEXT_PLAIN_UTF_8 = new com.izettle.android.net.ContentType("text/plain", kotlin.text.Charsets.UTF_8);
    private static final com.izettle.android.net.ContentType APPLICATION_JSON = new com.izettle.android.net.ContentType("application/json", kotlin.text.Charsets.UTF_8);
    private static final com.izettle.android.net.ContentType FORM_URL_ENCODED = new com.izettle.android.net.ContentType("application/x-www-form-urlencoded", kotlin.text.Charsets.UTF_8);
    private static final com.izettle.android.net.ContentType APPLICATION_OCTET_STREAM = new com.izettle.android.net.ContentType(com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM, null);

    public ContentType(java.lang.String str, java.nio.charset.Charset charset) {
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.mimeType = str;
        this.charset = charset;
        if (charset != null) {
            java.lang.String displayName = charset.displayName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("; charset=\"");
            sb.append(displayName);
            sb.append("\"");
            str2 = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        this.displayName = sb2.toString();
    }

    public final java.nio.charset.Charset getCharset() {
        return this.charset;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/izettle/android/net/ContentType$Companion;", "", "<init>", "()V", "Lcom/izettle/android/net/ContentType;", "APPLICATION_JSON", "Lcom/izettle/android/net/ContentType;", "getAPPLICATION_JSON", "()Lcom/izettle/android/net/ContentType;", "APPLICATION_OCTET_STREAM", "getAPPLICATION_OCTET_STREAM", "FORM_URL_ENCODED", "getFORM_URL_ENCODED", "TEXT_PLAIN_UTF_8", "getTEXT_PLAIN_UTF_8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.izettle.android.net.ContentType getTEXT_PLAIN_UTF_8() {
            return com.izettle.android.net.ContentType.TEXT_PLAIN_UTF_8;
        }

        public final com.izettle.android.net.ContentType getAPPLICATION_JSON() {
            return com.izettle.android.net.ContentType.APPLICATION_JSON;
        }

        public final com.izettle.android.net.ContentType getFORM_URL_ENCODED() {
            return com.izettle.android.net.ContentType.FORM_URL_ENCODED;
        }

        public final com.izettle.android.net.ContentType getAPPLICATION_OCTET_STREAM() {
            return com.izettle.android.net.ContentType.APPLICATION_OCTET_STREAM;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
