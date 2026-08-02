package y4;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final C2673a f21282a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f21283b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f21284c;

    public C(C2673a c2673a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        kotlin.jvm.internal.l.f("socketAddress", inetSocketAddress);
        this.f21282a = c2673a;
        this.f21283b = proxy;
        this.f21284c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c5 = (C) obj;
        return kotlin.jvm.internal.l.a(c5.f21282a, this.f21282a) && kotlin.jvm.internal.l.a(c5.f21283b, this.f21283b) && kotlin.jvm.internal.l.a(c5.f21284c, this.f21284c);
    }

    public final int hashCode() {
        return this.f21284c.hashCode() + ((this.f21283b.hashCode() + ((this.f21282a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f21284c + '}';
    }
}
