package We;

import C.o0;
import We.A;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4859a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A f33674a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<F> f33675b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<C4872n> f33676c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final u f33677d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final SocketFactory f33678e;

    /* renamed from: f, reason: collision with root package name */
    private final SSLSocketFactory f33679f;

    /* renamed from: g, reason: collision with root package name */
    private final HostnameVerifier f33680g;

    /* renamed from: h, reason: collision with root package name */
    private final C4867i f33681h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4861c f33682i;

    /* renamed from: j, reason: collision with root package name */
    private final Proxy f33683j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ProxySelector f33684k;

    public C4859a(@NotNull String uriHost, int i11, @NotNull u dns, @NotNull SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C4867i c4867i, @NotNull InterfaceC4861c proxyAuthenticator, Proxy proxy, @NotNull List<? extends F> protocols, @NotNull List<C4872n> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f33677d = dns;
        this.f33678e = socketFactory;
        this.f33679f = sSLSocketFactory;
        this.f33680g = hostnameVerifier;
        this.f33681h = c4867i;
        this.f33682i = proxyAuthenticator;
        this.f33683j = proxy;
        this.f33684k = proxySelector;
        A.a aVar = new A.a();
        aVar.s(sSLSocketFactory != null ? "https" : "http");
        aVar.j(uriHost);
        aVar.m(i11);
        this.f33674a = aVar.e();
        this.f33675b = Ye.b.B(protocols);
        this.f33676c = Ye.b.B(connectionSpecs);
    }

    public final C4867i a() {
        return this.f33681h;
    }

    @NotNull
    public final List<C4872n> b() {
        return this.f33676c;
    }

    @NotNull
    public final u c() {
        return this.f33677d;
    }

    public final boolean d(@NotNull C4859a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.d(this.f33677d, that.f33677d) && Intrinsics.d(this.f33682i, that.f33682i) && Intrinsics.d(this.f33675b, that.f33675b) && Intrinsics.d(this.f33676c, that.f33676c) && Intrinsics.d(this.f33684k, that.f33684k) && Intrinsics.d(this.f33683j, that.f33683j) && Intrinsics.d(this.f33679f, that.f33679f) && Intrinsics.d(this.f33680g, that.f33680g) && Intrinsics.d(this.f33681h, that.f33681h) && this.f33674a.n() == that.f33674a.n();
    }

    public final HostnameVerifier e() {
        return this.f33680g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4859a)) {
            return false;
        }
        C4859a c4859a = (C4859a) obj;
        return Intrinsics.d(this.f33674a, c4859a.f33674a) && d(c4859a);
    }

    @NotNull
    public final List<F> f() {
        return this.f33675b;
    }

    public final Proxy g() {
        return this.f33683j;
    }

    @NotNull
    public final InterfaceC4861c h() {
        return this.f33682i;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f33681h) + ((Objects.hashCode(this.f33680g) + ((Objects.hashCode(this.f33679f) + ((Objects.hashCode(this.f33683j) + ((this.f33684k.hashCode() + G.g.b(G.g.b((this.f33682i.hashCode() + ((this.f33677d.hashCode() + ((this.f33674a.hashCode() + 527) * 31)) * 31)) * 31, 31, this.f33675b), 31, this.f33676c)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final ProxySelector i() {
        return this.f33684k;
    }

    @NotNull
    public final SocketFactory j() {
        return this.f33678e;
    }

    public final SSLSocketFactory k() {
        return this.f33679f;
    }

    @NotNull
    public final A l() {
        return this.f33674a;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        A a11 = this.f33674a;
        sb2.append(a11.h());
        sb2.append(':');
        sb2.append(a11.n());
        sb2.append(", ");
        Proxy proxy = this.f33683j;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f33684k;
        }
        return o0.c(sb2, str, "}");
    }
}
