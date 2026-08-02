package g0;

import A.C0005e;
import A.E;
import A0.C0040k0;
import A0.F;
import B.C0080i;
import B.C0082k;
import B.C0083l;
import P.C0299j0;
import a.AbstractC0444a;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import e2.C1930k;
import h0.C1989c;
import kotlin.jvm.internal.w;
import l4.C2062d;
import w0.AbstractC2540a;
import x0.AbstractC2620f;
import x0.f0;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.c0;
import z0.e0;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1961f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f17022a = new int[2];

    public static final boolean A(int i, A.s sVar, s sVar2, C1989c c1989c) {
        s h3;
        R.e eVar = new R.e(new s[16]);
        if (!sVar2.f7162k.f7175x) {
            AbstractC2540a.b("visitChildren called on an unattached node");
        }
        R.e eVar2 = new R.e(new b0.o[16]);
        b0.o oVar = sVar2.f7162k;
        b0.o oVar2 = oVar.f7167p;
        if (oVar2 == null) {
            AbstractC2749f.b(eVar2, oVar);
        } else {
            eVar2.c(oVar2);
        }
        while (true) {
            int i5 = eVar2.f5108m;
            if (i5 == 0) {
                break;
            }
            b0.o oVar3 = (b0.o) eVar2.l(i5 - 1);
            if ((oVar3.f7165n & 1024) == 0) {
                AbstractC2749f.b(eVar2, oVar3);
            } else {
                while (true) {
                    if (oVar3 == null) {
                        break;
                    }
                    if ((oVar3.f7164m & 1024) != 0) {
                        R.e eVar3 = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof s) {
                                s sVar3 = (s) oVar3;
                                if (sVar3.f7175x) {
                                    eVar.c(sVar3);
                                }
                            } else if ((oVar3.f7164m & 1024) != 0 && (oVar3 instanceof AbstractC2756m)) {
                                int i6 = 0;
                                for (b0.o oVar4 = ((AbstractC2756m) oVar3).f21839z; oVar4 != null; oVar4 = oVar4.f7167p) {
                                    if ((oVar4.f7164m & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new R.e(new b0.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                eVar3.c(oVar3);
                                                oVar3 = null;
                                            }
                                            eVar3.c(oVar4);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            oVar3 = AbstractC2749f.f(eVar3);
                        }
                    } else {
                        oVar3 = oVar3.f7167p;
                    }
                }
            }
        }
        while (eVar.f5108m != 0 && (h3 = h(eVar, c1989c, i)) != null) {
            if (h3.z0().f17040a) {
                return ((Boolean) sVar.c(h3)).booleanValue();
            }
            if (l(i, sVar, h3, c1989c)) {
                return true;
            }
            eVar.k(h3);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean B(s sVar, s sVar2, int i, A.s sVar3) {
        b0.o oVar;
        C2731G v4;
        c0 c0Var;
        if (sVar.A0() != r.f17055l) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        s[] sVarArr = new s[16];
        if (!sVar.f7162k.f7175x) {
            AbstractC2540a.b("visitChildren called on an unattached node");
        }
        R.e eVar = new R.e(new b0.o[16]);
        b0.o oVar2 = sVar.f7162k;
        b0.o oVar3 = oVar2.f7167p;
        if (oVar3 == null) {
            AbstractC2749f.b(eVar, oVar2);
        } else {
            eVar.c(oVar3);
        }
        int i5 = 0;
        while (true) {
            int i6 = eVar.f5108m;
            oVar = null;
            if (i6 == 0) {
                break;
            }
            b0.o oVar4 = (b0.o) eVar.l(i6 - 1);
            if ((oVar4.f7165n & 1024) == 0) {
                AbstractC2749f.b(eVar, oVar4);
            } else {
                while (true) {
                    if (oVar4 == null) {
                        break;
                    }
                    if ((oVar4.f7164m & 1024) != 0) {
                        R.e eVar2 = null;
                        while (oVar4 != null) {
                            if (oVar4 instanceof s) {
                                s sVar4 = (s) oVar4;
                                int i7 = i5 + 1;
                                if (sVarArr.length < i7) {
                                    int length = sVarArr.length;
                                    ?? r11 = new Object[Math.max(i7, length * 2)];
                                    System.arraycopy(sVarArr, 0, r11, 0, length);
                                    sVarArr = r11;
                                }
                                sVarArr[i5] = sVar4;
                                i5 = i7;
                            } else if ((oVar4.f7164m & 1024) != 0 && (oVar4 instanceof AbstractC2756m)) {
                                int i8 = 0;
                                for (b0.o oVar5 = ((AbstractC2756m) oVar4).f21839z; oVar5 != null; oVar5 = oVar5.f7167p) {
                                    if ((oVar5.f7164m & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            oVar4 = oVar5;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new R.e(new b0.o[16]);
                                            }
                                            if (oVar4 != null) {
                                                eVar2.c(oVar4);
                                                oVar4 = null;
                                            }
                                            eVar2.c(oVar5);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            oVar4 = AbstractC2749f.f(eVar2);
                        }
                    } else {
                        oVar4 = oVar4.f7167p;
                    }
                }
            }
        }
        X3.l.I0(sVarArr, t.f17063k, 0, i5);
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            C2062d f02 = AbstractC0444a.f0(0, i5);
            int i9 = f02.f17851k;
            int i10 = f02.f17852l;
            if (i9 <= i10) {
                boolean z3 = false;
                while (true) {
                    if (z3) {
                        s sVar5 = sVarArr[i10];
                        if (r(sVar5) && a(sVar5, sVar3)) {
                            break;
                        }
                    }
                    if (kotlin.jvm.internal.l.a(sVarArr[i10], sVar2)) {
                        z3 = true;
                    }
                    if (i10 == i9) {
                        break;
                    }
                    i10--;
                }
                return true;
            }
            if (i != 1) {
                if (!sVar.f7162k.f7175x) {
                }
                b0.o oVar6 = sVar.f7162k.f7166o;
                v4 = AbstractC2749f.v(sVar);
                loop5: while (true) {
                    if (v4 == null) {
                    }
                }
                if (oVar != null) {
                }
            }
            return false;
        }
        C2062d f03 = AbstractC0444a.f0(0, i5);
        int i11 = f03.f17851k;
        int i12 = f03.f17852l;
        if (i11 <= i12) {
            boolean z5 = false;
            while (true) {
                if (z5) {
                    s sVar6 = sVarArr[i11];
                    if (r(sVar6) && k(sVar6, sVar3)) {
                        break;
                    }
                }
                if (kotlin.jvm.internal.l.a(sVarArr[i11], sVar2)) {
                    z5 = true;
                }
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
            return true;
        }
        if (i != 1 && sVar.z0().f17040a) {
            if (!sVar.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar62 = sVar.f7162k.f7166o;
            v4 = AbstractC2749f.v(sVar);
            loop5: while (true) {
                if (v4 == null) {
                    break;
                }
                if ((v4.f21612O.f.f7165n & 1024) != 0) {
                    while (oVar62 != null) {
                        if ((oVar62.f7164m & 1024) != 0) {
                            b0.o oVar7 = oVar62;
                            R.e eVar3 = null;
                            while (oVar7 != null) {
                                if (oVar7 instanceof s) {
                                    oVar = oVar7;
                                    break loop5;
                                }
                                if ((oVar7.f7164m & 1024) != 0 && (oVar7 instanceof AbstractC2756m)) {
                                    int i13 = 0;
                                    for (b0.o oVar8 = ((AbstractC2756m) oVar7).f21839z; oVar8 != null; oVar8 = oVar8.f7167p) {
                                        if ((oVar8.f7164m & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                oVar7 = oVar8;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new R.e(new b0.o[16]);
                                                }
                                                if (oVar7 != null) {
                                                    eVar3.c(oVar7);
                                                    oVar7 = null;
                                                }
                                                eVar3.c(oVar8);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                oVar7 = AbstractC2749f.f(eVar3);
                            }
                        }
                        oVar62 = oVar62.f7166o;
                    }
                }
                v4 = v4.u();
                oVar62 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
            }
            if (oVar != null) {
                return ((Boolean) sVar3.c(sVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer C(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final C1959d D(int i) {
        if (i == 1) {
            return new C1959d(2);
        }
        if (i == 2) {
            return new C1959d(1);
        }
        if (i == 17) {
            return new C1959d(3);
        }
        if (i == 33) {
            return new C1959d(5);
        }
        if (i == 66) {
            return new C1959d(4);
        }
        if (i != 130) {
            return null;
        }
        return new C1959d(6);
    }

    public static final Boolean E(int i, A.s sVar, s sVar2, C1989c c1989c) {
        int ordinal = sVar2.A0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s n5 = n(sVar2);
                if (n5 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n5.A0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean E5 = E(i, sVar, n5, c1989c);
                        if (!kotlin.jvm.internal.l.a(E5, Boolean.FALSE)) {
                            return E5;
                        }
                        if (c1989c == null) {
                            if (n5.A0() != r.f17055l) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            s g5 = g(n5);
                            if (g5 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c1989c = j(g5);
                        }
                        return Boolean.valueOf(l(i, sVar, sVar2, c1989c));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new D2.e();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c1989c == null) {
                    c1989c = j(n5);
                }
                return Boolean.valueOf(l(i, sVar, sVar2, c1989c));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return sVar2.z0().f17040a ? (Boolean) sVar.c(sVar2) : c1989c == null ? Boolean.valueOf(i(sVar2, i, sVar)) : Boolean.valueOf(A(i, sVar, sVar2, c1989c));
                }
                throw new D2.e();
            }
        }
        return Boolean.valueOf(i(sVar2, i, sVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(s sVar, A.s sVar2) {
        int ordinal = sVar.A0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s n5 = n(sVar);
                if (n5 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n5.A0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new D2.e();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (a(n5, sVar2) || m(sVar, n5, 2, sVar2) || (n5.z0().f17040a && ((Boolean) sVar2.c(n5)).booleanValue())) {
                        return true;
                    }
                }
                return m(sVar, n5, 2, sVar2);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new D2.e();
                }
                if (!w(sVar, sVar2)) {
                    if (!(sVar.z0().f17040a ? ((Boolean) sVar2.c(sVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return w(sVar, sVar2);
    }

    public static final boolean b(C1989c c1989c, C1989c c1989c2, C1989c c1989c3, int i) {
        float f;
        float f5;
        if (c(i, c1989c3, c1989c) || !c(i, c1989c2, c1989c)) {
            return false;
        }
        float f6 = c1989c3.f17194b;
        float f7 = c1989c3.f17196d;
        float f8 = c1989c3.f17193a;
        float f9 = c1989c3.f17195c;
        float f10 = c1989c.f17196d;
        float f11 = c1989c.f17194b;
        float f12 = c1989c.f17195c;
        float f13 = c1989c.f17193a;
        if (i == 3) {
            if (f13 < f9) {
                return true;
            }
        } else if (i == 4) {
            if (f12 > f8) {
                return true;
            }
        } else if (i == 5) {
            if (f11 < f7) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f10 > f6) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f13 - c1989c2.f17195c;
        } else if (i == 4) {
            f = c1989c2.f17193a - f12;
        } else if (i == 5) {
            f = f11 - c1989c2.f17196d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = c1989c2.f17194b - f10;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (i == 3) {
            f5 = f13 - f8;
        } else if (i == 4) {
            f5 = f9 - f12;
        } else if (i == 5) {
            f5 = f11 - f6;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f5 = f7 - f10;
        }
        if (f5 < 1.0f) {
            f5 = 1.0f;
        }
        return f < f5;
    }

    public static final boolean c(int i, C1989c c1989c, C1989c c1989c2) {
        if (i == 3 || i == 4) {
            return c1989c.f17196d > c1989c2.f17194b && c1989c.f17194b < c1989c2.f17196d;
        }
        if (i == 5 || i == 6) {
            return c1989c.f17195c > c1989c2.f17193a && c1989c.f17193a < c1989c2.f17195c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final C1989c d(View view, F f) {
        int[] iArr = f17022a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i5 = iArr[1];
        f.getLocationInWindow(iArr);
        float f5 = i - iArr[0];
        float f6 = i5 - iArr[1];
        return new C1989c(f5, f6, view.getWidth() + f5, view.getHeight() + f6);
    }

    public static final boolean e(s sVar, boolean z3) {
        int ordinal = sVar.A0().ordinal();
        r rVar = r.f17057n;
        if (ordinal == 0) {
            ((C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner()).g(null);
            sVar.y0(r.f17054k, rVar);
            return true;
        }
        if (ordinal == 1) {
            s n5 = n(sVar);
            if (!(n5 != null ? e(n5, z3) : true)) {
                return false;
            }
            sVar.y0(r.f17055l, rVar);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            throw new D2.e();
        }
        if (z3) {
            ((C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner()).g(null);
            sVar.y0(r.f17056m, rVar);
        }
        return z3;
    }

    public static final void f(s sVar, R.e eVar) {
        if (!sVar.f7162k.f7175x) {
            AbstractC2540a.b("visitChildren called on an unattached node");
        }
        R.e eVar2 = new R.e(new b0.o[16]);
        b0.o oVar = sVar.f7162k;
        b0.o oVar2 = oVar.f7167p;
        if (oVar2 == null) {
            AbstractC2749f.b(eVar2, oVar);
        } else {
            eVar2.c(oVar2);
        }
        while (true) {
            int i = eVar2.f5108m;
            if (i == 0) {
                return;
            }
            b0.o oVar3 = (b0.o) eVar2.l(i - 1);
            if ((oVar3.f7165n & 1024) == 0) {
                AbstractC2749f.b(eVar2, oVar3);
            } else {
                while (true) {
                    if (oVar3 == null) {
                        break;
                    }
                    if ((oVar3.f7164m & 1024) != 0) {
                        R.e eVar3 = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof s) {
                                s sVar2 = (s) oVar3;
                                if (sVar2.f7175x && !AbstractC2749f.v(sVar2).f21623Z) {
                                    if (sVar2.z0().f17040a) {
                                        eVar.c(sVar2);
                                    } else {
                                        f(sVar2, eVar);
                                    }
                                }
                            } else if ((oVar3.f7164m & 1024) != 0 && (oVar3 instanceof AbstractC2756m)) {
                                int i5 = 0;
                                for (b0.o oVar4 = ((AbstractC2756m) oVar3).f21839z; oVar4 != null; oVar4 = oVar4.f7167p) {
                                    if ((oVar4.f7164m & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new R.e(new b0.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                eVar3.c(oVar3);
                                                oVar3 = null;
                                            }
                                            eVar3.c(oVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            oVar3 = AbstractC2749f.f(eVar3);
                        }
                    } else {
                        oVar3 = oVar3.f7167p;
                    }
                }
            }
        }
    }

    public static final s g(s sVar) {
        s sVar2 = ((C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner()).f17035h;
        if (sVar2 == null || !sVar2.f7175x) {
            return null;
        }
        return sVar2;
    }

    public static final s h(R.e eVar, C1989c c1989c, int i) {
        C1989c f;
        if (i == 3) {
            f = c1989c.f((c1989c.f17195c - c1989c.f17193a) + 1, 0.0f);
        } else if (i == 4) {
            f = c1989c.f(-((c1989c.f17195c - c1989c.f17193a) + 1), 0.0f);
        } else if (i == 5) {
            f = c1989c.f(0.0f, (c1989c.f17196d - c1989c.f17194b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = c1989c.f(0.0f, -((c1989c.f17196d - c1989c.f17194b) + 1));
        }
        Object[] objArr = eVar.f5106k;
        int i5 = eVar.f5108m;
        s sVar = null;
        for (int i6 = 0; i6 < i5; i6++) {
            s sVar2 = (s) objArr[i6];
            if (r(sVar2)) {
                C1989c j5 = j(sVar2);
                if (o(j5, f, c1989c, i)) {
                    sVar = sVar2;
                    f = j5;
                }
            }
        }
        return sVar;
    }

    public static final boolean i(s sVar, int i, i4.c cVar) {
        C1989c c1989c;
        R.e eVar = new R.e(new s[16]);
        f(sVar, eVar);
        int i5 = eVar.f5108m;
        if (i5 <= 1) {
            s sVar2 = (s) (i5 == 0 ? null : eVar.f5106k[0]);
            if (sVar2 != null) {
                return ((Boolean) cVar.c(sVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C1989c j5 = j(sVar);
                float f = j5.f17194b;
                float f5 = j5.f17193a;
                c1989c = new C1989c(f5, f, f5, f);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C1989c j6 = j(sVar);
                float f6 = j6.f17196d;
                float f7 = j6.f17195c;
                c1989c = new C1989c(f7, f6, f7, f6);
            }
            s h3 = h(eVar, c1989c, i);
            if (h3 != null) {
                return ((Boolean) cVar.c(h3)).booleanValue();
            }
        }
        return false;
    }

    public static final C1989c j(s sVar) {
        e0 e0Var = sVar.f7169r;
        return e0Var != null ? f0.h(e0Var).s(e0Var, false) : C1989c.f17192e;
    }

    public static final boolean k(s sVar, A.s sVar2) {
        int ordinal = sVar.A0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s n5 = n(sVar);
                if (n5 != null) {
                    return k(n5, sVar2) || m(sVar, n5, 1, sVar2);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return sVar.z0().f17040a ? ((Boolean) sVar2.c(sVar)).booleanValue() : x(sVar, sVar2);
                }
                throw new D2.e();
            }
        }
        return x(sVar, sVar2);
    }

    public static final boolean l(int i, A.s sVar, s sVar2, C1989c c1989c) {
        if (A(i, sVar, sVar2, c1989c)) {
            return true;
        }
        Boolean bool = (Boolean) z(sVar2, i, new v(((C1965j) ((F) AbstractC2749f.w(sVar2)).getFocusOwner()).f17035h, sVar2, c1989c, i, sVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(s sVar, s sVar2, int i, A.s sVar3) {
        if (B(sVar, sVar2, i, sVar3)) {
            return true;
        }
        Boolean bool = (Boolean) z(sVar, i, new v(((C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner()).f17035h, sVar, sVar2, i, sVar3, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final s n(s sVar) {
        boolean z3 = sVar.f7162k.f7175x;
        if (z3) {
            if (!z3) {
                AbstractC2540a.b("visitChildren called on an unattached node");
            }
            R.e eVar = new R.e(new b0.o[16]);
            b0.o oVar = sVar.f7162k;
            b0.o oVar2 = oVar.f7167p;
            if (oVar2 == null) {
                AbstractC2749f.b(eVar, oVar);
            } else {
                eVar.c(oVar2);
            }
            loop0: while (true) {
                int i = eVar.f5108m;
                if (i == 0) {
                    break;
                }
                b0.o oVar3 = (b0.o) eVar.l(i - 1);
                if ((oVar3.f7165n & 1024) == 0) {
                    AbstractC2749f.b(eVar, oVar3);
                } else {
                    while (true) {
                        if (oVar3 == null) {
                            break;
                        }
                        if ((oVar3.f7164m & 1024) != 0) {
                            R.e eVar2 = null;
                            while (oVar3 != null) {
                                if (oVar3 instanceof s) {
                                    s sVar2 = (s) oVar3;
                                    if (sVar2.f7162k.f7175x) {
                                        int ordinal = sVar2.A0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            throw new D2.e();
                                        }
                                    }
                                } else if ((oVar3.f7164m & 1024) != 0 && (oVar3 instanceof AbstractC2756m)) {
                                    int i5 = 0;
                                    for (b0.o oVar4 = ((AbstractC2756m) oVar3).f21839z; oVar4 != null; oVar4 = oVar4.f7167p) {
                                        if ((oVar4.f7164m & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                oVar3 = oVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new R.e(new b0.o[16]);
                                                }
                                                if (oVar3 != null) {
                                                    eVar2.c(oVar3);
                                                    oVar3 = null;
                                                }
                                                eVar2.c(oVar4);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                oVar3 = AbstractC2749f.f(eVar2);
                            }
                        } else {
                            oVar3 = oVar3.f7167p;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean o(C1989c c1989c, C1989c c1989c2, C1989c c1989c3, int i) {
        if (!p(i, c1989c, c1989c3)) {
            return false;
        }
        if (p(i, c1989c2, c1989c3) && !b(c1989c3, c1989c, c1989c2, i)) {
            return !b(c1989c3, c1989c2, c1989c, i) && q(i, c1989c3, c1989c) < q(i, c1989c3, c1989c2);
        }
        return true;
    }

    public static final boolean p(int i, C1989c c1989c, C1989c c1989c2) {
        float f = c1989c.f17193a;
        float f5 = c1989c.f17195c;
        if (i == 3) {
            float f6 = c1989c2.f17195c;
            float f7 = c1989c2.f17193a;
            return (f6 > f5 || f7 >= f5) && f7 > f;
        }
        if (i == 4) {
            float f8 = c1989c2.f17193a;
            float f9 = c1989c2.f17195c;
            return (f8 < f || f9 <= f) && f9 < f5;
        }
        float f10 = c1989c.f17194b;
        float f11 = c1989c.f17196d;
        if (i == 5) {
            float f12 = c1989c2.f17196d;
            float f13 = c1989c2.f17194b;
            return (f12 > f11 || f13 >= f11) && f13 > f10;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f14 = c1989c2.f17194b;
        float f15 = c1989c2.f17196d;
        return (f14 < f10 || f15 <= f10) && f15 < f11;
    }

    public static final long q(int i, C1989c c1989c, C1989c c1989c2) {
        float f;
        float f5;
        float f6 = c1989c2.f17194b;
        float f7 = c1989c2.f17196d;
        float f8 = c1989c2.f17193a;
        float f9 = c1989c2.f17195c;
        if (i == 3) {
            f = c1989c.f17193a - f9;
        } else if (i == 4) {
            f = f8 - c1989c.f17195c;
        } else if (i == 5) {
            f = c1989c.f17194b - f7;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = f6 - c1989c.f17196d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j5 = (long) f;
        if (i == 3 || i == 4) {
            float f10 = c1989c.f17196d;
            float f11 = c1989c.f17194b;
            float f12 = 2;
            f5 = (((f10 - f11) / f12) + f11) - (((f7 - f6) / f12) + f6);
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f13 = c1989c.f17195c;
            float f14 = c1989c.f17193a;
            float f15 = 2;
            f5 = (((f13 - f14) / f15) + f14) - (((f9 - f8) / f15) + f8);
        }
        long j6 = (long) f5;
        return (j6 * j6) + (13 * j5 * j5);
    }

    public static final boolean r(s sVar) {
        C2731G c2731g;
        e0 e0Var;
        C2731G c2731g2;
        e0 e0Var2 = sVar.f7169r;
        return (e0Var2 == null || (c2731g = e0Var2.f21812y) == null || !c2731g.J() || (e0Var = sVar.f7169r) == null || (c2731g2 = e0Var.f21812y) == null || !c2731g2.I()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [i4.c, kotlin.jvm.internal.m] */
    public static final EnumC1957b s(s sVar, int i) {
        int ordinal = sVar.A0().ordinal();
        EnumC1957b enumC1957b = EnumC1957b.f17015k;
        if (ordinal != 0) {
            EnumC1957b enumC1957b2 = EnumC1957b.f17016l;
            if (ordinal == 1) {
                s n5 = n(sVar);
                if (n5 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC1957b s2 = s(n5, i);
                if (s2 == enumC1957b) {
                    s2 = null;
                }
                if (s2 != null) {
                    return s2;
                }
                if (sVar.f17062z) {
                    return enumC1957b;
                }
                sVar.f17062z = true;
                try {
                    m z02 = sVar.z0();
                    C1956a c1956a = new C1956a(i);
                    InterfaceC1964i focusOwner = ((F) AbstractC2749f.w(sVar)).getFocusOwner();
                    s sVar2 = ((C1965j) focusOwner).f17035h;
                    z02.f17048k.c(c1956a);
                    s sVar3 = ((C1965j) focusOwner).f17035h;
                    if (!c1956a.f17014b) {
                        return (sVar2 == sVar3 || sVar3 == null) ? enumC1957b : o.f17051d == o.f17050c ? enumC1957b2 : EnumC1957b.f17017m;
                    }
                    o oVar = o.f17049b;
                    return enumC1957b2;
                } finally {
                    sVar.f17062z = false;
                }
            }
            if (ordinal == 2) {
                return enumC1957b2;
            }
            if (ordinal != 3) {
                throw new D2.e();
            }
        }
        return enumC1957b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i4.c, kotlin.jvm.internal.m] */
    public static final EnumC1957b t(s sVar, int i) {
        if (!sVar.f17059A) {
            sVar.f17059A = true;
            try {
                m z02 = sVar.z0();
                C1956a c1956a = new C1956a(i);
                InterfaceC1964i focusOwner = ((F) AbstractC2749f.w(sVar)).getFocusOwner();
                s sVar2 = ((C1965j) focusOwner).f17035h;
                z02.f17047j.c(c1956a);
                s sVar3 = ((C1965j) focusOwner).f17035h;
                boolean z3 = c1956a.f17014b;
                EnumC1957b enumC1957b = EnumC1957b.f17016l;
                if (z3) {
                    o oVar = o.f17049b;
                    return enumC1957b;
                }
                if (sVar2 != sVar3 && sVar3 != null) {
                    return o.f17051d == o.f17050c ? enumC1957b : EnumC1957b.f17017m;
                }
            } finally {
                sVar.f17059A = false;
            }
        }
        return EnumC1957b.f17015k;
    }

    public static final EnumC1957b u(s sVar, int i) {
        b0.o oVar;
        c0 c0Var;
        int ordinal = sVar.A0().ordinal();
        EnumC1957b enumC1957b = EnumC1957b.f17015k;
        if (ordinal != 0) {
            if (ordinal == 1) {
                s n5 = n(sVar);
                if (n5 != null) {
                    return s(n5, i);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new D2.e();
                }
                if (!sVar.f7162k.f7175x) {
                    AbstractC2540a.b("visitAncestors called on an unattached node");
                }
                b0.o oVar2 = sVar.f7162k.f7166o;
                C2731G v4 = AbstractC2749f.v(sVar);
                loop0: while (true) {
                    if (v4 == null) {
                        oVar = null;
                        break;
                    }
                    if ((v4.f21612O.f.f7165n & 1024) != 0) {
                        while (oVar2 != null) {
                            if ((oVar2.f7164m & 1024) != 0) {
                                oVar = oVar2;
                                R.e eVar = null;
                                while (oVar != null) {
                                    if (oVar instanceof s) {
                                        break loop0;
                                    }
                                    if ((oVar.f7164m & 1024) != 0 && (oVar instanceof AbstractC2756m)) {
                                        int i5 = 0;
                                        for (b0.o oVar3 = ((AbstractC2756m) oVar).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                            if ((oVar3.f7164m & 1024) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    oVar = oVar3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new R.e(new b0.o[16]);
                                                    }
                                                    if (oVar != null) {
                                                        eVar.c(oVar);
                                                        oVar = null;
                                                    }
                                                    eVar.c(oVar3);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    oVar = AbstractC2749f.f(eVar);
                                }
                            }
                            oVar2 = oVar2.f7166o;
                        }
                    }
                    v4 = v4.u();
                    oVar2 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
                }
                s sVar2 = (s) oVar;
                if (sVar2 == null) {
                    return enumC1957b;
                }
                int ordinal2 = sVar2.A0().ordinal();
                if (ordinal2 == 0) {
                    return t(sVar2, i);
                }
                if (ordinal2 == 1) {
                    return u(sVar2, i);
                }
                if (ordinal2 == 2) {
                    return EnumC1957b.f17016l;
                }
                if (ordinal2 != 3) {
                    throw new D2.e();
                }
                EnumC1957b u5 = u(sVar2, i);
                EnumC1957b enumC1957b2 = u5 != enumC1957b ? u5 : null;
                return enumC1957b2 == null ? t(sVar2, i) : enumC1957b2;
            }
        }
        return enumC1957b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean v(s sVar) {
        R.e eVar;
        c0 c0Var;
        char c5;
        c0 c0Var2;
        C1965j c1965j = (C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner();
        s sVar2 = c1965j.f17035h;
        r A02 = sVar.A0();
        if (sVar2 == sVar) {
            sVar.y0(A02, A02);
            return true;
        }
        int i = 0;
        if (sVar2 == null && !((C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner()).f17029a.H()) {
            return false;
        }
        char c6 = 16;
        if (sVar2 != null) {
            eVar = new R.e(new s[16]);
            if (!sVar2.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar = sVar2.f7162k.f7166o;
            C2731G v4 = AbstractC2749f.v(sVar2);
            while (v4 != null) {
                if ((v4.f21612O.f.f7165n & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.f7164m & 1024) != 0) {
                            b0.o oVar2 = oVar;
                            R.e eVar2 = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof s) {
                                    eVar.c((s) oVar2);
                                } else if ((oVar2.f7164m & 1024) != 0 && (oVar2 instanceof AbstractC2756m)) {
                                    int i5 = 0;
                                    for (b0.o oVar3 = ((AbstractC2756m) oVar2).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                        if ((oVar3.f7164m & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new R.e(new b0.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    eVar2.c(oVar2);
                                                    oVar2 = null;
                                                }
                                                eVar2.c(oVar3);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                oVar2 = AbstractC2749f.f(eVar2);
                            }
                        }
                        oVar = oVar.f7166o;
                    }
                }
                v4 = v4.u();
                oVar = (v4 == null || (c0Var2 = v4.f21612O) == null) ? null : c0Var2.f21770e;
            }
        } else {
            eVar = null;
        }
        s[] sVarArr = new s[16];
        if (!sVar.f7162k.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar4 = sVar.f7162k.f7166o;
        C2731G v5 = AbstractC2749f.v(sVar);
        int i6 = 1;
        int i7 = 0;
        while (v5 != null) {
            if ((v5.f21612O.f.f7165n & 1024) != 0) {
                while (oVar4 != null) {
                    if ((oVar4.f7164m & 1024) != 0) {
                        b0.o oVar5 = oVar4;
                        R.e eVar3 = null;
                        while (oVar5 != null) {
                            if (oVar5 instanceof s) {
                                s sVar3 = (s) oVar5;
                                Boolean valueOf = eVar != null ? Boolean.valueOf(eVar.k(sVar3)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i8 = i7 + 1;
                                    if (sVarArr.length < i8) {
                                        int length = sVarArr.length;
                                        ?? r42 = new Object[Math.max(i8, length * 2)];
                                        System.arraycopy(sVarArr, i, r42, i, length);
                                        sVarArr = r42;
                                    }
                                    sVarArr[i7] = sVar3;
                                    i7 = i8;
                                }
                                if (sVar3 == sVar2) {
                                    i6 = i;
                                }
                            } else if ((oVar5.f7164m & 1024) != 0 && (oVar5 instanceof AbstractC2756m)) {
                                int i9 = i;
                                for (b0.o oVar6 = ((AbstractC2756m) oVar5).f21839z; oVar6 != null; oVar6 = oVar6.f7167p) {
                                    if ((oVar6.f7164m & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            oVar5 = oVar6;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new R.e(new b0.o[16]);
                                            }
                                            if (oVar5 != null) {
                                                eVar3.c(oVar5);
                                                oVar5 = null;
                                            }
                                            eVar3.c(oVar6);
                                        }
                                    }
                                }
                                c5 = 16;
                                if (i9 == 1) {
                                    c6 = 16;
                                    i = 0;
                                }
                                oVar5 = AbstractC2749f.f(eVar3);
                                c6 = c5;
                                i = 0;
                            }
                            c5 = 16;
                            oVar5 = AbstractC2749f.f(eVar3);
                            c6 = c5;
                            i = 0;
                        }
                    }
                    oVar4 = oVar4.f7166o;
                    c6 = c6;
                    i = 0;
                }
            }
            char c7 = c6;
            v5 = v5.u();
            oVar4 = (v5 == null || (c0Var = v5.f21612O) == null) ? null : c0Var.f21770e;
            c6 = c7;
            i = 0;
        }
        if (i6 == 0 || sVar2 == null || e(sVar2, false)) {
            AbstractC2749f.s(sVar, new C0040k0(21, sVar));
            int ordinal = sVar.A0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new D2.e();
                        }
                    }
                }
                ((C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner()).g(sVar);
            }
            r rVar = r.f17057n;
            r rVar2 = r.f17055l;
            if (eVar != null) {
                int i10 = eVar.f5108m - 1;
                Object[] objArr = eVar.f5106k;
                if (i10 < objArr.length) {
                    while (i10 >= 0) {
                        s sVar4 = (s) objArr[i10];
                        if (c1965j.f17035h != sVar) {
                            break;
                        }
                        sVar4.y0(rVar2, rVar);
                        i10--;
                    }
                }
            }
            int i11 = i7 - 1;
            int length2 = sVarArr.length;
            r rVar3 = r.f17054k;
            if (i11 < length2) {
                while (i11 >= 0) {
                    s sVar5 = sVarArr[i11];
                    if (c1965j.f17035h != sVar) {
                        break;
                    }
                    sVar5.y0(sVar5 == sVar2 ? rVar3 : rVar, rVar2);
                    i11--;
                }
            }
            if (c1965j.f17035h == sVar) {
                sVar.y0(A02, rVar3);
                if (c1965j.f17035h != sVar) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean w(s sVar, A.s sVar2) {
        s[] sVarArr = new s[16];
        if (!sVar.f7162k.f7175x) {
            AbstractC2540a.b("visitChildren called on an unattached node");
        }
        R.e eVar = new R.e(new b0.o[16]);
        b0.o oVar = sVar.f7162k;
        b0.o oVar2 = oVar.f7167p;
        if (oVar2 == null) {
            AbstractC2749f.b(eVar, oVar);
        } else {
            eVar.c(oVar2);
        }
        int i = 0;
        while (true) {
            int i5 = eVar.f5108m;
            if (i5 == 0) {
                break;
            }
            b0.o oVar3 = (b0.o) eVar.l(i5 - 1);
            if ((oVar3.f7165n & 1024) == 0) {
                AbstractC2749f.b(eVar, oVar3);
            } else {
                while (true) {
                    if (oVar3 == null) {
                        break;
                    }
                    if ((oVar3.f7164m & 1024) != 0) {
                        R.e eVar2 = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof s) {
                                s sVar3 = (s) oVar3;
                                int i6 = i + 1;
                                if (sVarArr.length < i6) {
                                    int length = sVarArr.length;
                                    ?? r10 = new Object[Math.max(i6, length * 2)];
                                    System.arraycopy(sVarArr, 0, r10, 0, length);
                                    sVarArr = r10;
                                }
                                sVarArr[i] = sVar3;
                                i = i6;
                            } else if ((oVar3.f7164m & 1024) != 0 && (oVar3 instanceof AbstractC2756m)) {
                                int i7 = 0;
                                for (b0.o oVar4 = ((AbstractC2756m) oVar3).f21839z; oVar4 != null; oVar4 = oVar4.f7167p) {
                                    if ((oVar4.f7164m & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new R.e(new b0.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                eVar2.c(oVar3);
                                                oVar3 = null;
                                            }
                                            eVar2.c(oVar4);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            oVar3 = AbstractC2749f.f(eVar2);
                        }
                    } else {
                        oVar3 = oVar3.f7167p;
                    }
                }
            }
        }
        X3.l.I0(sVarArr, t.f17063k, 0, i);
        int i8 = i - 1;
        if (i8 < sVarArr.length) {
            while (i8 >= 0) {
                s sVar4 = sVarArr[i8];
                if (r(sVar4) && a(sVar4, sVar2)) {
                    return true;
                }
                i8--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean x(s sVar, A.s sVar2) {
        s[] sVarArr = new s[16];
        if (!sVar.f7162k.f7175x) {
            AbstractC2540a.b("visitChildren called on an unattached node");
        }
        R.e eVar = new R.e(new b0.o[16]);
        b0.o oVar = sVar.f7162k;
        b0.o oVar2 = oVar.f7167p;
        if (oVar2 == null) {
            AbstractC2749f.b(eVar, oVar);
        } else {
            eVar.c(oVar2);
        }
        int i = 0;
        while (true) {
            int i5 = eVar.f5108m;
            if (i5 == 0) {
                break;
            }
            b0.o oVar3 = (b0.o) eVar.l(i5 - 1);
            if ((oVar3.f7165n & 1024) == 0) {
                AbstractC2749f.b(eVar, oVar3);
            } else {
                while (true) {
                    if (oVar3 == null) {
                        break;
                    }
                    if ((oVar3.f7164m & 1024) != 0) {
                        R.e eVar2 = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof s) {
                                s sVar3 = (s) oVar3;
                                int i6 = i + 1;
                                if (sVarArr.length < i6) {
                                    int length = sVarArr.length;
                                    ?? r10 = new Object[Math.max(i6, length * 2)];
                                    System.arraycopy(sVarArr, 0, r10, 0, length);
                                    sVarArr = r10;
                                }
                                sVarArr[i] = sVar3;
                                i = i6;
                            } else if ((oVar3.f7164m & 1024) != 0 && (oVar3 instanceof AbstractC2756m)) {
                                int i7 = 0;
                                for (b0.o oVar4 = ((AbstractC2756m) oVar3).f21839z; oVar4 != null; oVar4 = oVar4.f7167p) {
                                    if ((oVar4.f7164m & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new R.e(new b0.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                eVar2.c(oVar3);
                                                oVar3 = null;
                                            }
                                            eVar2.c(oVar4);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            oVar3 = AbstractC2749f.f(eVar2);
                        }
                    } else {
                        oVar3 = oVar3.f7167p;
                    }
                }
            }
        }
        X3.l.I0(sVarArr, t.f17063k, 0, i);
        for (int i8 = 0; i8 < i; i8++) {
            s sVar4 = sVarArr[i8];
            if (r(sVar4) && k(sVar4, sVar2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof F) {
            return ((F) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        if (kotlin.jvm.internal.l.a((B.C0083l) r5.J(r0), (B.C0083l) r10.J(r0)) != false) goto L99;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(s sVar, int i, i4.c cVar) {
        Object obj;
        b0.o oVar;
        c0 c0Var;
        if (!sVar.f7162k.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar2 = sVar.f7162k.f7166o;
        C2731G v4 = AbstractC2749f.v(sVar);
        loop0: while (true) {
            obj = null;
            if (v4 == null) {
                oVar = null;
                break;
            }
            if ((v4.f21612O.f.f7165n & 1024) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f7164m & 1024) != 0) {
                        oVar = oVar2;
                        R.e eVar = null;
                        while (oVar != null) {
                            if (oVar instanceof s) {
                                break loop0;
                            }
                            if ((oVar.f7164m & 1024) != 0 && (oVar instanceof AbstractC2756m)) {
                                int i5 = 0;
                                for (b0.o oVar3 = ((AbstractC2756m) oVar).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                    if ((oVar3.f7164m & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            oVar = oVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new R.e(new b0.o[16]);
                                            }
                                            if (oVar != null) {
                                                eVar.c(oVar);
                                                oVar = null;
                                            }
                                            eVar.c(oVar3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            oVar = AbstractC2749f.f(eVar);
                        }
                    }
                    oVar2 = oVar2.f7166o;
                }
            }
            v4 = v4.u();
            oVar2 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
        }
        s sVar2 = (s) oVar;
        if (sVar2 != null) {
            y0.g gVar = AbstractC2620f.f20994a;
        }
        C0083l c0083l = (C0083l) sVar.J(AbstractC2620f.f20994a);
        if (c0083l != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            i6 = 2;
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                }
                                i6 = 1;
                            }
                        }
                    }
                }
            }
            C0005e c0005e = c0083l.f684k;
            if (c0005e.f46a.g().f114m > 0) {
                E e3 = c0005e.f46a;
                if (!e3.g().f111j.isEmpty()) {
                    int min = c0083l.k(i6) ? Math.min(e3.g().f114m - 1, ((A.u) X3.m.e0(e3.g().f111j)).f119a) : Math.max(0, ((C0299j0) e3.f12d.f133b).h());
                    w wVar = new w();
                    C1930k c1930k = c0083l.f685l;
                    c1930k.getClass();
                    C0080i c0080i = new C0080i(min, min);
                    R.e eVar2 = (R.e) c1930k.f16910l;
                    eVar2.c(c0080i);
                    wVar.f17624k = c0080i;
                    while (obj == null && c0083l.i((C0080i) wVar.f17624k, i6)) {
                        C0080i c0080i2 = (C0080i) wVar.f17624k;
                        int i7 = c0080i2.f678a;
                        boolean k5 = c0083l.k(i6);
                        int i8 = c0080i2.f679b;
                        if (k5) {
                            i8++;
                        } else {
                            i7--;
                        }
                        C0080i c0080i3 = new C0080i(i7, i8);
                        eVar2.c(c0080i3);
                        eVar2.k((C0080i) wVar.f17624k);
                        wVar.f17624k = c0080i3;
                        C2731G c2731g = e3.f16j;
                        if (c2731g != null) {
                            c2731g.k();
                        }
                        obj = cVar.c(new C0082k(c0083l, wVar, i6));
                    }
                    eVar2.k((C0080i) wVar.f17624k);
                    C2731G c2731g2 = e3.f16j;
                    if (c2731g2 != null) {
                        c2731g2.k();
                    }
                    return obj;
                }
            }
            return cVar.c(C0083l.f683o);
        }
        return null;
    }
}
