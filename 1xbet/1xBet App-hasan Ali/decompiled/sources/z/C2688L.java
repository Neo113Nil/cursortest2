package z;

import E.D0;
import x0.InterfaceC2632s;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: z.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2688L extends b0.o implements InterfaceC2765w {

    /* renamed from: A, reason: collision with root package name */
    public float f21485A;

    /* renamed from: B, reason: collision with root package name */
    public float f21486B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21487C;

    /* renamed from: y, reason: collision with root package name */
    public float f21488y;

    /* renamed from: z, reason: collision with root package name */
    public float f21489z;

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        long y02 = y0(abstractC2739O);
        return W0.a.e(y02) ? W0.a.g(y02) : W0.b.f(n5.f(i), y02);
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        long y02 = y0(abstractC2739O);
        return W0.a.f(y02) ? W0.a.h(y02) : W0.b.g(n5.T(i), y02);
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        long y02 = y0(abstractC2739O);
        return W0.a.e(y02) ? W0.a.g(y02) : W0.b.f(n5.U(i), y02);
    }

    @Override // z0.InterfaceC2765w
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        int j6;
        int h3;
        int i;
        int g5;
        long a5;
        long y02 = y0(q5);
        if (this.f21487C) {
            a5 = W0.b.e(j5, y02);
        } else {
            if (W0.f.a(this.f21488y, Float.NaN)) {
                j6 = W0.a.j(j5);
                int h4 = W0.a.h(y02);
                if (j6 > h4) {
                    j6 = h4;
                }
            } else {
                j6 = W0.a.j(y02);
            }
            if (W0.f.a(this.f21485A, Float.NaN)) {
                h3 = W0.a.h(j5);
                int j7 = W0.a.j(y02);
                if (h3 < j7) {
                    h3 = j7;
                }
            } else {
                h3 = W0.a.h(y02);
            }
            if (W0.f.a(this.f21489z, Float.NaN)) {
                i = W0.a.i(j5);
                int g6 = W0.a.g(y02);
                if (i > g6) {
                    i = g6;
                }
            } else {
                i = W0.a.i(y02);
            }
            if (W0.f.a(this.f21486B, Float.NaN)) {
                g5 = W0.a.g(j5);
                int i5 = W0.a.i(y02);
                if (g5 < i5) {
                    g5 = i5;
                }
            } else {
                g5 = W0.a.g(y02);
            }
            a5 = W0.b.a(j6, h3, i, g5);
        }
        Z e3 = n5.e(a5);
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new D0(e3, 10));
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        long y02 = y0(abstractC2739O);
        return W0.a.f(y02) ? W0.a.h(y02) : W0.b.g(n5.L(i), y02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y0(InterfaceC2632s interfaceC2632s) {
        int i;
        int i5;
        int i6;
        int i7 = 0;
        if (W0.f.a(this.f21485A, Float.NaN)) {
            i = Integer.MAX_VALUE;
        } else {
            i = interfaceC2632s.K(this.f21485A);
            if (i < 0) {
                i = 0;
            }
        }
        if (W0.f.a(this.f21486B, Float.NaN)) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = interfaceC2632s.K(this.f21486B);
            if (i5 < 0) {
                i5 = 0;
            }
        }
        if (!W0.f.a(this.f21488y, Float.NaN)) {
            i6 = interfaceC2632s.K(this.f21488y);
            if (i6 > i) {
                i6 = i;
            }
            if (i6 < 0) {
                i6 = 0;
            }
        }
        i6 = 0;
        if (!W0.f.a(this.f21489z, Float.NaN)) {
            int K = interfaceC2632s.K(this.f21489z);
            if (K > i5) {
                K = i5;
            }
            if (K < 0) {
                K = 0;
            }
            if (K != Integer.MAX_VALUE) {
                i7 = K;
            }
        }
        return W0.b.a(i6, i, i7, i5);
    }
}
