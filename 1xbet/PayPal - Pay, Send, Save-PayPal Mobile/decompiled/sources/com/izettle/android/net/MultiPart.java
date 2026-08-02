package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0018B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/izettle/android/net/MultiPart;", "", "Ljava/io/InputStream;", "p0", "", "p1", "Lcom/izettle/android/net/MultiPartType;", "p2", "", "p3", "<init>", "(Ljava/io/InputStream;JLcom/izettle/android/net/MultiPartType;Ljava/lang/String;)V", "contentLength", "J", "getContentLength", "()J", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "mediaType", "Ljava/lang/String;", "getMediaType", "()Ljava/lang/String;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MultiPart {
    private final long contentLength;
    private final java.io.InputStream inputStream;
    private final java.lang.String mediaType;

    private MultiPart(java.io.InputStream inputStream, long j, com.izettle.android.net.MultiPartType multiPartType, java.lang.String str) {
        this.inputStream = inputStream;
        this.contentLength = j;
        java.lang.String str2 = multiPartType.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("multipart/");
        sb.append(str2);
        sb.append("; boundary=\"");
        sb.append(str);
        sb.append("\"");
        this.mediaType = sb.toString();
    }

    public final java.io.InputStream getInputStream() {
        return this.inputStream;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final java.lang.String getMediaType() {
        return this.mediaType;
    }

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0018\u0019"}, d2 = {"Lcom/izettle/android/net/MultiPart$Builder;", "", "Lcom/izettle/android/net/MultiPartType;", "p0", "<init>", "(Lcom/izettle/android/net/MultiPartType;)V", "Lcom/izettle/android/net/MultiPart;", "build", "()Lcom/izettle/android/net/MultiPart;", "", "boundary", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lcom/izettle/android/net/AppendableSequenceInputStream;", "inputStream", "Lcom/izettle/android/net/AppendableSequenceInputStream;", "getInputStream$net", "()Lcom/izettle/android/net/AppendableSequenceInputStream;", "getHighSpeedVideoFpsRangesFor", "Lcom/izettle/android/net/MultiPartType;", "getHighSpeedVideoSizes", "FormData", "Related", "Lcom/izettle/android/net/MultiPart$Builder$FormData;", "Lcom/izettle/android/net/MultiPart$Builder$Related;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Builder {
        private final java.lang.String boundary;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.izettle.android.net.MultiPartType getHighSpeedVideoSizes;
        private final com.izettle.android.net.AppendableSequenceInputStream inputStream;

        private Builder(com.izettle.android.net.MultiPartType multiPartType) {
            this.getHighSpeedVideoSizes = multiPartType;
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(obj, "-", "", false, 4, (java.lang.Object) null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("===");
            sb.append(replace$default);
            sb.append("===");
            this.boundary = sb.toString();
            this.inputStream = new com.izettle.android.net.AppendableSequenceInputStream(null, 1, null);
        }

        protected final java.lang.String getBoundary() {
            return this.boundary;
        }

        /* renamed from: getInputStream$net, reason: from getter */
        public final com.izettle.android.net.AppendableSequenceInputStream getInputStream() {
            return this.inputStream;
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0010J&\u0010\u0012\u001a\u00020\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0012\u0010\nJ3\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0015"}, d2 = {"Lcom/izettle/android/net/MultiPart$Builder$FormData;", "Lcom/izettle/android/net/MultiPart$Builder;", "<init>", "()V", "Lkotlin/Function1;", "Lcom/izettle/android/net/FormDataFieldPart$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "field", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/MultiPart$Builder$FormData;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/izettle/android/net/ContentType;)Lcom/izettle/android/net/MultiPart$Builder$FormData;", "Lcom/izettle/android/net/FormDataFilePart$Builder;", "file", "Ljava/io/File;", "fileName", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/izettle/android/net/ContentType;)Lcom/izettle/android/net/MultiPart$Builder$FormData;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FormData extends com.izettle.android.net.MultiPart.Builder {
            public FormData() {
                super(com.izettle.android.net.MultiPartType.getHighSpeedVideoFpsRanges, null);
            }

            public static /* synthetic */ com.izettle.android.net.MultiPart.Builder.FormData field$default(com.izettle.android.net.MultiPart.Builder.FormData formData, java.lang.String str, java.lang.String str2, com.izettle.android.net.ContentType contentType, int i, java.lang.Object obj) {
                if ((i & 4) != 0) {
                    contentType = com.izettle.android.net.ContentType.INSTANCE.getTEXT_PLAIN_UTF_8();
                }
                return formData.field(str, str2, contentType);
            }

            public final com.izettle.android.net.MultiPart.Builder.FormData field(final java.lang.String name2, final java.lang.String value, final com.izettle.android.net.ContentType contentType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
                com.izettle.android.net.MultiPartKt.access$useOutputStreamWithPrintWriter(new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter>, kotlin.Unit>() { // from class: com.izettle.android.net.MultiPart$Builder$FormData$field$1$1
                    public final void Camera2StreamConfigurationMap(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                        java.io.ByteArrayOutputStream component1 = pair.component1();
                        java.io.PrintWriter append = pair.component2().append((java.lang.CharSequence) "--".concat(java.lang.String.valueOf(com.izettle.android.net.MultiPart.Builder.FormData.this.getBoundary()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                        java.lang.String str = name2;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Content-Disposition: form-data; name=\"");
                        sb.append(str);
                        sb.append("\"");
                        append.append((java.lang.CharSequence) sb.toString()).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) "Content-Type: ".concat(java.lang.String.valueOf(contentType.getDisplayName()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) value).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).flush();
                        com.izettle.android.net.MultiPart.Builder.FormData.this.getInputStream().append(new java.io.ByteArrayInputStream(component1.toByteArray()), component1.length);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        Camera2StreamConfigurationMap(pair);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                return this;
            }

            public final com.izettle.android.net.MultiPart.Builder.FormData field(kotlin.jvm.functions.Function1<? super com.izettle.android.net.FormDataFieldPart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                com.izettle.android.net.FormDataFieldPart access$formDataFieldPart = com.izettle.android.net.MultiPartKt.access$formDataFieldPart(block);
                field(access$formDataFieldPart.getName(), access$formDataFieldPart.getValue(), access$formDataFieldPart.getContentType());
                return this;
            }

            public static /* synthetic */ com.izettle.android.net.MultiPart.Builder.FormData file$default(com.izettle.android.net.MultiPart.Builder.FormData formData, java.lang.String str, java.io.File file, java.lang.String str2, com.izettle.android.net.ContentType contentType, int i, java.lang.Object obj) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    contentType = com.izettle.android.net.ContentType.INSTANCE.getAPPLICATION_OCTET_STREAM();
                }
                return formData.file(str, file, str2, contentType);
            }

            public final com.izettle.android.net.MultiPart.Builder.FormData file(final java.lang.String name2, final java.io.File file, final java.lang.String fileName, final com.izettle.android.net.ContentType contentType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
                com.izettle.android.net.MultiPartKt.access$useOutputStreamWithPrintWriter(new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter>, kotlin.Unit>() { // from class: com.izettle.android.net.MultiPart$Builder$FormData$file$1$1
                    public final void Camera2StreamConfigurationMap(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                        java.io.ByteArrayOutputStream component1 = pair.component1();
                        java.io.PrintWriter append = pair.component2().append((java.lang.CharSequence) "--".concat(java.lang.String.valueOf(com.izettle.android.net.MultiPart.Builder.FormData.this.getBoundary()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                        java.lang.String str = name2;
                        java.lang.String str2 = fileName;
                        if (str2 == null) {
                            str2 = file.getName();
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Content-Disposition: form-data; name=\"");
                        sb.append(str);
                        sb.append("\"; filename=\"");
                        sb.append(str2);
                        sb.append("\"");
                        append.append((java.lang.CharSequence) sb.toString()).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) "Content-Type: ".concat(java.lang.String.valueOf(contentType.getDisplayName()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) "Content-Transfer-Encoding: binary").append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).flush();
                        com.izettle.android.net.MultiPart.Builder.FormData.this.getInputStream().append(new java.io.ByteArrayInputStream(component1.toByteArray()), component1.length);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        Camera2StreamConfigurationMap(pair);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                getInputStream().append(new java.io.FileInputStream(file), file.length());
                com.izettle.android.net.MultiPartKt.access$useOutputStreamWithPrintWriter(new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter>, kotlin.Unit>() { // from class: com.izettle.android.net.MultiPart$Builder$FormData$file$1$2
                    public final void getHighSpeedVideoFpsRangesFor(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                        java.io.ByteArrayOutputStream component1 = pair.component1();
                        pair.component2().append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).flush();
                        com.izettle.android.net.MultiPart.Builder.FormData.this.getInputStream().append(new java.io.ByteArrayInputStream(component1.toByteArray()), component1.length);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        getHighSpeedVideoFpsRangesFor(pair);
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }
                });
                return this;
            }

            public final com.izettle.android.net.MultiPart.Builder.FormData file(kotlin.jvm.functions.Function1<? super com.izettle.android.net.FormDataFilePart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                com.izettle.android.net.FormDataFilePart access$formDataFilePart = com.izettle.android.net.MultiPartKt.access$formDataFilePart(block);
                file(access$formDataFilePart.getName(), access$formDataFilePart.getFile(), access$formDataFilePart.getFileName(), access$formDataFilePart.getContentType());
                return this;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eJ&\u0010\u0010\u001a\u00020\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0010\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0013"}, d2 = {"Lcom/izettle/android/net/MultiPart$Builder$Related;", "Lcom/izettle/android/net/MultiPart$Builder;", "<init>", "()V", "Lkotlin/Function1;", "Lcom/izettle/android/net/RelatedFilePart$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "file", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/MultiPart$Builder$Related;", "Ljava/io/File;", "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "(Ljava/io/File;Lcom/izettle/android/net/ContentType;)Lcom/izettle/android/net/MultiPart$Builder$Related;", "Lcom/izettle/android/net/RelatedPart$Builder;", "part", "", "content", "(Ljava/lang/String;Lcom/izettle/android/net/ContentType;)Lcom/izettle/android/net/MultiPart$Builder$Related;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Related extends com.izettle.android.net.MultiPart.Builder {
            public Related() {
                super(com.izettle.android.net.MultiPartType.getHighSpeedVideoFpsRangesFor, null);
            }

            public final com.izettle.android.net.MultiPart.Builder.Related part(final java.lang.String content, final com.izettle.android.net.ContentType contentType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
                com.izettle.android.net.MultiPartKt.access$useOutputStreamWithPrintWriter(new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter>, kotlin.Unit>() { // from class: com.izettle.android.net.MultiPart$Builder$Related$part$1$1
                    public final void Camera2StreamConfigurationMap(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                        java.io.ByteArrayOutputStream component1 = pair.component1();
                        pair.component2().append((java.lang.CharSequence) "--".concat(java.lang.String.valueOf(com.izettle.android.net.MultiPart.Builder.Related.this.getBoundary()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) "Content-Type: ".concat(java.lang.String.valueOf(contentType.getDisplayName()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) content).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).flush();
                        com.izettle.android.net.MultiPart.Builder.Related.this.getInputStream().append(new java.io.ByteArrayInputStream(component1.toByteArray()), component1.length);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        Camera2StreamConfigurationMap(pair);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                return this;
            }

            public final com.izettle.android.net.MultiPart.Builder.Related part(kotlin.jvm.functions.Function1<? super com.izettle.android.net.RelatedPart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                com.izettle.android.net.RelatedPart access$relatedPart = com.izettle.android.net.MultiPartKt.access$relatedPart(block);
                part(access$relatedPart.getContent(), access$relatedPart.getContentType());
                return this;
            }

            public final com.izettle.android.net.MultiPart.Builder.Related file(java.io.File file, final com.izettle.android.net.ContentType contentType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
                com.izettle.android.net.MultiPartKt.access$useOutputStreamWithPrintWriter(new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter>, kotlin.Unit>() { // from class: com.izettle.android.net.MultiPart$Builder$Related$file$1$1
                    public final void getHighSpeedVideoFpsRangesFor(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                        java.io.ByteArrayOutputStream component1 = pair.component1();
                        pair.component2().append((java.lang.CharSequence) "--".concat(java.lang.String.valueOf(com.izettle.android.net.MultiPart.Builder.Related.this.getBoundary()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) "Content-Type: ".concat(java.lang.String.valueOf(contentType.getDisplayName()))).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) "Content-Transfer-Encoding: binary").append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).flush();
                        com.izettle.android.net.MultiPart.Builder.Related.this.getInputStream().append(new java.io.ByteArrayInputStream(component1.toByteArray()), component1.length);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        getHighSpeedVideoFpsRangesFor(pair);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                getInputStream().append(new java.io.FileInputStream(file), file.length());
                com.izettle.android.net.MultiPartKt.access$useOutputStreamWithPrintWriter(new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter>, kotlin.Unit>() { // from class: com.izettle.android.net.MultiPart$Builder$Related$file$1$2
                    public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                        java.io.ByteArrayOutputStream component1 = pair.component1();
                        pair.component2().append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE).flush();
                        com.izettle.android.net.MultiPart.Builder.Related.this.getInputStream().append(new java.io.ByteArrayInputStream(component1.toByteArray()), component1.length);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        getHighResolutionOutputSizeshNQ4ISI(pair);
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }
                });
                return this;
            }

            public final com.izettle.android.net.MultiPart.Builder.Related file(kotlin.jvm.functions.Function1<? super com.izettle.android.net.RelatedFilePart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                com.izettle.android.net.RelatedFilePart access$relatedFilePart = com.izettle.android.net.MultiPartKt.access$relatedFilePart(block);
                file(access$relatedFilePart.getFile(), access$relatedFilePart.getContentType());
                return this;
            }
        }

        public final com.izettle.android.net.MultiPart build() {
            if (this.inputStream.getLength() > 0) {
                com.izettle.android.net.MultiPartKt.access$useOutputStreamWithPrintWriter(new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter>, kotlin.Unit>() { // from class: com.izettle.android.net.MultiPart$Builder$build$1
                    public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                        java.io.ByteArrayOutputStream component1 = pair.component1();
                        java.io.PrintWriter component2 = pair.component2();
                        java.lang.String boundary = com.izettle.android.net.MultiPart.Builder.this.getBoundary();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
                        sb.append(boundary);
                        sb.append("--");
                        component2.append((java.lang.CharSequence) sb.toString()).flush();
                        com.izettle.android.net.MultiPart.Builder.this.getInputStream().append(new java.io.ByteArrayInputStream(component1.toByteArray()), component1.length);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Pair<? extends java.io.ByteArrayOutputStream, ? extends java.io.PrintWriter> pair) {
                        getHighResolutionOutputSizeshNQ4ISI(pair);
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }
                });
            }
            com.izettle.android.net.AppendableSequenceInputStream appendableSequenceInputStream = this.inputStream;
            return new com.izettle.android.net.MultiPart(appendableSequenceInputStream, appendableSequenceInputStream.getLength(), this.getHighSpeedVideoSizes, this.boundary, null);
        }

        public /* synthetic */ Builder(com.izettle.android.net.MultiPartType multiPartType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(multiPartType);
        }
    }

    public /* synthetic */ MultiPart(java.io.InputStream inputStream, long j, com.izettle.android.net.MultiPartType multiPartType, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, j, multiPartType, str);
    }
}
