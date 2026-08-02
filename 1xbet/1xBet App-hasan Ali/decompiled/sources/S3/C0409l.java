package S3;

import M.AbstractC0251w;
import M.C0249u;
import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0328y0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchDigest;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaPulseCard;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureInsightUiState;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import o4.AbstractC2227e;
import r0.AbstractC2346c;
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

/* renamed from: S3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409l implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5512k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.e f5513l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.c f5514m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5515n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5516o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5517p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5518q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5519r;

    public C0409l(AquaCompetitionPocket aquaCompetitionPocket, i4.e eVar, AquaMatchCard aquaMatchCard, AquaClubBadge aquaClubBadge, i4.c cVar, AquaClubBadge aquaClubBadge2, AquaMatchTicket aquaMatchTicket) {
        this.f5515n = aquaCompetitionPocket;
        this.f5513l = eVar;
        this.f5516o = aquaMatchCard;
        this.f5517p = aquaClubBadge;
        this.f5514m = cVar;
        this.f5518q = aquaClubBadge2;
        this.f5519r = aquaMatchTicket;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0250, code lost:
    
        if (r5 == null) goto L68;
     */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C2768z c2768z;
        C2751h c2751h;
        String str;
        String str2;
        C2751h c2751h2;
        String str3;
        AquaPulseCard pu_par_lse;
        AquaPulseCard pu_par_lse2;
        switch (this.f5512k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    b0.m mVar = b0.m.f7161k;
                    float f = 8;
                    b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f6868c, 0.0f, f, 0.0f, 13), 14, 0.0f, 2);
                    C2717s a5 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s, 0);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    b0.p c5 = b0.a.c(c0315s, h3);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z2);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
                    AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s, p5, c2751h3);
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
                    N4.b.v("Match Center", (InterfaceC2015a) this.f5515n, 0, c0315s, 6, 4);
                    N4.b.t(this.f5518q, c0315s, 0);
                    InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) this.f5519r;
                    if (((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getBusy_arg()) {
                        c0315s.X(-1107662901);
                        G4.l.n(AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    } else if (((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getFaul_par_tText() != null) {
                        c0315s.X(-1107659863);
                        String faul_par_tText = ((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                        kotlin.jvm.internal.l.c(faul_par_tText);
                        G4.l.w(faul_par_tText, AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    } else if (((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getMatch_par_Bundle() != null) {
                        c0315s.X(22420908);
                        AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f));
                        N4.b.s((InterfaceC2015a) this.f5516o, (InterfaceC2015a) this.f5517p, c0315s, 0);
                        AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, 10));
                        AquaMatchDigest match_par_Bundle = ((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getMatch_par_Bundle();
                        kotlin.jvm.internal.l.c(match_par_Bundle);
                        AbstractC0412o.b(match_par_Bundle, this.f5514m, this.f5513l, AbstractC2107A.B(), c0315s, 0);
                        c0315s = c0315s;
                        c0315s.q(false);
                    } else {
                        c0315s.X(22914335);
                        c0315s.q(false);
                    }
                    c0315s.q(true);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    b0.f fVar = b0.c.f7149w;
                    b0.m mVar2 = b0.m.f7161k;
                    b0.p f5 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.b(mVar2, 1.0f), 18);
                    C2700b c2700b = AbstractC2706h.f21535b;
                    C2717s a6 = AbstractC2716r.a(c2700b, fVar, c0315s2, 48);
                    int p6 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l6 = c0315s2.l();
                    b0.p c6 = b0.a.c(c0315s2, f5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z3 = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z3);
                    } else {
                        c0315s2.l0();
                    }
                    C2751h c2751h4 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s2, c2751h4, a6);
                    C2751h c2751h5 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s2, c2751h5, l6);
                    C2751h c2751h6 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s2, p6, c2751h6);
                    }
                    C2751h c2751h7 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s2, c2751h7, c6);
                    b0.g gVar = b0.c.f7147u;
                    C2703e c2703e = new C2703e(8);
                    c0315s2.X(1230929821);
                    AquaCompetitionPocket aquaCompetitionPocket = (AquaCompetitionPocket) this.f5515n;
                    boolean f6 = c0315s2.f(aquaCompetitionPocket);
                    i4.e eVar = this.f5513l;
                    boolean f7 = f6 | c0315s2.f(eVar);
                    Object M5 = c0315s2.M();
                    if (f7 || M5 == C0302l.f4480a) {
                        M5 = new C0328y0(2, aquaCompetitionPocket, eVar);
                        c0315s2.i0(M5);
                    }
                    c0315s2.q(false);
                    b0.p d5 = androidx.compose.foundation.a.d(mVar2, false, null, (InterfaceC2015a) M5, 7);
                    C2686J a7 = AbstractC2685I.a(c2703e, gVar, c0315s2, 54);
                    int p7 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l7 = c0315s2.l();
                    b0.p c7 = b0.a.c(c0315s2, d5);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z3);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h4, a7);
                    AbstractC0329z.y(c0315s2, c2751h5, l7);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s2, p7, c2751h6);
                    }
                    AbstractC0329z.y(c0315s2, c2751h7, c7);
                    float f8 = 4;
                    D.d a8 = D.e.a(f8);
                    long j5 = V3.a.f;
                    b0.p f9 = androidx.compose.foundation.layout.c.f(mVar2, 28);
                    float f10 = 1;
                    p0.a(f9, a8, j5, 0.0f, 0.0f, AbstractC2527w.a(f10, i0.p.b(0.4f, V3.a.f5995z)), X.e.d(23773205, new P.r(2, aquaCompetitionPocket), c0315s2), c0315s2, 14156166, 56);
                    String ti_par_tle = aquaCompetitionPocket != null ? aquaCompetitionPocket.getTi_par_tle() : null;
                    if (ti_par_tle == null) {
                        ti_par_tle = "";
                    }
                    String ph_par_ase = aquaCompetitionPocket != null ? aquaCompetitionPocket.getPh_par_ase() : null;
                    u0.b(AbstractC0467k.v(ti_par_tle, " • ", ph_par_ase != null ? ph_par_ase : ""), null, ((C0249u) c0315s2.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((v0) c0315s2.j(w0.f3580a)).f3574l, c0315s2, 0, 3120, 55290);
                    c0315s2.q(true);
                    float f11 = 12;
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar2, f11));
                    float f12 = 6;
                    C2703e c2703e2 = new C2703e(f12);
                    b0.g gVar2 = b0.c.f7146t;
                    C2686J a9 = AbstractC2685I.a(c2703e2, gVar2, c0315s2, 6);
                    int p8 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l8 = c0315s2.l();
                    b0.p c8 = b0.a.c(c0315s2, mVar2);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c2768z = c2768z3;
                        c0315s2.k(c2768z);
                    } else {
                        c2768z = c2768z3;
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h4, a9);
                    AbstractC0329z.y(c0315s2, c2751h5, l8);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p8))) {
                        c2751h = c2751h6;
                        AbstractC2107A.y(p8, c0315s2, p8, c2751h);
                    } else {
                        c2751h = c2751h6;
                    }
                    AbstractC0329z.y(c0315s2, c2751h7, c8);
                    if (aquaCompetitionPocket != null && (str = aquaCompetitionPocket.getTerrit_par_oryName()) != null) {
                        if (AbstractC2227e.H0(str)) {
                            str = null;
                            break;
                        }
                    }
                    str = "Global";
                    C2201e B5 = G4.l.B();
                    C2768z c2768z4 = c2768z;
                    long j6 = V3.a.f5975d;
                    C2751h c2751h8 = c2751h;
                    R3.j.g(str, null, j5, j6, B5, c0315s2, 3456, 2);
                    AquaMatchCard aquaMatchCard = (AquaMatchCard) this.f5516o;
                    if (aquaMatchCard == null || (pu_par_lse2 = aquaMatchCard.getPu_par_lse()) == null || (str2 = pu_par_lse2.getDet_par_ail()) == null) {
                        str2 = "Status";
                    }
                    R3.j.g(str2, null, j5, j6, AbstractC2346c.u(), c0315s2, 3456, 2);
                    R3.j.c("LIVE", null, j6, 0L, c0315s2, 390, 10);
                    c0315s2.q(true);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar2, 16));
                    R3.j.f(androidx.compose.foundation.layout.b.h(mVar2, 20, 0.0f, 2), c0315s2, 6, 0);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar2, 14));
                    b0.p b3 = androidx.compose.foundation.layout.c.b(mVar2, 1.0f);
                    C2686J a10 = AbstractC2685I.a(AbstractC2706h.f21537d, gVar, c0315s2, 54);
                    int p9 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l9 = c0315s2.l();
                    b0.p c9 = b0.a.c(c0315s2, b3);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z4);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h4, a10);
                    AbstractC0329z.y(c0315s2, c2751h5, l9);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p9))) {
                        c2751h2 = c2751h8;
                        AbstractC2107A.y(p9, c0315s2, p9, c2751h2);
                    } else {
                        c2751h2 = c2751h8;
                    }
                    AbstractC0329z.y(c0315s2, c2751h7, c9);
                    b0.p C5 = AbstractC2107A.C(mVar2, 1.0f);
                    AquaClubBadge aquaClubBadge = (AquaClubBadge) this.f5517p;
                    i4.c cVar = this.f5514m;
                    AbstractC0412o.f(aquaClubBadge, cVar, C5, c0315s2, 0);
                    C2717s a11 = AbstractC2716r.a(c2700b, fVar, c0315s2, 48);
                    int p10 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l10 = c0315s2.l();
                    b0.p c10 = b0.a.c(c0315s2, mVar2);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z4);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h4, a11);
                    AbstractC0329z.y(c0315s2, c2751h5, l10);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p10))) {
                        AbstractC2107A.y(p10, c0315s2, p10, c2751h2);
                    }
                    AbstractC0329z.y(c0315s2, c2751h7, c10);
                    C2751h c2751h9 = c2751h2;
                    p0.a(null, D.e.a(f8), V3.a.f5962A, 0.0f, 0.0f, AbstractC2527w.a(f10, i0.p.b(0.6f, j6)), X.e.d(-1993758041, new P.r(3, (AquaMatchTicket) this.f5519r), c0315s2), c0315s2, 14156160, 57);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar2, f12));
                    C2686J a12 = AbstractC2685I.a(new C2703e(f8), gVar2, c0315s2, 6);
                    int p11 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l11 = c0315s2.l();
                    b0.p c11 = b0.a.c(c0315s2, mVar2);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z4);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h4, a12);
                    AbstractC0329z.y(c0315s2, c2751h5, l11);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p11))) {
                        AbstractC2107A.y(p11, c0315s2, p11, c2751h9);
                    }
                    AbstractC0329z.y(c0315s2, c2751h7, c11);
                    if (aquaMatchCard == null || (pu_par_lse = aquaMatchCard.getPu_par_lse()) == null || (str3 = pu_par_lse.getCode_arg()) == null) {
                        str3 = "--";
                    }
                    R3.j.c(str3, null, j6, 0L, c0315s2, 384, 10);
                    R3.j.b(AbstractC2036a.y(), null, j6, 10, c0315s2, 3456);
                    c0315s2.q(true);
                    c0315s2.q(true);
                    AbstractC0412o.f((AquaClubBadge) this.f5518q, cVar, AbstractC2107A.C(mVar2, 1.0f), c0315s2, 0);
                    c0315s2.q(true);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar2, f11));
                    R3.j.g(AquaDisplayFormattersKt.renderKicmeanskoffStamp(aquaMatchCard != null ? aquaMatchCard.getKick_par_offAt() : null), null, j5, j6, AbstractC0444a.N(), c0315s2, 3456, 2);
                    c0315s2.q(true);
                }
                break;
        }
        return W3.o.f6046a;
    }

    public C0409l(InterfaceC2015a interfaceC2015a, Object obj, InterfaceC2015a interfaceC2015a2, InterfaceC2015a interfaceC2015a3, i4.c cVar, i4.e eVar, InterfaceC0289e0 interfaceC0289e0) {
        this.f5515n = interfaceC2015a;
        this.f5518q = obj;
        this.f5516o = interfaceC2015a2;
        this.f5517p = interfaceC2015a3;
        this.f5514m = cVar;
        this.f5513l = eVar;
        this.f5519r = interfaceC0289e0;
    }
}
