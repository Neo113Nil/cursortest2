package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rb0 extends SocketAddress {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f6794n = 0;

    /* JADX INFO: renamed from: j */
    public final SocketAddress f6795j;

    /* JADX INFO: renamed from: k */
    public final InetSocketAddress f6796k;

    /* JADX INFO: renamed from: l */
    public final String f6797l;

    /* JADX INFO: renamed from: m */
    public final String f6798m;

    public rb0(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        a90.m127k(inetSocketAddress, "proxyAddress");
        a90.m127k(inetSocketAddress2, "targetAddress");
        a90.m131o(inetSocketAddress, "The proxy address %s is not resolved", !inetSocketAddress.isUnresolved());
        this.f6795j = inetSocketAddress;
        this.f6796k = inetSocketAddress2;
        this.f6797l = str;
        this.f6798m = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return AbstractC0875xf.m5649f(this.f6795j, rb0Var.f6795j) && AbstractC0875xf.m5649f(this.f6796k, rb0Var.f6796k) && AbstractC0875xf.m5649f(this.f6797l, rb0Var.f6797l) && AbstractC0875xf.m5649f(this.f6798m, rb0Var.f6798m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6795j, this.f6796k, this.f6797l, this.f6798m});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f6795j, "proxyAddr");
        c0809vnM5362k.m5172c(this.f6796k, "targetAddr");
        c0809vnM5362k.m5172c(this.f6797l, "username");
        c0809vnM5362k.m5174e("hasPassword", this.f6798m != null);
        return c0809vnM5362k.toString();
    }
}
