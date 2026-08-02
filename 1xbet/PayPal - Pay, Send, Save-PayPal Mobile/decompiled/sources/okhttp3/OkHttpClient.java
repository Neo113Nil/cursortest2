package okhttp3;

@kotlin.Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u0099\u00012\u00020\u00012\u00020\u0002:\u0004\u009a\u0001\u0099\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0007¢\u0006\u0004\b#\u0010\"J\u000f\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020'H\u0007¢\u0006\u0004\b-\u0010)J\u000f\u0010.\u001a\u00020'H\u0007¢\u0006\u0004\b.\u0010)J\u000f\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0007¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020*H\u0007¢\u0006\u0004\b>\u0010,J\u000f\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u001fH\u0007¢\u0006\u0004\bF\u0010\"J\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u001fH\u0007¢\u0006\u0004\bH\u0010\"J\u000f\u0010J\u001a\u00020IH\u0007¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0007¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0007¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020OH\u0007¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020OH\u0007¢\u0006\u0004\bS\u0010QJ\u000f\u0010T\u001a\u00020OH\u0007¢\u0006\u0004\bT\u0010QJ\u000f\u0010U\u001a\u00020OH\u0007¢\u0006\u0004\bU\u0010QR\u0017\u0010V\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bV\u0010\u001bR \u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bX\u0010\"R \u0010Z\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010Y\u001a\u0004\bZ\u0010\"R\u001a\u0010[\u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010&R\u001a\u0010]\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b]\u0010)R\u001a\u0010_\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010^\u001a\u0004\b_\u0010)R\u001a\u0010`\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b`\u0010,R\u001a\u0010b\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bb\u0010)R\u001a\u0010c\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010^\u001a\u0004\bc\u0010)R\u001a\u0010d\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bd\u00101R\u001c\u0010f\u001a\u0004\u0018\u0001028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bf\u00104R\u001a\u0010h\u001a\u0002058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bh\u00107R\u001c\u0010j\u001a\u0004\u0018\u0001088\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bj\u0010:R\u001a\u0010l\u001a\u00020;8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bl\u0010=R\u001a\u0010n\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010a\u001a\u0004\bn\u0010,R\u001a\u0010o\u001a\u00020?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bo\u0010AR\u0016\u0010q\u001a\u0004\u0018\u00010B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0011\u0010s\u001a\u00020B8G¢\u0006\u0006\u001a\u0004\bs\u0010DR\u001c\u0010u\u001a\u0004\u0018\u00010t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bu\u0010wR \u0010x\u001a\b\u0012\u0004\u0012\u00020E0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010Y\u001a\u0004\bx\u0010\"R \u0010y\u001a\b\u0012\u0004\u0012\u00020G0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010Y\u001a\u0004\by\u0010\"R\u001a\u0010z\u001a\u00020I8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\bz\u0010KR\u001a\u0010|\u001a\u00020L8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010NR\u001e\u0010\u007f\u001a\u0004\u0018\u00010~8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b\u007f\u0010\u0081\u0001R\u001e\u0010\u0082\u0001\u001a\u00020O8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b\u0082\u0001\u0010QR\u001e\u0010\u0084\u0001\u001a\u00020O8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010QR\u001e\u0010\u0085\u0001\u001a\u00020O8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0083\u0001\u001a\u0005\b\u0085\u0001\u0010QR\u001e\u0010\u0086\u0001\u001a\u00020O8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0083\u0001\u001a\u0005\b\u0086\u0001\u0010QR\u001e\u0010\u0087\u0001\u001a\u00020O8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010\u0083\u0001\u001a\u0005\b\u0087\u0001\u0010QR\u001e\u0010\u0088\u0001\u001a\u00020O8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0088\u0001\u0010\u0083\u0001\u001a\u0005\b\u0088\u0001\u0010QR \u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008a\u0001\u0010\u008c\u0001R \u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001e\u0010\u0097\u0001\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\b\u0097\u0001\u0010\u001e"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lokhttp3/OkHttpClient$Builder;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "address", "(Lokhttp3/HttpUrl;)Lokhttp3/Address;", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;", "Lokhttp3/WebSocketListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;", "newBuilder", "()Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "-deprecated_networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "", "-deprecated_retryOnConnectionFailure", "()Z", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "-deprecated_followRedirects", "-deprecated_followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "-deprecated_proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "", "-deprecated_callTimeoutMillis", "()I", "-deprecated_connectTimeoutMillis", "-deprecated_readTimeoutMillis", "-deprecated_writeTimeoutMillis", "-deprecated_pingIntervalMillis", "dispatcher", "Lokhttp3/Dispatcher;", "interceptors", "Ljava/util/List;", "networkInterceptors", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "retryOnConnectionFailure", "Z", "fastFallback", "authenticator", "Lokhttp3/Authenticator;", "followRedirects", "followSslRedirects", "cookieJar", "Lokhttp3/CookieJar;", com.datadog.trace.api.DDSpanTypes.CACHE, "Lokhttp3/Cache;", "dns", "Lokhttp3/Dns;", "proxy", "Ljava/net/Proxy;", "proxySelector", "Ljava/net/ProxySelector;", "proxyAuthenticator", "socketFactory", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "connectionSpecs", "protocols", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "certificatePinner", "Lokhttp3/CertificatePinner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "callTimeoutMillis", com.visa.cbp.getEncExpo.warmup, "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "pingIntervalMillis", "webSocketCloseTimeout", "", "minWebSocketMessageToCompress", "J", "()J", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "connectionPool", "Lokhttp3/ConnectionPool;", "Companion", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class OkHttpClient implements okhttp3.Call.Factory, okhttp3.WebSocket.Factory {
    private final okhttp3.Authenticator authenticator;
    private final okhttp3.Cache cache;
    private final int callTimeoutMillis;
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final okhttp3.CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final okhttp3.ConnectionPool connectionPool;
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private final okhttp3.CookieJar cookieJar;
    private final okhttp3.Dispatcher dispatcher;
    private final okhttp3.Dns dns;
    private final okhttp3.EventListener.Factory eventListenerFactory;
    private final boolean fastFallback;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final java.util.List<okhttp3.Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final java.util.List<okhttp3.Protocol> protocols;
    private final java.net.Proxy proxy;
    private final okhttp3.Authenticator proxyAuthenticator;
    private final java.net.ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;
    private final javax.net.SocketFactory socketFactory;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private final int webSocketCloseTimeout;
    private final int writeTimeoutMillis;
    private final javax.net.ssl.X509TrustManager x509TrustManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.OkHttpClient.Companion INSTANCE = new okhttp3.OkHttpClient.Companion(null);
    private static final java.util.List<okhttp3.Protocol> DEFAULT_PROTOCOLS = okhttp3.internal._UtilJvmKt.immutableListOf(okhttp3.Protocol.HTTP_2, okhttp3.Protocol.HTTP_1_1);
    private static final java.util.List<okhttp3.ConnectionSpec> DEFAULT_CONNECTION_SPECS = okhttp3.internal._UtilJvmKt.immutableListOf(okhttp3.ConnectionSpec.MODERN_TLS, okhttp3.ConnectionSpec.CLEARTEXT);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OkHttpClient(okhttp3.OkHttpClient.Builder builder) {
        okhttp3.internal.proxy.NullProxySelector proxySelector;
        java.util.List<okhttp3.Interceptor> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        this.dispatcher = builder.getDispatcher();
        this.interceptors = okhttp3.internal._UtilJvmKt.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = okhttp3.internal._UtilJvmKt.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.fastFallback = builder.getFastFallback();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = okhttp3.internal.proxy.NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            if (proxySelector == null && (proxySelector = java.net.ProxySelector.getDefault()) == null) {
                proxySelector = okhttp3.internal.proxy.NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        java.util.List<okhttp3.ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.webSocketCloseTimeout = builder.getWebSocketCloseTimeout();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        okhttp3.internal.connection.RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new okhttp3.internal.connection.RouteDatabase() : routeDatabase;
        okhttp3.internal.concurrent.TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner == null ? okhttp3.internal.concurrent.TaskRunner.INSTANCE : taskRunner;
        okhttp3.ConnectionPool connectionPool = builder.getConnectionPool();
        if (connectionPool == null) {
            connectionPool = new okhttp3.ConnectionPool();
            builder.setConnectionPool$okhttp(connectionPool);
        }
        this.connectionPool = connectionPool;
        java.util.List<okhttp3.ConnectionSpec> list2 = connectionSpecs$okhttp;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((okhttp3.ConnectionSpec) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        javax.net.ssl.X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    } else {
                        javax.net.ssl.X509TrustManager platformTrustManager = okhttp3.internal.platform.Platform.INSTANCE.get().platformTrustManager();
                        this.x509TrustManager = platformTrustManager;
                        this.sslSocketFactoryOrNull = okhttp3.internal.platform.Platform.INSTANCE.get().newSslSocketFactory(platformTrustManager);
                        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner2 = okhttp3.internal.tls.CertificateChainCleaner.INSTANCE.get(platformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner2;
                        this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner2);
                    }
                    list = this.interceptors;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list, "");
                    if (!list.contains(null)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Null interceptor: ");
                        sb.append(this.interceptors);
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    java.util.List<okhttp3.Interceptor> list3 = this.networkInterceptors;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list3, "");
                    if (list3.contains(null)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Null network interceptor: ");
                        sb2.append(this.networkInterceptors);
                        throw new java.lang.IllegalStateException(sb2.toString().toString());
                    }
                    java.util.List<okhttp3.ConnectionSpec> list4 = this.connectionSpecs;
                    if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                        java.util.Iterator<T> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((okhttp3.ConnectionSpec) it2.next()).getIsTls()) {
                                if (this.sslSocketFactoryOrNull == null) {
                                    throw new java.lang.IllegalStateException("sslSocketFactory == null".toString());
                                }
                                if (this.certificateChainCleaner == null) {
                                    throw new java.lang.IllegalStateException("certificateChainCleaner == null".toString());
                                }
                                if (this.x509TrustManager == null) {
                                    throw new java.lang.IllegalStateException("x509TrustManager == null".toString());
                                }
                                return;
                            }
                        }
                    }
                    if (this.sslSocketFactoryOrNull != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (this.certificateChainCleaner != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (this.x509TrustManager != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(this.certificatePinner, okhttp3.CertificatePinner.DEFAULT)) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    return;
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = okhttp3.CertificatePinner.DEFAULT;
        list = this.interceptors;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list, "");
        if (!list.contains(null)) {
        }
    }

    public final okhttp3.Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final java.util.List<okhttp3.Interceptor> interceptors() {
        return this.interceptors;
    }

    public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public final okhttp3.EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: fastFallback, reason: from getter */
    public final boolean getFastFallback() {
        return this.fastFallback;
    }

    public final okhttp3.Authenticator authenticator() {
        return this.authenticator;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final okhttp3.CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final okhttp3.Cache cache() {
        return this.cache;
    }

    public final okhttp3.Dns dns() {
        return this.dns;
    }

    public final java.net.Proxy proxy() {
        return this.proxy;
    }

    public final java.net.ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final okhttp3.Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final javax.net.SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new java.lang.IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: x509TrustManager, reason: from getter */
    public final javax.net.ssl.X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final java.util.List<okhttp3.Protocol> protocols() {
        return this.protocols;
    }

    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final okhttp3.CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: certificateChainCleaner, reason: from getter */
    public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* renamed from: webSocketCloseTimeout, reason: from getter */
    public final int getWebSocketCloseTimeout() {
        return this.webSocketCloseTimeout;
    }

    /* renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    /* renamed from: getRouteDatabase$okhttp, reason: from getter */
    public final okhttp3.internal.connection.RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    /* renamed from: getTaskRunner$okhttp, reason: from getter */
    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    public final okhttp3.ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public OkHttpClient() {
        this(new okhttp3.OkHttpClient.Builder());
    }

    public final okhttp3.Address address(okhttp3.HttpUrl url) {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        javax.net.ssl.HostnameVerifier hostnameVerifier;
        okhttp3.CertificatePinner certificatePinner;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        if (url.isHttps()) {
            sSLSocketFactory = sslSocketFactory();
            hostnameVerifier = this.hostnameVerifier;
            certificatePinner = this.certificatePinner;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new okhttp3.Address(url.host(), url.port(), this.dns, this.socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, this.proxyAuthenticator, this.proxy, this.protocols, this.connectionSpecs, this.proxySelector);
    }

    @Override // okhttp3.Call.Factory
    public okhttp3.Call newCall(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return new okhttp3.internal.connection.RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public okhttp3.WebSocket newWebSocket(okhttp3.Request request, okhttp3.WebSocketListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        okhttp3.internal.ws.RealWebSocket realWebSocket = new okhttp3.internal.ws.RealWebSocket(this.taskRunner, request, listener, new java.util.Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public okhttp3.OkHttpClient.Builder newBuilder() {
        return new okhttp3.OkHttpClient.Builder(this);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dispatcher", imports = {}))
    /* renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final okhttp3.Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionPool", imports = {}))
    /* renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final okhttp3.ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "interceptors", imports = {}))
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m24374deprecated_interceptors() {
        return this.interceptors;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "networkInterceptors", imports = {}))
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m24375deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "eventListenerFactory", imports = {}))
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final okhttp3.EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "authenticator", imports = {}))
    /* renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final okhttp3.Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "followRedirects", imports = {}))
    /* renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "followSslRedirects", imports = {}))
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cookieJar", imports = {}))
    /* renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final okhttp3.CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.datadog.trace.api.DDSpanTypes.CACHE, imports = {}))
    /* renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final okhttp3.Cache getCache() {
        return this.cache;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dns", imports = {}))
    /* renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final okhttp3.Dns getDns() {
        return this.dns;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final java.net.Proxy getProxy() {
        return this.proxy;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxySelector", imports = {}))
    /* renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final java.net.ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final okhttp3.Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketFactory", imports = {}))
    /* renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final javax.net.SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sslSocketFactory", imports = {}))
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final javax.net.ssl.SSLSocketFactory m24384deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionSpecs", imports = {}))
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m24366deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocols", imports = {}))
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m24377deprecated_protocols() {
        return this.protocols;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostnameVerifier", imports = {}))
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "certificatePinner", imports = {}))
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final okhttp3.CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001b\u001a\u00020\u00002#\b\u0004\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001d\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0013J8\u0010\u001f\u001a\u00020\u00002#\b\u0004\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b)\u0010(J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020&¢\u0006\u0004\b-\u0010(J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020&¢\u0006\u0004\b/\u0010(J\u0015\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020*¢\u0006\u0004\bC\u0010,J\u0015\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00002\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bH\u0010IJ\u001d\u0010H\u001a\u00020\u00002\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bH\u0010LJ\u001b\u0010O\u001a\u00020\u00002\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M¢\u0006\u0004\bO\u0010PJ\u001b\u0010R\u001a\u00020\u00002\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0M¢\u0006\u0004\bR\u0010PJ\u0015\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bW\u0010XJ\u001d\u0010]\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0015\u0010]\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_¢\u0006\u0004\b]\u0010aJ\u0015\u0010]\u001a\u00020\u00002\u0006\u0010`\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\be\u0010^J\u0015\u0010e\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_¢\u0006\u0004\be\u0010aJ\u0015\u0010e\u001a\u00020\u00002\u0006\u0010`\u001a\u00020b¢\u0006\u0004\bf\u0010dJ\u001d\u0010g\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\bg\u0010^J\u0015\u0010g\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_¢\u0006\u0004\bg\u0010aJ\u0015\u0010g\u001a\u00020\u00002\u0006\u0010`\u001a\u00020b¢\u0006\u0004\bh\u0010dJ\u001d\u0010i\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\bi\u0010^J\u0015\u0010i\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_¢\u0006\u0004\bi\u0010aJ\u0015\u0010i\u001a\u00020\u00002\u0006\u0010`\u001a\u00020b¢\u0006\u0004\bj\u0010dJ\u001d\u0010l\u001a\u00020\u00002\u0006\u0010k\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\bl\u0010^J\u0015\u0010l\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_¢\u0006\u0004\bl\u0010aJ\u0015\u0010l\u001a\u00020\u00002\u0006\u0010`\u001a\u00020b¢\u0006\u0004\bm\u0010dJ\u001d\u0010n\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\bn\u0010^J\u0015\u0010n\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_¢\u0006\u0004\bn\u0010aJ\u0015\u0010n\u001a\u00020\u00002\u0006\u0010`\u001a\u00020b¢\u0006\u0004\bo\u0010dJ\u0015\u0010q\u001a\u00020\u00002\u0006\u0010p\u001a\u00020Y¢\u0006\u0004\bq\u0010dJ\r\u0010r\u001a\u00020\u0004¢\u0006\u0004\br\u0010sR\"\u0010\b\u001a\u00020\u00078\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010~\u001a\u0004\b\u007f\u0010\u0010R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0001X\u0081\u0004¢\u0006\r\n\u0004\b\u001d\u0010~\u001a\u0005\b\u0080\u0001\u0010\u0010R'\u0010$\u001a\u00020#8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b$\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010'\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b'\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R'\u0010)\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b)\u0010\u0086\u0001\u001a\u0006\b\u008b\u0001\u0010\u0088\u0001\"\u0006\b\u008c\u0001\u0010\u008a\u0001R'\u0010+\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b+\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R'\u0010-\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b-\u0010\u0086\u0001\u001a\u0006\b\u0092\u0001\u0010\u0088\u0001\"\u0006\b\u0093\u0001\u0010\u008a\u0001R'\u0010/\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b/\u0010\u0086\u0001\u001a\u0006\b\u0094\u0001\u0010\u0088\u0001\"\u0006\b\u0095\u0001\u0010\u008a\u0001R'\u00101\u001a\u0002008\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b1\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u00104\u001a\u0004\u0018\u0001038\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b4\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R'\u0010;\u001a\u00020:8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b;\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R)\u0010>\u001a\u0004\u0018\u00010=8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b>\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R)\u0010A\u001a\u0004\u0018\u00010@8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bA\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R'\u0010C\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bC\u0010\u008d\u0001\u001a\u0006\b¯\u0001\u0010\u008f\u0001\"\u0006\b°\u0001\u0010\u0091\u0001R'\u0010E\u001a\u00020D8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bE\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R+\u0010¶\u0001\u001a\u0004\u0018\u00010G8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R+\u0010¼\u0001\u001a\u0004\u0018\u00010J8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R+\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0004\bO\u0010~\u001a\u0005\bÂ\u0001\u0010\u0010\"\u0006\bÃ\u0001\u0010Ä\u0001R+\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0M8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0004\bR\u0010~\u001a\u0005\bÅ\u0001\u0010\u0010\"\u0006\bÆ\u0001\u0010Ä\u0001R'\u0010T\u001a\u00020S8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bT\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R'\u0010W\u001a\u00020V8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bW\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R(\u0010]\u001a\u00030Ø\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b]\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R(\u0010e\u001a\u00030Ø\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\be\u0010Ù\u0001\u001a\u0006\bÞ\u0001\u0010Û\u0001\"\u0006\bß\u0001\u0010Ý\u0001R(\u0010g\u001a\u00030Ø\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bg\u0010Ù\u0001\u001a\u0006\bà\u0001\u0010Û\u0001\"\u0006\bá\u0001\u0010Ý\u0001R(\u0010i\u001a\u00030Ø\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bi\u0010Ù\u0001\u001a\u0006\bâ\u0001\u0010Û\u0001\"\u0006\bã\u0001\u0010Ý\u0001R(\u0010l\u001a\u00030Ø\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bl\u0010Ù\u0001\u001a\u0006\bä\u0001\u0010Û\u0001\"\u0006\bå\u0001\u0010Ý\u0001R(\u0010n\u001a\u00030Ø\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bn\u0010Ù\u0001\u001a\u0006\bæ\u0001\u0010Û\u0001\"\u0006\bç\u0001\u0010Ý\u0001R'\u0010q\u001a\u00020Y8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bq\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R,\u0010î\u0001\u001a\u0005\u0018\u00010í\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R)\u00107\u001a\u0004\u0018\u0001068\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b7\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "(Z)Lokhttp3/OkHttpClient$Builder;", "fastFallback", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Cache;", com.datadog.trace.api.DDSpanTypes.CACHE, "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "taskRunner$okhttp", "(Lokhttp3/internal/concurrent/TaskRunner;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", "duration", "(Ljava/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/time/Duration;", "callTimeout-LRDsOJo", "(J)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "connectTimeout-LRDsOJo", "readTimeout", "readTimeout-LRDsOJo", "writeTimeout", "writeTimeout-LRDsOJo", "interval", "pingInterval", "pingInterval-LRDsOJo", "webSocketCloseTimeout", "webSocketCloseTimeout-LRDsOJo", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "minWebSocketMessageToCompress", "build", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "getFastFallback$okhttp", "setFastFallback$okhttp", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", com.visa.cbp.getEncExpo.warmup, "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "getWebSocketCloseTimeout$okhttp", "setWebSocketCloseTimeout$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "setTaskRunner$okhttp", "(Lokhttp3/internal/concurrent/TaskRunner;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private okhttp3.Authenticator authenticator;
        private okhttp3.Cache cache;
        private int callTimeout;
        private okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
        private okhttp3.CertificatePinner certificatePinner;
        private int connectTimeout;
        private okhttp3.ConnectionPool connectionPool;
        private java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
        private okhttp3.CookieJar cookieJar;
        private okhttp3.Dispatcher dispatcher;
        private okhttp3.Dns dns;
        private okhttp3.EventListener.Factory eventListenerFactory;
        private boolean fastFallback;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private javax.net.ssl.HostnameVerifier hostnameVerifier;
        private final java.util.List<okhttp3.Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final java.util.List<okhttp3.Interceptor> networkInterceptors;
        private int pingInterval;
        private java.util.List<? extends okhttp3.Protocol> protocols;
        private java.net.Proxy proxy;
        private okhttp3.Authenticator proxyAuthenticator;
        private java.net.ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private okhttp3.internal.connection.RouteDatabase routeDatabase;
        private javax.net.SocketFactory socketFactory;
        private javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;
        private okhttp3.internal.concurrent.TaskRunner taskRunner;
        private int webSocketCloseTimeout;
        private int writeTimeout;
        private javax.net.ssl.X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new okhttp3.Dispatcher();
            this.interceptors = new java.util.ArrayList();
            this.networkInterceptors = new java.util.ArrayList();
            this.eventListenerFactory = okhttp3.internal._UtilJvmKt.asFactory(okhttp3.EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            this.authenticator = okhttp3.Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = okhttp3.CookieJar.NO_COOKIES;
            this.dns = okhttp3.Dns.SYSTEM;
            this.proxyAuthenticator = okhttp3.Authenticator.NONE;
            javax.net.SocketFactory socketFactory = javax.net.SocketFactory.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(socketFactory, "");
            this.socketFactory = socketFactory;
            this.connectionSpecs = okhttp3.OkHttpClient.INSTANCE.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = okhttp3.OkHttpClient.INSTANCE.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE;
            this.certificatePinner = okhttp3.CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* renamed from: getDispatcher$okhttp, reason: from getter */
        public final okhttp3.Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        public final void setDispatcher$okhttp(okhttp3.Dispatcher dispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
            this.dispatcher = dispatcher;
        }

        /* renamed from: getConnectionPool$okhttp, reason: from getter */
        public final okhttp3.ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        public final void setConnectionPool$okhttp(okhttp3.ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
        }

        public final java.util.List<okhttp3.Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final java.util.List<okhttp3.Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        /* renamed from: getEventListenerFactory$okhttp, reason: from getter */
        public final okhttp3.EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final void setEventListenerFactory$okhttp(okhttp3.EventListener.Factory factory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
            this.eventListenerFactory = factory;
        }

        /* renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        /* renamed from: getFastFallback$okhttp, reason: from getter */
        public final boolean getFastFallback() {
            return this.fastFallback;
        }

        public final void setFastFallback$okhttp(boolean z) {
            this.fastFallback = z;
        }

        /* renamed from: getAuthenticator$okhttp, reason: from getter */
        public final okhttp3.Authenticator getAuthenticator() {
            return this.authenticator;
        }

        public final void setAuthenticator$okhttp(okhttp3.Authenticator authenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "");
            this.authenticator = authenticator;
        }

        /* renamed from: getFollowRedirects$okhttp, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        /* renamed from: getFollowSslRedirects$okhttp, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        /* renamed from: getCookieJar$okhttp, reason: from getter */
        public final okhttp3.CookieJar getCookieJar() {
            return this.cookieJar;
        }

        public final void setCookieJar$okhttp(okhttp3.CookieJar cookieJar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "");
            this.cookieJar = cookieJar;
        }

        /* renamed from: getCache$okhttp, reason: from getter */
        public final okhttp3.Cache getCache() {
            return this.cache;
        }

        public final void setCache$okhttp(okhttp3.Cache cache) {
            this.cache = cache;
        }

        /* renamed from: getDns$okhttp, reason: from getter */
        public final okhttp3.Dns getDns() {
            return this.dns;
        }

        public final void setDns$okhttp(okhttp3.Dns dns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "");
            this.dns = dns;
        }

        /* renamed from: getProxy$okhttp, reason: from getter */
        public final java.net.Proxy getProxy() {
            return this.proxy;
        }

        public final void setProxy$okhttp(java.net.Proxy proxy) {
            this.proxy = proxy;
        }

        /* renamed from: getProxySelector$okhttp, reason: from getter */
        public final java.net.ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        public final void setProxySelector$okhttp(java.net.ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        /* renamed from: getProxyAuthenticator$okhttp, reason: from getter */
        public final okhttp3.Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        public final void setProxyAuthenticator$okhttp(okhttp3.Authenticator authenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "");
            this.proxyAuthenticator = authenticator;
        }

        /* renamed from: getSocketFactory$okhttp, reason: from getter */
        public final javax.net.SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        public final void setSocketFactory$okhttp(javax.net.SocketFactory socketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketFactory, "");
            this.socketFactory = socketFactory;
        }

        /* renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
        public final javax.net.ssl.SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        public final void setSslSocketFactoryOrNull$okhttp(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        /* renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
        public final javax.net.ssl.X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final void setX509TrustManagerOrNull$okhttp(javax.net.ssl.X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final java.util.List<okhttp3.ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final void setConnectionSpecs$okhttp(java.util.List<okhttp3.ConnectionSpec> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.connectionSpecs = list;
        }

        public final java.util.List<okhttp3.Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final void setProtocols$okhttp(java.util.List<? extends okhttp3.Protocol> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.protocols = list;
        }

        /* renamed from: getHostnameVerifier$okhttp, reason: from getter */
        public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final void setHostnameVerifier$okhttp(javax.net.ssl.HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostnameVerifier, "");
            this.hostnameVerifier = hostnameVerifier;
        }

        /* renamed from: getCertificatePinner$okhttp, reason: from getter */
        public final okhttp3.CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        public final void setCertificatePinner$okhttp(okhttp3.CertificatePinner certificatePinner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificatePinner, "");
            this.certificatePinner = certificatePinner;
        }

        /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
        public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        public final void setCertificateChainCleaner$okhttp(okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        /* renamed from: getCallTimeout$okhttp, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        /* renamed from: getConnectTimeout$okhttp, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        /* renamed from: getReadTimeout$okhttp, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        /* renamed from: getWriteTimeout$okhttp, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        /* renamed from: getPingInterval$okhttp, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        /* renamed from: getWebSocketCloseTimeout$okhttp, reason: from getter */
        public final int getWebSocketCloseTimeout() {
            return this.webSocketCloseTimeout;
        }

        public final void setWebSocketCloseTimeout$okhttp(int i) {
            this.webSocketCloseTimeout = i;
        }

        /* renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        /* renamed from: getRouteDatabase$okhttp, reason: from getter */
        public final okhttp3.internal.connection.RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        public final void setRouteDatabase$okhttp(okhttp3.internal.connection.RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        /* renamed from: getTaskRunner$okhttp, reason: from getter */
        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        public final void setTaskRunner$okhttp(okhttp3.internal.concurrent.TaskRunner taskRunner) {
            this.taskRunner = taskRunner;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(okhttp3.OkHttpClient okHttpClient) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            kotlin.collections.CollectionsKt.addAll(this.interceptors, okHttpClient.interceptors());
            kotlin.collections.CollectionsKt.addAll(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.fastFallback = okHttpClient.getFastFallback();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.webSocketCloseTimeout = okHttpClient.getWebSocketCloseTimeout();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
            this.taskRunner = okHttpClient.getTaskRunner();
        }

        public final okhttp3.OkHttpClient.Builder dispatcher(okhttp3.Dispatcher dispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
            this.dispatcher = dispatcher;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectionPool(okhttp3.ConnectionPool connectionPool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "");
            this.connectionPool = connectionPool;
            return this;
        }

        public final java.util.List<okhttp3.Interceptor> interceptors() {
            return this.interceptors;
        }

        public final okhttp3.OkHttpClient.Builder addInterceptor(okhttp3.Interceptor interceptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
            this.interceptors.add(interceptor);
            return this;
        }

        /* renamed from: -addInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24386addInterceptor(final kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            return addInterceptor(new okhttp3.Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
                    return block.invoke(chain);
                }
            });
        }

        public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final okhttp3.OkHttpClient.Builder addNetworkInterceptor(okhttp3.Interceptor interceptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24387addNetworkInterceptor(final kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            return addNetworkInterceptor(new okhttp3.Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
                    return block.invoke(chain);
                }
            });
        }

        public final okhttp3.OkHttpClient.Builder eventListener(okhttp3.EventListener eventListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "");
            this.eventListenerFactory = okhttp3.internal._UtilJvmKt.asFactory(eventListener);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder eventListenerFactory(okhttp3.EventListener.Factory eventListenerFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListenerFactory, "");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder fastFallback(boolean fastFallback) {
            this.fastFallback = fastFallback;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder authenticator(okhttp3.Authenticator authenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "");
            this.authenticator = authenticator;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder cookieJar(okhttp3.CookieJar cookieJar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "");
            this.cookieJar = cookieJar;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder cache(okhttp3.Cache cache) {
            this.cache = cache;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder taskRunner$okhttp(okhttp3.internal.concurrent.TaskRunner taskRunner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
            this.taskRunner = taskRunner;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder dns(okhttp3.Dns dns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder proxy(java.net.Proxy proxy) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder proxySelector(java.net.ProxySelector proxySelector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxySelector, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder proxyAuthenticator(okhttp3.Authenticator proxyAuthenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxyAuthenticator, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder socketFactory(javax.net.SocketFactory socketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketFactory, "");
            if (socketFactory instanceof javax.net.ssl.SSLSocketFactory) {
                throw new java.lang.IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            javax.net.ssl.X509TrustManager trustManager = okhttp3.internal.platform.Platform.INSTANCE.get().trustManager(sslSocketFactory);
            if (trustManager != null) {
                this.x509TrustManagerOrNull = trustManager;
                okhttp3.internal.platform.Platform platform = okhttp3.internal.platform.Platform.INSTANCE.get();
                javax.net.ssl.X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                kotlin.jvm.internal.Intrinsics.checkNotNull(x509TrustManager);
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to extract the trust manager on ");
            sb.append(okhttp3.internal.platform.Platform.INSTANCE.get());
            sb.append(", sslSocketFactory is ");
            sb.append(sslSocketFactory.getClass());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public final okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory sslSocketFactory, javax.net.ssl.X509TrustManager trustManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull) || !kotlin.jvm.internal.Intrinsics.areEqual(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = okhttp3.internal.tls.CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectionSpecs(java.util.List<okhttp3.ConnectionSpec> connectionSpecs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpecs, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = okhttp3.internal._UtilJvmKt.toImmutableList(connectionSpecs);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder protocols(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) protocols);
            if (!mutableList.contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE) && !mutableList.contains(okhttp3.Protocol.HTTP_1_1)) {
                throw new java.lang.IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(java.lang.String.valueOf(mutableList)).toString());
            }
            if (mutableList.contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE) && mutableList.size() > 1) {
                throw new java.lang.IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: ".concat(java.lang.String.valueOf(mutableList)).toString());
            }
            if (mutableList.contains(okhttp3.Protocol.HTTP_1_0)) {
                throw new java.lang.IllegalArgumentException("protocols must not contain http/1.0: ".concat(java.lang.String.valueOf(mutableList)).toString());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableList, "");
            if (mutableList.contains(null)) {
                throw new java.lang.IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(okhttp3.Protocol.SPDY_3);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableList, this.protocols)) {
                this.routeDatabase = null;
            }
            java.util.List<? extends okhttp3.Protocol> unmodifiableList = java.util.Collections.unmodifiableList(mutableList);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "");
            this.protocols = unmodifiableList;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder hostnameVerifier(javax.net.ssl.HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostnameVerifier, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder certificatePinner(okhttp3.CertificatePinner certificatePinner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificatePinner, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder callTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.callTimeout = okhttp3.internal._UtilJvmKt.checkDuration(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder callTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            callTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: callTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24388callTimeoutLRDsOJo(long duration) {
            this.callTimeout = okhttp3.internal._UtilJvmKt.m24417checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.connectTimeout = okhttp3.internal._UtilJvmKt.checkDuration(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            connectTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: connectTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24389connectTimeoutLRDsOJo(long duration) {
            this.connectTimeout = okhttp3.internal._UtilJvmKt.m24417checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder readTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.readTimeout = okhttp3.internal._UtilJvmKt.checkDuration(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder readTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            readTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: readTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24391readTimeoutLRDsOJo(long duration) {
            this.readTimeout = okhttp3.internal._UtilJvmKt.m24417checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder writeTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.writeTimeout = okhttp3.internal._UtilJvmKt.checkDuration(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder writeTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            writeTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: writeTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24393writeTimeoutLRDsOJo(long duration) {
            this.writeTimeout = okhttp3.internal._UtilJvmKt.m24417checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder pingInterval(long interval, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.pingInterval = okhttp3.internal._UtilJvmKt.checkDuration("interval", interval, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder pingInterval(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            pingInterval(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: pingInterval-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24390pingIntervalLRDsOJo(long duration) {
            this.pingInterval = okhttp3.internal._UtilJvmKt.m24417checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder webSocketCloseTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.webSocketCloseTimeout = okhttp3.internal._UtilJvmKt.checkDuration("webSocketCloseTimeout", timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder webSocketCloseTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            webSocketCloseTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: webSocketCloseTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m24392webSocketCloseTimeoutLRDsOJo(long duration) {
            this.webSocketCloseTimeout = okhttp3.internal._UtilJvmKt.m24417checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder minWebSocketMessageToCompress(long bytes) {
            if (bytes < 0) {
                throw new java.lang.IllegalArgumentException("minWebSocketMessageToCompress must be positive: ".concat(java.lang.String.valueOf(bytes)).toString());
            }
            this.minWebSocketMessageToCompress = bytes;
            return this;
        }

        public final okhttp3.OkHttpClient build() {
            return new okhttp3.OkHttpClient(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "getDEFAULT_PROTOCOLS$okhttp", "()Ljava/util/List;", "Lokhttp3/ConnectionSpec;", "DEFAULT_CONNECTION_SPECS", "getDEFAULT_CONNECTION_SPECS$okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<okhttp3.Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return okhttp3.OkHttpClient.DEFAULT_PROTOCOLS;
        }

        public final java.util.List<okhttp3.ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
