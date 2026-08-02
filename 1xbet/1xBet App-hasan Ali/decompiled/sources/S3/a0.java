package S3;

import M.AbstractC0251w;
import M.C0249u;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import P.e1;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2686J;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class a0 implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5431k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5432l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5433m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5434n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5435o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5436p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5437q;

    public a0(InterfaceC2015a interfaceC2015a, boolean z3, InterfaceC2015a interfaceC2015a2, boolean z5, int i, int i5, int i6) {
        this.f5431k = interfaceC2015a;
        this.f5432l = z3;
        this.f5433m = interfaceC2015a2;
        this.f5434n = z5;
        this.f5435o = i;
        this.f5436p = i5;
        this.f5437q = i6;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            float f = 4;
            b0.p g5 = androidx.compose.foundation.layout.b.g(mVar, f, 2);
            O3.m mVar2 = AbstractC2706h.f21538e;
            b0.g gVar = b0.c.f7147u;
            C2686J a5 = AbstractC2685I.a(mVar2, gVar, c0315s, 54);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, g5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s, c2751h, a5);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s, c2751h4, c5);
            M.g0.c(this.f5431k, null, this.f5432l, null, h0.f5500e, c0315s, 196608, 26);
            C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7149w, c0315s, 48);
            int p6 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l6 = c0315s.l();
            b0.p c6 = b0.a.c(c0315s, mVar);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, a6);
            AbstractC0329z.y(c0315s, c2751h2, l6);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c6);
            C2686J a7 = AbstractC2685I.a(new C2703e(f), gVar, c0315s, 54);
            int p7 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l7 = c0315s.l();
            b0.p c7 = b0.a.c(c0315s, mVar);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, a7);
            AbstractC0329z.y(c0315s, c2751h2, l7);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p7))) {
                AbstractC2107A.y(p7, c0315s, p7, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c7);
            R3.j.b(N4.b.y(), null, V3.a.f5975d, 14, c0315s, 3456);
            String str = this.f5436p + " / " + this.f5437q;
            e1 e1Var = w0.f3580a;
            K0.O o5 = ((v0) c0315s.j(e1Var)).f3573k;
            O0.l lVar = O0.l.f4030p;
            e1 e1Var2 = AbstractC0251w.f3578a;
            u0.b(str, null, ((C0249u) c0315s.j(e1Var2)).f3539o, 0L, lVar, 0L, null, 0L, 0, false, 0, 0, o5, c0315s, 196608, 0, 65498);
            c0315s.q(true);
            u0.b(L1.a.o(new StringBuilder(), this.f5435o, " total"), null, ((C0249u) c0315s.j(e1Var2)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s.j(e1Var)).f3574l, c0315s, 0, 0, 65530);
            c0315s.q(true);
            M.g0.c(this.f5433m, null, this.f5434n, null, h0.f, c0315s, 196608, 26);
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}
