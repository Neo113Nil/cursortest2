package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/BufferedSocket;", "Lokio/Socket;", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "sink"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface BufferedSocket extends okio.Socket {
    @Override // okio.Socket
    okio.BufferedSink getSink();

    @Override // okio.Socket
    okio.BufferedSource getSource();
}
