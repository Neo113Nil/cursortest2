package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/izettle/android/net/FormUrlEncodedBody;", "Lcom/izettle/android/net/RequestBody;", "Ljava/io/InputStream;", "p0", "Lcom/izettle/android/net/ContentType;", "p1", "", "p2", "<init>", "(Ljava/io/InputStream;Lcom/izettle/android/net/ContentType;J)V", "contentLength", "J", "getContentLength", "()J", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FormUrlEncodedBody implements com.izettle.android.net.RequestBody {
    private final long contentLength;
    private final com.izettle.android.net.ContentType contentType;
    private final java.io.InputStream inputStream;

    private FormUrlEncodedBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j) {
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
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\f\u001a\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/izettle/android/net/FormUrlEncodedBody$Builder;", "Lcom/izettle/android/net/RequestBody$Builder;", "<init>", "()V", "Lcom/izettle/android/net/FormUrlEncodedBody;", "build", "()Lcom/izettle/android/net/FormUrlEncodedBody;", "Lkotlin/Function1;", "Lcom/izettle/android/net/Field$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "field", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/FormUrlEncodedBody$Builder;", "", "", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements com.izettle.android.net.RequestBody.Builder {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

        public final com.izettle.android.net.FormUrlEncodedBody.Builder field(kotlin.jvm.functions.Function1<? super com.izettle.android.net.Field.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.izettle.android.net.Field.Builder builder = new com.izettle.android.net.Field.Builder();
            block.invoke(builder);
            com.izettle.android.net.Field build = builder.build();
            this.getHighSpeedVideoFpsRanges.put(build.getName(), build.getValue());
            return this;
        }

        @Override // com.izettle.android.net.RequestBody.Builder
        public final com.izettle.android.net.FormUrlEncodedBody build() {
            byte[] bytes = kotlin.collections.CollectionsKt.joinToString$default(this.getHighSpeedVideoFpsRanges.entrySet(), "&", null, null, 0, null, new kotlin.jvm.functions.Function1<java.util.Map.Entry<java.lang.String, java.lang.Object>, java.lang.CharSequence>() { // from class: com.izettle.android.net.FormUrlEncodedBody$Builder$build$bodyBytes$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.CharSequence invoke(java.util.Map.Entry<java.lang.String, java.lang.Object> entry) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
                    java.lang.String key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(key);
                    sb.append("=");
                    sb.append(value);
                    return sb.toString();
                }
            }, 30, null).getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new com.izettle.android.net.FormUrlEncodedBody(new java.io.ByteArrayInputStream(bytes), com.izettle.android.net.ContentType.INSTANCE.getFORM_URL_ENCODED(), bytes.length, null);
        }
    }

    public /* synthetic */ FormUrlEncodedBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, contentType, j);
    }
}
