package R3;

import M.G;
import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import P.e1;
import a.AbstractC0444a;
import i0.y;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import v.AbstractC2527w;
import x0.O;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.AbstractC2716r;
import z.C2686J;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f5211k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2201e f5212l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f5214n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5215o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5216p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5217q;

    public i(String str, C2201e c2201e, int i, String str2, long j5, String str3, long j6) {
        this.f5211k = str;
        this.f5212l = c2201e;
        this.f5213m = i;
        this.f5214n = str2;
        this.f5215o = j5;
        this.f5216p = str3;
        this.f5217q = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        long j5;
        long j6;
        ?? r32;
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p b3 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
            long j7 = V3.a.f;
            b0.p a5 = androidx.compose.foundation.a.a(b3, new y(X3.n.O(new i0.p(j7), new i0.p(V3.a.f5990u), new i0.p(V3.a.f5968G)), 0L, 9187343241974906880L));
            O e3 = AbstractC2710l.e(b0.c.f7137k, false);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, a5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s, c2751h, e3);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s, c2751h4, c5);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f6865a;
            C2201e O5 = AbstractC0444a.O();
            long j8 = V3.a.f5975d;
            G.a(O5, null, N4.b.h(AbstractC2036a.S(androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.b.d(aVar.a(b0.c.f7142p), 22, 0), 92), -12.0f), 0.07f), j8, c0315s, 3120, 0);
            b0.p f = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 12);
            b0.g gVar = b0.c.f7147u;
            C2686J a6 = AbstractC2685I.a(AbstractC2706h.f21538e, gVar, c0315s, 54);
            int p6 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l6 = c0315s.l();
            b0.p c6 = b0.a.c(c0315s, f);
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
            C2703e c2703e = new C2703e(8);
            b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
            C2686J a7 = AbstractC2685I.a(c2703e, gVar, c0315s, 54);
            int p7 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l7 = c0315s.l();
            b0.p c7 = b0.a.c(c0315s, C5);
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
            D.d dVar = j.f5219b;
            float f5 = 1;
            p0.a(androidx.compose.foundation.layout.c.g(mVar, 44, 48), dVar, j8, 0.0f, 6, AbstractC2527w.a(f5, i0.p.b(0.55f, V3.a.f5993x)), X.e.d(26734416, new g(this.f5213m), c0315s), c0315s, 14352822, 24);
            c0315s.X(-1372838796);
            C2201e c2201e = this.f5212l;
            if (c2201e != null) {
                j5 = j8;
                r32 = 0;
                p0.a(androidx.compose.foundation.layout.c.f(mVar, 36), dVar, j7, 0.0f, 0.0f, AbstractC2527w.a(f5, i0.p.b(0.4f, j8)), X.e.d(-728570261, new h(c2201e, 0), c0315s), c0315s, 14156214, 56);
                j6 = j7;
            } else {
                j5 = j8;
                j6 = j7;
                r32 = 0;
            }
            c0315s.q(r32);
            C2717s a8 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s, r32);
            int p8 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l8 = c0315s.l();
            b0.p c8 = b0.a.c(c0315s, mVar);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, a8);
            AbstractC0329z.y(c0315s, c2751h2, l8);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p8))) {
                AbstractC2107A.y(p8, c0315s, p8, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c8);
            e1 e1Var = w0.f3580a;
            u0.b(this.f5214n, null, this.f5215o, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s.j(e1Var)).f3571h, c0315s, 196608, 0, 65498);
            C0315s c0315s2 = c0315s;
            c0315s2.X(1124867459);
            String str = this.f5216p;
            if (str != null) {
                u0.b(str, null, this.f5217q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(e1Var)).f3574l, c0315s2, 0, 0, 65530);
                c0315s2 = c0315s2;
            }
            c0315s2.q(false);
            c0315s2.q(true);
            c0315s2.q(true);
            c0315s2.X(-57193947);
            String str2 = this.f5211k;
            if (str2 != null) {
                C0315s c0315s3 = c0315s2;
                j.g(str2, null, j6, j5, null, c0315s3, 3456, 18);
                c0315s2 = c0315s3;
            }
            c0315s2.q(false);
            c0315s2.q(true);
            c0315s2.q(true);
        }
        return W3.o.f6046a;
    }
}
