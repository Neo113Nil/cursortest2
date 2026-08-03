package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0014\u0010\b\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\b\u001a%\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u0007\u0010\u0019\u001a4\u0010\u001c\u001a\u00020\u0013*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u0014\b\b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0017H\u0086H¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljava/nio/ByteBuffer;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "(Ljava/nio/ByteBuffer;)Lio/ktor/utils/io/ByteReadChannel;", "buffer", "", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/bytestring/ByteString;", "ByteString", "(Ljava/nio/ByteBuffer;)Lkotlinx/io/bytestring/ByteString;", "Ljava/nio/channels/WritableByteChannel;", "channel", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/channels/WritableByteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delimiter", "", "skipDelimiter", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFully", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/jvm/functions/Function1;)I", "min", "consumer", "read", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteReadChannelOperations_jvmKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 byteReadChannelOperations_jvmKt$readAvailable$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1) {
            byteReadChannelOperations_jvmKt$readAvailable$1 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1) continuation;
            if ((byteReadChannelOperations_jvmKt$readAvailable$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$readAvailable$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$readAvailable$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$readAvailable$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxInt(-1);
                    }
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperations_jvmKt$readAvailable$1.L$0 = byteReadChannel;
                        byteReadChannelOperations_jvmKt$readAvailable$1.L$1 = byteBuffer;
                        byteReadChannelOperations_jvmKt$readAvailable$1.label = 1;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$readAvailable$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) byteReadChannelOperations_jvmKt$readAvailable$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$readAvailable$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer = byteBuffer2;
                    byteReadChannel = byteReadChannel2;
                }
                return !byteReadChannel.isClosedForRead() ? kotlin.coroutines.jvm.internal.Boxing.boxInt(-1) : kotlin.coroutines.jvm.internal.Boxing.boxInt(kotlinx.io.SourcesJvmKt.readAtMostTo(byteReadChannel.getReadBuffer(), byteBuffer));
            }
        }
        byteReadChannelOperations_jvmKt$readAvailable$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$readAvailable$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$readAvailable$1.label;
        if (i != 0) {
        }
        if (!byteReadChannel.isClosedForRead()) {
        }
    }

    public static final kotlinx.io.bytestring.ByteString ByteString(java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        byte[] bArr = new byte[buffer.remaining()];
        buffer.mark();
        buffer.get(bArr);
        buffer.reset();
        return new kotlinx.io.bytestring.ByteString(bArr, 0, 0, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f3 -> B:11:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, final java.nio.channels.WritableByteChannel writableByteChannel, final long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1 byteReadChannelOperations_jvmKt$copyTo$1;
        int i;
        final kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.functions.Function1 function1;
        java.lang.Throwable closedCause;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        long j2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1) {
            byteReadChannelOperations_jvmKt$copyTo$1 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1) continuation;
            if ((byteReadChannelOperations_jvmKt$copyTo$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$copyTo$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$copyTo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$copyTo$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
                    }
                    if ((writableByteChannel instanceof java.nio.channels.SelectableChannel) && !((java.nio.channels.SelectableChannel) writableByteChannel).isBlocking()) {
                        throw new java.lang.IllegalArgumentException("Non-blocking channels are not supported");
                    }
                    if (byteReadChannel.isClosedForRead()) {
                        java.lang.Throwable closedCause2 = byteReadChannel.getClosedCause();
                        if (closedCause2 != null) {
                            throw closedCause2;
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxLong(0L);
                    }
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit copyTo$lambda$3;
                            copyTo$lambda$3 = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.copyTo$lambda$3(j, longRef, writableByteChannel, (java.nio.ByteBuffer) obj2);
                            return copyTo$lambda$3;
                        }
                    };
                } else if (i == 1) {
                    int i2 = byteReadChannelOperations_jvmKt$copyTo$1.I$0;
                    long j3 = byteReadChannelOperations_jvmKt$copyTo$1.J$0;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$3;
                    function1 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$copyTo$1.L$2;
                    kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) byteReadChannelOperations_jvmKt$copyTo$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel5 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        throw new java.io.EOFException("Not enough bytes available: required " + i2 + " but " + io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel4) + " available");
                    }
                    io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel4.getReadBuffer(), function1);
                    j = j3;
                    longRef = longRef3;
                    byteReadChannel = byteReadChannel5;
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = byteReadChannelOperations_jvmKt$copyTo$1.J$0;
                    byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$3;
                    function12 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$copyTo$1.L$2;
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) byteReadChannelOperations_jvmKt$copyTo$1.L$1;
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel3.getReadBuffer(), function12);
                    }
                    longRef = longRef2;
                    function1 = function12;
                    j = j2;
                    byteReadChannel = byteReadChannel2;
                }
                if (longRef.element < j || byteReadChannel.isClosedForRead()) {
                    closedCause = byteReadChannel.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(longRef.element);
                }
                byteReadChannelOperations_jvmKt$copyTo$1.L$0 = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.L$1 = longRef;
                byteReadChannelOperations_jvmKt$copyTo$1.L$2 = function1;
                byteReadChannelOperations_jvmKt$copyTo$1.L$3 = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.J$0 = j;
                byteReadChannelOperations_jvmKt$copyTo$1.label = 2;
                java.lang.Object awaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$copyTo$1, 1, null);
                if (awaitContent$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteReadChannel2 = byteReadChannel;
                long j4 = j;
                byteReadChannel3 = byteReadChannel2;
                function12 = function1;
                longRef2 = longRef;
                obj = awaitContent$default;
                j2 = j4;
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
                longRef = longRef2;
                function1 = function12;
                j = j2;
                byteReadChannel = byteReadChannel2;
                if (longRef.element < j) {
                }
                closedCause = byteReadChannel.getClosedCause();
                if (closedCause != null) {
                }
            }
        }
        byteReadChannelOperations_jvmKt$copyTo$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$copyTo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$copyTo$1.label;
        if (i != 0) {
        }
        if (longRef.element < j) {
        }
        closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
        }
    }

    public static /* synthetic */ java.lang.Object copyTo$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.channels.WritableByteChannel writableByteChannel, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, writableByteChannel, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit copyTo$lambda$3(long j, kotlin.jvm.internal.Ref.LongRef longRef, java.nio.channels.WritableByteChannel writableByteChannel, java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bb, "bb");
        long j2 = j - longRef.element;
        if (j2 < bb.remaining()) {
            int limit = bb.limit();
            bb.limit(bb.position() + ((int) j2));
            while (bb.hasRemaining()) {
                writableByteChannel.write(bb);
            }
            bb.limit(limit);
            longRef.element += j2;
        } else {
            long j3 = 0;
            while (bb.hasRemaining()) {
                j3 += writableByteChannel.write(bb);
            }
            longRef.element += j3;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object skipDelimiter(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object skipDelimiter = skipDelimiter(byteReadChannel, ByteString(byteBuffer), continuation);
        return skipDelimiter == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? skipDelimiter : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object skipDelimiter(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2 byteReadChannelOperations_jvmKt$skipDelimiter$2;
        int i;
        int i2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i3;
        kotlinx.io.bytestring.ByteString byteString2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2) {
            byteReadChannelOperations_jvmKt$skipDelimiter$2 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2) continuation;
            if ((byteReadChannelOperations_jvmKt$skipDelimiter$2.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$skipDelimiter$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$skipDelimiter$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$skipDelimiter$2.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int size = byteString.getSize();
                    i2 = 0;
                    byteReadChannel2 = byteReadChannel;
                    i3 = size;
                    byteString2 = byteString;
                    if (i2 >= i3) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = byteReadChannelOperations_jvmKt$skipDelimiter$2.I$1;
                    int i4 = byteReadChannelOperations_jvmKt$skipDelimiter$2.I$0;
                    kotlinx.io.bytestring.ByteString byteString3 = (kotlinx.io.bytestring.ByteString) byteReadChannelOperations_jvmKt$skipDelimiter$2.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$skipDelimiter$2.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Number) obj).byteValue() != byteString3.get(i4)) {
                        byteString2 = byteString3;
                        i2 = i4 + 1;
                        byteReadChannel2 = byteReadChannel3;
                        if (i2 >= i3) {
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.L$0 = byteReadChannel2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.L$1 = byteString2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.I$0 = i2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.I$1 = i3;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.label = 1;
                            java.lang.Object readByte = io.ktor.utils.io.ByteReadChannelOperationsKt.readByte(byteReadChannel2, byteReadChannelOperations_jvmKt$skipDelimiter$2);
                            if (readByte == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteReadChannel3 = byteReadChannel2;
                            i4 = i2;
                            byteString3 = byteString2;
                            obj = readByte;
                            if (((java.lang.Number) obj).byteValue() != byteString3.get(i4)) {
                                throw new java.lang.IllegalStateException("Delimiter is not found");
                            }
                        } else {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        byteReadChannelOperations_jvmKt$skipDelimiter$2 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$skipDelimiter$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$skipDelimiter$2.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readFully(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1 byteReadChannelOperations_jvmKt$readFully$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1) {
            byteReadChannelOperations_jvmKt$readFully$1 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1) continuation;
            if ((byteReadChannelOperations_jvmKt$readFully$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$readFully$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$readFully$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$readFully$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!byteBuffer.hasRemaining()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) byteReadChannelOperations_jvmKt$readFully$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$readFully$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer = byteBuffer2;
                    byteReadChannel = byteReadChannel2;
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        kotlinx.io.SourcesJvmKt.readAtMostTo(byteReadChannel.getReadBuffer(), byteBuffer);
                        if (!byteBuffer.hasRemaining()) {
                            byteReadChannelOperations_jvmKt$readFully$1.L$0 = byteReadChannel;
                            byteReadChannelOperations_jvmKt$readFully$1.L$1 = byteBuffer;
                            byteReadChannelOperations_jvmKt$readFully$1.label = 1;
                            obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$readFully$1, 1, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                throw new java.io.EOFException("Not enough bytes available: expected " + byteBuffer.remaining() + " more bytes");
                            }
                        } else {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        byteReadChannelOperations_jvmKt$readFully$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$readFully$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$readFully$1.label;
        if (i != 0) {
        }
    }

    public static final int readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, java.lang.Integer> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (byteReadChannel.isClosedForRead() || byteReadChannel.getReadBuffer().exhausted()) {
            return -1;
        }
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer bufferField = byteReadChannel.getReadBuffer().getBufferField();
        if (!(!bufferField.exhausted())) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = bufferField.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos);
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
        int intValue = block.invoke(wrap).intValue();
        if (intValue != 0) {
            if (intValue < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (intValue > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            bufferField.skip(intValue);
        }
        return intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object read(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1 byteReadChannelOperations_jvmKt$read$1;
        int i2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1) {
            byteReadChannelOperations_jvmKt$read$1 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1) continuation;
            if ((byteReadChannelOperations_jvmKt$read$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$read$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$read$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperations_jvmKt$read$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i < 0) {
                        throw new java.lang.IllegalArgumentException("min should be positive or zero".toString());
                    }
                    if (i > 0) {
                        byteReadChannelOperations_jvmKt$read$1.L$0 = byteReadChannel;
                        byteReadChannelOperations_jvmKt$read$1.L$1 = function1;
                        byteReadChannelOperations_jvmKt$read$1.I$0 = i;
                        byteReadChannelOperations_jvmKt$read$1.label = 1;
                        obj = byteReadChannel.awaitContent(i, byteReadChannelOperations_jvmKt$read$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        byteReadChannelOperations_jvmKt$read$1.L$0 = byteReadChannel;
                        byteReadChannelOperations_jvmKt$read$1.L$1 = function1;
                        byteReadChannelOperations_jvmKt$read$1.label = 2;
                        obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$read$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    }
                } else if (i2 == 1) {
                    i = byteReadChannelOperations_jvmKt$read$1.I$0;
                    function1 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$read$1.L$1;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$read$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        throw new java.io.EOFException("Not enough bytes available: required " + i + " but " + io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel) + " available");
                    }
                    io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$read$1.L$1;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$read$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        byteReadChannelOperations_jvmKt$read$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$read$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperations_jvmKt$read$1.label;
        if (i2 != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final java.lang.Object read$$forInline(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("min should be positive or zero".toString());
        }
        if (i > 0) {
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object awaitContent = byteReadChannel.awaitContent(i, continuation);
            kotlin.jvm.internal.InlineMarker.mark(1);
            if (!((java.lang.Boolean) awaitContent).booleanValue()) {
                throw new java.io.EOFException("Not enough bytes available: required " + i + " but " + io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel) + " available");
            }
            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
        } else {
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object awaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, continuation, 1, null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            if (((java.lang.Boolean) awaitContent$default).booleanValue()) {
                io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object read$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("min should be positive or zero".toString());
        }
        if (i > 0) {
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object awaitContent = byteReadChannel.awaitContent(i, continuation);
            kotlin.jvm.internal.InlineMarker.mark(1);
            if (!((java.lang.Boolean) awaitContent).booleanValue()) {
                throw new java.io.EOFException("Not enough bytes available: required " + i + " but " + io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel) + " available");
            }
            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
        } else {
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object awaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, continuation, 1, null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            if (((java.lang.Boolean) awaitContent$default).booleanValue()) {
                io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(java.nio.ByteBuffer content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(buffer, content);
        return io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel(buffer);
    }
}
