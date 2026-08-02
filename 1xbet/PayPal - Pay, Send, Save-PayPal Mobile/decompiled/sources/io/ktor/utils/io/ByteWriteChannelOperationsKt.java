package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u001b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001a0\u0010\"\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020$H\u0086@¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b'\u0010\u001f\u001a\u001c\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b*\u0010\u001c\u001a\u001b\u0010.\u001a\u00020\u0003*\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u00020\u0003*\u000200H\u0086@¢\u0006\u0004\b1\u00102\u001a\u0015\u00105\u001a\u000603j\u0002`4*\u000200¢\u0006\u0004\b5\u00106\u001a,\u0010;\u001a\u00020:*\u0002002\u0019\u00109\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010,¢\u0006\u0002\b8\u0012\u0004\u0012\u00020\u000307¢\u0006\u0004\b;\u0010<\u001a!\u0010;\u001a\u00020\u0003*\u0002002\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030=H\u0007¢\u0006\u0004\b;\u0010>\u001a\u0011\u0010?\u001a\u00020\u0003*\u000200¢\u0006\u0004\b?\u0010@\u001aN\u0010L\u001a\u00020K*\u00020A2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u0010E\u001a\u00020D2'\u00109\u001a#\b\u0001\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030H\u0012\u0006\u0012\u0004\u0018\u00010I0F¢\u0006\u0002\bJ¢\u0006\u0004\bL\u0010M\u001aL\u0010L\u001a\u00020K*\u00020A2\b\b\u0002\u0010C\u001a\u00020B2\u0006\u0010O\u001a\u00020N2'\u00109\u001a#\b\u0001\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030H\u0012\u0006\u0012\u0004\u0018\u00010I0F¢\u0006\u0002\bJ¢\u0006\u0004\bL\u0010P\u001a>\u0010S\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010Q\u001a\u00020\t2\u001e\u00109\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0RH\u0086@¢\u0006\u0004\bS\u0010T\u001a\u0014\u0010U\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\bU\u0010V\u001a/\u0010X\u001a\u00020\u0003\"\u0004\b\u0000\u0010W*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000H\u0012\u0006\u0012\u0004\u0018\u00010I07H\u0000¢\u0006\u0004\bX\u0010Y\"\u0015\u0010Z\u001a\u00020D*\u0002008G¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0015\u0010\\\u001a\u00020D*\u0002008G¢\u0006\u0006\u001a\u0004\b\\\u0010[\"\u0014\u0010`\u001a\u00020]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeByte", "(Lio/ktor/utils/io/ByteWriteChannel;BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeShort", "(Lio/ktor/utils/io/ByteWriteChannel;SLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeInt", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeFloat", "(Lio/ktor/utils/io/ByteWriteChannel;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeDouble", "(Lio/ktor/utils/io/ByteWriteChannel;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeLong", "(Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "array", "writeByteArray", "(Lio/ktor/utils/io/ByteWriteChannel;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/Source;", "source", "writeSource", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/io/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeString", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startIndex", "endIndex", "writeFully", "(Lio/ktor/utils/io/ByteWriteChannel;[BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/RawSource;", "writeBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/io/RawSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeStringUtf8", "Lkotlinx/io/Buffer;", "copy", "writePacket", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlinx/io/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "close", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ChannelJob;", "join", "(Lio/ktor/utils/io/ChannelJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lio/ktor/utils/io/getHighSpeedVideoSizes;", "getCancellationException", "(Lio/ktor/utils/io/ChannelJob;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "block", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lio/ktor/utils/io/ChannelJob;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlin/Function0;", "(Lio/ktor/utils/io/ChannelJob;Lkotlin/jvm/functions/Function0;)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lio/ktor/utils/io/ChannelJob;)V", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/WriterScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lio/ktor/utils/io/WriterJob;", "writer", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteChannel;", "channel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "desiredSpace", "Lkotlin/Function3;", "write", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFreeSpace", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "fireAndForget", "(Lkotlin/jvm/functions/Function1;)V", "isCompleted", "(Lio/ktor/utils/io/ChannelJob;)Z", "isCancelled", "Lio/ktor/utils/io/ByteWriteChannelOperationsKt$NO_CALLBACK$1;", "getHighSpeedVideoFpsRanges", "Lio/ktor/utils/io/ByteWriteChannelOperationsKt$NO_CALLBACK$1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteWriteChannelOperationsKt {
    private static final io.ktor.utils.io.ByteWriteChannelOperationsKt$NO_CALLBACK$1 getHighSpeedVideoFpsRanges = new kotlin.coroutines.Continuation<java.lang.Object>() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$NO_CALLBACK$1
        private final kotlin.coroutines.CoroutineContext context = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(java.lang.Object result) {
        }

        @Override // kotlin.coroutines.Continuation
        public final kotlin.coroutines.CoroutineContext getContext() {
            return this.context;
        }
    };

    public static final java.lang.Object writeByte(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte b, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeByte(b);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeShort(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, short s, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeShort(s);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeInt(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeInt(i);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeFloat(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.io.SinksKt.writeFloat(byteWriteChannel.getWriteBuffer(), f);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeDouble(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.io.SinksKt.writeDouble(byteWriteChannel.getWriteBuffer(), d);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeLong(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        byteWriteChannel.getWriteBuffer().writeLong(j);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeByteArray(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.io.Sink.write$default(byteWriteChannel.getWriteBuffer(), bArr, 0, 0, 6, null);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeSource(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlinx.io.Source source, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object writePacket = writePacket(byteWriteChannel, source, continuation);
        return writePacket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writePacket : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeString(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.core.StringsKt.writeText$default(byteWriteChannel.getWriteBuffer(), str, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object writeFully$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return writeFully(byteWriteChannel, bArr, i, i2, continuation);
    }

    public static final java.lang.Object writeFully(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        byteWriteChannel.getWriteBuffer().write(bArr, i, i2);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeBuffer(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlinx.io.RawSource rawSource, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object writePacket = writePacket(byteWriteChannel, kotlinx.io.CoreKt.buffered(rawSource), continuation);
        return writePacket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writePacket : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeStringUtf8(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.core.StringsKt.writeText$default(byteWriteChannel.getWriteBuffer(), str, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writePacket(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlinx.io.Buffer buffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        byteWriteChannel.getWriteBuffer().transferFrom(buffer);
        java.lang.Object flushIfNeeded = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writePacket(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlinx.io.Source source, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2 byteWriteChannelOperationsKt$writePacket$2;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2) {
            byteWriteChannelOperationsKt$writePacket$2 = (io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2) continuation;
            if ((byteWriteChannelOperationsKt$writePacket$2.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                byteWriteChannelOperationsKt$writePacket$2.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = byteWriteChannelOperationsKt$writePacket$2.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteWriteChannelOperationsKt$writePacket$2.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    source = (kotlinx.io.Source) byteWriteChannelOperationsKt$writePacket$2.Camera2StreamConfigurationMap;
                    byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) byteWriteChannelOperationsKt$writePacket$2.getHighSpeedVideoFpsRanges;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                while (!source.exhausted()) {
                    byteWriteChannel.getWriteBuffer().write(source, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source));
                    byteWriteChannelOperationsKt$writePacket$2.getHighSpeedVideoFpsRanges = byteWriteChannel;
                    byteWriteChannelOperationsKt$writePacket$2.Camera2StreamConfigurationMap = source;
                    byteWriteChannelOperationsKt$writePacket$2.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, byteWriteChannelOperationsKt$writePacket$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        byteWriteChannelOperationsKt$writePacket$2 = new io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2(continuation);
        java.lang.Object obj2 = byteWriteChannelOperationsKt$writePacket$2.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteWriteChannelOperationsKt$writePacket$2.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj2);
        while (!source.exhausted()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void close(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        if (th == null) {
            fireAndForget(new io.ktor.utils.io.ByteWriteChannelOperationsKt$close$1(byteWriteChannel));
        } else {
            byteWriteChannel.cancel(th);
        }
    }

    public static final java.lang.Object join(io.ktor.utils.io.ChannelJob channelJob, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object join = channelJob.getJob().join(continuation);
        return join == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : kotlin.Unit.INSTANCE;
    }

    public static final boolean isCompleted(io.ktor.utils.io.ChannelJob channelJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelJob, "");
        return channelJob.getJob().isCompleted();
    }

    public static final boolean isCancelled(io.ktor.utils.io.ChannelJob channelJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelJob, "");
        return channelJob.getJob().isCancelled();
    }

    public static final java.util.concurrent.CancellationException getCancellationException(io.ktor.utils.io.ChannelJob channelJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelJob, "");
        return channelJob.getJob().getCancellationException();
    }

    public static final kotlinx.coroutines.DisposableHandle invokeOnCompletion(io.ktor.utils.io.ChannelJob channelJob, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelJob, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return channelJob.getJob().invokeOnCompletion(function1);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final /* synthetic */ void invokeOnCompletion(io.ktor.utils.io.ChannelJob channelJob, final kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelJob, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        channelJob.getJob().invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.utils.io.ByteWriteChannelOperationsKt.m23410$r8$lambda$JroJBDz0S9_0dn2xT5XM0jfkNw(kotlin.jvm.functions.Function0.this, (java.lang.Throwable) obj);
            }
        });
    }

    public static final void cancel(io.ktor.utils.io.ChannelJob channelJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channelJob, "");
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(channelJob.getJob(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ io.ktor.utils.io.WriterJob writer$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return writer(coroutineScope, coroutineContext, z, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) function2);
    }

    public static final io.ktor.utils.io.WriterJob writer(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return writer(coroutineScope, coroutineContext, new io.ktor.utils.io.ByteChannel(false, 1, null), function2);
    }

    public static /* synthetic */ io.ktor.utils.io.WriterJob writer$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.ByteChannel byteChannel, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return writer(coroutineScope, coroutineContext, byteChannel, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) function2);
    }

    public static final io.ktor.utils.io.WriterJob writer(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, final io.ktor.utils.io.ByteChannel byteChannel, kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1(function2, byteChannel, null), 2, null);
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.utils.io.ByteWriteChannelOperationsKt.m23411$r8$lambda$yeiaMoqiPgrKKCkddKoNyojBzQ(io.ktor.utils.io.ByteChannel.this, (java.lang.Throwable) obj);
            }
        });
        return new io.ktor.utils.io.WriterJob(byteChannel, launch$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object write(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> function3, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1 byteWriteChannelOperationsKt$write$1;
        int i2;
        int i3;
        if (continuation instanceof io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1) {
            byteWriteChannelOperationsKt$write$1 = (io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1) continuation;
            if ((byteWriteChannelOperationsKt$write$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                byteWriteChannelOperationsKt$write$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = byteWriteChannelOperationsKt$write$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteWriteChannelOperationsKt$write$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int size = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel.getWriteBuffer().getGetHighResolutionOutputSizeshNQ4ISI();
                    kotlinx.io.Segment writableSegment = getHighResolutionOutputSizeshNQ4ISI.writableSegment(i);
                    byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
                    int intValue = function3.invoke(dataAsByteArray, kotlin.coroutines.jvm.internal.Boxing.boxInt(writableSegment.getLimit()), kotlin.coroutines.jvm.internal.Boxing.boxInt(dataAsByteArray.length)).intValue();
                    if (intValue == i) {
                        writableSegment.writeBackData(dataAsByteArray, intValue);
                        writableSegment.setLimit(writableSegment.getLimit() + intValue);
                        getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + intValue);
                    } else {
                        if (intValue < 0 || intValue > writableSegment.getRemainingCapacity()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                            sb.append(intValue);
                            sb.append(". Should be in 0..");
                            sb.append(writableSegment.getRemainingCapacity());
                            throw new java.lang.IllegalStateException(sb.toString().toString());
                        }
                        if (intValue != 0) {
                            writableSegment.writeBackData(dataAsByteArray, intValue);
                            writableSegment.setLimit(writableSegment.getLimit() + intValue);
                            getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + intValue);
                        } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                            getHighResolutionOutputSizeshNQ4ISI.recycleTail();
                        }
                    }
                    int size2 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer()) - size;
                    byteWriteChannelOperationsKt$write$1.Camera2StreamConfigurationMap = size2;
                    byteWriteChannelOperationsKt$write$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, byteWriteChannelOperationsKt$write$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = size2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = byteWriteChannelOperationsKt$write$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(i3);
            }
        }
        byteWriteChannelOperationsKt$write$1 = new io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1(continuation);
        java.lang.Object obj2 = byteWriteChannelOperationsKt$write$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteWriteChannelOperationsKt$write$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(i3);
    }

    public static /* synthetic */ java.lang.Object write$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return write(byteWriteChannel, i, function3, continuation);
    }

    public static final java.lang.Object awaitFreeSpace(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object flush = byteWriteChannel.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }

    public static final <R> void fireAndForget(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(function1, getHighSpeedVideoFpsRanges);
    }

    /* renamed from: $r8$lambda$JroJBDz0S9_0dn2-xT5XM0jfkNw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23410$r8$lambda$JroJBDz0S9_0dn2xT5XM0jfkNw(kotlin.jvm.functions.Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yeiaMoqiPgrKKCk-ddKoNyojBzQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23411$r8$lambda$yeiaMoqiPgrKKCkddKoNyojBzQ(io.ktor.utils.io.ByteChannel byteChannel, java.lang.Throwable th) {
        if (th != null && !byteChannel.isClosedForWrite()) {
            byteChannel.cancel(th);
        }
        return kotlin.Unit.INSTANCE;
    }
}
