package io.ktor.http.cio;

import com.tiktok.appevents.edp.TTEDPEventConstants;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.http.cio.internals.MutableRange;
import io.ktor.http.cio.internals.TokenizerKt;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.LineEndingMode;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;

/* compiled from: HttpParser.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\b\u0010\u0004\u001a,\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\b\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010#\u001a/\u0010)\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010-\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010/\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b/\u00100\u001a\u0017\u00101\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b1\u00102\u001a\u0017\u00104\u001a\u00020(2\u0006\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00107\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020&0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\" \u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b>\u00107\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@\"\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/http/cio/Request;", "parseRequest", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/Response;", "parseResponse", "Lio/ktor/http/cio/HttpHeadersMap;", "parseHeaders", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "Lio/ktor/http/cio/internals/MutableRange;", "range", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "host", "", "validateHostHeader", "(Ljava/lang/CharSequence;)V", "text", "Lio/ktor/http/HttpMethod;", "parseHttpMethod", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Lio/ktor/http/HttpMethod;", "parseHttpMethodFull", "parseUri", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/CharSequence;", "parseVersion", "", "parseStatusCode", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)I", TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "", "statusOutOfRange", "(I)Z", "parseHeaderName", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)I", "index", "start", "", "ch", "", "parseHeaderNameFailed", "(Lio/ktor/http/cio/internals/CharArrayBuilder;IIC)Ljava/lang/Void;", "parseHeaderValue", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)V", "noColonFound", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/Void;", "characterIsNotAllowed", "(Ljava/lang/CharSequence;C)Ljava/lang/Void;", "isDelimiter", "(C)Z", "result", "unsupportedHttpVersion", "(Ljava/lang/CharSequence;)Ljava/lang/Void;", "HTTP_LINE_LIMIT", "I", "HTTP_STATUS_CODE_MIN_RANGE", "HTTP_STATUS_CODE_MAX_RANGE", "", "hostForbiddenSymbols", "Ljava/util/Set;", "Lio/ktor/utils/io/LineEndingMode;", "httpLineEndings", "getHttpLineEndings", "()I", "getHttpLineEndings$annotations", "()V", "Lio/ktor/http/cio/internals/AsciiCharTree;", "", "versions", "Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpParserKt {
    private static final int HTTP_LINE_LIMIT = 8192;
    private static final int HTTP_STATUS_CODE_MAX_RANGE = 999;
    private static final int HTTP_STATUS_CODE_MIN_RANGE = 100;
    private static final Set<Character> hostForbiddenSymbols = SetsKt.setOf((Object[]) new Character[]{Character.valueOf(FileSystemKt.UnixPathSeparator), '?', '#', '@'});
    private static final int httpLineEndings = LineEndingMode.m8057plus1TerO4(LineEndingMode.INSTANCE.m8062getCRLFf0jXZW8(), LineEndingMode.INSTANCE.m8063getLFf0jXZW8());
    private static final AsciiCharTree<String> versions = AsciiCharTree.INSTANCE.build(CollectionsKt.listOf((Object[]) new String[]{"HTTP/1.0", "HTTP/1.1"}));

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
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:12:0x003a, B:14:0x00f0, B:18:0x00f6, B:26:0x0090, B:29:0x0099, B:31:0x00aa, B:33:0x00cf, B:35:0x00d5, B:37:0x00db, B:41:0x00fe, B:42:0x0105, B:43:0x0106, B:44:0x010d, B:45:0x010e, B:46:0x0139, B:48:0x0077), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:12:0x003a, B:14:0x00f0, B:18:0x00f6, B:26:0x0090, B:29:0x0099, B:31:0x00aa, B:33:0x00cf, B:35:0x00d5, B:37:0x00db, B:41:0x00fe, B:42:0x0105, B:43:0x0106, B:44:0x010d, B:45:0x010e, B:46:0x0139, B:48:0x0077), top: B:7:0x0024 }] */
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
    public static final Object parseRequest(ByteReadChannel byteReadChannel, Continuation<? super Request> continuation) {
        CharArrayBuilder charArrayBuilder;
        int i;
        MutableRange mutableRange;
        HttpParserKt$parseRequest$1 httpParserKt$parseRequest$1;
        CharArrayBuilder charArrayBuilder2;
        ByteReadChannel byteReadChannel2;
        Object m8046readUTF8LineToRRvyBJ8;
        HttpMethod httpMethod;
        CharSequence charSequence;
        CharSequence charSequence2;
        HttpHeadersMap httpHeadersMap;
        try {
            if (continuation instanceof HttpParserKt$parseRequest$1) {
                HttpParserKt$parseRequest$1 httpParserKt$parseRequest$12 = (HttpParserKt$parseRequest$1) continuation;
                if ((httpParserKt$parseRequest$12.label & Integer.MIN_VALUE) != 0) {
                    httpParserKt$parseRequest$12.label -= Integer.MIN_VALUE;
                    charArrayBuilder = httpParserKt$parseRequest$12;
                    Object obj = charArrayBuilder.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = charArrayBuilder.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        CharArrayBuilder charArrayBuilder3 = new CharArrayBuilder(null, 1, null);
                        mutableRange = new MutableRange(0, 0);
                        httpParserKt$parseRequest$1 = charArrayBuilder;
                        charArrayBuilder2 = charArrayBuilder3;
                        byteReadChannel2 = byteReadChannel;
                        int i2 = httpLineEndings;
                        httpParserKt$parseRequest$1.L$0 = byteReadChannel2;
                        httpParserKt$parseRequest$1.L$1 = charArrayBuilder2;
                        httpParserKt$parseRequest$1.L$2 = mutableRange;
                        httpParserKt$parseRequest$1.label = 1;
                        m8046readUTF8LineToRRvyBJ8 = ByteReadChannelOperationsKt.m8046readUTF8LineToRRvyBJ8(byteReadChannel2, charArrayBuilder2, 8192, i2, httpParserKt$parseRequest$1);
                        if (m8046readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            CharSequence charSequence3 = (CharSequence) charArrayBuilder.L$3;
                            CharSequence charSequence4 = (CharSequence) charArrayBuilder.L$2;
                            HttpMethod httpMethod2 = (HttpMethod) charArrayBuilder.L$1;
                            charArrayBuilder2 = (CharArrayBuilder) charArrayBuilder.L$0;
                            ResultKt.throwOnFailure(obj);
                            charSequence = charSequence3;
                            charSequence2 = charSequence4;
                            httpMethod = httpMethod2;
                            httpHeadersMap = (HttpHeadersMap) obj;
                            if (httpHeadersMap != null) {
                                return null;
                            }
                            return new Request(httpMethod, charSequence2, charSequence, httpHeadersMap, charArrayBuilder2);
                        }
                        MutableRange mutableRange2 = (MutableRange) charArrayBuilder.L$2;
                        CharArrayBuilder charArrayBuilder4 = (CharArrayBuilder) charArrayBuilder.L$1;
                        ByteReadChannel byteReadChannel3 = (ByteReadChannel) charArrayBuilder.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            httpParserKt$parseRequest$1 = charArrayBuilder;
                            charArrayBuilder2 = charArrayBuilder4;
                            mutableRange = mutableRange2;
                            if (((Boolean) obj).booleanValue()) {
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
                                m8046readUTF8LineToRRvyBJ8 = ByteReadChannelOperationsKt.m8046readUTF8LineToRRvyBJ8(byteReadChannel2, charArrayBuilder2, 8192, i22, httpParserKt$parseRequest$1);
                                if (m8046readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel3 = byteReadChannel2;
                                obj = m8046readUTF8LineToRRvyBJ8;
                                if (((Boolean) obj).booleanValue()) {
                                }
                            } else {
                                HttpMethod parseHttpMethod = parseHttpMethod(charArrayBuilder2, mutableRange);
                                CharSequence parseUri = parseUri(charArrayBuilder2, mutableRange);
                                CharSequence parseVersion = parseVersion(charArrayBuilder2, mutableRange);
                                TokenizerKt.skipSpaces(charArrayBuilder2, mutableRange);
                                if (mutableRange.getStart() != mutableRange.getEnd()) {
                                    throw new ParserException("Extra characters in request line: " + charArrayBuilder2.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString());
                                }
                                if (parseUri.length() == 0) {
                                    throw new ParserException("URI is not specified");
                                }
                                if (parseVersion.length() == 0) {
                                    throw new ParserException("HTTP version is not specified");
                                }
                                httpParserKt$parseRequest$1.L$0 = charArrayBuilder2;
                                httpParserKt$parseRequest$1.L$1 = parseHttpMethod;
                                httpParserKt$parseRequest$1.L$2 = parseUri;
                                httpParserKt$parseRequest$1.L$3 = parseVersion;
                                httpParserKt$parseRequest$1.label = 2;
                                Object parseHeaders = parseHeaders(byteReadChannel3, charArrayBuilder2, mutableRange, httpParserKt$parseRequest$1);
                                if (parseHeaders == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                httpMethod = parseHttpMethod;
                                obj = parseHeaders;
                                charSequence = parseVersion;
                                charSequence2 = parseUri;
                                httpHeadersMap = (HttpHeadersMap) obj;
                                if (httpHeadersMap != null) {
                                }
                            }
                        } catch (Throwable th) {
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
        } catch (Throwable th2) {
            th = th2;
        }
        charArrayBuilder = new HttpParserKt$parseRequest$1(continuation);
        Object obj2 = charArrayBuilder.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final Object parseResponse(ByteReadChannel byteReadChannel, Continuation<? super Response> continuation) {
        HttpParserKt$parseResponse$1 httpParserKt$parseResponse$1;
        Object obj;
        int i;
        CharArrayBuilder charArrayBuilder;
        ByteReadChannel byteReadChannel2;
        MutableRange mutableRange;
        CharArrayBuilder charArrayBuilder2;
        CharSequence charSequence;
        int i2;
        CharSequence charSequence2;
        if (continuation instanceof HttpParserKt$parseResponse$1) {
            httpParserKt$parseResponse$1 = (HttpParserKt$parseResponse$1) continuation;
            if ((httpParserKt$parseResponse$1.label & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseResponse$1.label -= Integer.MIN_VALUE;
                obj = httpParserKt$parseResponse$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseResponse$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CharArrayBuilder charArrayBuilder3 = new CharArrayBuilder(null, 1, null);
                    MutableRange mutableRange2 = new MutableRange(0, 0);
                    try {
                        int i3 = httpLineEndings;
                        httpParserKt$parseResponse$1.L$0 = byteReadChannel;
                        httpParserKt$parseResponse$1.L$1 = charArrayBuilder3;
                        httpParserKt$parseResponse$1.L$2 = mutableRange2;
                        httpParserKt$parseResponse$1.label = 1;
                        Object m8046readUTF8LineToRRvyBJ8 = ByteReadChannelOperationsKt.m8046readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder3, 8192, i3, httpParserKt$parseResponse$1);
                        if (m8046readUTF8LineToRRvyBJ8 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel;
                        mutableRange = mutableRange2;
                        charArrayBuilder2 = charArrayBuilder3;
                        obj = m8046readUTF8LineToRRvyBJ8;
                    } catch (Throwable th) {
                        th = th;
                        charArrayBuilder = charArrayBuilder3;
                        charArrayBuilder.release();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = httpParserKt$parseResponse$1.I$0;
                        CharSequence charSequence3 = (CharSequence) httpParserKt$parseResponse$1.L$2;
                        CharSequence charSequence4 = (CharSequence) httpParserKt$parseResponse$1.L$1;
                        charArrayBuilder = (CharArrayBuilder) httpParserKt$parseResponse$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            i2 = i4;
                            charSequence2 = charSequence3;
                            charSequence = charSequence4;
                            HttpHeadersMap httpHeadersMap = (HttpHeadersMap) obj;
                            return new Response(charSequence, i2, charSequence2, httpHeadersMap != null ? new HttpHeadersMap(charArrayBuilder) : httpHeadersMap, charArrayBuilder);
                        } catch (Throwable th2) {
                            th = th2;
                            charArrayBuilder.release();
                            throw th;
                        }
                    }
                    mutableRange = (MutableRange) httpParserKt$parseResponse$1.L$2;
                    charArrayBuilder2 = (CharArrayBuilder) httpParserKt$parseResponse$1.L$1;
                    byteReadChannel2 = (ByteReadChannel) httpParserKt$parseResponse$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        charArrayBuilder = charArrayBuilder2;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                mutableRange.setEnd(charArrayBuilder2.length());
                CharSequence parseVersion = parseVersion(charArrayBuilder2, mutableRange);
                int parseStatusCode = parseStatusCode(charArrayBuilder2, mutableRange);
                TokenizerKt.skipSpaces(charArrayBuilder2, mutableRange);
                CharSequence subSequence = charArrayBuilder2.subSequence(mutableRange.getStart(), mutableRange.getEnd());
                mutableRange.setStart(mutableRange.getEnd());
                httpParserKt$parseResponse$1.L$0 = charArrayBuilder2;
                httpParserKt$parseResponse$1.L$1 = parseVersion;
                httpParserKt$parseResponse$1.L$2 = subSequence;
                httpParserKt$parseResponse$1.I$0 = parseStatusCode;
                httpParserKt$parseResponse$1.label = 2;
                Object parseHeaders = parseHeaders(byteReadChannel2, charArrayBuilder2, mutableRange, httpParserKt$parseResponse$1);
                if (parseHeaders == coroutine_suspended) {
                    return coroutine_suspended;
                }
                charSequence = parseVersion;
                charArrayBuilder = charArrayBuilder2;
                i2 = parseStatusCode;
                charSequence2 = subSequence;
                obj = parseHeaders;
                HttpHeadersMap httpHeadersMap2 = (HttpHeadersMap) obj;
                return new Response(charSequence, i2, charSequence2, httpHeadersMap2 != null ? new HttpHeadersMap(charArrayBuilder) : httpHeadersMap2, charArrayBuilder);
            }
        }
        httpParserKt$parseResponse$1 = new HttpParserKt$parseResponse$1(continuation);
        obj = httpParserKt$parseResponse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseResponse$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object parseHeaders(ByteReadChannel byteReadChannel, Continuation<? super HttpHeadersMap> continuation) {
        HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$1;
        int i;
        CharArrayBuilder charArrayBuilder;
        if (continuation instanceof HttpParserKt$parseHeaders$1) {
            httpParserKt$parseHeaders$1 = (HttpParserKt$parseHeaders$1) continuation;
            if ((httpParserKt$parseHeaders$1.label & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$1.label -= Integer.MIN_VALUE;
                HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$12 = httpParserKt$parseHeaders$1;
                Object obj = httpParserKt$parseHeaders$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseHeaders$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CharArrayBuilder charArrayBuilder2 = new CharArrayBuilder(null, 1, null);
                    httpParserKt$parseHeaders$12.L$0 = charArrayBuilder2;
                    httpParserKt$parseHeaders$12.label = 1;
                    Object parseHeaders$default = parseHeaders$default(byteReadChannel, charArrayBuilder2, null, httpParserKt$parseHeaders$12, 4, null);
                    if (parseHeaders$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = parseHeaders$default;
                    charArrayBuilder = charArrayBuilder2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charArrayBuilder = (CharArrayBuilder) httpParserKt$parseHeaders$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HttpHeadersMap httpHeadersMap = (HttpHeadersMap) obj;
                return httpHeadersMap != null ? new HttpHeadersMap(charArrayBuilder) : httpHeadersMap;
            }
        }
        httpParserKt$parseHeaders$1 = new HttpParserKt$parseHeaders$1(continuation);
        HttpParserKt$parseHeaders$1 httpParserKt$parseHeaders$122 = httpParserKt$parseHeaders$1;
        Object obj2 = httpParserKt$parseHeaders$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseHeaders$122.label;
        if (i != 0) {
        }
        HttpHeadersMap httpHeadersMap2 = (HttpHeadersMap) obj2;
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
    public static final Object parseHeaders(ByteReadChannel byteReadChannel, CharArrayBuilder charArrayBuilder, MutableRange mutableRange, Continuation<? super HttpHeadersMap> continuation) {
        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$2;
        int i;
        HttpHeadersMap httpHeadersMap;
        Throwable th;
        Object m8046readUTF8LineToRRvyBJ8;
        HttpHeadersMap httpHeadersMap2;
        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$22;
        if (continuation instanceof HttpParserKt$parseHeaders$2) {
            httpParserKt$parseHeaders$2 = (HttpParserKt$parseHeaders$2) continuation;
            if ((httpParserKt$parseHeaders$2.label & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$2.label -= Integer.MIN_VALUE;
                Object obj = httpParserKt$parseHeaders$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseHeaders$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    httpHeadersMap = new HttpHeadersMap(charArrayBuilder);
                    int i2 = httpLineEndings;
                    httpParserKt$parseHeaders$2.L$0 = byteReadChannel;
                    httpParserKt$parseHeaders$2.L$1 = charArrayBuilder;
                    httpParserKt$parseHeaders$2.L$2 = mutableRange;
                    httpParserKt$parseHeaders$2.L$3 = httpHeadersMap;
                    httpParserKt$parseHeaders$2.label = 1;
                    m8046readUTF8LineToRRvyBJ8 = ByteReadChannelOperationsKt.m8046readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i2, httpParserKt$parseHeaders$2);
                    if (m8046readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    HttpHeadersMap httpHeadersMap3 = (HttpHeadersMap) httpParserKt$parseHeaders$2.L$3;
                    MutableRange mutableRange2 = (MutableRange) httpParserKt$parseHeaders$2.L$2;
                    CharArrayBuilder charArrayBuilder2 = (CharArrayBuilder) httpParserKt$parseHeaders$2.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) httpParserKt$parseHeaders$2.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$23 = httpParserKt$parseHeaders$2;
                        httpHeadersMap2 = httpHeadersMap3;
                        byteReadChannel = byteReadChannel2;
                        httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$23;
                        mutableRange = mutableRange2;
                        charArrayBuilder = charArrayBuilder2;
                    } catch (Throwable th2) {
                        th = th2;
                        httpHeadersMap3.release();
                        throw th;
                    }
                    try {
                        if (((Boolean) obj).booleanValue()) {
                            httpHeadersMap2.release();
                            return null;
                        }
                        mutableRange.setEnd(charArrayBuilder.length());
                        int end = mutableRange.getEnd() - mutableRange.getStart();
                        if (end == 0) {
                            CharSequence charSequence = httpHeadersMap2.get(HttpHeaders.INSTANCE.getHost());
                            if (charSequence != null) {
                                validateHostHeader(charSequence);
                            }
                            return httpHeadersMap2;
                        }
                        if (end >= 8192) {
                            throw new IllegalStateException("Header line length limit exceeded".toString());
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
                            m8046readUTF8LineToRRvyBJ8 = ByteReadChannelOperationsKt.m8046readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i22, httpParserKt$parseHeaders$2);
                            if (m8046readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$24 = httpParserKt$parseHeaders$2;
                            httpHeadersMap2 = httpHeadersMap;
                            obj = m8046readUTF8LineToRRvyBJ8;
                            httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$24;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            httpHeadersMap3 = httpHeadersMap;
                            httpHeadersMap3.release();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpHeadersMap3 = httpHeadersMap2;
                        httpHeadersMap3.release();
                        throw th;
                    }
                }
            }
        }
        httpParserKt$parseHeaders$2 = new HttpParserKt$parseHeaders$2(continuation);
        Object obj2 = httpParserKt$parseHeaders$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseHeaders$2.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object parseHeaders$default(ByteReadChannel byteReadChannel, CharArrayBuilder charArrayBuilder, MutableRange mutableRange, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            mutableRange = new MutableRange(0, 0);
        }
        return parseHeaders(byteReadChannel, charArrayBuilder, mutableRange, continuation);
    }

    private static final void validateHostHeader(CharSequence charSequence) {
        if (StringsKt.endsWith$default(charSequence, (CharSequence) ServerSentEventKt.COLON, false, 2, (Object) null)) {
            throw new ParserException("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Set<Character> set = hostForbiddenSymbols;
            if (set.contains(Character.valueOf(charAt))) {
                throw new ParserException("Host cannot contain any of the following symbols: " + set);
            }
        }
    }

    private static final HttpMethod parseHttpMethod(CharSequence charSequence, MutableRange mutableRange) {
        TokenizerKt.skipSpaces(charSequence, mutableRange);
        HttpMethod httpMethod = (HttpMethod) CollectionsKt.singleOrNull(AsciiCharTree.search$default(CharsKt.getDefaultHttpMethods(), charSequence, mutableRange.getStart(), mutableRange.getEnd(), false, new Function2() { // from class: io.ktor.http.cio.HttpParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean parseHttpMethod$lambda$1;
                parseHttpMethod$lambda$1 = HttpParserKt.parseHttpMethod$lambda$1(((Character) obj).charValue(), ((Integer) obj2).intValue());
                return Boolean.valueOf(parseHttpMethod$lambda$1);
            }
        }, 8, null));
        if (httpMethod != null) {
            mutableRange.setStart(mutableRange.getStart() + httpMethod.getValue().length());
            return httpMethod;
        }
        return parseHttpMethodFull(charSequence, mutableRange);
    }

    private static final HttpMethod parseHttpMethodFull(CharSequence charSequence, MutableRange mutableRange) {
        return new HttpMethod(TokenizerKt.nextToken(charSequence, mutableRange).toString());
    }

    private static final CharSequence parseUri(CharSequence charSequence, MutableRange mutableRange) {
        TokenizerKt.skipSpaces(charSequence, mutableRange);
        int start = mutableRange.getStart();
        int findSpaceOrEnd = TokenizerKt.findSpaceOrEnd(charSequence, mutableRange);
        int i = findSpaceOrEnd - start;
        if (i <= 0) {
            return "";
        }
        if (i == 1 && charSequence.charAt(start) == '/') {
            mutableRange.setStart(findSpaceOrEnd);
            return "/";
        }
        CharSequence subSequence = charSequence.subSequence(start, findSpaceOrEnd);
        mutableRange.setStart(findSpaceOrEnd);
        return subSequence;
    }

    private static final CharSequence parseVersion(CharSequence charSequence, MutableRange mutableRange) {
        TokenizerKt.skipSpaces(charSequence, mutableRange);
        if (mutableRange.getStart() >= mutableRange.getEnd()) {
            throw new IllegalStateException(("Failed to parse version: " + ((Object) charSequence)).toString());
        }
        String str = (String) CollectionsKt.singleOrNull(AsciiCharTree.search$default(versions, charSequence, mutableRange.getStart(), mutableRange.getEnd(), false, new Function2() { // from class: io.ktor.http.cio.HttpParserKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean parseVersion$lambda$3;
                parseVersion$lambda$3 = HttpParserKt.parseVersion$lambda$3(((Character) obj).charValue(), ((Integer) obj2).intValue());
                return Boolean.valueOf(parseVersion$lambda$3);
            }
        }, 8, null));
        if (str != null) {
            mutableRange.setStart(mutableRange.getStart() + str.length());
            return str;
        }
        unsupportedHttpVersion(TokenizerKt.nextToken(charSequence, mutableRange));
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r7.setStart(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int parseStatusCode(CharSequence charSequence, MutableRange mutableRange) {
        char charAt;
        TokenizerKt.skipSpaces(charSequence, mutableRange);
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
                    throw new ParserException("Status-code must be 3-digit. Status received: " + i + '.');
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
        throw new NumberFormatException("Illegal digit " + charAt + " in status code " + charSequence.subSequence(mutableRange.getStart(), TokenizerKt.findSpaceOrEnd(charSequence, mutableRange)).toString());
    }

    public static final int parseHeaderName(CharArrayBuilder text, MutableRange range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int end = range.getEnd();
        for (int start = range.getStart(); start < end; start++) {
            char charAt = text.charAt(start);
            if (charAt == ':' && start != range.getStart()) {
                range.setStart(start + 1);
                return start;
            }
            if (isDelimiter(charAt)) {
                parseHeaderNameFailed(text, start, range.getStart(), charAt);
                throw new KotlinNothingValueException();
            }
        }
        noColonFound(text, range);
        throw new KotlinNothingValueException();
    }

    private static final Void parseHeaderNameFailed(CharArrayBuilder charArrayBuilder, int i, int i2, char c) {
        if (c == ':') {
            throw new ParserException("Empty header names are not allowed as per RFC7230.");
        }
        if (i == i2) {
            throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        characterIsNotAllowed(charArrayBuilder, c);
        throw new KotlinNothingValueException();
    }

    public static final void parseHeaderValue(CharArrayBuilder text, MutableRange range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int start = range.getStart();
        int end = range.getEnd();
        int skipSpacesAndHorizontalTabs = TokenizerKt.skipSpacesAndHorizontalTabs(text, start, end);
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
                    throw new KotlinNothingValueException();
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

    private static final Void noColonFound(CharSequence charSequence, MutableRange mutableRange) {
        throw new ParserException("No colon in HTTP header in " + charSequence.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    private static final Void characterIsNotAllowed(CharSequence charSequence, char c) {
        throw new ParserException("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    private static final boolean isDelimiter(char c) {
        return Intrinsics.compare((int) c, 32) <= 0 || StringsKt.contains$default((CharSequence) "\"(),/:;<=>?@[\\]{}", c, false, 2, (Object) null);
    }

    private static final Void unsupportedHttpVersion(CharSequence charSequence) {
        throw new ParserException("Unsupported HTTP version: " + ((Object) charSequence));
    }
}
