package v;

import java.util.HashMap;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1650a extends C1659j {

    /* renamed from: w0, reason: collision with root package name */
    public int f16883w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f16884x0 = true;

    /* renamed from: y0, reason: collision with root package name */
    public int f16885y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f16886z0 = false;

    @Override // v.C1654e
    public final boolean B() {
        return this.f16886z0;
    }

    @Override // v.C1654e
    public final boolean C() {
        return this.f16886z0;
    }

    public final boolean V() {
        int i7;
        int i8;
        int i9;
        boolean z4 = true;
        int i10 = 0;
        while (true) {
            i7 = this.f17056v0;
            if (i10 >= i7) {
                break;
            }
            C1654e c1654e = this.f17055u0[i10];
            if ((this.f16884x0 || c1654e.c()) && ((((i8 = this.f16883w0) == 0 || i8 == 1) && !c1654e.B()) || (((i9 = this.f16883w0) == 2 || i9 == 3) && !c1654e.C()))) {
                z4 = false;
            }
            i10++;
        }
        if (!z4 || i7 <= 0) {
            return false;
        }
        int i11 = 0;
        boolean z7 = false;
        for (int i12 = 0; i12 < this.f17056v0; i12++) {
            C1654e c1654e2 = this.f17055u0[i12];
            if (this.f16884x0 || c1654e2.c()) {
                if (!z7) {
                    int i13 = this.f16883w0;
                    if (i13 == 0) {
                        i11 = c1654e2.j(2).d();
                    } else if (i13 == 1) {
                        i11 = c1654e2.j(4).d();
                    } else if (i13 == 2) {
                        i11 = c1654e2.j(3).d();
                    } else if (i13 == 3) {
                        i11 = c1654e2.j(5).d();
                    }
                    z7 = true;
                }
                int i14 = this.f16883w0;
                if (i14 == 0) {
                    i11 = Math.min(i11, c1654e2.j(2).d());
                } else if (i14 == 1) {
                    i11 = Math.max(i11, c1654e2.j(4).d());
                } else if (i14 == 2) {
                    i11 = Math.min(i11, c1654e2.j(3).d());
                } else if (i14 == 3) {
                    i11 = Math.max(i11, c1654e2.j(5).d());
                }
            }
        }
        int i15 = i11 + this.f16885y0;
        int i16 = this.f16883w0;
        if (i16 == 0 || i16 == 1) {
            K(i15, i15);
        } else {
            L(i15, i15);
        }
        this.f16886z0 = true;
        return true;
    }

    public final int W() {
        int i7 = this.f16883w0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    @Override // v.C1654e
    public final void b(t.c cVar, boolean z4) {
        boolean z7;
        int i7;
        C1652c[] c1652cArr = this.f16934R;
        C1652c c1652c = this.f16926J;
        c1652cArr[0] = c1652c;
        C1652c c1652c2 = this.f16927K;
        int i8 = 2;
        c1652cArr[2] = c1652c2;
        C1652c c1652c3 = this.f16928L;
        c1652cArr[1] = c1652c3;
        C1652c c1652c4 = this.f16929M;
        c1652cArr[3] = c1652c4;
        for (C1652c c1652c5 : c1652cArr) {
            c1652c5.f16911i = cVar.k(c1652c5);
        }
        int i9 = this.f16883w0;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        C1652c c1652c6 = c1652cArr[i9];
        if (!this.f16886z0) {
            V();
        }
        if (this.f16886z0) {
            this.f16886z0 = false;
            int i10 = this.f16883w0;
            if (i10 == 0 || i10 == 1) {
                cVar.d(c1652c.f16911i, this.f16944a0);
                cVar.d(c1652c3.f16911i, this.f16944a0);
                return;
            } else {
                if (i10 == 2 || i10 == 3) {
                    cVar.d(c1652c2.f16911i, this.f16946b0);
                    cVar.d(c1652c4.f16911i, this.f16946b0);
                    return;
                }
                return;
            }
        }
        for (int i11 = 0; i11 < this.f17056v0; i11++) {
            C1654e c1654e = this.f17055u0[i11];
            if (this.f16884x0 || c1654e.c()) {
                int i12 = this.f16883w0;
                EnumC1653d enumC1653d = EnumC1653d.f16914c;
                if (((i12 == 0 || i12 == 1) && c1654e.f16937U[0] == enumC1653d && c1654e.f16926J.f16908f != null && c1654e.f16928L.f16908f != null) || ((i12 == 2 || i12 == 3) && c1654e.f16937U[1] == enumC1653d && c1654e.f16927K.f16908f != null && c1654e.f16929M.f16908f != null)) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        boolean z8 = c1652c.g() || c1652c3.g();
        boolean z9 = c1652c2.g() || c1652c4.g();
        int i13 = (z7 || !(((i7 = this.f16883w0) == 0 && z8) || ((i7 == 2 && z9) || ((i7 == 1 && z8) || (i7 == 3 && z9))))) ? 4 : 5;
        int i14 = 0;
        while (i14 < this.f17056v0) {
            C1654e c1654e2 = this.f17055u0[i14];
            if (this.f16884x0 || c1654e2.c()) {
                t.f k7 = cVar.k(c1654e2.f16934R[this.f16883w0]);
                int i15 = this.f16883w0;
                C1652c c1652c7 = c1654e2.f16934R[i15];
                c1652c7.f16911i = k7;
                C1652c c1652c8 = c1652c7.f16908f;
                int i16 = (c1652c8 == null || c1652c8.f16906d != this) ? 0 : c1652c7.f16909g;
                if (i15 == 0 || i15 == i8) {
                    t.f fVar = c1652c6.f16911i;
                    int i17 = this.f16885y0 - i16;
                    t.b l7 = cVar.l();
                    t.f m7 = cVar.m();
                    m7.f16255d = 0;
                    l7.c(fVar, k7, m7, i17);
                    cVar.c(l7);
                } else {
                    t.f fVar2 = c1652c6.f16911i;
                    int i18 = this.f16885y0 + i16;
                    t.b l8 = cVar.l();
                    t.f m8 = cVar.m();
                    m8.f16255d = 0;
                    l8.b(fVar2, k7, m8, i18);
                    cVar.c(l8);
                }
                cVar.e(c1652c6.f16911i, k7, this.f16885y0 + i16, i13);
            }
            i14++;
            i8 = 2;
        }
        int i19 = this.f16883w0;
        if (i19 == 0) {
            cVar.e(c1652c3.f16911i, c1652c.f16911i, 0, 8);
            cVar.e(c1652c.f16911i, this.f16938V.f16928L.f16911i, 0, 4);
            cVar.e(c1652c.f16911i, this.f16938V.f16926J.f16911i, 0, 0);
            return;
        }
        if (i19 == 1) {
            cVar.e(c1652c.f16911i, c1652c3.f16911i, 0, 8);
            cVar.e(c1652c.f16911i, this.f16938V.f16926J.f16911i, 0, 4);
            cVar.e(c1652c.f16911i, this.f16938V.f16928L.f16911i, 0, 0);
        } else if (i19 == 2) {
            cVar.e(c1652c4.f16911i, c1652c2.f16911i, 0, 8);
            cVar.e(c1652c2.f16911i, this.f16938V.f16929M.f16911i, 0, 4);
            cVar.e(c1652c2.f16911i, this.f16938V.f16927K.f16911i, 0, 0);
        } else if (i19 == 3) {
            cVar.e(c1652c2.f16911i, c1652c4.f16911i, 0, 8);
            cVar.e(c1652c2.f16911i, this.f16938V.f16927K.f16911i, 0, 4);
            cVar.e(c1652c2.f16911i, this.f16938V.f16929M.f16911i, 0, 0);
        }
    }

    @Override // v.C1654e
    public final boolean c() {
        return true;
    }

    @Override // v.C1659j, v.C1654e
    public final void g(C1654e c1654e, HashMap hashMap) {
        super.g(c1654e, hashMap);
        C1650a c1650a = (C1650a) c1654e;
        this.f16883w0 = c1650a.f16883w0;
        this.f16884x0 = c1650a.f16884x0;
        this.f16885y0 = c1650a.f16885y0;
    }

    @Override // v.C1654e
    public final String toString() {
        String i7 = e1.k.i(new StringBuilder("[Barrier] "), this.f16962k0, " {");
        for (int i8 = 0; i8 < this.f17056v0; i8++) {
            C1654e c1654e = this.f17055u0[i8];
            if (i8 > 0) {
                i7 = e1.k.e(i7, ", ");
            }
            StringBuilder c3 = t.e.c(i7);
            c3.append(c1654e.f16962k0);
            i7 = c3.toString();
        }
        return e1.k.e(i7, "}");
    }
}
