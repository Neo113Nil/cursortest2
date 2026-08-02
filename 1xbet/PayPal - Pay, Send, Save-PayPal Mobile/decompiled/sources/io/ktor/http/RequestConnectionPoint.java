package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8'X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0014\u001a\u00020\u00028'X§\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\f\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0004R\u0014\u0010 \u001a\u00020\u001d8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0004R\u0014\u0010$\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\nR\u0014\u0010&\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0004"}, d2 = {"Lio/ktor/http/RequestConnectionPoint;", "", "", "getScheme", "()Ljava/lang/String;", "scheme", "getVersion", "version", "", "getPort", "()I", "getPort$annotations", "()V", "port", "getLocalPort", "localPort", "getServerPort", "serverPort", "getHost", "getHost$annotations", com.datadog.android.log.LogAttributes.HOST, "getLocalHost", "localHost", "getServerHost", "serverHost", "getLocalAddress", "localAddress", "getUri", "uri", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "method", "getRemoteHost", "remoteHost", "getRemotePort", "remotePort", "getRemoteAddress", "remoteAddress"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RequestConnectionPoint {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use localHost or serverHost instead")
        public static /* synthetic */ void getHost$annotations() {
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use localPort or serverPort instead")
        public static /* synthetic */ void getPort$annotations() {
        }
    }

    java.lang.String getHost();

    java.lang.String getLocalAddress();

    java.lang.String getLocalHost();

    int getLocalPort();

    io.ktor.http.HttpMethod getMethod();

    int getPort();

    java.lang.String getRemoteAddress();

    java.lang.String getRemoteHost();

    int getRemotePort();

    java.lang.String getScheme();

    java.lang.String getServerHost();

    int getServerPort();

    java.lang.String getUri();

    java.lang.String getVersion();
}
