package okhttp3.logging;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\nJ!\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J1\u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J9\u00101\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\nJ\u001f\u0010;\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\nJ\u001f\u0010@\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010\nJ\u001f\u0010G\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010\nJ\u001f\u0010J\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bJ\u0010AJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bK\u0010CJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\nJ\u001f\u0010M\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bM\u0010CJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\nJ\u001f\u0010O\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bO\u0010HJ\u001f\u0010P\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bP\u0010HJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\nJ\u001f\u0010S\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010R\u001a\u00020EH\u0016¢\u0006\u0004\bS\u0010HJ\u0017\u0010T\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0019H\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010T\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "p0", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "callStart", "(Lokhttp3/Call;)V", "Lokhttp3/Dispatcher;", "dispatcher", "dispatcherQueueStart", "(Lokhttp3/Call;Lokhttp3/Dispatcher;)V", "dispatcherQueueEnd", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED, "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "getHighSpeedVideoSizes", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "getHighSpeedVideoFpsRanges", "J", "Companion", "Factory"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggingEventListener extends okhttp3.EventListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okhttp3.logging.HttpLoggingInterceptor.Logger getHighSpeedVideoSizes;
    private long getHighSpeedVideoFpsRanges;

    private LoggingEventListener(okhttp3.logging.HttpLoggingInterceptor.Logger logger) {
        this.getHighSpeedVideoSizes = logger;
    }

    @Override // okhttp3.EventListener
    public final void callStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        this.getHighSpeedVideoFpsRanges = java.lang.System.nanoTime();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("callStart: ");
        sb.append(call.getGetHighSpeedVideoSizes());
        getHighSpeedVideoSizes(sb.toString());
    }

    @Override // okhttp3.EventListener
    public final void dispatcherQueueStart(okhttp3.Call call, okhttp3.Dispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("dispatcherQueueStart: ");
        sb.append(call);
        sb.append(" queuedCallsCount=");
        sb.append(dispatcher.queuedCallsCount());
        getHighSpeedVideoSizes(sb.toString());
    }

    @Override // okhttp3.EventListener
    public final void dispatcherQueueEnd(okhttp3.Call call, okhttp3.Dispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("dispatcherQueueEnd: ");
        sb.append(call);
        sb.append(" queuedCallsCount=");
        sb.append(dispatcher.queuedCallsCount());
        getHighSpeedVideoSizes(sb.toString());
    }

    @Override // okhttp3.EventListener
    public final void proxySelectStart(okhttp3.Call call, okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        getHighSpeedVideoSizes("proxySelectStart: ".concat(java.lang.String.valueOf(url)));
    }

    @Override // okhttp3.EventListener
    public final void proxySelectEnd(okhttp3.Call call, okhttp3.HttpUrl url, java.util.List<? extends java.net.Proxy> proxies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxies, "");
        getHighSpeedVideoSizes("proxySelectEnd: ".concat(java.lang.String.valueOf(proxies)));
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(okhttp3.Call call, java.lang.String domainName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "");
        getHighSpeedVideoSizes("dnsStart: ".concat(java.lang.String.valueOf(domainName)));
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(okhttp3.Call call, java.lang.String domainName, java.util.List<? extends java.net.InetAddress> inetAddressList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetAddressList, "");
        getHighSpeedVideoSizes("dnsEnd: ".concat(java.lang.String.valueOf(inetAddressList)));
    }

    @Override // okhttp3.EventListener
    public final void connectStart(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("connectStart: ");
        sb.append(inetSocketAddress);
        sb.append(' ');
        sb.append(proxy);
        getHighSpeedVideoSizes(sb.toString());
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("secureConnectStart");
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(okhttp3.Call call, okhttp3.Handshake handshake) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("secureConnectEnd: ".concat(java.lang.String.valueOf(handshake)));
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy, okhttp3.Protocol protocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
        getHighSpeedVideoSizes("connectEnd: ".concat(java.lang.String.valueOf(protocol)));
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy, okhttp3.Protocol protocol, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("connectFailed: ");
        sb.append(protocol);
        sb.append(' ');
        sb.append(ioe);
        getHighSpeedVideoSizes(sb.toString());
    }

    @Override // okhttp3.EventListener
    public final void connectionAcquired(okhttp3.Call call, okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        getHighSpeedVideoSizes("connectionAcquired: ".concat(java.lang.String.valueOf(connection)));
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(okhttp3.Call call, okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        getHighSpeedVideoSizes("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersEnd(okhttp3.Call call, okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        getHighSpeedVideoSizes("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void requestBodyStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void requestBodyEnd(okhttp3.Call call, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("requestBodyEnd: byteCount=".concat(java.lang.String.valueOf(byteCount)));
    }

    @Override // okhttp3.EventListener
    public final void requestFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
        getHighSpeedVideoSizes("requestFailed: ".concat(java.lang.String.valueOf(ioe)));
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        getHighSpeedVideoSizes("responseHeadersEnd: ".concat(java.lang.String.valueOf(response)));
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(okhttp3.Call call, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("responseBodyEnd: byteCount=".concat(java.lang.String.valueOf(byteCount)));
    }

    @Override // okhttp3.EventListener
    public final void responseFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
        getHighSpeedVideoSizes("responseFailed: ".concat(java.lang.String.valueOf(ioe)));
    }

    @Override // okhttp3.EventListener
    public final void callEnd(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void callFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
        getHighSpeedVideoSizes("callFailed: ".concat(java.lang.String.valueOf(ioe)));
    }

    @Override // okhttp3.EventListener
    public final void canceled(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
    }

    @Override // okhttp3.EventListener
    public final void satisfactionFailure(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        getHighSpeedVideoSizes("satisfactionFailure: ".concat(java.lang.String.valueOf(response)));
    }

    @Override // okhttp3.EventListener
    public final void cacheHit(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        getHighSpeedVideoSizes("cacheHit: ".concat(java.lang.String.valueOf(response)));
    }

    @Override // okhttp3.EventListener
    public final void cacheMiss(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        getHighSpeedVideoSizes("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public final void cacheConditionalHit(okhttp3.Call call, okhttp3.Response cachedResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedResponse, "");
        getHighSpeedVideoSizes("cacheConditionalHit: ".concat(java.lang.String.valueOf(cachedResponse)));
    }

    private final void getHighSpeedVideoSizes(java.lang.String p0) {
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this.getHighSpeedVideoFpsRanges);
        okhttp3.logging.HttpLoggingInterceptor.Logger logger = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(millis);
        sb.append(" ms] ");
        sb.append(p0);
        logger.log(sb.toString());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "create", "(Lokhttp3/Call;)Lokhttp3/EventListener;", "Camera2StreamConfigurationMap", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Factory implements okhttp3.EventListener.Factory {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final okhttp3.logging.HttpLoggingInterceptor.Logger getHighSpeedVideoFpsRanges;

        public Factory(okhttp3.logging.HttpLoggingInterceptor.Logger logger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
            this.getHighSpeedVideoFpsRanges = logger;
        }

        public /* synthetic */ Factory(okhttp3.logging.HttpLoggingInterceptor.Logger logger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }

        @Override // okhttp3.EventListener.Factory
        public okhttp3.EventListener create(okhttp3.Call call) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
            return new okhttp3.logging.LoggingEventListener(this.getHighSpeedVideoFpsRanges, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ LoggingEventListener(okhttp3.logging.HttpLoggingInterceptor.Logger logger, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(logger);
    }
}
