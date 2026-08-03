package io.ktor.http.cio;

/* compiled from: HttpParser.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\b\u0010\u0004\u001a,\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\b\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010#\u001a/\u0010)\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010-\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010/\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b/\u00100\u001a\u0017\u00101\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b1\u00102\u001a\u0017\u00104\u001a\u00020(2\u0006\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00107\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020&0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\" \u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b>\u00107\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@\"\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/http/cio/Request;", "parseRequest", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/Response;", "parseResponse", "Lio/ktor/http/cio/HttpHeadersMap;", "parseHeaders", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "Lio/ktor/http/cio/internals/MutableRange;", "range", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "host", "", "validateHostHeader", "(Ljava/lang/CharSequence;)V", "text", "Lio/ktor/http/HttpMethod;", "parseHttpMethod", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Lio/ktor/http/HttpMethod;", "parseHttpMethodFull", "parseUri", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/CharSequence;", "parseVersion", "", "parseStatusCode", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)I", "code", "", "statusOutOfRange", "(I)Z", "parseHeaderName", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)I", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "start", "", "ch", "", "parseHeaderNameFailed", "(Lio/ktor/http/cio/internals/CharArrayBuilder;IIC)Ljava/lang/Void;", "parseHeaderValue", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)V", "noColonFound", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/Void;", "characterIsNotAllowed", "(Ljava/lang/CharSequence;C)Ljava/lang/Void;", "isDelimiter", "(C)Z", "result", "unsupportedHttpVersion", "(Ljava/lang/CharSequence;)Ljava/lang/Void;", "HTTP_LINE_LIMIT", "I", "HTTP_STATUS_CODE_MIN_RANGE", "HTTP_STATUS_CODE_MAX_RANGE", "", "hostForbiddenSymbols", "Ljava/util/Set;", "Lio/ktor/utils/io/LineEndingMode;", "httpLineEndings", "getHttpLineEndings", "()I", "getHttpLineEndings$annotations", "()V", "Lio/ktor/http/cio/internals/AsciiCharTree;", "", "versions", "Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpParserKt {
    private static final int HTTP_LINE_LIMIT = 8192;
    private static final int HTTP_STATUS_CODE_MAX_RANGE = 999;
    private static final int HTTP_STATUS_CODE_MIN_RANGE = 100;
    private static final java.util.Set<java.lang.Character> hostForbiddenSymbols = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator), '?', '#', '@'});
    private static final int httpLineEndings = io.ktor.utils.io.LineEndingMode.m10776plus1TerO4(io.ktor.utils.io.LineEndingMode.INSTANCE.m10781getCRLFf0jXZW8(), io.ktor.utils.io.LineEndingMode.INSTANCE.m10782getLFf0jXZW8());
    private static final io.ktor.http.cio.internals.AsciiCharTree<java.lang.String> versions = io.ktor.http.cio.internals.AsciiCharTree.INSTANCE.build(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"HTTP/1.0", "HTTP/1.1"}));

    public static /* synthetic */ void getHttpLineEndings$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseHttpMethod$lambda$1(char c, int i) {
        return c == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseVersion$lambda$3(char c, int i) {
        return c == ' ';
    }

    private static final boolean statusOutOfRange(int i) {
        return i < 100 || i > 999;
    }

    public static final int getHttpLineEndings() {
        return httpLineEndings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:12:0x003a, B:14:0x00f0, B:18:0x00f6, B:26:0x0090, B:29:0x0099, B:31:0x00aa, B:33:0x00cf, B:35:0x00d5, B:37:0x00db, B:41:0x00fe, B:42:0x0105, B:43:0x0106, B:44:0x010d, B:45:0x010e, B:46:0x0137, B:48:0x0077), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:12:0x003a, B:14:0x00f0, B:18:0x00f6, B:26:0x0090, B:29:0x0099, B:31:0x00aa, B:33:0x00cf, B:35:0x00d5, B:37:0x00db, B:41:0x00fe, B:42:0x0105, B:43:0x0106, B:44:0x010d, B:45:0x010e, B:46:0x0137, B:48:0x0077), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.http.cio.HttpParserKt$parseRequest$1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x008d -> B:26:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object parseRequest(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.Request> continuation) {
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder;
        int i;
        io.ktor.http.cio.internals.MutableRange mutableRange;
        io.ktor.http.cio.HttpParserKt$parseRequest$1 httpParserKt$parseRequest$1;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        java.lang.Object m10765readUTF8LineToRRvyBJ8;
        io.ktor.http.HttpMethod httpMethod;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        try {
            if (continuation instanceof io.ktor.http.cio.HttpParserKt$parseRequest$1) {
                io.ktor.http.cio.HttpParserKt$parseRequest$1 httpParserKt$parseRequest$12 = (io.ktor.http.cio.HttpParserKt$parseRequest$1) continuation;
                if ((httpParserKt$parseRequest$12.label & Integer.MIN_VALUE) != 0) {
                    httpParserKt$parseRequest$12.label -= Integer.MIN_VALUE;
                    charArrayBuilder = httpParserKt$parseRequest$12;
                    java.lang.Object obj = charArrayBuilder.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = charArrayBuilder.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder3 = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                        mutableRange = new io.ktor.http.cio.internals.MutableRange(0, 0);
                        httpParserKt$parseRequest$1 = charArrayBuilder;
                        charArrayBuilder2 = charArrayBuilder3;
                        byteReadChannel2 = byteReadChannel;
                        int i2 = httpLineEndings;
                        httpParserKt$parseRequest$1.L$0 = byteReadChannel2;
                        httpParserKt$parseRequest$1.L$1 = charArrayBuilder2;
                        httpParserKt$parseRequest$1.L$2 = mutableRange;
                        httpParserKt$parseRequest$1.label = 1;
                        m10765readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel2, charArrayBuilder2, 8192, i2, httpParserKt$parseRequest$1);
                        if (m10765readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.CharSequence charSequence3 = (java.lang.CharSequence) charArrayBuilder.L$3;
                            java.lang.CharSequence charSequence4 = (java.lang.CharSequence) charArrayBuilder.L$2;
                            io.ktor.http.HttpMethod httpMethod2 = (io.ktor.http.HttpMethod) charArrayBuilder.L$1;
                            charArrayBuilder2 = (io.ktor.http.cio.internals.CharArrayBuilder) charArrayBuilder.L$0;
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
                        io.ktor.http.cio.internals.MutableRange mutableRange2 = (io.ktor.http.cio.internals.MutableRange) charArrayBuilder.L$2;
                        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder4 = (io.ktor.http.cio.internals.CharArrayBuilder) charArrayBuilder.L$1;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) charArrayBuilder.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            httpParserKt$parseRequest$1 = charArrayBuilder;
                            charArrayBuilder2 = charArrayBuilder4;
                            mutableRange = mutableRange2;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                return null;
                            }
                            mutableRange.setEnd(charArrayBuilder2.length());
                            if (mutableRange.getStart() == mutableRange.getEnd()) {
                                byteReadChannel2 = byteReadChannel3;
                                int i22 = httpLineEndings;
                                httpParserKt$parseRequest$1.L$0 = byteReadChannel2;
                                httpParserKt$parseRequest$1.L$1 = charArrayBuilder2;
                                httpParserKt$parseRequest$1.L$2 = mutableRange;
                                httpParserKt$parseRequest$1.label = 1;
                                m10765readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel2, charArrayBuilder2, 8192, i22, httpParserKt$parseRequest$1);
                                if (m10765readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel3 = byteReadChannel2;
                                obj = m10765readUTF8LineToRRvyBJ8;
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                }
                            } else {
                                io.ktor.http.HttpMethod parseHttpMethod = parseHttpMethod(charArrayBuilder2, mutableRange);
                                java.lang.CharSequence parseUri = parseUri(charArrayBuilder2, mutableRange);
                                java.lang.CharSequence parseVersion = parseVersion(charArrayBuilder2, mutableRange);
                                io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charArrayBuilder2, mutableRange);
                                if (mutableRange.getStart() != mutableRange.getEnd()) {
                                    throw new io.ktor.http.cio.ParserException("Extra characters in request line: " + charArrayBuilder2.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString());
                                }
                                if (parseUri.length() == 0) {
                                    throw new io.ktor.http.cio.ParserException("URI is not specified");
                                }
                                if (parseVersion.length() == 0) {
                                    throw new io.ktor.http.cio.ParserException("HTTP version is not specified");
                                }
                                httpParserKt$parseRequest$1.L$0 = charArrayBuilder2;
                                httpParserKt$parseRequest$1.L$1 = parseHttpMethod;
                                httpParserKt$parseRequest$1.L$2 = parseUri;
                                httpParserKt$parseRequest$1.L$3 = parseVersion;
                                httpParserKt$parseRequest$1.label = 2;
                                java.lang.Object parseHeaders = parseHeaders(byteReadChannel3, charArrayBuilder2, mutableRange, httpParserKt$parseRequest$1);
                                if (parseHeaders == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                httpMethod = parseHttpMethod;
                                obj = parseHeaders;
                                charSequence = parseVersion;
                                charSequence2 = parseUri;
                                httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                                if (httpHeadersMap != null) {
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            charArrayBuilder = charArrayBuilder4;
                            charArrayBuilder.release();
                            throw th;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        charArrayBuilder = new io.ktor.http.cio.HttpParserKt$parseRequest$1(continuation);
        java.lang.Object obj2 = charArrayBuilder.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = charArrayBuilder.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0038, B:14:0x00d5, B:16:0x00d9, B:17:0x00e1), top: B:11:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:29:0x0057, B:30:0x0088, B:33:0x0091), top: B:28:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
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
        java.lang.CharSequence charSequence;
        int i2;
        java.lang.CharSequence charSequence2;
        if (continuation instanceof io.ktor.http.cio.HttpParserKt$parseResponse$1) {
            httpParserKt$parseResponse$1 = (io.ktor.http.cio.HttpParserKt$parseResponse$1) continuation;
            if ((httpParserKt$parseResponse$1.label & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseResponse$1.label -= Integer.MIN_VALUE;
                obj = httpParserKt$parseResponse$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseResponse$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder3 = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                    io.ktor.http.cio.internals.MutableRange mutableRange2 = new io.ktor.http.cio.internals.MutableRange(0, 0);
                    try {
                        int i3 = httpLineEndings;
                        httpParserKt$parseResponse$1.L$0 = byteReadChannel;
                        httpParserKt$parseResponse$1.L$1 = charArrayBuilder3;
                        httpParserKt$parseResponse$1.L$2 = mutableRange2;
                        httpParserKt$parseResponse$1.label = 1;
                        java.lang.Object m10765readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder3, 8192, i3, httpParserKt$parseResponse$1);
                        if (m10765readUTF8LineToRRvyBJ8 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel;
                        mutableRange = mutableRange2;
                        charArrayBuilder2 = charArrayBuilder3;
                        obj = m10765readUTF8LineToRRvyBJ8;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        charArrayBuilder = charArrayBuilder3;
                        charArrayBuilder.release();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = httpParserKt$parseResponse$1.I$0;
                        java.lang.CharSequence charSequence3 = (java.lang.CharSequence) httpParserKt$parseResponse$1.L$2;
                        java.lang.CharSequence charSequence4 = (java.lang.CharSequence) httpParserKt$parseResponse$1.L$1;
                        charArrayBuilder = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseResponse$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i2 = i4;
                            charSequence2 = charSequence3;
                            charSequence = charSequence4;
                            io.ktor.http.cio.HttpHeadersMap httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                            return new io.ktor.http.cio.Response(charSequence, i2, charSequence2, httpHeadersMap != null ? new io.ktor.http.cio.HttpHeadersMap(charArrayBuilder) : httpHeadersMap, charArrayBuilder);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            charArrayBuilder.release();
                            throw th;
                        }
                    }
                    mutableRange = (io.ktor.http.cio.internals.MutableRange) httpParserKt$parseResponse$1.L$2;
                    charArrayBuilder2 = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseResponse$1.L$1;
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) httpParserKt$parseResponse$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        charArrayBuilder = charArrayBuilder2;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                mutableRange.setEnd(charArrayBuilder2.length());
                java.lang.CharSequence parseVersion = parseVersion(charArrayBuilder2, mutableRange);
                int parseStatusCode = parseStatusCode(charArrayBuilder2, mutableRange);
                io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charArrayBuilder2, mutableRange);
                java.lang.CharSequence subSequence = charArrayBuilder2.subSequence(mutableRange.getStart(), mutableRange.getEnd());
                mutableRange.setStart(mutableRange.getEnd());
                httpParserKt$parseResponse$1.L$0 = charArrayBuilder2;
                httpParserKt$parseResponse$1.L$1 = parseVersion;
                httpParserKt$parseResponse$1.L$2 = subSequence;
                httpParserKt$parseResponse$1.I$0 = parseStatusCode;
                httpParserKt$parseResponse$1.label = 2;
                java.lang.Object parseHeaders = parseHeaders(byteReadChannel2, charArrayBuilder2, mutableRange, httpParserKt$parseResponse$1);
                if (parseHeaders == coroutine_suspended) {
                    return coroutine_suspended;
                }
                charSequence = parseVersion;
                charArrayBuilder = charArrayBuilder2;
                i2 = parseStatusCode;
                charSequence2 = subSequence;
                obj = parseHeaders;
                io.ktor.http.cio.HttpHeadersMap httpHeadersMap2 = (io.ktor.http.cio.HttpHeadersMap) obj;
                return new io.ktor.http.cio.Response(charSequence, i2, charSequence2, httpHeadersMap2 != null ? new io.ktor.http.cio.HttpHeadersMap(charArrayBuilder) : httpHeadersMap2, charArrayBuilder);
            }
        }
        httpParserKt$parseResponse$1 = new io.ktor.http.cio.HttpParserKt$parseResponse$1(continuation);
        obj = httpParserKt$parseResponse$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseResponse$1.label;
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
            if ((httpParserKt$parseHeaders$1.label & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$1.label -= Integer.MIN_VALUE;
                io.ktor.http.cio.HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$12 = httpParserKt$parseHeaders$1;
                java.lang.Object obj = httpParserKt$parseHeaders$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseHeaders$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2 = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                    httpParserKt$parseHeaders$12.L$0 = charArrayBuilder2;
                    httpParserKt$parseHeaders$12.label = 1;
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
                    charArrayBuilder = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseHeaders$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.http.cio.HttpHeadersMap httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                return httpHeadersMap != null ? new io.ktor.http.cio.HttpHeadersMap(charArrayBuilder) : httpHeadersMap;
            }
        }
        httpParserKt$parseHeaders$1 = new io.ktor.http.cio.HttpParserKt$parseHeaders$1(continuation);
        io.ktor.http.cio.HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$122 = httpParserKt$parseHeaders$1;
        java.lang.Object obj2 = httpParserKt$parseHeaders$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseHeaders$122.label;
        if (i != 0) {
        }
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap2 = (io.ktor.http.cio.HttpHeadersMap) obj2;
        if (httpHeadersMap2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:14:0x0070, B:16:0x0078, B:19:0x007d, B:22:0x0091, B:33:0x00b1, B:34:0x00bc, B:35:0x00bd, B:37:0x00c9), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:14:0x0070, B:16:0x0078, B:19:0x007d, B:22:0x0091, B:33:0x00b1, B:34:0x00bc, B:35:0x00bd, B:37:0x00c9), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e  */
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
        java.lang.Object m10765readUTF8LineToRRvyBJ8;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap2;
        io.ktor.http.cio.HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$22;
        if (continuation instanceof io.ktor.http.cio.HttpParserKt$parseHeaders$2) {
            httpParserKt$parseHeaders$2 = (io.ktor.http.cio.HttpParserKt$parseHeaders$2) continuation;
            if ((httpParserKt$parseHeaders$2.label & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpParserKt$parseHeaders$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseHeaders$2.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpHeadersMap = new io.ktor.http.cio.HttpHeadersMap(charArrayBuilder);
                    int i2 = httpLineEndings;
                    httpParserKt$parseHeaders$2.L$0 = byteReadChannel;
                    httpParserKt$parseHeaders$2.L$1 = charArrayBuilder;
                    httpParserKt$parseHeaders$2.L$2 = mutableRange;
                    httpParserKt$parseHeaders$2.L$3 = httpHeadersMap;
                    httpParserKt$parseHeaders$2.label = 1;
                    m10765readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i2, httpParserKt$parseHeaders$2);
                    if (m10765readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    io.ktor.http.cio.HttpHeadersMap httpHeadersMap3 = (io.ktor.http.cio.HttpHeadersMap) httpParserKt$parseHeaders$2.L$3;
                    io.ktor.http.cio.internals.MutableRange mutableRange2 = (io.ktor.http.cio.internals.MutableRange) httpParserKt$parseHeaders$2.L$2;
                    io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2 = (io.ktor.http.cio.internals.CharArrayBuilder) httpParserKt$parseHeaders$2.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) httpParserKt$parseHeaders$2.L$0;
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
                                validateHostHeader(charSequence);
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
                            httpParserKt$parseHeaders$2.L$0 = byteReadChannel;
                            httpParserKt$parseHeaders$2.L$1 = charArrayBuilder;
                            httpParserKt$parseHeaders$2.L$2 = mutableRange;
                            httpParserKt$parseHeaders$2.L$3 = httpHeadersMap;
                            httpParserKt$parseHeaders$2.label = 1;
                            m10765readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i22, httpParserKt$parseHeaders$2);
                            if (m10765readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            io.ktor.http.cio.HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$24 = httpParserKt$parseHeaders$2;
                            httpHeadersMap2 = httpHeadersMap;
                            obj = m10765readUTF8LineToRRvyBJ8;
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
        java.lang.Object obj2 = httpParserKt$parseHeaders$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseHeaders$2.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object parseHeaders$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, io.ktor.http.cio.internals.MutableRange mutableRange, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            mutableRange = new io.ktor.http.cio.internals.MutableRange(0, 0);
        }
        return parseHeaders(byteReadChannel, charArrayBuilder, mutableRange, continuation);
    }

    private static final void validateHostHeader(java.lang.CharSequence charSequence) {
        if (kotlin.text.StringsKt.endsWith$default(charSequence, (java.lang.CharSequence) ":", false, 2, (java.lang.Object) null)) {
            throw new io.ktor.http.cio.ParserException("Host header with ':' should contains port: " + ((java.lang.Object) charSequence));
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            java.util.Set<java.lang.Character> set = hostForbiddenSymbols;
            if (set.contains(java.lang.Character.valueOf(charAt))) {
                throw new io.ktor.http.cio.ParserException("Host cannot contain any of the following symbols: " + set);
            }
        }
    }

    private static final io.ktor.http.HttpMethod parseHttpMethod(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charSequence, mutableRange);
        io.ktor.http.HttpMethod httpMethod = (io.ktor.http.HttpMethod) kotlin.collections.CollectionsKt.singleOrNull(io.ktor.http.cio.internals.AsciiCharTree.search$default(io.ktor.http.cio.internals.CharsKt.getDefaultHttpMethods(), charSequence, mutableRange.getStart(), mutableRange.getEnd(), false, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.HttpParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean parseHttpMethod$lambda$1;
                parseHttpMethod$lambda$1 = io.ktor.http.cio.HttpParserKt.parseHttpMethod$lambda$1(((java.lang.Character) obj).charValue(), ((java.lang.Integer) obj2).intValue());
                return java.lang.Boolean.valueOf(parseHttpMethod$lambda$1);
            }
        }, 8, null));
        if (httpMethod != null) {
            mutableRange.setStart(mutableRange.getStart() + httpMethod.getValue().length());
            return httpMethod;
        }
        return parseHttpMethodFull(charSequence, mutableRange);
    }

    private static final io.ktor.http.HttpMethod parseHttpMethodFull(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        return new io.ktor.http.HttpMethod(io.ktor.http.cio.internals.TokenizerKt.nextToken(charSequence, mutableRange).toString());
    }

    private static final java.lang.CharSequence parseUri(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charSequence, mutableRange);
        int start = mutableRange.getStart();
        int findSpaceOrEnd = io.ktor.http.cio.internals.TokenizerKt.findSpaceOrEnd(charSequence, mutableRange);
        int i = findSpaceOrEnd - start;
        if (i <= 0) {
            return "";
        }
        if (i == 1 && charSequence.charAt(start) == '/') {
            mutableRange.setStart(findSpaceOrEnd);
            return com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
        }
        java.lang.CharSequence subSequence = charSequence.subSequence(start, findSpaceOrEnd);
        mutableRange.setStart(findSpaceOrEnd);
        return subSequence;
    }

    private static final java.lang.CharSequence parseVersion(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charSequence, mutableRange);
        if (mutableRange.getStart() >= mutableRange.getEnd()) {
            throw new java.lang.IllegalStateException(("Failed to parse version: " + ((java.lang.Object) charSequence)).toString());
        }
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.singleOrNull(io.ktor.http.cio.internals.AsciiCharTree.search$default(versions, charSequence, mutableRange.getStart(), mutableRange.getEnd(), false, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.HttpParserKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean parseVersion$lambda$3;
                parseVersion$lambda$3 = io.ktor.http.cio.HttpParserKt.parseVersion$lambda$3(((java.lang.Character) obj).charValue(), ((java.lang.Integer) obj2).intValue());
                return java.lang.Boolean.valueOf(parseVersion$lambda$3);
            }
        }, 8, null));
        if (str != null) {
            mutableRange.setStart(mutableRange.getStart() + str.length());
            return str;
        }
        unsupportedHttpVersion(io.ktor.http.cio.internals.TokenizerKt.nextToken(charSequence, mutableRange));
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        r7.setStart(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int parseStatusCode(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        char charAt;
        io.ktor.http.cio.internals.TokenizerKt.skipSpaces(charSequence, mutableRange);
        int end = mutableRange.getEnd();
        int start = mutableRange.getStart();
        int end2 = mutableRange.getEnd();
        int i = 0;
        while (true) {
            if (start >= end2) {
                break;
            }
            charAt = charSequence.charAt(start);
            if (charAt == ' ') {
                if (statusOutOfRange(i)) {
                    throw new io.ktor.http.cio.ParserException("Status-code must be 3-digit. Status received: " + i + '.');
                }
                end = start;
            } else {
                if ('0' > charAt || charAt >= ':') {
                    break;
                }
                i = (i * 10) + (charAt - '0');
                start++;
            }
        }
        throw new java.lang.NumberFormatException("Illegal digit " + charAt + " in status code " + charSequence.subSequence(mutableRange.getStart(), io.ktor.http.cio.internals.TokenizerKt.findSpaceOrEnd(charSequence, mutableRange)).toString());
    }

    public static final int parseHeaderName(io.ktor.http.cio.internals.CharArrayBuilder text, io.ktor.http.cio.internals.MutableRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        int end = range.getEnd();
        for (int start = range.getStart(); start < end; start++) {
            char charAt = text.charAt(start);
            if (charAt == ':' && start != range.getStart()) {
                range.setStart(start + 1);
                return start;
            }
            if (isDelimiter(charAt)) {
                parseHeaderNameFailed(text, start, range.getStart(), charAt);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        noColonFound(text, range);
        throw new kotlin.KotlinNothingValueException();
    }

    private static final java.lang.Void parseHeaderNameFailed(io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, int i, int i2, char c) {
        if (c == ':') {
            throw new io.ktor.http.cio.ParserException("Empty header names are not allowed as per RFC7230.");
        }
        if (i == i2) {
            throw new io.ktor.http.cio.ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        characterIsNotAllowed(charArrayBuilder, c);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final void parseHeaderValue(io.ktor.http.cio.internals.CharArrayBuilder text, io.ktor.http.cio.internals.MutableRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        int start = range.getStart();
        int end = range.getEnd();
        int skipSpacesAndHorizontalTabs = io.ktor.http.cio.internals.TokenizerKt.skipSpacesAndHorizontalTabs(text, start, end);
        if (skipSpacesAndHorizontalTabs >= end) {
            range.setStart(end);
            return;
        }
        int i = skipSpacesAndHorizontalTabs;
        int i2 = i;
        while (i < end) {
            char charAt = text.charAt(i);
            if (charAt != '\t') {
                if (charAt == '\n' || charAt == '\r') {
                    characterIsNotAllowed(text, charAt);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (charAt != ' ') {
                    i2 = i;
                }
            }
            i++;
        }
        range.setStart(skipSpacesAndHorizontalTabs);
        range.setEnd(i2 + 1);
    }

    private static final java.lang.Void noColonFound(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        throw new io.ktor.http.cio.ParserException("No colon in HTTP header in " + charSequence.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString() + " in builder: \n" + ((java.lang.Object) charSequence));
    }

    private static final java.lang.Void characterIsNotAllowed(java.lang.CharSequence charSequence, char c) {
        throw new io.ktor.http.cio.ParserException("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((java.lang.Object) charSequence));
    }

    private static final boolean isDelimiter(char c) {
        return kotlin.jvm.internal.Intrinsics.compare((int) c, 32) <= 0 || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "\"(),/:;<=>?@[\\]{}", c, false, 2, (java.lang.Object) null);
    }

    private static final java.lang.Void unsupportedHttpVersion(java.lang.CharSequence charSequence) {
        throw new io.ktor.http.cio.ParserException("Unsupported HTTP version: " + ((java.lang.Object) charSequence));
    }
}
