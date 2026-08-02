package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001cB7\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017"}, d2 = {"Lcom/apollographql/apollo/api/DefaultUpload;", "Lcom/apollographql/apollo/api/Upload;", "Lkotlin/Function1;", "Lokio/BufferedSink;", "", "writeTo", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "contentLength", "fileName", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;JLjava/lang/String;)V", "sink", "(Lokio/BufferedSink;)V", "Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "newBuilder", "()Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "J", "getContentLength", "()J", "getFileName", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultUpload implements com.apollographql.apollo.api.Upload {
    private final long contentLength;
    private final java.lang.String contentType;
    private final java.lang.String fileName;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<okio.BufferedSink, kotlin.Unit> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultUpload(kotlin.jvm.functions.Function1<? super okio.BufferedSink, kotlin.Unit> function1, java.lang.String str, long j, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = function1;
        this.contentType = str;
        this.contentLength = j;
        this.fileName = str2;
    }

    @Override // com.apollographql.apollo.api.Upload
    public final java.lang.String getContentType() {
        return this.contentType;
    }

    @Override // com.apollographql.apollo.api.Upload
    public final long getContentLength() {
        return this.contentLength;
    }

    @Override // com.apollographql.apollo.api.Upload
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    @Override // com.apollographql.apollo.api.Upload
    public final void writeTo(okio.BufferedSink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        this.Camera2StreamConfigurationMap.invoke(sink);
    }

    public final com.apollographql.apollo.api.DefaultUpload.Builder newBuilder() {
        com.apollographql.apollo.api.DefaultUpload.Builder contentLength = new com.apollographql.apollo.api.DefaultUpload.Builder().content(this.Camera2StreamConfigurationMap).contentType(getContentType()).contentLength(getContentLength());
        if (getFileName() != null) {
            contentLength.fileName(getFileName());
        }
        return contentLength;
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000eJ\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001d"}, d2 = {"Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "", "<init>", "()V", "Lkotlin/Function1;", "Lokio/BufferedSink;", "", "writeTo", "content", "(Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "", "(Ljava/lang/String;)Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "Lokio/ByteString;", "byteString", "(Lokio/ByteString;)Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "", "byteArray", "([B)Lcom/apollographql/apollo/api/DefaultUpload$Builder;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "contentLength", "(J)Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "fileName", "Lcom/apollographql/apollo/api/DefaultUpload;", "build", "()Lcom/apollographql/apollo/api/DefaultUpload;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private long getHighSpeedVideoSizes = -1;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function1<? super okio.BufferedSink, kotlin.Unit> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        public final com.apollographql.apollo.api.DefaultUpload.Builder content(kotlin.jvm.functions.Function1<? super okio.BufferedSink, kotlin.Unit> writeTo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeTo, "");
            if (this.Camera2StreamConfigurationMap != null) {
                throw new java.lang.IllegalStateException("content() can only be called once".toString());
            }
            this.Camera2StreamConfigurationMap = writeTo;
            return this;
        }

        public final com.apollographql.apollo.api.DefaultUpload.Builder content(final java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            if (this.Camera2StreamConfigurationMap != null) {
                throw new java.lang.IllegalStateException("content() can only be called once".toString());
            }
            this.Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.api.DefaultUpload$Builder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.apollographql.apollo.api.DefaultUpload.Builder.$r8$lambda$0uKyiyzpzQtP4BSpJq1iEGWHq4A(content, (okio.BufferedSink) obj);
                }
            };
            this.getHighSpeedVideoSizes = okio.Utf8.size$default(content, 0, 0, 3, null);
            return this;
        }

        public final com.apollographql.apollo.api.DefaultUpload.Builder content(final okio.ByteString byteString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
            if (this.Camera2StreamConfigurationMap != null) {
                throw new java.lang.IllegalStateException("content() can only be called once".toString());
            }
            this.Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.api.DefaultUpload$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.apollographql.apollo.api.DefaultUpload.Builder.m9949$r8$lambda$dwBX6bYtMhdyHbWi3twrGwEwZA(okio.ByteString.this, (okio.BufferedSink) obj);
                }
            };
            this.getHighSpeedVideoSizes = byteString.size();
            return this;
        }

        public final com.apollographql.apollo.api.DefaultUpload.Builder content(final byte[] byteArray) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "");
            if (this.Camera2StreamConfigurationMap != null) {
                throw new java.lang.IllegalStateException("content() can only be called once".toString());
            }
            this.Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.api.DefaultUpload$Builder$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.apollographql.apollo.api.DefaultUpload.Builder.$r8$lambda$u4vxknXHr84xuJBcUvdnAGFZYbA(byteArray, (okio.BufferedSink) obj);
                }
            };
            this.getHighSpeedVideoSizes = byteArray.length;
            return this;
        }

        public final com.apollographql.apollo.api.DefaultUpload.Builder contentType(java.lang.String contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            this.getHighSpeedVideoFpsRanges = contentType;
            return this;
        }

        public final com.apollographql.apollo.api.DefaultUpload.Builder contentLength(long contentLength) {
            this.getHighSpeedVideoSizes = contentLength;
            return this;
        }

        public final com.apollographql.apollo.api.DefaultUpload.Builder fileName(java.lang.String fileName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            this.getHighSpeedVideoFpsRangesFor = fileName;
            return this;
        }

        public final com.apollographql.apollo.api.DefaultUpload build() {
            kotlin.jvm.functions.Function1<? super okio.BufferedSink, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
            if (function1 == null) {
                throw new java.lang.IllegalStateException("DefaultUpload content is missing".toString());
            }
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str == null) {
                str = com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
            }
            return new com.apollographql.apollo.api.DefaultUpload(function1, str, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$0uKyiyzpzQtP4BSpJq1iEGWHq4A(java.lang.String str, okio.BufferedSink bufferedSink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
            bufferedSink.writeUtf8(str);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$dwBX6bYtMhdyHbW-i3twrGwEwZA, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9949$r8$lambda$dwBX6bYtMhdyHbWi3twrGwEwZA(okio.ByteString byteString, okio.BufferedSink bufferedSink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
            bufferedSink.write(byteString);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$u4vxknXHr84xuJBcUvdnAGFZYbA(byte[] bArr, okio.BufferedSink bufferedSink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
            bufferedSink.write(bArr);
            return kotlin.Unit.INSTANCE;
        }
    }
}
