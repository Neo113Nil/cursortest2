package S3;

import M.AbstractC0251w;
import M.C0249u;
import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_network.AquaTerritoryCard;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import o4.AbstractC2227e;
import r0.AbstractC2346c;
import v.AbstractC2527w;
import v.C2526v;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class W implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AquaCompetitionBundle f5420k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5421l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5422m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5423n;

    public W(AquaCompetitionBundle aquaCompetitionBundle, int i, boolean z3, int i5) {
        this.f5420k = aquaCompetitionBundle;
        this.f5421l = i;
        this.f5422m = z3;
        this.f5423n = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x029f, code lost:
    
        if (r24 == null) goto L73;
     */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C2768z c2768z;
        String str;
        String ti_par_tle;
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p f = androidx.compose.foundation.layout.b.f(mVar, 14);
            b0.g gVar = b0.c.f7147u;
            C2700b c2700b = AbstractC2706h.f21534a;
            C2686J r5 = L1.a.r(12, gVar, c0315s, 54);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, f);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z2 = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z2);
            } else {
                c0315s.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s, c2751h, r5);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s, c2751h4, c5);
            D.d a5 = D.e.a(4);
            long j5 = V3.a.f;
            b0.p f5 = androidx.compose.foundation.layout.c.f(mVar, 54);
            long j6 = V3.a.f5975d;
            C2526v a6 = AbstractC2527w.a(1, i0.p.b(0.5f, j6));
            AquaCompetitionBundle aquaCompetitionBundle = this.f5420k;
            p0.a(f5, a5, j5, 0.0f, 0.0f, a6, X.e.d(1972607495, new P.r(9, aquaCompetitionBundle), c0315s), c0315s, 14156166, 56);
            b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
            float f6 = 6;
            C2717s a7 = AbstractC2716r.a(new C2703e(f6), b0.c.f7148v, c0315s, 6);
            int p6 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l6 = c0315s.l();
            b0.p c6 = b0.a.c(c0315s, C5);
            c0315s.b0();
            if (c0315s.f4530S) {
                c2768z = c2768z2;
                c0315s.k(c2768z);
            } else {
                c2768z = c2768z2;
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, a7);
            AbstractC0329z.y(c0315s, c2751h2, l6);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c6);
            C2686J a8 = AbstractC2685I.a(new C2703e(f6), gVar, c0315s, 54);
            int p7 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l7 = c0315s.l();
            b0.p c7 = b0.a.c(c0315s, mVar);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, a8);
            AbstractC0329z.y(c0315s, c2751h2, l7);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p7))) {
                AbstractC2107A.y(p7, c0315s, p7, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c7);
            String str2 = "#" + this.f5421l;
            boolean z3 = this.f5422m;
            C2768z c2768z3 = c2768z;
            R3.j.c(str2, null, z3 ? j6 : j5, z3 ? V3.a.f5981l : j6, c0315s, 0, 2);
            c0315s.X(-930405683);
            if (z3) {
                R3.j.b(AbstractC2036a.y(), null, j6, 16, c0315s, 3456);
            }
            c0315s.q(false);
            C2201e y5 = N4.b.y();
            long j7 = V3.a.f5978h;
            R3.j.b(y5, null, j7, 12, c0315s, 3456);
            c0315s.q(true);
            AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
            String ti_par_tle2 = compe_par_tition != null ? compe_par_tition.getTi_par_tle() : null;
            if (ti_par_tle2 == null) {
                ti_par_tle2 = "";
            }
            u0.b(ti_par_tle2, null, ((C0249u) c0315s.j(AbstractC0251w.f3578a)).f3539o, 0L, O0.l.f4030p, 0L, null, 0L, 2, false, 2, 0, ((v0) c0315s.j(w0.f3580a)).i, c0315s, 196608, 3120, 55258);
            C2686J a9 = AbstractC2685I.a(new C2703e(f6), b0.c.f7146t, c0315s, 6);
            int p8 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l8 = c0315s.l();
            b0.p c8 = b0.a.c(c0315s, mVar);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z3);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, a9);
            AbstractC0329z.y(c0315s, c2751h2, l8);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p8))) {
                AbstractC2107A.y(p8, c0315s, p8, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c8);
            AquaTerritoryCard terr_par_itory = aquaCompetitionBundle.getTerr_par_itory();
            if (terr_par_itory != null && (ti_par_tle = terr_par_itory.getTi_par_tle()) != null) {
                str = AbstractC2227e.H0(ti_par_tle) ? null : ti_par_tle;
            }
            str = "Global";
            R3.j.g(str, null, j5, j6, G4.l.B(), c0315s, 3456, 2);
            R3.j.g(String.valueOf(this.f5423n), null, j5, j7, AbstractC2346c.n(), c0315s, 3456, 2);
            c0315s.q(true);
            c0315s.q(true);
            M.G.a(G4.d.s(), null, androidx.compose.foundation.layout.c.f(mVar, 22), j6, c0315s, 3504, 0);
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}
