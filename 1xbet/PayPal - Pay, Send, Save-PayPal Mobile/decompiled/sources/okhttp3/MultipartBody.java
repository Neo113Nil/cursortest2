package okhttp3;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 12\u00020\u0001:\u0003231B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u001f2\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u001bR\u0014\u0010(\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010&\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010.R\u0011\u0010/\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b/\u0010\u0017R\u0011\u00100\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b0\u0010\u0019"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/ByteString;", "boundaryByteString", "Lokhttp3/MediaType;", "type", "", "Lokhttp3/MultipartBody$Part;", "parts", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "", "index", "part", "(I)Lokhttp3/MultipartBody$Part;", "", "isOneShot", "()Z", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "-deprecated_type", "", "-deprecated_boundary", "()Ljava/lang/String;", "-deprecated_size", "()I", "-deprecated_parts", "()Ljava/util/List;", "", "contentLength", "()J", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lokio/BufferedSink;Z)J", "getHighSpeedVideoFpsRanges", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/MediaType;", "Ljava/util/List;", "getOutputMinFrameDuration", "J", "boundary", io.ktor.http.ContentDisposition.Parameters.Size, "Companion", "Part", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartBody extends okhttp3.RequestBody {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okio.ByteString getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final okhttp3.MediaType getHighSpeedVideoFpsRanges;
    private final java.util.List<okhttp3.MultipartBody.Part> parts;
    private final okhttp3.MediaType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.MultipartBody.Companion INSTANCE = new okhttp3.MultipartBody.Companion(null);
    public static final okhttp3.MediaType MIXED = okhttp3.MediaType.INSTANCE.get("multipart/mixed");
    public static final okhttp3.MediaType ALTERNATIVE = okhttp3.MediaType.INSTANCE.get("multipart/alternative");
    public static final okhttp3.MediaType DIGEST = okhttp3.MediaType.INSTANCE.get("multipart/digest");
    public static final okhttp3.MediaType PARALLEL = okhttp3.MediaType.INSTANCE.get("multipart/parallel");
    public static final okhttp3.MediaType FORM = okhttp3.MediaType.INSTANCE.get(androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_MULTIPART);
    private static final byte[] getHighSpeedVideoSizes = {58, 32};
    private static final byte[] Camera2StreamConfigurationMap = {13, 10};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {45, 45};

    public MultipartBody(okio.ByteString byteString, okhttp3.MediaType mediaType, java.util.List<okhttp3.MultipartBody.Part> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRangesFor = byteString;
        this.type = mediaType;
        this.parts = list;
        okhttp3.MediaType.Companion companion = okhttp3.MediaType.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(mediaType);
        sb.append("; boundary=");
        sb.append(boundary());
        this.getHighSpeedVideoFpsRanges = companion.get(sb.toString());
        this.getHighResolutionOutputSizeshNQ4ISI = -1L;
    }

    public final okhttp3.MediaType type() {
        return this.type;
    }

    public final java.util.List<okhttp3.MultipartBody.Part> parts() {
        return this.parts;
    }

    public final java.lang.String boundary() {
        return this.getHighSpeedVideoFpsRangesFor.utf8();
    }

    public final int size() {
        return this.parts.size();
    }

    public final okhttp3.MultipartBody.Part part(int index) {
        return this.parts.get(index);
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        java.util.List<okhttp3.MultipartBody.Part> list = this.parts;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((okhttp3.MultipartBody.Part) it.next()).body().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public final okhttp3.MediaType getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final okhttp3.MediaType getType() {
        return this.type;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "boundary", imports = {}))
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final java.lang.String m24354deprecated_boundary() {
        return boundary();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = io.ktor.http.ContentDisposition.Parameters.Size, imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m24356deprecated_size() {
        return size();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "parts", imports = {}))
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final java.util.List<okhttp3.MultipartBody.Part> m24355deprecated_parts() {
        return this.parts;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws java.io.IOException {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        if (j != -1) {
            return j;
        }
        long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(null, true);
        this.getHighResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.BufferedSink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        getHighResolutionOutputSizeshNQ4ISI(sink, false);
    }

    private final long getHighResolutionOutputSizeshNQ4ISI(okio.BufferedSink p0, boolean p1) throws java.io.IOException {
        okio.Buffer buffer;
        okio.Buffer buffer2;
        if (p1) {
            buffer2 = new okio.Buffer();
            buffer = buffer2;
        } else {
            buffer = p0;
            buffer2 = null;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            okhttp3.MultipartBody.Part part = this.parts.get(i);
            okhttp3.Headers headers = part.headers();
            okhttp3.RequestBody body = part.body();
            kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
            buffer.write(getHighResolutionOutputSizeshNQ4ISI);
            buffer.write(this.getHighSpeedVideoFpsRangesFor);
            buffer.write(Camera2StreamConfigurationMap);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    buffer.writeUtf8(headers.name(i2)).write(getHighSpeedVideoSizes).writeUtf8(headers.value(i2)).write(Camera2StreamConfigurationMap);
                }
            }
            okhttp3.MediaType getHighSpeedVideoFpsRanges = body.getGetHighSpeedVideoFpsRanges();
            if (getHighSpeedVideoFpsRanges != null) {
                buffer.writeUtf8("Content-Type: ").writeUtf8(getHighSpeedVideoFpsRanges.toString()).write(Camera2StreamConfigurationMap);
            }
            long contentLength = body.contentLength();
            if (contentLength == -1 && p1) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(buffer2);
                buffer2.clear();
                return -1L;
            }
            byte[] bArr = Camera2StreamConfigurationMap;
            buffer.write(bArr);
            if (p1) {
                j += contentLength;
            } else {
                body.writeTo(buffer);
            }
            buffer.write(bArr);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
        byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
        buffer.write(bArr2);
        buffer.write(this.getHighSpeedVideoFpsRangesFor);
        buffer.write(bArr2);
        buffer.write(Camera2StreamConfigurationMap);
        if (!p1) {
            return j;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(buffer2);
        long size3 = j + buffer2.size();
        buffer2.clear();
        return size3;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Lokhttp3/Headers;", "p0", "Lokhttp3/RequestBody;", "p1", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "-deprecated_headers", "()Lokhttp3/Headers;", "-deprecated_body", "()Lokhttp3/RequestBody;", "headers", "Lokhttp3/Headers;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lokhttp3/RequestBody;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Part {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final okhttp3.MultipartBody.Part.Companion INSTANCE = new okhttp3.MultipartBody.Part.Companion(null);
        private final okhttp3.RequestBody body;
        private final okhttp3.Headers headers;

        private Part(okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public final okhttp3.Headers headers() {
            return this.headers;
        }

        public final okhttp3.RequestBody body() {
            return this.body;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
        /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
        public final okhttp3.Headers getHeaders() {
            return this.headers;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, imports = {}))
        /* renamed from: -deprecated_body, reason: not valid java name and from getter */
        public final okhttp3.RequestBody getBody() {
            return this.body;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0012"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "Lokhttp3/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lokhttp3/MultipartBody$Part;", "create", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "createFormData", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part create(okhttp3.RequestBody body) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
                return create(null, body);
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part create(okhttp3.Headers headers, okhttp3.RequestBody body) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers != null ? headers.get("Content-Type") : null) != null) {
                    throw new java.lang.IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.get("Content-Length") : null) != null) {
                    throw new java.lang.IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                return new okhttp3.MultipartBody.Part(headers, body, defaultConstructorMarker);
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part createFormData(java.lang.String name2, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                return createFormData(name2, null, okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, value, (okhttp3.MediaType) null, 1, (java.lang.Object) null));
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part createFormData(java.lang.String name2, java.lang.String filename, okhttp3.RequestBody body) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("form-data; name=");
                okhttp3.MultipartBody.INSTANCE.appendQuotedString$okhttp(sb, name2);
                if (filename != null) {
                    sb.append("; filename=");
                    okhttp3.MultipartBody.INSTANCE.appendQuotedString$okhttp(sb, filename);
                }
                return create(new okhttp3.Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), body);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part createFormData(java.lang.String str, java.lang.String str2, okhttp3.RequestBody requestBody) {
            return INSTANCE.createFormData(str, str2, requestBody);
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part createFormData(java.lang.String str, java.lang.String str2) {
            return INSTANCE.createFormData(str, str2);
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part create(okhttp3.RequestBody requestBody) {
            return INSTANCE.create(requestBody);
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part create(okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
            return INSTANCE.create(headers, requestBody);
        }

        public /* synthetic */ Part(okhttp3.Headers headers, okhttp3.RequestBody requestBody, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0016J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\f\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/MediaType;", "type", "setType", "(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "addPart", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addFormDataPart", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody$Part;", "part", "(Lokhttp3/MultipartBody$Part;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", "build", "()Lokhttp3/MultipartBody;", "Lokio/ByteString;", "Camera2StreamConfigurationMap", "Lokio/ByteString;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/MediaType;", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final okio.ByteString getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private okhttp3.MediaType getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.List<okhttp3.MultipartBody.Part> getHighSpeedVideoFpsRangesFor;

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoSizes = okio.ByteString.INSTANCE.encodeUtf8(str);
            this.getHighResolutionOutputSizeshNQ4ISI = okhttp3.MultipartBody.MIXED;
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Builder(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
            if ((i & 1) != 0) {
                str = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
        }

        public final okhttp3.MultipartBody.Builder setType(okhttp3.MediaType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type.type(), io.ktor.http.ContentType.MultiPart.TYPE)) {
                throw new java.lang.IllegalArgumentException("multipart != ".concat(java.lang.String.valueOf(type)).toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = type;
            return this;
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.create(body));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.Headers headers, okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.create(headers, body));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.createFormData(name2, value));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String name2, java.lang.String filename, okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.createFormData(name2, filename, body));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.MultipartBody.Part part) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(part, "");
            this.getHighSpeedVideoFpsRangesFor.add(part);
            return this;
        }

        public final okhttp3.MultipartBody build() {
            if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                throw new java.lang.IllegalStateException("Multipart body must have at least one part.".toString());
            }
            return new okhttp3.MultipartBody(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, okhttp3.internal._UtilJvmKt.toImmutableList(this.getHighSpeedVideoFpsRangesFor));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0011\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "", "key", "", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/MediaType;", "MIXED", "Lokhttp3/MediaType;", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", "", "getHighSpeedVideoSizes", "[B", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void appendQuotedString$okhttp(java.lang.StringBuilder sb, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
            }
            sb.append('\"');
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
