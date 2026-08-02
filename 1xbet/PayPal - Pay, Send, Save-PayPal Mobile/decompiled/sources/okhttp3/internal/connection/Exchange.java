package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002OPB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u0017J\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u0017J\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u0017J?\u00105\u001a\u0004\u0018\u0001032\b\b\u0002\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00112\b\b\u0002\u00101\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR$\u0010C\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00118\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR$\u0010G\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00118\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0014\u0010L\u001a\u00020I8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010F"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "Lokhttp3/Request;", "request", "", "writeRequestHeaders", "(Lokhttp3/Request;)V", "", "duplex", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;Z)Lokio/Sink;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "Lokio/Socket;", "upgradeToSocket", "()Lokio/Socket;", "noNewExchangesOnConnection", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "detachWithViolence", "", "bytesRead", "isSocket", "responseDone", "requestDone", "Ljava/io/IOException;", "e", "bodyComplete", "(JZZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/http/ExchangeCodec;", "p0", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "hasFailure", "getHasFailure$okhttp", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "connection", "isCoalescedConnection$okhttp", "isCoalescedConnection", "RequestBodySink", "ResponseBodySource"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Exchange {
    private final okhttp3.internal.connection.RealCall call;
    private final okhttp3.internal.http.ExchangeCodec codec;
    private final okhttp3.EventListener eventListener;
    private final okhttp3.internal.connection.ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    public Exchange(okhttp3.internal.connection.RealCall realCall, okhttp3.EventListener eventListener, okhttp3.internal.connection.ExchangeFinder exchangeFinder, okhttp3.internal.http.ExchangeCodec exchangeCodec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeCodec, "");
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
    }

    /* renamed from: getCall$okhttp, reason: from getter */
    public final okhttp3.internal.connection.RealCall getCall() {
        return this.call;
    }

    /* renamed from: getEventListener$okhttp, reason: from getter */
    public final okhttp3.EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: getFinder$okhttp, reason: from getter */
    public final okhttp3.internal.connection.ExchangeFinder getFinder() {
        return this.finder;
    }

    /* renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    /* renamed from: getHasFailure$okhttp, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final okhttp3.internal.connection.RealConnection getConnection$okhttp() {
        okhttp3.internal.http.ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        okhttp3.internal.connection.RealConnection realConnection = carrier instanceof okhttp3.internal.connection.RealConnection ? (okhttp3.internal.connection.RealConnection) carrier : null;
        if (realConnection != null) {
            return realConnection;
        }
        throw new java.lang.IllegalStateException("no connection for CONNECT tunnels".toString());
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(this.finder.getRoutePlanner().getAddress().url().host(), this.codec.getCarrier().getRoute().address().url().host());
    }

    public final void writeRequestHeaders(okhttp3.Request request) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (java.io.IOException e) {
            this.eventListener.requestFailed(this.call, e);
            this.hasFailure = true;
            this.codec.getCarrier().trackFailure(this.call, e);
            throw e;
        }
    }

    public final okio.Sink createRequestBody(okhttp3.Request request, boolean duplex) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.isDuplex = duplex;
        okhttp3.RequestBody body = request.body();
        kotlin.jvm.internal.Intrinsics.checkNotNull(body);
        long contentLength = body.getContentLength();
        this.eventListener.requestBodyStart(this.call);
        return new okhttp3.internal.connection.Exchange.RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength, false);
    }

    public final void flushRequest() throws java.io.IOException {
        try {
            this.codec.flushRequest();
        } catch (java.io.IOException e) {
            this.eventListener.requestFailed(this.call, e);
            this.hasFailure = true;
            this.codec.getCarrier().trackFailure(this.call, e);
            throw e;
        }
    }

    public final void finishRequest() throws java.io.IOException {
        try {
            this.codec.finishRequest();
        } catch (java.io.IOException e) {
            this.eventListener.requestFailed(this.call, e);
            this.hasFailure = true;
            this.codec.getCarrier().trackFailure(this.call, e);
            throw e;
        }
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final okhttp3.Response.Builder readResponseHeaders(boolean expectContinue) throws java.io.IOException {
        try {
            okhttp3.Response.Builder readResponseHeaders = this.codec.readResponseHeaders(expectContinue);
            if (readResponseHeaders != null) {
                readResponseHeaders.initExchange$okhttp(this);
            }
            return readResponseHeaders;
        } catch (java.io.IOException e) {
            this.eventListener.responseFailed(this.call, e);
            this.hasFailure = true;
            this.codec.getCarrier().trackFailure(this.call, e);
            throw e;
        }
    }

    public final void responseHeadersEnd(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final okhttp3.ResponseBody openResponseBody(okhttp3.Response response) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        try {
            java.lang.String header$default = okhttp3.Response.header$default(response, "Content-Type", null, 2, null);
            long reportedContentLength = this.codec.reportedContentLength(response);
            return new okhttp3.internal.http.RealResponseBody(header$default, reportedContentLength, okio.Okio.buffer(new okhttp3.internal.connection.Exchange.ResponseBodySource(this, this.codec.openResponseBodySource(response), reportedContentLength, false)));
        } catch (java.io.IOException e) {
            this.eventListener.responseFailed(this.call, e);
            this.hasFailure = true;
            this.codec.getCarrier().trackFailure(this.call, e);
            throw e;
        }
    }

    public final okhttp3.Headers peekTrailers() throws java.io.IOException {
        return this.codec.peekTrailers();
    }

    public final okio.Socket upgradeToSocket() {
        this.call.upgradeToSocket();
        okhttp3.internal.http.ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(carrier, "");
        ((okhttp3.internal.connection.RealConnection) carrier).useAsSocket$okhttp();
        return new okio.Socket() { // from class: okhttp3.internal.connection.Exchange$upgradeToSocket$1
            private final okhttp3.internal.connection.Exchange.RequestBodySink sink;
            private final okhttp3.internal.connection.Exchange.ResponseBodySource source;

            {
                this.sink = new okhttp3.internal.connection.Exchange.RequestBodySink(okhttp3.internal.connection.Exchange.this, okhttp3.internal.connection.Exchange.this.codec.getSocket().getSink(), -1L, true);
                this.source = new okhttp3.internal.connection.Exchange.ResponseBodySource(okhttp3.internal.connection.Exchange.this, okhttp3.internal.connection.Exchange.this.codec.getSocket().getSource(), -1L, true);
            }

            @Override // okio.Socket
            public final void cancel() {
                okhttp3.internal.connection.Exchange.this.cancel();
            }

            @Override // okio.Socket
            public final okhttp3.internal.connection.Exchange.RequestBodySink getSink() {
                return this.sink;
            }

            @Override // okio.Socket
            public final okhttp3.internal.connection.Exchange.ResponseBodySource getSource() {
                return this.source;
            }
        };
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getCarrier().noNewExchanges();
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, true, true, null);
    }

    public static /* synthetic */ java.io.IOException bodyComplete$default(okhttp3.internal.connection.Exchange exchange, long j, boolean z, boolean z2, boolean z3, java.io.IOException iOException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        return exchange.bodyComplete(j, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, iOException);
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, (r16 & 2) != 0 ? false : true, (r16 & 4) != 0 ? false : false, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, null);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "p0", "", "p1", "", "p2", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Sink;JZ)V", "Lokio/Buffer;", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Ljava/io/IOException;", "getHighSpeedVideoFpsRangesFor", "(Ljava/io/IOException;)Ljava/io/IOException;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getOutputMinFrameDuration", "Z", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "getOutputFormats"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    final class RequestBodySink extends okio.ForwardingSink {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ okhttp3.internal.connection.Exchange getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private long Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean getOutputFormats;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final boolean getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(okhttp3.internal.connection.Exchange exchange, okio.Sink sink, long j, boolean z) {
            super(sink);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            this.getHighSpeedVideoFpsRanges = exchange;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // okio.ForwardingSink, okio.Sink
        public final void write(okio.Buffer p0, long p1) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (this.getOutputFormats) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j != -1 && this.Camera2StreamConfigurationMap + p1 > j) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("expected ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(" bytes but received ");
                sb.append(this.Camera2StreamConfigurationMap + p1);
                throw new java.net.ProtocolException(sb.toString());
            }
            try {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighSpeedVideoFpsRangesFor = false;
                    this.getHighSpeedVideoFpsRanges.getEventListener().requestBodyStart(this.getHighSpeedVideoFpsRanges.getCall());
                }
                super.write(p0, p1);
                this.Camera2StreamConfigurationMap += p1;
            } catch (java.io.IOException e) {
                java.io.IOException highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(e);
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
                throw highSpeedVideoFpsRangesFor;
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public final void flush() throws java.io.IOException {
            try {
                super.flush();
            } catch (java.io.IOException e) {
                java.io.IOException highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(e);
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
                throw highSpeedVideoFpsRangesFor;
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (this.getOutputFormats) {
                return;
            }
            this.getOutputFormats = true;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j != -1 && this.Camera2StreamConfigurationMap != j) {
                throw new java.net.ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                getHighSpeedVideoFpsRangesFor(null);
            } catch (java.io.IOException e) {
                java.io.IOException highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(e);
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
                throw highSpeedVideoFpsRangesFor;
            }
        }

        private final java.io.IOException getHighSpeedVideoFpsRangesFor(java.io.IOException p0) {
            if (this.getHighSpeedVideoFpsRanges) {
                return p0;
            }
            this.getHighSpeedVideoFpsRanges = true;
            return okhttp3.internal.connection.Exchange.bodyComplete$default(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, false, true, p0, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "", "contentLength", "", "isSocket", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Source;JZ)V", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Ljava/io/IOException;", "e", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "(Ljava/io/IOException;)Ljava/io/IOException;", "getHighSpeedVideoFpsRangesFor", "J", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getInputFormats", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public final class ResponseBodySource extends okio.ForwardingSource {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private long getHighSpeedVideoFpsRanges;
        final /* synthetic */ okhttp3.internal.connection.Exchange getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean getInputFormats;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private final boolean Camera2StreamConfigurationMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(okhttp3.internal.connection.Exchange exchange, okio.Source source, long j, boolean z) {
            super(source);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            this.getHighSpeedVideoFpsRanges = exchange;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoSizes = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            if (this.getInputFormats) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            try {
                long read = delegate().read(sink, byteCount);
                if (this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoSizes = false;
                    this.getHighSpeedVideoFpsRanges.getEventListener().responseBodyStart(this.getHighSpeedVideoFpsRanges.getCall());
                }
                if (read == -1) {
                    complete(null);
                    return -1L;
                }
                long j = this.getHighSpeedVideoFpsRanges + read;
                long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (j2 != -1 && j > j2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("expected ");
                    sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                    sb.append(" bytes but received ");
                    sb.append(j);
                    throw new java.net.ProtocolException(sb.toString());
                }
                this.getHighSpeedVideoFpsRanges = j;
                if (this.getHighSpeedVideoFpsRanges.codec.isResponseComplete()) {
                    complete(null);
                }
                return read;
            } catch (java.io.IOException e) {
                java.io.IOException complete = complete(e);
                kotlin.jvm.internal.Intrinsics.checkNotNull(complete);
                throw complete;
            }
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (this.getInputFormats) {
                return;
            }
            this.getInputFormats = true;
            try {
                super.close();
                complete(null);
            } catch (java.io.IOException e) {
                java.io.IOException complete = complete(e);
                kotlin.jvm.internal.Intrinsics.checkNotNull(complete);
                throw complete;
            }
        }

        public final java.io.IOException complete(java.io.IOException e) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return e;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            if (e == null && this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizes = false;
                this.getHighSpeedVideoFpsRanges.getEventListener().responseBodyStart(this.getHighSpeedVideoFpsRanges.getCall());
            }
            return okhttp3.internal.connection.Exchange.bodyComplete$default(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, true, false, e, 8, null);
        }
    }

    public final java.io.IOException bodyComplete(long bytesRead, boolean isSocket, boolean responseDone, boolean requestDone, java.io.IOException e) {
        if (e != null) {
            this.hasFailure = true;
            this.codec.getCarrier().trackFailure(this.call, e);
        }
        if (requestDone) {
            if (e != null) {
                this.eventListener.requestFailed(this.call, e);
            } else {
                this.eventListener.requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e != null) {
                this.eventListener.responseFailed(this.call, e);
            } else {
                this.eventListener.responseBodyEnd(this.call, bytesRead);
            }
        }
        return this.call.messageDone$okhttp(this, requestDone && !isSocket, responseDone && !isSocket, responseDone && isSocket, requestDone && isSocket, e);
    }
}
