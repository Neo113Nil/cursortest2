package okhttp3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B;\b\u0010\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u0010B1\b\u0010\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u0011B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lokhttp3/ConnectionPool;", "", "Lokhttp3/internal/connection/RealConnectionPool;", "delegate", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "(IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/ConnectionListener;)V", "(IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/connection/ConnectionListener;)V", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "idleConnectionCount", "()I", "connectionCount", "", "evictAll", "Lokhttp3/internal/connection/RealConnectionPool;", "getDelegate$okhttp", "()Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionPool {
    private final okhttp3.internal.connection.RealConnectionPool delegate;

    public ConnectionPool(okhttp3.internal.connection.RealConnectionPool realConnectionPool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realConnectionPool, "");
        this.delegate = realConnectionPool;
    }

    /* renamed from: getDelegate$okhttp, reason: from getter */
    public final okhttp3.internal.connection.RealConnectionPool getDelegate() {
        return this.delegate;
    }

    public /* synthetic */ ConnectionPool(int i, long j, java.util.concurrent.TimeUnit timeUnit, okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.internal.connection.ConnectionListener connectionListener, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i, (i2 & 2) != 0 ? 5L : j, (i2 & 4) != 0 ? java.util.concurrent.TimeUnit.MINUTES : timeUnit, (i2 & 8) != 0 ? okhttp3.internal.concurrent.TaskRunner.INSTANCE : taskRunner, (i2 & 16) != 0 ? okhttp3.internal.connection.ConnectionListener.INSTANCE.getNONE() : connectionListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, java.util.concurrent.TimeUnit timeUnit, okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.internal.connection.ConnectionListener connectionListener) {
        this(new okhttp3.internal.connection.RealConnectionPool(taskRunner, i, j, timeUnit, connectionListener));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionListener, "");
    }

    public /* synthetic */ ConnectionPool(int i, long j, java.util.concurrent.TimeUnit timeUnit, okhttp3.internal.connection.ConnectionListener connectionListener, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i, (i2 & 2) != 0 ? 5L : j, (i2 & 4) != 0 ? java.util.concurrent.TimeUnit.MINUTES : timeUnit, (i2 & 8) != 0 ? okhttp3.internal.connection.ConnectionListener.INSTANCE.getNONE() : connectionListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, java.util.concurrent.TimeUnit timeUnit, okhttp3.internal.connection.ConnectionListener connectionListener) {
        this(i, j, timeUnit, okhttp3.internal.concurrent.TaskRunner.INSTANCE, connectionListener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionListener, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        this(i, j, timeUnit, okhttp3.internal.concurrent.TaskRunner.INSTANCE, okhttp3.internal.connection.ConnectionListener.INSTANCE.getNONE());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
    }

    public ConnectionPool() {
        this(5, 5L, java.util.concurrent.TimeUnit.MINUTES);
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final okhttp3.internal.connection.ConnectionListener getConnectionListener$okhttp() {
        return this.delegate.getConnectionListener();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }
}
