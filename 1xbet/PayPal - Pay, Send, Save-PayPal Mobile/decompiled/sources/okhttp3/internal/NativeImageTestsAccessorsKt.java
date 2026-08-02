package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\r*\u00020\t2\n\u0010\f\u001a\u00060\nR\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0016\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00028A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u00020\u0010*\u00020\u00188AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lokio/Path;", "file", "", "maxSize", "Lokio/FileSystem;", "fileSystem", "Lokhttp3/Cache;", "buildCache", "(Lokio/Path;JLokio/FileSystem;)Lokhttp3/Cache;", "Lokhttp3/Dispatcher;", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "finishedAccessor", "(Lokhttp3/Dispatcher;Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Lokhttp3/internal/connection/RealConnection;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getIdleAtNsAccessor", "(Lokhttp3/internal/connection/RealConnection;)J", "setIdleAtNsAccessor", "(Lokhttp3/internal/connection/RealConnection;J)V", "idleAtNsAccessor", "Lokhttp3/Response;", "Lokhttp3/internal/connection/Exchange;", "getExchangeAccessor", "(Lokhttp3/Response;)Lokhttp3/internal/connection/Exchange;", "exchangeAccessor", "getConnectionAccessor", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/connection/RealConnection;", "connectionAccessor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NativeImageTestsAccessorsKt {
    public static final okhttp3.Cache buildCache(okio.Path path, long j, okio.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        return new okhttp3.Cache(fileSystem, path, j);
    }

    public static final long getIdleAtNsAccessor(okhttp3.internal.connection.RealConnection realConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realConnection, "");
        return realConnection.getIdleAtNs();
    }

    public static final void setIdleAtNsAccessor(okhttp3.internal.connection.RealConnection realConnection, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realConnection, "");
        realConnection.setIdleAtNs(j);
    }

    public static final okhttp3.internal.connection.Exchange getExchangeAccessor(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return response.getExchange();
    }

    public static final okhttp3.internal.connection.RealConnection getConnectionAccessor(okhttp3.internal.connection.Exchange exchange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchange, "");
        return exchange.getConnection$okhttp();
    }

    public static final void finishedAccessor(okhttp3.Dispatcher dispatcher, okhttp3.internal.connection.RealCall.AsyncCall asyncCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncCall, "");
        dispatcher.finished$okhttp(asyncCall);
    }
}
