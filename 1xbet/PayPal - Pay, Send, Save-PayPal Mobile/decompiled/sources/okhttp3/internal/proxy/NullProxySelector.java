package okhttp3.internal.proxy;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/internal/proxy/NullProxySelector;", "Ljava/net/ProxySelector;", "<init>", "()V", "Ljava/net/URI;", "uri", "", "Ljava/net/Proxy;", "select", "(Ljava/net/URI;)Ljava/util/List;", "Ljava/net/SocketAddress;", "sa", "Ljava/io/IOException;", "ioe", "", "connectFailed", "(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NullProxySelector extends java.net.ProxySelector {
    public static final okhttp3.internal.proxy.NullProxySelector INSTANCE = new okhttp3.internal.proxy.NullProxySelector();

    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, java.net.SocketAddress sa, java.io.IOException ioe) {
    }

    private NullProxySelector() {
    }

    @Override // java.net.ProxySelector
    public final java.util.List<java.net.Proxy> select(java.net.URI uri) {
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("uri must not be null".toString());
        }
        return kotlin.collections.CollectionsKt.listOf(java.net.Proxy.NO_PROXY);
    }
}
