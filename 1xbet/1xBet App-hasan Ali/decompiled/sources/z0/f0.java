package z0;

import B.C0075d;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import g0.C1962g;
import g0.C1965j;
import g0.InterfaceC1960e;
import r.C2315A;
import r0.InterfaceC2347d;
import t.C2397i;
import v0.C2531a;
import w0.AbstractC2540a;
import x0.InterfaceC2639z;
import z.C2723y;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2315A f21815a;

    static {
        C2315A c2315a = r.K.f18952a;
        f21815a = new C2315A();
    }

    public static final void a(b0.o oVar, int i, int i5) {
        if (!(oVar instanceof AbstractC2756m)) {
            b(oVar, i & oVar.f7164m, i5);
            return;
        }
        AbstractC2756m abstractC2756m = (AbstractC2756m) oVar;
        b(oVar, abstractC2756m.f21838y & i, i5);
        int i6 = (~abstractC2756m.f21838y) & i;
        for (b0.o oVar2 = abstractC2756m.f21839z; oVar2 != null; oVar2 = oVar2.f7167p) {
            a(oVar2, i6, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(b0.o oVar, int i, int i5) {
        if (i5 != 0 || oVar.l0()) {
            if ((i & 2) != 0 && (oVar instanceof InterfaceC2765w)) {
                AbstractC2749f.n((InterfaceC2765w) oVar);
                if (i5 == 2) {
                    AbstractC2749f.t(oVar, 2).V0();
                }
            }
            if ((i & 128) != 0 && (oVar instanceof InterfaceC2764v) && i5 != 2) {
                AbstractC2749f.v(oVar).E();
            }
            if ((i & 256) != 0 && (oVar instanceof InterfaceC2758o)) {
                if (i5 == 1) {
                    C2731G v4 = AbstractC2749f.v(oVar);
                    v4.b0(v4.f21622Y + 1);
                } else if (i5 == 2) {
                    AbstractC2749f.v(oVar).b0(r0.f21622Y - 1);
                }
                if (i5 != 2) {
                    C2731G v5 = AbstractC2749f.v(oVar);
                    if (v5.f21622Y != 0 && !v5.p() && !v5.q() && !v5.f21621X) {
                        A0.F f = (A0.F) AbstractC2734J.a(v5);
                        v3.g gVar = f.f228b0.f21727e;
                        gVar.getClass();
                        if (v5.f21622Y > 0) {
                            ((R.e) gVar.f20439l).c(v5);
                            v5.f21621X = true;
                        }
                        f.I(null);
                    }
                }
            }
            if ((i & 4) != 0 && (oVar instanceof InterfaceC2757n)) {
                AbstractC2749f.m((InterfaceC2757n) oVar);
            }
            if ((i & 8) != 0 && (oVar instanceof v0)) {
                AbstractC2749f.v(oVar).f21600A = true;
            }
            if ((i & 64) != 0 && (oVar instanceof q0)) {
                C2735K c2735k = AbstractC2749f.v((q0) oVar).f21613P;
                c2735k.f21663p.f21760z = true;
                U u5 = c2735k.f21664q;
                if (u5 != null) {
                    u5.f21706E = true;
                }
            }
            if ((i & 2048) != 0 && (oVar instanceof g0.n)) {
                g0.n nVar = (g0.n) oVar;
                C2750g.f21817b = null;
                nVar.F(C2750g.f21816a);
                if (C2750g.f21817b != null) {
                    b0.o oVar2 = (b0.o) nVar;
                    if (!oVar2.f7162k.f7175x) {
                        AbstractC2540a.b("visitChildren called on an unattached node");
                    }
                    R.e eVar = new R.e(new b0.o[16]);
                    b0.o oVar3 = oVar2.f7162k;
                    b0.o oVar4 = oVar3.f7167p;
                    if (oVar4 == null) {
                        AbstractC2749f.b(eVar, oVar3);
                    } else {
                        eVar.c(oVar4);
                    }
                    while (true) {
                        int i6 = eVar.f5108m;
                        if (i6 == 0) {
                            break;
                        }
                        b0.o oVar5 = (b0.o) eVar.l(i6 - 1);
                        if ((oVar5.f7165n & 1024) == 0) {
                            AbstractC2749f.b(eVar, oVar5);
                        } else {
                            while (true) {
                                if (oVar5 == null) {
                                    break;
                                }
                                if ((oVar5.f7164m & 1024) != 0) {
                                    R.e eVar2 = null;
                                    while (oVar5 != null) {
                                        if (oVar5 instanceof g0.s) {
                                            g0.s sVar = (g0.s) oVar5;
                                            C1962g c1962g = ((C1965j) ((A0.F) AbstractC2749f.w(sVar)).getFocusOwner()).f17032d;
                                            if (c1962g.f17025c.a(sVar)) {
                                                c1962g.a();
                                            }
                                        } else if ((oVar5.f7164m & 1024) != 0 && (oVar5 instanceof AbstractC2756m)) {
                                            int i7 = 0;
                                            for (b0.o oVar6 = ((AbstractC2756m) oVar5).f21839z; oVar6 != null; oVar6 = oVar6.f7167p) {
                                                if ((oVar6.f7164m & 1024) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        oVar5 = oVar6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new R.e(new b0.o[16]);
                                                        }
                                                        if (oVar5 != null) {
                                                            eVar2.c(oVar5);
                                                            oVar5 = null;
                                                        }
                                                        eVar2.c(oVar6);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        oVar5 = AbstractC2749f.f(eVar2);
                                    }
                                } else {
                                    oVar5 = oVar5.f7167p;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(oVar instanceof InterfaceC1960e)) {
                return;
            }
            InterfaceC1960e interfaceC1960e = (InterfaceC1960e) oVar;
            C1962g c1962g2 = ((C1965j) ((A0.F) AbstractC2749f.w(interfaceC1960e)).getFocusOwner()).f17032d;
            if (c1962g2.f17026d.a(interfaceC1960e)) {
                c1962g2.a();
            }
        }
    }

    public static final void c(b0.o oVar) {
        if (!oVar.f7175x) {
            AbstractC2540a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(oVar, -1, 0);
    }

    public static final int d(b0.n nVar) {
        int i = nVar instanceof InterfaceC2639z ? 3 : 1;
        if (nVar instanceof f0.e) {
            i |= 4;
        }
        if (nVar instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        if (nVar instanceof t0.x) {
            i |= 16;
        }
        if ((nVar instanceof C2723y) || (nVar instanceof y0.e)) {
            i |= 32;
        }
        if (nVar instanceof C0075d) {
            i |= 256;
        }
        if (nVar instanceof C2397i) {
            i |= 64;
        }
        return nVar instanceof A0.A0 ? 524288 | i : i;
    }

    public static final int e(b0.o oVar) {
        int i = oVar.f7164m;
        if (i != 0) {
            return i;
        }
        Class<?> cls = oVar.getClass();
        C2315A c2315a = f21815a;
        int d5 = c2315a.d(cls);
        if (d5 >= 0) {
            return c2315a.f18901c[d5];
        }
        int i5 = oVar instanceof InterfaceC2765w ? 3 : 1;
        if (oVar instanceof InterfaceC2757n) {
            i5 |= 4;
        }
        if (oVar instanceof v0) {
            i5 |= 8;
        }
        if (oVar instanceof s0) {
            i5 |= 16;
        }
        if (oVar instanceof y0.d) {
            i5 |= 32;
        }
        if (oVar instanceof q0) {
            i5 |= 64;
        }
        if (oVar instanceof InterfaceC2764v) {
            i5 |= 128;
        }
        if (oVar instanceof InterfaceC2758o) {
            i5 |= 256;
        }
        if (oVar instanceof g0.s) {
            i5 |= 1024;
        }
        if (oVar instanceof g0.n) {
            i5 |= 2048;
        }
        if (oVar instanceof InterfaceC1960e) {
            i5 |= 4096;
        }
        if (oVar instanceof InterfaceC2347d) {
            i5 |= 8192;
        }
        if (oVar instanceof C2531a) {
            i5 |= 16384;
        }
        if (oVar instanceof InterfaceC2754k) {
            i5 |= 32768;
        }
        if (oVar instanceof A0) {
            i5 |= 262144;
        }
        if (oVar instanceof A0.A0) {
            i5 |= 524288;
        }
        c2315a.h(i5, cls);
        return i5;
    }

    public static final int f(b0.o oVar) {
        if (!(oVar instanceof AbstractC2756m)) {
            return e(oVar);
        }
        AbstractC2756m abstractC2756m = (AbstractC2756m) oVar;
        int i = abstractC2756m.f21838y;
        for (b0.o oVar2 = abstractC2756m.f21839z; oVar2 != null; oVar2 = oVar2.f7167p) {
            i |= f(oVar2);
        }
        return i;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
