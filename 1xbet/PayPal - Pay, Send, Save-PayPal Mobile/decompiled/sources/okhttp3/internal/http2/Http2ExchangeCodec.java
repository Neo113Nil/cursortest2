package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0001@B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010,\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00109R\u0014\u0010:\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http2/Http2Connection;", "http2Connection", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;J)Lokio/Sink;", "", "writeRequestHeaders", "(Lokhttp3/Request;)V", "flushRequest", "()V", "finishRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lokio/Source;", "openResponseBodySource", "(Lokhttp3/Response;)Lokio/Source;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Camera2StreamConfigurationMap", "Lokhttp3/internal/http/RealInterceptorChain;", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/internal/http2/Http2Connection;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/http2/Http2Stream;", "getInputFormats", "Lokhttp3/internal/http2/Http2Stream;", "getHighSpeedVideoSizes", "Lokhttp3/Protocol;", "getHighSpeedVideoSizesFor", "Lokhttp3/Protocol;", "getHighSpeedVideoFpsRanges", "Z", "isResponseComplete", "()Z", "Lokio/Socket;", "getSocket", "()Lokio/Socket;", "socket", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okhttp3.internal.http.RealInterceptorChain getHighResolutionOutputSizeshNQ4ISI;
    private final okhttp3.internal.http.ExchangeCodec.Carrier carrier;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okhttp3.internal.http2.Http2Connection getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final okhttp3.Protocol getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private volatile okhttp3.internal.http2.Http2Stream getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.Http2ExchangeCodec.Companion INSTANCE = new okhttp3.internal.http2.Http2ExchangeCodec.Companion(null);
    private static final java.util.List<java.lang.String> getHighSpeedVideoSizes = okhttp3.internal._UtilJvmKt.immutableListOf("connection", com.datadog.android.log.LogAttributes.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", okhttp3.internal.http2.Header.TARGET_METHOD_UTF8, okhttp3.internal.http2.Header.TARGET_PATH_UTF8, okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8, okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = okhttp3.internal._UtilJvmKt.immutableListOf("connection", com.datadog.android.log.LogAttributes.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public Http2ExchangeCodec(okhttp3.OkHttpClient okHttpClient, okhttp3.internal.http.ExchangeCodec.Carrier carrier, okhttp3.internal.http.RealInterceptorChain realInterceptorChain, okhttp3.internal.http2.Http2Connection http2Connection) {
        okhttp3.Protocol protocol;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realInterceptorChain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(http2Connection, "");
        this.carrier = carrier;
        this.getHighResolutionOutputSizeshNQ4ISI = realInterceptorChain;
        this.getHighSpeedVideoFpsRangesFor = http2Connection;
        if (okHttpClient.protocols().contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE)) {
            protocol = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE;
        } else {
            protocol = okhttp3.Protocol.HTTP_2;
        }
        this.getHighSpeedVideoFpsRanges = protocol;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.internal.http.ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean isResponseComplete() {
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        return http2Stream != null && http2Stream.isSourceComplete();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okio.Socket getSocket() {
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        return http2Stream;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okio.Sink createRequestBody(okhttp3.Request request, long contentLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        return http2Stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void writeRequestHeaders(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (this.getHighSpeedVideoSizes != null) {
            return;
        }
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.newStream(INSTANCE.http2HeadersList(request), request.body() != null);
        if (this.Camera2StreamConfigurationMap) {
            okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
            http2Stream.closeLater(okhttp3.internal.http2.ErrorCode.CANCEL);
            throw new java.io.IOException("Canceled");
        }
        okhttp3.internal.http2.Http2Stream http2Stream2 = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream2);
        http2Stream2.readTimeout().timeout(this.getHighResolutionOutputSizeshNQ4ISI.getReadTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        okhttp3.internal.http2.Http2Stream http2Stream3 = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.getHighResolutionOutputSizeshNQ4ISI.getWriteTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() {
        this.getHighSpeedVideoFpsRangesFor.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.Response.Builder readResponseHeaders(boolean expectContinue) {
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        if (http2Stream == null) {
            throw new java.io.IOException("stream wasn't created");
        }
        okhttp3.Response.Builder readHttp2HeadersList = INSTANCE.readHttp2HeadersList(http2Stream.takeHeaders(expectContinue), this.getHighSpeedVideoFpsRanges);
        if (expectContinue && readHttp2HeadersList.getCode() == 100) {
            return null;
        }
        return readHttp2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long reportedContentLength(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (okhttp3.internal.http.HttpHeaders.promisesBody(response)) {
            return okhttp3.internal._UtilJvmKt.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okio.Source openResponseBodySource(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        return http2Stream.getSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.Headers peekTrailers() {
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        return http2Stream.peekTrailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.Camera2StreamConfigurationMap = true;
        okhttp3.internal.http2.Http2Stream http2Stream = this.getHighSpeedVideoSizes;
        if (http2Stream != null) {
            http2Stream.closeLater(okhttp3.internal.http2.ErrorCode.CANCEL);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "", "Lokhttp3/internal/http2/Header;", "http2HeadersList", "(Lokhttp3/Request;)Ljava/util/List;", "Lokhttp3/Headers;", "headerBlock", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Response$Builder;", "readHttp2HeadersList", "(Lokhttp3/Headers;Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<okhttp3.internal.http2.Header> http2HeadersList(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            okhttp3.Headers headers = request.headers();
            java.util.ArrayList arrayList = new java.util.ArrayList(headers.size() + 4);
            arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, request.method()));
            arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, okhttp3.internal.http.RequestLine.INSTANCE.requestPath(request.url())));
            java.lang.String header = request.header(com.google.common.net.HttpHeaders.HOST);
            if (header != null) {
                arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_AUTHORITY, header));
            }
            arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                java.lang.String name2 = headers.name(i);
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = name2.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!okhttp3.internal.http2.Http2ExchangeCodec.getHighSpeedVideoSizes.contains(lowerCase) || (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "te") && kotlin.jvm.internal.Intrinsics.areEqual(headers.value(i), "trailers"))) {
                    arrayList.add(new okhttp3.internal.http2.Header(lowerCase, headers.value(i)));
                }
            }
            return arrayList;
        }

        public final okhttp3.Response.Builder readHttp2HeadersList(okhttp3.Headers headerBlock, okhttp3.Protocol protocol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            int size = headerBlock.size();
            okhttp3.internal.http.StatusLine statusLine = null;
            for (int i = 0; i < size; i++) {
                java.lang.String name2 = headerBlock.name(i);
                java.lang.String value = headerBlock.value(i);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(name2, okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8)) {
                    if (!okhttp3.internal.http2.Http2ExchangeCodec.getHighSpeedVideoFpsRanges.contains(name2)) {
                        builder.addLenient$okhttp(name2, value);
                    }
                } else {
                    statusLine = okhttp3.internal.http.StatusLine.INSTANCE.parse("HTTP/1.1 ".concat(java.lang.String.valueOf(value)));
                }
            }
            if (statusLine == null) {
                throw new java.net.ProtocolException("Expected ':status' header not present");
            }
            return new okhttp3.Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
