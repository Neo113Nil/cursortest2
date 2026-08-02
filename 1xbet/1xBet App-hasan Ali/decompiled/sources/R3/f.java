package R3;

import K0.O;
import M.G;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import z.AbstractC2685I;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.C2686J;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class f implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5204k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5206m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5207n;

    public f(String str, b0.p pVar, long j5) {
        this.f5206m = str;
        this.f5207n = pVar;
        this.f5205l = j5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5204k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    O o5 = ((v0) c0315s.j(w0.f3580a)).f3577o;
                    u0.b(this.f5206m, (b0.p) this.f5207n, this.f5205l, AbstractC2036a.H(10), O0.l.f4031q, 0L, new V0.k(3), 0L, 0, false, 0, 0, o5, c0315s, 199728, 0, 64976);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    b0.m mVar = b0.m.f7161k;
                    b0.p g5 = androidx.compose.foundation.layout.b.g(mVar, 12, 14);
                    C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21536c, b0.c.f7147u, c0315s2, 54);
                    int p5 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l5 = c0315s2.l();
                    b0.p c5 = b0.a.c(c0315s2, g5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21833e, a5);
                    AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s2, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21831c, c5);
                    b0.p f = androidx.compose.foundation.layout.c.f(mVar, 20);
                    C2201e c2201e = (C2201e) this.f5207n;
                    long j5 = this.f5205l;
                    G.a(c2201e, null, f, j5, c0315s2, 432, 0);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.i(8));
                    u0.b(this.f5206m, null, j5, 0L, O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(w0.f3580a)).f3575m, c0315s2, 196608, 0, 65498);
                    c0315s2.q(true);
                }
                break;
        }
        return W3.o.f6046a;
    }

    public f(C2201e c2201e, long j5, String str) {
        this.f5207n = c2201e;
        this.f5205l = j5;
        this.f5206m = str;
    }
}
