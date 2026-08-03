package io.ktor.utils.io;

/* compiled from: CountedByteReadChannel.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u00158VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010\f\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lio/ktor/utils/io/CountedByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", "min", "", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transferFromDelegate", "()V", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "updateConsumed", "Lio/ktor/utils/io/ByteReadChannel;", "getDelegate", "()Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/Buffer;", "buffer", "Lkotlinx/io/Buffer;", "", "initial", "J", "consumed", "getTotalBytesRead", "()J", "totalBytesRead", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "getReadBuffer", "()Lkotlinx/io/Buffer;", "getReadBuffer$annotations", "readBuffer", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CountedByteReadChannel implements io.ktor.utils.io.ByteReadChannel {
    private final kotlinx.io.Buffer buffer;
    private long consumed;
    private final io.ktor.utils.io.ByteReadChannel delegate;
    private long initial;

    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    public CountedByteReadChannel(io.ktor.utils.io.ByteReadChannel delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.buffer = new kotlinx.io.Buffer();
    }

    public final io.ktor.utils.io.ByteReadChannel getDelegate() {
        return this.delegate;
    }

    public final long getTotalBytesRead() {
        updateConsumed();
        return this.consumed;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public java.lang.Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.buffer.exhausted() && this.delegate.isClosedForRead();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public kotlinx.io.Buffer getReadBuffer() {
        transferFromDelegate();
        return this.buffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object awaitContent(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.CountedByteReadChannel$awaitContent$1 countedByteReadChannel$awaitContent$1;
        java.lang.Object obj;
        int i2;
        if (continuation instanceof io.ktor.utils.io.CountedByteReadChannel$awaitContent$1) {
            countedByteReadChannel$awaitContent$1 = (io.ktor.utils.io.CountedByteReadChannel$awaitContent$1) continuation;
            if ((countedByteReadChannel$awaitContent$1.label & Integer.MIN_VALUE) != 0) {
                countedByteReadChannel$awaitContent$1.label -= Integer.MIN_VALUE;
                obj = countedByteReadChannel$awaitContent$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = countedByteReadChannel$awaitContent$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getReadBuffer().getSizeMut() >= i) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    io.ktor.utils.io.ByteReadChannel byteReadChannel = this.delegate;
                    countedByteReadChannel$awaitContent$1.label = 1;
                    obj = byteReadChannel.awaitContent(i, countedByteReadChannel$awaitContent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    transferFromDelegate();
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
        }
        countedByteReadChannel$awaitContent$1 = new io.ktor.utils.io.CountedByteReadChannel$awaitContent$1(this, continuation);
        obj = countedByteReadChannel$awaitContent$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = countedByteReadChannel$awaitContent$1.label;
        if (i2 != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    private final void transferFromDelegate() {
        updateConsumed();
        this.initial += this.buffer.transferFrom(this.delegate.getReadBuffer());
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(java.lang.Throwable cause) {
        this.delegate.cancel(cause);
        this.buffer.close();
    }

    private final void updateConsumed() {
        this.consumed += this.initial - this.buffer.getSizeMut();
        this.initial = this.buffer.getSizeMut();
    }
}
