package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\b\u0010\u0004\u001a,\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\b\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0011\u0010\u001c\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001e\" \u0010 \u001a\u00020\u001f8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/http/cio/Request;", "parseRequest", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/Response;", "parseResponse", "Lio/ktor/http/cio/HttpHeadersMap;", "parseHeaders", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "Lio/ktor/http/cio/internals/MutableRange;", "range", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/CharSequence;", "text", "", "parseHeaderName", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)I", "", "parseHeaderValue", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)V", "", "", "(Ljava/lang/CharSequence;C)Ljava/lang/Void;", "", "Ljava/util/Set;", "Lio/ktor/utils/io/LineEndingMode;", "httpLineEndings", com.visa.cbp.getEncExpo.warmup, "getHttpLineEndings", "()I", "getHttpLineEndings$annotations", "()V", "Lio/ktor/http/cio/internals/AsciiCharTree;", "", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/http/cio/internals/AsciiCharTree;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpParserKt {
    private static final java.util.Set<java.lang.Character> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator), '?', '#', '@'});
    private static final int httpLineEndings = io.ktor.utils.io.LineEndingMode.m23417plus1TerO4(io.ktor.utils.io.LineEndingMode.INSTANCE.m23422getCRLFf0jXZW8(), io.ktor.utils.io.LineEndingMode.INSTANCE.m23423getLFf0jXZW8());
    private static final io.ktor.http.cio.internals.AsciiCharTree<java.lang.String> getHighSpeedVideoFpsRangesFor = io.ktor.http.cio.internals.AsciiCharTree.INSTANCE.build(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"HTTP/1.0", "HTTP/1.1"}));

    public static /* synthetic */ boolean $r8$lambda$_YuIeINHm82xIpRfHJA0RQWW8Ew(char c, int i) {
        return c == ' ';
    }

    public static /* synthetic */ boolean $r8$lambda$uBr6G0LrrSSTGO93sg30I2FqOHo(char c, int i) {
        return c == ' ';
    }

    public static /* synthetic */ void getHttpLineEndings$annotations() {
    }

    public static final int getHttpLineEndings() {
        return httpLineEndings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0161 A[Catch: all -> 0x01a7, TryCatch #1 {all -> 0x01a7, blocks: (B:12:0x003c, B:14:0x015b, B:18:0x0161, B:26:0x0092, B:29:0x009b, B:31:0x00ac, B:33:0x00d5, B:34:0x00f3, B:36:0x0105, B:37:0x0123, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:48:0x0169, B:49:0x0170, B:50:0x0171, B:51:0x0178, B:52:0x0179, B:53:0x01a2, B:55:0x010c, B:57:0x0114, B:58:0x011c, B:59:0x00e6, B:61:0x0078), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[Catch: all -> 0x01a7, TryCatch #1 {all -> 0x01a7, blocks: (B:12:0x003c, B:14:0x015b, B:18:0x0161, B:26:0x0092, B:29:0x009b, B:31:0x00ac, B:33:0x00d5, B:34:0x00f3, B:36:0x0105, B:37:0x0123, B:39:0x013a, B:41:0x0140, B:43:0x0146, B:48:0x0169, B:49:0x0170, B:50:0x0171, B:51:0x0178, B:52:0x0179, B:53:0x01a2, B:55:0x010c, B:57:0x0114, B:58:0x011c, B:59:0x00e6, B:61:0x0078), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x008d -> B:26:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object parseRequest(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.Request> continuation) {
        io.ktor.http.cio.HttpParserKt$parseRequest$1 httpParserKt$parseRequest$1;
        int i;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder;
        io.ktor.http.cio.internals.MutableRange mutableRange;
        io.ktor.http.cio.HttpParserKt$parseRequest$1 httpParserKt$parseRequest$12;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        java.lang.Object m23407readUTF8LineToRRvyBJ8;
        java.lang.String subSequence;
        java.lang.CharSequence charSequence;
        io.ktor.http.HttpMethod httpMethod;
        java.lang.CharSequence charSequence2;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        try {
            if (continuation instanceof io.ktor.http.cio.HttpParserKt$parseRequest$1) {
                httpParserKt$parseRequest$1 = (io.ktor.http.cio.HttpParserKt$parseRequest$1) continuation;
                if ((httpParserKt$parseRequest$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    httpParserKt$parseRequest$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = httpParserKt$parseRequest$1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpParserKt$parseRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder3 = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                        mutableRange = new io.ktor.http.cio.internals.MutableRange(0, 0);
                        httpParserKt$parseRequest$12 = httpParserKt$parseRequest$1;
                        charArrayBuilder2 = charArrayBuilder3;
                        byteReadChannel2 = byteReadChannel;
                        int i2 = httpLineEndings;
                        httpParserKt$parseRequest$12.getHighSpeedVideoFpsRangesFor = byteReadChannel2;
                        httpParserKt$parseRequest$12.Camera2StreamConfigurationMap = charArrayBuilder2;
                        httpParserKt$parseRequest$12.getHighSpeedVideoSizes = mutableRange;
                        httpParserKt$parseRequest$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                        m23407readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel2, charArrayBuilder2, 8192, i2, httpParserKt$parseRequest$12);
                        if (m23407readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.CharSequence charSequence3 = (java.lang.CharSequence) httpParserKt$parseRequest$1.getHighSpeedVideoFpsRanges;
                        java.lang.CharSequence charSequence4 = (java.lang.CharSequence) httpParserKt$parseRequest$1.getHighSpeedVideoSizes;
                        io.ktor.http.HttpMethod httpMethod2 = (io.ktor.http.HttpMethod) httpParserKt$parseRequest$1.Camera2StreamConfigurationMap;
                        charArrayBuilder2 = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseRequest$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        charSequence = charSequence3;
                        charSequence2 = charSequence4;
                        httpMethod = httpMethod2;
                        httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                        if (httpHeadersMap != null) {
                            return null;
                        }
                        return new io.ktor.http.cio.Request(httpMethod, charSequence2, charSequence, httpHeadersMap, charArrayBuilder2);
                    }
                    io.ktor.http.cio.internals.MutableRange mutableRange2 = (io.ktor.http.cio.internals.MutableRange) httpParserKt$parseRequest$1.getHighSpeedVideoSizes;
                    charArrayBuilder = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseRequest$1.Camera2StreamConfigurationMap;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) httpParserKt$parseRequest$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        httpParserKt$parseRequest$12 = httpParserKt$parseRequest$1;
                        charArrayBuilder2 = charArrayBuilder;
                        mutableRange = mutableRange2;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            return null;
                        }
                        mutableRange.setEnd(charArrayBuilder2.length());
                        if (mutableRange.getStart() == mutableRange.getEnd()) {
                            byteReadChannel2 = byteReadChannel3;
                            int i22 = httpLineEndings;
                            httpParserKt$parseRequest$12.getHighSpeedVideoFpsRangesFor = byteReadChannel2;
                            httpParserKt$parseRequest$12.Camera2StreamConfigurationMap = charArrayBuilder2;
                            httpParserKt$parseRequest$12.getHighSpeedVideoSizes = mutableRange;
                            httpParserKt$parseRequest$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                            m23407readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel2, charArrayBuilder2, 8192, i22, httpParserKt$parseRequest$12);
                            if (m23407readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                byteReadChannel3 = byteReadChannel2;
                                obj = m23407readUTF8LineToRRvyBJ8;
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder4 = charArrayBuilder2;
                        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charArrayBuilder4, mutableRange);
                        io.ktor.http.HttpMethod httpMethod3 = (io.ktor.http.HttpMethod) kotlin.collections.CollectionsKt.singleOrNull(io.ktor.http.cio.internals.AsciiCharTree.search$default(io.ktor.http.cio.internals.CharsKt.getDefaultHttpMethods(), charArrayBuilder4, mutableRange.getStart(), mutableRange.getEnd(), false, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.HttpParserKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return java.lang.Boolean.valueOf(io.ktor.http.cio.HttpParserKt.$r8$lambda$_YuIeINHm82xIpRfHJA0RQWW8Ew(((java.lang.Character) obj2).charValue(), ((java.lang.Integer) obj3).intValue()));
                            }
                        }, 8, null));
                        if (httpMethod3 != null) {
                            mutableRange.setStart(mutableRange.getStart() + httpMethod3.getValue().length());
                        } else {
                            httpMethod3 = new io.ktor.http.HttpMethod(io.ktor.http.cio.internals.TokenizerKt.nextToken(charArrayBuilder4, mutableRange).toString());
                        }
                        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder5 = charArrayBuilder2;
                        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charArrayBuilder5, mutableRange);
                        int start = mutableRange.getStart();
                        int findSpaceOrEnd = io.ktor.http.cio.internals.TokenizerKt.findSpaceOrEnd(charArrayBuilder5, mutableRange);
                        int i3 = findSpaceOrEnd - start;
                        if (i3 > 0) {
                            if (i3 == 1 && charArrayBuilder5.charAt(start) == '/') {
                                mutableRange.setStart(findSpaceOrEnd);
                            } else {
                                subSequence = charArrayBuilder5.subSequence(start, findSpaceOrEnd);
                                mutableRange.setStart(findSpaceOrEnd);
                            }
                        }
                        java.lang.CharSequence Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(charArrayBuilder2, mutableRange);
                        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charArrayBuilder2, mutableRange);
                        if (mutableRange.getStart() != mutableRange.getEnd()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Extra characters in request line: ");
                            sb.append(charArrayBuilder2.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString());
                            throw new io.ktor.http.cio.ParserException(sb.toString());
                        }
                        if (subSequence.length() == 0) {
                            throw new io.ktor.http.cio.ParserException("URI is not specified");
                        }
                        if (Camera2StreamConfigurationMap2.length() == 0) {
                            throw new io.ktor.http.cio.ParserException("HTTP version is not specified");
                        }
                        httpParserKt$parseRequest$12.getHighSpeedVideoFpsRangesFor = charArrayBuilder2;
                        httpParserKt$parseRequest$12.Camera2StreamConfigurationMap = httpMethod3;
                        httpParserKt$parseRequest$12.getHighSpeedVideoSizes = subSequence;
                        httpParserKt$parseRequest$12.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap2;
                        httpParserKt$parseRequest$12.getHighResolutionOutputSizeshNQ4ISI = 2;
                        java.lang.Object parseHeaders = parseHeaders(byteReadChannel3, charArrayBuilder2, mutableRange, httpParserKt$parseRequest$12);
                        if (parseHeaders == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        charSequence = Camera2StreamConfigurationMap2;
                        httpMethod = httpMethod3;
                        charSequence2 = subSequence;
                        obj = parseHeaders;
                        httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                        if (httpHeadersMap != null) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            charArrayBuilder = httpParserKt$parseRequest$1;
        }
        httpParserKt$parseRequest$1 = new io.ktor.http.cio.HttpParserKt$parseRequest$1(continuation);
        java.lang.Object obj2 = httpParserKt$parseRequest$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseRequest$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0119, code lost:
    
        r13.setStart(r7);
        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(r2, r13);
        r5 = r2.subSequence(r13.getStart(), r13.getEnd());
        r13.setStart(r13.getEnd());
        r0.Camera2StreamConfigurationMap = r2;
        r0.getHighResolutionOutputSizeshNQ4ISI = r14;
        r0.getHighSpeedVideoSizes = r5;
        r0.getHighSpeedVideoFpsRangesFor = r4;
        r0.getHighSpeedVideoFpsRanges = 2;
        r13 = parseHeaders(r6, r2, r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
    
        if (r13 != r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
    
        r7 = r14;
        r0 = r2;
        r8 = r4;
        r9 = r5;
        r14 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, blocks: (B:29:0x0058, B:30:0x0087, B:33:0x0090, B:35:0x00b2, B:56:0x00c4, B:57:0x00dc, B:41:0x00e5, B:43:0x00ed, B:44:0x0118, B:52:0x0119), top: B:28:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object parseResponse(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.Response> continuation) {
        io.ktor.http.cio.HttpParserKt$parseResponse$1 httpParserKt$parseResponse$1;
        java.lang.Object obj;
        int i;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        io.ktor.http.cio.internals.MutableRange mutableRange;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2;
        char charAt;
        if (continuation instanceof io.ktor.http.cio.HttpParserKt$parseResponse$1) {
            httpParserKt$parseResponse$1 = (io.ktor.http.cio.HttpParserKt$parseResponse$1) continuation;
            if ((httpParserKt$parseResponse$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseResponse$1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = httpParserKt$parseResponse$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseResponse$1.getHighSpeedVideoFpsRanges;
                int i2 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder3 = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                    io.ktor.http.cio.internals.MutableRange mutableRange2 = new io.ktor.http.cio.internals.MutableRange(0, 0);
                    try {
                        int i3 = httpLineEndings;
                        httpParserKt$parseResponse$1.Camera2StreamConfigurationMap = byteReadChannel;
                        httpParserKt$parseResponse$1.getHighResolutionOutputSizeshNQ4ISI = charArrayBuilder3;
                        httpParserKt$parseResponse$1.getHighSpeedVideoSizes = mutableRange2;
                        httpParserKt$parseResponse$1.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object m23407readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder3, 8192, i3, httpParserKt$parseResponse$1);
                        if (m23407readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                            byteReadChannel2 = byteReadChannel;
                            mutableRange = mutableRange2;
                            charArrayBuilder2 = charArrayBuilder3;
                            obj = m23407readUTF8LineToRRvyBJ8;
                        }
                        return coroutine_suspended;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        charArrayBuilder = charArrayBuilder3;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = httpParserKt$parseResponse$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) httpParserKt$parseResponse$1.getHighSpeedVideoSizes;
                    java.lang.CharSequence charSequence2 = (java.lang.CharSequence) httpParserKt$parseResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                    charArrayBuilder = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseResponse$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        int i5 = i4;
                        java.lang.CharSequence charSequence3 = charSequence;
                        java.lang.CharSequence charSequence4 = charSequence2;
                        io.ktor.http.cio.HttpHeadersMap httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                        return new io.ktor.http.cio.Response(charSequence4, i5, charSequence3, httpHeadersMap == null ? new io.ktor.http.cio.HttpHeadersMap(charArrayBuilder) : httpHeadersMap, charArrayBuilder);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
                mutableRange = (io.ktor.http.cio.internals.MutableRange) httpParserKt$parseResponse$1.getHighSpeedVideoSizes;
                charArrayBuilder2 = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) httpParserKt$parseResponse$1.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    charArrayBuilder = charArrayBuilder2;
                    charArrayBuilder.release();
                    throw th;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                mutableRange.setEnd(charArrayBuilder2.length());
                java.lang.CharSequence Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(charArrayBuilder2, mutableRange);
                io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder4 = charArrayBuilder2;
                io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charArrayBuilder4, mutableRange);
                int end = mutableRange.getEnd();
                int start = mutableRange.getStart();
                int end2 = mutableRange.getEnd();
                while (true) {
                    if (start >= end2) {
                        break;
                    }
                    charAt = charArrayBuilder4.charAt(start);
                    if (charAt == ' ') {
                        if (i2 < 100 || i2 > 999) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status-code must be 3-digit. Status received: ");
                            sb.append(i2);
                            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                            throw new io.ktor.http.cio.ParserException(sb.toString());
                        }
                        end = start;
                    } else {
                        if ('0' > charAt || charAt >= ':') {
                            break;
                        }
                        i2 = (i2 * 10) + (charAt - '0');
                        start++;
                    }
                }
                java.lang.String obj2 = charArrayBuilder4.subSequence(mutableRange.getStart(), io.ktor.http.cio.internals.TokenizerKt.findSpaceOrEnd(charArrayBuilder4, mutableRange)).toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Illegal digit ");
                sb2.append(charAt);
                sb2.append(" in status code ");
                sb2.append(obj2);
                throw new java.lang.NumberFormatException(sb2.toString());
            }
        }
        httpParserKt$parseResponse$1 = new io.ktor.http.cio.HttpParserKt$parseResponse$1(continuation);
        obj = httpParserKt$parseResponse$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseResponse$1.getHighSpeedVideoFpsRanges;
        int i22 = 0;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object parseHeaders(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpHeadersMap> continuation) {
        io.ktor.http.cio.HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$1;
        int i;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder;
        if (continuation instanceof io.ktor.http.cio.HttpParserKt$parseHeaders$1) {
            httpParserKt$parseHeaders$1 = (io.ktor.http.cio.HttpParserKt$parseHeaders$1) continuation;
            if ((httpParserKt$parseHeaders$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$1.Camera2StreamConfigurationMap -= 2147483648;
                io.ktor.http.cio.HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$12 = httpParserKt$parseHeaders$1;
                java.lang.Object obj = httpParserKt$parseHeaders$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseHeaders$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2 = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                    httpParserKt$parseHeaders$12.getHighSpeedVideoFpsRanges = charArrayBuilder2;
                    httpParserKt$parseHeaders$12.Camera2StreamConfigurationMap = 1;
                    java.lang.Object parseHeaders$default = parseHeaders$default(byteReadChannel, charArrayBuilder2, null, httpParserKt$parseHeaders$12, 4, null);
                    if (parseHeaders$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = parseHeaders$default;
                    charArrayBuilder = charArrayBuilder2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charArrayBuilder = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseHeaders$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.http.cio.HttpHeadersMap httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                return httpHeadersMap != null ? new io.ktor.http.cio.HttpHeadersMap(charArrayBuilder) : httpHeadersMap;
            }
        }
        httpParserKt$parseHeaders$1 = new io.ktor.http.cio.HttpParserKt$parseHeaders$1(continuation);
        io.ktor.http.cio.HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$122 = httpParserKt$parseHeaders$1;
        java.lang.Object obj2 = httpParserKt$parseHeaders$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseHeaders$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap2 = (io.ktor.http.cio.HttpHeadersMap) obj2;
        if (httpHeadersMap2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[Catch: all -> 0x010f, TryCatch #2 {all -> 0x010f, blocks: (B:14:0x0070, B:16:0x0079, B:19:0x007d, B:22:0x0091, B:33:0x00b1, B:34:0x00bc, B:35:0x00bd, B:37:0x00c9, B:39:0x00d5, B:41:0x00db, B:43:0x00eb, B:45:0x00ee, B:46:0x00fd, B:48:0x00fe, B:49:0x010d), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: all -> 0x010f, TryCatch #2 {all -> 0x010f, blocks: (B:14:0x0070, B:16:0x0079, B:19:0x007d, B:22:0x0091, B:33:0x00b1, B:34:0x00bc, B:35:0x00bd, B:37:0x00c9, B:39:0x00d5, B:41:0x00db, B:43:0x00eb, B:45:0x00ee, B:46:0x00fd, B:48:0x00fe, B:49:0x010d), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006c -> B:13:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object parseHeaders(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, io.ktor.http.cio.internals.MutableRange mutableRange, kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpHeadersMap> continuation) {
        io.ktor.http.cio.HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$2;
        int i;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        java.lang.Throwable th;
        java.lang.Object m23407readUTF8LineToRRvyBJ8;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap2;
        io.ktor.http.cio.HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$22;
        if (continuation instanceof io.ktor.http.cio.HttpParserKt$parseHeaders$2) {
            httpParserKt$parseHeaders$2 = (io.ktor.http.cio.HttpParserKt$parseHeaders$2) continuation;
            if ((httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = httpParserKt$parseHeaders$2.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpHeadersMap = new io.ktor.http.cio.HttpHeadersMap(charArrayBuilder);
                    int i2 = httpLineEndings;
                    httpParserKt$parseHeaders$2.Camera2StreamConfigurationMap = byteReadChannel;
                    httpParserKt$parseHeaders$2.getHighSpeedVideoSizes = charArrayBuilder;
                    httpParserKt$parseHeaders$2.getHighResolutionOutputSizeshNQ4ISI = mutableRange;
                    httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRangesFor = httpHeadersMap;
                    httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRanges = 1;
                    m23407readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i2, httpParserKt$parseHeaders$2);
                    if (m23407readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    io.ktor.http.cio.HttpHeadersMap httpHeadersMap3 = (io.ktor.http.cio.HttpHeadersMap) httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRangesFor;
                    io.ktor.http.cio.internals.MutableRange mutableRange2 = (io.ktor.http.cio.internals.MutableRange) httpParserKt$parseHeaders$2.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2 = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseHeaders$2.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) httpParserKt$parseHeaders$2.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.http.cio.HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$23 = httpParserKt$parseHeaders$2;
                        httpHeadersMap2 = httpHeadersMap3;
                        byteReadChannel = byteReadChannel2;
                        httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$23;
                        mutableRange = mutableRange2;
                        charArrayBuilder = charArrayBuilder2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        httpHeadersMap3.release();
                        throw th;
                    }
                    try {
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            httpHeadersMap2.release();
                            return null;
                        }
                        mutableRange.setEnd(charArrayBuilder.length());
                        int end = mutableRange.getEnd() - mutableRange.getStart();
                        if (end == 0) {
                            java.lang.CharSequence charSequence = httpHeadersMap2.get(io.ktor.http.HttpHeaders.INSTANCE.getHost());
                            if (charSequence != null) {
                                if (kotlin.text.StringsKt.endsWith$default(charSequence, (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.COLON, false, 2, (java.lang.Object) null)) {
                                    throw new io.ktor.http.cio.ParserException("Host header with ':' should contains port: ".concat(java.lang.String.valueOf(charSequence)));
                                }
                                for (int i3 = 0; i3 < charSequence.length(); i3++) {
                                    char charAt = charSequence.charAt(i3);
                                    java.util.Set<java.lang.Character> set = Camera2StreamConfigurationMap;
                                    if (set.contains(java.lang.Character.valueOf(charAt))) {
                                        throw new io.ktor.http.cio.ParserException("Host cannot contain any of the following symbols: ".concat(java.lang.String.valueOf(set)));
                                    }
                                }
                            }
                            return httpHeadersMap2;
                        }
                        if (end >= 8192) {
                            throw new java.lang.IllegalStateException("Header line length limit exceeded".toString());
                        }
                        int start = mutableRange.getStart();
                        int parseHeaderName = parseHeaderName(charArrayBuilder, mutableRange);
                        int end2 = mutableRange.getEnd();
                        parseHeaderValue(charArrayBuilder, mutableRange);
                        int start2 = mutableRange.getStart();
                        int end3 = mutableRange.getEnd();
                        mutableRange.setStart(end2);
                        httpHeadersMap2.put(start, parseHeaderName, start2, end3);
                        httpHeadersMap = httpHeadersMap2;
                        httpParserKt$parseHeaders$2 = httpParserKt$parseHeaders$22;
                        try {
                            int i22 = httpLineEndings;
                            httpParserKt$parseHeaders$2.Camera2StreamConfigurationMap = byteReadChannel;
                            httpParserKt$parseHeaders$2.getHighSpeedVideoSizes = charArrayBuilder;
                            httpParserKt$parseHeaders$2.getHighResolutionOutputSizeshNQ4ISI = mutableRange;
                            httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRangesFor = httpHeadersMap;
                            httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRanges = 1;
                            m23407readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i22, httpParserKt$parseHeaders$2);
                            if (m23407readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            io.ktor.http.cio.HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$24 = httpParserKt$parseHeaders$2;
                            httpHeadersMap2 = httpHeadersMap;
                            obj = m23407readUTF8LineToRRvyBJ8;
                            httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$24;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            httpHeadersMap3 = httpHeadersMap;
                            httpHeadersMap3.release();
                            throw th;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        httpHeadersMap3 = httpHeadersMap2;
                        httpHeadersMap3.release();
                        throw th;
                    }
                }
            }
        }
        httpParserKt$parseHeaders$2 = new io.ktor.http.cio.HttpParserKt$parseHeaders$2(continuation);
        java.lang.Object obj2 = httpParserKt$parseHeaders$2.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseHeaders$2.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object parseHeaders$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, io.ktor.http.cio.internals.MutableRange mutableRange, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            mutableRange = new io.ktor.http.cio.internals.MutableRange(0, 0);
        }
        return parseHeaders(byteReadChannel, charArrayBuilder, mutableRange, continuation);
    }

    private static final java.lang.CharSequence Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charSequence, mutableRange);
        if (mutableRange.getStart() >= mutableRange.getEnd()) {
            throw new java.lang.IllegalStateException("Failed to parse version: ".concat(java.lang.String.valueOf(charSequence)).toString());
        }
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.singleOrNull(io.ktor.http.cio.internals.AsciiCharTree.search$default(getHighSpeedVideoFpsRangesFor, charSequence, mutableRange.getStart(), mutableRange.getEnd(), false, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.HttpParserKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(io.ktor.http.cio.HttpParserKt.$r8$lambda$uBr6G0LrrSSTGO93sg30I2FqOHo(((java.lang.Character) obj).charValue(), ((java.lang.Integer) obj2).intValue()));
            }
        }, 8, null));
        if (str != null) {
            mutableRange.setStart(mutableRange.getStart() + str.length());
            return str;
        }
        throw new io.ktor.http.cio.ParserException("Unsupported HTTP version: ".concat(java.lang.String.valueOf(io.ktor.http.cio.internals.TokenizerKt.nextToken(charSequence, mutableRange))));
    }

    public static final int parseHeaderName(io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, io.ktor.http.cio.internals.MutableRange mutableRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charArrayBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableRange, "");
        int end = mutableRange.getEnd();
        for (int start = mutableRange.getStart(); start < end; start++) {
            char charAt = charArrayBuilder.charAt(start);
            if (charAt == ':' && start != mutableRange.getStart()) {
                mutableRange.setStart(start + 1);
                return start;
            }
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 32) <= 0 || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "\"(),/:;<=>?@[\\]{}", charAt, false, 2, (java.lang.Object) null)) {
                int start2 = mutableRange.getStart();
                if (charAt == ':') {
                    throw new io.ktor.http.cio.ParserException("Empty header names are not allowed as per RFC7230.");
                }
                if (start == start2) {
                    throw new io.ktor.http.cio.ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
                }
                Camera2StreamConfigurationMap(charArrayBuilder, charAt);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2 = charArrayBuilder;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No colon in HTTP header in ");
        sb.append(charArrayBuilder2.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString());
        sb.append(" in builder: \n");
        sb.append((java.lang.Object) charArrayBuilder2);
        throw new io.ktor.http.cio.ParserException(sb.toString());
    }

    public static final void parseHeaderValue(io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, io.ktor.http.cio.internals.MutableRange mutableRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charArrayBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableRange, "");
        int start = mutableRange.getStart();
        int end = mutableRange.getEnd();
        int skipSpacesAndHorizontalTabs = io.ktor.http.cio.internals.TokenizerKt.skipSpacesAndHorizontalTabs(charArrayBuilder, start, end);
        if (skipSpacesAndHorizontalTabs >= end) {
            mutableRange.setStart(end);
            return;
        }
        int i = skipSpacesAndHorizontalTabs;
        int i2 = i;
        while (i < end) {
            char charAt = charArrayBuilder.charAt(i);
            if (charAt != '\t') {
                if (charAt == '\n' || charAt == '\r') {
                    Camera2StreamConfigurationMap(charArrayBuilder, charAt);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (charAt != ' ') {
                    i2 = i;
                }
            }
            i++;
        }
        mutableRange.setStart(skipSpacesAndHorizontalTabs);
        mutableRange.setEnd(i2 + 1);
    }

    private static final java.lang.Void Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, char c) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Character with code ");
        sb.append(c & 255);
        sb.append(" is not allowed in header names, \n");
        sb.append((java.lang.Object) charSequence);
        throw new io.ktor.http.cio.ParserException(sb.toString());
    }
}
