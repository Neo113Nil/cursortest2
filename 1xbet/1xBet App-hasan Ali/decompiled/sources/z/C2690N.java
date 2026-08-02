package z;

import E.D0;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: z.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2690N extends b0.o implements InterfaceC2765w {

    /* renamed from: y, reason: collision with root package name */
    public float f21492y;

    /* renamed from: z, reason: collision with root package name */
    public float f21493z;

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        int f = n5.f(i);
        int b3 = !W0.f.a(this.f21493z, Float.NaN) ? L1.a.b(this.f21493z, abstractC2739O) : 0;
        return f < b3 ? b3 : f;
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        int T4 = n5.T(i);
        int b3 = !W0.f.a(this.f21492y, Float.NaN) ? L1.a.b(this.f21492y, abstractC2739O) : 0;
        return T4 < b3 ? b3 : T4;
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        int U4 = n5.U(i);
        int b3 = !W0.f.a(this.f21493z, Float.NaN) ? L1.a.b(this.f21493z, abstractC2739O) : 0;
        return U4 < b3 ? b3 : U4;
    }

    @Override // z0.InterfaceC2765w
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        int j6;
        int i = 0;
        if (W0.f.a(this.f21492y, Float.NaN) || W0.a.j(j5) != 0) {
            j6 = W0.a.j(j5);
        } else {
            j6 = q5.K(this.f21492y);
            int h3 = W0.a.h(j5);
            if (j6 > h3) {
                j6 = h3;
            }
            if (j6 < 0) {
                j6 = 0;
            }
        }
        int h4 = W0.a.h(j5);
        if (W0.f.a(this.f21493z, Float.NaN) || W0.a.i(j5) != 0) {
            i = W0.a.i(j5);
        } else {
            int K = q5.K(this.f21493z);
            int g5 = W0.a.g(j5);
            if (K > g5) {
                K = g5;
            }
            if (K >= 0) {
                i = K;
            }
        }
        Z e3 = n5.e(W0.b.a(j6, h4, i, W0.a.g(j5)));
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new D0(e3, 11));
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        int L5 = n5.L(i);
        int b3 = !W0.f.a(this.f21492y, Float.NaN) ? L1.a.b(this.f21492y, abstractC2739O) : 0;
        return L5 < b3 ? b3 : L5;
    }
}
