package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0015"}, d2 = {"Lokhttp3/internal/connection/ConnectionListener;", "", "<init>", "()V", "Lokhttp3/Route;", "route", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "connectStart", "(Lokhttp3/Route;Lokhttp3/Call;)V", "Ljava/io/IOException;", "Lokio/getHighSpeedVideoSizes;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "connectFailed", "(Lokhttp3/Route;Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectEnd", "(Lokhttp3/Connection;Lokhttp3/Route;Lokhttp3/Call;)V", "connectionClosed", "(Lokhttp3/Connection;)V", "connectionAcquired", "(Lokhttp3/Connection;Lokhttp3/Call;)V", "connectionReleased", "noNewExchanges", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ConnectionListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.connection.ConnectionListener.Companion INSTANCE = new okhttp3.internal.connection.ConnectionListener.Companion(null);
    private static final okhttp3.internal.connection.ConnectionListener NONE = new okhttp3.internal.connection.ConnectionListener() { // from class: okhttp3.internal.connection.ConnectionListener$Companion$NONE$1
    };

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/connection/ConnectionListener$Companion;", "", "<init>", "()V", "Lokhttp3/internal/connection/ConnectionListener;", "NONE", "Lokhttp3/internal/connection/ConnectionListener;", "getNONE", "()Lokhttp3/internal/connection/ConnectionListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.connection.ConnectionListener getNONE() {
            return okhttp3.internal.connection.ConnectionListener.NONE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void noNewExchanges(okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
    }

    public void connectionReleased(okhttp3.Connection connection, okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void connectionClosed(okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
    }

    public void connectionAcquired(okhttp3.Connection connection, okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void connectStart(okhttp3.Route route, okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void connectFailed(okhttp3.Route route, okhttp3.Call call, java.io.IOException failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
    }

    public void connectEnd(okhttp3.Connection connection, okhttp3.Route route, okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }
}
