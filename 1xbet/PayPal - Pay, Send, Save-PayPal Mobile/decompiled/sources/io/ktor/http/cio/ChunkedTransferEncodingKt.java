package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a \u0010\u0005\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0005\u0010\r\u001a!\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0013\u0010\u0015\"\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u0019\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e*\n\u0010!\"\u00020\u00032\u00020\u0003*\n\u0010\"\"\u00020\u00112\u00020\u0011"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/WriterJob;", "Lio/ktor/http/cio/DecoderJob;", "decodeChunked", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;)Lio/ktor/utils/io/WriterJob;", "", "contentLength", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;J)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "out", "", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "output", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/http/cio/EncoderJob;", "encodeChunked", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ReaderJob;", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "getHighSpeedVideoFpsRanges", "Lio/ktor/utils/io/pool/ObjectPool;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRangesFor", "[B", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "DecoderJob", "EncoderJob"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChunkedTransferEncodingKt {
    private static final io.ktor.utils.io.pool.ObjectPool<java.lang.StringBuilder> getHighSpeedVideoFpsRanges = new io.ktor.utils.io.pool.DefaultPool<java.lang.StringBuilder>() { // from class: io.ktor.http.cio.ChunkedTransferEncodingKt$ChunkSizeBufferPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final java.lang.StringBuilder produceInstance() {
            return new java.lang.StringBuilder(128);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final java.lang.StringBuilder clearInstance(java.lang.StringBuilder instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
            kotlin.text.StringsKt.clear(instance);
            return instance;
        }
    };
    private static final byte[] getHighSpeedVideoFpsRangesFor = io.ktor.utils.io.core.StringsKt.toByteArray$default(io.ktor.sse.ServerSentEventKt.END_OF_LINE, null, 1, null);
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = io.ktor.utils.io.core.StringsKt.toByteArray$default("0\r\n\r\n", null, 1, null);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ea, code lost:
    
        if (r1.flush(r4) == r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r2, 0, 0, r4, 6, null) == r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (io.ktor.http.cio.internals.CharsKt.writeIntHex(r0, r3, r4) != r12) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$writeChunk(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation continuation) {
        io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1 chunkedTransferEncodingKt$writeChunk$1;
        java.lang.Object coroutine_suspended;
        int i3;
        int i4;
        byte[] bArr2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        int i5;
        int i6;
        int i7;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = byteWriteChannel;
        int i8 = i;
        int i9 = i2;
        if (continuation instanceof io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1) {
            chunkedTransferEncodingKt$writeChunk$1 = (io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1) continuation;
            if ((chunkedTransferEncodingKt$writeChunk$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                chunkedTransferEncodingKt$writeChunk$1.getInputFormats -= 2147483648;
                java.lang.Object obj = chunkedTransferEncodingKt$writeChunk$1.getInputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = chunkedTransferEncodingKt$writeChunk$1.getInputFormats;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i4 = i9 - i8;
                    chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = byteWriteChannel4;
                    bArr2 = bArr;
                    chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoSizes = bArr2;
                    chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i8;
                    chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRanges = i9;
                    chunkedTransferEncodingKt$writeChunk$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                    chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 1;
                } else if (i3 == 1) {
                    int i10 = chunkedTransferEncodingKt$writeChunk$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i11 = chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRanges;
                    int i12 = chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor;
                    bArr2 = (byte[]) chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i4 = i10;
                    byteWriteChannel4 = byteWriteChannel5;
                    i9 = i11;
                    i8 = i12;
                } else {
                    if (i3 == 2) {
                        i5 = chunkedTransferEncodingKt$writeChunk$1.getHighResolutionOutputSizeshNQ4ISI;
                        i7 = chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRanges;
                        i6 = chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor;
                        bArr2 = (byte[]) chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoSizes;
                        byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = byteWriteChannel2;
                        chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoSizes = null;
                        chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i5;
                        chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 3;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(byteWriteChannel2, bArr2, i6, i7, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
                            byteWriteChannel3 = byteWriteChannel2;
                            byte[] bArr3 = getHighSpeedVideoFpsRangesFor;
                            chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = byteWriteChannel3;
                            chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i5;
                            chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 4;
                        }
                        return coroutine_suspended;
                    }
                    if (i3 == 3) {
                        i5 = chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byte[] bArr32 = getHighSpeedVideoFpsRangesFor;
                        chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = byteWriteChannel3;
                        chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i5;
                        chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 4;
                    } else {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i5 = chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.coroutines.jvm.internal.Boxing.boxInt(i5);
                        }
                        i5 = chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = null;
                        chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i5;
                        chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 5;
                    }
                }
                chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = byteWriteChannel4;
                chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoSizes = bArr2;
                chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i8;
                chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRanges = i9;
                chunkedTransferEncodingKt$writeChunk$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 2;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(byteWriteChannel4, (short) 3338, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
                    byteWriteChannel2 = byteWriteChannel4;
                    i5 = i4;
                    int i13 = i9;
                    i6 = i8;
                    i7 = i13;
                    chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = byteWriteChannel2;
                    chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoSizes = null;
                    chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i5;
                    chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 3;
                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(byteWriteChannel2, bArr2, i6, i7, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        chunkedTransferEncodingKt$writeChunk$1 = new io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1(continuation);
        java.lang.Object obj2 = chunkedTransferEncodingKt$writeChunk$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = chunkedTransferEncodingKt$writeChunk$1.getInputFormats;
        if (i3 != 0) {
        }
        chunkedTransferEncodingKt$writeChunk$1.Camera2StreamConfigurationMap = byteWriteChannel4;
        chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoSizes = bArr2;
        chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRangesFor = i8;
        chunkedTransferEncodingKt$writeChunk$1.getHighSpeedVideoFpsRanges = i9;
        chunkedTransferEncodingKt$writeChunk$1.getHighResolutionOutputSizeshNQ4ISI = i4;
        chunkedTransferEncodingKt$writeChunk$1.getInputFormats = 2;
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(byteWriteChannel4, (short) 3338, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Specify content length if known or pass -1L", replaceWith = @kotlin.ReplaceWith(expression = "decodeChunked(input, -1L)", imports = {}))
    public static final io.ktor.utils.io.WriterJob decodeChunked(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        return decodeChunked(coroutineScope, byteReadChannel, -1L);
    }

    public static final io.ktor.utils.io.WriterJob decodeChunked(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel byteReadChannel, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default(coroutineScope, coroutineScope.getCoroutineContext(), false, (kotlin.jvm.functions.Function2) new io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$1(byteReadChannel, null), 2, (java.lang.Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b6, code lost:
    
        if (r13.flushAndClose(r1) == r2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        if (r13.flush(r1) == r2) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161 A[Catch: all -> 0x01bd, TryCatch #3 {all -> 0x01bd, blocks: (B:22:0x0159, B:24:0x0161, B:33:0x00af, B:74:0x0176, B:75:0x017d, B:76:0x017e, B:77:0x0199), top: B:21:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5 A[Catch: all -> 0x009a, TryCatch #2 {all -> 0x009a, blocks: (B:18:0x0051, B:36:0x00cd, B:38:0x00d5, B:40:0x00de, B:42:0x00e4, B:47:0x00fa, B:51:0x0114, B:70:0x00ef, B:71:0x019c, B:72:0x01a3, B:81:0x006d, B:83:0x0082, B:85:0x0096), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e A[Catch: all -> 0x01bd, TryCatch #3 {all -> 0x01bd, blocks: (B:22:0x0159, B:24:0x0161, B:33:0x00af, B:74:0x0176, B:75:0x017d, B:76:0x017e, B:77:0x0199), top: B:21:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0152 -> B:20:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object decodeChunked(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2 chunkedTransferEncodingKt$decodeChunked$2;
        java.lang.Appendable appendable;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2 chunkedTransferEncodingKt$decodeChunked$22;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        long j;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j2;
        long j3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        long j4;
        long j5;
        io.ktor.utils.io.ByteReadChannel byteReadChannel4;
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        long j6;
        try {
            if (continuation instanceof io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2) {
                chunkedTransferEncodingKt$decodeChunked$2 = (io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2) continuation;
                if ((chunkedTransferEncodingKt$decodeChunked$2.getInputFormats & Integer.MIN_VALUE) != 0) {
                    chunkedTransferEncodingKt$decodeChunked$2.getInputFormats -= 2147483648;
                    java.lang.Object obj = chunkedTransferEncodingKt$decodeChunked$2.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    appendable = chunkedTransferEncodingKt$decodeChunked$2.getInputFormats;
                    int i = 1;
                    switch (appendable) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.StringBuilder borrow = getHighSpeedVideoFpsRanges.borrow();
                            chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                            long j7 = 0;
                            io.ktor.utils.io.ByteReadChannel byteReadChannel5 = byteReadChannel;
                            byteWriteChannel3 = byteWriteChannel;
                            int httpLineEndings = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                            chunkedTransferEncodingKt$decodeChunked$22.getHighSpeedVideoFpsRanges = byteReadChannel5;
                            chunkedTransferEncodingKt$decodeChunked$22.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel3;
                            chunkedTransferEncodingKt$decodeChunked$22.getHighSpeedVideoSizes = borrow;
                            chunkedTransferEncodingKt$decodeChunked$22.Camera2StreamConfigurationMap = j7;
                            chunkedTransferEncodingKt$decodeChunked$22.getInputFormats = i;
                            java.lang.Object m23407readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel5, borrow, 128, httpLineEndings, chunkedTransferEncodingKt$decodeChunked$22);
                            if (m23407readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                byteWriteChannel4 = byteWriteChannel3;
                                chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                                j = j7;
                                byteReadChannel2 = byteReadChannel5;
                                obj = m23407readUTF8LineToRRvyBJ8;
                                appendable = borrow;
                                java.lang.StringBuilder sb3 = appendable;
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    if (appendable.length() == 0) {
                                        throw new java.io.EOFException("Invalid chunk size: empty");
                                    }
                                    long parseHexLong = (appendable.length() == i && appendable.charAt(0) == '0') ? 0L : io.ktor.http.cio.internals.CharsKt.parseHexLong(appendable);
                                    if (parseHexLong > 0) {
                                        chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = byteReadChannel2;
                                        chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel4;
                                        chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = appendable;
                                        chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap = j;
                                        chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor = parseHexLong;
                                        chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 2;
                                        if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(byteReadChannel2, byteWriteChannel4, parseHexLong, chunkedTransferEncodingKt$decodeChunked$2) != coroutine_suspended) {
                                            long j8 = parseHexLong;
                                            byteReadChannel3 = byteReadChannel2;
                                            j3 = j;
                                            j2 = j8;
                                            sb2 = appendable;
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = byteReadChannel3;
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel4;
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = sb2;
                                            chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap = j3;
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor = j2;
                                            chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 3;
                                            sb = sb2;
                                            break;
                                        }
                                    } else {
                                        long j9 = parseHexLong;
                                        byteWriteChannel2 = byteWriteChannel4;
                                        j4 = j;
                                        j2 = j9;
                                        appendable = appendable;
                                        try {
                                            kotlin.text.StringsKt.clear(appendable);
                                            int httpLineEndings2 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = byteReadChannel2;
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel2;
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = appendable;
                                            chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap = j4;
                                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor = j2;
                                            chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 4;
                                            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel2, appendable, 2, httpLineEndings2, chunkedTransferEncodingKt$decodeChunked$2);
                                            if (obj != coroutine_suspended) {
                                                try {
                                                    j5 = j2;
                                                    chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                                                    byteWriteChannel3 = byteWriteChannel2;
                                                    byteReadChannel4 = byteReadChannel2;
                                                    appendable = appendable;
                                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                                        sb4.append("Invalid chunk: content block of size ");
                                                        sb4.append(j6);
                                                        sb4.append(" ended unexpectedly");
                                                        throw new java.io.EOFException(sb4.toString());
                                                    }
                                                    if (appendable.length() > 0) {
                                                        throw new java.io.EOFException("Invalid chunk: content block should end with CR+LF");
                                                    }
                                                    if (j6 == 0) {
                                                        byteWriteChannel4 = byteWriteChannel3;
                                                        chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                                                        sb3 = appendable;
                                                    } else {
                                                        j7 = j4;
                                                        byteReadChannel5 = byteReadChannel4;
                                                        i = 1;
                                                        borrow = appendable;
                                                        int httpLineEndings3 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                                                        chunkedTransferEncodingKt$decodeChunked$22.getHighSpeedVideoFpsRanges = byteReadChannel5;
                                                        chunkedTransferEncodingKt$decodeChunked$22.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel3;
                                                        chunkedTransferEncodingKt$decodeChunked$22.getHighSpeedVideoSizes = borrow;
                                                        chunkedTransferEncodingKt$decodeChunked$22.Camera2StreamConfigurationMap = j7;
                                                        chunkedTransferEncodingKt$decodeChunked$22.getInputFormats = i;
                                                        java.lang.Object m23407readUTF8LineToRRvyBJ82 = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel5, borrow, 128, httpLineEndings3, chunkedTransferEncodingKt$decodeChunked$22);
                                                        if (m23407readUTF8LineToRRvyBJ82 != coroutine_suspended) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    byteWriteChannel2 = byteWriteChannel3;
                                                    chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                                                    try {
                                                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                                        throw th;
                                                    } catch (java.lang.Throwable th2) {
                                                        getHighSpeedVideoFpsRanges.recycle(appendable);
                                                        chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = th2;
                                                        chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = null;
                                                        chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = null;
                                                        chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 6;
                                                        if (byteWriteChannel2.flushAndClose(chunkedTransferEncodingKt$decodeChunked$2) != coroutine_suspended) {
                                                            throw th2;
                                                        }
                                                    }
                                                }
                                                j6 = j5;
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                            throw th;
                                        }
                                    }
                                }
                                getHighSpeedVideoFpsRanges.recycle(sb3);
                                chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = null;
                                chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = null;
                                chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = null;
                                chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 5;
                                break;
                            }
                            return coroutine_suspended;
                        case 1:
                            j = chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb5 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes;
                            byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI;
                            byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            appendable = sb5;
                            java.lang.StringBuilder sb32 = appendable;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            getHighSpeedVideoFpsRanges.recycle(sb32);
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = null;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = null;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = null;
                            chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 5;
                            break;
                        case 2:
                            j2 = chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor;
                            j3 = chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb6 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes;
                            byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            sb2 = sb6;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = byteReadChannel3;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel4;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = sb2;
                            chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap = j3;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor = j2;
                            chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 3;
                            sb = sb2;
                            break;
                        case 3:
                            j2 = chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor;
                            j3 = chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb7 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes;
                            byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            sb = sb7;
                            io.ktor.utils.io.ByteReadChannel byteReadChannel6 = byteReadChannel3;
                            byteWriteChannel2 = byteWriteChannel4;
                            j4 = j3 + j2;
                            byteReadChannel2 = byteReadChannel6;
                            appendable = sb;
                            kotlin.text.StringsKt.clear(appendable);
                            int httpLineEndings22 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges = byteReadChannel2;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel2;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes = appendable;
                            chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap = j4;
                            chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor = j2;
                            chunkedTransferEncodingKt$decodeChunked$2.getInputFormats = 4;
                            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(byteReadChannel2, appendable, 2, httpLineEndings22, chunkedTransferEncodingKt$decodeChunked$2);
                            if (obj != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        case 4:
                            long j10 = chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRangesFor;
                            long j11 = chunkedTransferEncodingKt$decodeChunked$2.Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb8 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoSizes;
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighResolutionOutputSizeshNQ4ISI;
                            byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            j5 = j10;
                            chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                            byteWriteChannel3 = byteWriteChannel5;
                            j4 = j11;
                            appendable = sb8;
                            j6 = j5;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                            break;
                        case 5:
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        case 6:
                            java.lang.Throwable th4 = (java.lang.Throwable) chunkedTransferEncodingKt$decodeChunked$2.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th4;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (appendable) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            byteWriteChannel2 = byteWriteChannel4;
        }
        chunkedTransferEncodingKt$decodeChunked$2 = new io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2(continuation);
        java.lang.Object obj2 = chunkedTransferEncodingKt$decodeChunked$2.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        appendable = chunkedTransferEncodingKt$decodeChunked$2.getInputFormats;
        int i2 = 1;
    }

    public static final io.ktor.utils.io.ReaderJob encodeChunked(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return io.ktor.utils.io.ByteReadChannelOperationsKt.reader((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, false, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1(byteWriteChannel, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b4, code lost:
    
        if (r4.flush(r1) != r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00af, code lost:
    
        if (r3.getReadBuffer().exhausted() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b1, code lost:
    
        r11.getHighSpeedVideoFpsRangesFor = r1;
        r11.getHighSpeedVideoSizes = r3;
        r11.getHighResolutionOutputSizeshNQ4ISI = r3;
        r11.Camera2StreamConfigurationMap = null;
        r11.getHighSpeedVideoFpsRanges = null;
        r11.getInputSizeshNQ4ISI = null;
        r11.getHighSpeedVideoSizesFor = r9 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c3, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r3, 0, r11, r9 ? 1 : 0, null) == r2) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c5, code lost:
    
        r12 = r1;
        r1 = r11;
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ce, code lost:
    
        r12 = r11;
        r11 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1 A[Catch: all -> 0x01b9, TryCatch #2 {all -> 0x01b9, blocks: (B:57:0x009b, B:59:0x00a1, B:62:0x00a7, B:64:0x00b1, B:88:0x0179, B:90:0x017d, B:92:0x0188, B:95:0x01bb), top: B:56:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0104 -> B:41:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0121 -> B:40:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0170 -> B:54:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object encodeChunked(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$2;
        int i;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$22;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        kotlinx.io.Segment segment;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlinx.io.Buffer buffer;
        kotlin.jvm.internal.Ref.IntRef intRef3;
        java.lang.Object boxInt;
        kotlinx.io.Segment segment2;
        int i2;
        if (continuation instanceof io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2) {
            chunkedTransferEncodingKt$encodeChunked$2 = (io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2) continuation;
            if ((chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = chunkedTransferEncodingKt$encodeChunked$2.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizesFor;
                int i3 = 2;
                boolean z = true;
                z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannel2 = byteReadChannel;
                    chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                    byteWriteChannel2 = byteWriteChannel;
                    while (true) {
                        if (!byteReadChannel2.isClosedForRead()) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel6 = byteWriteChannel5;
                        io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$23 = chunkedTransferEncodingKt$encodeChunked$2;
                        byteWriteChannel2 = byteWriteChannel6;
                        try {
                            if (byteReadChannel2.isClosedForRead()) {
                                byteReadChannel2 = byteReadChannel4;
                                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$23;
                                while (true) {
                                    if (!byteReadChannel2.isClosedForRead()) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            intRef = new kotlin.jvm.internal.Ref.IntRef();
                            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                            getHighResolutionOutputSizeshNQ4ISI2 = byteReadChannel2.getReadBuffer().getGetHighResolutionOutputSizeshNQ4ISI();
                            if (getHighResolutionOutputSizeshNQ4ISI2.exhausted()) {
                                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
                            }
                            kotlinx.io.Segment head = getHighResolutionOutputSizeshNQ4ISI2.getHead();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
                            byte[] dataAsByteArray = head.dataAsByteArray(z);
                            int pos = head.getPos();
                            int limit = head.getLimit();
                            io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$24 = chunkedTransferEncodingKt$encodeChunked$23;
                            if (limit == pos) {
                                boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(0);
                                byteReadChannel3 = byteReadChannel4;
                                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$23;
                                segment2 = head;
                                intRef2 = intRef;
                                intRef.element = ((java.lang.Number) boxInt).intValue();
                                i2 = intRef2.element;
                                if (i2 != 0) {
                                }
                                int i4 = intRef2.element;
                                byteReadChannel2 = byteReadChannel3;
                                i3 = 2;
                                z = true;
                                while (true) {
                                    if (!byteReadChannel2.isClosedForRead()) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            chunkedTransferEncodingKt$encodeChunked$23.getHighSpeedVideoFpsRangesFor = byteWriteChannel2;
                            chunkedTransferEncodingKt$encodeChunked$23.getHighSpeedVideoSizes = byteReadChannel4;
                            chunkedTransferEncodingKt$encodeChunked$23.getHighResolutionOutputSizeshNQ4ISI = intRef;
                            chunkedTransferEncodingKt$encodeChunked$23.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI2;
                            chunkedTransferEncodingKt$encodeChunked$23.getHighSpeedVideoFpsRanges = head;
                            chunkedTransferEncodingKt$encodeChunked$23.getInputSizeshNQ4ISI = intRef;
                            chunkedTransferEncodingKt$encodeChunked$23.getHighSpeedVideoSizesFor = i3;
                            java.lang.Object access$writeChunk = access$writeChunk(byteWriteChannel2, dataAsByteArray, pos, limit, chunkedTransferEncodingKt$encodeChunked$23);
                            if (access$writeChunk != coroutine_suspended) {
                                byteWriteChannel4 = byteWriteChannel2;
                                byteReadChannel3 = byteReadChannel4;
                                chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$23;
                                segment = head;
                                intRef2 = intRef;
                                buffer = getHighResolutionOutputSizeshNQ4ISI2;
                                intRef3 = intRef2;
                                obj = access$writeChunk;
                                boxInt = obj;
                                intRef = intRef3;
                                getHighResolutionOutputSizeshNQ4ISI2 = buffer;
                                segment2 = segment;
                                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                                byteWriteChannel2 = byteWriteChannel4;
                                intRef.element = ((java.lang.Number) boxInt).intValue();
                                i2 = intRef2.element;
                                if (i2 != 0) {
                                }
                                int i42 = intRef2.element;
                                byteReadChannel2 = byteReadChannel3;
                                i3 = 2;
                                z = true;
                                while (true) {
                                    if (!byteReadChannel2.isClosedForRead()) {
                                    }
                                }
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            byteWriteChannel3 = byteWriteChannel2;
                            byteReadChannel2 = byteReadChannel4;
                            chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$23;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        byteReadChannel2 = byteReadChannel4;
                        byteWriteChannel3 = byteWriteChannel5;
                    }
                } else if (i == 2) {
                    intRef3 = (kotlin.jvm.internal.Ref.IntRef) chunkedTransferEncodingKt$encodeChunked$2.getInputSizeshNQ4ISI;
                    segment = (kotlinx.io.Segment) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRanges;
                    buffer = (kotlinx.io.Buffer) chunkedTransferEncodingKt$encodeChunked$2.Camera2StreamConfigurationMap;
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) chunkedTransferEncodingKt$encodeChunked$2.getHighResolutionOutputSizeshNQ4ISI;
                    byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizes;
                    byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        boxInt = obj;
                        intRef = intRef3;
                        getHighResolutionOutputSizeshNQ4ISI2 = buffer;
                        segment2 = segment;
                        chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                        byteWriteChannel2 = byteWriteChannel4;
                        try {
                            intRef.element = ((java.lang.Number) boxInt).intValue();
                            i2 = intRef2.element;
                            if (i2 != 0) {
                                if (i2 < 0) {
                                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                                }
                                if (i2 > segment2.getSize()) {
                                    throw new java.lang.IllegalStateException("Returned too many bytes");
                                }
                                getHighResolutionOutputSizeshNQ4ISI2.skip(i2);
                            }
                            int i422 = intRef2.element;
                            byteReadChannel2 = byteReadChannel3;
                            i3 = 2;
                            z = true;
                            while (true) {
                                try {
                                    if (!byteReadChannel2.isClosedForRead()) {
                                        if (!byteReadChannel2.isClosedForRead()) {
                                            break;
                                        }
                                    } else {
                                        java.lang.Throwable closedCause = byteReadChannel2 instanceof io.ktor.utils.io.ByteChannel ? ((io.ktor.utils.io.ByteChannel) byteReadChannel2).getClosedCause() : null;
                                        if (closedCause == null) {
                                            byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
                                            chunkedTransferEncodingKt$encodeChunked$22.getHighSpeedVideoFpsRangesFor = byteWriteChannel2;
                                            chunkedTransferEncodingKt$encodeChunked$22.getHighSpeedVideoSizes = byteReadChannel2;
                                            chunkedTransferEncodingKt$encodeChunked$22.getHighResolutionOutputSizeshNQ4ISI = null;
                                            chunkedTransferEncodingKt$encodeChunked$22.Camera2StreamConfigurationMap = null;
                                            chunkedTransferEncodingKt$encodeChunked$22.getHighSpeedVideoFpsRanges = null;
                                            chunkedTransferEncodingKt$encodeChunked$22.getInputSizeshNQ4ISI = null;
                                            chunkedTransferEncodingKt$encodeChunked$22.getHighSpeedVideoSizesFor = 3;
                                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, chunkedTransferEncodingKt$encodeChunked$22, 6, null) != coroutine_suspended) {
                                                byteWriteChannel3 = byteWriteChannel2;
                                                chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                                            }
                                        } else {
                                            throw closedCause;
                                        }
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    byteWriteChannel3 = byteWriteChannel2;
                                    chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                                }
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            byteWriteChannel3 = byteWriteChannel2;
                            chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                            byteReadChannel2 = byteReadChannel3;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        byteReadChannel2 = byteReadChannel3;
                        byteWriteChannel3 = byteWriteChannel4;
                    }
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Throwable th6 = (java.lang.Throwable) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw th6;
                    }
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizes;
                    byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRangesFor = null;
                        chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizes = null;
                        chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizesFor = 4;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                try {
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel3, th);
                    byteReadChannel2.cancel(th);
                    throw th;
                } catch (java.lang.Throwable th8) {
                    chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRangesFor = th8;
                    chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizes = null;
                    chunkedTransferEncodingKt$encodeChunked$2.getHighResolutionOutputSizeshNQ4ISI = null;
                    chunkedTransferEncodingKt$encodeChunked$2.Camera2StreamConfigurationMap = null;
                    chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoFpsRanges = null;
                    chunkedTransferEncodingKt$encodeChunked$2.getInputSizeshNQ4ISI = null;
                    chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizesFor = 5;
                    if (byteWriteChannel3.flush(chunkedTransferEncodingKt$encodeChunked$2) != coroutine_suspended) {
                        throw th8;
                    }
                }
            }
        }
        chunkedTransferEncodingKt$encodeChunked$2 = new io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2(continuation);
        java.lang.Object obj2 = chunkedTransferEncodingKt$encodeChunked$2.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chunkedTransferEncodingKt$encodeChunked$2.getHighSpeedVideoSizesFor;
        int i32 = 2;
        boolean z2 = true;
        z2 = true;
        if (i != 0) {
        }
    }
}
