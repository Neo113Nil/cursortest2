package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005H\u0096A¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lio/ktor/utils/io/CloseHookByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onClose", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;)V", "flushAndClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/Throwable;)V", "flush", "Camera2StreamConfigurationMap", "Lio/ktor/utils/io/ByteWriteChannel;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "", "isClosedForWrite", "()Z", "Lkotlinx/io/Sink;", "getWriteBuffer", "()Lkotlinx/io/Sink;", "writeBuffer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CloseHookByteWriteChannel implements io.ktor.utils.io.ByteWriteChannel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.utils.io.ByteWriteChannel getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public CloseHookByteWriteChannel(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = byteWriteChannel;
        this.getHighSpeedVideoSizes = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r6.invoke(r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6.flushAndClose(r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object flushAndClose(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1 closeHookByteWriteChannel$flushAndClose$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1) {
            closeHookByteWriteChannel$flushAndClose$1 = (io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1) continuation;
            if ((closeHookByteWriteChannel$flushAndClose$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                closeHookByteWriteChannel$flushAndClose$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = closeHookByteWriteChannel$flushAndClose$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = closeHookByteWriteChannel$flushAndClose$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.getHighSpeedVideoFpsRanges;
                    closeHookByteWriteChannel$flushAndClose$1.Camera2StreamConfigurationMap = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.getHighSpeedVideoSizes;
                closeHookByteWriteChannel$flushAndClose$1.Camera2StreamConfigurationMap = 2;
            }
        }
        closeHookByteWriteChannel$flushAndClose$1 = new io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1(this, continuation);
        java.lang.Object obj2 = closeHookByteWriteChannel$flushAndClose$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = closeHookByteWriteChannel$flushAndClose$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function12 = this.getHighSpeedVideoSizes;
        closeHookByteWriteChannel$flushAndClose$1.Camera2StreamConfigurationMap = 2;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final boolean isClosedForWrite() {
        return this.getHighSpeedVideoFpsRanges.isClosedForWrite();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final kotlinx.io.Sink getWriteBuffer() {
        return this.getHighSpeedVideoFpsRanges.getWriteBuffer();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Throwable getClosedCause() {
        return this.getHighSpeedVideoFpsRanges.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighSpeedVideoFpsRanges.flush(continuation);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final void cancel(java.lang.Throwable cause) {
        this.getHighSpeedVideoFpsRanges.cancel(cause);
    }
}
