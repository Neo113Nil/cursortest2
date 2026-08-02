package A0;

import G1.C0140k;
import M.AbstractC0232c;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.google.android.gms.internal.ads.C1639u7;
import d0.ViewOnAttachStateChangeListenerC1909d;
import h0.C1988b;
import i0.InterfaceC2009n;
import java.util.List;
import l0.C2041b;
import n.AbstractC2107A;
import t.C2396h;
import t3.AbstractC2425d;
import v.AbstractC2528x;
import w.C2539b;
import x.C2589k0;
import x.C2603s;
import x0.C2614C;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.C2681E;
import z.C2686J;
import z.C2687K;
import z.C2715q;
import z0.AbstractC2734J;
import z0.C2748e;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: A0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022e0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f494m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f495n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0022e0(int i, int i5, Object obj, Object obj2) {
        super(2);
        this.f493l = i5;
        this.f494m = obj;
        this.f495n = obj2;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        P.Z z3 = C0302l.f4480a;
        int i = 3;
        W3.o oVar = W3.o.f6046a;
        Object obj3 = this.f495n;
        Object obj4 = this.f494m;
        switch (this.f493l) {
            case 0:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((F) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(1));
                return oVar;
            case 1:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    B.q qVar = (B.q) obj4;
                    A.k kVar = (A.k) qVar.f699b.invoke();
                    B.p pVar = (B.p) obj3;
                    int i5 = pVar.f695c;
                    int c5 = kVar.c();
                    Object obj5 = pVar.f693a;
                    if ((i5 >= c5 || !kVar.d(i5).equals(obj5)) && (i5 = kVar.f61d.b(obj5)) != -1) {
                        pVar.f695c = i5;
                    }
                    int i6 = i5;
                    boolean z5 = i6 != -1;
                    c0315s.a0(Boolean.valueOf(z5));
                    boolean g5 = c0315s.g(z5);
                    c0315s.X(-869707859);
                    if (z5) {
                        c0315s.X(-2120139493);
                        AbstractC0444a.h(kVar, qVar.f698a, i6, obj5, c0315s, 0);
                        c0315s.q(false);
                    } else {
                        c0315s.n(g5);
                    }
                    c0315s.q(false);
                    c0315s.t();
                    boolean h3 = c0315s.h(pVar);
                    Object M5 = c0315s.M();
                    if (h3 || M5 == z3) {
                        M5 = new A.B(7, pVar);
                        c0315s.i0(M5);
                    }
                    AbstractC0329z.c(obj5, (i4.c) M5, c0315s);
                }
                return oVar;
            case 2:
                return (x0.P) ((i4.e) obj3).invoke(new B.u((B.q) obj4, (x0.j0) obj), new W0.a(((W0.a) obj2).f6000a));
            case 3:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    B.J j5 = (B.J) obj4;
                    j5.f634l.setValue(Y.k.c(c0315s2));
                    ((X.d) obj3).b(j5, c0315s2, 0);
                }
                return oVar;
            case 4:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s3.B()) {
                    c0315s3.S();
                } else {
                    ((H1.n) obj4).f2230u.b((C0140k) obj3, c0315s3, 0);
                }
                return oVar;
            case 5:
                ((Number) obj2).intValue();
                N4.b.b((Z.p) obj4, (List) obj3, (C0315s) obj, AbstractC0329z.B(1));
                return oVar;
            case 6:
                C0315s c0315s4 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s4.B()) {
                    c0315s4.S();
                } else {
                    AbstractC0444a.g((Y.d) obj4, (X.d) obj3, c0315s4, 0);
                }
                return oVar;
            case 7:
                C0315s c0315s5 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s5.B()) {
                    c0315s5.S();
                } else {
                    C0140k c0140k = (C0140k) obj4;
                    G1.y yVar = c0140k.f1899l;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar);
                    ((H1.h) yVar).f2215t.e((C2396h) obj3, c0140k, c0315s5, 0);
                }
                return oVar;
            case 8:
                ((Number) obj2).intValue();
                N4.b.d((b0.p) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(49));
                return oVar;
            case 9:
                C0315s c0315s6 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s6.B()) {
                    c0315s6.S();
                } else {
                    b0.p e3 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.c.a(b0.m.f7161k, AbstractC0232c.f3302b, AbstractC0232c.f3303c), (C2681E) obj4);
                    C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21536c, b0.c.f7147u, c0315s6, 54);
                    int p5 = AbstractC0329z.p(c0315s6);
                    InterfaceC0314r0 l5 = c0315s6.l();
                    b0.p c6 = b0.a.c(c0315s6, e3);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s6.b0();
                    if (c0315s6.f4530S) {
                        c0315s6.k(c2768z);
                    } else {
                        c0315s6.l0();
                    }
                    AbstractC0329z.y(c0315s6, C2752i.f21833e, a5);
                    AbstractC0329z.y(c0315s6, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s6.f4530S || !kotlin.jvm.internal.l.a(c0315s6.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s6, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s6, C2752i.f21831c, c6);
                    ((X.d) obj3).b(C2687K.f21484a, c0315s6, 6);
                    c0315s6.q(true);
                }
                return oVar;
            case 10:
                C0315s c0315s7 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s7.B()) {
                    c0315s7.S();
                } else {
                    M.u0.a(((M.v0) obj4).f3572j, (X.d) obj3, c0315s7, 0);
                }
                return oVar;
            case 11:
                ((Number) obj2).intValue();
                M.u0.a((K0.O) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(1));
                return oVar;
            case 12:
                C0315s c0315s8 = (C0315s) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0315s8.P(intValue & 1, (3 & intValue) != 2)) {
                    Object M6 = c0315s8.M();
                    if (M6 == z3) {
                        M6 = a1.c.f6384p;
                        c0315s8.i0(M6);
                    }
                    AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((i4.c) M6, false);
                    a1.w wVar = (a1.w) obj4;
                    boolean h4 = c0315s8.h(wVar);
                    Object M7 = c0315s8.M();
                    if (h4 || M7 == z3) {
                        M7 = new a1.j(wVar, 1);
                        c0315s8.i0(M7);
                    }
                    b0.p h5 = N4.b.h(androidx.compose.ui.layout.a.e(appendedSemanticsElement, (i4.c) M7), wVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    i4.e eVar = (i4.e) ((InterfaceC0289e0) obj3).getValue();
                    Object M8 = c0315s8.M();
                    if (M8 == z3) {
                        M8 = a1.e.f6393c;
                        c0315s8.i0(M8);
                    }
                    x0.O o5 = (x0.O) M8;
                    long j6 = c0315s8.f4531T;
                    int i7 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC0314r0 l6 = c0315s8.l();
                    b0.p c7 = b0.a.c(c0315s8, h5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s8.b0();
                    if (c0315s8.f4530S) {
                        c0315s8.k(c2768z2);
                    } else {
                        c0315s8.l0();
                    }
                    AbstractC0329z.y(c0315s8, C2752i.f21833e, o5);
                    AbstractC0329z.y(c0315s8, C2752i.f21832d, l6);
                    C2751h c2751h2 = C2752i.f;
                    if (c0315s8.f4530S || !kotlin.jvm.internal.l.a(c0315s8.M(), Integer.valueOf(i7))) {
                        AbstractC2107A.y(i7, c0315s8, i7, c2751h2);
                    }
                    AbstractC0329z.y(c0315s8, C2752i.f21831c, c7);
                    eVar.invoke(c0315s8, 0);
                    c0315s8.q(true);
                } else {
                    c0315s8.S();
                }
                return oVar;
            case 13:
                int intValue2 = ((Number) obj).intValue();
                H0.n nVar = (H0.n) obj2;
                if (!((C0041k1) obj4).f527b.b(nVar.f2116g)) {
                    ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d = (ViewOnAttachStateChangeListenerC1909d) obj3;
                    viewOnAttachStateChangeListenerC1909d.o(intValue2, nVar);
                    viewOnAttachStateChangeListenerC1909d.f16839r.q(oVar);
                }
                return oVar;
            case 14:
                ((Number) obj2).intValue();
                AbstractC2528x.a((b0.p) obj4, (i4.c) obj3, (C0315s) obj, AbstractC0329z.B(1));
                return oVar;
            case 15:
                ((Number) obj2).intValue();
                ((w.h) obj4).a((C2539b) obj3, (C0315s) obj, AbstractC0329z.B(1));
                return oVar;
            case 16:
                ((Number) obj2).intValue();
                w.p.a((C2539b) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(385));
                return oVar;
            case 17:
                C0315s c0315s9 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s9.B()) {
                    c0315s9.S();
                } else {
                    C2539b c2539b = (C2539b) obj4;
                    w.p.a(c2539b, X.e.d(1156688164, new E.w0(i, (C0028g0) obj3, c2539b), c0315s9), c0315s9, 384);
                }
                return oVar;
            case 18:
                long j7 = ((C1988b) obj2).f17191a;
                AbstractC2425d.i((u0.c) obj4, (t0.s) obj);
                r4.c cVar = ((C2589k0) obj3).f20803E;
                if (cVar != null) {
                    cVar.q(new C2603s(j7));
                }
                return oVar;
            case 19:
                C0315s c0315s10 = (C0315s) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c0315s10.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Boolean bool = (Boolean) ((C2614C) obj4).f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    c0315s10.a0(bool);
                    boolean g6 = c0315s10.g(booleanValue);
                    if (booleanValue) {
                        ((i4.e) obj3).invoke(c0315s10, 0);
                    } else {
                        c0315s10.n(g6);
                    }
                    c0315s10.t();
                } else {
                    c0315s10.S();
                }
                return oVar;
            case 20:
                C0315s c0315s11 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s11.B()) {
                    c0315s11.S();
                } else {
                    ((X.d) obj3).b((C2715q) obj4, c0315s11, 0);
                }
                return oVar;
            case C1639u7.zzm /* 21 */:
                x0.j0 j0Var = (x0.j0) obj;
                long j8 = ((W0.a) obj2).f6000a;
                return ((x0.O) obj4).c(j0Var, j0Var.C(new X.d(-1945019079, new C0022e0((X.d) obj3, new C2715q(j0Var, j8)), true), oVar), j8);
            default:
                InterfaceC2009n interfaceC2009n = (InterfaceC2009n) obj;
                C2041b c2041b = (C2041b) obj2;
                z0.e0 e0Var = (z0.e0) obj4;
                if (e0Var.f21812y.J()) {
                    e0Var.f21807O = interfaceC2009n;
                    e0Var.f21806N = c2041b;
                    z0.p0 snapshotObserver = ((F) AbstractC2734J.a(e0Var.f21812y)).getSnapshotObserver();
                    i0.G g7 = z0.e0.f21790T;
                    snapshotObserver.a(e0Var, C2748e.f21779o, (z0.d0) obj3);
                    e0Var.f21810R = false;
                } else {
                    e0Var.f21810R = true;
                }
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0022e0(int i, Object obj, Object obj2) {
        super(2);
        this.f493l = i;
        this.f494m = obj;
        this.f495n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022e0(X.d dVar, C2715q c2715q) {
        super(2);
        this.f493l = 20;
        this.f495n = dVar;
        this.f494m = c2715q;
    }
}
