package io.ktor.http.cio;

/* compiled from: ChunkedTransferEncoding.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a \u0010\u0005\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0005\u0010\r\u001a!\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\f*\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a,\u0010\u001d\u001a\u00020\u001a*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 \"\u001e\u0010%\u001a\f\u0012\b\u0012\u00060#j\u0002`$0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+*\n\u0010-\"\u00020\u00032\u00020\u0003*\n\u0010.\"\u00020\u00112\u00020\u0011¨\u0006/"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/WriterJob;", "Lio/ktor/http/cio/DecoderJob;", "decodeChunked", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;)Lio/ktor/utils/io/WriterJob;", "", "contentLength", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteReadChannel;J)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "out", "", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "output", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/http/cio/EncoderJob;", "encodeChunked", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ReaderJob;", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rethrowCloseCause", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", "memory", "", "startIndex", "endIndex", "writeChunk", "(Lio/ktor/utils/io/ByteWriteChannel;[BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MAX_CHUNK_SIZE_LENGTH", "I", "CHUNK_BUFFER_POOL_SIZE", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ChunkSizeBufferPool", "Lio/ktor/utils/io/pool/ObjectPool;", "", "CrLfShort", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "CrLf", "[B", "LastChunkBytes", "DecoderJob", "EncoderJob", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChunkedTransferEncodingKt {
    private static final int CHUNK_BUFFER_POOL_SIZE = 2048;
    private static final short CrLfShort = 3338;
    private static final int MAX_CHUNK_SIZE_LENGTH = 128;
    private static final io.ktor.utils.io.pool.ObjectPool<java.lang.StringBuilder> ChunkSizeBufferPool = new io.ktor.utils.io.pool.DefaultPool<java.lang.StringBuilder>() { // from class: io.ktor.http.cio.ChunkedTransferEncodingKt$ChunkSizeBufferPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public java.lang.StringBuilder produceInstance() {
            return new java.lang.StringBuilder(128);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public java.lang.StringBuilder clearInstance(java.lang.StringBuilder instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            kotlin.text.StringsKt.clear(instance);
            return instance;
        }
    };
    private static final byte[] CrLf = io.ktor.utils.io.core.StringsKt.toByteArray$default(io.ktor.sse.ServerSentEventKt.END_OF_LINE, null, 1, null);
    private static final byte[] LastChunkBytes = io.ktor.utils.io.core.StringsKt.toByteArray$default("0\r\n\r\n", null, 1, null);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Specify content length if known or pass -1L", replaceWith = @kotlin.ReplaceWith(expression = "decodeChunked(input, -1L)", imports = {}))
    public static final io.ktor.utils.io.WriterJob decodeChunked(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return decodeChunked(coroutineScope, input, -1L);
    }

    public static final io.ktor.utils.io.WriterJob decodeChunked(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteReadChannel input, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default(coroutineScope, coroutineScope.getCoroutineContext(), false, (kotlin.jvm.functions.Function2) new io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$1(input, null), 2, (java.lang.Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0165 A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:22:0x015d, B:24:0x0165, B:33:0x00b0, B:79:0x017b, B:80:0x0182, B:81:0x0183, B:82:0x019e), top: B:21:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[Catch: all -> 0x009b, TryCatch #2 {all -> 0x009b, blocks: (B:18:0x0051, B:37:0x00d0, B:39:0x00d8, B:41:0x00e1, B:43:0x00e7, B:48:0x00fd, B:52:0x0116, B:75:0x00f2, B:76:0x01a2, B:77:0x01a9, B:86:0x006e, B:88:0x0083, B:90:0x0097), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183 A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:22:0x015d, B:24:0x0165, B:33:0x00b0, B:79:0x017b, B:80:0x0182, B:81:0x0183, B:82:0x019e), top: B:21:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0156 -> B:20:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object decodeChunked(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2 chunkedTransferEncodingKt$decodeChunked$2;
        java.lang.Appendable appendable;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        java.lang.StringBuilder borrow;
        io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2 chunkedTransferEncodingKt$decodeChunked$22;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        long j;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j2;
        long j3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        long j4;
        java.lang.StringBuilder sb;
        io.ktor.utils.io.ByteReadChannel byteReadChannel4;
        java.lang.StringBuilder sb2;
        java.lang.StringBuilder sb3;
        long j5;
        try {
            if (continuation instanceof io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2) {
                chunkedTransferEncodingKt$decodeChunked$2 = (io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2) continuation;
                if ((chunkedTransferEncodingKt$decodeChunked$2.label & Integer.MIN_VALUE) != 0) {
                    chunkedTransferEncodingKt$decodeChunked$2.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = chunkedTransferEncodingKt$decodeChunked$2.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    appendable = chunkedTransferEncodingKt$decodeChunked$2.label;
                    int i = 1;
                    switch (appendable) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj);
                            borrow = ChunkSizeBufferPool.borrow();
                            chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                            long j6 = 0;
                            io.ktor.utils.io.ByteReadChannel byteReadChannel5 = byteReadChannel;
                            byteWriteChannel3 = byteWriteChannel;
                            int httpLineEndings = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                            chunkedTransferEncodingKt$decodeChunked$22.L$0 = byteReadChannel5;
                            chunkedTransferEncodingKt$decodeChunked$22.L$1 = byteWriteChannel3;
                            chunkedTransferEncodingKt$decodeChunked$22.L$2 = borrow;
                            chunkedTransferEncodingKt$decodeChunked$22.J$0 = j6;
                            chunkedTransferEncodingKt$decodeChunked$22.label = i;
                            java.lang.Object m10765readUTF8LineToRRvyBJ8 = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel5, borrow, 128, httpLineEndings, chunkedTransferEncodingKt$decodeChunked$22);
                            if (m10765readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteWriteChannel2 = byteWriteChannel3;
                            chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                            appendable = borrow;
                            j = j6;
                            byteReadChannel2 = byteReadChannel5;
                            obj = m10765readUTF8LineToRRvyBJ8;
                            java.lang.StringBuilder sb4 = appendable;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                if (appendable.length() == 0) {
                                    throw new java.io.EOFException("Invalid chunk size: empty");
                                }
                                long parseHexLong = (appendable.length() == i && appendable.charAt(0) == '0') ? 0L : io.ktor.http.cio.internals.CharsKt.parseHexLong(appendable);
                                if (parseHexLong > 0) {
                                    chunkedTransferEncodingKt$decodeChunked$2.L$0 = byteReadChannel2;
                                    chunkedTransferEncodingKt$decodeChunked$2.L$1 = byteWriteChannel2;
                                    chunkedTransferEncodingKt$decodeChunked$2.L$2 = appendable;
                                    chunkedTransferEncodingKt$decodeChunked$2.J$0 = j;
                                    chunkedTransferEncodingKt$decodeChunked$2.J$1 = parseHexLong;
                                    chunkedTransferEncodingKt$decodeChunked$2.label = 2;
                                    if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(byteReadChannel2, byteWriteChannel2, parseHexLong, chunkedTransferEncodingKt$decodeChunked$2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    try {
                                        long j7 = parseHexLong;
                                        byteReadChannel3 = byteReadChannel2;
                                        j3 = j;
                                        j2 = j7;
                                        sb3 = appendable;
                                        chunkedTransferEncodingKt$decodeChunked$2.L$0 = byteReadChannel3;
                                        chunkedTransferEncodingKt$decodeChunked$2.L$1 = byteWriteChannel2;
                                        chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb3;
                                        chunkedTransferEncodingKt$decodeChunked$2.J$0 = j3;
                                        chunkedTransferEncodingKt$decodeChunked$2.J$1 = j2;
                                        chunkedTransferEncodingKt$decodeChunked$2.label = 3;
                                        sb2 = sb3;
                                        if (byteWriteChannel2.flush(chunkedTransferEncodingKt$decodeChunked$2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        kotlin.text.StringsKt.clear(appendable);
                                        int httpLineEndings2 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                                        chunkedTransferEncodingKt$decodeChunked$2.L$0 = byteReadChannel2;
                                        chunkedTransferEncodingKt$decodeChunked$2.L$1 = byteWriteChannel4;
                                        chunkedTransferEncodingKt$decodeChunked$2.L$2 = appendable;
                                        chunkedTransferEncodingKt$decodeChunked$2.J$0 = j4;
                                        chunkedTransferEncodingKt$decodeChunked$2.J$1 = j2;
                                        chunkedTransferEncodingKt$decodeChunked$2.label = 4;
                                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel2, appendable, 2, httpLineEndings2, chunkedTransferEncodingKt$decodeChunked$2);
                                        if (obj != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        try {
                                            sb = appendable;
                                            chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                                            byteWriteChannel3 = byteWriteChannel4;
                                            byteReadChannel4 = byteReadChannel2;
                                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                                throw new java.io.EOFException("Invalid chunk: content block of size " + j5 + " ended unexpectedly");
                                            }
                                            if (borrow.length() > 0) {
                                                throw new java.io.EOFException("Invalid chunk: content block should end with CR+LF");
                                            }
                                            if (j5 == 0) {
                                                byteWriteChannel2 = byteWriteChannel3;
                                                chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                                                sb4 = borrow;
                                            } else {
                                                j6 = j4;
                                                byteReadChannel5 = byteReadChannel4;
                                                i = 1;
                                                int httpLineEndings3 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                                                chunkedTransferEncodingKt$decodeChunked$22.L$0 = byteReadChannel5;
                                                chunkedTransferEncodingKt$decodeChunked$22.L$1 = byteWriteChannel3;
                                                chunkedTransferEncodingKt$decodeChunked$22.L$2 = borrow;
                                                chunkedTransferEncodingKt$decodeChunked$22.J$0 = j6;
                                                chunkedTransferEncodingKt$decodeChunked$22.label = i;
                                                java.lang.Object m10765readUTF8LineToRRvyBJ82 = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel5, borrow, 128, httpLineEndings3, chunkedTransferEncodingKt$decodeChunked$22);
                                                if (m10765readUTF8LineToRRvyBJ82 != coroutine_suspended) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            byteWriteChannel2 = byteWriteChannel3;
                                            chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                                            appendable = borrow;
                                            try {
                                                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                                throw th;
                                            } catch (java.lang.Throwable th2) {
                                                ChunkSizeBufferPool.recycle(appendable);
                                                chunkedTransferEncodingKt$decodeChunked$2.L$0 = th2;
                                                chunkedTransferEncodingKt$decodeChunked$2.L$1 = null;
                                                chunkedTransferEncodingKt$decodeChunked$2.L$2 = null;
                                                chunkedTransferEncodingKt$decodeChunked$2.label = 6;
                                                if (byteWriteChannel2.flushAndClose(chunkedTransferEncodingKt$decodeChunked$2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                throw th2;
                                            }
                                        }
                                        j5 = j2;
                                        borrow = sb;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        byteWriteChannel2 = byteWriteChannel4;
                                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                        throw th;
                                    }
                                    io.ktor.utils.io.ByteReadChannel byteReadChannel6 = byteReadChannel3;
                                    byteWriteChannel4 = byteWriteChannel2;
                                    j4 = j3 + j2;
                                    byteReadChannel2 = byteReadChannel6;
                                    appendable = sb2;
                                } else {
                                    long j8 = parseHexLong;
                                    byteWriteChannel4 = byteWriteChannel2;
                                    j4 = j;
                                    j2 = j8;
                                    appendable = appendable;
                                    kotlin.text.StringsKt.clear(appendable);
                                    int httpLineEndings22 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                                    chunkedTransferEncodingKt$decodeChunked$2.L$0 = byteReadChannel2;
                                    chunkedTransferEncodingKt$decodeChunked$2.L$1 = byteWriteChannel4;
                                    chunkedTransferEncodingKt$decodeChunked$2.L$2 = appendable;
                                    chunkedTransferEncodingKt$decodeChunked$2.J$0 = j4;
                                    chunkedTransferEncodingKt$decodeChunked$2.J$1 = j2;
                                    chunkedTransferEncodingKt$decodeChunked$2.label = 4;
                                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel2, appendable, 2, httpLineEndings22, chunkedTransferEncodingKt$decodeChunked$2);
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                            }
                            ChunkSizeBufferPool.recycle(sb4);
                            chunkedTransferEncodingKt$decodeChunked$2.L$0 = null;
                            chunkedTransferEncodingKt$decodeChunked$2.L$1 = null;
                            chunkedTransferEncodingKt$decodeChunked$2.L$2 = null;
                            chunkedTransferEncodingKt$decodeChunked$2.label = 5;
                            if (byteWriteChannel2.flushAndClose(chunkedTransferEncodingKt$decodeChunked$2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        case 1:
                            j = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                            java.lang.StringBuilder sb5 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                            byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                            byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            appendable = sb5;
                            java.lang.StringBuilder sb42 = appendable;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            ChunkSizeBufferPool.recycle(sb42);
                            chunkedTransferEncodingKt$decodeChunked$2.L$0 = null;
                            chunkedTransferEncodingKt$decodeChunked$2.L$1 = null;
                            chunkedTransferEncodingKt$decodeChunked$2.L$2 = null;
                            chunkedTransferEncodingKt$decodeChunked$2.label = 5;
                            if (byteWriteChannel2.flushAndClose(chunkedTransferEncodingKt$decodeChunked$2) == coroutine_suspended) {
                            }
                            return kotlin.Unit.INSTANCE;
                        case 2:
                            j2 = chunkedTransferEncodingKt$decodeChunked$2.J$1;
                            j3 = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                            java.lang.StringBuilder sb6 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                            byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            sb3 = sb6;
                            chunkedTransferEncodingKt$decodeChunked$2.L$0 = byteReadChannel3;
                            chunkedTransferEncodingKt$decodeChunked$2.L$1 = byteWriteChannel2;
                            chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb3;
                            chunkedTransferEncodingKt$decodeChunked$2.J$0 = j3;
                            chunkedTransferEncodingKt$decodeChunked$2.J$1 = j2;
                            chunkedTransferEncodingKt$decodeChunked$2.label = 3;
                            sb2 = sb3;
                            if (byteWriteChannel2.flush(chunkedTransferEncodingKt$decodeChunked$2) == coroutine_suspended) {
                            }
                            io.ktor.utils.io.ByteReadChannel byteReadChannel62 = byteReadChannel3;
                            byteWriteChannel4 = byteWriteChannel2;
                            j4 = j3 + j2;
                            byteReadChannel2 = byteReadChannel62;
                            appendable = sb2;
                            kotlin.text.StringsKt.clear(appendable);
                            int httpLineEndings222 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                            chunkedTransferEncodingKt$decodeChunked$2.L$0 = byteReadChannel2;
                            chunkedTransferEncodingKt$decodeChunked$2.L$1 = byteWriteChannel4;
                            chunkedTransferEncodingKt$decodeChunked$2.L$2 = appendable;
                            chunkedTransferEncodingKt$decodeChunked$2.J$0 = j4;
                            chunkedTransferEncodingKt$decodeChunked$2.J$1 = j2;
                            chunkedTransferEncodingKt$decodeChunked$2.label = 4;
                            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel2, appendable, 2, httpLineEndings222, chunkedTransferEncodingKt$decodeChunked$2);
                            if (obj != coroutine_suspended) {
                            }
                            break;
                        case 3:
                            j2 = chunkedTransferEncodingKt$decodeChunked$2.J$1;
                            j3 = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                            java.lang.StringBuilder sb7 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                            byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            sb2 = sb7;
                            io.ktor.utils.io.ByteReadChannel byteReadChannel622 = byteReadChannel3;
                            byteWriteChannel4 = byteWriteChannel2;
                            j4 = j3 + j2;
                            byteReadChannel2 = byteReadChannel622;
                            appendable = sb2;
                            kotlin.text.StringsKt.clear(appendable);
                            int httpLineEndings2222 = io.ktor.http.cio.HttpParserKt.getHttpLineEndings();
                            chunkedTransferEncodingKt$decodeChunked$2.L$0 = byteReadChannel2;
                            chunkedTransferEncodingKt$decodeChunked$2.L$1 = byteWriteChannel4;
                            chunkedTransferEncodingKt$decodeChunked$2.L$2 = appendable;
                            chunkedTransferEncodingKt$decodeChunked$2.J$0 = j4;
                            chunkedTransferEncodingKt$decodeChunked$2.J$1 = j2;
                            chunkedTransferEncodingKt$decodeChunked$2.label = 4;
                            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.m10765readUTF8LineToRRvyBJ8(byteReadChannel2, appendable, 2, httpLineEndings2222, chunkedTransferEncodingKt$decodeChunked$2);
                            if (obj != coroutine_suspended) {
                            }
                            break;
                        case 4:
                            j2 = chunkedTransferEncodingKt$decodeChunked$2.J$1;
                            long j9 = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                            java.lang.StringBuilder sb8 = (java.lang.StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                            byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            sb = sb8;
                            chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                            byteWriteChannel3 = byteWriteChannel5;
                            j4 = j9;
                            j5 = j2;
                            borrow = sb;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                            break;
                        case 5:
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        case 6:
                            java.lang.Throwable th4 = (java.lang.Throwable) chunkedTransferEncodingKt$decodeChunked$2.L$0;
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
        }
        chunkedTransferEncodingKt$decodeChunked$2 = new io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2(continuation);
        java.lang.Object obj2 = chunkedTransferEncodingKt$decodeChunked$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        appendable = chunkedTransferEncodingKt$decodeChunked$2.label;
        int i2 = 1;
    }

    public static final io.ktor.utils.io.ReaderJob encodeChunked(io.ktor.utils.io.ByteWriteChannel output, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.ByteReadChannelOperationsKt.reader((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, false, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1(output, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x017c, code lost:
    
        rethrowCloseCause(r3);
        r14 = io.ktor.http.cio.ChunkedTransferEncodingKt.LastChunkBytes;
        r11.L$0 = r1;
        r11.L$1 = r3;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019d, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r14, 0, 0, r11, 6, null) != r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a0, code lost:
    
        r4 = r1;
        r1 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:58:0x009b, B:60:0x00a1, B:63:0x00a7, B:65:0x00b1, B:91:0x017c), top: B:57:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1 A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #0 {all -> 0x01b2, blocks: (B:58:0x009b, B:60:0x00a1, B:63:0x00a7, B:65:0x00b1, B:91:0x017c), top: B:57:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:71:0x00d1, B:73:0x00d7, B:75:0x00ed, B:77:0x0106, B:78:0x010f, B:82:0x0167, B:83:0x0172), top: B:70:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017c A[EDGE_INSN: B:90:0x017c->B:91:0x017c BREAK  A[LOOP:0: B:57:0x009b->B:89:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0106 -> B:42:0x0132). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0124 -> B:41:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0173 -> B:55:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object encodeChunked(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$2;
        int i;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$22;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$23;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        if (continuation instanceof io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2) {
            chunkedTransferEncodingKt$encodeChunked$2 = (io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2) continuation;
            if ((chunkedTransferEncodingKt$encodeChunked$2.label & Integer.MIN_VALUE) != 0) {
                chunkedTransferEncodingKt$encodeChunked$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = chunkedTransferEncodingKt$encodeChunked$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chunkedTransferEncodingKt$encodeChunked$2.label;
                int i2 = 2;
                boolean z = true;
                z = true;
                if (i == 0) {
                    if (i == 1) {
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.L$2;
                        byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.L$1;
                        byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$encodeChunked$2.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = byteWriteChannel4;
                            chunkedTransferEncodingKt$encodeChunked$23 = chunkedTransferEncodingKt$encodeChunked$2;
                            byteWriteChannel2 = byteWriteChannel5;
                            if (!byteReadChannel2.isClosedForRead()) {
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            byteReadChannel2 = byteReadChannel3;
                            byteWriteChannel3 = byteWriteChannel4;
                        }
                    } else if (i == 2) {
                        kotlin.jvm.internal.Ref.IntRef intRef = (kotlin.jvm.internal.Ref.IntRef) chunkedTransferEncodingKt$encodeChunked$2.L$5;
                        kotlinx.io.Segment segment = (kotlinx.io.Segment) chunkedTransferEncodingKt$encodeChunked$2.L$4;
                        kotlinx.io.Buffer buffer = (kotlinx.io.Buffer) chunkedTransferEncodingKt$encodeChunked$2.L$3;
                        kotlin.jvm.internal.Ref.IntRef intRef2 = (kotlin.jvm.internal.Ref.IntRef) chunkedTransferEncodingKt$encodeChunked$2.L$2;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.L$1;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel6 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$encodeChunked$2.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.Object boxInt = obj;
                            kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                            kotlinx.io.Buffer bufferField = buffer;
                            kotlinx.io.Segment segment2 = segment;
                            chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                            byteWriteChannel2 = byteWriteChannel6;
                            try {
                                intRef3.element = ((java.lang.Number) boxInt).intValue();
                                int i3 = intRef2.element;
                                if (i3 != 0) {
                                    if (i3 < 0) {
                                        throw new java.lang.IllegalStateException("Returned negative read bytes count");
                                    }
                                    if (i3 > segment2.getSize()) {
                                        throw new java.lang.IllegalStateException("Returned too many bytes");
                                    }
                                    bufferField.skip(i3);
                                }
                                int i4 = intRef2.element;
                                byteReadChannel2 = byteReadChannel4;
                                i2 = 2;
                                z = true;
                                do {
                                    try {
                                        if (byteReadChannel2.isClosedForRead()) {
                                            break;
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        byteWriteChannel3 = byteWriteChannel2;
                                        chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                                    }
                                } while (byteReadChannel2.isClosedForRead());
                                if (byteReadChannel2.getReadBuffer().exhausted()) {
                                    chunkedTransferEncodingKt$encodeChunked$22.L$0 = byteWriteChannel2;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$1 = byteReadChannel2;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$2 = byteReadChannel2;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$3 = null;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$4 = null;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$5 = null;
                                    chunkedTransferEncodingKt$encodeChunked$22.label = z ? 1 : 0;
                                    if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, chunkedTransferEncodingKt$encodeChunked$22, z ? 1 : 0, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    try {
                                        byteWriteChannel4 = byteWriteChannel2;
                                        chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                                        byteReadChannel3 = byteReadChannel2;
                                        if (!byteReadChannel2.isClosedForRead()) {
                                            intRef3 = new kotlin.jvm.internal.Ref.IntRef();
                                            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                                            bufferField = byteReadChannel2.getReadBuffer().getBufferField();
                                            if (((bufferField.exhausted() ? 1 : 0) ^ (z ? 1 : 0)) == 0) {
                                                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
                                            }
                                            kotlinx.io.Segment head = bufferField.getHead();
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
                                            byte[] dataAsByteArray = head.dataAsByteArray(z);
                                            int pos = head.getPos();
                                            int limit = head.getLimit();
                                            io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$24 = chunkedTransferEncodingKt$encodeChunked$23;
                                            if (limit == pos) {
                                                boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(0);
                                                byteReadChannel4 = byteReadChannel3;
                                                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$23;
                                                segment2 = head;
                                                intRef2 = intRef3;
                                                intRef3.element = ((java.lang.Number) boxInt).intValue();
                                                int i32 = intRef2.element;
                                                if (i32 != 0) {
                                                }
                                                int i42 = intRef2.element;
                                                byteReadChannel2 = byteReadChannel4;
                                                i2 = 2;
                                                z = true;
                                                do {
                                                    if (byteReadChannel2.isClosedForRead()) {
                                                    }
                                                } while (byteReadChannel2.isClosedForRead());
                                                if (byteReadChannel2.getReadBuffer().exhausted()) {
                                                    chunkedTransferEncodingKt$encodeChunked$23 = chunkedTransferEncodingKt$encodeChunked$22;
                                                    byteReadChannel3 = byteReadChannel2;
                                                    if (!byteReadChannel2.isClosedForRead()) {
                                                        byteReadChannel2 = byteReadChannel3;
                                                        chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$23;
                                                        do {
                                                            if (byteReadChannel2.isClosedForRead()) {
                                                            }
                                                        } while (byteReadChannel2.isClosedForRead());
                                                        if (byteReadChannel2.getReadBuffer().exhausted()) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                chunkedTransferEncodingKt$encodeChunked$23.L$0 = byteWriteChannel2;
                                                chunkedTransferEncodingKt$encodeChunked$23.L$1 = byteReadChannel3;
                                                chunkedTransferEncodingKt$encodeChunked$23.L$2 = intRef3;
                                                chunkedTransferEncodingKt$encodeChunked$23.L$3 = bufferField;
                                                chunkedTransferEncodingKt$encodeChunked$23.L$4 = head;
                                                chunkedTransferEncodingKt$encodeChunked$23.L$5 = intRef3;
                                                chunkedTransferEncodingKt$encodeChunked$23.label = i2;
                                                java.lang.Object writeChunk = writeChunk(byteWriteChannel2, dataAsByteArray, pos, limit, chunkedTransferEncodingKt$encodeChunked$23);
                                                if (writeChunk == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                byteWriteChannel6 = byteWriteChannel2;
                                                byteReadChannel4 = byteReadChannel3;
                                                chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$23;
                                                segment = head;
                                                intRef2 = intRef3;
                                                buffer = bufferField;
                                                intRef = intRef2;
                                                obj = writeChunk;
                                                java.lang.Object boxInt2 = obj;
                                                kotlin.jvm.internal.Ref.IntRef intRef32 = intRef;
                                                kotlinx.io.Buffer bufferField2 = buffer;
                                                kotlinx.io.Segment segment22 = segment;
                                                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                                                byteWriteChannel2 = byteWriteChannel6;
                                                intRef32.element = ((java.lang.Number) boxInt2).intValue();
                                                int i322 = intRef2.element;
                                                if (i322 != 0) {
                                                }
                                                int i422 = intRef2.element;
                                                byteReadChannel2 = byteReadChannel4;
                                                i2 = 2;
                                                z = true;
                                                do {
                                                    if (byteReadChannel2.isClosedForRead()) {
                                                    }
                                                } while (byteReadChannel2.isClosedForRead());
                                                if (byteReadChannel2.getReadBuffer().exhausted()) {
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        byteWriteChannel3 = byteWriteChannel2;
                                        byteReadChannel2 = byteReadChannel3;
                                        chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$23;
                                    }
                                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel52 = byteWriteChannel4;
                                    chunkedTransferEncodingKt$encodeChunked$23 = chunkedTransferEncodingKt$encodeChunked$2;
                                    byteWriteChannel2 = byteWriteChannel52;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                byteWriteChannel3 = byteWriteChannel2;
                                chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                                byteReadChannel2 = byteReadChannel4;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            byteReadChannel2 = byteReadChannel4;
                            byteWriteChannel3 = byteWriteChannel6;
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
                            java.lang.Throwable th6 = (java.lang.Throwable) chunkedTransferEncodingKt$encodeChunked$2.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th6;
                        }
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) chunkedTransferEncodingKt$encodeChunked$2.L$1;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$encodeChunked$2.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            chunkedTransferEncodingKt$encodeChunked$2.L$0 = null;
                            chunkedTransferEncodingKt$encodeChunked$2.L$1 = null;
                            chunkedTransferEncodingKt$encodeChunked$2.label = 4;
                            if (byteWriteChannel3.flush(chunkedTransferEncodingKt$encodeChunked$2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                        }
                    }
                    try {
                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel3, th);
                        byteReadChannel2.cancel(th);
                        throw th;
                    } catch (java.lang.Throwable th8) {
                        chunkedTransferEncodingKt$encodeChunked$2.L$0 = th8;
                        chunkedTransferEncodingKt$encodeChunked$2.L$1 = null;
                        chunkedTransferEncodingKt$encodeChunked$2.L$2 = null;
                        chunkedTransferEncodingKt$encodeChunked$2.L$3 = null;
                        chunkedTransferEncodingKt$encodeChunked$2.L$4 = null;
                        chunkedTransferEncodingKt$encodeChunked$2.L$5 = null;
                        chunkedTransferEncodingKt$encodeChunked$2.label = 5;
                        if (byteWriteChannel3.flush(chunkedTransferEncodingKt$encodeChunked$2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th8;
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                byteReadChannel2 = byteReadChannel;
                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                byteWriteChannel2 = byteWriteChannel;
                do {
                    if (byteReadChannel2.isClosedForRead()) {
                    }
                } while (byteReadChannel2.isClosedForRead());
                if (byteReadChannel2.getReadBuffer().exhausted()) {
                }
            }
        }
        chunkedTransferEncodingKt$encodeChunked$2 = new io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2(continuation);
        java.lang.Object obj2 = chunkedTransferEncodingKt$encodeChunked$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chunkedTransferEncodingKt$encodeChunked$2.label;
        int i22 = 2;
        boolean z2 = true;
        z2 = true;
        if (i == 0) {
        }
    }

    private static final void rethrowCloseCause(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        java.lang.Throwable closedCause = byteReadChannel instanceof io.ktor.utils.io.ByteChannel ? ((io.ktor.utils.io.ByteChannel) byteReadChannel).getClosedCause() : null;
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeChunk(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
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
        byte[] bArr3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = byteWriteChannel;
        int i8 = i;
        int i9 = i2;
        if (continuation instanceof io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1) {
            chunkedTransferEncodingKt$writeChunk$1 = (io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1) continuation;
            if ((chunkedTransferEncodingKt$writeChunk$1.label & Integer.MIN_VALUE) != 0) {
                chunkedTransferEncodingKt$writeChunk$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = chunkedTransferEncodingKt$writeChunk$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = chunkedTransferEncodingKt$writeChunk$1.label;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i4 = i9 - i8;
                    chunkedTransferEncodingKt$writeChunk$1.L$0 = byteWriteChannel4;
                    bArr2 = bArr;
                    chunkedTransferEncodingKt$writeChunk$1.L$1 = bArr2;
                    chunkedTransferEncodingKt$writeChunk$1.I$0 = i8;
                    chunkedTransferEncodingKt$writeChunk$1.I$1 = i9;
                    chunkedTransferEncodingKt$writeChunk$1.I$2 = i4;
                    chunkedTransferEncodingKt$writeChunk$1.label = 1;
                    if (io.ktor.http.cio.internals.CharsKt.writeIntHex(byteWriteChannel4, i4, chunkedTransferEncodingKt$writeChunk$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            i5 = chunkedTransferEncodingKt$writeChunk$1.I$2;
                            i7 = chunkedTransferEncodingKt$writeChunk$1.I$1;
                            i6 = chunkedTransferEncodingKt$writeChunk$1.I$0;
                            bArr2 = (byte[]) chunkedTransferEncodingKt$writeChunk$1.L$1;
                            byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            chunkedTransferEncodingKt$writeChunk$1.L$0 = byteWriteChannel2;
                            chunkedTransferEncodingKt$writeChunk$1.L$1 = null;
                            chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                            chunkedTransferEncodingKt$writeChunk$1.label = 3;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(byteWriteChannel2, bArr2, i6, i7, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteWriteChannel3 = byteWriteChannel2;
                            bArr3 = CrLf;
                            chunkedTransferEncodingKt$writeChunk$1.L$0 = byteWriteChannel3;
                            chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                            chunkedTransferEncodingKt$writeChunk$1.label = 4;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel3, bArr3, 0, 0, chunkedTransferEncodingKt$writeChunk$1, 6, null) == coroutine_suspended) {
                            }
                            chunkedTransferEncodingKt$writeChunk$1.L$0 = null;
                            chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                            chunkedTransferEncodingKt$writeChunk$1.label = 5;
                            if (byteWriteChannel3.flush(chunkedTransferEncodingKt$writeChunk$1) == coroutine_suspended) {
                            }
                            return kotlin.coroutines.jvm.internal.Boxing.boxInt(i5);
                        }
                        if (i3 == 3) {
                            i5 = chunkedTransferEncodingKt$writeChunk$1.I$0;
                            byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            bArr3 = CrLf;
                            chunkedTransferEncodingKt$writeChunk$1.L$0 = byteWriteChannel3;
                            chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                            chunkedTransferEncodingKt$writeChunk$1.label = 4;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel3, bArr3, 0, 0, chunkedTransferEncodingKt$writeChunk$1, 6, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            chunkedTransferEncodingKt$writeChunk$1.L$0 = null;
                            chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                            chunkedTransferEncodingKt$writeChunk$1.label = 5;
                            if (byteWriteChannel3.flush(chunkedTransferEncodingKt$writeChunk$1) == coroutine_suspended) {
                            }
                            return kotlin.coroutines.jvm.internal.Boxing.boxInt(i5);
                        }
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i5 = chunkedTransferEncodingKt$writeChunk$1.I$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.coroutines.jvm.internal.Boxing.boxInt(i5);
                        }
                        i5 = chunkedTransferEncodingKt$writeChunk$1.I$0;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        chunkedTransferEncodingKt$writeChunk$1.L$0 = null;
                        chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                        chunkedTransferEncodingKt$writeChunk$1.label = 5;
                        if (byteWriteChannel3.flush(chunkedTransferEncodingKt$writeChunk$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxInt(i5);
                    }
                    int i10 = chunkedTransferEncodingKt$writeChunk$1.I$2;
                    int i11 = chunkedTransferEncodingKt$writeChunk$1.I$1;
                    int i12 = chunkedTransferEncodingKt$writeChunk$1.I$0;
                    bArr2 = (byte[]) chunkedTransferEncodingKt$writeChunk$1.L$1;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) chunkedTransferEncodingKt$writeChunk$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i4 = i10;
                    byteWriteChannel4 = byteWriteChannel5;
                    i9 = i11;
                    i8 = i12;
                }
                chunkedTransferEncodingKt$writeChunk$1.L$0 = byteWriteChannel4;
                chunkedTransferEncodingKt$writeChunk$1.L$1 = bArr2;
                chunkedTransferEncodingKt$writeChunk$1.I$0 = i8;
                chunkedTransferEncodingKt$writeChunk$1.I$1 = i9;
                chunkedTransferEncodingKt$writeChunk$1.I$2 = i4;
                chunkedTransferEncodingKt$writeChunk$1.label = 2;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(byteWriteChannel4, CrLfShort, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteWriteChannel2 = byteWriteChannel4;
                i5 = i4;
                int i13 = i9;
                i6 = i8;
                i7 = i13;
                chunkedTransferEncodingKt$writeChunk$1.L$0 = byteWriteChannel2;
                chunkedTransferEncodingKt$writeChunk$1.L$1 = null;
                chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                chunkedTransferEncodingKt$writeChunk$1.label = 3;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(byteWriteChannel2, bArr2, i6, i7, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
                }
            }
        }
        chunkedTransferEncodingKt$writeChunk$1 = new io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1(continuation);
        java.lang.Object obj2 = chunkedTransferEncodingKt$writeChunk$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = chunkedTransferEncodingKt$writeChunk$1.label;
        if (i3 != 0) {
        }
        chunkedTransferEncodingKt$writeChunk$1.L$0 = byteWriteChannel4;
        chunkedTransferEncodingKt$writeChunk$1.L$1 = bArr2;
        chunkedTransferEncodingKt$writeChunk$1.I$0 = i8;
        chunkedTransferEncodingKt$writeChunk$1.I$1 = i9;
        chunkedTransferEncodingKt$writeChunk$1.I$2 = i4;
        chunkedTransferEncodingKt$writeChunk$1.label = 2;
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(byteWriteChannel4, CrLfShort, chunkedTransferEncodingKt$writeChunk$1) != coroutine_suspended) {
        }
    }
}
