package E;

import K0.C0203h;
import P0.C0331a;
import a.AbstractC0444a;
import com.google.android.gms.internal.ads.C1639u7;
import java.util.List;
import r0.AbstractC2346c;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1244l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1245m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1246n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1247o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i, p0 p0Var, kotlin.jvm.internal.s sVar) {
        super(1);
        this.f1245m = i;
        this.f1246n = p0Var;
        this.f1247o = sVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // i4.c
    public final Object c(Object obj) {
        Integer d5;
        Integer c5;
        Integer c6;
        Integer d6;
        K0.L l5;
        K0.L l6;
        F0 f02;
        F0 f03;
        K0.L l7;
        K0.L l8;
        F0 f04;
        F0 f05;
        Integer c7;
        Integer d7;
        Integer d8;
        Integer c8;
        G.v vVar;
        W3.o oVar = W3.o.f6046a;
        Object obj2 = this.f1247o;
        int i = this.f1245m;
        Object obj3 = this.f1246n;
        int i5 = 4;
        switch (this.f1244l) {
            case 0:
                I.L l9 = (I.L) obj;
                P0.w wVar = null;
                p0 p0Var = (p0) obj3;
                switch (AbstractC2462i.b(i)) {
                    case 0:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (!K0.N.b(l9.f)) {
                                if (!l9.e()) {
                                    int d9 = K0.N.d(l9.f);
                                    l9.o(d9, d9);
                                    break;
                                } else {
                                    int e3 = K0.N.e(l9.f);
                                    l9.o(e3, e3);
                                    break;
                                }
                            } else {
                                l9.h();
                                break;
                            }
                        }
                        break;
                    case 1:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (!K0.N.b(l9.f)) {
                                if (!l9.e()) {
                                    int e5 = K0.N.e(l9.f);
                                    l9.o(e5, e5);
                                    break;
                                } else {
                                    int d10 = K0.N.d(l9.f);
                                    l9.o(d10, d10);
                                    break;
                                }
                            } else {
                                l9.k();
                                break;
                            }
                        }
                        break;
                    case 2:
                        I.V v4 = l9.f2416e;
                        v4.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (!l9.e()) {
                                v4.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (d5 = l9.d()) != null) {
                                    int intValue = d5.intValue();
                                    l9.o(intValue, intValue);
                                    break;
                                }
                            } else {
                                v4.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (c5 = l9.c()) != null) {
                                    int intValue2 = c5.intValue();
                                    l9.o(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        I.V v5 = l9.f2416e;
                        v5.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (!l9.e()) {
                                v5.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (c6 = l9.c()) != null) {
                                    int intValue3 = c6.intValue();
                                    l9.o(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                v5.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (d6 = l9.d()) != null) {
                                    int intValue4 = d6.intValue();
                                    l9.o(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        l9.i();
                        break;
                    case 5:
                        l9.j();
                        break;
                    case 6:
                        l9.m();
                        break;
                    case 7:
                        l9.l();
                        break;
                    case 8:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (!l9.e()) {
                                l9.l();
                                break;
                            } else {
                                l9.m();
                                break;
                            }
                        }
                        break;
                    case 9:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (!l9.e()) {
                                l9.m();
                                break;
                            } else {
                                l9.l();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (l9.f2417g.f2829l.length() > 0 && (l5 = l9.f2414c) != null) {
                            int f = l9.f(l5, -1);
                            l9.o(f, f);
                            break;
                        }
                        break;
                    case 11:
                        if (l9.f2417g.f2829l.length() > 0 && (l6 = l9.f2414c) != null) {
                            int f5 = l9.f(l6, 1);
                            l9.o(f5, f5);
                            break;
                        }
                        break;
                    case 12:
                        if (l9.f2417g.f2829l.length() > 0 && (f02 = l9.i) != null) {
                            int g5 = l9.g(f02, -1);
                            l9.o(g5, g5);
                            break;
                        }
                        break;
                    case 13:
                        if (l9.f2417g.f2829l.length() > 0 && (f03 = l9.i) != null) {
                            int g6 = l9.g(f03, 1);
                            l9.o(g6, g6);
                            break;
                        }
                        break;
                    case 14:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            l9.o(0, 0);
                            break;
                        }
                        break;
                    case 15:
                        l9.f2416e.f2454a = null;
                        C0203h c0203h = l9.f2417g;
                        if (c0203h.f2829l.length() > 0) {
                            int length = c0203h.f2829l.length();
                            l9.o(length, length);
                            break;
                        }
                        break;
                    case 16:
                        p0Var.f1249b.b(false);
                        break;
                    case 17:
                        p0Var.f1249b.l();
                        break;
                    case 18:
                        p0Var.f1249b.d();
                        break;
                    case 19:
                        List a5 = l9.a(C0099g.f1148q);
                        if (a5 != null) {
                            p0Var.a(a5);
                            break;
                        }
                        break;
                    case 20:
                        List a6 = l9.a(C0099g.f1149r);
                        if (a6 != null) {
                            p0Var.a(a6);
                            break;
                        }
                        break;
                    case C1639u7.zzm /* 21 */:
                        List a7 = l9.a(C0099g.f1150s);
                        if (a7 != null) {
                            p0Var.a(a7);
                            break;
                        }
                        break;
                    case 22:
                        List a8 = l9.a(C0099g.f1151t);
                        if (a8 != null) {
                            p0Var.a(a8);
                            break;
                        }
                        break;
                    case 23:
                        List a9 = l9.a(C0099g.f1152u);
                        if (a9 != null) {
                            p0Var.a(a9);
                            break;
                        }
                        break;
                    case 24:
                        List a10 = l9.a(C0099g.f1153v);
                        if (a10 != null) {
                            p0Var.a(a10);
                            break;
                        }
                        break;
                    case 25:
                        l9.f2416e.f2454a = null;
                        C0203h c0203h2 = l9.f2417g;
                        if (c0203h2.f2829l.length() > 0) {
                            l9.o(0, c0203h2.f2829l.length());
                            break;
                        }
                        break;
                    case 26:
                        l9.h();
                        l9.n();
                        break;
                    case 27:
                        l9.k();
                        l9.n();
                        break;
                    case 28:
                        if (l9.f2417g.f2829l.length() > 0 && (l7 = l9.f2414c) != null) {
                            int f6 = l9.f(l7, -1);
                            l9.o(f6, f6);
                        }
                        l9.n();
                        break;
                    case 29:
                        if (l9.f2417g.f2829l.length() > 0 && (l8 = l9.f2414c) != null) {
                            int f7 = l9.f(l8, 1);
                            l9.o(f7, f7);
                        }
                        l9.n();
                        break;
                    case 30:
                        if (l9.f2417g.f2829l.length() > 0 && (f04 = l9.i) != null) {
                            int g7 = l9.g(f04, -1);
                            l9.o(g7, g7);
                        }
                        l9.n();
                        break;
                    case 31:
                        if (l9.f2417g.f2829l.length() > 0 && (f05 = l9.i) != null) {
                            int g8 = l9.g(f05, 1);
                            l9.o(g8, g8);
                        }
                        l9.n();
                        break;
                    case 32:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            l9.o(0, 0);
                        }
                        l9.n();
                        break;
                    case 33:
                        l9.f2416e.f2454a = null;
                        C0203h c0203h3 = l9.f2417g;
                        if (c0203h3.f2829l.length() > 0) {
                            int length2 = c0203h3.f2829l.length();
                            l9.o(length2, length2);
                        }
                        l9.n();
                        break;
                    case 34:
                        I.V v6 = l9.f2416e;
                        v6.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (l9.e()) {
                                v6.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (d7 = l9.d()) != null) {
                                    int intValue5 = d7.intValue();
                                    l9.o(intValue5, intValue5);
                                }
                            } else {
                                v6.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (c7 = l9.c()) != null) {
                                    int intValue6 = c7.intValue();
                                    l9.o(intValue6, intValue6);
                                }
                            }
                        }
                        l9.n();
                        break;
                    case 35:
                        I.V v7 = l9.f2416e;
                        v7.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (l9.e()) {
                                v7.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (c8 = l9.c()) != null) {
                                    int intValue7 = c8.intValue();
                                    l9.o(intValue7, intValue7);
                                }
                            } else {
                                v7.f2454a = null;
                                if (l9.f2417g.f2829l.length() > 0 && (d8 = l9.d()) != null) {
                                    int intValue8 = d8.intValue();
                                    l9.o(intValue8, intValue8);
                                }
                            }
                        }
                        l9.n();
                        break;
                    case 36:
                        l9.i();
                        l9.n();
                        break;
                    case 37:
                        l9.j();
                        l9.n();
                        break;
                    case 38:
                        l9.m();
                        l9.n();
                        break;
                    case 39:
                        l9.l();
                        l9.n();
                        break;
                    case 40:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (l9.e()) {
                                l9.m();
                            } else {
                                l9.l();
                            }
                        }
                        l9.n();
                        break;
                    case 41:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            if (l9.e()) {
                                l9.l();
                            } else {
                                l9.m();
                            }
                        }
                        l9.n();
                        break;
                    case 42:
                        l9.f2416e.f2454a = null;
                        if (l9.f2417g.f2829l.length() > 0) {
                            long j5 = l9.f;
                            int i6 = K0.N.f2802c;
                            int i7 = (int) (j5 & 4294967295L);
                            l9.o(i7, i7);
                            break;
                        }
                        break;
                    case 43:
                        if (!p0Var.f1252e) {
                            p0Var.a(AbstractC2346c.A(new C0331a("\n", 1)));
                            break;
                        } else {
                            p0Var.f1248a.f1106u.c(new P0.j(p0Var.f1257l));
                            break;
                        }
                    case 44:
                        if (!p0Var.f1252e) {
                            p0Var.a(AbstractC2346c.A(new C0331a("\t", 1)));
                            break;
                        } else {
                            ((kotlin.jvm.internal.s) obj2).f17620k = false;
                            break;
                        }
                    case 45:
                        G0 g02 = p0Var.f1254h;
                        if (g02 != null) {
                            g02.a(P0.w.a(l9.f2418h, l9.f2417g, l9.f, 4));
                        }
                        G0 g03 = p0Var.f1254h;
                        if (g03 != null) {
                            G.v vVar2 = g03.f1033a;
                            if (vVar2 != null && (vVar = (G.v) vVar2.f1749l) != null) {
                                g03.f1033a = vVar;
                                g03.f1035c -= ((P0.w) vVar2.f1750m).f4679a.f2829l.length();
                                g03.f1034b = new G.v(i5, g03.f1034b, (P0.w) vVar2.f1750m);
                                wVar = (P0.w) vVar.f1750m;
                            }
                            if (wVar != null) {
                                p0Var.f1256k.c(wVar);
                                break;
                            }
                        }
                        break;
                    case 46:
                        G0 g04 = p0Var.f1254h;
                        if (g04 != null) {
                            G.v vVar3 = g04.f1034b;
                            if (vVar3 != null) {
                                g04.f1034b = (G.v) vVar3.f1749l;
                                P0.w wVar2 = (P0.w) vVar3.f1750m;
                                g04.f1033a = new G.v(i5, g04.f1033a, wVar2);
                                g04.f1035c = wVar2.f4679a.f2829l.length() + g04.f1035c;
                                wVar = (P0.w) vVar3.f1750m;
                            }
                            if (wVar != null) {
                                p0Var.f1256k.c(wVar);
                                break;
                            }
                        }
                        break;
                }
            default:
                x0.Y y5 = (x0.Y) obj;
                v.x0 x0Var = (v.x0) obj3;
                int i8 = -AbstractC0444a.t(x0Var.f20329y.f20322a.h(), 0, i);
                boolean z3 = x0Var.f20330z;
                int i9 = z3 ? 0 : i8;
                if (!z3) {
                    i8 = 0;
                }
                y5.f20972k = true;
                x0.Y.k(y5, (x0.Z) obj2, i9, i8);
                y5.f20972k = false;
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(v.x0 x0Var, int i, x0.Z z3) {
        super(1);
        this.f1246n = x0Var;
        this.f1245m = i;
        this.f1247o = z3;
    }
}
