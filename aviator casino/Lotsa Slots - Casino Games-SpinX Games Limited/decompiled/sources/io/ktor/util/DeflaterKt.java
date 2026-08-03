package io.ktor.util;

/* compiled from: Deflater.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0010\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0015\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u0004\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0082@¢\u0006\u0004\b\u0004\u0010\u001c\u001a5\u0010\u001f\u001a\u00020\u0017*\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a5\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010!\"\u0014\u0010#\u001a\u00020\"8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$\"\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ljava/util/zip/Deflater;", "Ljava/nio/ByteBuffer;", "outBuffer", "", "deflateTo", "(Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;)V", "buffer", "setInputBuffer", "Ljava/util/zip/Checksum;", "updateKeepPosition", "(Ljava/util/zip/Checksum;Ljava/nio/ByteBuffer;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "putGzipHeader", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crc", "deflater", "putGzipTrailer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Checksum;Ljava/util/zip/Deflater;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "predicate", "deflateWhile", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "destination", "gzip", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "deflated", "(Lio/ktor/utils/io/ByteReadChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteWriteChannel;", "", "GZIP_MAGIC", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "", "GZIP_HEADER_PADDING", "[B", "getGZIP_HEADER_PADDING", "()[B", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeflaterKt {
    private static final byte[] GZIP_HEADER_PADDING = new byte[7];
    public static final short GZIP_MAGIC = -29921;

    public static final byte[] getGZIP_HEADER_PADDING() {
        return GZIP_HEADER_PADDING;
    }

    private static final void deflateTo(java.util.zip.Deflater deflater, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()));
        }
    }

    private static final void setInputBuffer(java.util.zip.Deflater deflater, java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new java.lang.IllegalArgumentException("buffer need to be array-backed".toString());
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static final void updateKeepPosition(java.util.zip.Checksum checksum, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checksum, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!buffer.hasArray()) {
            throw new java.lang.IllegalArgumentException("buffer need to be array-backed".toString());
        }
        checksum.update(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object putGzipHeader(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.util.DeflaterKt$putGzipHeader$1 deflaterKt$putGzipHeader$1;
        io.ktor.util.DeflaterKt$putGzipHeader$1 deflaterKt$putGzipHeader$12;
        java.lang.Object coroutine_suspended;
        int i;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        byte[] bArr;
        if (continuation instanceof io.ktor.util.DeflaterKt$putGzipHeader$1) {
            deflaterKt$putGzipHeader$1 = (io.ktor.util.DeflaterKt$putGzipHeader$1) continuation;
            if ((deflaterKt$putGzipHeader$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipHeader$1.label -= Integer.MIN_VALUE;
                deflaterKt$putGzipHeader$12 = deflaterKt$putGzipHeader$1;
                java.lang.Object obj = deflaterKt$putGzipHeader$12.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$putGzipHeader$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    short reverseBytes = java.lang.Short.reverseBytes((short) (-29921));
                    deflaterKt$putGzipHeader$12.L$0 = byteWriteChannel;
                    deflaterKt$putGzipHeader$12.label = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(byteWriteChannel, reverseBytes, deflaterKt$putGzipHeader$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$putGzipHeader$12.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel;
                        bArr = GZIP_HEADER_PADDING;
                        deflaterKt$putGzipHeader$12.L$0 = null;
                        deflaterKt$putGzipHeader$12.label = 3;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, deflaterKt$putGzipHeader$12, 6, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$putGzipHeader$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                deflaterKt$putGzipHeader$12.L$0 = byteWriteChannel;
                deflaterKt$putGzipHeader$12.label = 2;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, (byte) 8, deflaterKt$putGzipHeader$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteWriteChannel2 = byteWriteChannel;
                bArr = GZIP_HEADER_PADDING;
                deflaterKt$putGzipHeader$12.L$0 = null;
                deflaterKt$putGzipHeader$12.label = 3;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, deflaterKt$putGzipHeader$12, 6, null) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        deflaterKt$putGzipHeader$1 = new io.ktor.util.DeflaterKt$putGzipHeader$1(continuation);
        deflaterKt$putGzipHeader$12 = deflaterKt$putGzipHeader$1;
        java.lang.Object obj2 = deflaterKt$putGzipHeader$12.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$putGzipHeader$12.label;
        if (i != 0) {
        }
        deflaterKt$putGzipHeader$12.L$0 = byteWriteChannel;
        deflaterKt$putGzipHeader$12.label = 2;
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, (byte) 8, deflaterKt$putGzipHeader$12) == coroutine_suspended) {
        }
        byteWriteChannel2 = byteWriteChannel;
        bArr = GZIP_HEADER_PADDING;
        deflaterKt$putGzipHeader$12.L$0 = null;
        deflaterKt$putGzipHeader$12.label = 3;
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, deflaterKt$putGzipHeader$12, 6, null) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object putGzipTrailer(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.util.zip.Checksum checksum, java.util.zip.Deflater deflater, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.util.DeflaterKt$putGzipTrailer$1 deflaterKt$putGzipTrailer$1;
        java.lang.Object coroutine_suspended;
        int i;
        int reverseBytes;
        if (continuation instanceof io.ktor.util.DeflaterKt$putGzipTrailer$1) {
            deflaterKt$putGzipTrailer$1 = (io.ktor.util.DeflaterKt$putGzipTrailer$1) continuation;
            if ((deflaterKt$putGzipTrailer$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipTrailer$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = deflaterKt$putGzipTrailer$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$putGzipTrailer$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int reverseBytes2 = java.lang.Integer.reverseBytes((int) checksum.getValue());
                    deflaterKt$putGzipTrailer$1.L$0 = byteWriteChannel;
                    deflaterKt$putGzipTrailer$1.L$1 = deflater;
                    deflaterKt$putGzipTrailer$1.label = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteWriteChannel, reverseBytes2, deflaterKt$putGzipTrailer$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    deflater = (java.util.zip.Deflater) deflaterKt$putGzipTrailer$1.L$1;
                    byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$putGzipTrailer$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                reverseBytes = java.lang.Integer.reverseBytes(deflater.getTotalIn());
                deflaterKt$putGzipTrailer$1.L$0 = null;
                deflaterKt$putGzipTrailer$1.L$1 = null;
                deflaterKt$putGzipTrailer$1.label = 2;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteWriteChannel, reverseBytes, deflaterKt$putGzipTrailer$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        deflaterKt$putGzipTrailer$1 = new io.ktor.util.DeflaterKt$putGzipTrailer$1(continuation);
        java.lang.Object obj2 = deflaterKt$putGzipTrailer$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$putGzipTrailer$1.label;
        if (i != 0) {
        }
        reverseBytes = java.lang.Integer.reverseBytes(deflater.getTotalIn());
        deflaterKt$putGzipTrailer$1.L$0 = null;
        deflaterKt$putGzipTrailer$1.L$1 = null;
        deflaterKt$putGzipTrailer$1.label = 2;
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(byteWriteChannel, reverseBytes, deflaterKt$putGzipTrailer$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object deflateWhile(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.util.zip.Deflater deflater, java.nio.ByteBuffer byteBuffer, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.util.DeflaterKt$deflateWhile$1 deflaterKt$deflateWhile$1;
        int i;
        if (continuation instanceof io.ktor.util.DeflaterKt$deflateWhile$1) {
            deflaterKt$deflateWhile$1 = (io.ktor.util.DeflaterKt$deflateWhile$1) continuation;
            if ((deflaterKt$deflateWhile$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$deflateWhile$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = deflaterKt$deflateWhile$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$deflateWhile$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.functions.Function0<java.lang.Boolean> function02 = (kotlin.jvm.functions.Function0) deflaterKt$deflateWhile$1.L$3;
                    java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) deflaterKt$deflateWhile$1.L$2;
                    java.util.zip.Deflater deflater2 = (java.util.zip.Deflater) deflaterKt$deflateWhile$1.L$1;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$deflateWhile$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function0 = function02;
                    byteWriteChannel = byteWriteChannel2;
                    byteBuffer = byteBuffer2;
                    deflater = deflater2;
                }
                while (function0.invoke().booleanValue()) {
                    byteBuffer.clear();
                    deflateTo(deflater, byteBuffer);
                    byteBuffer.flip();
                    deflaterKt$deflateWhile$1.L$0 = byteWriteChannel;
                    deflaterKt$deflateWhile$1.L$1 = deflater;
                    deflaterKt$deflateWhile$1.L$2 = byteBuffer;
                    deflaterKt$deflateWhile$1.L$3 = function0;
                    deflaterKt$deflateWhile$1.label = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, deflaterKt$deflateWhile$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        deflaterKt$deflateWhile$1 = new io.ktor.util.DeflaterKt$deflateWhile$1(continuation);
        java.lang.Object obj2 = deflaterKt$deflateWhile$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$deflateWhile$1.label;
        if (i != 0) {
        }
        while (function0.invoke().booleanValue()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(7:(1:(1:(1:(1:(6:14|15|16|17|18|19)(2:26|27))(7:28|29|30|31|(2:33|(1:35)(2:36|17))|18|19))(1:41))(11:73|74|75|52|53|(2:55|(1:57))|58|44|45|46|(2:48|(1:50)(9:51|52|53|(0)|58|44|45|46|(2:63|(2:65|(1:67)(4:68|(0)|18|19))(1:69))(0)))(0)))(1:76)|42|43|44|45|46|(0)(0))(6:77|(7:79|80|81|82|83|84|(1:86))(1:94)|87|45|46|(0)(0))|24|25))|96|6|7|(0)(0)|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ae, code lost:
    
        r2 = r3;
        r3 = r5;
        r5 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e6 A[Catch: all -> 0x00f9, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00f9, blocks: (B:33:0x01e6, B:42:0x00f1, B:74:0x00c3), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f A[Catch: all -> 0x0210, TRY_LEAVE, TryCatch #1 {all -> 0x0210, blocks: (B:46:0x0149, B:48:0x014f, B:63:0x01b6, B:65:0x01bc, B:69:0x020f), top: B:45:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #0 {all -> 0x01b0, blocks: (B:53:0x0176, B:55:0x017e), top: B:52:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b6 A[Catch: all -> 0x0210, TRY_ENTER, TryCatch #1 {all -> 0x0210, blocks: (B:46:0x0149, B:48:0x014f, B:63:0x01b6, B:65:0x01bc, B:69:0x020f), top: B:45:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object deflateTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, boolean z, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.util.DeflaterKt$deflateTo$1 deflaterKt$deflateTo$1;
        ?? r5;
        io.ktor.utils.io.pool.ObjectPool objectPool2;
        java.nio.ByteBuffer byteBuffer;
        java.util.zip.Deflater deflater;
        java.nio.ByteBuffer byteBuffer2;
        java.util.zip.CRC32 crc32;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool3;
        java.nio.ByteBuffer byteBuffer3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        boolean z2;
        java.nio.ByteBuffer byteBuffer4;
        java.util.zip.Deflater deflater2;
        boolean z3;
        java.util.zip.CRC32 crc322;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        boolean z4;
        io.ktor.utils.io.pool.ObjectPool objectPool4;
        boolean z5;
        java.nio.ByteBuffer byteBuffer5;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = byteWriteChannel;
        ?? r1 = z;
        if (continuation instanceof io.ktor.util.DeflaterKt$deflateTo$1) {
            deflaterKt$deflateTo$1 = (io.ktor.util.DeflaterKt$deflateTo$1) continuation;
            if ((deflaterKt$deflateTo$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$deflateTo$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = deflaterKt$deflateTo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r5 = deflaterKt$deflateTo$1.label;
                final ?? r11 = 1;
                if (r5 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    crc32 = new java.util.zip.CRC32();
                    deflater = new java.util.zip.Deflater(-1, true);
                    java.nio.ByteBuffer borrow = objectPool.borrow();
                    java.nio.ByteBuffer borrow2 = objectPool.borrow();
                    if (r1 != 0) {
                        byteReadChannel2 = byteReadChannel;
                        try {
                            deflaterKt$deflateTo$1.L$0 = byteReadChannel2;
                            deflaterKt$deflateTo$1.L$1 = byteWriteChannel4;
                            objectPool3 = objectPool;
                            try {
                                deflaterKt$deflateTo$1.L$2 = objectPool3;
                                deflaterKt$deflateTo$1.L$3 = crc32;
                                deflaterKt$deflateTo$1.L$4 = deflater;
                                deflaterKt$deflateTo$1.L$5 = borrow;
                                deflaterKt$deflateTo$1.L$6 = borrow2;
                                deflaterKt$deflateTo$1.Z$0 = r1;
                                deflaterKt$deflateTo$1.label = 1;
                                if (putGzipHeader(byteWriteChannel4, deflaterKt$deflateTo$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                byteBuffer = borrow;
                                byteBuffer2 = borrow2;
                                objectPool2 = objectPool3;
                                deflater.end();
                                objectPool2.recycle(byteBuffer);
                                objectPool2.recycle(byteBuffer2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            objectPool3 = objectPool;
                        }
                    } else {
                        byteReadChannel2 = byteReadChannel;
                        objectPool3 = objectPool;
                    }
                    r11 = deflater;
                    r5 = borrow;
                    byteBuffer3 = borrow2;
                    objectPool2 = objectPool3;
                    z3 = r1;
                    if (byteReadChannel2.isClosedForRead()) {
                    }
                } else {
                    try {
                        if (r5 == 1) {
                            z5 = deflaterKt$deflateTo$1.Z$0;
                            byteBuffer5 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$6;
                            java.nio.ByteBuffer byteBuffer6 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$5;
                            java.util.zip.Deflater deflater3 = (java.util.zip.Deflater) deflaterKt$deflateTo$1.L$4;
                            crc32 = (java.util.zip.CRC32) deflaterKt$deflateTo$1.L$3;
                            objectPool2 = (io.ktor.utils.io.pool.ObjectPool) deflaterKt$deflateTo$1.L$2;
                            byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$deflateTo$1.L$1;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) deflaterKt$deflateTo$1.L$0;
                            byteBuffer4 = byteBuffer6;
                            deflater2 = deflater3;
                        } else if (r5 == 2) {
                            boolean z6 = deflaterKt$deflateTo$1.Z$0;
                            java.nio.ByteBuffer byteBuffer7 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$6;
                            java.nio.ByteBuffer byteBuffer8 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$5;
                            java.util.zip.Deflater deflater4 = (java.util.zip.Deflater) deflaterKt$deflateTo$1.L$4;
                            java.util.zip.CRC32 crc323 = (java.util.zip.CRC32) deflaterKt$deflateTo$1.L$3;
                            io.ktor.utils.io.pool.ObjectPool objectPool5 = (io.ktor.utils.io.pool.ObjectPool) deflaterKt$deflateTo$1.L$2;
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$deflateTo$1.L$1;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) deflaterKt$deflateTo$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            z2 = z6;
                            byteWriteChannel4 = byteWriteChannel5;
                            io.ktor.utils.io.pool.ObjectPool objectPool6 = objectPool5;
                            java.util.zip.CRC32 crc324 = crc323;
                            final java.util.zip.Deflater deflater5 = deflater4;
                            java.nio.ByteBuffer byteBuffer9 = byteBuffer8;
                            io.ktor.util.DeflaterKt$deflateTo$1 deflaterKt$deflateTo$12 = deflaterKt$deflateTo$1;
                            java.nio.ByteBuffer byteBuffer10 = byteBuffer7;
                            try {
                                if (((java.lang.Number) obj).intValue() > 0) {
                                    byteBuffer9.flip();
                                    updateKeepPosition(crc324, byteBuffer9);
                                    setInputBuffer(deflater5, byteBuffer9);
                                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.DeflaterKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            boolean deflateTo$lambda$2;
                                            deflateTo$lambda$2 = io.ktor.util.DeflaterKt.deflateTo$lambda$2(deflater5);
                                            return java.lang.Boolean.valueOf(deflateTo$lambda$2);
                                        }
                                    };
                                    deflaterKt$deflateTo$12.L$0 = byteReadChannel3;
                                    deflaterKt$deflateTo$12.L$1 = byteWriteChannel4;
                                    deflaterKt$deflateTo$12.L$2 = objectPool6;
                                    deflaterKt$deflateTo$12.L$3 = crc324;
                                    deflaterKt$deflateTo$12.L$4 = deflater5;
                                    deflaterKt$deflateTo$12.L$5 = byteBuffer9;
                                    deflaterKt$deflateTo$12.L$6 = byteBuffer10;
                                    deflaterKt$deflateTo$12.Z$0 = z2;
                                    deflaterKt$deflateTo$12.label = 3;
                                    if (deflateWhile(byteWriteChannel4, deflater5, byteBuffer10, function0, deflaterKt$deflateTo$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                byteBuffer3 = byteBuffer10;
                                deflaterKt$deflateTo$1 = deflaterKt$deflateTo$12;
                                byteBuffer4 = byteBuffer9;
                                deflater2 = deflater5;
                                crc32 = crc324;
                                objectPool2 = objectPool6;
                                byteReadChannel2 = byteReadChannel3;
                                z3 = z2;
                                r5 = byteBuffer4;
                                r11 = deflater2;
                                if (byteReadChannel2.isClosedForRead()) {
                                    r5.clear();
                                    deflaterKt$deflateTo$1.L$0 = byteReadChannel2;
                                    deflaterKt$deflateTo$1.L$1 = byteWriteChannel4;
                                    deflaterKt$deflateTo$1.L$2 = objectPool2;
                                    deflaterKt$deflateTo$1.L$3 = crc32;
                                    deflaterKt$deflateTo$1.L$4 = r11;
                                    deflaterKt$deflateTo$1.L$5 = r5;
                                    deflaterKt$deflateTo$1.L$6 = byteBuffer3;
                                    deflaterKt$deflateTo$1.Z$0 = z3;
                                    deflaterKt$deflateTo$1.label = 2;
                                    java.lang.Object readAvailable = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(byteReadChannel2, r5, deflaterKt$deflateTo$1);
                                    if (readAvailable == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    io.ktor.util.DeflaterKt$deflateTo$1 deflaterKt$deflateTo$13 = deflaterKt$deflateTo$1;
                                    byteBuffer10 = byteBuffer3;
                                    obj = readAvailable;
                                    byteReadChannel3 = byteReadChannel2;
                                    objectPool6 = objectPool2;
                                    crc324 = crc32;
                                    deflater5 = r11;
                                    byteBuffer9 = r5;
                                    deflaterKt$deflateTo$12 = deflaterKt$deflateTo$13;
                                    z2 = z3;
                                    if (((java.lang.Number) obj).intValue() > 0) {
                                    }
                                    byteBuffer3 = byteBuffer10;
                                    deflaterKt$deflateTo$1 = deflaterKt$deflateTo$12;
                                    byteBuffer4 = byteBuffer9;
                                    deflater2 = deflater5;
                                    crc32 = crc324;
                                    objectPool2 = objectPool6;
                                    byteReadChannel2 = byteReadChannel3;
                                    z3 = z2;
                                    r5 = byteBuffer4;
                                    r11 = deflater2;
                                    if (byteReadChannel2.isClosedForRead()) {
                                        java.lang.Throwable closedCause = byteReadChannel2.getClosedCause();
                                        if (closedCause != null) {
                                            throw closedCause;
                                        }
                                        r11.finish();
                                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.DeflaterKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                boolean deflateTo$lambda$4;
                                                deflateTo$lambda$4 = io.ktor.util.DeflaterKt.deflateTo$lambda$4(r11);
                                                return java.lang.Boolean.valueOf(deflateTo$lambda$4);
                                            }
                                        };
                                        deflaterKt$deflateTo$1.L$0 = byteWriteChannel4;
                                        deflaterKt$deflateTo$1.L$1 = objectPool2;
                                        deflaterKt$deflateTo$1.L$2 = crc32;
                                        deflaterKt$deflateTo$1.L$3 = r11;
                                        deflaterKt$deflateTo$1.L$4 = r5;
                                        deflaterKt$deflateTo$1.L$5 = byteBuffer3;
                                        deflaterKt$deflateTo$1.L$6 = null;
                                        deflaterKt$deflateTo$1.Z$0 = z3;
                                        deflaterKt$deflateTo$1.label = 4;
                                        if (deflateWhile(byteWriteChannel4, r11, byteBuffer3, function02, deflaterKt$deflateTo$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        crc322 = crc32;
                                        java.nio.ByteBuffer byteBuffer11 = byteBuffer3;
                                        byteWriteChannel2 = byteWriteChannel4;
                                        z4 = z3 ? 1 : 0;
                                        r1 = byteBuffer11;
                                        r5 = r5;
                                        r11 = r11;
                                        if (z4) {
                                        }
                                        r11.end();
                                        objectPool2.recycle(r5);
                                        objectPool2.recycle(r1);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                byteBuffer2 = byteBuffer10;
                                byteBuffer = byteBuffer9;
                                deflater = deflater5;
                                objectPool2 = objectPool6;
                            }
                        } else if (r5 == 3) {
                            z5 = deflaterKt$deflateTo$1.Z$0;
                            byteBuffer5 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$6;
                            java.nio.ByteBuffer byteBuffer12 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$5;
                            java.util.zip.Deflater deflater6 = (java.util.zip.Deflater) deflaterKt$deflateTo$1.L$4;
                            crc32 = (java.util.zip.CRC32) deflaterKt$deflateTo$1.L$3;
                            objectPool2 = (io.ktor.utils.io.pool.ObjectPool) deflaterKt$deflateTo$1.L$2;
                            byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$deflateTo$1.L$1;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) deflaterKt$deflateTo$1.L$0;
                            byteBuffer4 = byteBuffer12;
                            deflater2 = deflater6;
                        } else if (r5 == 4) {
                            z4 = deflaterKt$deflateTo$1.Z$0;
                            java.nio.ByteBuffer byteBuffer13 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$5;
                            java.nio.ByteBuffer byteBuffer14 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$4;
                            java.util.zip.Deflater deflater7 = (java.util.zip.Deflater) deflaterKt$deflateTo$1.L$3;
                            crc322 = (java.util.zip.CRC32) deflaterKt$deflateTo$1.L$2;
                            io.ktor.utils.io.pool.ObjectPool objectPool7 = (io.ktor.utils.io.pool.ObjectPool) deflaterKt$deflateTo$1.L$1;
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel6 = (io.ktor.utils.io.ByteWriteChannel) deflaterKt$deflateTo$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                objectPool2 = objectPool7;
                                byteWriteChannel2 = byteWriteChannel6;
                                r11 = deflater7;
                                r1 = byteBuffer13;
                                r5 = byteBuffer14;
                                if (z4) {
                                    deflaterKt$deflateTo$1.L$0 = objectPool2;
                                    deflaterKt$deflateTo$1.L$1 = r11;
                                    deflaterKt$deflateTo$1.L$2 = r5;
                                    deflaterKt$deflateTo$1.L$3 = r1;
                                    deflaterKt$deflateTo$1.L$4 = null;
                                    deflaterKt$deflateTo$1.L$5 = null;
                                    deflaterKt$deflateTo$1.label = 5;
                                    if (putGzipTrailer(byteWriteChannel2, crc322, r11, deflaterKt$deflateTo$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    byteBuffer = r5;
                                    deflater = r11;
                                    objectPool4 = objectPool2;
                                    r1 = r1;
                                    objectPool2 = objectPool4;
                                    r11 = deflater;
                                    r5 = byteBuffer;
                                }
                                r11.end();
                                objectPool2.recycle(r5);
                                objectPool2.recycle(r1);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                byteBuffer = byteBuffer14;
                                deflater = deflater7;
                                objectPool2 = objectPool7;
                                byteBuffer2 = byteBuffer13;
                            }
                        } else {
                            if (r5 != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.nio.ByteBuffer byteBuffer15 = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$3;
                            byteBuffer = (java.nio.ByteBuffer) deflaterKt$deflateTo$1.L$2;
                            deflater = (java.util.zip.Deflater) deflaterKt$deflateTo$1.L$1;
                            objectPool4 = (io.ktor.utils.io.pool.ObjectPool) deflaterKt$deflateTo$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                r1 = byteBuffer15;
                                objectPool2 = objectPool4;
                                r11 = deflater;
                                r5 = byteBuffer;
                                r11.end();
                                objectPool2.recycle(r5);
                                objectPool2.recycle(r1);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                objectPool2 = objectPool4;
                                byteBuffer2 = byteBuffer15;
                            }
                        }
                        if (byteReadChannel2.isClosedForRead()) {
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r1 = byteBuffer3;
                        byteBuffer = r5;
                        deflater = r11;
                        byteBuffer2 = r1;
                        deflater.end();
                        objectPool2.recycle(byteBuffer);
                        objectPool2.recycle(byteBuffer2);
                        throw th;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer3 = byteBuffer5;
                    z2 = z5;
                    byteWriteChannel4 = byteWriteChannel3;
                    byteReadChannel2 = byteReadChannel3;
                    z3 = z2;
                    r5 = byteBuffer4;
                    r11 = deflater2;
                }
                deflater.end();
                objectPool2.recycle(byteBuffer);
                objectPool2.recycle(byteBuffer2);
                throw th;
            }
        }
        deflaterKt$deflateTo$1 = new io.ktor.util.DeflaterKt$deflateTo$1(continuation);
        java.lang.Object obj2 = deflaterKt$deflateTo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = deflaterKt$deflateTo$1.label;
        final java.util.zip.Deflater r112 = 1;
        if (r5 != 0) {
        }
        deflater.end();
        objectPool2.recycle(byteBuffer);
        objectPool2.recycle(byteBuffer2);
        throw th;
    }

    static /* synthetic */ java.lang.Object deflateTo$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, boolean z, io.ktor.utils.io.pool.ObjectPool objectPool, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            objectPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        }
        return deflateTo(byteReadChannel, byteWriteChannel, z, objectPool, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deflateTo$lambda$2(java.util.zip.Deflater deflater) {
        return !deflater.needsInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deflateTo$lambda$4(java.util.zip.Deflater deflater) {
        return !deflater.finished();
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel deflated$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, boolean z, io.ktor.utils.io.pool.ObjectPool objectPool, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return deflated(byteReadChannel, z, (io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer>) objectPool, coroutineContext);
    }

    public static final io.ktor.utils.io.ByteReadChannel deflated(io.ktor.utils.io.ByteReadChannel byteReadChannel, boolean z, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, true, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.util.DeflaterKt$deflated$1(byteReadChannel, z, pool, null)).getChannel();
    }

    public static /* synthetic */ io.ktor.utils.io.ByteWriteChannel deflated$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, boolean z, io.ktor.utils.io.pool.ObjectPool objectPool, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return deflated(byteWriteChannel, z, (io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer>) objectPool, coroutineContext);
    }

    public static final io.ktor.utils.io.ByteWriteChannel deflated(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, boolean z, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.ByteReadChannelOperationsKt.reader((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, true, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.util.DeflaterKt$deflated$2(byteWriteChannel, z, pool, null)).getChannel();
    }
}
