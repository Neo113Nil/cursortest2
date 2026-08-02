package S3;

import M.p0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import game.betting133.sports1xbet.aqua_network.AquaArenaCard;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import game.betting133.sports1xbet.aqua_network.AquaGoalBoard;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o4.AbstractC2227e;
import v.AbstractC2527w;
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
public final class H implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AquaMatchTicket f5378k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5380m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AquaClubBadge f5381n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AquaClubBadge f5382o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AquaGoalBoard f5383p;

    public H(AquaMatchTicket aquaMatchTicket, String str, boolean z3, AquaClubBadge aquaClubBadge, AquaClubBadge aquaClubBadge2, AquaGoalBoard aquaGoalBoard) {
        this.f5378k = aquaMatchTicket;
        this.f5379l = str;
        this.f5380m = z3;
        this.f5381n = aquaClubBadge;
        this.f5382o = aquaClubBadge2;
        this.f5383p = aquaGoalBoard;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ea, code lost:
    
        if (r1 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0320, code lost:
    
        if (r18 == null) goto L121;
     */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C2751h c2751h;
        String str;
        String str2;
        AquaArenaCard ar_par_ena;
        String munici_par_pality;
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p f = androidx.compose.foundation.layout.b.f(mVar, 14);
            C2700b c2700b = AbstractC2706h.f21534a;
            float f5 = 10;
            C2717s a5 = AbstractC2716r.a(new C2703e(f5), b0.c.f7148v, c0315s, 6);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, f);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            C2751h c2751h2 = C2752i.f21833e;
            AbstractC0329z.y(c0315s, c2751h2, a5);
            C2751h c2751h3 = C2752i.f21832d;
            AbstractC0329z.y(c0315s, c2751h3, l5);
            C2751h c2751h4 = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h4);
            }
            C2751h c2751h5 = C2752i.f21831c;
            AbstractC0329z.y(c0315s, c2751h5, c5);
            b0.p b3 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
            O3.m mVar2 = AbstractC2706h.f21538e;
            b0.g gVar = b0.c.f7147u;
            C2686J a6 = AbstractC2685I.a(mVar2, gVar, c0315s, 54);
            int p6 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l6 = c0315s.l();
            b0.p c6 = b0.a.c(c0315s, b3);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h2, a6);
            AbstractC0329z.y(c0315s, c2751h3, l6);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s, p6, c2751h4);
            }
            AbstractC0329z.y(c0315s, c2751h5, c6);
            float f6 = 6;
            C2686J r5 = L1.a.r(f6, gVar, c0315s, 54);
            int p7 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l7 = c0315s.l();
            b0.p c7 = b0.a.c(c0315s, mVar);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h2, r5);
            AbstractC0329z.y(c0315s, c2751h3, l7);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p7))) {
                AbstractC2107A.y(p7, c0315s, p7, c2751h4);
            }
            AbstractC0329z.y(c0315s, c2751h5, c7);
            String str3 = this.f5379l;
            if (str3 == null) {
                str3 = "--";
            }
            boolean z3 = this.f5380m;
            C0315s c0315s2 = c0315s;
            R3.j.c(str3, null, z3 ? V3.a.f5975d : V3.a.f, z3 ? V3.a.f5981l : V3.a.f5975d, c0315s2, 0, 2);
            c0315s2.X(678837190);
            if (z3) {
                R3.j.b(AbstractC2036a.y(), null, V3.a.f5975d, 12, c0315s2, 3456);
                c0315s2 = c0315s2;
            }
            c0315s2.q(false);
            c0315s2.q(true);
            AquaMatchTicket aquaMatchTicket = this.f5378k;
            AquaMatchCard ma_par_tch = aquaMatchTicket.getMa_par_tch();
            String renderKicmeanskoffStamp = AquaDisplayFormattersKt.renderKicmeanskoffStamp(ma_par_tch != null ? ma_par_tch.getKick_par_offAt() : null);
            C0315s c0315s3 = c0315s2;
            C2201e N5 = AbstractC0444a.N();
            long j5 = V3.a.f;
            long j6 = V3.a.f5975d;
            R3.j.g(renderKicmeanskoffStamp, null, j5, j6, N5, c0315s3, 3456, 2);
            c0315s3.q(true);
            b0.p b5 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
            C2686J r6 = L1.a.r(f5, gVar, c0315s3, 54);
            int p8 = AbstractC0329z.p(c0315s3);
            InterfaceC0314r0 l8 = c0315s3.l();
            b0.p c8 = b0.a.c(c0315s3, b5);
            c0315s3.b0();
            if (c0315s3.f4530S) {
                c0315s3.k(c2768z);
            } else {
                c0315s3.l0();
            }
            AbstractC0329z.y(c0315s3, c2751h2, r6);
            AbstractC0329z.y(c0315s3, c2751h3, l8);
            if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p8))) {
                c2751h = c2751h4;
                AbstractC2107A.y(p8, c0315s3, p8, c2751h);
            } else {
                c2751h = c2751h4;
            }
            AbstractC0329z.y(c0315s3, c2751h5, c8);
            AquaClubBadge aquaClubBadge = this.f5381n;
            String art_par_work = aquaClubBadge != null ? aquaClubBadge.getArt_par_work() : null;
            String ti_par_tle = aquaClubBadge != null ? aquaClubBadge.getTi_par_tle() : null;
            if (ti_par_tle == null) {
                ti_par_tle = "";
            }
            K.e(art_par_work, ti_par_tle, AbstractC2107A.C(mVar, 1.0f), c0315s3, 0);
            C2751h c2751h6 = c2751h;
            p0.a(null, D.e.a(4), j5, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.5f, j6)), X.e.d(1720927544, new P.r(8, this.f5383p), c0315s3), c0315s3, 14156160, 57);
            AquaClubBadge aquaClubBadge2 = this.f5382o;
            String art_par_work2 = aquaClubBadge2 != null ? aquaClubBadge2.getArt_par_work() : null;
            String ti_par_tle2 = aquaClubBadge2 != null ? aquaClubBadge2.getTi_par_tle() : null;
            if (ti_par_tle2 == null) {
                ti_par_tle2 = "";
            }
            K.e(art_par_work2, ti_par_tle2, AbstractC2107A.C(mVar, 1.0f), c0315s3, 0);
            M.G.a(G4.d.s(), null, androidx.compose.foundation.layout.c.f(mVar, 20), j6, c0315s3, 3504, 0);
            c0315s3.q(true);
            C2703e c2703e = new C2703e(f6);
            b0.p b6 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
            C2686J a7 = AbstractC2685I.a(c2703e, b0.c.f7146t, c0315s3, 6);
            int p9 = AbstractC0329z.p(c0315s3);
            InterfaceC0314r0 l9 = c0315s3.l();
            b0.p c9 = b0.a.c(c0315s3, b6);
            c0315s3.b0();
            if (c0315s3.f4530S) {
                c0315s3.k(c2768z);
            } else {
                c0315s3.l0();
            }
            AbstractC0329z.y(c0315s3, c2751h2, a7);
            AbstractC0329z.y(c0315s3, c2751h3, l9);
            if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p9))) {
                AbstractC2107A.y(p9, c0315s3, p9, c2751h6);
            }
            AbstractC0329z.y(c0315s3, c2751h5, c9);
            AquaCompetitionPocket compe_par_tition = aquaMatchTicket.getCompe_par_tition();
            if (compe_par_tition != null && (str = compe_par_tition.getPh_par_ase()) != null) {
                if (AbstractC2227e.H0(str)) {
                    str = null;
                }
            }
            str = "Fixture";
            R3.j.g(str, AbstractC2107A.C(mVar, 1.0f), j5, j6, AbstractC0444a.M(), c0315s3, 3456, 0);
            AquaMatchCard ma_par_tch2 = aquaMatchTicket.getMa_par_tch();
            if (ma_par_tch2 != null && (ar_par_ena = ma_par_tch2.getAr_par_ena()) != null && (munici_par_pality = ar_par_ena.getMunici_par_pality()) != null) {
                str2 = AbstractC2227e.H0(munici_par_pality) ? null : munici_par_pality;
            }
            str2 = "Venue TBA";
            String str4 = str2;
            C2201e c2201e = G4.d.f1994d;
            if (c2201e == null) {
                C2200d c2200d = new C2200d("Filled.Place", false);
                int i = o0.z.f18603a;
                i0.M m5 = new i0.M(i0.p.f17289b);
                C2202f c2202f = new C2202f(0);
                c2202f.m(12.0f, 2.0f);
                c2202f.f(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f);
                c2202f.g(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
                c2202f.o(7.0f, -7.75f, 7.0f, -13.0f);
                c2202f.g(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
                c2202f.e();
                c2202f.m(12.0f, 11.5f);
                c2202f.g(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
                c2202f.o(1.12f, -2.5f, 2.5f, -2.5f);
                c2202f.o(2.5f, 1.12f, 2.5f, 2.5f);
                c2202f.o(-1.12f, 2.5f, -2.5f, 2.5f);
                c2202f.e();
                C2200d.a(c2200d, c2202f.f18548a, m5);
                c2201e = c2200d.b();
                G4.d.f1994d = c2201e;
            }
            R3.j.g(str4, AbstractC2107A.C(mVar, 1.0f), j5, V3.a.f5978h, c2201e, c0315s3, 3456, 0);
            R3.j.c("⚽", null, j5, j6, c0315s3, 3462, 2);
            c0315s3.q(true);
            c0315s3.q(true);
        }
        return W3.o.f6046a;
    }
}
