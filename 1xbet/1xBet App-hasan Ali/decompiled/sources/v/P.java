package v;

import z0.A0;
import z0.AbstractC2749f;
import z0.InterfaceC2758o;

/* loaded from: classes.dex */
public final class P extends b0.o implements A0, InterfaceC2758o {

    /* renamed from: A, reason: collision with root package name */
    public static final h0 f20176A = new h0();

    /* renamed from: y, reason: collision with root package name */
    public boolean f20177y;

    /* renamed from: z, reason: collision with root package name */
    public z0.e0 f20178z;

    @Override // z0.InterfaceC2758o
    public final void T(z0.e0 e0Var) {
        Q y02;
        this.f20178z = e0Var;
        if (this.f20177y) {
            if (!e0Var.I0().f7175x) {
                Q y03 = y0();
                if (y03 != null) {
                    y03.y0(null);
                    return;
                }
                return;
            }
            z0.e0 e0Var2 = this.f20178z;
            if (e0Var2 == null || !e0Var2.I0().f7175x || (y02 = y0()) == null) {
                return;
            }
            y02.y0(this.f20178z);
        }
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // z0.A0
    public final Object o() {
        return f20176A;
    }

    public final Q y0() {
        if (!this.f7175x) {
            return null;
        }
        A0 j5 = AbstractC2749f.j(this, Q.f20179z);
        if (j5 instanceof Q) {
            return (Q) j5;
        }
        return null;
    }
}
