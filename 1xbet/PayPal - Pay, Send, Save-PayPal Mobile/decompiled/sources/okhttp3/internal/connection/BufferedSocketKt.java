package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Ljava/net/Socket;", "Lokhttp3/internal/connection/BufferedSocket;", "asBufferedSocket", "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;", "Lokio/Socket;", "(Lokio/Socket;)Lokhttp3/internal/connection/BufferedSocket;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BufferedSocketKt {
    public static final okhttp3.internal.connection.BufferedSocket asBufferedSocket(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        return asBufferedSocket(okio.Okio.socket(socket));
    }

    public static final okhttp3.internal.connection.BufferedSocket asBufferedSocket(final okio.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        return new okhttp3.internal.connection.BufferedSocket(socket) { // from class: okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private final okio.Socket getHighResolutionOutputSizeshNQ4ISI;
            private final okio.BufferedSink sink;
            private final okio.BufferedSource source;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = socket;
                this.source = okio.Okio.buffer(socket.getSource());
                this.sink = okio.Okio.buffer(socket.getSink());
            }

            @Override // okio.Socket
            public final okio.BufferedSource getSource() {
                return this.source;
            }

            @Override // okio.Socket
            public final okio.BufferedSink getSink() {
                return this.sink;
            }

            @Override // okio.Socket
            public final void cancel() {
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            }
        };
    }
}
