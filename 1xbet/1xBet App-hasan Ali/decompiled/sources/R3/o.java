package R3;

import K0.O;
import M.AbstractC0251w;
import M.C0249u;
import M.g0;
import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import P.e1;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import v.AbstractC2527w;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2686J;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class o implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0.p f5233k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5234l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5235m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f5236n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5237o;

    public o(b0.p pVar, InterfaceC2015a interfaceC2015a, int i, String str, String str2) {
        this.f5233k = pVar;
        this.f5234l = interfaceC2015a;
        this.f5235m = i;
        this.f5236n = str;
        this.f5237o = str2;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            float f = 6;
            b0.p g5 = androidx.compose.foundation.layout.b.g(this.f5233k, 8, f);
            b0.g gVar = b0.c.f7147u;
            C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21534a, gVar, c0315s, 48);
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
            g0.c(this.f5234l, null, false, null, t.f5246a, c0315s, 196608, 30);
            b0.m mVar = b0.m.f7161k;
            b0.p f5 = androidx.compose.foundation.layout.c.f(mVar, 36);
            D.d dVar = j.f5219b;
            long j5 = V3.a.f;
            long j6 = V3.a.f5975d;
            p0.a(f5, dVar, j5, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.4f, j6)), t.f5247b, c0315s, 14156214, 56);
            b0.p C5 = AbstractC2107A.C(androidx.compose.foundation.layout.b.i(mVar, 10, 0.0f, 0.0f, 14), 1.0f);
            C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s, 0);
            int p6 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l6 = c0315s.l();
            b0.p c6 = b0.a.c(c0315s, C5);
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
            int i = this.f5235m;
            if (i < 1) {
                i = 1;
            }
            j.c(L1.a.m("STEP ", AbstractC2227e.J0(String.valueOf(i), 2)), null, j6, V3.a.f5981l, c0315s, 3456, 2);
            e1 e1Var = w0.f3580a;
            O o5 = ((v0) c0315s.j(e1Var)).f3570g;
            u0.b(this.f5236n, null, ((C0249u) c0315s.j(AbstractC0251w.f3578a)).f3539o, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 1, 0, o5, c0315s, 196608, 3072, 57306);
            C0315s c0315s2 = c0315s;
            c0315s2.X(1361767660);
            String str = this.f5237o;
            if (str != null) {
                C2686J r5 = L1.a.r(f, gVar, c0315s2, 54);
                int p7 = AbstractC0329z.p(c0315s2);
                InterfaceC0314r0 l7 = c0315s2.l();
                b0.p c7 = b0.a.c(c0315s2, mVar);
                c0315s2.b0();
                if (c0315s2.f4530S) {
                    c0315s2.k(c2768z);
                } else {
                    c0315s2.l0();
                }
                AbstractC0329z.y(c0315s2, c2751h, r5);
                AbstractC0329z.y(c0315s2, c2751h2, l7);
                if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p7))) {
                    AbstractC2107A.y(p7, c0315s2, p7, c2751h3);
                }
                AbstractC0329z.y(c0315s2, c2751h4, c7);
                j.b(AbstractC2036a.y(), null, j6, 12, c0315s2, 3456);
                u0.b(str, null, V3.a.f5987r, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((v0) c0315s2.j(e1Var)).f3576n, c0315s2, 384, 3072, 57338);
                c0315s2 = c0315s2;
                z3 = true;
                c0315s2.q(true);
            } else {
                z3 = true;
            }
            c0315s2.q(false);
            c0315s2.q(z3);
            C0315s c0315s3 = c0315s2;
            j.g("GOLD", null, j5, j6, G4.d.x(), c0315s3, 3462, 2);
            c0315s3.q(z3);
        }
        return W3.o.f6046a;
    }
}
