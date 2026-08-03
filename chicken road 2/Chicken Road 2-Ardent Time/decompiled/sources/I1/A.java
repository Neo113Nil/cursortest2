package I1;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final I1.C0026a f660a;

    /* renamed from: b, reason: collision with root package name */
    public final java.net.Proxy f661b;

    /* renamed from: c, reason: collision with root package name */
    public final java.net.InetSocketAddress f662c;

    public A(I1.C0026a c0026a, java.net.Proxy proxy, java.net.InetSocketAddress socketAddress) {
        kotlin.jvm.internal.i.e(socketAddress, "socketAddress");
        this.f660a = c0026a;
        this.f661b = proxy;
        this.f662c = socketAddress;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof I1.A) {
            I1.A a2 = (I1.A) obj;
            if (kotlin.jvm.internal.i.a(a2.f660a, this.f660a) && kotlin.jvm.internal.i.a(a2.f661b, this.f661b) && kotlin.jvm.internal.i.a(a2.f662c, this.f662c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f662c.hashCode() + ((this.f661b.hashCode() + ((this.f660a.hashCode() + 527) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Route{" + this.f662c + '}';
    }
}
