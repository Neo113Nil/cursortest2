package sg.bigo.ads.o1;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends ProxySelector {
    public static final List d = Arrays.asList(Proxy.NO_PROXY);

    /* renamed from: a, reason: collision with root package name */
    public final ProxySelector f13231a;
    public final String b;
    public final int c;

    public h(ProxySelector proxySelector, int i) {
        proxySelector.getClass();
        this.f13231a = proxySelector;
        this.b = "127.0.0.1";
        this.c = i;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f13231a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        return (this.b.equals(uri.getHost()) && this.c == uri.getPort()) ? d : this.f13231a.select(uri);
    }
}
