package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/izettle/android/net/TextBody;", "Lcom/izettle/android/net/RequestBody;", "Ljava/io/InputStream;", "p0", "Lcom/izettle/android/net/ContentType;", "p1", "", "p2", "<init>", "(Ljava/io/InputStream;Lcom/izettle/android/net/ContentType;J)V", "contentLength", "J", "getContentLength", "()J", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextBody implements com.izettle.android.net.RequestBody {
    private final long contentLength;
    private final com.izettle.android.net.ContentType contentType;
    private final java.io.InputStream inputStream;

    private TextBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j) {
        this.inputStream = inputStream;
        this.contentType = contentType;
        this.contentLength = j;
    }

    @Override // com.izettle.android.net.RequestBody
    public final java.io.InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // com.izettle.android.net.RequestBody
    public final com.izettle.android.net.ContentType getContentType() {
        return this.contentType;
    }

    @Override // com.izettle.android.net.RequestBody
    public final long getContentLength() {
        return this.contentLength;
    }

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/izettle/android/net/TextBody$Builder;", "Lcom/izettle/android/net/RequestBody$Builder;", "<init>", "()V", "Lcom/izettle/android/net/TextBody;", "build", "()Lcom/izettle/android/net/TextBody;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Ljava/nio/charset/Charset;", "getCharset", "()Ljava/nio/charset/Charset;", "setCharset", "(Ljava/nio/charset/Charset;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements com.izettle.android.net.RequestBody.Builder {
        private java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        private java.lang.String value;

        public final java.lang.String getValue() {
            return this.value;
        }

        public final void setValue(java.lang.String str) {
            this.value = str;
        }

        public final java.nio.charset.Charset getCharset() {
            return this.charset;
        }

        public final void setCharset(java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
            this.charset = charset;
        }

        @Override // com.izettle.android.net.RequestBody.Builder
        public final com.izettle.android.net.TextBody build() {
            java.lang.String str = this.value;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            byte[] bytes = str.getBytes(this.charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new com.izettle.android.net.TextBody(new java.io.ByteArrayInputStream(bytes), new com.izettle.android.net.ContentType("text/plain", this.charset), str.length(), null);
        }
    }

    public /* synthetic */ TextBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, contentType, j);
    }
}
