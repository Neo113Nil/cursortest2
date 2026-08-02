package io.ktor.utils.io.jvm.nio;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0006*\u00020\b0\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "Ljava/nio/ByteBuffer;", "request", "(I)Ljava/nio/ByteBuffer;", "", "tryAwait", "(I)V", "rc", "written", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/nio/ByteBuffer;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WriteSuspendSession {
    private final io.ktor.utils.io.ByteWriteChannel channel;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.nio.ByteBuffer getHighSpeedVideoFpsRanges;

    public WriteSuspendSession(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        this.channel = byteWriteChannel;
        this.getHighSpeedVideoFpsRanges = java.nio.ByteBuffer.allocate(8192);
    }

    public final io.ktor.utils.io.ByteWriteChannel getChannel() {
        return this.channel;
    }

    public final java.nio.ByteBuffer request(int count) {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void tryAwait(int count) {
        kotlinx.io.Sink writeBuffer = this.channel.getWriteBuffer();
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBuffer, "");
        io.ktor.utils.io.core.OutputArraysJVMKt.writeByteBuffer(writeBuffer, byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7.flush(r6) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(r7, r1, r6) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object written(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1 writeSuspendSession$written$1;
        int i2;
        if (continuation instanceof io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1) {
            writeSuspendSession$written$1 = (io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1) continuation;
            if ((writeSuspendSession$written$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                writeSuspendSession$written$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = writeSuspendSession$written$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = writeSuspendSession$written$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges.flip();
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.channel;
                    java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBuffer, "");
                    writeSuspendSession$written$1.getHighSpeedVideoFpsRangesFor = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRanges.clear();
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.channel;
                writeSuspendSession$written$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        writeSuspendSession$written$1 = new io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1(this, continuation);
        java.lang.Object obj2 = writeSuspendSession$written$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = writeSuspendSession$written$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
        this.getHighSpeedVideoFpsRanges.clear();
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel22 = this.channel;
        writeSuspendSession$written$1.getHighSpeedVideoFpsRangesFor = 2;
    }
}
