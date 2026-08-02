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
import a.AbstractC0444a;
import game.betting133.sports1xbet.aqua_network.AquaCampaignCard;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import game.betting133.sports1xbet.aqua_network.AquaDisciplineCard;
import game.betting133.sports1xbet.aqua_network.AquaPlayerCard;
import game.betting133.sports1xbet.aqua_network.AquaSeasonLedger;
import game.betting133.sports1xbet.aqua_network.AquaTerritoryCard;
import game.betting133.sports1xbet.aqua_network.AquaUsageCard;
import java.util.List;
import java.util.Locale;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import o4.AbstractC2227e;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import v.AbstractC2527w;
import z.AbstractC2685I;
import z.AbstractC2701c;
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

/* renamed from: S3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402e implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5473k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5474l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5475m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5476n;

    public /* synthetic */ C0402e(int i, int i5, Object obj, Object obj2) {
        this.f5473k = i5;
        this.f5474l = obj;
        this.f5476n = i;
        this.f5475m = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0727, code lost:
    
        if (r9 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027a, code lost:
    
        if (r16 == null) goto L73;
     */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j5;
        String str;
        String nat_par_ion;
        AquaUsageCard us_par_age;
        String role_arg;
        String str2;
        String str3;
        String str4;
        String str5;
        AquaDisciplineCard disci_par_pline;
        Integer dism_par_issal;
        String num;
        AquaDisciplineCard disci_par_pline2;
        Integer cau_par_tion;
        AquaCompetitionPocket compe_par_tition;
        Integer st_par_amp;
        AquaCompetitionPocket compe_par_tition2;
        AquaClubBadge sq_par_uad;
        long j6;
        String str6;
        String ti_par_tle;
        W3.o oVar = W3.o.f6046a;
        Object obj3 = this.f5475m;
        int i = this.f5476n;
        Object obj4 = this.f5474l;
        b0.m mVar = b0.m.f7161k;
        switch (this.f5473k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s.B()) {
                    b0.g gVar = b0.c.f7147u;
                    C2700b c2700b = AbstractC2706h.f21534a;
                    C2703e c2703e = new C2703e(14);
                    b0.p f = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 16);
                    C2686J a5 = AbstractC2685I.a(c2703e, gVar, c0315s, 54);
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
                    D.d a6 = D.e.a(8);
                    long j7 = V3.a.f5962A;
                    b0.p f5 = androidx.compose.foundation.layout.c.f(mVar, 100);
                    long j8 = V3.a.f5975d;
                    AquaPlayerCard aquaPlayerCard = (AquaPlayerCard) obj4;
                    p0.a(f5, a6, j7, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.5f, j8)), X.e.d(283462601, new C0401d(aquaPlayerCard, 0), c0315s), c0315s, 14156166, 56);
                    b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
                    float f6 = 6;
                    C2717s a7 = AbstractC2716r.a(new C2703e(f6), b0.c.f7148v, c0315s, 6);
                    int p6 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l6 = c0315s.l();
                    b0.p c6 = b0.a.c(c0315s, C5);
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, c2751h, a7);
                    AbstractC0329z.y(c0315s, c2751h2, l6);
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s, p6, c2751h3);
                    }
                    AbstractC0329z.y(c0315s, c2751h4, c6);
                    C2686J r5 = L1.a.r(4, gVar, c0315s, 54);
                    int p7 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l7 = c0315s.l();
                    b0.p c7 = b0.a.c(c0315s, mVar);
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, c2751h, r5);
                    AbstractC0329z.y(c0315s, c2751h2, l7);
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s, p7, c2751h3);
                    }
                    AbstractC0329z.y(c0315s, c2751h4, c7);
                    R3.j.c("PLAYER CARD", null, j8, 0L, c0315s, 390, 10);
                    R3.j.b(AbstractC2036a.y(), null, j8, 12, c0315s, 3456);
                    c0315s.q(true);
                    String ti_par_tle2 = aquaPlayerCard != null ? aquaPlayerCard.getTi_par_tle() : null;
                    u0.b(ti_par_tle2 == null ? "" : ti_par_tle2, null, ((C0249u) c0315s.j(AbstractC0251w.f3578a)).f3539o, 0L, O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s.j(w0.f3580a)).f, c0315s, 196608, 0, 65498);
                    C2686J a8 = AbstractC2685I.a(new C2703e(f6), b0.c.f7146t, c0315s, 6);
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
                    AquaSeasonLedger aquaSeasonLedger = (AquaSeasonLedger) obj3;
                    String str7 = (aquaSeasonLedger == null || (us_par_age = aquaSeasonLedger.getUs_par_age()) == null || (role_arg = us_par_age.getRole_arg()) == null || role_arg.length() <= 0) ? null : role_arg;
                    c0315s.X(1016679699);
                    if (str7 == null) {
                        j5 = j8;
                    } else {
                        j5 = j8;
                        R3.j.g(str7, null, j5, V3.a.f5981l, G4.d.x(), c0315s, 3456, 2);
                    }
                    c0315s.q(false);
                    if (aquaPlayerCard != null && (nat_par_ion = aquaPlayerCard.getNat_par_ion()) != null) {
                        if (!AbstractC2227e.H0(nat_par_ion)) {
                            str = nat_par_ion;
                            break;
                        } else {
                            str = null;
                            break;
                        }
                    }
                    str = "Nation";
                    String str8 = str;
                    C2201e v4 = AbstractC2425d.v();
                    long j9 = V3.a.f;
                    R3.j.g(str8, null, j9, j5, v4, c0315s, 3456, 2);
                    c0315s.q(true);
                    R3.j.g(L1.a.o(new StringBuilder(), i, " Season"), null, j9, V3.a.f5978h, AbstractC2346c.n(), c0315s, 3456, 2);
                    c0315s.q(true);
                    c0315s.q(true);
                    break;
                } else {
                    c0315s.S();
                    break;
                }
                break;
            case 1:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s2.B()) {
                    float f7 = 6;
                    b0.p g5 = androidx.compose.foundation.layout.b.g(mVar, 16, f7);
                    C2717s a9 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
                    int p9 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l9 = c0315s2.l();
                    b0.p c9 = b0.a.c(c0315s2, g5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    C2751h c2751h5 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s2, c2751h5, a9);
                    C2751h c2751h6 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s2, c2751h6, l9);
                    C2751h c2751h7 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p9))) {
                        AbstractC2107A.y(p9, c0315s2, p9, c2751h7);
                    }
                    C2751h c2751h8 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s2, c2751h8, c9);
                    C2686J r6 = L1.a.r(f7, b0.c.f7147u, c0315s2, 54);
                    int p10 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l10 = c0315s2.l();
                    b0.p c10 = b0.a.c(c0315s2, mVar);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h5, r6);
                    AbstractC0329z.y(c0315s2, c2751h6, l10);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p10))) {
                        AbstractC2107A.y(p10, c0315s2, p10, c2751h7);
                    }
                    AbstractC0329z.y(c0315s2, c2751h8, c10);
                    C2201e M5 = AbstractC0444a.M();
                    long j10 = V3.a.f5975d;
                    R3.j.b(M5, null, j10, 16, c0315s2, 3456);
                    u0.b("Details", null, j10, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(w0.f3580a)).i, c0315s2, 196998, 0, 65498);
                    c0315s2.q(true);
                    float f8 = 4;
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f8));
                    R3.j.f(null, c0315s2, 0, 1);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f8));
                    String str9 = "--";
                    AquaPlayerCard aquaPlayerCard2 = (AquaPlayerCard) obj4;
                    if (aquaPlayerCard2 == null || (str2 = aquaPlayerCard2.getNat_par_ion()) == null) {
                        str2 = "--";
                    }
                    AbstractC0406i.d("Nationality", str2, AbstractC2425d.v(), c0315s2, 6);
                    AquaSeasonLedger aquaSeasonLedger2 = (AquaSeasonLedger) obj3;
                    if (aquaSeasonLedger2 == null || (sq_par_uad = aquaSeasonLedger2.getSq_par_uad()) == null || (str3 = sq_par_uad.getTi_par_tle()) == null) {
                        str3 = "--";
                    }
                    AbstractC0406i.d("Club", str3, G4.l.D(), c0315s2, 6);
                    if (aquaSeasonLedger2 == null || (compe_par_tition2 = aquaSeasonLedger2.getCompe_par_tition()) == null || (str4 = compe_par_tition2.getTi_par_tle()) == null) {
                        str4 = "--";
                    }
                    if (aquaSeasonLedger2 != null && (compe_par_tition = aquaSeasonLedger2.getCompe_par_tition()) != null && (st_par_amp = compe_par_tition.getSt_par_amp()) != null) {
                        i = st_par_amp.intValue();
                    }
                    AbstractC0406i.d("League", str4 + " (" + i + ")", AbstractC0444a.M(), c0315s2, 6);
                    if (aquaSeasonLedger2 == null || (disci_par_pline2 = aquaSeasonLedger2.getDisci_par_pline()) == null || (cau_par_tion = disci_par_pline2.getCau_par_tion()) == null || (str5 = cau_par_tion.toString()) == null) {
                        str5 = "--";
                    }
                    AbstractC0406i.d("Yellow cards", str5, AbstractC2349a.D(), c0315s2, 6);
                    if (aquaSeasonLedger2 != null && (disci_par_pline = aquaSeasonLedger2.getDisci_par_pline()) != null && (dism_par_issal = disci_par_pline.getDism_par_issal()) != null && (num = dism_par_issal.toString()) != null) {
                        str9 = num;
                    }
                    AbstractC0406i.d("Red cards", str9, AbstractC2349a.D(), c0315s2, 6);
                    c0315s2.q(true);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
                break;
            default:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s3.B()) {
                    b0.p f9 = androidx.compose.foundation.layout.b.f(mVar, 14);
                    b0.g gVar2 = b0.c.f7147u;
                    C2700b c2700b2 = AbstractC2706h.f21534a;
                    C2686J r7 = L1.a.r(12, gVar2, c0315s3, 54);
                    int p11 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l11 = c0315s3.l();
                    b0.p c11 = b0.a.c(c0315s3, f9);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z3 = C2752i.f21830b;
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    C2751h c2751h9 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s3, c2751h9, r7);
                    C2751h c2751h10 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s3, c2751h10, l11);
                    C2751h c2751h11 = C2752i.f;
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p11))) {
                        AbstractC2107A.y(p11, c0315s3, p11, c2751h11);
                    }
                    C2751h c2751h12 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s3, c2751h12, c11);
                    float f10 = 4;
                    D.d a10 = D.e.a(f10);
                    long j11 = V3.a.f;
                    b0.p f11 = androidx.compose.foundation.layout.c.f(mVar, 56);
                    float f12 = 1;
                    long j12 = V3.a.f5975d;
                    AquaCompetitionCard aquaCompetitionCard = (AquaCompetitionCard) obj4;
                    p0.a(f11, a10, j11, 0.0f, 0.0f, AbstractC2527w.a(f12, i0.p.b(0.4f, j12)), X.e.d(1238304576, new P.r(10, aquaCompetitionCard), c0315s3), c0315s3, 14156166, 56);
                    b0.p C6 = AbstractC2107A.C(mVar, 1.0f);
                    float f13 = 6;
                    long j13 = j12;
                    C2717s a11 = AbstractC2716r.a(new C2703e(f13), b0.c.f7148v, c0315s3, 6);
                    int p12 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l12 = c0315s3.l();
                    b0.p c12 = b0.a.c(c0315s3, C6);
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, c2751h9, a11);
                    AbstractC0329z.y(c0315s3, c2751h10, l12);
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p12))) {
                        AbstractC2107A.y(p12, c0315s3, p12, c2751h11);
                    }
                    AbstractC0329z.y(c0315s3, c2751h12, c12);
                    C2686J a12 = AbstractC2685I.a(new C2703e(f13), gVar2, c0315s3, 54);
                    int p13 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l13 = c0315s3.l();
                    b0.p c13 = b0.a.c(c0315s3, mVar);
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, c2751h9, a12);
                    AbstractC0329z.y(c0315s3, c2751h10, l13);
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p13))) {
                        AbstractC2107A.y(p13, c0315s3, p13, c2751h11);
                    }
                    AbstractC0329z.y(c0315s3, c2751h12, c13);
                    R3.j.c(String.valueOf(i), null, j13, 0L, c0315s3, 384, 10);
                    String for_par_mat = aquaCompetitionCard != null ? aquaCompetitionCard.getFor_par_mat() : null;
                    c0315s3.X(-1345930010);
                    if (for_par_mat == null) {
                        j6 = j11;
                    } else {
                        String upperCase = AbstractC2227e.P0(for_par_mat, 8).toUpperCase(Locale.ROOT);
                        kotlin.jvm.internal.l.e("toUpperCase(...)", upperCase);
                        R3.j.c(upperCase, null, j11, j13, c0315s3, 3456, 2);
                        j6 = j11;
                        j13 = j13;
                    }
                    c0315s3.q(false);
                    R3.j.b(AbstractC2346c.u(), null, j13, 12, c0315s3, 3456);
                    long j14 = j13;
                    c0315s3.q(true);
                    String ti_par_tle3 = aquaCompetitionCard != null ? aquaCompetitionCard.getTi_par_tle() : null;
                    u0.b(ti_par_tle3 == null ? "" : ti_par_tle3, null, ((C0249u) c0315s3.j(AbstractC0251w.f3578a)).f3539o, 0L, O0.l.f4030p, 0L, null, 0L, 2, false, 2, 0, ((v0) c0315s3.j(w0.f3580a)).i, c0315s3, 196608, 3120, 55258);
                    C2686J a13 = AbstractC2685I.a(new C2703e(f13), b0.c.f7146t, c0315s3, 6);
                    int p14 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l14 = c0315s3.l();
                    b0.p c14 = b0.a.c(c0315s3, mVar);
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, c2751h9, a13);
                    AbstractC0329z.y(c0315s3, c2751h10, l14);
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p14))) {
                        AbstractC2107A.y(p14, c0315s3, p14, c2751h11);
                    }
                    AbstractC0329z.y(c0315s3, c2751h12, c14);
                    AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) obj3;
                    AquaTerritoryCard terr_par_itory = aquaCompetitionBundle.getTerr_par_itory();
                    if (terr_par_itory != null && (ti_par_tle = terr_par_itory.getTi_par_tle()) != null) {
                        if (!AbstractC2227e.H0(ti_par_tle)) {
                            str6 = ti_par_tle;
                            break;
                        } else {
                            str6 = null;
                            break;
                        }
                    }
                    str6 = "Global";
                    long j15 = j6;
                    R3.j.g(str6, null, j15, j14, G4.l.B(), c0315s3, 3456, 2);
                    List<AquaCampaignCard> camp_par_aigns = aquaCompetitionBundle.getCamp_par_aigns();
                    if (camp_par_aigns == null) {
                        camp_par_aigns = X3.v.f6090k;
                    }
                    R3.j.g(camp_par_aigns.size() + " seasons", null, j15, V3.a.f5978h, AbstractC2346c.n(), c0315s3, 3456, 2);
                    c0315s3.q(true);
                    c0315s3.q(true);
                    p0.a(androidx.compose.foundation.layout.c.f(mVar, (float) 36), D.e.a(f10), j15, 0.0f, 0.0f, AbstractC2527w.a(f12, i0.p.b(0.5f, j14)), h0.f5499d, c0315s3, 14156166, 56);
                    c0315s3.q(true);
                    break;
                } else {
                    c0315s3.S();
                    break;
                }
                break;
        }
        return oVar;
    }

    public C0402e(AquaPlayerCard aquaPlayerCard, AquaSeasonLedger aquaSeasonLedger, int i) {
        this.f5473k = 1;
        this.f5474l = aquaPlayerCard;
        this.f5475m = aquaSeasonLedger;
        this.f5476n = i;
    }
}
