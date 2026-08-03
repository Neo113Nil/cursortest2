package io.ktor.utils.io.jvm.nio;

/* compiled from: WriteSuspendSession.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "Ljava/nio/ByteBuffer;", "request", "(I)Ljava/nio/ByteBuffer;", "", "tryAwait", "(I)V", "rc", "written", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "kotlin.jvm.PlatformType", "byteBuffer", "Ljava/nio/ByteBuffer;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WriteSuspendSession {
    private final java.nio.ByteBuffer byteBuffer;
    private final io.ktor.utils.io.ByteWriteChannel channel;

    public WriteSuspendSession(io.ktor.utils.io.ByteWriteChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.byteBuffer = java.nio.ByteBuffer.allocate(8192);
    }

    public final io.ktor.utils.io.ByteWriteChannel getChannel() {
        return this.channel;
    }

    public final java.nio.ByteBuffer request(int count) {
        return this.byteBuffer;
    }

    public final void tryAwait(int count) {
        kotlinx.io.Sink writeBuffer = this.channel.getWriteBuffer();
        java.nio.ByteBuffer byteBuffer = this.byteBuffer;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        io.ktor.utils.io.core.OutputArraysJVMKt.writeByteBuffer(writeBuffer, byteBuffer);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object written(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1 writeSuspendSession$written$1;
        java.lang.Object coroutine_suspended;
        int i2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        if (continuation instanceof io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1) {
            writeSuspendSession$written$1 = (io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1) continuation;
            if ((writeSuspendSession$written$1.label & Integer.MIN_VALUE) != 0) {
                writeSuspendSession$written$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = writeSuspendSession$written$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = writeSuspendSession$written$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.byteBuffer.flip();
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.channel;
                    java.nio.ByteBuffer byteBuffer = this.byteBuffer;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                    writeSuspendSession$written$1.label = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel2, byteBuffer, writeSuspendSession$written$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
                this.byteBuffer.clear();
                byteWriteChannel = this.channel;
                writeSuspendSession$written$1.label = 2;
                if (byteWriteChannel.flush(writeSuspendSession$written$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        writeSuspendSession$written$1 = new io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1(this, continuation);
        java.lang.Object obj2 = writeSuspendSession$written$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = writeSuspendSession$written$1.label;
        if (i2 != 0) {
        }
        this.byteBuffer.clear();
        byteWriteChannel = this.channel;
        writeSuspendSession$written$1.label = 2;
        if (byteWriteChannel.flush(writeSuspendSession$written$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
