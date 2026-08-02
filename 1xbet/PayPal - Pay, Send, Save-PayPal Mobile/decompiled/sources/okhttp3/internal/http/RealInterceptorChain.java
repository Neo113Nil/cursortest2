package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0003\u0010 J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010!R\u001a\u0010\r\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b4\u0010\u0017R\u0016\u00106\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010,"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "Lokhttp3/Interceptor;", "interceptors", "", "index", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "copy$okhttp", "(ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Connection;", "connection", "()Lokhttp3/Connection;", "()I", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "withReadTimeout", "withWriteTimeout", "Lokhttp3/Call;", "()Lokhttp3/Call;", "()Lokhttp3/Request;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "Lokhttp3/Request;", "getRequest$okhttp", "getConnectTimeoutMillis$okhttp", "getReadTimeoutMillis$okhttp", "getWriteTimeoutMillis$okhttp", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealInterceptorChain implements okhttp3.Interceptor.Chain {
    private final okhttp3.internal.connection.RealCall call;
    private final int connectTimeoutMillis;
    private final okhttp3.internal.connection.Exchange exchange;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<okhttp3.Interceptor> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;
    private final int readTimeoutMillis;
    private final okhttp3.Request request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(okhttp3.internal.connection.RealCall realCall, java.util.List<? extends okhttp3.Interceptor> list, int i, okhttp3.internal.connection.Exchange exchange, okhttp3.Request request, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.call = realCall;
        this.getHighSpeedVideoSizes = list;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
    }

    /* renamed from: getCall$okhttp, reason: from getter */
    public final okhttp3.internal.connection.RealCall getCall() {
        return this.call;
    }

    /* renamed from: getExchange$okhttp, reason: from getter */
    public final okhttp3.internal.connection.Exchange getExchange() {
        return this.exchange;
    }

    /* renamed from: getRequest$okhttp, reason: from getter */
    public final okhttp3.Request getRequest() {
        return this.request;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: getReadTimeoutMillis$okhttp, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: getWriteTimeoutMillis$okhttp, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public static /* synthetic */ okhttp3.internal.http.RealInterceptorChain copy$okhttp$default(okhttp3.internal.http.RealInterceptorChain realInterceptorChain, int i, okhttp3.internal.connection.Exchange exchange, okhttp3.Request request, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = realInterceptorChain.getHighResolutionOutputSizeshNQ4ISI;
        }
        if ((i5 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        okhttp3.internal.connection.Exchange exchange2 = exchange;
        if ((i5 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        okhttp3.Request request2 = request;
        if ((i5 & 8) != 0) {
            i2 = realInterceptorChain.connectTimeoutMillis;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = realInterceptorChain.readTimeoutMillis;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(i, exchange2, request2, i6, i7, i4);
    }

    public final okhttp3.internal.http.RealInterceptorChain copy$okhttp(int index, okhttp3.internal.connection.Exchange exchange, okhttp3.Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return new okhttp3.internal.http.RealInterceptorChain(this.call, this.getHighSpeedVideoSizes, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @Override // okhttp3.Interceptor.Chain
    public final okhttp3.Connection connection() {
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        return exchange != null ? exchange.getConnection$okhttp() : null;
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: connectTimeoutMillis, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public final okhttp3.Interceptor.Chain withConnectTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (this.exchange != null) {
            throw new java.lang.IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        return copy$okhttp$default(this, 0, null, null, okhttp3.internal._UtilJvmKt.checkDuration("connectTimeout", timeout, unit), 0, 0, 55, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public final okhttp3.Interceptor.Chain withReadTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (this.exchange != null) {
            throw new java.lang.IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        return copy$okhttp$default(this, 0, null, null, 0, okhttp3.internal._UtilJvmKt.checkDuration("readTimeout", timeout, unit), 0, 47, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public final okhttp3.Interceptor.Chain withWriteTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (this.exchange != null) {
            throw new java.lang.IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        return copy$okhttp$default(this, 0, null, null, 0, 0, okhttp3.internal._UtilJvmKt.checkDuration("writeTimeout", timeout, unit), 31, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public final okhttp3.Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public final okhttp3.Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    public final okhttp3.Response proceed(okhttp3.Request request) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI >= this.getHighSpeedVideoSizes.size()) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.Camera2StreamConfigurationMap++;
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder().getRoutePlanner().sameHostAndPort(request.url())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("network interceptor ");
                sb.append(this.getHighSpeedVideoSizes.get(this.getHighResolutionOutputSizeshNQ4ISI - 1));
                sb.append(" must retain the same host and port");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (this.Camera2StreamConfigurationMap != 1) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("network interceptor ");
                sb2.append(this.getHighSpeedVideoSizes.get(this.getHighResolutionOutputSizeshNQ4ISI - 1));
                sb2.append(" must call proceed() exactly once");
                throw new java.lang.IllegalStateException(sb2.toString().toString());
            }
        }
        okhttp3.internal.http.RealInterceptorChain copy$okhttp$default = copy$okhttp$default(this, this.getHighResolutionOutputSizeshNQ4ISI + 1, null, request, 0, 0, 0, 58, null);
        okhttp3.Interceptor interceptor = this.getHighSpeedVideoSizes.get(this.getHighResolutionOutputSizeshNQ4ISI);
        okhttp3.Response intercept = interceptor.intercept(copy$okhttp$default);
        if (intercept == null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("interceptor ");
            sb3.append(interceptor);
            sb3.append(" returned null");
            throw new java.lang.NullPointerException(sb3.toString());
        }
        if (this.exchange == null || this.getHighResolutionOutputSizeshNQ4ISI + 1 >= this.getHighSpeedVideoSizes.size() || copy$okhttp$default.Camera2StreamConfigurationMap == 1) {
            return intercept;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("network interceptor ");
        sb4.append(interceptor);
        sb4.append(" must call proceed() exactly once");
        throw new java.lang.IllegalStateException(sb4.toString().toString());
    }
}
