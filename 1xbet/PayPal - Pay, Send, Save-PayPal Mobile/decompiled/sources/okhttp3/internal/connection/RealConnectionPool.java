package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ?2\u00020\u0001:\u0001?B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJA\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001f¢\u0006\u0004\b-\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/connection/ConnectionListener;)V", "idleConnectionCount", "()I", "connectionCount", "", "doExtensiveHealthChecks", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "Lokhttp3/Route;", "routes", "requireMultiplexed", "Lokhttp3/internal/connection/RealConnection;", "callAcquirePooledConnection$okhttp", "(ZLokhttp3/Address;Lokhttp3/internal/connection/RealCall;Ljava/util/List;Z)Lokhttp3/internal/connection/RealConnection;", "connection", "", "put", "(Lokhttp3/internal/connection/RealConnection;)V", "connectionBecameIdle", "(Lokhttp3/internal/connection/RealConnection;)Z", "evictAll", "()V", "now", "closeConnections", "(J)J", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Lokhttp3/internal/connection/RealConnection;J)I", "scheduleCloser", com.visa.cbp.getEncExpo.warmup, "Lokhttp3/internal/connection/ConnectionListener;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "keepAliveDurationNs", "J", "getKeepAliveDurationNs$okhttp", "()J", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealConnectionPool {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.connection.RealConnectionPool.Companion INSTANCE = new okhttp3.internal.connection.RealConnectionPool.Companion(null);
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 cleanupTask;
    private final okhttp3.internal.connection.ConnectionListener connectionListener;
    private final java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX WARN: Type inference failed for: r2v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(okhttp3.internal.concurrent.TaskRunner taskRunner, int i, long j, java.util.concurrent.TimeUnit timeUnit, okhttp3.internal.connection.ConnectionListener connectionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionListener, "");
        this.maxIdleConnections = i;
        this.connectionListener = connectionListener;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = taskRunner.newQueue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(okhttp3.internal._UtilJvmKt.okHttpName);
        sb.append(" ConnectionPool connection closer");
        final java.lang.String obj = sb.toString();
        this.cleanupTask = new okhttp3.internal.concurrent.Task(obj) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                return okhttp3.internal.connection.RealConnectionPool.this.closeConnections(java.lang.System.nanoTime());
            }
        };
        this.connections = new java.util.concurrent.ConcurrentLinkedQueue<>();
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("keepAliveDuration <= 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
    }

    /* renamed from: getConnectionListener$okhttp, reason: from getter */
    public final okhttp3.internal.connection.ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    /* renamed from: getKeepAliveDurationNs$okhttp, reason: from getter */
    public final long getKeepAliveDurationNs() {
        return this.keepAliveDurationNs;
    }

    public final int idleConnectionCount() {
        boolean isEmpty;
        java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> concurrentLinkedQueue = this.connections;
        int i = 0;
        if ((concurrentLinkedQueue instanceof java.util.Collection) && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (okhttp3.internal.connection.RealConnection realConnection : concurrentLinkedQueue) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(realConnection);
            synchronized (realConnection) {
                isEmpty = realConnection.getCalls().isEmpty();
            }
            if (isEmpty && (i = i + 1) < 0) {
                kotlin.collections.CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final okhttp3.internal.connection.RealConnection callAcquirePooledConnection$okhttp(boolean doExtensiveHealthChecks, okhttp3.Address address, okhttp3.internal.connection.RealCall call, java.util.List<okhttp3.Route> routes, boolean requireMultiplexed) {
        boolean z;
        boolean noNewExchanges;
        java.net.Socket releaseConnectionNoEvents$okhttp;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        java.util.Iterator<okhttp3.internal.connection.RealConnection> it = this.connections.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            okhttp3.internal.connection.RealConnection next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
            okhttp3.internal.connection.RealConnection realConnection = next;
            synchronized (realConnection) {
                if (requireMultiplexed) {
                    if (!next.isMultiplexed$okhttp()) {
                        z = false;
                    }
                }
                if (next.isEligible$okhttp(address, routes)) {
                    call.acquireConnectionNoEvents(next);
                    z = true;
                }
                z = false;
            }
            if (z) {
                if (next.isHealthy(doExtensiveHealthChecks)) {
                    return next;
                }
                synchronized (realConnection) {
                    noNewExchanges = next.getNoNewExchanges();
                    next.setNoNewExchanges(true);
                    releaseConnectionNoEvents$okhttp = call.releaseConnectionNoEvents$okhttp();
                }
                if (releaseConnectionNoEvents$okhttp != null) {
                    okhttp3.internal._UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                    this.connectionListener.connectionClosed(next);
                } else if (!noNewExchanges) {
                    this.connectionListener.noNewExchanges(next);
                }
            }
        }
        return null;
    }

    public final void put(okhttp3.internal.connection.RealConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        okhttp3.internal.connection.RealConnection realConnection = connection;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realConnection)) {
            this.connections.add(connection);
            scheduleCloser();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST hold lock on ");
            sb.append(realConnection);
            throw new java.lang.AssertionError(sb.toString());
        }
    }

    public final boolean connectionBecameIdle(okhttp3.internal.connection.RealConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        okhttp3.internal.connection.RealConnection realConnection = connection;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realConnection)) {
            if (connection.getNoNewExchanges() || this.maxIdleConnections == 0) {
                connection.setNoNewExchanges(true);
                this.connections.remove(connection);
                if (this.connections.isEmpty()) {
                    this.cleanupQueue.cancelAll();
                }
                return true;
            }
            scheduleCloser();
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnection);
        throw new java.lang.AssertionError(sb.toString());
    }

    public final void evictAll() {
        java.net.Socket socket;
        java.util.Iterator<okhttp3.internal.connection.RealConnection> it = this.connections.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            okhttp3.internal.connection.RealConnection next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.getJavaNetSocket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                okhttp3.internal._UtilJvmKt.closeQuietly(socket);
                this.connectionListener.connectionClosed(next);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final long closeConnections(long now) {
        long j = (now - this.keepAliveDurationNs) + 1;
        java.util.Iterator<okhttp3.internal.connection.RealConnection> it = this.connections.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        long j2 = Long.MAX_VALUE;
        int i = 0;
        okhttp3.internal.connection.RealConnection realConnection = null;
        int i2 = 0;
        okhttp3.internal.connection.RealConnection realConnection2 = null;
        okhttp3.internal.connection.RealConnection realConnection3 = null;
        while (it.hasNext()) {
            okhttp3.internal.connection.RealConnection next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
            synchronized (next) {
                if (getHighSpeedVideoFpsRanges(next, now) > 0) {
                    i2++;
                } else {
                    long idleAtNs = next.getIdleAtNs();
                    if (idleAtNs < j) {
                        realConnection2 = next;
                        j = idleAtNs;
                    }
                    i++;
                    if (idleAtNs < j2) {
                        realConnection3 = next;
                        j2 = idleAtNs;
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
        if (realConnection2 != null) {
            realConnection = realConnection2;
        } else if (i > this.maxIdleConnections) {
            j = j2;
            realConnection = realConnection3;
        } else {
            j = -1;
        }
        if (realConnection == null) {
            if (realConnection3 != null) {
                return (j2 + this.keepAliveDurationNs) - now;
            }
            if (i2 > 0) {
                return this.keepAliveDurationNs;
            }
            return -1L;
        }
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() != j) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            okhttp3.internal._UtilJvmKt.closeQuietly(realConnection.getJavaNetSocket());
            this.connectionListener.connectionClosed(realConnection);
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    private final int getHighSpeedVideoFpsRanges(okhttp3.internal.connection.RealConnection p0, long p1) {
        okhttp3.internal.connection.RealConnection realConnection = p0;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realConnection)) {
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls = p0.getCalls();
            int i = 0;
            while (i < calls.size()) {
                java.lang.ref.Reference<okhttp3.internal.connection.RealCall> reference = calls.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(reference, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("A connection to ");
                    sb.append(p0.route().address().url());
                    sb.append(" was leaked. Did you forget to close a response body?");
                    okhttp3.internal.platform.Platform.INSTANCE.get().logCloseableLeak(sb.toString(), ((okhttp3.internal.connection.RealCall.CallReference) reference).getCallStackTrace());
                    calls.remove(i);
                    if (calls.isEmpty()) {
                        p0.setIdleAtNs(p1 - this.keepAliveDurationNs);
                        return 0;
                    }
                }
            }
            return calls.size();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Thread ");
        sb2.append(java.lang.Thread.currentThread().getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(realConnection);
        throw new java.lang.AssertionError(sb2.toString());
    }

    public final void scheduleCloser() {
        okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "<init>", "()V", "Lokhttp3/ConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "get", "(Lokhttp3/ConnectionPool;)Lokhttp3/internal/connection/RealConnectionPool;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.connection.RealConnectionPool get(okhttp3.ConnectionPool connectionPool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "");
            return connectionPool.getDelegate();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
