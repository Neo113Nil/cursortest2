package R3;

import K0.O;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import P.e1;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class g implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5208k;

    public g(int i) {
        this.f5208k = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.f fVar = b0.c.f7149w;
            O3.m mVar = AbstractC2706h.f21536c;
            b0.m mVar2 = b0.m.f7161k;
            C2717s a5 = AbstractC2716r.a(mVar, fVar, c0315s, 54);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, mVar2);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            e1 e1Var = w0.f3580a;
            O o5 = ((v0) c0315s.j(e1Var)).f3577o;
            O0.l lVar = O0.l.f4031q;
            long j5 = V3.a.f5981l;
            u0.b("STEP", null, j5, AbstractC2036a.H(8), lVar, 0L, null, 0L, 0, false, 0, 0, o5, c0315s, 200070, 0, 65490);
            int i = this.f5208k;
            if (i < 1) {
                i = 1;
            }
            u0.b(AbstractC2227e.J0(String.valueOf(i), 2), null, j5, 0L, O0.l.f4032r, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s.j(e1Var)).f3571h, c0315s, 196992, 0, 65498);
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}
