package U5;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* JADX INFO: renamed from: U5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0458z extends SocketAddress {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6595e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f6596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InetSocketAddress f6597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6599d;

    public C0458z(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        p113p3.f.k(inetSocketAddress, "proxyAddress");
        p113p3.f.k(inetSocketAddress2, "targetAddress");
        p113p3.f.s(!inetSocketAddress.isUnresolved(), "The proxy address %s is not resolved", inetSocketAddress);
        this.f6596a = inetSocketAddress;
        this.f6597b = inetSocketAddress2;
        this.f6598c = str;
        this.f6599d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0458z)) {
            return false;
        }
        C0458z c0458z = (C0458z) obj;
        return p097n3.a.t(this.f6596a, c0458z.f6596a) && p097n3.a.t(this.f6597b, c0458z.f6597b) && p097n3.a.t(this.f6598c, c0458z.f6598c) && p097n3.a.t(this.f6599d, c0458z.f6599d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6596a, this.f6597b, this.f6598c, this.f6599d});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f6596a, "proxyAddr");
        jVarU0.a(this.f6597b, "targetAddr");
        jVarU0.a(this.f6598c, "username");
        jVarU0.c("hasPassword", this.f6599d != null);
        return jVarU0.toString();
    }
}
