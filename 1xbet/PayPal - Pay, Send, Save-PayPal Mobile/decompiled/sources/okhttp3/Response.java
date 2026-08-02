package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001dB\u008d\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b&\u0010'J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060)2\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010*J#\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0007¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b1\u0010/J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0015¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0007¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b:\u0010;J\u0011\u0010<\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b<\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b=\u0010;J\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020>0)¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0015H\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0015H\u0007¢\u0006\u0004\bF\u0010EJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\b\u0003\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\b\u0005\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\b\u0007\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\b\t\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\b\u000b\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\b\r\u0010/R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\b\u000f\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\b\u0011\u0010SR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\b\u0012\u0010;R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\b\u0013\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\b\u0014\u0010;R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\b\u0016\u0010ER\u001a\u0010\u0017\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\b\u0017\u0010ER\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\b\u0019\u0010WR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010XR$\u0010Y\u001a\u0004\u0018\u00010A8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010C\"\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020^8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b_\u0010aR\u001a\u0010b\u001a\u00020^8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010`\u001a\u0004\bb\u0010aR\u0011\u0010c\u001a\u00020A8G¢\u0006\u0006\u001a\u0004\bc\u0010C"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", "message", "", "code", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lokio/Socket;", "socket", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/TrailersSource;", "trailersSource", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokio/Socket;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;Lokhttp3/TrailersSource;)V", "-deprecated_request", "()Lokhttp3/Request;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "-deprecated_code", "()I", "-deprecated_message", "()Ljava/lang/String;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "name", "", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", "peekTrailers", "byteCount", "peekBody", "(J)Lokhttp3/ResponseBody;", "-deprecated_body", "()Lokhttp3/ResponseBody;", "Lokhttp3/Response$Builder;", "newBuilder", "()Lokhttp3/Response$Builder;", "-deprecated_networkResponse", "()Lokhttp3/Response;", "-deprecated_cacheResponse", "-deprecated_priorResponse", "Lokhttp3/Challenge;", "challenges", "()Ljava/util/List;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "-deprecated_sentRequestAtMillis", "()J", "-deprecated_receivedResponseAtMillis", "", "close", "()V", "toString", "Lokhttp3/Request;", "Lokhttp3/Protocol;", "Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "Lokio/Socket;", "()Lokio/Socket;", "Lokhttp3/Response;", "J", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "Lokhttp3/TrailersSource;", "lazyCacheControl", "Lokhttp3/CacheControl;", "getLazyCacheControl$okhttp", "setLazyCacheControl$okhttp", "(Lokhttp3/CacheControl;)V", "", "isSuccessful", "Z", "()Z", "isRedirect", "cacheControl", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Response implements java.io.Closeable {
    private final okhttp3.ResponseBody body;
    private final okhttp3.Response cacheResponse;
    private final int code;
    private final okhttp3.internal.connection.Exchange exchange;
    private final okhttp3.Handshake handshake;
    private final okhttp3.Headers headers;
    private final boolean isRedirect;
    private final boolean isSuccessful;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String message;
    private final okhttp3.Response networkResponse;
    private final okhttp3.Response priorResponse;
    private final okhttp3.Protocol protocol;
    private final long receivedResponseAtMillis;
    private final okhttp3.Request request;
    private final long sentRequestAtMillis;
    private final okio.Socket socket;
    private okhttp3.TrailersSource trailersSource;

    public Response(okhttp3.Request request, okhttp3.Protocol protocol, java.lang.String str, int i, okhttp3.Handshake handshake, okhttp3.Headers headers, okhttp3.ResponseBody responseBody, okio.Socket socket, okhttp3.Response response, okhttp3.Response response2, okhttp3.Response response3, long j, long j2, okhttp3.internal.connection.Exchange exchange, okhttp3.TrailersSource trailersSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBody, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailersSource, "");
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.socket = socket;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
        this.trailersSource = trailersSource;
        boolean z = false;
        this.isSuccessful = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
            }
            this.isRedirect = z;
        }
        z = true;
        this.isRedirect = z;
    }

    public final okhttp3.Request request() {
        return this.request;
    }

    public final okhttp3.Protocol protocol() {
        return this.protocol;
    }

    public final java.lang.String message() {
        return this.message;
    }

    public final int code() {
        return this.code;
    }

    public final okhttp3.Handshake handshake() {
        return this.handshake;
    }

    public final okhttp3.Headers headers() {
        return this.headers;
    }

    public final okhttp3.ResponseBody body() {
        return this.body;
    }

    /* renamed from: socket, reason: from getter */
    public final okio.Socket getSocket() {
        return this.socket;
    }

    public final okhttp3.Response networkResponse() {
        return this.networkResponse;
    }

    public final okhttp3.Response cacheResponse() {
        return this.cacheResponse;
    }

    public final okhttp3.Response priorResponse() {
        return this.priorResponse;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: exchange, reason: from getter */
    public final okhttp3.internal.connection.Exchange getExchange() {
        return this.exchange;
    }

    /* renamed from: getLazyCacheControl$okhttp, reason: from getter */
    public final okhttp3.CacheControl getLazyCacheControl() {
        return this.lazyCacheControl;
    }

    public final void setLazyCacheControl$okhttp(okhttp3.CacheControl cacheControl) {
        this.lazyCacheControl = cacheControl;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "request", imports = {}))
    /* renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final okhttp3.Request getRequest() {
        return this.request;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocol", imports = {}))
    /* renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final okhttp3.Protocol getProtocol() {
        return this.protocol;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "code", imports = {}))
    /* renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "message", imports = {}))
    /* renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "handshake", imports = {}))
    /* renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final okhttp3.Handshake getHandshake() {
        return this.handshake;
    }

    public final java.util.List<java.lang.String> headers(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.headers.values(name2);
    }

    public static /* synthetic */ java.lang.String header$default(okhttp3.Response response, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    public final java.lang.String header(java.lang.String name2, java.lang.String defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String str = this.headers.get(name2);
        return str == null ? defaultValue : str;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final okhttp3.Headers getHeaders() {
        return this.headers;
    }

    public final okhttp3.Headers trailers() throws java.io.IOException {
        return this.trailersSource.get();
    }

    public final okhttp3.Headers peekTrailers() throws java.io.IOException {
        return this.trailersSource.peek();
    }

    public final okhttp3.ResponseBody peekBody(long byteCount) throws java.io.IOException {
        okio.BufferedSource peek = this.body.getGetHighResolutionOutputSizeshNQ4ISI().peek();
        okio.Buffer buffer = new okio.Buffer();
        peek.request(byteCount);
        buffer.write((okio.Source) peek, java.lang.Math.min(byteCount, peek.getBuffer().size()));
        return okhttp3.ResponseBody.INSTANCE.create(buffer, this.body.getGetHighSpeedVideoFpsRangesFor(), buffer.size());
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, imports = {}))
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final okhttp3.ResponseBody getBody() {
        return this.body;
    }

    public final okhttp3.Response.Builder newBuilder() {
        return new okhttp3.Response.Builder(this);
    }

    /* renamed from: isRedirect, reason: from getter */
    public final boolean getIsRedirect() {
        return this.isRedirect;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "networkResponse", imports = {}))
    /* renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final okhttp3.Response getNetworkResponse() {
        return this.networkResponse;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheResponse", imports = {}))
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final okhttp3.Response getCacheResponse() {
        return this.cacheResponse;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "priorResponse", imports = {}))
    /* renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final okhttp3.Response getPriorResponse() {
        return this.priorResponse;
    }

    public final java.util.List<okhttp3.Challenge> challenges() {
        java.lang.String str;
        okhttp3.Headers headers = this.headers;
        int i = this.code;
        if (i == 401) {
            str = com.google.common.net.HttpHeaders.WWW_AUTHENTICATE;
        } else if (i == 407) {
            str = com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE;
        } else {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return okhttp3.internal.http.HttpHeaders.parseChallenges(headers, str);
    }

    public final okhttp3.CacheControl cacheControl() {
        okhttp3.CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        okhttp3.CacheControl parse = okhttp3.CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m24400deprecated_cacheControl() {
        return cacheControl();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.body.close();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Response{protocol=");
        sb.append(this.protocol);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", url=");
        sb.append(this.request.url());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b&\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010&J!\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010&J\u0017\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u000202H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020*2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010;R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u000e\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\u001d\u001a\u00020U8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010 \u001a\u00020\u001f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b \u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010#\u001a\u0004\u0018\u00010\"8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b#\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010%\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b%\u0010e\u001a\u0004\bf\u0010;\"\u0004\bg\u0010\u0006R$\u0010'\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010e\u001a\u0004\bh\u0010;\"\u0004\bi\u0010\u0006R$\u0010-\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010e\u001a\u0004\bj\u0010;\"\u0004\bk\u0010\u0006R\"\u00103\u001a\u0002028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u00105\u001a\u0002028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u0010l\u001a\u0004\bq\u0010n\"\u0004\br\u0010pR$\u00107\u001a\u0004\u0018\u0001068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u00109R\"\u0010/\u001a\u00020.8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b/\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)Lokhttp3/Response$Builder;", "Lokhttp3/Protocol;", "protocol", "(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "code", "(I)Lokhttp3/Response$Builder;", "", "message", "(Ljava/lang/String;)Lokhttp3/Response$Builder;", "Lokhttp3/Handshake;", "handshake", "(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Response$Builder;", "Lokhttp3/ResponseBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;", "Lokio/Socket;", "socket", "(Lokio/Socket;)Lokhttp3/Response$Builder;", "networkResponse", "(Lokhttp3/Response;)Lokhttp3/Response$Builder;", "cacheResponse", "p0", "p1", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lokhttp3/Response;)V", "priorResponse", "Lokhttp3/TrailersSource;", "trailersSource", "trailers", "(Lokhttp3/TrailersSource;)Lokhttp3/Response$Builder;", "", "sentRequestAtMillis", "(J)Lokhttp3/Response$Builder;", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "exchange", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "build", "()Lokhttp3/Response;", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", com.visa.cbp.getEncExpo.warmup, "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokio/Socket;", "getSocket$okhttp", "()Lokio/Socket;", "setSocket$okhttp", "(Lokio/Socket;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "Lokhttp3/TrailersSource;", "getTrailersSource$okhttp", "()Lokhttp3/TrailersSource;", "setTrailersSource$okhttp", "(Lokhttp3/TrailersSource;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Builder {
        private okhttp3.ResponseBody body;
        private okhttp3.Response cacheResponse;
        private int code;
        private okhttp3.internal.connection.Exchange exchange;
        private okhttp3.Handshake handshake;
        private okhttp3.Headers.Builder headers;
        private java.lang.String message;
        private okhttp3.Response networkResponse;
        private okhttp3.Response priorResponse;
        private okhttp3.Protocol protocol;
        private long receivedResponseAtMillis;
        private okhttp3.Request request;
        private long sentRequestAtMillis;
        private okio.Socket socket;
        private okhttp3.TrailersSource trailersSource;

        /* renamed from: getRequest$okhttp, reason: from getter */
        public final okhttp3.Request getRequest() {
            return this.request;
        }

        public final void setRequest$okhttp(okhttp3.Request request) {
            this.request = request;
        }

        /* renamed from: getProtocol$okhttp, reason: from getter */
        public final okhttp3.Protocol getProtocol() {
            return this.protocol;
        }

        public final void setProtocol$okhttp(okhttp3.Protocol protocol) {
            this.protocol = protocol;
        }

        /* renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        /* renamed from: getMessage$okhttp, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final void setMessage$okhttp(java.lang.String str) {
            this.message = str;
        }

        /* renamed from: getHandshake$okhttp, reason: from getter */
        public final okhttp3.Handshake getHandshake() {
            return this.handshake;
        }

        public final void setHandshake$okhttp(okhttp3.Handshake handshake) {
            this.handshake = handshake;
        }

        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final okhttp3.Headers.Builder getHeaders() {
            return this.headers;
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            this.headers = builder;
        }

        /* renamed from: getBody$okhttp, reason: from getter */
        public final okhttp3.ResponseBody getBody() {
            return this.body;
        }

        public final void setBody$okhttp(okhttp3.ResponseBody responseBody) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBody, "");
            this.body = responseBody;
        }

        /* renamed from: getSocket$okhttp, reason: from getter */
        public final okio.Socket getSocket() {
            return this.socket;
        }

        public final void setSocket$okhttp(okio.Socket socket) {
            this.socket = socket;
        }

        /* renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final okhttp3.Response getNetworkResponse() {
            return this.networkResponse;
        }

        public final void setNetworkResponse$okhttp(okhttp3.Response response) {
            this.networkResponse = response;
        }

        /* renamed from: getCacheResponse$okhttp, reason: from getter */
        public final okhttp3.Response getCacheResponse() {
            return this.cacheResponse;
        }

        public final void setCacheResponse$okhttp(okhttp3.Response response) {
            this.cacheResponse = response;
        }

        /* renamed from: getPriorResponse$okhttp, reason: from getter */
        public final okhttp3.Response getPriorResponse() {
            return this.priorResponse;
        }

        public final void setPriorResponse$okhttp(okhttp3.Response response) {
            this.priorResponse = response;
        }

        /* renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        /* renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        /* renamed from: getExchange$okhttp, reason: from getter */
        public final okhttp3.internal.connection.Exchange getExchange() {
            return this.exchange;
        }

        public final void setExchange$okhttp(okhttp3.internal.connection.Exchange exchange) {
            this.exchange = exchange;
        }

        /* renamed from: getTrailersSource$okhttp, reason: from getter */
        public final okhttp3.TrailersSource getTrailersSource() {
            return this.trailersSource;
        }

        public final void setTrailersSource$okhttp(okhttp3.TrailersSource trailersSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailersSource, "");
            this.trailersSource = trailersSource;
        }

        public Builder() {
            this.code = -1;
            this.body = okhttp3.ResponseBody.EMPTY;
            this.trailersSource = okhttp3.TrailersSource.EMPTY;
            this.headers = new okhttp3.Headers.Builder();
        }

        public Builder(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            this.code = -1;
            this.body = okhttp3.ResponseBody.EMPTY;
            this.trailersSource = okhttp3.TrailersSource.EMPTY;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.socket = response.getSocket();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
            this.trailersSource = response.trailersSource;
        }

        public okhttp3.Response.Builder request(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            this.request = request;
            return this;
        }

        public okhttp3.Response.Builder protocol(okhttp3.Protocol protocol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
            this.protocol = protocol;
            return this;
        }

        public okhttp3.Response.Builder code(int code) {
            this.code = code;
            return this;
        }

        public okhttp3.Response.Builder message(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            this.message = message;
            return this;
        }

        public okhttp3.Response.Builder handshake(okhttp3.Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public okhttp3.Response.Builder header(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.headers.set(name2, value);
            return this;
        }

        public okhttp3.Response.Builder addHeader(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.headers.add(name2, value);
            return this;
        }

        public okhttp3.Response.Builder removeHeader(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.headers.removeAll(name2);
            return this;
        }

        public okhttp3.Response.Builder headers(okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.headers = headers.newBuilder();
            return this;
        }

        public okhttp3.Response.Builder body(okhttp3.ResponseBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            this.body = body;
            return this;
        }

        public okhttp3.Response.Builder socket(okio.Socket socket) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
            this.socket = socket;
            return this;
        }

        public okhttp3.Response.Builder networkResponse(okhttp3.Response networkResponse) {
            getHighSpeedVideoSizes("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public okhttp3.Response.Builder cacheResponse(okhttp3.Response cacheResponse) {
            getHighSpeedVideoSizes("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        private static void getHighSpeedVideoSizes(java.lang.String p0, okhttp3.Response p1) {
            if (p1 != null) {
                if (p1.networkResponse() != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(p0);
                    sb.append(".networkResponse != null");
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
                if (p1.cacheResponse() != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(p0);
                    sb2.append(".cacheResponse != null");
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                }
                if (p1.priorResponse() == null) {
                    return;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(p0);
                sb3.append(".priorResponse != null");
                throw new java.lang.IllegalArgumentException(sb3.toString().toString());
            }
        }

        public okhttp3.Response.Builder priorResponse(okhttp3.Response priorResponse) {
            this.priorResponse = priorResponse;
            return this;
        }

        public okhttp3.Response.Builder trailers(okhttp3.TrailersSource trailersSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailersSource, "");
            this.trailersSource = trailersSource;
            return this;
        }

        public okhttp3.Response.Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public okhttp3.Response.Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public final void initExchange$okhttp(okhttp3.internal.connection.Exchange exchange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchange, "");
            this.exchange = exchange;
        }

        public okhttp3.Response build() {
            int i = this.code;
            if (i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("code < 0: ");
                sb.append(this.code);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            okhttp3.Request request = this.request;
            if (request == null) {
                throw new java.lang.IllegalStateException("request == null".toString());
            }
            okhttp3.Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new java.lang.IllegalStateException("protocol == null".toString());
            }
            java.lang.String str = this.message;
            if (str != null) {
                return new okhttp3.Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.socket, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.trailersSource);
            }
            throw new java.lang.IllegalStateException("message == null".toString());
        }
    }

    public final java.lang.String header(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return header$default(this, str, null, 2, null);
    }
}
