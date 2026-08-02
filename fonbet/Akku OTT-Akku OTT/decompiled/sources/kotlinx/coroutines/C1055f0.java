package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1055f0 implements InterfaceC1094k {
    public final InterfaceC1053e0 a;

    public C1055f0(InterfaceC1053e0 interfaceC1053e0) {
        this.a = interfaceC1053e0;
    }

    @Override // kotlinx.coroutines.InterfaceC1094k
    public final void b(Throwable th) {
        this.a.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}
