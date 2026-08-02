package okhttp3;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0016*\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0018H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "()[B", "Lokio/ByteString;", "byteString", "()Lokio/ByteString;", "", "T", "Lkotlin/Function1;", "consumer", "", "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "()Ljava/nio/charset/Charset;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ResponseBody implements java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.ResponseBody.Companion INSTANCE;
    public static final okhttp3.ResponseBody EMPTY;
    private java.io.Reader reader;

    /* renamed from: contentLength */
    public abstract long getGetHighSpeedVideoSizes();

    /* renamed from: contentType */
    public abstract okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor();

    /* renamed from: source */
    public abstract okio.BufferedSource getGetHighResolutionOutputSizeshNQ4ISI();

    public final java.io.InputStream byteStream() {
        return getGetHighResolutionOutputSizeshNQ4ISI().inputStream();
    }

    private final <T> T consumeSource(okhttp3.ResponseBody responseBody, kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> function1, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function12) {
        T t;
        long getHighSpeedVideoSizes = responseBody.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.io.IOException("Cannot buffer entire body for content length: ".concat(java.lang.String.valueOf(getHighSpeedVideoSizes)));
        }
        okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = responseBody.getGetHighResolutionOutputSizeshNQ4ISI();
        java.lang.Throwable th = null;
        try {
            t = function1.invoke(getHighResolutionOutputSizeshNQ4ISI);
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            t = (java.lang.Object) null;
        }
        if (th == null) {
            int intValue = function12.invoke(t).intValue();
            if (getHighSpeedVideoSizes == -1 || getHighSpeedVideoSizes == intValue) {
                return t;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content-Length (");
            sb.append(getHighSpeedVideoSizes);
            sb.append(") and stream length (");
            sb.append(intValue);
            sb.append(") disagree");
            throw new java.io.IOException(sb.toString());
        }
        throw th;
    }

    public final java.io.Reader charStream() {
        java.io.Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        okhttp3.ResponseBody.BomAwareReader bomAwareReader = new okhttp3.ResponseBody.BomAwareReader(getGetHighResolutionOutputSizeshNQ4ISI(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final java.lang.String string() throws java.io.IOException {
        java.lang.String str;
        okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        java.lang.Throwable th = null;
        try {
            okio.BufferedSource bufferedSource = getHighResolutionOutputSizeshNQ4ISI;
            str = bufferedSource.readString(okhttp3.internal._UtilJvmKt.readBomAsCharset(bufferedSource, charset()));
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            str = null;
            th = th3;
        }
        if (th == null) {
            return str;
        }
        throw th;
    }

    private final java.nio.charset.Charset charset() {
        return okhttp3.internal.Internal.charsetOrUtf8(getGetHighSpeedVideoFpsRangesFor());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.internal._UtilCommonKt.closeQuietly(getGetHighResolutionOutputSizeshNQ4ISI());
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "", "cbuf", "", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "read", "([CII)I", "", "close", "()V", "getHighSpeedVideoSizes", "Lokio/BufferedSource;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Ljava/nio/charset/Charset;", "getHighResolutionOutputSizeshNQ4ISI", "", "Z", "getHighSpeedVideoFpsRanges", "Ljava/io/Reader;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BomAwareReader extends java.io.Reader {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.nio.charset.Charset getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;
        private java.io.Reader getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final okio.BufferedSource getHighSpeedVideoFpsRangesFor;

        public BomAwareReader(okio.BufferedSource bufferedSource, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
            this.getHighSpeedVideoFpsRangesFor = bufferedSource;
            this.getHighResolutionOutputSizeshNQ4ISI = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int off, int len) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cbuf, "");
            if (this.Camera2StreamConfigurationMap) {
                throw new java.io.IOException("Stream closed");
            }
            java.io.InputStreamReader inputStreamReader = this.getHighSpeedVideoFpsRanges;
            if (inputStreamReader == null) {
                inputStreamReader = new java.io.InputStreamReader(this.getHighSpeedVideoFpsRangesFor.inputStream(), okhttp3.internal._UtilJvmKt.readBomAsCharset(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
                this.getHighSpeedVideoFpsRanges = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            this.Camera2StreamConfigurationMap = true;
            java.io.Reader reader = this.getHighSpeedVideoFpsRanges;
            if (reader != null) {
                reader.close();
            } else {
                this.getHighSpeedVideoFpsRangesFor.close();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u0007*\u00020\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\rJ)\u0010\b\u001a\u00020\u0007*\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0011J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0013J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\u0014J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\b\u0010\u0015J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/ByteString;", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/BufferedSource;", "", "contentLength", "(Lokio/BufferedSource;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lokio/ByteString;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLokio/BufferedSource;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, java.lang.String str, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(java.lang.String str, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.Pair<java.nio.charset.Charset, okhttp3.MediaType> chooseCharset = okhttp3.internal.Internal.chooseCharset(mediaType);
            java.nio.charset.Charset component1 = chooseCharset.component1();
            okhttp3.MediaType component2 = chooseCharset.component2();
            okio.Buffer writeString = new okio.Buffer().writeString(str, component1);
            return create(writeString, component2, writeString.size());
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, byte[] bArr, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(byte[] bArr, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            return create(new okio.Buffer().write(bArr), mediaType, bArr.length);
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, okio.ByteString byteString, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okio.ByteString byteString, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
            return create(new okio.Buffer().write(byteString), mediaType, byteString.size());
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, okio.BufferedSource bufferedSource, okhttp3.MediaType mediaType, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(bufferedSource, mediaType, j);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(final okio.BufferedSource bufferedSource, final okhttp3.MediaType mediaType, final long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
            return new okhttp3.ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: contentType, reason: from getter */
                public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
                    return okhttp3.MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: contentLength, reason: from getter */
                public final long getGetHighSpeedVideoSizes() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: source, reason: from getter */
                public final okio.BufferedSource getGetHighResolutionOutputSizeshNQ4ISI() {
                    return bufferedSource;
                }
            };
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, byte[] content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, okio.ByteString content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, long contentLength, okio.BufferedSource content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return create(content, contentType, contentLength);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.ResponseBody.Companion companion = new okhttp3.ResponseBody.Companion(null);
        INSTANCE = companion;
        EMPTY = okhttp3.ResponseBody.Companion.create$default(companion, okio.ByteString.EMPTY, (okhttp3.MediaType) null, 1, (java.lang.Object) null);
    }

    public final byte[] bytes() throws java.io.IOException {
        byte[] bArr;
        long getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.io.IOException("Cannot buffer entire body for content length: ".concat(java.lang.String.valueOf(getHighSpeedVideoSizes)));
        }
        okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        java.lang.Throwable th = null;
        try {
            bArr = getHighResolutionOutputSizeshNQ4ISI.readByteArray();
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            bArr = null;
            th = th3;
        }
        if (th == null) {
            int length = bArr.length;
            if (getHighSpeedVideoSizes == -1 || getHighSpeedVideoSizes == length) {
                return bArr;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content-Length (");
            sb.append(getHighSpeedVideoSizes);
            sb.append(") and stream length (");
            sb.append(length);
            sb.append(") disagree");
            throw new java.io.IOException(sb.toString());
        }
        throw th;
    }

    public final okio.ByteString byteString() throws java.io.IOException {
        okio.ByteString byteString;
        long getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.io.IOException("Cannot buffer entire body for content length: ".concat(java.lang.String.valueOf(getHighSpeedVideoSizes)));
        }
        okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        java.lang.Throwable th = null;
        try {
            byteString = getHighResolutionOutputSizeshNQ4ISI.readByteString();
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (getHighResolutionOutputSizeshNQ4ISI != null) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            byteString = null;
            th = th3;
        }
        if (th == null) {
            int size = byteString.size();
            if (getHighSpeedVideoSizes == -1 || getHighSpeedVideoSizes == size) {
                return byteString;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content-Length (");
            sb.append(getHighSpeedVideoSizes);
            sb.append(") and stream length (");
            sb.append(size);
            sb.append(") disagree");
            throw new java.io.IOException(sb.toString());
        }
        throw th;
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(byte[] bArr, okhttp3.MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okio.ByteString byteString, okhttp3.MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okio.BufferedSource bufferedSource, okhttp3.MediaType mediaType, long j) {
        return INSTANCE.create(bufferedSource, mediaType, j);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, okio.ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, java.lang.String str) {
        return INSTANCE.create(mediaType, str);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, long j, okio.BufferedSource bufferedSource) {
        return INSTANCE.create(mediaType, j, bufferedSource);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(java.lang.String str, okhttp3.MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }
}
