package S1;

/* loaded from: classes.dex */
public final class a extends java.net.ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final S1.a f1706a = new S1.a();

    @Override // java.net.ProxySelector
    public final java.util.List select(java.net.URI uri) {
        if (uri != null) {
            return u0.AbstractC0995a.q(java.net.Proxy.NO_PROXY);
        }
        throw new java.lang.IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
    }
}
