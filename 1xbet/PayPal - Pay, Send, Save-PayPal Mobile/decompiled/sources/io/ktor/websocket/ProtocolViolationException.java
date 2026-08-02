package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f"}, d2 = {"Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlinx/coroutines/CopyableThrowable;", "", "violation", "<init>", "(Ljava/lang/String;)V", "createCopy", "()Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/String;", "getViolation", "()Ljava/lang/String;", "getMessage", "message"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProtocolViolationException extends java.lang.Exception implements kotlinx.coroutines.CopyableThrowable<io.ktor.websocket.ProtocolViolationException> {
    private final java.lang.String violation;

    public final java.lang.String getViolation() {
        return this.violation;
    }

    public ProtocolViolationException(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.violation = str;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Received illegal frame: ");
        sb.append(this.violation);
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.CopyableThrowable
    public final io.ktor.websocket.ProtocolViolationException createCopy() {
        io.ktor.websocket.ProtocolViolationException protocolViolationException = new io.ktor.websocket.ProtocolViolationException(this.violation);
        io.ktor.util.internal.ExceptionUtilsJvmKt.initCauseBridge(protocolViolationException, this);
        return protocolViolationException;
    }
}
