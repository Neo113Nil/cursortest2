package S3;

import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import game.betting133.sports1xbet.aqua_network.AquaClubCard;
import game.betting133.sports1xbet.aqua_network.AquaClubSheet;
import n.AbstractC2107A;
import o0.C2201e;
import r0.AbstractC2346c;
import v.AbstractC2527w;
import v.C2526v;
import x0.C2623i;
import z.AbstractC2685I;
import z.AbstractC2701c;
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
public final class X implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5424k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AquaClubSheet f5425l;

    public /* synthetic */ X(AquaClubSheet aquaClubSheet, int i) {
        this.f5424k = i;
        this.f5425l = aquaClubSheet;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5424k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    AquaClubCard sq_par_uad = this.f5425l.getSq_par_uad();
                    R3.l.a(sq_par_uad != null ? sq_par_uad.getArt_par_work() : null, androidx.compose.foundation.a.b(AbstractC0444a.n(androidx.compose.foundation.layout.b.f(b0.m.f7161k, 4).c(androidx.compose.foundation.layout.c.f6868c), D.e.a(6)), V3.a.f5962A, i0.F.f17222a), C2623i.f21001b, null, c0315s, 3120);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    b0.m mVar = b0.m.f7161k;
                    b0.p f = androidx.compose.foundation.layout.b.f(mVar, 14);
                    b0.g gVar = b0.c.f7147u;
                    C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21534a, gVar, c0315s2, 48);
                    int p5 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l5 = c0315s2.l();
                    b0.p c5 = b0.a.c(c0315s2, f);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z);
                    } else {
                        c0315s2.l0();
                    }
                    C2751h c2751h = C2752i.f21833e;
                    AbstractC0329z.y(c0315s2, c2751h, a5);
                    C2751h c2751h2 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s2, c2751h2, l5);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s2, p5, c2751h3);
                    }
                    C2751h c2751h4 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s2, c2751h4, c5);
                    D.d a6 = D.e.a(8);
                    long j5 = V3.a.f5962A;
                    b0.p f5 = androidx.compose.foundation.layout.c.f(mVar, 60);
                    long j6 = V3.a.f5975d;
                    C2526v a7 = AbstractC2527w.a(1, i0.p.b(0.5f, j6));
                    AquaClubSheet aquaClubSheet = this.f5425l;
                    p0.a(f5, a6, j5, 0.0f, 0.0f, a7, X.e.d(-1256998943, new X(aquaClubSheet, 0), c0315s2), c0315s2, 14156166, 56);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.f(mVar, 12));
                    b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
                    C2717s a8 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
                    int p6 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l6 = c0315s2.l();
                    b0.p c6 = b0.a.c(c0315s2, C5);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h, a8);
                    AbstractC0329z.y(c0315s2, c2751h2, l6);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s2, p6, c2751h3);
                    }
                    AbstractC0329z.y(c0315s2, c2751h4, c6);
                    C2686J r5 = L1.a.r(6, gVar, c0315s2, 54);
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
                    R3.j.c("CLUB", null, j6, 0L, c0315s2, 390, 10);
                    R3.j.b(G4.d.x(), null, j6, 14, c0315s2, 3456);
                    c0315s2.q(true);
                    float f6 = 4;
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f6));
                    AquaClubCard sq_par_uad2 = aquaClubSheet.getSq_par_uad();
                    String ti_par_tle = sq_par_uad2 != null ? sq_par_uad2.getTi_par_tle() : null;
                    if (ti_par_tle == null) {
                        ti_par_tle = "";
                    }
                    u0.b(ti_par_tle, null, 0L, 0L, O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(w0.f3580a)).f3571h, c0315s2, 196608, 0, 65502);
                    C2686J a9 = AbstractC2685I.a(new C2703e(f6), b0.c.f7146t, c0315s2, 6);
                    int p8 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l8 = c0315s2.l();
                    b0.p c8 = b0.a.c(c0315s2, mVar);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h, a9);
                    AbstractC0329z.y(c0315s2, c2751h2, l8);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p8))) {
                        AbstractC2107A.y(p8, c0315s2, p8, c2751h3);
                    }
                    AbstractC0329z.y(c0315s2, c2751h4, c8);
                    AquaClubCard sq_par_uad3 = aquaClubSheet.getSq_par_uad();
                    String nat_par_ion = sq_par_uad3 != null ? sq_par_uad3.getNat_par_ion() : null;
                    String str = nat_par_ion == null ? "" : nat_par_ion;
                    C2201e r6 = AbstractC2346c.r();
                    long j7 = V3.a.f;
                    R3.j.g(str, null, j7, j6, r6, c0315s2, 3456, 2);
                    AquaClubCard sq_par_uad4 = aquaClubSheet.getSq_par_uad();
                    Integer born_arg = sq_par_uad4 != null ? sq_par_uad4.getBorn_arg() : null;
                    c0315s2.X(357639591);
                    if (born_arg != null) {
                        R3.j.c(AbstractC2107A.q("Est. ", born_arg.intValue()), null, j7, j6, c0315s2, 3456, 2);
                    }
                    c0315s2.q(false);
                    c0315s2.q(true);
                    c0315s2.q(true);
                    c0315s2.q(true);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
