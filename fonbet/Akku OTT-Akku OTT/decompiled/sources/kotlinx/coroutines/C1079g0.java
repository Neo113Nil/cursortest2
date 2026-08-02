package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1079g0 extends B0 {
    public final InterfaceC1053e0 e;

    public C1079g0(InterfaceC1053e0 interfaceC1053e0) {
        this.e = interfaceC1053e0;
    }

    @Override // kotlinx.coroutines.B0
    public final boolean i() {
        return false;
    }

    @Override // kotlinx.coroutines.B0
    public final void j(Throwable th) {
        this.e.dispose();
    }
}
