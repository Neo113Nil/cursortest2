package kotlinx.coroutines;

import kotlin.jvm.JvmField;

/* renamed from: kotlinx.coroutines.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1111t extends B0 implements InterfaceC1109s {

    @JvmField
    public final InterfaceC1113u e;

    public C1111t(InterfaceC1113u interfaceC1113u) {
        this.e = interfaceC1113u;
    }

    @Override // kotlinx.coroutines.InterfaceC1109s
    public final boolean a(Throwable th) {
        return h().w(th);
    }

    @Override // kotlinx.coroutines.B0
    public final boolean i() {
        return true;
    }

    @Override // kotlinx.coroutines.B0
    public final void j(Throwable th) {
        this.e.x(h());
    }
}
