package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0015\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\nH\u0000¢\u0006\u0004\b#\u0010$\u001a'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040%*\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0000¢\u0006\u0004\b'\u0010(\u001a#\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010)0**\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010.\u001a\u00020+*\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001b\u00103\u001a\u000200*\u0002002\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a\u001f\u00108\u001a\u0002072\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b8\u00109\"\u0018\u0010=\u001a\u00020:*\u00020\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<"}, d2 = {"", "currentTimeMillis", "Lokhttp3/HttpUrl;", "url", "", "setCookie", "Lokhttp3/Cookie;", "parseCookie", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "cookie", "", "forObsoleteRfc2965", "cookieToString", "(Lokhttp3/Cookie;Z)Ljava/lang/String;", "Lokhttp3/Headers$Builder;", "builder", "line", "addHeaderLenient", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "Lokhttp3/Cache;", com.datadog.trace.api.DDSpanTypes.CACHE, "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheGet", "(Lokhttp3/Cache;Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/ConnectionSpec;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "", "applyConnectionSpec", "(Lokhttp3/ConnectionSpec;Ljavax/net/ssl/SSLSocket;Z)V", "", "socketEnabledCipherSuites", "effectiveCipherSuites", "(Lokhttp3/ConnectionSpec;[Ljava/lang/String;)[Ljava/lang/String;", "Lokhttp3/MediaType;", "Lkotlin/Pair;", "Ljava/nio/charset/Charset;", "chooseCharset", "(Lokhttp3/MediaType;)Lkotlin/Pair;", "charsetOrUtf8", "(Lokhttp3/MediaType;)Ljava/nio/charset/Charset;", "Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "taskRunnerInternal", "(Lokhttp3/OkHttpClient$Builder;Lokhttp3/internal/concurrent/TaskRunner;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "Lokhttp3/ConnectionPool;", "buildConnectionPool", "(Lokhttp3/internal/connection/ConnectionListener;Lokhttp3/internal/concurrent/TaskRunner;)Lokhttp3/ConnectionPool;", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "(Lokhttp3/Response;)Lokhttp3/internal/connection/RealConnection;", "connection"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Internal {
    public static final okhttp3.Cookie parseCookie(long j, okhttp3.HttpUrl httpUrl, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return okhttp3.Cookie.INSTANCE.parse$okhttp(j, httpUrl, str);
    }

    public static final java.lang.String cookieToString(okhttp3.Cookie cookie, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
        return cookie.toString$okhttp(z);
    }

    public static final okhttp3.Headers.Builder addHeaderLenient(okhttp3.Headers.Builder builder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return builder.addLenient$okhttp(str);
    }

    public static final okhttp3.Headers.Builder addHeaderLenient(okhttp3.Headers.Builder builder, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return builder.addLenient$okhttp(str, str2);
    }

    public static final okhttp3.Response cacheGet(okhttp3.Cache cache, okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return cache.get$okhttp(request);
    }

    public static final void applyConnectionSpec(okhttp3.ConnectionSpec connectionSpec, javax.net.ssl.SSLSocket sSLSocket, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSLSocket, "");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final java.lang.String[] effectiveCipherSuites(okhttp3.ConnectionSpec connectionSpec, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return connectionSpec.getCipherSuitesAsString() != null ? okhttp3.internal._UtilCommonKt.intersect(connectionSpec.getCipherSuitesAsString(), strArr, okhttp3.CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp()) : strArr;
    }

    public static final kotlin.Pair<java.nio.charset.Charset, okhttp3.MediaType> chooseCharset(okhttp3.MediaType mediaType) {
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        if (mediaType != null && (charset = okhttp3.MediaType.charset$default(mediaType, null, 1, null)) == null) {
            charset = kotlin.text.Charsets.UTF_8;
            okhttp3.MediaType.Companion companion = okhttp3.MediaType.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(mediaType);
            sb.append("; charset=utf-8");
            mediaType = companion.parse(sb.toString());
        }
        return kotlin.TuplesKt.to(charset, mediaType);
    }

    public static final java.nio.charset.Charset charsetOrUtf8(okhttp3.MediaType mediaType) {
        java.nio.charset.Charset charset$default;
        return (mediaType == null || (charset$default = okhttp3.MediaType.charset$default(mediaType, null, 1, null)) == null) ? kotlin.text.Charsets.UTF_8 : charset$default;
    }

    public static final okhttp3.internal.connection.RealConnection getConnection(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        okhttp3.internal.connection.Exchange exchange = response.getExchange();
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchange);
        return exchange.getConnection$okhttp();
    }

    public static final okhttp3.OkHttpClient.Builder taskRunnerInternal(okhttp3.OkHttpClient.Builder builder, okhttp3.internal.concurrent.TaskRunner taskRunner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        return builder.taskRunner$okhttp(taskRunner);
    }

    public static final okhttp3.ConnectionPool buildConnectionPool(okhttp3.internal.connection.ConnectionListener connectionListener, okhttp3.internal.concurrent.TaskRunner taskRunner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        return new okhttp3.ConnectionPool(0, 0L, null, taskRunner, connectionListener, 7, null);
    }
}
