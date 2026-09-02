package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C0070a f1269a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f1270b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f1271c;

    public A(C0070a c0070a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0070a == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f1269a = c0070a;
        this.f1270b = proxy;
        this.f1271c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a2 = (A) obj;
            if (a2.f1269a.equals(this.f1269a) && a2.f1270b.equals(this.f1270b) && a2.f1271c.equals(this.f1271c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1271c.hashCode() + ((this.f1270b.hashCode() + ((this.f1269a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f1271c + "}";
    }
}
