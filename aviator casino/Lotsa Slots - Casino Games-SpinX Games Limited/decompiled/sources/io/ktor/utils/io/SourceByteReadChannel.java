package io.ktor.utils.io;

/* compiled from: SourceByteReadChannel.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/ktor/utils/io/SourceByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/Source;", "source", "<init>", "(Lkotlinx/io/Source;)V", "", "min", "", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)V", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/CloseToken;", "closed", "Lio/ktor/utils/io/CloseToken;", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "getReadBuffer", "()Lkotlinx/io/Source;", "getReadBuffer$annotations", "()V", "readBuffer", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourceByteReadChannel implements io.ktor.utils.io.ByteReadChannel {
    private volatile io.ktor.utils.io.CloseToken closed;
    private final kotlinx.io.Source source;

    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    public SourceByteReadChannel(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public java.lang.Throwable getClosedCause() {
        io.ktor.utils.io.CloseToken closeToken = this.closed;
        if (closeToken != null) {
            return io.ktor.utils.io.CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.source.exhausted();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public kotlinx.io.Source getReadBuffer() {
        java.lang.Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        return this.source.getBufferField();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public java.lang.Object awaitContent(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.lang.Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.source.request(i));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(java.lang.Throwable cause) {
        java.lang.String str;
        if (this.closed != null) {
            return;
        }
        this.source.close();
        if (cause == null || (str = cause.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        this.closed = new io.ktor.utils.io.CloseToken(new java.io.IOException(str, cause));
    }
}
