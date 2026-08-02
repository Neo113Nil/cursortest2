package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 \u007f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u007fB[\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001cJ'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\"H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001aH\u0000¢\u0006\u0004\b.\u0010\u001cJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010/J\u000f\u00100\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010\u001cJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u00101J\u0015\u00103\u001a\u00020$2\u0006\u00102\u001a\u00020$¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010?J'\u0010C\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010@\u001a\u00020\t2\u0006\u0010B\u001a\u00020AH\u0000¢\u0006\u0004\bC\u0010DJ!\u0010H\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bU\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010VR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010VR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010XR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010YR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ZR\u001a\u0010\u0017\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010\u001b\u001a\u00020$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010`R\"\u0010f\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bf\u0010Z\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010ZR\u0016\u0010l\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010ZR$\u0010n\u001a\u00020\u00142\u0006\u0010m\u001a\u00020\u00148\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bn\u0010Z\u001a\u0004\bo\u0010hR&\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0q0p8\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\"\u0010w\u001a\u00020v8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020$8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010b"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "rawSocket", "javaNetSocket", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "", "pingIntervalMillis", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/Handshake;Lokhttp3/Protocol;Lokhttp3/internal/connection/BufferedSocket;ILokhttp3/internal/connection/ConnectionListener;)V", "", "noNewExchanges", "()V", "noCoalescedConnections$okhttp", "incrementSuccessCount$okhttp", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Lokhttp3/Address;", "address", "", "routes", "", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "useAsSocket$okhttp", "()Lokhttp3/Route;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()Ljava/net/Socket;", "doExtensiveChecks", "isHealthy", "(Z)Z", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "()Lokhttp3/Handshake;", "failedRoute", "Ljava/io/IOException;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "()Lokhttp3/Protocol;", "", "toString", "()Ljava/lang/String;", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner", "()Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Route;", "getRoute", "Ljava/net/Socket;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "Lokhttp3/internal/connection/BufferedSocket;", com.visa.cbp.getEncExpo.warmup, "Lokhttp3/internal/connection/ConnectionListener;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "noCoalescedConnections", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "successCount", "refusedStreamCount", "p0", "allocationLimit", "getAllocationLimit$okhttp", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "", "idleAtNs", "J", "getIdleAtNs", "()J", "setIdleAtNs", "(J)V", "isMultiplexed$okhttp", "isMultiplexed", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealConnection extends okhttp3.internal.http2.Http2Connection.Listener implements okhttp3.Connection, okhttp3.internal.http.ExchangeCodec.Carrier, okhttp3.internal.concurrent.Lockable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.connection.RealConnection.Companion INSTANCE = new okhttp3.internal.connection.RealConnection.Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private int allocationLimit;
    private final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls;
    private final okhttp3.internal.connection.ConnectionListener connectionListener;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private final okhttp3.Handshake handshake;
    private okhttp3.internal.http2.Http2Connection http2Connection;
    private long idleAtNs;
    private final java.net.Socket javaNetSocket;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private final int pingIntervalMillis;
    private final okhttp3.Protocol protocol;
    private final java.net.Socket rawSocket;
    private int refusedStreamCount;
    private final okhttp3.Route route;
    private int routeFailureCount;
    private final okhttp3.internal.connection.BufferedSocket socket;
    private int successCount;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    public RealConnection(okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.internal.connection.RealConnectionPool realConnectionPool, okhttp3.Route route, java.net.Socket socket, java.net.Socket socket2, okhttp3.Handshake handshake, okhttp3.Protocol protocol, okhttp3.internal.connection.BufferedSocket bufferedSocket, int i, okhttp3.internal.connection.ConnectionListener connectionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realConnectionPool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionListener, "");
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.rawSocket = socket;
        this.javaNetSocket = socket2;
        this.handshake = handshake;
        this.protocol = protocol;
        this.socket = bufferedSocket;
        this.pingIntervalMillis = i;
        this.connectionListener = connectionListener;
        this.allocationLimit = 1;
        this.calls = new java.util.ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    public final okhttp3.internal.connection.RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final okhttp3.Route getRoute() {
        return this.route;
    }

    /* renamed from: getConnectionListener$okhttp, reason: from getter */
    public final okhttp3.internal.connection.ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    /* renamed from: getRouteFailureCount$okhttp, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    /* renamed from: getAllocationLimit$okhttp, reason: from getter */
    public final int getAllocationLimit() {
        return this.allocationLimit;
    }

    public final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> getCalls() {
        return this.calls;
    }

    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final void setIdleAtNs(long j) {
        this.idleAtNs = j;
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void noNewExchanges() {
        synchronized (this) {
            this.noNewExchanges = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        this.connectionListener.noNewExchanges(this);
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.noCoalescedConnections = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            this.successCount++;
        }
    }

    public final void start() throws java.io.IOException {
        this.idleAtNs = java.lang.System.nanoTime();
        if (this.protocol == okhttp3.Protocol.HTTP_2 || this.protocol == okhttp3.Protocol.H2_PRIOR_KNOWLEDGE) {
            this.javaNetSocket.setSoTimeout(0);
            java.lang.Object obj = this.connectionListener;
            okhttp3.internal.http2.FlowControlListener.None none = obj instanceof okhttp3.internal.http2.FlowControlListener ? (okhttp3.internal.http2.FlowControlListener) obj : null;
            if (none == null) {
                none = okhttp3.internal.http2.FlowControlListener.None.INSTANCE;
            }
            okhttp3.internal.http2.Http2Connection build = new okhttp3.internal.http2.Http2Connection.Builder(true, this.taskRunner).socket(this.socket, getRoute().address().url().host()).listener(this).pingIntervalMillis(this.pingIntervalMillis).flowControlListener(none).build();
            this.http2Connection = build;
            this.allocationLimit = okhttp3.internal.http2.Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
            okhttp3.internal.http2.Http2Connection.start$default(build, false, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        if (r2.verify(r11, (java.security.cert.X509Certificate) r1) != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEligible$okhttp(okhttp3.Address address, java.util.List<okhttp3.Route> routes) {
        okhttp3.Handshake handshake;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        okhttp3.internal.connection.RealConnection realConnection = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realConnection)) {
            if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !getRoute().address().equalsNonHost$okhttp(address)) {
                return false;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(address.url().host(), route().address().url().host())) {
                return true;
            }
            if (this.http2Connection != null && routes != null) {
                java.util.List<okhttp3.Route> list = routes;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        okhttp3.Route route = (okhttp3.Route) it.next();
                        if (route.proxy().type() == java.net.Proxy.Type.DIRECT && getRoute().proxy().type() == java.net.Proxy.Type.DIRECT && kotlin.jvm.internal.Intrinsics.areEqual(getRoute().socketAddress(), route.socketAddress())) {
                            if (address.hostnameVerifier() != okhttp3.internal.tls.OkHostnameVerifier.INSTANCE) {
                                return false;
                            }
                            okhttp3.HttpUrl url = address.url();
                            if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realConnection)) {
                                okhttp3.HttpUrl url2 = getRoute().address().url();
                                if (url.port() == url2.port()) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(url.host(), url2.host())) {
                                        if (!this.noCoalescedConnections && (handshake = this.handshake) != null) {
                                            java.util.List<java.security.cert.Certificate> peerCertificates = handshake.peerCertificates();
                                            if (!peerCertificates.isEmpty()) {
                                                okhttp3.internal.tls.OkHostnameVerifier okHostnameVerifier = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE;
                                                java.lang.String host = url.host();
                                                java.security.cert.Certificate certificate = peerCertificates.get(0);
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "");
                                            }
                                        }
                                    }
                                    try {
                                        okhttp3.CertificatePinner certificatePinner = address.certificatePinner();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(certificatePinner);
                                        java.lang.String host2 = address.url().host();
                                        okhttp3.Handshake handshake2 = getHandshake();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(handshake2);
                                        certificatePinner.check(host2, handshake2.peerCertificates());
                                        return true;
                                    } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                                    }
                                }
                            } else {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
                                sb.append(java.lang.Thread.currentThread().getName());
                                sb.append(" MUST hold lock on ");
                                sb.append(realConnection);
                                throw new java.lang.AssertionError(sb.toString());
                            }
                        }
                    }
                }
            }
            return false;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Thread ");
        sb2.append(java.lang.Thread.currentThread().getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(realConnection);
        throw new java.lang.AssertionError(sb2.toString());
    }

    public final okhttp3.internal.http.ExchangeCodec newCodec$okhttp(okhttp3.OkHttpClient client, okhttp3.internal.http.RealInterceptorChain chain) throws java.net.SocketException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.internal.connection.BufferedSocket bufferedSocket = this.socket;
        okhttp3.internal.http2.Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new okhttp3.internal.http2.Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        this.javaNetSocket.setSoTimeout(chain.readTimeoutMillis());
        bufferedSocket.getSource().getGetHighSpeedVideoFpsRanges().timeout(chain.getReadTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        bufferedSocket.getSink().getGetHighSpeedVideoSizes().timeout(chain.getWriteTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        return new okhttp3.internal.http1.Http1ExchangeCodec(client, this, bufferedSocket);
    }

    public final void useAsSocket$okhttp() {
        this.javaNetSocket.setSoTimeout(0);
        noNewExchanges();
    }

    @Override // okhttp3.Connection
    public final okhttp3.Route route() {
        return getRoute();
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public final void mo24418cancel() {
        okhttp3.internal._UtilJvmKt.closeQuietly(this.rawSocket);
    }

    @Override // okhttp3.Connection
    /* renamed from: socket, reason: from getter */
    public final java.net.Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    public final boolean isHealthy(boolean doExtensiveChecks) {
        long j;
        okhttp3.internal.connection.RealConnection realConnection = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(realConnection)) {
            long nanoTime = java.lang.System.nanoTime();
            if (this.rawSocket.isClosed() || this.javaNetSocket.isClosed() || this.javaNetSocket.isInputShutdown() || this.javaNetSocket.isOutputShutdown()) {
                return false;
            }
            okhttp3.internal.http2.Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(nanoTime);
            }
            synchronized (realConnection) {
                j = this.idleAtNs;
            }
            if (nanoTime - j < IDLE_CONNECTION_HEALTHY_NS || !doExtensiveChecks) {
                return true;
            }
            return okhttp3.internal._UtilJvmKt.isHealthy(this.javaNetSocket, this.socket.getSource());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(realConnection);
        throw new java.lang.AssertionError(sb.toString());
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onStream(okhttp3.internal.http2.Http2Stream stream) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "");
        stream.close(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onSettings(okhttp3.internal.http2.Http2Connection connection, okhttp3.internal.http2.Settings settings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        synchronized (this) {
            this.allocationLimit = settings.getMaxConcurrentStreams();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // okhttp3.Connection
    /* renamed from: handshake, reason: from getter */
    public final okhttp3.Handshake getHandshake() {
        return this.handshake;
    }

    public final void connectFailed$okhttp(okhttp3.OkHttpClient client, okhttp3.Route failedRoute, java.io.IOException failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedRoute, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        if (failedRoute.proxy().type() != java.net.Proxy.Type.DIRECT) {
            okhttp3.Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void trackFailure(okhttp3.internal.connection.RealCall call, java.io.IOException e) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        synchronized (this) {
            if (e instanceof okhttp3.internal.http2.StreamResetException) {
                if (((okhttp3.internal.http2.StreamResetException) e).errorCode == okhttp3.internal.http2.ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        z = !this.noNewExchanges;
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    z = false;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    if (((okhttp3.internal.http2.StreamResetException) e).errorCode != okhttp3.internal.http2.ErrorCode.CANCEL || !call.getCanceled()) {
                        z = !this.noNewExchanges;
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                        kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                    }
                    z = false;
                    kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                }
            } else {
                if (isMultiplexed$okhttp()) {
                    if (e instanceof okhttp3.internal.http2.ConnectionShutdownException) {
                    }
                    z = false;
                    kotlin.Unit unit2222 = kotlin.Unit.INSTANCE;
                }
                boolean z2 = this.noNewExchanges;
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (e != null) {
                        connectFailed$okhttp(call.getClient(), getRoute(), e);
                    }
                    this.routeFailureCount++;
                }
                z = !z2;
                kotlin.Unit unit22222 = kotlin.Unit.INSTANCE;
            }
        }
        if (z) {
            this.connectionListener.noNewExchanges(this);
        }
    }

    @Override // okhttp3.Connection
    /* renamed from: protocol, reason: from getter */
    public final okhttp3.Protocol getProtocol() {
        return this.protocol;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connection{");
        sb.append(getRoute().address().url().host());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(getRoute().address().url().port());
        sb.append(", proxy=");
        sb.append(getRoute().proxy());
        sb.append(" hostAddress=");
        sb.append(getRoute().socketAddress());
        sb.append(" cipherSuite=");
        okhttp3.Handshake handshake = this.handshake;
        if (handshake == null || (obj = handshake.cipherSuite()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lokhttp3/internal/connection/RealConnection;", "newTestConnection", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;J)Lokhttp3/internal/connection/RealConnection;", "IDLE_CONNECTION_HEALTHY_NS", "J"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.connection.RealConnection newTestConnection(okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.internal.connection.RealConnectionPool connectionPool, okhttp3.Route route, java.net.Socket socket, long idleAtNs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
            okhttp3.internal.connection.RealConnection realConnection = new okhttp3.internal.connection.RealConnection(taskRunner, connectionPool, route, new java.net.Socket(), socket, null, okhttp3.Protocol.HTTP_2, new okhttp3.internal.connection.BufferedSocket() { // from class: okhttp3.internal.connection.RealConnection$Companion$newTestConnection$bufferedSocket$1
                private final okio.Buffer sink = new okio.Buffer();
                private final okio.Buffer source = new okio.Buffer();

                @Override // okio.Socket
                public final void cancel() {
                }

                @Override // okio.Socket
                public final okio.Buffer getSink() {
                    return this.sink;
                }

                @Override // okio.Socket
                public final okio.Buffer getSource() {
                    return this.source;
                }
            }, 0, okhttp3.internal.connection.ConnectionListener.INSTANCE.getNONE());
            realConnection.setIdleAtNs(idleAtNs);
            return realConnection;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
