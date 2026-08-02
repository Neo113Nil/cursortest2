package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0014\u0010\b\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\b\u001a%\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u0007\u0010\u0019\u001a4\u0010\u001c\u001a\u00020\u0013*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u0014\b\b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0017H\u0086H¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Ljava/nio/ByteBuffer;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "(Ljava/nio/ByteBuffer;)Lio/ktor/utils/io/ByteReadChannel;", "buffer", "", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/bytestring/ByteString;", "ByteString", "(Ljava/nio/ByteBuffer;)Lkotlinx/io/bytestring/ByteString;", "Ljava/nio/channels/WritableByteChannel;", "channel", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/channels/WritableByteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delimiter", "", "skipDelimiter", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFully", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/jvm/functions/Function1;)I", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "consumer", "read", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteReadChannelOperations_jvmKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 byteReadChannelOperations_jvmKt$readAvailable$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1) {
            byteReadChannelOperations_jvmKt$readAvailable$1 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1) continuation;
            if ((byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxInt(-1);
                    }
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoSizes = byteReadChannel;
                        byteReadChannelOperations_jvmKt$readAvailable$1.Camera2StreamConfigurationMap = byteBuffer;
                        byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$readAvailable$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (java.nio.ByteBuffer) byteReadChannelOperations_jvmKt$readAvailable$1.Camera2StreamConfigurationMap;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return !byteReadChannel.isClosedForRead() ? kotlin.coroutines.jvm.internal.Boxing.boxInt(-1) : kotlin.coroutines.jvm.internal.Boxing.boxInt(kotlinx.io.SourcesJvmKt.readAtMostTo(byteReadChannel.getReadBuffer(), byteBuffer));
            }
        }
        byteReadChannelOperations_jvmKt$readAvailable$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$readAvailable$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (!byteReadChannel.isClosedForRead()) {
        }
    }

    public static final kotlinx.io.bytestring.ByteString ByteString(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.mark();
        byteBuffer.get(bArr);
        byteBuffer.reset();
        return new kotlinx.io.bytestring.ByteString(bArr, 0, 0, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f8 -> B:11:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, final java.nio.channels.WritableByteChannel writableByteChannel, final long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1 byteReadChannelOperations_jvmKt$copyTo$1;
        int i;
        final kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.functions.Function1 function1;
        java.lang.Throwable closedCause;
        java.lang.Object awaitContent$default;
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        long j2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1) {
            byteReadChannelOperations_jvmKt$copyTo$1 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1) continuation;
            if ((byteReadChannelOperations_jvmKt$copyTo$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$copyTo$1.getInputFormats -= 2147483648;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$copyTo$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$copyTo$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException("Limit shouldn't be negative: ".concat(java.lang.String.valueOf(j)).toString());
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
                            return io.ktor.utils.io.ByteReadChannelOperations_jvmKt.m23409$r8$lambda$xN85WDUGTgvx2NQd_E9iwFgXY0(j, longRef, writableByteChannel, (java.nio.ByteBuffer) obj2);
                        }
                    };
                } else if (i == 1) {
                    int i2 = byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoFpsRanges;
                    j = byteReadChannelOperations_jvmKt$copyTo$1.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoSizesFor;
                    function1 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Not enough bytes available: required ");
                        sb.append(i2);
                        sb.append(" but ");
                        sb.append(io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel3));
                        sb.append(" available");
                        throw new java.io.EOFException(sb.toString());
                    }
                    io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel3.getReadBuffer(), function1);
                    longRef = longRef3;
                    byteReadChannel = byteReadChannel4;
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = byteReadChannelOperations_jvmKt$copyTo$1.getHighResolutionOutputSizeshNQ4ISI;
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoSizesFor;
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoFpsRangesFor;
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel5 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function12 = function13;
                    awaitContent$default = obj;
                    j2 = j3;
                    byteReadChannel = byteReadChannel5;
                    if (((java.lang.Boolean) awaitContent$default).booleanValue()) {
                        io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel2.getReadBuffer(), function12);
                    }
                    j = j2;
                    longRef = longRef2;
                    function1 = function12;
                }
                if (longRef.element < j || byteReadChannel.isClosedForRead()) {
                    closedCause = byteReadChannel.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(longRef.element);
                }
                byteReadChannelOperations_jvmKt$copyTo$1.Camera2StreamConfigurationMap = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoSizes = longRef;
                byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoFpsRangesFor = function1;
                byteReadChannelOperations_jvmKt$copyTo$1.getHighSpeedVideoSizesFor = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.getHighResolutionOutputSizeshNQ4ISI = j;
                byteReadChannelOperations_jvmKt$copyTo$1.getInputFormats = 2;
                awaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$copyTo$1, 1, null);
                if (awaitContent$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function12 = function1;
                longRef2 = longRef;
                j2 = j;
                byteReadChannel2 = byteReadChannel;
                if (((java.lang.Boolean) awaitContent$default).booleanValue()) {
                }
                j = j2;
                longRef = longRef2;
                function1 = function12;
                if (longRef.element < j) {
                }
                closedCause = byteReadChannel.getClosedCause();
                if (closedCause != null) {
                }
            }
        }
        byteReadChannelOperations_jvmKt$copyTo$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$copyTo$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$copyTo$1.getInputFormats;
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
            if ((byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$skipDelimiter$2.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighResolutionOutputSizeshNQ4ISI;
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
                    i3 = byteReadChannelOperations_jvmKt$skipDelimiter$2.Camera2StreamConfigurationMap;
                    int i4 = byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighSpeedVideoFpsRangesFor;
                    kotlinx.io.bytestring.ByteString byteString3 = (kotlinx.io.bytestring.ByteString) byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighSpeedVideoSizes;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Number) obj).byteValue() != byteString3.get(i4)) {
                        byteString2 = byteString3;
                        i2 = i4 + 1;
                        byteReadChannel2 = byteReadChannel3;
                        if (i2 >= i3) {
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighSpeedVideoFpsRanges = byteReadChannel2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighSpeedVideoSizes = byteString2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighSpeedVideoFpsRangesFor = i2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.Camera2StreamConfigurationMap = i3;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighResolutionOutputSizeshNQ4ISI = 1;
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
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$skipDelimiter$2.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$skipDelimiter$2.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0047 -> B:11:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readFully(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1 byteReadChannelOperations_jvmKt$readFully$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1) {
            byteReadChannelOperations_jvmKt$readFully$1 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1) continuation;
            if ((byteReadChannelOperations_jvmKt$readFully$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$readFully$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$readFully$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$readFully$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (byteBuffer.hasRemaining()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) byteReadChannelOperations_jvmKt$readFully$1.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$readFully$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = byteReadChannel2;
                    byteBuffer = byteBuffer2;
                    byteReadChannel = byteReadChannel3;
                    kotlinx.io.SourcesJvmKt.readAtMostTo(byteReadChannel.getReadBuffer(), byteBuffer);
                    if (byteBuffer.hasRemaining()) {
                        if (io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel) == 0) {
                            byteReadChannelOperations_jvmKt$readFully$1.Camera2StreamConfigurationMap = byteReadChannel;
                            byteReadChannelOperations_jvmKt$readFully$1.getHighResolutionOutputSizeshNQ4ISI = byteBuffer;
                            byteReadChannelOperations_jvmKt$readFully$1.getHighSpeedVideoFpsRangesFor = 1;
                            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$readFully$1, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            java.nio.ByteBuffer byteBuffer3 = byteBuffer;
                            byteReadChannel2 = byteReadChannel;
                            byteBuffer2 = byteBuffer3;
                            io.ktor.utils.io.ByteReadChannel byteReadChannel32 = byteReadChannel2;
                            byteBuffer = byteBuffer2;
                            byteReadChannel = byteReadChannel32;
                        }
                        kotlinx.io.SourcesJvmKt.readAtMostTo(byteReadChannel.getReadBuffer(), byteBuffer);
                        if (byteBuffer.hasRemaining()) {
                        }
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
        byteReadChannelOperations_jvmKt$readFully$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$readFully$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$readFully$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    public static final int readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, java.lang.Integer> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (byteReadChannel.isClosedForRead() || byteReadChannel.getReadBuffer().exhausted()) {
            return -1;
        }
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI = byteReadChannel.getReadBuffer().getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI.exhausted()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = getHighResolutionOutputSizeshNQ4ISI.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos);
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
        int intValue = function1.invoke(wrap).intValue();
        if (intValue == 0) {
            return intValue;
        }
        if (intValue < 0) {
            throw new java.lang.IllegalStateException("Returned negative read bytes count");
        }
        if (intValue > head.getSize()) {
            throw new java.lang.IllegalStateException("Returned too many bytes");
        }
        getHighResolutionOutputSizeshNQ4ISI.skip(intValue);
        return intValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r8 == r1) goto L28;
     */
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
            if ((byteReadChannelOperations_jvmKt$read$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$read$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = byteReadChannelOperations_jvmKt$read$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperations_jvmKt$read$1.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i < 0) {
                        throw new java.lang.IllegalArgumentException("min should be positive or zero".toString());
                    }
                    if (i > 0) {
                        byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoFpsRangesFor = byteReadChannel;
                        byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoSizes = function1;
                        byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoFpsRanges = i;
                        byteReadChannelOperations_jvmKt$read$1.Camera2StreamConfigurationMap = 1;
                        obj = byteReadChannel.awaitContent(i, byteReadChannelOperations_jvmKt$read$1);
                    } else {
                        byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoFpsRangesFor = byteReadChannel;
                        byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoSizes = function1;
                        byteReadChannelOperations_jvmKt$read$1.Camera2StreamConfigurationMap = 2;
                        obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$read$1, 1, null);
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    i = byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoSizes;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Not enough bytes available: required ");
                        sb.append(i);
                        sb.append(" but ");
                        sb.append(io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel));
                        sb.append(" available");
                        throw new java.io.EOFException(sb.toString());
                    }
                    io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoSizes;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperations_jvmKt$read$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        byteReadChannelOperations_jvmKt$read$1 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperations_jvmKt$read$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperations_jvmKt$read$1.Camera2StreamConfigurationMap;
        if (i2 != 0) {
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
            if (!((java.lang.Boolean) byteReadChannel.awaitContent(i, continuation)).booleanValue()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Not enough bytes available: required ");
                sb.append(i);
                sb.append(" but ");
                sb.append(io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel));
                sb.append(" available");
                throw new java.io.EOFException(sb.toString());
            }
            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
        } else if (((java.lang.Boolean) io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, continuation, 1, null)).booleanValue()) {
            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(buffer, byteBuffer);
        return io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel(buffer);
    }

    /* renamed from: $r8$lambda$xN85WDU-GTgvx2NQd_E9iwFgXY0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23409$r8$lambda$xN85WDUGTgvx2NQd_E9iwFgXY0(long j, kotlin.jvm.internal.Ref.LongRef longRef, java.nio.channels.WritableByteChannel writableByteChannel, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        long j2 = j - longRef.element;
        if (j2 < byteBuffer.remaining()) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + ((int) j2));
            while (byteBuffer.hasRemaining()) {
                writableByteChannel.write(byteBuffer);
            }
            byteBuffer.limit(limit);
        } else {
            j2 = 0;
            while (byteBuffer.hasRemaining()) {
                j2 += writableByteChannel.write(byteBuffer);
            }
        }
        longRef.element += j2;
        return kotlin.Unit.INSTANCE;
    }
}
