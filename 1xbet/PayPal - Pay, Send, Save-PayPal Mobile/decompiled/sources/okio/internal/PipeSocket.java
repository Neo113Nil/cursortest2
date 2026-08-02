package okio.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lokio/internal/PipeSocket;", "Lokio/Socket;", "Lokio/Pipe;", "sinkPipe", "sourcePipe", "<init>", "(Lokio/Pipe;Lokio/Pipe;)V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Lokio/Pipe;", "getSinkPipe", "()Lokio/Pipe;", "getSourcePipe", "Lokio/Source;", "getSource", "()Lokio/Source;", "source", "Lokio/Sink;", "getSink", "()Lokio/Sink;", "sink"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PipeSocket implements okio.Socket {
    private final okio.Pipe sinkPipe;
    private final okio.Pipe sourcePipe;

    public PipeSocket(okio.Pipe pipe, okio.Pipe pipe2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipe2, "");
        this.sinkPipe = pipe;
        this.sourcePipe = pipe2;
    }

    public final okio.Pipe getSinkPipe() {
        return this.sinkPipe;
    }

    public final okio.Pipe getSourcePipe() {
        return this.sourcePipe;
    }

    @Override // okio.Socket
    public final okio.Source getSource() {
        return this.sourcePipe.source();
    }

    @Override // okio.Socket
    public final okio.Sink getSink() {
        return this.sinkPipe.sink();
    }

    @Override // okio.Socket
    public final void cancel() {
        this.sourcePipe.cancel();
        this.sinkPipe.cancel();
    }
}
