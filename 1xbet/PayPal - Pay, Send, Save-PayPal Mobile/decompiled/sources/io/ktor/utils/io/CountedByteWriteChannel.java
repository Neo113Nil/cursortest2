package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00148G¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8WX\u0096\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\""}, d2 = {"Lio/ktor/utils/io/CountedByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flushAndClose", "", "cause", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRanges", "Lio/ktor/utils/io/ByteWriteChannel;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "", "getTotalBytesWritten", "()J", "getTotalBytesWritten$annotations", "()V", "totalBytesWritten", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "Lkotlinx/io/Sink;", "getWriteBuffer", "()Lkotlinx/io/Sink;", "getWriteBuffer$annotations", "writeBuffer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CountedByteWriteChannel implements io.ktor.utils.io.ByteWriteChannel {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final io.ktor.utils.io.ByteWriteChannel getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    public static /* synthetic */ void getTotalBytesWritten$annotations() {
    }

    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    public CountedByteWriteChannel(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        this.getHighSpeedVideoFpsRanges = byteWriteChannel;
        this.Camera2StreamConfigurationMap = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    public final long getTotalBytesWritten() {
        return (this.getHighResolutionOutputSizeshNQ4ISI + io.ktor.utils.io.core.BytePacketBuilderKt.getSize(getWriteBuffer())) - this.Camera2StreamConfigurationMap;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final boolean isClosedForWrite() {
        return this.getHighSpeedVideoFpsRanges.isClosedForWrite();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Throwable getClosedCause() {
        return this.getHighSpeedVideoFpsRanges.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final kotlinx.io.Sink getWriteBuffer() {
        return this.getHighSpeedVideoFpsRanges.getWriteBuffer();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.CountedByteWriteChannel$flush$1 countedByteWriteChannel$flush$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.CountedByteWriteChannel$flush$1) {
            countedByteWriteChannel$flush$1 = (io.ktor.utils.io.CountedByteWriteChannel$flush$1) continuation;
            if ((countedByteWriteChannel$flush$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                countedByteWriteChannel$flush$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = countedByteWriteChannel$flush$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = countedByteWriteChannel$flush$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighResolutionOutputSizeshNQ4ISI += io.ktor.utils.io.core.BytePacketBuilderKt.getSize(getWriteBuffer());
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.getHighSpeedVideoFpsRanges;
                    countedByteWriteChannel$flush$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (byteWriteChannel.flush(countedByteWriteChannel$flush$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.Camera2StreamConfigurationMap = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(getWriteBuffer());
                return kotlin.Unit.INSTANCE;
            }
        }
        countedByteWriteChannel$flush$1 = new io.ktor.utils.io.CountedByteWriteChannel$flush$1(this, continuation);
        java.lang.Object obj2 = countedByteWriteChannel$flush$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = countedByteWriteChannel$flush$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        this.Camera2StreamConfigurationMap = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(getWriteBuffer());
        return kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Object flushAndClose(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object flushAndClose = this.getHighSpeedVideoFpsRanges.flushAndClose(continuation);
        return flushAndClose == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushAndClose : kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final void cancel(java.lang.Throwable cause) {
        this.getHighSpeedVideoFpsRanges.cancel(cause);
    }
}
