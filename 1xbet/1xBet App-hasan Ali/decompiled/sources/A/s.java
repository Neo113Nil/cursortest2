package A;

import E.C0116v;
import E.F0;
import E.Z;
import G1.C0140k;
import K0.C0203h;
import K0.K;
import K0.L;
import K0.N;
import P.InterfaceC0289e0;
import android.graphics.Canvas;
import e2.C1930k;
import g0.C1965j;
import h0.C1989c;
import i0.AbstractC1998c;
import i0.I;
import i0.InterfaceC2009n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import k0.AbstractC2024d;
import k0.C2027g;
import k0.InterfaceC2025e;
import n.AbstractC2107A;
import p4.U;
import r3.AbstractC2349a;
import t.C2384F;
import t.C2400l;
import t3.AbstractC2425d;
import u.n0;
import x.C2588k;
import x.C2599p0;
import x.C2604s0;
import x0.Q;
import x0.Y;
import z.C2679C;
import z.C2680D;
import z.C2681E;
import z.C2682F;
import z0.A0;
import z0.AbstractC2749f;
import z0.C2731G;
import z0.z0;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f102n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f103o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(g0.s sVar, C1965j c1965j, i4.c cVar) {
        super(1);
        this.f100l = 7;
        this.f102n = sVar;
        this.f103o = c1965j;
        this.f101m = (kotlin.jvm.internal.m) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // i4.c
    public final Object c(Object obj) {
        boolean booleanValue;
        switch (this.f100l) {
            case 0:
                Y y5 = (Y) obj;
                ArrayList arrayList = (ArrayList) this.f102n;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    u uVar = (u) this.f103o;
                    if (i >= size) {
                        if (uVar != null) {
                            uVar.b(y5);
                        }
                        ((InterfaceC0289e0) this.f101m).getValue();
                        return W3.o.f6046a;
                    }
                    u uVar2 = (u) arrayList.get(i);
                    if (uVar2 != uVar) {
                        uVar2.b(y5);
                    }
                    i++;
                }
            case 1:
                P0.w wVar = (P0.w) obj;
                ((InterfaceC0289e0) this.f101m).setValue(wVar);
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) this.f103o;
                boolean a5 = kotlin.jvm.internal.l.a((String) interfaceC0289e0.getValue(), wVar.f4679a.f2829l);
                C0203h c0203h = wVar.f4679a;
                interfaceC0289e0.setValue(c0203h.f2829l);
                if (!a5) {
                    ((i4.c) this.f102n).c(c0203h.f2829l);
                }
                return W3.o.f6046a;
            case 2:
                InterfaceC2025e interfaceC2025e = (InterfaceC2025e) obj;
                Z z3 = (Z) this.f102n;
                F0 d5 = z3.d();
                if (d5 != null) {
                    InterfaceC2009n v4 = interfaceC2025e.B().v();
                    long j5 = ((N) z3.f1109x.getValue()).f2803a;
                    long j6 = ((N) z3.f1110y.getValue()).f2803a;
                    long j7 = z3.f1108w;
                    boolean b3 = N.b(j5);
                    P0.q qVar = (P0.q) this.f101m;
                    L l5 = d5.f1029a;
                    J2.b bVar = z3.f1107v;
                    K k5 = l5.f2792a;
                    if (!b3) {
                        bVar.e(j7);
                        int b5 = qVar.b(N.e(j5));
                        int b6 = qVar.b(N.d(j5));
                        if (b5 != b6) {
                            v4.n(l5.j(b5, b6), bVar);
                        }
                    } else if (N.b(j6)) {
                        long j8 = ((P0.w) this.f103o).f4680b;
                        if (!N.b(j8)) {
                            bVar.e(j7);
                            int b7 = qVar.b(N.e(j8));
                            int b8 = qVar.b(N.d(j8));
                            if (b7 != b8) {
                                v4.n(l5.j(b7, b8), bVar);
                            }
                        }
                    } else {
                        long b9 = k5.f2785b.b();
                        i0.p pVar = new i0.p(b9);
                        if (b9 == 16) {
                            pVar = null;
                        }
                        long j9 = pVar != null ? pVar.f17295a : i0.p.f17289b;
                        bVar.e(i0.p.b(i0.p.d(j9) * 0.2f, j9));
                        int b10 = qVar.b(N.e(j6));
                        int b11 = qVar.b(N.d(j6));
                        if (b10 != b11) {
                            v4.n(l5.j(b10, b11), bVar);
                        }
                    }
                    long j10 = l5.f2794c;
                    float f = (int) (j10 >> 32);
                    K0.r rVar = l5.f2793b;
                    boolean z5 = ((f > rVar.f2856d ? 1 : (f == rVar.f2856d ? 0 : -1)) < 0 || rVar.f2855c || (((float) ((int) (j10 & 4294967295L))) > rVar.f2857e ? 1 : (((float) ((int) (j10 & 4294967295L))) == rVar.f2857e ? 0 : -1)) < 0) && k5.f != 3;
                    if (z5) {
                        C1989c f5 = G4.l.f(0L, (Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (4294967295L & Float.floatToRawIntBits((int) (j10 & 4294967295L))));
                        v4.k();
                        v4.p(f5);
                    }
                    K0.G g5 = k5.f2785b.f2805a;
                    V0.l lVar = g5.f2774m;
                    V0.o oVar = g5.f2764a;
                    if (lVar == null) {
                        lVar = V0.l.f5944b;
                    }
                    V0.l lVar2 = lVar;
                    I i5 = g5.f2775n;
                    if (i5 == null) {
                        i5 = I.f17244d;
                    }
                    I i6 = i5;
                    AbstractC2024d abstractC2024d = g5.f2776o;
                    if (abstractC2024d == null) {
                        abstractC2024d = C2027g.f17547b;
                    }
                    AbstractC2024d abstractC2024d2 = abstractC2024d;
                    try {
                        i0.F d6 = oVar.d();
                        V0.n nVar = V0.n.f5949a;
                        if (d6 != null) {
                            K0.r.g(rVar, v4, d6, oVar != nVar ? oVar.a() : 1.0f, i6, lVar2, abstractC2024d2);
                        } else {
                            long b12 = oVar != nVar ? oVar.b() : i0.p.f17289b;
                            v4.k();
                            ArrayList arrayList2 = rVar.f2859h;
                            int size2 = arrayList2.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                K0.t tVar = (K0.t) arrayList2.get(i7);
                                tVar.f2862a.f(v4, b12, i6, lVar2, abstractC2024d2);
                                v4.g(0.0f, tVar.f2862a.b());
                            }
                            v4.j();
                        }
                        if (z5) {
                            v4.j();
                        }
                    } finally {
                    }
                }
                return W3.o.f6046a;
            case 3:
                P0.C c5 = (P0.C) ((kotlin.jvm.internal.w) this.f101m).f17624k;
                P0.w t5 = ((v3.g) this.f102n).t((List) obj);
                if (c5 != null) {
                    c5.a(null, t5);
                }
                ((C0116v) this.f103o).c(t5);
                return W3.o.f6046a;
            case 4:
                C0140k c0140k = (C0140k) this.f103o;
                Z.p pVar2 = (Z.p) this.f102n;
                pVar2.add(c0140k);
                return new B1.e((H1.o) this.f101m, c0140k, pVar2, 1);
            case 5:
                InterfaceC2009n v5 = ((InterfaceC2025e) obj).B().v();
                Z0.q qVar2 = (Z0.q) this.f102n;
                if (qVar2.getView().getVisibility() != 8) {
                    qVar2.f6292H = true;
                    A0.F f6 = ((C2731G) this.f103o).f21636w;
                    if (!AbstractC2107A.A(f6)) {
                        f6 = null;
                    }
                    if (f6 != null) {
                        Canvas a6 = AbstractC1998c.a(v5);
                        f6.getAndroidViewsHandler$ui_release().getClass();
                        ((Z0.q) this.f101m).draw(a6);
                    }
                    qVar2.f6292H = false;
                }
                return W3.o.f6046a;
            case 6:
                A0 a02 = (A0) obj;
                e0.f fVar = (e0.f) a02;
                e0.f fVar2 = (e0.f) this.f103o;
                fVar2.getClass();
                if (!((e0.a) ((A0.F) AbstractC2749f.w(fVar2)).m3getDragAndDropManager()).f16890b.contains(fVar) || !AbstractC2349a.j(fVar, AbstractC2425d.x((C1930k) this.f101m))) {
                    return z0.f21876k;
                }
                ((kotlin.jvm.internal.w) this.f102n).f17624k = a02;
                return z0.f21878m;
            case 7:
                g0.s sVar = (g0.s) obj;
                if (kotlin.jvm.internal.l.a(sVar, (g0.s) this.f102n)) {
                    booleanValue = false;
                } else {
                    if (kotlin.jvm.internal.l.a(sVar, ((C1965j) this.f103o).f17031c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((kotlin.jvm.internal.m) this.f101m).c(sVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 8:
                return new B1.e((Z.p) this.f102n, this.f103o, (C2400l) this.f101m, 3);
            case 9:
                i0.G g6 = (i0.G) obj;
                n0 n0Var = (n0) this.f102n;
                g6.a(n0Var != null ? ((Number) n0Var.getValue()).floatValue() : 1.0f);
                n0 n0Var2 = (n0) this.f103o;
                g6.f(n0Var2 != null ? ((Number) n0Var2.getValue()).floatValue() : 1.0f);
                g6.g(n0Var2 != null ? ((Number) n0Var2.getValue()).floatValue() : 1.0f);
                n0 n0Var3 = (n0) this.f101m;
                g6.l(n0Var3 != null ? ((i0.N) n0Var3.getValue()).f17265a : i0.N.f17263b);
                return W3.o.f6046a;
            case 10:
                int ordinal = ((t.v) obj).ordinal();
                i0.N n5 = null;
                C2384F c2384f = (C2384F) this.f101m;
                if (ordinal == 0) {
                    t.N n6 = c2384f.f19343a;
                } else if (ordinal == 1) {
                    n5 = (i0.N) this.f102n;
                } else {
                    if (ordinal != 2) {
                        throw new D2.e();
                    }
                    t.N n7 = c2384f.f19343a;
                }
                return new i0.N(n5 != null ? n5.f17265a : i0.N.f17263b);
            case 11:
                float floatValue = ((Number) obj).floatValue();
                C2588k c2588k = (C2588k) this.f102n;
                float f7 = c2588k.f20790A ? 1.0f : -1.0f;
                C2604s0 c2604s0 = c2588k.f20798z;
                long d7 = c2604s0.d(c2604s0.g(f7 * floatValue));
                C2604s0 c2604s02 = ((C2599p0) this.f101m).f20847a;
                float f8 = c2604s0.f(c2604s0.d(C2604s0.a(c2604s02, c2604s02.f20869h, d7, 1))) * f7;
                if (Math.abs(f8) < Math.abs(floatValue)) {
                    String str = "Scroll animation cancelled because scroll was not consumed (" + f8 + " < " + floatValue + ')';
                    U u5 = (U) this.f103o;
                    CancellationException cancellationException = new CancellationException(str);
                    cancellationException.initCause(null);
                    u5.d(cancellationException);
                }
                return W3.o.f6046a;
            case 12:
                Y y6 = (Y) obj;
                C2679C c2679c = (C2679C) this.f102n;
                boolean z6 = c2679c.f21466A;
                Q q5 = (Q) this.f101m;
                x0.Z z7 = (x0.Z) this.f103o;
                if (z6) {
                    Y.j(y6, z7, q5.K(c2679c.f21467y), q5.K(c2679c.f21468z));
                } else {
                    Y.g(y6, z7, q5.K(c2679c.f21467y), q5.K(c2679c.f21468z));
                }
                return W3.o.f6046a;
            case 13:
                Y y7 = (Y) obj;
                C2680D c2680d = (C2680D) this.f102n;
                boolean z8 = c2680d.f21471C;
                Q q6 = (Q) this.f101m;
                x0.Z z9 = (x0.Z) this.f103o;
                if (z8) {
                    Y.j(y7, z9, q6.K(c2680d.f21472y), q6.K(c2680d.f21473z));
                } else {
                    Y.g(y7, z9, q6.K(c2680d.f21472y), q6.K(c2680d.f21473z));
                }
                return W3.o.f6046a;
            default:
                C2682F c2682f = (C2682F) this.f101m;
                C2681E c2681e = c2682f.f21478y;
                Q q7 = (Q) this.f103o;
                Y.g((Y) obj, (x0.Z) this.f102n, q7.K(c2681e.a(q7.getLayoutDirection())), q7.K(c2682f.f21478y.f21475b));
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i4.c cVar, InterfaceC0289e0 interfaceC0289e0, InterfaceC0289e0 interfaceC0289e02) {
        super(1);
        this.f100l = 1;
        this.f102n = cVar;
        this.f101m = interfaceC0289e0;
        this.f103o = interfaceC0289e02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f100l = i;
        this.f102n = obj;
        this.f103o = obj2;
        this.f101m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ArrayList arrayList, u uVar, boolean z3, InterfaceC0289e0 interfaceC0289e0) {
        super(1);
        this.f100l = 0;
        this.f102n = arrayList;
        this.f103o = uVar;
        this.f101m = interfaceC0289e0;
    }
}
