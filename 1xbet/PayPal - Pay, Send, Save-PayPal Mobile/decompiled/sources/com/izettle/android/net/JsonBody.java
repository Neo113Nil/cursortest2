package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/izettle/android/net/JsonBody;", "Lcom/izettle/android/net/RequestBody;", "Ljava/io/InputStream;", "p0", "Lcom/izettle/android/net/ContentType;", "p1", "", "p2", "<init>", "(Ljava/io/InputStream;Lcom/izettle/android/net/ContentType;J)V", "contentLength", "J", "getContentLength", "()J", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonBody implements com.izettle.android.net.RequestBody {
    private final long contentLength;
    private final com.izettle.android.net.ContentType contentType;
    private final java.io.InputStream inputStream;

    private JsonBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j) {
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
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/izettle/android/net/JsonBody$Builder;", "Lcom/izettle/android/net/RequestBody$Builder;", "<init>", "()V", "Lcom/izettle/android/net/JsonBody;", "build", "()Lcom/izettle/android/net/JsonBody;", "", "entity", "(Ljava/lang/Object;)Lcom/izettle/android/net/JsonBody$Builder;", "Ljava/lang/Object;", "getEntity", "()Ljava/lang/Object;", "setEntity", "(Ljava/lang/Object;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements com.izettle.android.net.RequestBody.Builder {
        private java.lang.Object entity;

        public final java.lang.Object getEntity() {
            return this.entity;
        }

        public final void setEntity(java.lang.Object obj) {
            this.entity = obj;
        }

        public final com.izettle.android.net.JsonBody.Builder entity(java.lang.Object entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            this.entity = entity;
            return this;
        }

        @Override // com.izettle.android.net.RequestBody.Builder
        public final com.izettle.android.net.JsonBody build() {
            java.lang.Object obj = this.entity;
            if (obj == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            byte[] bytes = com.izettle.android.serialization.JsonSerializer.INSTANCE.serializeToString(obj).getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new com.izettle.android.net.JsonBody(new java.io.ByteArrayInputStream(bytes), com.izettle.android.net.ContentType.INSTANCE.getAPPLICATION_JSON(), bytes.length, null);
        }
    }

    public /* synthetic */ JsonBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, contentType, j);
    }
}
