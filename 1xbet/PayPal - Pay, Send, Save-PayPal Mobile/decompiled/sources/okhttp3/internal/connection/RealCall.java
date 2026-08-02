package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0082\u0001\u0083\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u0019J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010#J\u000f\u0010,\u001a\u00020$H\u0000¢\u0006\u0004\b,\u0010&J%\u00100\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u001f2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108JK\u0010@\u001a\u0004\u0018\u00010>2\u0006\u00109\u001a\u0002022\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010>H\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>H\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010E\u001a\u0004\u0018\u00010>2\b\u0010D\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bE\u0010CJ\u0011\u0010G\u001a\u0004\u0018\u00010FH\u0000¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u001f¢\u0006\u0004\bI\u0010!J\r\u0010J\u001a\u00020\u001f¢\u0006\u0004\bJ\u0010!J\u0017\u0010L\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020\bH\u0000¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\b¢\u0006\u0004\bN\u0010#J\u000f\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bV\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\bX\u0010#R\u0014\u0010Z\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020\\8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010\r\u001a\u00020a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010jR(\u00106\u001a\u0004\u0018\u0001052\b\u0010D\u001a\u0004\u0018\u0001058\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b6\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010I\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010WR(\u0010n\u001a\u0004\u0018\u0001022\b\u0010D\u001a\u0004\u0018\u0001028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010WR\u0016\u0010s\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bs\u0010WR\u0016\u0010t\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010WR\u0016\u0010u\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bu\u0010WR\u0016\u0010v\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bv\u0010WR\u0016\u0010w\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bw\u0010WR\u0018\u00109\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010oR \u0010z\u001a\b\u0012\u0004\u0012\u00020y0x8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0080\u0001\u001a\f\u0012\b\u0012\u0006*\u00020\u007f0\u007f0~8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "T", "Lkotlin/reflect/KClass;", "type", "tag", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function0;", "computeIfAbsent", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "clone", "()Lokhttp3/Call;", "request", "()Lokhttp3/Request;", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "isCanceled", "()Z", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "isExecuted", "getResponseWithInterceptorChain$okhttp", "newRoutePlanner", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "enterNetworkInterceptorExchange", "(Lokhttp3/Request;ZLokhttp3/internal/http/RealInterceptorChain;)V", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "Lokhttp3/internal/connection/RealConnection;", "connection", "acquireConnectionNoEvents", "(Lokhttp3/internal/connection/RealConnection;)V", "exchange", "requestDone", "responseDone", "socketSourceDone", "socketSinkDone", "Ljava/io/IOException;", "e", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZZZLjava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges$okhttp", "(Ljava/io/IOException;)Ljava/io/IOException;", "p0", "getHighSpeedVideoFpsRangesFor", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "timeoutEarlyExit", "upgradeToSocket", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "retryAfterFailure", "", "redactedUrl$okhttp", "()Ljava/lang/String;", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Request;", "getOriginalRequest", "Z", "getForWebSocket", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "callStackTrace", "Ljava/lang/Object;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "interceptorScopedExchange", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "requestBodyOpen", "responseBodyOpen", "socketSinkOpen", "socketSourceOpen", "expectMoreExchanges", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED, "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plansToCancel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlansToCancel$okhttp", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "tags", "Ljava/util/concurrent/atomic/AtomicReference;", "AsyncCall", "CallReference"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealCall implements okhttp3.Call, java.lang.Cloneable, okhttp3.internal.concurrent.Lockable {
    private java.lang.Object callStackTrace;
    private volatile boolean canceled;
    private final okhttp3.OkHttpClient client;
    private okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private final okhttp3.EventListener eventListener;
    private volatile okhttp3.internal.connection.Exchange exchange;
    private okhttp3.internal.connection.ExchangeFinder exchangeFinder;
    private final java.util.concurrent.atomic.AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private okhttp3.internal.connection.Exchange interceptorScopedExchange;
    private final okhttp3.Request originalRequest;
    private final java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner.Plan> plansToCancel;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private boolean socketSinkOpen;
    private boolean socketSourceOpen;
    private final java.util.concurrent.atomic.AtomicReference<okhttp3.internal.Tags> tags;
    private final okhttp3.internal.connection.RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    /* JADX WARN: Type inference failed for: r5v5, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
    public RealCall(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r5 = new okio.AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // okio.AsyncTimeout
            public final void timedOut() {
                okhttp3.internal.connection.RealCall.this.cancel();
            }
        };
        r5.timeout(okHttpClient.callTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        this.timeout = r5;
        this.executed = new java.util.concurrent.atomic.AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.tags = new java.util.concurrent.atomic.AtomicReference<>(request.getTags());
    }

    public final okhttp3.OkHttpClient getClient() {
        return this.client;
    }

    public final okhttp3.Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* renamed from: getEventListener$okhttp, reason: from getter */
    public final okhttp3.EventListener getEventListener() {
        return this.eventListener;
    }

    public final okhttp3.internal.connection.RealConnection getConnection() {
        return this.connection;
    }

    /* renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final okhttp3.internal.connection.Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner.Plan> getPlansToCancel$okhttp() {
        return this.plansToCancel;
    }

    @Override // okhttp3.Call
    public final okio.Timeout timeout() {
        return this.timeout;
    }

    @Override // okhttp3.Call
    public final <T> T tag(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return (T) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) type).cast(this.tags.get().get(type));
    }

    @Override // okhttp3.Call
    public final <T> T tag(java.lang.Class<? extends T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return (T) tag(kotlin.jvm.JvmClassMappingKt.getKotlinClass(type));
    }

    @Override // okhttp3.Call
    public final <T> T tag(kotlin.reflect.KClass<T> type, kotlin.jvm.functions.Function0<? extends T> computeIfAbsent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(computeIfAbsent, "");
        return (T) okhttp3.internal.TagsKt.computeIfAbsent(this.tags, type, computeIfAbsent);
    }

    @Override // okhttp3.Call
    public final <T> T tag(java.lang.Class<T> type, kotlin.jvm.functions.Function0<? extends T> computeIfAbsent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(computeIfAbsent, "");
        return (T) okhttp3.internal.TagsKt.computeIfAbsent(this.tags, kotlin.jvm.JvmClassMappingKt.getKotlinClass(type), computeIfAbsent);
    }

    @Override // okhttp3.Call
    public final okhttp3.Call clone() {
        return new okhttp3.internal.connection.RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    /* renamed from: request */
    public final okhttp3.Request getGetHighSpeedVideoSizes() {
        return this.originalRequest;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        java.util.Iterator<okhttp3.internal.connection.RoutePlanner.Plan> it = this.plansToCancel.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            it.next().mo24418cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    /* renamed from: isCanceled, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public final okhttp3.Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed".toString());
        }
        enter();
        this.callStackTrace = okhttp3.internal.platform.Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    @Override // okhttp3.Call
    public final void enqueue(okhttp3.Callback responseCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCallback, "");
        if (!this.executed.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed".toString());
        }
        this.callStackTrace = okhttp3.internal.platform.Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue$okhttp(new okhttp3.internal.connection.RealCall.AsyncCall(this, responseCallback));
    }

    @Override // okhttp3.Call
    public final boolean isExecuted() {
        return this.executed.get();
    }

    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.addAll(arrayList2, this.client.interceptors());
        arrayList2.add(new okhttp3.internal.http.RetryAndFollowUpInterceptor(this.client));
        arrayList2.add(new okhttp3.internal.http.BridgeInterceptor(this.client.cookieJar()));
        arrayList2.add(new okhttp3.internal.cache.CacheInterceptor(this.client.cache()));
        arrayList2.add(okhttp3.internal.connection.ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, this.client.networkInterceptors());
        }
        arrayList2.add(okhttp3.internal.http.CallServerInterceptor.INSTANCE);
        try {
            try {
                okhttp3.Response proceed = new okhttp3.internal.http.RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (getCanceled()) {
                    okhttp3.internal._UtilCommonKt.closeQuietly(proceed);
                    throw new java.io.IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return proceed;
            } catch (java.io.IOException e) {
                java.io.IOException noMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                kotlin.jvm.internal.Intrinsics.checkNotNull(noMoreExchanges$okhttp, "");
                throw noMoreExchanges$okhttp;
            }
        } catch (java.lang.Throwable th) {
            if (0 == 0) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    public final void enterNetworkInterceptorExchange(okhttp3.Request request, boolean newRoutePlanner, okhttp3.internal.http.RealInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        if (this.interceptorScopedExchange != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new java.lang.IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (newRoutePlanner) {
            okhttp3.internal.connection.RealRoutePlanner realRoutePlanner = new okhttp3.internal.connection.RealRoutePlanner(this.client.getTaskRunner(), this.connectionPool, this.client.readTimeoutMillis(), this.client.writeTimeoutMillis(), chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), this.client.pingIntervalMillis(), this.client.retryOnConnectionFailure(), this.client.getFastFallback(), this.client.address(request.url()), this.client.getRouteDatabase(), this, request);
            this.exchangeFinder = this.client.getFastFallback() ? new okhttp3.internal.connection.FastFallbackExchangeFinder(realRoutePlanner, this.client.getTaskRunner()) : new okhttp3.internal.connection.SequentialExchangeFinder(realRoutePlanner);
        }
    }

    public final okhttp3.internal.connection.Exchange initExchange$okhttp(okhttp3.internal.http.RealInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.internal.connection.RealCall realCall = this;
        synchronized (realCall) {
            if (!this.expectMoreExchanges) {
                throw new java.lang.IllegalStateException("released".toString());
            }
            if (this.responseBodyOpen || this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        okhttp3.internal.connection.ExchangeFinder exchangeFinder = this.exchangeFinder;
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchangeFinder);
        okhttp3.internal.connection.Exchange exchange = new okhttp3.internal.connection.Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find().newCodec$okhttp(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (realCall) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        if (this.canceled) {
            throw new java.io.IOException("Canceled");
        }
        return exchange;
    }

    public final void acquireConnectionNoEvents(okhttp3.internal.connection.RealConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        okhttp3.internal.connection.RealConnection realConnection = connection;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realConnection)) {
            if (this.connection != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.getCalls().add(new okhttp3.internal.connection.RealCall.CallReference(this, this.callStackTrace));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnection);
        throw new java.lang.AssertionError(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:55:0x0014, B:11:0x0030, B:13:0x0034, B:15:0x0038, B:17:0x003c, B:18:0x003e, B:20:0x0043, B:22:0x0047, B:24:0x004b, B:28:0x0054, B:32:0x005e, B:8:0x001e, B:48:0x0024, B:51:0x002a), top: B:54:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:55:0x0014, B:11:0x0030, B:13:0x0034, B:15:0x0038, B:17:0x003c, B:18:0x003e, B:20:0x0043, B:22:0x0047, B:24:0x004b, B:28:0x0054, B:32:0x005e, B:8:0x001e, B:48:0x0024, B:51:0x002a), top: B:54:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:55:0x0014, B:11:0x0030, B:13:0x0034, B:15:0x0038, B:17:0x003c, B:18:0x003e, B:20:0x0043, B:22:0x0047, B:24:0x004b, B:28:0x0054, B:32:0x005e, B:8:0x001e, B:48:0x0024, B:51:0x002a), top: B:54:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:55:0x0014, B:11:0x0030, B:13:0x0034, B:15:0x0038, B:17:0x003c, B:18:0x003e, B:20:0x0043, B:22:0x0047, B:24:0x004b, B:28:0x0054, B:32:0x005e, B:8:0x001e, B:48:0x0024, B:51:0x002a), top: B:54:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.IOException messageDone$okhttp(okhttp3.internal.connection.Exchange exchange, boolean requestDone, boolean responseDone, boolean socketSourceDone, boolean socketSinkDone, java.io.IOException e) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchange, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(exchange, this.exchange)) {
            synchronized (this) {
                z = false;
                if (requestDone) {
                    try {
                        if (!this.requestBodyOpen) {
                        }
                        if (requestDone) {
                            this.requestBodyOpen = false;
                        }
                        if (responseDone) {
                            this.responseBodyOpen = false;
                        }
                        if (socketSinkDone) {
                            this.socketSinkOpen = false;
                        }
                        if (socketSourceDone) {
                            this.socketSourceOpen = false;
                        }
                        z3 = (!this.requestBodyOpen || this.responseBodyOpen || this.socketSinkOpen || this.socketSourceOpen) ? false : true;
                        if (z3 && !this.expectMoreExchanges) {
                            z = true;
                        }
                        boolean z4 = z;
                        z = z3;
                        z2 = z4;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if ((!responseDone || !this.responseBodyOpen) && ((!socketSinkDone || !this.socketSinkOpen) && (!socketSourceDone || !this.socketSourceOpen))) {
                    z2 = false;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                if (requestDone) {
                }
                if (responseDone) {
                }
                if (socketSinkDone) {
                }
                if (socketSourceDone) {
                }
                if (!this.requestBodyOpen) {
                }
                if (z3) {
                    z = true;
                }
                boolean z42 = z;
                z = z3;
                z2 = z42;
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            }
            if (z) {
                this.exchange = null;
                okhttp3.internal.connection.RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    realConnection.incrementSuccessCount$okhttp();
                }
            }
            if (z2) {
                return getHighSpeedVideoFpsRangesFor(e);
            }
        }
        return e;
    }

    public final java.io.IOException noMoreExchanges$okhttp(java.io.IOException e) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen && !this.socketSinkOpen && !this.socketSourceOpen) {
                    z = true;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return z ? getHighSpeedVideoFpsRangesFor(e) : e;
    }

    private final java.io.IOException getHighSpeedVideoFpsRangesFor(java.io.IOException p0) {
        java.io.InterruptedIOException interruptedIOException;
        java.net.Socket releaseConnectionNoEvents$okhttp;
        okhttp3.internal.connection.RealCall realCall = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(realCall)) {
            okhttp3.internal.connection.RealConnection realConnection = this.connection;
            if (realConnection != null) {
                okhttp3.internal.connection.RealConnection realConnection2 = realConnection;
                if (okhttp3.internal._UtilJvmKt.assertionsEnabled && java.lang.Thread.holdsLock(realConnection2)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
                    sb.append(java.lang.Thread.currentThread().getName());
                    sb.append(" MUST NOT hold lock on ");
                    sb.append(realConnection2);
                    throw new java.lang.AssertionError(sb.toString());
                }
                synchronized (realConnection2) {
                    releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
                }
                if (this.connection == null) {
                    if (releaseConnectionNoEvents$okhttp != null) {
                        okhttp3.internal._UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                    }
                    okhttp3.internal.connection.RealCall realCall2 = this;
                    okhttp3.internal.connection.RealConnection realConnection3 = realConnection;
                    this.eventListener.connectionReleased(realCall2, realConnection3);
                    realConnection.getConnectionListener().connectionReleased(realConnection3, realCall2);
                    if (releaseConnectionNoEvents$okhttp != null) {
                        realConnection.getConnectionListener().connectionClosed(realConnection3);
                    }
                } else if (releaseConnectionNoEvents$okhttp != null) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
            }
            if (this.timeoutEarlyExit || !exit()) {
                interruptedIOException = p0;
            } else {
                java.io.InterruptedIOException interruptedIOException2 = new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
                if (p0 != null) {
                    interruptedIOException2.initCause(p0);
                }
                interruptedIOException = interruptedIOException2;
            }
            if (p0 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(interruptedIOException);
                this.eventListener.callFailed(this, interruptedIOException);
                return interruptedIOException;
            }
            this.eventListener.callEnd(this);
            return interruptedIOException;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Thread ");
        sb2.append(java.lang.Thread.currentThread().getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(realCall);
        throw new java.lang.AssertionError(sb2.toString());
    }

    public final java.net.Socket releaseConnectionNoEvents$okhttp() {
        okhttp3.internal.connection.RealConnection realConnection = this.connection;
        kotlin.jvm.internal.Intrinsics.checkNotNull(realConnection);
        okhttp3.internal.connection.RealConnection realConnection2 = realConnection;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realConnection2)) {
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls = realConnection.getCalls();
            java.util.Iterator<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> it = calls.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().get(), this)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            calls.remove(i);
            this.connection = null;
            if (calls.isEmpty()) {
                realConnection.setIdleAtNs(java.lang.System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.getJavaNetSocket();
                }
            }
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnection2);
        throw new java.lang.AssertionError(sb.toString());
    }

    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        exit();
    }

    public final void upgradeToSocket() {
        timeoutEarlyExit();
        synchronized (this) {
            if (this.exchange == null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (this.socketSinkOpen || this.socketSourceOpen) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (!this.responseBodyOpen) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            this.responseBodyOpen = false;
            this.socketSinkOpen = true;
            this.socketSourceOpen = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        okhttp3.internal.connection.Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new java.lang.IllegalStateException("released".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (closeExchange && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final boolean retryAfterFailure() {
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        if (exchange == null || !exchange.getHasFailure()) {
            return false;
        }
        okhttp3.internal.connection.ExchangeFinder exchangeFinder = this.exchangeFinder;
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchangeFinder);
        okhttp3.internal.connection.RoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
        okhttp3.internal.connection.Exchange exchange2 = this.exchange;
        return routePlanner.hasNext(exchange2 != null ? exchange2.getConnection$okhttp() : null);
    }

    public final java.lang.String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R$\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010#\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "Lokhttp3/internal/connection/RealCall;", "other", "", "reuseCallsPerHostFrom", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "(Ljava/util/concurrent/ExecutorService;)V", "Ljava/util/concurrent/RejectedExecutionException;", "e", "failRejected$okhttp", "(Ljava/util/concurrent/RejectedExecutionException;)V", "run", "()V", "Lokhttp3/Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "p0", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "", "getHost", "()Ljava/lang/String;", com.datadog.android.log.LogAttributes.HOST, "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class AsyncCall implements java.lang.Runnable {
        private volatile java.util.concurrent.atomic.AtomicInteger callsPerHost;
        private final okhttp3.Callback responseCallback;
        final /* synthetic */ okhttp3.internal.connection.RealCall this$0;

        public AsyncCall(okhttp3.internal.connection.RealCall realCall, okhttp3.Callback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new java.util.concurrent.atomic.AtomicInteger(0);
        }

        public final java.util.concurrent.atomic.AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final void reuseCallsPerHostFrom(okhttp3.internal.connection.RealCall.AsyncCall other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
            this.callsPerHost = other.callsPerHost;
        }

        public final java.lang.String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final okhttp3.Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        /* renamed from: getCall, reason: from getter */
        public final okhttp3.internal.connection.RealCall getThis$0() {
            return this.this$0;
        }

        public final void executeOn(java.util.concurrent.ExecutorService executorService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
            okhttp3.internal._UtilJvmKt.assertLockNotHeld(this.this$0.getClient().dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    failRejected$okhttp(e);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (java.lang.Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public static /* synthetic */ void failRejected$okhttp$default(okhttp3.internal.connection.RealCall.AsyncCall asyncCall, java.util.concurrent.RejectedExecutionException rejectedExecutionException, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rejectedExecutionException = null;
            }
            asyncCall.failRejected$okhttp(rejectedExecutionException);
        }

        public final void failRejected$okhttp(java.util.concurrent.RejectedExecutionException e) {
            java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("executor rejected");
            interruptedIOException.initCause(e);
            java.io.InterruptedIOException interruptedIOException2 = interruptedIOException;
            this.this$0.noMoreExchanges$okhttp(interruptedIOException2);
            this.responseCallback.onFailure(this.this$0, interruptedIOException2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OkHttp ");
            sb.append(this.this$0.redactedUrl$okhttp());
            java.lang.String obj = sb.toString();
            okhttp3.internal.connection.RealCall realCall = this.this$0;
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            java.lang.String name2 = currentThread.getName();
            currentThread.setName(obj);
            try {
                realCall.timeout.enter();
                boolean z = false;
                try {
                    try {
                    } catch (java.lang.Throwable th) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    e = e;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
                try {
                    this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                } catch (java.io.IOException e2) {
                    e = e2;
                    z = true;
                    if (z) {
                        okhttp3.internal.platform.Platform platform = okhttp3.internal.platform.Platform.INSTANCE.get();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Callback failure for ");
                        sb2.append(okhttp3.internal.connection.RealCall.access$toLoggableString(realCall));
                        platform.log(sb2.toString(), 4, e);
                    } else {
                        this.responseCallback.onFailure(realCall, e);
                    }
                    realCall.getClient().dispatcher().finished$okhttp(this);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    z = true;
                    realCall.cancel();
                    if (!z) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("canceled due to ");
                        sb3.append(th);
                        java.io.IOException iOException = new java.io.IOException(sb3.toString());
                        iOException.initCause(th);
                        this.responseCallback.onFailure(realCall, iOException);
                    }
                    if (th instanceof java.lang.InterruptedException) {
                        java.lang.Thread.currentThread().interrupt();
                        realCall.getClient().dispatcher().finished$okhttp(this);
                    }
                    throw th;
                }
                realCall.getClient().dispatcher().finished$okhttp(this);
            } finally {
                currentThread.setName(name2);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "", "callStackTrace", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getCallStackTrace", "()Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class CallReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.RealCall> {
        private final java.lang.Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(okhttp3.internal.connection.RealCall realCall, java.lang.Object obj) {
            super(realCall);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realCall, "");
            this.callStackTrace = obj;
        }

        public final java.lang.Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    public static final /* synthetic */ java.lang.String access$toLoggableString(okhttp3.internal.connection.RealCall realCall) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(realCall.getCanceled() ? "canceled " : "");
        sb.append(realCall.forWebSocket ? "web socket" : androidx.core.app.NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(realCall.redactedUrl$okhttp());
        return sb.toString();
    }
}
