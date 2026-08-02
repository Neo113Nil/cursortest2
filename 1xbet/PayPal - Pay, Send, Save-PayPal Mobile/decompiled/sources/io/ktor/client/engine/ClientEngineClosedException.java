package io.ktor.client.engine;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/client/engine/ClientEngineClosedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ClientEngineClosedException extends java.lang.IllegalStateException {
    private final java.lang.Throwable cause;

    public /* synthetic */ ClientEngineClosedException(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    public ClientEngineClosedException(java.lang.Throwable th) {
        super("Client already closed");
        this.cause = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClientEngineClosedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
