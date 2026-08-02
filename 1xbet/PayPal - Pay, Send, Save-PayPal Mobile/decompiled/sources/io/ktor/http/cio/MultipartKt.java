package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "p0", "Lio/ktor/http/cio/HttpHeadersMap;", "getHighSpeedVideoSizes", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/bytestring/ByteString;", "", "getHighSpeedVideoFpsRanges", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "input", "headers", "maxPartSize", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/http/cio/MultipartEvent;", "parseMultipart", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/HttpHeadersMap;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "contentLength", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/CharSequence;Ljava/lang/Long;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "", "parseBoundaryInternal", "(Ljava/lang/CharSequence;)[B", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/io/bytestring/ByteString;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MultipartKt {
    private static final kotlinx.io.bytestring.ByteString getHighResolutionOutputSizeshNQ4ISI = new kotlinx.io.bytestring.ByteString(io.ktor.utils.io.core.StringsKt.toByteArray$default(io.ktor.sse.ServerSentEventKt.END_OF_LINE, null, 1, null), 0, 0, 6, null);
    private static final kotlinx.io.bytestring.ByteString Camera2StreamConfigurationMap = kotlinx.io.bytestring.ByteStringKt.ByteString(45, 45);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f0, code lost:
    
        if (r0.flush(r8) != r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        if (r1 != r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$parsePartBodyImpl(kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.http.cio.HttpHeadersMap httpHeadersMap, long j, kotlin.coroutines.Continuation continuation) {
        io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$1;
        int i;
        kotlinx.io.bytestring.ByteString byteString2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        long longValue;
        long j2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2 = byteReadChannel;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = byteWriteChannel;
        if (continuation instanceof io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1) {
            multipartKt$parsePartBodyImpl$1 = (io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1) continuation;
            if ((multipartKt$parsePartBodyImpl$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartBodyImpl$1.getHighSpeedVideoSizes -= 2147483648;
                io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$12 = multipartKt$parsePartBodyImpl$1;
                java.lang.Object obj = multipartKt$parsePartBodyImpl$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.CharSequence charSequence = httpHeadersMap.get("Content-Length");
                    java.lang.Long boxLong = charSequence != null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(io.ktor.http.cio.internals.CharsKt.parseDecLong(charSequence)) : null;
                    if (boxLong == null) {
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes = 1;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil(byteReadChannel, byteString, byteWriteChannel, j, true, multipartKt$parsePartBodyImpl$12);
                        if (obj != coroutine_suspended) {
                            byteWriteChannel2 = byteWriteChannel3;
                            longValue = ((java.lang.Number) obj).longValue();
                            multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges = null;
                            multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRangesFor = longValue;
                            multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes = 4;
                        }
                    } else {
                        if (!new kotlin.ranges.LongRange(0L, j).contains(boxLong.longValue())) {
                            long longValue2 = boxLong.longValue();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Multipart content length exceeds limit ");
                            sb.append(longValue2);
                            sb.append(" > ");
                            sb.append(j);
                            sb.append("; limit is defined using 'formFieldLimit' argument");
                            throw new java.io.IOException(sb.toString());
                        }
                        long longValue3 = boxLong.longValue();
                        byteString2 = byteString;
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges = byteString2;
                        multipartKt$parsePartBodyImpl$12.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel2;
                        multipartKt$parsePartBodyImpl$12.Camera2StreamConfigurationMap = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes = 2;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(byteReadChannel2, byteWriteChannel3, longValue3, multipartKt$parsePartBodyImpl$12);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    longValue = ((java.lang.Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges = null;
                    multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRangesFor = longValue;
                    multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes = 4;
                } else {
                    if (i == 2) {
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) multipartKt$parsePartBodyImpl$12.Camera2StreamConfigurationMap;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) multipartKt$parsePartBodyImpl$12.getHighResolutionOutputSizeshNQ4ISI;
                        byteString2 = (kotlinx.io.bytestring.ByteString) multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel3 = byteWriteChannel4;
                        byteReadChannel2 = byteReadChannel3;
                        long longValue4 = ((java.lang.Number) obj).longValue();
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.getHighResolutionOutputSizeshNQ4ISI = null;
                        multipartKt$parsePartBodyImpl$12.Camera2StreamConfigurationMap = null;
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRangesFor = longValue4;
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes = 3;
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(byteReadChannel2, byteString2, multipartKt$parsePartBodyImpl$12);
                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            j2 = longValue4;
                            obj = highSpeedVideoFpsRanges;
                            byteWriteChannel2 = byteWriteChannel3;
                            longValue = j2 + ((java.lang.Number) obj).longValue();
                            multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges = null;
                            multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRangesFor = longValue;
                            multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes = 4;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        j2 = multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRangesFor;
                        byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        longValue = j2 + ((java.lang.Number) obj).longValue();
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRanges = null;
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRangesFor = longValue;
                        multipartKt$parsePartBodyImpl$12.getHighSpeedVideoSizes = 4;
                    } else {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        longValue = multipartKt$parsePartBodyImpl$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue);
            }
        }
        multipartKt$parsePartBodyImpl$1 = new io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1(continuation);
        io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$122 = multipartKt$parsePartBodyImpl$1;
        java.lang.Object obj2 = multipartKt$parsePartBodyImpl$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartBodyImpl$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:16:0x005a, B:17:0x0061), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoSizes(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpHeadersMap> continuation) {
        io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$1;
        int i;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder;
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder2;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        if (continuation instanceof io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1) {
            multipartKt$parsePartHeadersImpl$1 = (io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1) continuation;
            if ((multipartKt$parsePartHeadersImpl$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartHeadersImpl$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$12 = multipartKt$parsePartHeadersImpl$1;
                java.lang.Object obj = multipartKt$parsePartHeadersImpl$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartHeadersImpl$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    charArrayBuilder = new io.ktor.http.cio.internals.CharArrayBuilder(null, 1, null);
                    try {
                        multipartKt$parsePartHeadersImpl$12.Camera2StreamConfigurationMap = charArrayBuilder;
                        multipartKt$parsePartHeadersImpl$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object parseHeaders$default = io.ktor.http.cio.HttpParserKt.parseHeaders$default(byteReadChannel, charArrayBuilder, null, multipartKt$parsePartHeadersImpl$12, 4, null);
                        if (parseHeaders$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = parseHeaders$default;
                        charArrayBuilder2 = charArrayBuilder;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        charArrayBuilder.release();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charArrayBuilder2 = (io.ktor.http.cio.internals.CharArrayBuilder) multipartKt$parsePartHeadersImpl$12.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        charArrayBuilder = charArrayBuilder2;
                        th = th2;
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
        java.lang.Object obj2 = multipartKt$parsePartHeadersImpl$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartHeadersImpl$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj2;
        if (httpHeadersMap == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRanges(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 multipartKt$skipIfFoundReadCount$1;
        int i;
        if (continuation instanceof io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1) {
            multipartKt$skipIfFoundReadCount$1 = (io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1) continuation;
            if ((multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoFpsRangesFor = byteString;
                    multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoSizes = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(byteReadChannel, byteString, multipartKt$skipIfFoundReadCount$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteString = (kotlinx.io.bytestring.ByteString) multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(!((java.lang.Boolean) obj).booleanValue() ? byteString.getSize() : 0L);
            }
        }
        multipartKt$skipIfFoundReadCount$1 = new io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1(continuation);
        java.lang.Object obj2 = multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$skipIfFoundReadCount$1.getHighSpeedVideoSizes;
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

    public static final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> parseMultipart(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.http.cio.HttpHeadersMap httpHeadersMap, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpHeadersMap, "");
        java.lang.CharSequence charSequence = httpHeadersMap.get("Content-Type");
        if (charSequence == null) {
            throw new io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: no Content-Type header");
        }
        java.lang.CharSequence charSequence2 = httpHeadersMap.get("Content-Length");
        return parseMultipart(coroutineScope, byteReadChannel, charSequence, charSequence2 != null ? java.lang.Long.valueOf(io.ktor.http.cio.internals.CharsKt.parseDecLong(charSequence2)) : null, j);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel parseMultipart$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.CharSequence charSequence, java.lang.Long l, long j, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            j = Long.MAX_VALUE;
        }
        return parseMultipart(coroutineScope, byteReadChannel, charSequence, l, j);
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> parseMultipart(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.CharSequence charSequence, java.lang.Long l, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (!io.ktor.http.ContentType.MultiPart.INSTANCE.contains(charSequence)) {
            throw new io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: Content-Type should be multipart/* but it is ".concat(java.lang.String.valueOf(charSequence)));
        }
        return kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new io.ktor.http.cio.MultipartKt$parseMultipart$1(byteReadChannel, new kotlinx.io.bytestring.ByteString(parseBoundaryInternal(charSequence), 0, 0, 6, null), j, l, null), 3, null);
    }

    private static final void Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.IntRef intRef, byte[] bArr, byte b) {
        if (intRef.element >= bArr.length) {
            throw new java.io.IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        int i = intRef.element;
        intRef.element = i + 1;
        bArr[i] = b;
    }

    public static final byte[] parseBoundaryInternal(java.lang.CharSequence charSequence) {
        int i;
        boolean z;
        int i2;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        int length = charSequence.length();
        char c2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i >= length) {
                i2 = -1;
                i = -1;
                break;
            }
            char charAt = charSequence.charAt(i);
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 == 2) {
                        if (charAt != '\"') {
                            if (charAt != ',') {
                                if (charAt != ';') {
                                }
                                c2 = 1;
                            }
                            c2 = 0;
                        }
                        c2 = 3;
                    } else if (c2 != 3) {
                        if (c2 != 4) {
                        }
                        c2 = 3;
                    } else {
                        if (charAt != '\"') {
                            if (charAt == '\\') {
                                c2 = 4;
                            }
                        }
                        c2 = 1;
                    }
                } else if (charAt == '=') {
                    c2 = 2;
                } else if (charAt != ';') {
                    if (charAt != ',') {
                        if (charAt != ' ') {
                            if (i3 == 0 && kotlin.text.StringsKt.startsWith(charSequence, (java.lang.CharSequence) "boundary=", i, true)) {
                                i2 = -1;
                                break;
                            }
                            i3++;
                        } else {
                            continue;
                        }
                    }
                    c2 = 0;
                }
            } else {
                i = charAt != ';' ? i + 1 : 0;
                c2 = 1;
            }
            i3 = 0;
        }
        if (i == i2) {
            throw new java.io.IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        int i4 = i + 9;
        byte[] bArr = new byte[74];
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        Camera2StreamConfigurationMap(intRef, bArr, (byte) 13);
        Camera2StreamConfigurationMap(intRef, bArr, (byte) 10);
        Camera2StreamConfigurationMap(intRef, bArr, (byte) 45);
        Camera2StreamConfigurationMap(intRef, bArr, (byte) 45);
        int length2 = charSequence.length();
        char c3 = 0;
        while (i4 < length2) {
            char charAt2 = charSequence.charAt(i4);
            int i5 = charAt2 & kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
            if (i5 > 127) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse multipart: wrong boundary byte 0x");
                java.lang.String num = java.lang.Integer.toString(i5, kotlin.text.CharsKt.checkRadix(16));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
                sb.append(num);
                sb.append(" - should be 7bit character");
                throw new java.io.IOException(sb.toString());
            }
            if (c3 == 0) {
                c = ';';
                if (charAt2 == ' ') {
                    continue;
                } else {
                    if (charAt2 != '\"') {
                        if (charAt2 == ',' || charAt2 == ';') {
                            break;
                        }
                        Camera2StreamConfigurationMap(intRef, bArr, (byte) i5);
                        c3 = 1;
                    }
                    c3 = 2;
                }
                i4++;
                z = true;
            } else if (c3 == z) {
                if (charAt2 != ' ' && charAt2 != ',') {
                    c = ';';
                    if (charAt2 == ';') {
                        break;
                    }
                    Camera2StreamConfigurationMap(intRef, bArr, (byte) i5);
                    i4++;
                    z = true;
                } else {
                    break;
                }
            } else {
                if (c3 == 2) {
                    if (charAt2 == '\"') {
                        break;
                    }
                    if (charAt2 != '\\') {
                        Camera2StreamConfigurationMap(intRef, bArr, (byte) i5);
                    } else {
                        c3 = 3;
                    }
                } else if (c3 == 3) {
                    Camera2StreamConfigurationMap(intRef, bArr, (byte) i5);
                    c = ';';
                    c3 = 2;
                    i4++;
                    z = true;
                }
                c = ';';
                i4++;
                z = true;
            }
        }
        if (intRef.element == 4) {
            throw new java.io.IOException("Empty multipart boundary is not allowed");
        }
        return kotlin.collections.ArraysKt.copyOfRange(bArr, 0, intRef.element);
    }
}
