package io.ktor.http.cio;

/* compiled from: Multipart.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\u001a2\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\t\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u001d\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u001f\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+¨\u00060"}, d2 = {"Lkotlinx/io/bytestring/ByteString;", "boundary", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "limit", "parsePreambleImpl", "(Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/HttpHeadersMap;", "parsePartHeadersImpl", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundaryPrefixed", "headers", "parsePartBodyImpl", "(Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/http/cio/HttpHeadersMap;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prefix", "skipIfFoundReadCount", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "maxPartSize", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/http/cio/MultipartEvent;", "parseMultipart", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/HttpHeadersMap;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "contentLength", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/CharSequence;Ljava/lang/Long;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "totalLength", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Long;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "", "findBoundary", "(Ljava/lang/CharSequence;)I", "", "parseBoundaryInternal", "(Ljava/lang/CharSequence;)[B", "actual", "", "throwLimitExceeded", "(JJ)Ljava/lang/Void;", "CrLf", "Lkotlinx/io/bytestring/ByteString;", "", "PrefixChar", "B", "PrefixString", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultipartKt {
    private static final kotlinx.io.bytestring.ByteString CrLf = new kotlinx.io.bytestring.ByteString(io.ktor.utils.io.core.StringsKt.toByteArray$default(io.ktor.sse.ServerSentEventKt.END_OF_LINE, null, 1, null), 0, 0, 6, null);
    private static final byte PrefixChar = 45;
    private static final kotlinx.io.bytestring.ByteString PrefixString = kotlinx.io.bytestring.ByteStringKt.ByteString(PrefixChar, PrefixChar);

    static /* synthetic */ java.lang.Object parsePreambleImpl$default(kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            j = Long.MAX_VALUE;
        }
        return parsePreambleImpl(byteString, byteReadChannel, byteWriteChannel, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object parsePreambleImpl(kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil(byteReadChannel, byteString, byteWriteChannel, j, true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:16:0x005a, B:17:0x0061), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object parsePartHeadersImpl(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpHeadersMap> continuation) {
        io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$1;
        int i;
        java.lang.Throwable th;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        if (continuation instanceof io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1) {
            multipartKt$parsePartHeadersImpl$1 = (io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1) continuation;
            if ((multipartKt$parsePartHeadersImpl$1.label & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartHeadersImpl$1.label -= Integer.MIN_VALUE;
                io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$12 = multipartKt$parsePartHeadersImpl$1;
                java.lang.Object obj = multipartKt$parsePartHeadersImpl$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartHeadersImpl$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2 = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                    try {
                        multipartKt$parsePartHeadersImpl$12.L$0 = charArrayBuilder2;
                        multipartKt$parsePartHeadersImpl$12.label = 1;
                        java.lang.Object parseHeaders$default = io.ktor.http.cio.HttpParserKt.parseHeaders$default(byteReadChannel, charArrayBuilder2, null, multipartKt$parsePartHeadersImpl$12, 4, null);
                        if (parseHeaders$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = parseHeaders$default;
                        charArrayBuilder = charArrayBuilder2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        charArrayBuilder = charArrayBuilder2;
                        charArrayBuilder.release();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charArrayBuilder = (io.ktor.http.cio.internals.CharArrayBuilder) multipartKt$parsePartHeadersImpl$12.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
                httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj;
                if (httpHeadersMap == null) {
                    return httpHeadersMap;
                }
                throw new java.io.EOFException("Failed to parse multipart headers: unexpected end of stream");
            }
        }
        multipartKt$parsePartHeadersImpl$1 = new io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1(continuation);
        io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$122 = multipartKt$parsePartHeadersImpl$1;
        java.lang.Object obj2 = multipartKt$parsePartHeadersImpl$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartHeadersImpl$122.label;
        if (i != 0) {
        }
        httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj2;
        if (httpHeadersMap == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object parsePartBodyImpl(kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.http.cio.HttpHeadersMap httpHeadersMap, long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$1;
        int i;
        kotlinx.io.bytestring.ByteString byteString2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        long longValue;
        java.lang.Object skipIfFoundReadCount;
        long j2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2 = byteReadChannel;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = byteWriteChannel;
        if (continuation instanceof io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1) {
            multipartKt$parsePartBodyImpl$1 = (io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1) continuation;
            if ((multipartKt$parsePartBodyImpl$1.label & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartBodyImpl$1.label -= Integer.MIN_VALUE;
                io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$12 = multipartKt$parsePartBodyImpl$1;
                java.lang.Object obj = multipartKt$parsePartBodyImpl$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartBodyImpl$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.CharSequence charSequence = httpHeadersMap.get(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
                    java.lang.Long boxLong = charSequence != null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(io.ktor.http.cio.internals.CharsKt.parseDecLong(charSequence)) : null;
                    if (boxLong == null) {
                        multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.label = 1;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil(byteReadChannel, byteString, byteWriteChannel, j, true, multipartKt$parsePartBodyImpl$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteWriteChannel2 = byteWriteChannel3;
                        longValue = ((java.lang.Number) obj).longValue();
                        multipartKt$parsePartBodyImpl$12.L$0 = null;
                        multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                        multipartKt$parsePartBodyImpl$12.label = 4;
                        if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                        }
                    } else {
                        if (!new kotlin.ranges.LongRange(0L, j).contains(boxLong.longValue())) {
                            throwLimitExceeded(boxLong.longValue(), j);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        long longValue2 = boxLong.longValue();
                        byteString2 = byteString;
                        multipartKt$parsePartBodyImpl$12.L$0 = byteString2;
                        multipartKt$parsePartBodyImpl$12.L$1 = byteReadChannel2;
                        multipartKt$parsePartBodyImpl$12.L$2 = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.label = 2;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(byteReadChannel2, byteWriteChannel3, longValue2, multipartKt$parsePartBodyImpl$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long longValue3 = ((java.lang.Number) obj).longValue();
                        multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.L$1 = null;
                        multipartKt$parsePartBodyImpl$12.L$2 = null;
                        multipartKt$parsePartBodyImpl$12.J$0 = longValue3;
                        multipartKt$parsePartBodyImpl$12.label = 3;
                        skipIfFoundReadCount = skipIfFoundReadCount(byteReadChannel2, byteString2, multipartKt$parsePartBodyImpl$12);
                        if (skipIfFoundReadCount != coroutine_suspended) {
                        }
                    }
                } else if (i == 1) {
                    byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    longValue = ((java.lang.Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                    if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                    }
                } else if (i == 2) {
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$2;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) multipartKt$parsePartBodyImpl$12.L$1;
                    byteString2 = (kotlinx.io.bytestring.ByteString) multipartKt$parsePartBodyImpl$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteWriteChannel3 = byteWriteChannel4;
                    byteReadChannel2 = byteReadChannel3;
                    long longValue32 = ((java.lang.Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel3;
                    multipartKt$parsePartBodyImpl$12.L$1 = null;
                    multipartKt$parsePartBodyImpl$12.L$2 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue32;
                    multipartKt$parsePartBodyImpl$12.label = 3;
                    skipIfFoundReadCount = skipIfFoundReadCount(byteReadChannel2, byteString2, multipartKt$parsePartBodyImpl$12);
                    if (skipIfFoundReadCount != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = longValue32;
                    obj = skipIfFoundReadCount;
                    byteWriteChannel2 = byteWriteChannel3;
                    longValue = j2 + ((java.lang.Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                    if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                    }
                } else if (i == 3) {
                    j2 = multipartKt$parsePartBodyImpl$12.J$0;
                    byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    longValue = j2 + ((java.lang.Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                    if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longValue = multipartKt$parsePartBodyImpl$12.J$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue);
            }
        }
        multipartKt$parsePartBodyImpl$1 = new io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1(continuation);
        io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$122 = multipartKt$parsePartBodyImpl$1;
        java.lang.Object obj2 = multipartKt$parsePartBodyImpl$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartBodyImpl$122.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object skipIfFoundReadCount(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 multipartKt$skipIfFoundReadCount$1;
        int i;
        if (continuation instanceof io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1) {
            multipartKt$skipIfFoundReadCount$1 = (io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1) continuation;
            if ((multipartKt$skipIfFoundReadCount$1.label & Integer.MIN_VALUE) != 0) {
                multipartKt$skipIfFoundReadCount$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = multipartKt$skipIfFoundReadCount$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$skipIfFoundReadCount$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    multipartKt$skipIfFoundReadCount$1.L$0 = byteString;
                    multipartKt$skipIfFoundReadCount$1.label = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(byteReadChannel, byteString, multipartKt$skipIfFoundReadCount$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteString = (kotlinx.io.bytestring.ByteString) multipartKt$skipIfFoundReadCount$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(!((java.lang.Boolean) obj).booleanValue() ? byteString.getSize() : 0L);
            }
        }
        multipartKt$skipIfFoundReadCount$1 = new io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1(continuation);
        java.lang.Object obj2 = multipartKt$skipIfFoundReadCount$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$skipIfFoundReadCount$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxLong(!((java.lang.Boolean) obj2).booleanValue() ? byteString.getSize() : 0L);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel parseMultipart$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.http.cio.HttpHeadersMap httpHeadersMap, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = Long.MAX_VALUE;
        }
        return parseMultipart(coroutineScope, byteReadChannel, httpHeadersMap, j);
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> parseMultipart(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel input, io.ktor.http.cio.HttpHeadersMap headers, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        java.lang.CharSequence charSequence = headers.get("Content-Type");
        if (charSequence == null) {
            throw new io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: no Content-Type header");
        }
        java.lang.CharSequence charSequence2 = headers.get(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
        return parseMultipart(coroutineScope, input, charSequence, charSequence2 != null ? java.lang.Long.valueOf(io.ktor.http.cio.internals.CharsKt.parseDecLong(charSequence2)) : null, j);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel parseMultipart$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.CharSequence charSequence, java.lang.Long l, long j, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            j = Long.MAX_VALUE;
        }
        return parseMultipart(coroutineScope, byteReadChannel, charSequence, l, j);
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> parseMultipart(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel input, java.lang.CharSequence contentType, java.lang.Long l, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (!io.ktor.http.ContentType.MultiPart.INSTANCE.contains(contentType)) {
            throw new io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((java.lang.Object) contentType));
        }
        return parseMultipart(coroutineScope, new kotlinx.io.bytestring.ByteString(parseBoundaryInternal(contentType), 0, 0, 6, null), input, l, j);
    }

    private static final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> parseMultipart(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Long l, long j) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new io.ktor.http.cio.MultipartKt$parseMultipart$1(byteReadChannel, byteString, j, l, null), 3, null);
    }

    private static final int findBoundary(java.lang.CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        if (charAt != '\"') {
                            if (charAt != ',') {
                                if (charAt != ';') {
                                }
                                c = 1;
                            }
                            c = 0;
                        }
                        c = 3;
                    } else if (c != 3) {
                        if (c != 4) {
                        }
                        c = 3;
                    } else {
                        if (charAt != '\"') {
                            if (charAt == '\\') {
                                c = 4;
                            }
                        }
                        c = 1;
                    }
                } else if (charAt == '=') {
                    c = 2;
                } else if (charAt != ';') {
                    if (charAt != ',') {
                        if (charAt == ' ') {
                            continue;
                        } else {
                            if (i2 == 0 && kotlin.text.StringsKt.startsWith(charSequence, (java.lang.CharSequence) "boundary=", i, true)) {
                                return i;
                            }
                            i2++;
                        }
                    }
                    c = 0;
                }
            } else {
                i = charAt != ';' ? i + 1 : 0;
                c = 1;
            }
            i2 = 0;
        }
        return -1;
    }

    public static final byte[] parseBoundaryInternal(java.lang.CharSequence contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        int findBoundary = findBoundary(contentType);
        if (findBoundary == -1) {
            throw new java.io.IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        byte[] bArr = new byte[74];
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        parseBoundaryInternal$put(intRef, bArr, com.google.common.base.Ascii.CR);
        parseBoundaryInternal$put(intRef, bArr, (byte) 10);
        parseBoundaryInternal$put(intRef, bArr, PrefixChar);
        parseBoundaryInternal$put(intRef, bArr, PrefixChar);
        int length = contentType.length();
        char c = 0;
        for (int i = findBoundary + 9; i < length; i++) {
            char charAt = contentType.charAt(i);
            int i2 = charAt & kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
            if ((65535 & charAt) > 127) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse multipart: wrong boundary byte 0x");
                java.lang.String num = java.lang.Integer.toString(i2, kotlin.text.CharsKt.checkRadix(16));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                sb.append(num);
                sb.append(" - should be 7bit character");
                throw new java.io.IOException(sb.toString());
            }
            if (c == 0) {
                if (charAt == ' ') {
                    continue;
                } else {
                    if (charAt != '\"') {
                        if (charAt == ',' || charAt == ';') {
                            break;
                        }
                        parseBoundaryInternal$put(intRef, bArr, (byte) i2);
                        c = 1;
                    }
                    c = 2;
                }
            } else if (c == 1) {
                if (charAt == ' ' || charAt == ',' || charAt == ';') {
                    break;
                }
                parseBoundaryInternal$put(intRef, bArr, (byte) i2);
            } else {
                if (c == 2) {
                    if (charAt == '\"') {
                        break;
                    }
                    if (charAt != '\\') {
                        parseBoundaryInternal$put(intRef, bArr, (byte) i2);
                    } else {
                        c = 3;
                    }
                } else if (c == 3) {
                    parseBoundaryInternal$put(intRef, bArr, (byte) i2);
                    c = 2;
                }
            }
        }
        if (intRef.element == 4) {
            throw new java.io.IOException("Empty multipart boundary is not allowed");
        }
        return kotlin.collections.ArraysKt.copyOfRange(bArr, 0, intRef.element);
    }

    private static final void parseBoundaryInternal$put(kotlin.jvm.internal.Ref.IntRef intRef, byte[] bArr, byte b) {
        if (intRef.element >= bArr.length) {
            throw new java.io.IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        int i = intRef.element;
        intRef.element = i + 1;
        bArr[i] = b;
    }

    private static final java.lang.Void throwLimitExceeded(long j, long j2) {
        throw new java.io.IOException("Multipart content length exceeds limit " + j + " > " + j2 + "; limit is defined using 'formFieldLimit' argument");
    }
}
