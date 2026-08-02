package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nB\u0093\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0000¢\u0006\u0004\b%\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b#\u0010*J%\u0010-\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00152\u0006\u0010,\u001a\u00020&H\u0000¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u0004\u0018\u00010\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00152\u0006\u0010,\u001a\u00020&H\u0000¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J!\u00105\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u0010$J\u000f\u00108\u001a\u00020\"H\u0016¢\u0006\u0004\b8\u0010$J\u000f\u00109\u001a\u00020\u0001H\u0016¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\"¢\u0006\u0004\b;\u0010$R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010>R\u0014\u0010B\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010AR\u0014\u0010H\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010AR\u0014\u0010I\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010AR\u0014\u0010L\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010@\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010MR\u0014\u0010P\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u0010SR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010G\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010AR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010\u001a\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\bZ\u0010[R\u001a\u0010\u001b\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\b\\\u0010]R\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010KR\u0018\u0010E\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010_R$\u0010`\u001a\u0004\u0018\u00010^8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b`\u0010_\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0018\u0010J\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010fR\u0018\u0010W\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010hR\u0016\u0010k\u001a\u00020i8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bY\u0010jR\u0018\u0010C\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010lR\u0014\u0010m\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010]"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealRoutePlanner;", "routePlanner", "Lokhttp3/Route;", "route", "", "routes", "attempt", "Lokhttp3/Request;", "tunnelRequest", "connectionSpecIndex", "isTlsFallback", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZ)V", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "connectTunnel$okhttp", "Ljavax/net/ssl/SSLSocket;", "p0", "Lokhttp3/ConnectionSpec;", "p1", "(Ljavax/net/ssl/SSLSocket;Lokhttp3/ConnectionSpec;)V", "connectionSpecs", "sslSocket", "planWithCurrentOrInitialConnectionSpec$okhttp", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;", "nextConnectionSpec$okhttp", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "()Lokhttp3/internal/connection/RealConnection;", "Ljava/io/IOException;", "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "noNewExchanges", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "retry", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "closeQuietly", "toString", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "getHighSpeedVideoFpsRanges", "getOutputFormats", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "isOutputSupportedFor", "Camera2StreamConfigurationMap", "getOutputSizes", "getHighSpeedVideoSizes", "getOutputMinFrameDurationlomOqCM", "getInputFormats", "getInputSizeshNQ4ISI", "getOutputStallDuration", "Z", "getOutputMinFrameDuration", "Lokhttp3/internal/connection/RealCall;", "getOutputStallDurationlomOqCM", "Lokhttp3/internal/connection/RealRoutePlanner;", "getHighSpeedVideoSizesFor", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "Ljava/util/List;", "getRoutes$okhttp", "()Ljava/util/List;", "isOutputSupportedForhNQ4ISI", "Lokhttp3/Request;", "getOutputSizeshNQ4ISI", "getConnectionSpecIndex$okhttp", "()I", "isTlsFallback$okhttp", "()Z", "Ljava/net/Socket;", "Ljava/net/Socket;", "javaNetSocket", "getJavaNetSocket$okhttp", "()Ljava/net/Socket;", "setJavaNetSocket$okhttp", "(Ljava/net/Socket;)V", "Lokhttp3/Handshake;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "Lokhttp3/Protocol;", "Lokhttp3/internal/connection/BufferedSocket;", "Lokhttp3/internal/connection/BufferedSocket;", "unwrapAs", "Lokhttp3/internal/connection/RealConnection;", "isReady", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConnectPlan implements okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RealCall getOutputFormats;
    private final int connectionSpecIndex;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RealConnectionPool getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile boolean getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private okhttp3.internal.connection.RealConnection isOutputSupportedFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.net.Socket getOutputSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private okhttp3.Handshake getOutputStallDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private okhttp3.Protocol isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final int getInputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private okhttp3.internal.connection.BufferedSocket unwrapAs;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final boolean getOutputMinFrameDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RealRoutePlanner getHighSpeedVideoSizesFor;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final okhttp3.Request getOutputSizeshNQ4ISI;
    private final boolean isTlsFallback;
    private java.net.Socket javaNetSocket;
    private final okhttp3.Route route;
    private final java.util.List<okhttp3.Route> routes;

    /* renamed from: toString, reason: from kotlin metadata */
    private final okhttp3.internal.concurrent.TaskRunner getHighResolutionOutputSizeshNQ4ISI;

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void noNewExchanges() {
    }

    public ConnectPlan(okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.internal.connection.RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, okhttp3.internal.connection.RealCall realCall, okhttp3.internal.connection.RealRoutePlanner realRoutePlanner, okhttp3.Route route, java.util.List<okhttp3.Route> list, int i6, okhttp3.Request request, int i7, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realConnectionPool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRoutePlanner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        this.getHighResolutionOutputSizeshNQ4ISI = taskRunner;
        this.getHighSpeedVideoFpsRanges = realConnectionPool;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoSizes = i3;
        this.getInputFormats = i4;
        this.getInputSizeshNQ4ISI = i5;
        this.getOutputMinFrameDuration = z;
        this.getOutputFormats = realCall;
        this.getHighSpeedVideoSizesFor = realRoutePlanner;
        this.route = route;
        this.routes = list;
        this.getOutputMinFrameDurationlomOqCM = i6;
        this.getOutputSizeshNQ4ISI = request;
        this.connectionSpecIndex = i7;
        this.isTlsFallback = z2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final okhttp3.Route getRoute() {
        return this.route;
    }

    public final java.util.List<okhttp3.Route> getRoutes$okhttp() {
        return this.routes;
    }

    /* renamed from: getConnectionSpecIndex$okhttp, reason: from getter */
    public final int getConnectionSpecIndex() {
        return this.connectionSpecIndex;
    }

    /* renamed from: isTlsFallback$okhttp, reason: from getter */
    public final boolean getIsTlsFallback() {
        return this.isTlsFallback;
    }

    /* renamed from: getJavaNetSocket$okhttp, reason: from getter */
    public final java.net.Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    public final void setJavaNetSocket$okhttp(java.net.Socket socket) {
        this.javaNetSocket = socket;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: isReady */
    public final boolean getIsReady() {
        return this.isOutputSupportedForhNQ4ISI != null;
    }

    private static /* synthetic */ okhttp3.internal.connection.ConnectPlan getHighSpeedVideoFpsRangesFor(okhttp3.internal.connection.ConnectPlan connectPlan, int i, okhttp3.Request request, int i2, boolean z, int i3) {
        return new okhttp3.internal.connection.ConnectPlan(connectPlan.getHighResolutionOutputSizeshNQ4ISI, connectPlan.getHighSpeedVideoFpsRanges, connectPlan.getHighSpeedVideoFpsRangesFor, connectPlan.Camera2StreamConfigurationMap, connectPlan.getHighSpeedVideoSizes, connectPlan.getInputFormats, connectPlan.getInputSizeshNQ4ISI, connectPlan.getOutputMinFrameDuration, connectPlan.getOutputFormats, connectPlan.getHighSpeedVideoSizesFor, connectPlan.getRoute(), connectPlan.routes, (i3 & 1) != 0 ? connectPlan.getOutputMinFrameDurationlomOqCM : i, (i3 & 2) != 0 ? connectPlan.getOutputSizeshNQ4ISI : request, (i3 & 4) != 0 ? connectPlan.connectionSpecIndex : i2, (i3 & 8) != 0 ? connectPlan.isTlsFallback : z);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult getResult() {
        java.net.Socket socket;
        java.net.Socket socket2;
        if (this.getOutputSizes != null) {
            throw new java.lang.IllegalStateException("TCP already connected".toString());
        }
        this.getOutputFormats.getPlansToCancel$okhttp().add(this);
        boolean z = false;
        try {
            try {
                this.getOutputFormats.getEventListener().connectStart(this.getOutputFormats, getRoute().socketAddress(), getRoute().proxy());
                this.getHighSpeedVideoFpsRanges.getConnectionListener().connectStart(getRoute(), this.getOutputFormats);
                getHighResolutionOutputSizeshNQ4ISI();
                z = true;
                okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult = new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, null, null, 6, null);
                this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
                return connectResult;
            } catch (java.io.IOException e) {
                if (getRoute().address().proxy() == null && getRoute().proxy().type() != java.net.Proxy.Type.DIRECT) {
                    getRoute().address().proxySelector().connectFailed(getRoute().address().url().uri(), getRoute().proxy().address(), e);
                }
                this.getOutputFormats.getEventListener().connectFailed(this.getOutputFormats, getRoute().socketAddress(), getRoute().proxy(), null, e);
                this.getHighSpeedVideoFpsRanges.getConnectionListener().connectFailed(getRoute(), this.getOutputFormats, e);
                okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult2 = new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, null, e, 2, null);
                this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
                if (!z && (socket = this.getOutputSizes) != null) {
                    okhttp3.internal._UtilJvmKt.closeQuietly(socket);
                }
                return connectResult2;
            }
        } catch (java.lang.Throwable th) {
            this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
            if (!z && (socket2 = this.getOutputSizes) != null) {
                okhttp3.internal._UtilJvmKt.closeQuietly(socket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01fb  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult mo24422connectTlsEtc() {
        okhttp3.internal.connection.ConnectPlan connectPlan;
        boolean z;
        okhttp3.internal.connection.BufferedSocket bufferedSocket;
        java.net.Socket socket = this.getOutputSizes;
        if (socket == null) {
            throw new java.lang.IllegalArgumentException("TCP not connected".toString());
        }
        if (getIsReady()) {
            throw new java.lang.IllegalStateException("already connected".toString());
        }
        java.util.List<okhttp3.ConnectionSpec> connectionSpecs = getRoute().address().connectionSpecs();
        this.getOutputFormats.getPlansToCancel$okhttp().add(this);
        okhttp3.internal.connection.ConnectPlan connectPlan2 = null;
        boolean z2 = false;
        try {
            try {
                if (this.getOutputSizeshNQ4ISI != null) {
                    okhttp3.internal.connection.RoutePlanner.ConnectResult connectTunnel$okhttp = connectTunnel$okhttp();
                    if (connectTunnel$okhttp.getNextPlan() != null || connectTunnel$okhttp.getThrowable() != null) {
                        this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
                        java.net.Socket socket2 = this.javaNetSocket;
                        if (socket2 != null) {
                            okhttp3.internal._UtilJvmKt.closeQuietly(socket2);
                        }
                        okhttp3.internal._UtilJvmKt.closeQuietly(socket);
                        return connectTunnel$okhttp;
                    }
                }
                if (getRoute().address().sslSocketFactory() != null) {
                    okhttp3.internal.connection.BufferedSocket bufferedSocket2 = this.unwrapAs;
                    if (bufferedSocket2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        bufferedSocket2 = null;
                    }
                    if (bufferedSocket2.getSource().getBuffer().exhausted()) {
                        okhttp3.internal.connection.BufferedSocket bufferedSocket3 = this.unwrapAs;
                        if (bufferedSocket3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            bufferedSocket3 = null;
                        }
                        if (bufferedSocket3.getSink().getBuffer().exhausted()) {
                            this.getOutputFormats.getEventListener().secureConnectStart(this.getOutputFormats);
                            java.net.Socket createSocket = getRoute().address().sslSocketFactory().createSocket(socket, getRoute().address().url().host(), getRoute().address().url().port(), true);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(createSocket, "");
                            javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) createSocket;
                            okhttp3.internal.connection.ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(connectionSpecs, sSLSocket);
                            okhttp3.ConnectionSpec connectionSpec = connectionSpecs.get(planWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            okhttp3.internal.connection.ConnectPlan nextConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(connectionSpecs, sSLSocket);
                            try {
                                connectionSpec.apply$okhttp(sSLSocket, planWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                                getHighResolutionOutputSizeshNQ4ISI(sSLSocket, connectionSpec);
                                this.getOutputFormats.getEventListener().secureConnectEnd(this.getOutputFormats, this.getOutputStallDuration);
                                connectPlan = nextConnectionSpec$okhttp;
                            } catch (java.io.IOException e) {
                                e = e;
                                connectPlan = nextConnectionSpec$okhttp;
                                this.getOutputFormats.getEventListener().connectFailed(this.getOutputFormats, getRoute().socketAddress(), getRoute().proxy(), null, e);
                                this.getHighSpeedVideoFpsRanges.getConnectionListener().connectFailed(getRoute(), this.getOutputFormats, e);
                                if (this.getOutputMinFrameDuration && okhttp3.internal.connection.RetryTlsHandshakeKt.retryTlsHandshake(e)) {
                                    connectPlan2 = connectPlan;
                                }
                                okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult = new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, connectPlan2, e);
                                this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
                                if (!z2) {
                                    java.net.Socket socket3 = this.javaNetSocket;
                                    if (socket3 != null) {
                                        okhttp3.internal._UtilJvmKt.closeQuietly(socket3);
                                    }
                                    okhttp3.internal._UtilJvmKt.closeQuietly(socket);
                                }
                                return connectResult;
                            }
                        }
                    }
                    throw new java.io.IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket;
                this.isOutputSupportedForhNQ4ISI = getRoute().address().protocols().contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE) ? okhttp3.Protocol.H2_PRIOR_KNOWLEDGE : okhttp3.Protocol.HTTP_1_1;
                connectPlan = null;
                try {
                    okhttp3.internal.concurrent.TaskRunner taskRunner = this.getHighResolutionOutputSizeshNQ4ISI;
                    okhttp3.internal.connection.RealConnectionPool realConnectionPool = this.getHighSpeedVideoFpsRanges;
                    okhttp3.Route route = getRoute();
                    java.net.Socket socket4 = this.javaNetSocket;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(socket4);
                    okhttp3.Handshake handshake = this.getOutputStallDuration;
                    okhttp3.Protocol protocol = this.isOutputSupportedForhNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(protocol);
                    okhttp3.internal.connection.BufferedSocket bufferedSocket4 = this.unwrapAs;
                    if (bufferedSocket4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        bufferedSocket = null;
                    } else {
                        bufferedSocket = bufferedSocket4;
                    }
                    okhttp3.internal.connection.RealConnection realConnection = new okhttp3.internal.connection.RealConnection(taskRunner, realConnectionPool, route, socket, socket4, handshake, protocol, bufferedSocket, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges.getConnectionListener());
                    this.isOutputSupportedFor = realConnection;
                    realConnection.start();
                    this.getOutputFormats.getEventListener().connectEnd(this.getOutputFormats, getRoute().socketAddress(), getRoute().proxy(), this.isOutputSupportedForhNQ4ISI);
                } catch (java.io.IOException e2) {
                    e = e2;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                z = false;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            connectPlan = null;
        }
        try {
            okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult2 = new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, null, null, 6, null);
            this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
            return connectResult2;
        } catch (java.io.IOException e4) {
            e = e4;
            z2 = true;
            this.getOutputFormats.getEventListener().connectFailed(this.getOutputFormats, getRoute().socketAddress(), getRoute().proxy(), null, e);
            this.getHighSpeedVideoFpsRanges.getConnectionListener().connectFailed(getRoute(), this.getOutputFormats, e);
            if (this.getOutputMinFrameDuration) {
                connectPlan2 = connectPlan;
            }
            okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult3 = new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, connectPlan2, e);
            this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
            if (!z2) {
            }
            return connectResult3;
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = true;
            this.getOutputFormats.getPlansToCancel$okhttp().remove(this);
            if (!z) {
                java.net.Socket socket5 = this.javaNetSocket;
                if (socket5 != null) {
                    okhttp3.internal._UtilJvmKt.closeQuietly(socket5);
                }
                okhttp3.internal._UtilJvmKt.closeQuietly(socket);
            }
            throw th;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        java.net.Socket createSocket;
        java.net.Proxy.Type type = getRoute().proxy().type();
        int i = type == null ? -1 : okhttp3.internal.connection.ConnectPlan.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = getRoute().address().socketFactory().createSocket();
            kotlin.jvm.internal.Intrinsics.checkNotNull(createSocket);
        } else {
            createSocket = new java.net.Socket(getRoute().proxy());
        }
        this.getOutputSizes = createSocket;
        if (this.getOutputStallDurationlomOqCM) {
            throw new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
        }
        createSocket.setSoTimeout(this.getInputFormats);
        try {
            okhttp3.internal.platform.Platform.INSTANCE.get().connectSocket(createSocket, getRoute().socketAddress(), this.getHighSpeedVideoSizes);
            try {
                this.unwrapAs = okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket(createSocket);
            } catch (java.lang.NullPointerException e) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new java.io.IOException(e);
                }
            }
        } catch (java.net.ConnectException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to connect to ");
            sb.append(getRoute().socketAddress());
            java.net.ConnectException connectException = new java.net.ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(javax.net.ssl.SSLSocket p0, okhttp3.ConnectionSpec p1) throws java.io.IOException {
        final okhttp3.Address address = getRoute().address();
        try {
            if (p1.supportsTlsExtensions()) {
                okhttp3.internal.platform.Platform.INSTANCE.get().configureTlsExtensions(p0, address.url().host(), address.protocols());
            }
            p0.startHandshake();
            javax.net.ssl.SSLSession session = p0.getSession();
            okhttp3.Handshake.Companion companion = okhttp3.Handshake.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(session);
            final okhttp3.Handshake handshake = companion.get(session);
            javax.net.ssl.HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(hostnameVerifier);
            if (hostnameVerifier.verify(address.url().host(), session)) {
                final okhttp3.CertificatePinner certificatePinner = address.certificatePinner();
                kotlin.jvm.internal.Intrinsics.checkNotNull(certificatePinner);
                final okhttp3.Handshake handshake2 = new okhttp3.Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.connection.ConnectPlan$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return okhttp3.internal.connection.ConnectPlan.$r8$lambda$806SqObLv8d6l4DhU5N2BQVd1eM(okhttp3.CertificatePinner.this, handshake, address);
                    }
                });
                this.getOutputStallDuration = handshake2;
                certificatePinner.check$okhttp(address.url().host(), new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.connection.ConnectPlan$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return okhttp3.internal.connection.ConnectPlan.$r8$lambda$ZCg05bGI6M6ecME2HgWklhiULrk(okhttp3.Handshake.this);
                    }
                });
                java.lang.String selectedProtocol = p1.supportsTlsExtensions() ? okhttp3.internal.platform.Platform.INSTANCE.get().getSelectedProtocol(p0) : null;
                this.javaNetSocket = p0;
                this.unwrapAs = okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket(p0);
                this.isOutputSupportedForhNQ4ISI = selectedProtocol != null ? okhttp3.Protocol.INSTANCE.get(selectedProtocol) : okhttp3.Protocol.HTTP_1_1;
                okhttp3.internal.platform.Platform.INSTANCE.get().afterHandshake(p0);
                return;
            }
            java.util.List<java.security.cert.Certificate> peerCertificates = handshake.peerCertificates();
            if (peerCertificates.isEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Hostname ");
                sb.append(address.url().host());
                sb.append(" not verified (no certificates)");
                throw new javax.net.ssl.SSLPeerUnverifiedException(sb.toString());
            }
            java.security.cert.Certificate certificate = peerCertificates.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "");
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\n            |Hostname ");
            sb2.append(address.url().host());
            sb2.append(" not verified:\n            |    certificate: ");
            sb2.append(okhttp3.CertificatePinner.INSTANCE.pin(x509Certificate));
            sb2.append("\n            |    DN: ");
            sb2.append(x509Certificate.getSubjectDN().getName());
            sb2.append("\n            |    subjectAltNames: ");
            sb2.append(okhttp3.internal.tls.OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate));
            sb2.append("\n            ");
            throw new javax.net.ssl.SSLPeerUnverifiedException(kotlin.text.StringsKt.trimMargin$default(sb2.toString(), null, 1, null));
        } catch (java.lang.Throwable th) {
            okhttp3.internal.platform.Platform.INSTANCE.get().afterHandshake(p0);
            okhttp3.internal._UtilJvmKt.closeQuietly(p0);
            throw th;
        }
    }

    public final okhttp3.internal.connection.ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(java.util.List<okhttp3.ConnectionSpec> connectionSpecs, javax.net.ssl.SSLSocket sslSocket) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpecs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        okhttp3.internal.connection.ConnectPlan nextConnectionSpec$okhttp = nextConnectionSpec$okhttp(connectionSpecs, sslSocket);
        if (nextConnectionSpec$okhttp != null) {
            return nextConnectionSpec$okhttp;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isTlsFallback);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        java.lang.String[] enabledProtocols = sslSocket.getEnabledProtocols();
        kotlin.jvm.internal.Intrinsics.checkNotNull(enabledProtocols);
        java.lang.String arrays = java.util.Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
        sb.append(arrays);
        throw new java.net.UnknownServiceException(sb.toString());
    }

    public final okhttp3.internal.connection.ConnectPlan nextConnectionSpec$okhttp(java.util.List<okhttp3.ConnectionSpec> connectionSpecs, javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpecs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        int i = this.connectionSpecIndex;
        int size = connectionSpecs.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (connectionSpecs.get(i2).isCompatible(sslSocket)) {
                return getHighSpeedVideoFpsRangesFor(this, 0, null, i2, this.connectionSpecIndex != -1, 3);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess */
    public final okhttp3.internal.connection.RealConnection mo24419handleSuccess() {
        this.getOutputFormats.getClient().getRouteDatabase().connected(getRoute());
        okhttp3.internal.connection.RealConnection realConnection = this.isOutputSupportedFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(realConnection);
        okhttp3.internal.connection.RealConnection realConnection2 = realConnection;
        realConnection.getConnectionListener().connectEnd(realConnection2, getRoute(), this.getOutputFormats);
        okhttp3.internal.connection.ReusePlan planReusePooledConnection$okhttp = this.getHighSpeedVideoSizesFor.planReusePooledConnection$okhttp(this, this.routes);
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp.getConnection();
        }
        synchronized (realConnection) {
            this.getHighSpeedVideoFpsRanges.put(realConnection);
            this.getOutputFormats.acquireConnectionNoEvents(realConnection);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        this.getOutputFormats.getEventListener().connectionAcquired(this.getOutputFormats, realConnection2);
        realConnection.getConnectionListener().connectionAcquired(realConnection2, this.getOutputFormats);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public final void mo24418cancel() {
        this.getOutputStallDurationlomOqCM = true;
        java.net.Socket socket = this.getOutputSizes;
        if (socket != null) {
            okhttp3.internal._UtilJvmKt.closeQuietly(socket);
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry */
    public final okhttp3.internal.connection.RoutePlanner.Plan mo24420retry() {
        return new okhttp3.internal.connection.ConnectPlan(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoSizesFor, getRoute(), this.routes, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, this.connectionSpecIndex, this.isTlsFallback);
    }

    public final void closeQuietly() {
        java.net.Socket socket = this.javaNetSocket;
        if (socket != null) {
            okhttp3.internal._UtilJvmKt.closeQuietly(socket);
        }
    }

    public static /* synthetic */ java.util.List $r8$lambda$806SqObLv8d6l4DhU5N2BQVd1eM(okhttp3.CertificatePinner certificatePinner, okhttp3.Handshake handshake, okhttp3.Address address) {
        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = certificatePinner.getCertificateChainCleaner();
        kotlin.jvm.internal.Intrinsics.checkNotNull(certificateChainCleaner);
        return certificateChainCleaner.clean(handshake.peerCertificates(), address.url().host());
    }

    public static /* synthetic */ java.util.List $r8$lambda$ZCg05bGI6M6ecME2HgWklhiULrk(okhttp3.Handshake handshake) {
        java.util.List<java.security.cert.Certificate> peerCertificates = handshake.peerCertificates();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(peerCertificates, 10));
        for (java.security.cert.Certificate certificate : peerCertificates) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "");
            arrayList.add((java.security.cert.X509Certificate) certificate);
        }
        return arrayList;
    }

    public final okhttp3.internal.connection.RoutePlanner.ConnectResult connectTunnel$okhttp() throws java.io.IOException {
        okhttp3.Request request;
        okhttp3.Request request2 = this.getOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(request2);
        okhttp3.HttpUrl url = getRoute().address().url();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CONNECT ");
        sb.append(okhttp3.internal._UtilJvmKt.toHostHeader(url, true));
        sb.append(" HTTP/1.1");
        java.lang.String obj = sb.toString();
        while (true) {
            okhttp3.internal.connection.ConnectPlan connectPlan = this;
            okhttp3.internal.connection.BufferedSocket bufferedSocket = this.unwrapAs;
            if (bufferedSocket == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                bufferedSocket = null;
            }
            okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec = new okhttp3.internal.http1.Http1ExchangeCodec(null, connectPlan, bufferedSocket);
            okhttp3.internal.connection.BufferedSocket bufferedSocket2 = this.unwrapAs;
            if (bufferedSocket2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                bufferedSocket2 = null;
            }
            bufferedSocket2.getSource().getGetHighSpeedVideoFpsRangesFor().timeout(this.getHighSpeedVideoFpsRangesFor, java.util.concurrent.TimeUnit.MILLISECONDS);
            okhttp3.internal.connection.BufferedSocket bufferedSocket3 = this.unwrapAs;
            if (bufferedSocket3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                bufferedSocket3 = null;
            }
            bufferedSocket3.getSink().getGetHighResolutionOutputSizeshNQ4ISI().timeout(this.Camera2StreamConfigurationMap, java.util.concurrent.TimeUnit.MILLISECONDS);
            http1ExchangeCodec.writeRequest(request2.headers(), obj);
            http1ExchangeCodec.finishRequest();
            okhttp3.Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            kotlin.jvm.internal.Intrinsics.checkNotNull(readResponseHeaders);
            okhttp3.Response build = readResponseHeaders.request(request2).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code == 200) {
                request = null;
                break;
            }
            if (code == 407) {
                okhttp3.Request authenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), build);
                if (authenticate == null) {
                    throw new java.io.IOException("Failed to authenticate with proxy");
                }
                if (kotlin.text.StringsKt.equals("close", okhttp3.Response.header$default(build, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null), true)) {
                    request = authenticate;
                    break;
                }
                request2 = authenticate;
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected response code for CONNECT: ");
                sb2.append(build.code());
                throw new java.io.IOException(sb2.toString());
            }
        }
        if (request == null) {
            return new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        java.net.Socket socket = this.getOutputSizes;
        if (socket != null) {
            okhttp3.internal._UtilJvmKt.closeQuietly(socket);
        }
        int i = 1 + this.getOutputMinFrameDurationlomOqCM;
        if (i < 21) {
            this.getOutputFormats.getEventListener().connectEnd(this.getOutputFormats, getRoute().socketAddress(), getRoute().proxy(), null);
            return new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, getHighSpeedVideoFpsRangesFor(this, i, request, 0, false, 12), null, 4, null);
        }
        java.net.ProtocolException protocolException = new java.net.ProtocolException("Too many tunnel connections attempted: 21");
        java.net.ProtocolException protocolException2 = protocolException;
        this.getOutputFormats.getEventListener().connectFailed(this.getOutputFormats, getRoute().socketAddress(), getRoute().proxy(), null, protocolException2);
        this.getHighSpeedVideoFpsRanges.getConnectionListener().connectFailed(getRoute(), this.getOutputFormats, protocolException2);
        return new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void trackFailure(okhttp3.internal.connection.RealCall call, java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.net.Proxy.Type.values().length];
            try {
                iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[java.net.Proxy.Type.HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
