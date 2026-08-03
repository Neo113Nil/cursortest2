package io.ktor.client.engine;

/* compiled from: ProxyConfigJvm.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/client/engine/ProxyBuilder;", "", "<init>", "()V", "Lio/ktor/http/Url;", "url", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", androidx.webkit.ProxyConfig.MATCH_HTTP, "(Lio/ktor/http/Url;)Ljava/net/Proxy;", "", "host", "", "port", "socks", "(Ljava/lang/String;I)Ljava/net/Proxy;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProxyBuilder {
    public static final io.ktor.client.engine.ProxyBuilder INSTANCE = new io.ktor.client.engine.ProxyBuilder();

    private ProxyBuilder() {
    }

    public final java.net.Proxy http(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(url.getHost(), url.getPort()));
    }

    public final java.net.Proxy socks(java.lang.String host, int port) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        return new java.net.Proxy(java.net.Proxy.Type.SOCKS, new java.net.InetSocketAddress(host, port));
    }
}
