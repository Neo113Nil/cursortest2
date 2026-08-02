package x0;

import h0.C1988b;
import h0.C1989c;
import w0.AbstractC2540a;
import z0.AbstractC2740P;

/* loaded from: classes.dex */
public final class M implements InterfaceC2637x {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2740P f20959k;

    public M(AbstractC2740P abstractC2740P) {
        this.f20959k = abstractC2740P;
    }

    @Override // x0.InterfaceC2637x
    public final long E(long j5) {
        return C1988b.h(this.f20959k.f21691y.E(j5), a());
    }

    @Override // x0.InterfaceC2637x
    public final boolean F() {
        return this.f20959k.f21691y.I0().f7175x;
    }

    @Override // x0.InterfaceC2637x
    public final void G(float[] fArr) {
        this.f20959k.f21691y.G(fArr);
    }

    @Override // x0.InterfaceC2637x
    public final long I() {
        AbstractC2740P abstractC2740P = this.f20959k;
        return (abstractC2740P.f20973k << 32) | (abstractC2740P.f20974l & 4294967295L);
    }

    @Override // x0.InterfaceC2637x
    public final long J(long j5) {
        return this.f20959k.f21691y.J(C1988b.h(j5, a()));
    }

    @Override // x0.InterfaceC2637x
    public final void R(InterfaceC2637x interfaceC2637x, float[] fArr) {
        this.f20959k.f21691y.R(interfaceC2637x, fArr);
    }

    public final long a() {
        AbstractC2740P abstractC2740P = this.f20959k;
        AbstractC2740P i = f0.i(abstractC2740P);
        return C1988b.g(c(i.f21688B, 0L), abstractC2740P.f21691y.R0(i.f21691y, 0L));
    }

    @Override // x0.InterfaceC2637x
    public final long b(long j5) {
        return this.f20959k.f21691y.b(C1988b.h(0L, a()));
    }

    public final long c(InterfaceC2637x interfaceC2637x, long j5) {
        boolean z3 = interfaceC2637x instanceof M;
        AbstractC2740P abstractC2740P = this.f20959k;
        if (!z3) {
            AbstractC2740P i = f0.i(abstractC2740P);
            long c5 = c(i.f21688B, j5);
            long j6 = i.f21692z;
            long g5 = C1988b.g(c5, (4294967295L & Float.floatToRawIntBits((int) (j6 & 4294967295L))) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32));
            z0.e0 e0Var = i.f21691y;
            if (!e0Var.I0().f7175x) {
                AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            e0Var.S0();
            z0.e0 e0Var2 = e0Var.f21795A;
            if (e0Var2 != null) {
                e0Var = e0Var2;
            }
            return C1988b.h(g5, e0Var.R0(interfaceC2637x, 0L));
        }
        AbstractC2740P abstractC2740P2 = ((M) interfaceC2637x).f20959k;
        abstractC2740P2.f21691y.S0();
        AbstractC2740P G02 = abstractC2740P.f21691y.E0(abstractC2740P2.f21691y).G0();
        if (G02 != null) {
            long b3 = W0.j.b(W0.j.c(abstractC2740P2.A0(G02, false), G4.l.K(j5)), abstractC2740P.A0(G02, false));
            return (Float.floatToRawIntBits((int) (b3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b3 & 4294967295L)) & 4294967295L);
        }
        AbstractC2740P i5 = f0.i(abstractC2740P2);
        long c6 = W0.j.c(W0.j.c(abstractC2740P2.A0(i5, false), i5.f21692z), G4.l.K(j5));
        AbstractC2740P i6 = f0.i(abstractC2740P);
        long b5 = W0.j.b(c6, W0.j.c(abstractC2740P.A0(i6, false), i6.f21692z));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b5 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b5 & 4294967295L)) & 4294967295L;
        z0.e0 e0Var3 = i6.f21691y.f21795A;
        kotlin.jvm.internal.l.c(e0Var3);
        z0.e0 e0Var4 = i5.f21691y.f21795A;
        kotlin.jvm.internal.l.c(e0Var4);
        return e0Var3.R0(e0Var4, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // x0.InterfaceC2637x
    public final long g(long j5) {
        return C1988b.h(this.f20959k.f21691y.g(j5), a());
    }

    @Override // x0.InterfaceC2637x
    public final long h(long j5) {
        return this.f20959k.f21691y.h(C1988b.h(j5, a()));
    }

    @Override // x0.InterfaceC2637x
    public final InterfaceC2637x l() {
        AbstractC2740P G02;
        if (!F()) {
            AbstractC2540a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        z0.e0 e0Var = this.f20959k.f21691y.f21812y.f21612O.f21769d.f21795A;
        if (e0Var == null || (G02 = e0Var.G0()) == null) {
            return null;
        }
        return G02.f21688B;
    }

    @Override // x0.InterfaceC2637x
    public final long o(InterfaceC2637x interfaceC2637x, long j5) {
        return c(interfaceC2637x, j5);
    }

    @Override // x0.InterfaceC2637x
    public final C1989c s(InterfaceC2637x interfaceC2637x, boolean z3) {
        return this.f20959k.f21691y.s(interfaceC2637x, z3);
    }
}
