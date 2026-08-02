package z0;

import i0.InterfaceC2009n;
import l0.C2041b;
import w0.AbstractC2540a;
import x0.C2628n;

/* renamed from: z0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2761s extends e0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final J2.b f21855a0;

    /* renamed from: Y, reason: collision with root package name */
    public final x0 f21856Y;

    /* renamed from: Z, reason: collision with root package name */
    public r f21857Z;

    static {
        J2.b g5 = i0.F.g();
        g5.e(i0.p.f17291d);
        g5.k(1.0f);
        g5.l(1);
        f21855a0 = g5;
    }

    public C2761s(C2731G c2731g) {
        super(c2731g);
        x0 x0Var = new x0();
        x0Var.f7165n = 0;
        this.f21856Y = x0Var;
        x0Var.f7169r = this;
        this.f21857Z = c2731g.f21630q != null ? new r(this) : null;
    }

    @Override // z0.e0
    public final void D0() {
        if (this.f21857Z == null) {
            this.f21857Z = new r(this);
        }
    }

    @Override // z0.e0
    public final AbstractC2740P G0() {
        return this.f21857Z;
    }

    @Override // z0.e0
    public final b0.o I0() {
        return this.f21856Y;
    }

    @Override // x0.N
    public final int L(int i) {
        v3.g t5 = this.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.b(c2731g.f21612O.f21769d, c2731g.m(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r6v10, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // z0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(C2747d c2747d, long j5, C2760q c2760q, int i, boolean z3) {
        boolean z5;
        int i5;
        boolean z6;
        boolean z7;
        Object[] objArr;
        long j6 = j5;
        C2760q c2760q2 = c2760q;
        C2731G c2731g = this.f21812y;
        switch (c2747d.f21774k) {
            case 1:
                z5 = true;
                break;
            default:
                H0.j w5 = c2731g.w();
                z5 = !(w5 != null && w5.f2106n);
                break;
        }
        if (z5) {
            if (j1(j6)) {
                i5 = i;
                z6 = z3;
            } else {
                i5 = i;
                if (i5 == 1 && (Float.floatToRawIntBits(A0(j6, H0())) & Integer.MAX_VALUE) < 2139095040) {
                    z6 = false;
                }
            }
            z7 = true;
            if (z7) {
                return;
            }
            int i6 = c2760q2.f21852m;
            R.e x5 = c2731g.x();
            Object[] objArr2 = x5.f5106k;
            int i7 = x5.f5108m - 1;
            while (i7 >= 0) {
                C2731G c2731g2 = (C2731G) objArr2[i7];
                if (c2731g2.J()) {
                    switch (c2747d.f21774k) {
                        case 1:
                            objArr = objArr2;
                            c2731g2.A(j6, c2760q2, i5, z6);
                            break;
                        default:
                            c0 c0Var = c2731g2.f21612O;
                            objArr = objArr2;
                            c0Var.f21769d.N0(e0.f21794X, c0Var.f21769d.F0(j6), c2760q2, 1, z6);
                            c2760q2 = c2760q;
                            break;
                    }
                    long c5 = c2760q2.c();
                    if (AbstractC2749f.l(c5) < 0.0f && AbstractC2749f.q(c5) && !AbstractC2749f.p(c5)) {
                        e0 e0Var = c2731g2.f21612O.f21769d;
                        e0Var.getClass();
                        b0.o K02 = e0Var.K0(f0.g(16));
                        if (K02 != null && K02.f7175x) {
                            if (!K02.f7162k.f7175x) {
                                AbstractC2540a.b("visitLocalDescendants called on an unattached node");
                            }
                            b0.o oVar = K02.f7162k;
                            if ((oVar.f7165n & 16) != 0) {
                                while (oVar != null) {
                                    if ((oVar.f7164m & 16) != 0) {
                                        AbstractC2756m abstractC2756m = oVar;
                                        ?? r6 = 0;
                                        while (abstractC2756m != 0) {
                                            if (abstractC2756m instanceof s0) {
                                                if (((s0) abstractC2756m).R()) {
                                                    c2760q2.f21852m = c2760q2.f21850k.f18905b - 1;
                                                }
                                            } else if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                                b0.o oVar2 = abstractC2756m.f21839z;
                                                int i8 = 0;
                                                abstractC2756m = abstractC2756m;
                                                r6 = r6;
                                                while (oVar2 != null) {
                                                    if ((oVar2.f7164m & 16) != 0) {
                                                        i8++;
                                                        r6 = r6;
                                                        if (i8 == 1) {
                                                            abstractC2756m = oVar2;
                                                        } else {
                                                            if (r6 == 0) {
                                                                r6 = new R.e(new b0.o[16]);
                                                            }
                                                            if (abstractC2756m != 0) {
                                                                r6.c(abstractC2756m);
                                                                abstractC2756m = 0;
                                                            }
                                                            r6.c(oVar2);
                                                        }
                                                    }
                                                    oVar2 = oVar2.f7167p;
                                                    abstractC2756m = abstractC2756m;
                                                    r6 = r6;
                                                }
                                                if (i8 == 1) {
                                                }
                                            }
                                            abstractC2756m = AbstractC2749f.f(r6);
                                        }
                                    }
                                    oVar = oVar.f7167p;
                                }
                            }
                        }
                        c2760q2.f21852m = i6;
                        return;
                    }
                } else {
                    objArr = objArr2;
                }
                i7--;
                j6 = j5;
                i5 = i;
                objArr2 = objArr;
            }
            c2760q2.f21852m = i6;
            return;
        }
        i5 = i;
        z6 = z3;
        z7 = false;
        if (z7) {
        }
    }

    @Override // x0.N
    public final int T(int i) {
        v3.g t5 = this.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.j(c2731g.f21612O.f21769d, c2731g.m(), i);
    }

    @Override // x0.N
    public final int U(int i) {
        v3.g t5 = this.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.a(c2731g.f21612O.f21769d, c2731g.m(), i);
    }

    @Override // z0.e0
    public final void X0(InterfaceC2009n interfaceC2009n, C2041b c2041b) {
        C2731G c2731g = this.f21812y;
        n0 a5 = AbstractC2734J.a(c2731g);
        R.e x5 = c2731g.x();
        Object[] objArr = x5.f5106k;
        int i = x5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            if (c2731g2.J()) {
                c2731g2.i(interfaceC2009n, c2041b);
            }
        }
        if (((A0.F) a5).getShowLayoutBounds()) {
            long j5 = this.f20975m;
            interfaceC2009n.t(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, f21855a0);
        }
    }

    @Override // x0.Z
    public final void Z(long j5, float f, i4.c cVar) {
        Y0(j5, f, cVar);
        if (this.f21682t) {
            return;
        }
        this.f21812y.f21613P.f21663p.m0();
    }

    @Override // x0.N
    public final x0.Z e(long j5) {
        e0(j5);
        C2731G c2731g = this.f21812y;
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2731G) objArr[i5]).f21613P.f21663p.f21756v = EnumC2729E.f21594m;
        }
        b1(c2731g.f21605F.c(this, c2731g.m(), j5));
        T0();
        return this;
    }

    @Override // x0.N
    public final int f(int i) {
        v3.g t5 = this.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.h(c2731g.f21612O.f21769d, c2731g.m(), i);
    }

    @Override // z0.AbstractC2739O
    public final int g0(C2628n c2628n) {
        r rVar = this.f21857Z;
        if (rVar != null) {
            return rVar.g0(c2628n);
        }
        Y y5 = this.f21812y.f21613P.f21663p;
        EnumC2727C enumC2727C = y5.f21750p.f21653d;
        EnumC2727C enumC2727C2 = EnumC2727C.f21585k;
        C2732H c2732h = y5.f21738G;
        if (enumC2727C == enumC2727C2) {
            c2732h.f21643d = true;
            if (c2732h.f21641b) {
                y5.f21736E = true;
                y5.f21737F = true;
            }
        } else {
            c2732h.f21644e = true;
        }
        y5.r().f21683u = true;
        y5.v();
        y5.r().f21683u = false;
        Integer num = (Integer) c2732h.f21645g.get(c2628n);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
