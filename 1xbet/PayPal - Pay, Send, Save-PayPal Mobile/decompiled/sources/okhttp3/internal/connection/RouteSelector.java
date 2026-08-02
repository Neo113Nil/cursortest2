package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0002'&B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001e"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "fastFallback", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Z)V", "hasNext", "()Z", "Lokhttp3/internal/connection/RouteSelector$Selection;", io.ktor.http.LinkHeader.Rel.Next, "()Lokhttp3/internal/connection/RouteSelector$Selection;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Address;", "getHighSpeedVideoSizes", "getInputFormats", "Lokhttp3/internal/connection/RouteDatabase;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/connection/RealCall;", "Z", "Camera2StreamConfigurationMap", "", "Ljava/net/Proxy;", "getOutputMinFrameDuration", "Ljava/util/List;", "", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "Ljava/net/InetSocketAddress;", "", "Lokhttp3/Route;", "getOutputFormats", "Companion", "Selection"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RouteSelector {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.connection.RouteSelector.Companion INSTANCE = new okhttp3.internal.connection.RouteSelector.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okhttp3.Address getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RealCall getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<? extends java.net.InetSocketAddress> getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RouteDatabase getHighSpeedVideoFpsRangesFor;
    private final java.util.List<okhttp3.Route> getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private java.util.List<? extends java.net.Proxy> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteSelector(okhttp3.Address address, okhttp3.internal.connection.RouteDatabase routeDatabase, okhttp3.internal.connection.RealCall realCall, boolean z) {
        java.util.List<? extends java.net.Proxy> immutableListOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routeDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realCall, "");
        this.getHighSpeedVideoSizes = address;
        this.getHighSpeedVideoFpsRangesFor = routeDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = realCall;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
        this.getOutputMinFrameDuration = kotlin.collections.CollectionsKt.emptyList();
        this.getOutputFormats = new java.util.ArrayList();
        okhttp3.HttpUrl url = address.url();
        java.net.Proxy proxy = address.proxy();
        realCall.getEventListener().proxySelectStart(realCall, url);
        if (proxy != null) {
            immutableListOf = kotlin.collections.CollectionsKt.listOf(proxy);
        } else {
            java.net.URI uri = url.uri();
            if (uri.getHost() != null) {
                java.util.List<java.net.Proxy> select = address.proxySelector().select(uri);
                java.util.List<java.net.Proxy> list = select;
                if (list != null && !list.isEmpty()) {
                    immutableListOf = okhttp3.internal._UtilJvmKt.toImmutableList(select);
                }
            }
            immutableListOf = okhttp3.internal._UtilJvmKt.immutableListOf(java.net.Proxy.NO_PROXY);
        }
        this.getHighSpeedVideoFpsRanges = immutableListOf;
        this.getInputSizeshNQ4ISI = 0;
        realCall.getEventListener().proxySelectEnd(realCall, url, this.getHighSpeedVideoFpsRanges);
    }

    public final boolean hasNext() {
        return getHighSpeedVideoFpsRanges() || !this.getOutputFormats.isEmpty();
    }

    public final okhttp3.internal.connection.RouteSelector.Selection next() throws java.io.IOException {
        java.lang.String host;
        int port;
        java.util.List<java.net.InetAddress> lookup;
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (getHighSpeedVideoFpsRanges()) {
            if (!getHighSpeedVideoFpsRanges()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No route to ");
                sb.append(this.getHighSpeedVideoSizes.url().host());
                sb.append("; exhausted proxy configurations: ");
                sb.append(this.getHighSpeedVideoFpsRanges);
                throw new java.net.SocketException(sb.toString());
            }
            java.util.List<? extends java.net.Proxy> list = this.getHighSpeedVideoFpsRanges;
            int i = this.getInputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = i + 1;
            java.net.Proxy proxy = list.get(i);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.getOutputMinFrameDuration = arrayList2;
            if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS) {
                host = this.getHighSpeedVideoSizes.url().host();
                port = this.getHighSpeedVideoSizes.url().port();
            } else {
                java.net.SocketAddress address = proxy.address();
                if (!(address instanceof java.net.InetSocketAddress)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                    sb2.append(address.getClass());
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                }
                java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) address;
                host = INSTANCE.getSocketHost(inetSocketAddress);
                port = inetSocketAddress.getPort();
            }
            if (port <= 0 || port >= 65536) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("No route to ");
                sb3.append(host);
                sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                sb3.append(port);
                sb3.append("; port is out of range");
                throw new java.net.SocketException(sb3.toString());
            }
            if (proxy.type() == java.net.Proxy.Type.SOCKS) {
                arrayList2.add(java.net.InetSocketAddress.createUnresolved(host, port));
            } else {
                if (okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(host)) {
                    lookup = kotlin.collections.CollectionsKt.listOf(java.net.InetAddress.getByName(host));
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.getEventListener().dnsStart(this.getHighResolutionOutputSizeshNQ4ISI, host);
                    lookup = this.getHighSpeedVideoSizes.dns().lookup(host);
                    if (lookup.isEmpty()) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(this.getHighSpeedVideoSizes.dns());
                        sb4.append(" returned no addresses for ");
                        sb4.append(host);
                        throw new java.net.UnknownHostException(sb4.toString());
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.getEventListener().dnsEnd(this.getHighResolutionOutputSizeshNQ4ISI, host, lookup);
                }
                if (this.Camera2StreamConfigurationMap) {
                    lookup = okhttp3.internal.connection.InetAddressOrderKt.reorderForHappyEyeballs(lookup);
                }
                java.util.Iterator<java.net.InetAddress> it = lookup.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new java.net.InetSocketAddress(it.next(), port));
                }
            }
            java.util.Iterator<? extends java.net.InetSocketAddress> it2 = this.getOutputMinFrameDuration.iterator();
            while (it2.hasNext()) {
                okhttp3.Route route = new okhttp3.Route(this.getHighSpeedVideoSizes, proxy, it2.next());
                if (this.getHighSpeedVideoFpsRangesFor.shouldPostpone(route)) {
                    this.getOutputFormats.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, this.getOutputFormats);
            this.getOutputFormats.clear();
        }
        return new okhttp3.internal.connection.RouteSelector.Selection(arrayList);
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        return this.getInputSizeshNQ4ISI < this.getHighSpeedVideoFpsRanges.size();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "", "Lokhttp3/Route;", "routes", "<init>", "(Ljava/util/List;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Lokhttp3/Route;", "Ljava/util/List;", "getRoutes", "()Ljava/util/List;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Selection {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes;
        private final java.util.List<okhttp3.Route> routes;

        public Selection(java.util.List<okhttp3.Route> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.routes = list;
        }

        public final java.util.List<okhttp3.Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes < this.routes.size();
        }

        public final okhttp3.Route next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.util.List<okhttp3.Route> list = this.routes;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            return list.get(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "<init>", "()V", "Ljava/net/InetSocketAddress;", "", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getSocketHost(java.net.InetSocketAddress inetSocketAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
            java.net.InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                java.lang.String hostName = inetSocketAddress.getHostName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hostName, "");
                return hostName;
            }
            java.lang.String hostAddress = address.getHostAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hostAddress, "");
            return hostAddress;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
