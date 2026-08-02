package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lio/ktor/websocket/FrameTooBigException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlinx/coroutines/CopyableThrowable;", "", "frameSize", "<init>", "(J)V", "createCopy", "()Lio/ktor/websocket/FrameTooBigException;", "J", "getFrameSize", "()J", "", "getMessage", "()Ljava/lang/String;", "message"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FrameTooBigException extends java.lang.Exception implements kotlinx.coroutines.CopyableThrowable<io.ktor.websocket.FrameTooBigException> {
    private final long frameSize;

    public final long getFrameSize() {
        return this.frameSize;
    }

    public FrameTooBigException(long j) {
        this.frameSize = j;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Frame is too big: ");
        sb.append(this.frameSize);
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.CopyableThrowable
    public final io.ktor.websocket.FrameTooBigException createCopy() {
        io.ktor.websocket.FrameTooBigException frameTooBigException = new io.ktor.websocket.FrameTooBigException(this.frameSize);
        io.ktor.util.internal.ExceptionUtilsJvmKt.initCauseBridge(frameTooBigException, this);
        return frameTooBigException;
    }
}
