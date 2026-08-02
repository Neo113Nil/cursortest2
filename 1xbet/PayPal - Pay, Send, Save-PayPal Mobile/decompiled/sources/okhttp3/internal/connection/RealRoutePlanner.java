package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#J/\u0010(\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0000¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020&2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0000¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u00010&2\u0006\u00101\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010:R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010=R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010=R\u0014\u0010F\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010<\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010ER\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010JR\u0014\u0010?\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010LR\u0014\u00108\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010ER\u0018\u0010A\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010NR\u0018\u0010B\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010P\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u00020\u001b0S8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W"}, d2 = {"Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "fastFallback", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Request;", "request", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZZLokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;)V", "isCanceled", "()Z", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/ReusePlan;", "getHighSpeedVideoFpsRangesFor", "()Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/internal/connection/ConnectPlan;", "planConnect$okhttp", "()Lokhttp3/internal/connection/ConnectPlan;", "planToReplace", "", "Lokhttp3/Route;", "routes", "planReusePooledConnection$okhttp", "(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;", "route", "planConnectToRoute$okhttp", "(Lokhttp3/Route;Ljava/util/List;)Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RealConnection;", "failedConnection", "hasNext", "(Lokhttp3/internal/connection/RealConnection;)Z", "p0", "Camera2StreamConfigurationMap", "(Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Route;", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "getOutputStallDuration", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getOutputStallDurationlomOqCM", "getOutputSizes", "getInputSizeshNQ4ISI", "getOutputFormats", "Z", "getOutputMinFrameDuration", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "Lokhttp3/internal/connection/RouteDatabase;", "getInputFormats", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/internal/connection/RouteSelector;", "getOutputMinFrameDurationlomOqCM", "Lokhttp3/internal/connection/RouteSelector;", "Lokhttp3/Route;", "Lkotlin/collections/ArrayDeque;", "deferredPlans", "Lkotlin/collections/ArrayDeque;", "getDeferredPlans", "()Lkotlin/collections/ArrayDeque;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealRoutePlanner implements okhttp3.internal.connection.RoutePlanner {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getOutputStallDuration;
    private final okhttp3.Address address;
    private final kotlin.collections.ArrayDeque<okhttp3.internal.connection.RoutePlanner.Plan> deferredPlans;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private okhttp3.Route getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RealConnectionPool getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RealCall getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private okhttp3.internal.connection.RouteSelector.Selection getOutputStallDurationlomOqCM;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final boolean getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RouteDatabase getInputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private okhttp3.internal.connection.RouteSelector getOutputSizes;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final int getInputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final okhttp3.internal.concurrent.TaskRunner Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    public RealRoutePlanner(okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.internal.connection.RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, okhttp3.Address address, okhttp3.internal.connection.RouteDatabase routeDatabase, okhttp3.internal.connection.RealCall realCall, okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realConnectionPool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routeDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.Camera2StreamConfigurationMap = taskRunner;
        this.getHighSpeedVideoSizes = realConnectionPool;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.getInputSizeshNQ4ISI = i4;
        this.getOutputFormats = i5;
        this.getOutputMinFrameDuration = z;
        this.getHighSpeedVideoSizesFor = z2;
        this.address = address;
        this.getInputFormats = routeDatabase;
        this.getOutputSizeshNQ4ISI = realCall;
        this.getOutputStallDuration = !kotlin.jvm.internal.Intrinsics.areEqual(request.method(), "GET");
        this.deferredPlans = new kotlin.collections.ArrayDeque<>();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final okhttp3.Address getAddress() {
        return this.address;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final kotlin.collections.ArrayDeque<okhttp3.internal.connection.RoutePlanner.Plan> getDeferredPlans() {
        return this.deferredPlans;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean isCanceled() {
        return this.getOutputSizeshNQ4ISI.getCanceled();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final okhttp3.internal.connection.RoutePlanner.Plan plan() throws java.io.IOException {
        okhttp3.internal.connection.ReusePlan highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor;
        }
        okhttp3.internal.connection.ReusePlan planReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (planReusePooledConnection$okhttp$default != null) {
            return planReusePooledConnection$okhttp$default;
        }
        if (!getDeferredPlans().isEmpty()) {
            return getDeferredPlans().removeFirst();
        }
        okhttp3.internal.connection.ConnectPlan planConnect$okhttp = planConnect$okhttp();
        okhttp3.internal.connection.ReusePlan planReusePooledConnection$okhttp = planReusePooledConnection$okhttp(planConnect$okhttp, planConnect$okhttp.getRoutes$okhttp());
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp;
        }
        return planConnect$okhttp;
    }

    private final okhttp3.internal.connection.ReusePlan getHighSpeedVideoFpsRangesFor() {
        java.net.Socket releaseConnectionNoEvents$okhttp;
        boolean z;
        okhttp3.internal.connection.RealConnection connection = this.getOutputSizeshNQ4ISI.getConnection();
        if (connection == null) {
            return null;
        }
        boolean isHealthy = connection.isHealthy(this.getOutputStallDuration);
        synchronized (connection) {
            if (!isHealthy) {
                z = !connection.getNoNewExchanges();
                connection.setNoNewExchanges(true);
                releaseConnectionNoEvents$okhttp = this.getOutputSizeshNQ4ISI.releaseConnectionNoEvents$okhttp();
            } else {
                if (!connection.getNoNewExchanges() && sameHostAndPort(connection.route().address().url())) {
                    z = false;
                    releaseConnectionNoEvents$okhttp = null;
                }
                releaseConnectionNoEvents$okhttp = this.getOutputSizeshNQ4ISI.releaseConnectionNoEvents$okhttp();
                z = false;
            }
        }
        if (this.getOutputSizeshNQ4ISI.getConnection() != null) {
            if (releaseConnectionNoEvents$okhttp != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            return new okhttp3.internal.connection.ReusePlan(connection);
        }
        if (releaseConnectionNoEvents$okhttp != null) {
            okhttp3.internal._UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
        }
        okhttp3.internal.connection.RealConnection realConnection = connection;
        this.getOutputSizeshNQ4ISI.getEventListener().connectionReleased(this.getOutputSizeshNQ4ISI, realConnection);
        connection.getConnectionListener().connectionReleased(realConnection, this.getOutputSizeshNQ4ISI);
        if (releaseConnectionNoEvents$okhttp != null) {
            connection.getConnectionListener().connectionClosed(realConnection);
        } else if (z) {
            connection.getConnectionListener().noNewExchanges(realConnection);
        }
        return null;
    }

    public final okhttp3.internal.connection.ConnectPlan planConnect$okhttp() throws java.io.IOException {
        okhttp3.Route route = this.getOutputMinFrameDurationlomOqCM;
        if (route != null) {
            this.getOutputMinFrameDurationlomOqCM = null;
            return planConnectToRoute$okhttp$default(this, route, null, 2, null);
        }
        okhttp3.internal.connection.RouteSelector.Selection selection = this.getOutputStallDurationlomOqCM;
        if (selection != null && selection.hasNext()) {
            return planConnectToRoute$okhttp$default(this, selection.next(), null, 2, null);
        }
        okhttp3.internal.connection.RouteSelector routeSelector = this.getOutputSizes;
        if (routeSelector == null) {
            okhttp3.internal.connection.RouteSelector routeSelector2 = new okhttp3.internal.connection.RouteSelector(getAddress(), this.getInputFormats, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
            this.getOutputSizes = routeSelector2;
            routeSelector = routeSelector2;
        }
        if (!routeSelector.hasNext()) {
            throw new java.io.IOException("exhausted all routes");
        }
        okhttp3.internal.connection.RouteSelector.Selection next = routeSelector.next();
        this.getOutputStallDurationlomOqCM = next;
        if (isCanceled()) {
            throw new java.io.IOException("Canceled");
        }
        return planConnectToRoute$okhttp(next.next(), next.getRoutes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ okhttp3.internal.connection.ReusePlan planReusePooledConnection$okhttp$default(okhttp3.internal.connection.RealRoutePlanner realRoutePlanner, okhttp3.internal.connection.ConnectPlan connectPlan, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            connectPlan = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planReusePooledConnection$okhttp(connectPlan, list);
    }

    public final okhttp3.internal.connection.ReusePlan planReusePooledConnection$okhttp(okhttp3.internal.connection.ConnectPlan planToReplace, java.util.List<okhttp3.Route> routes) {
        okhttp3.internal.connection.RealConnection callAcquirePooledConnection$okhttp = this.getHighSpeedVideoSizes.callAcquirePooledConnection$okhttp(this.getOutputStallDuration, getAddress(), this.getOutputSizeshNQ4ISI, routes, planToReplace != null && planToReplace.getIsReady());
        if (callAcquirePooledConnection$okhttp == null) {
            return null;
        }
        if (planToReplace != null) {
            this.getOutputMinFrameDurationlomOqCM = planToReplace.getRoute();
            planToReplace.closeQuietly();
        }
        okhttp3.internal.connection.RealConnection realConnection = callAcquirePooledConnection$okhttp;
        this.getOutputSizeshNQ4ISI.getEventListener().connectionAcquired(this.getOutputSizeshNQ4ISI, realConnection);
        callAcquirePooledConnection$okhttp.getConnectionListener().connectionAcquired(realConnection, this.getOutputSizeshNQ4ISI);
        return new okhttp3.internal.connection.ReusePlan(callAcquirePooledConnection$okhttp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ okhttp3.internal.connection.ConnectPlan planConnectToRoute$okhttp$default(okhttp3.internal.connection.RealRoutePlanner realRoutePlanner, okhttp3.Route route, java.util.List list, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planConnectToRoute$okhttp(route, list);
    }

    public final okhttp3.internal.connection.ConnectPlan planConnectToRoute$okhttp(okhttp3.Route route, java.util.List<okhttp3.Route> routes) throws java.io.IOException {
        okhttp3.Request request;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        if (route.address().sslSocketFactory() == null) {
            if (!route.address().connectionSpecs().contains(okhttp3.ConnectionSpec.CLEARTEXT)) {
                throw new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            java.lang.String host = route.address().url().host();
            if (!okhttp3.internal.platform.Platform.INSTANCE.get().isCleartextTrafficPermitted(host)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CLEARTEXT communication to ");
                sb.append(host);
                sb.append(" not permitted by network security policy");
                throw new java.net.UnknownServiceException(sb.toString());
            }
        } else if (route.address().protocols().contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (route.requiresTunnel()) {
            okhttp3.Request build = new okhttp3.Request.Builder().url(route.address().url()).method(com.datadog.android.internal.network.HttpSpec.Method.CONNECT, null).header(com.google.common.net.HttpHeaders.HOST, okhttp3.internal._UtilJvmKt.toHostHeader(route.address().url(), true)).header("Proxy-Connection", com.google.common.net.HttpHeaders.KEEP_ALIVE).header("User-Agent", okhttp3.internal._UtilCommonKt.USER_AGENT).build();
            okhttp3.Request authenticate = route.address().proxyAuthenticator().authenticate(route, new okhttp3.Response.Builder().request(build).protocol(okhttp3.Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header(com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").build());
            if (authenticate != null) {
                build = authenticate;
            }
            request = build;
        } else {
            request = null;
        }
        return new okhttp3.internal.connection.ConnectPlan(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this, route, routes, 0, request, -1, false);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean hasNext(okhttp3.internal.connection.RealConnection failedConnection) {
        okhttp3.internal.connection.RouteSelector routeSelector;
        okhttp3.Route Camera2StreamConfigurationMap;
        if (!getDeferredPlans().isEmpty() || this.getOutputMinFrameDurationlomOqCM != null) {
            return true;
        }
        if (failedConnection != null && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(failedConnection)) != null) {
            this.getOutputMinFrameDurationlomOqCM = Camera2StreamConfigurationMap;
            return true;
        }
        okhttp3.internal.connection.RouteSelector.Selection selection = this.getOutputStallDurationlomOqCM;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.getOutputSizes) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    private final okhttp3.Route Camera2StreamConfigurationMap(okhttp3.internal.connection.RealConnection p0) {
        okhttp3.Route route;
        synchronized (p0) {
            route = null;
            if (p0.getRouteFailureCount() == 0 && p0.getNoNewExchanges() && okhttp3.internal._UtilJvmKt.canReuseConnectionFor(p0.route().address().url(), getAddress().url())) {
                route = p0.route();
            }
        }
        return route;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean sameHostAndPort(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        okhttp3.HttpUrl url2 = getAddress().url();
        return url.port() == url2.port() && kotlin.jvm.internal.Intrinsics.areEqual(url.host(), url2.host());
    }
}
