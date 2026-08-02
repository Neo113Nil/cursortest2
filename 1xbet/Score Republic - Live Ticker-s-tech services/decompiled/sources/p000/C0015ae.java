package p000;

import java.net.SocketAddress;

/* JADX INFO: renamed from: ae */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015ae implements InterfaceC0729th {

    /* JADX INFO: renamed from: j */
    public final ht0 f157j;

    public C0015ae(ht0 ht0Var, bl0 bl0Var) {
        this.f157j = ht0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f157j.close();
    }

    @Override // p000.InterfaceC0729th
    /* JADX INFO: renamed from: n */
    public final InterfaceC0215fl mo179n(SocketAddress socketAddress, C0692sh c0692sh, we0 we0Var) {
        return new C0947zd(this, this.f157j.mo179n(socketAddress, c0692sh, we0Var), c0692sh.f7116a);
    }
}
