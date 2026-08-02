package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "get", "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "url", "requestPath", "(Lokhttp3/HttpUrl;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestLine {
    public static final okhttp3.internal.http.RequestLine INSTANCE = new okhttp3.internal.http.RequestLine();

    private RequestLine() {
    }

    public final java.lang.String get(okhttp3.Request request, java.net.Proxy.Type proxyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxyType, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        okhttp3.internal.http.RequestLine requestLine = INSTANCE;
        if (!request.isHttps() && proxyType == java.net.Proxy.Type.HTTP) {
            sb.append(request.url());
        } else {
            sb.append(requestLine.requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public final java.lang.String requestPath(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String encodedPath = url.encodedPath();
        java.lang.String encodedQuery = url.encodedQuery();
        if (encodedQuery == null) {
            return encodedPath;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(encodedPath);
        sb.append('?');
        sb.append(encodedQuery);
        return sb.toString();
    }
}
