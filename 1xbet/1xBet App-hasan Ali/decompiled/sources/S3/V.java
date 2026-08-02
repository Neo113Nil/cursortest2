package S3;

import A0.C0058t;
import E.q0;
import M.AbstractC0232c;
import M.AbstractC0251w;
import M.C0231b;
import M.C0249u;
import P.AbstractC0329z;
import P.C0302l;
import P.C0304m;
import P.C0315s;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import androidx.compose.foundation.layout.FillElement;
import game.betting133.sports1xbet.aqua_network.AquaRosterDigest;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSpotlightLeagueUiState;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSquadRosterUiState;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogUiState;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import m4.InterfaceC2102e;
import n.AbstractC2107A;
import r0.AbstractC2346c;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2681E;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class V implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5415k = 2;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.e f5417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f5418n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5419o;

    public V(AquaTournamentCatalogViewModel aquaTournamentCatalogViewModel, Object obj, InterfaceC0289e0 interfaceC0289e0, i4.e eVar) {
        this.f5416l = aquaTournamentCatalogViewModel;
        this.f5419o = obj;
        this.f5418n = interfaceC0289e0;
        this.f5417m = eVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        long j5;
        long j6;
        Object obj3;
        boolean z3;
        b0.m mVar = b0.m.f7161k;
        W3.o oVar = W3.o.f6046a;
        Object obj4 = this.f5417m;
        Object obj5 = this.f5419o;
        Object obj6 = C0302l.f4480a;
        Object obj7 = this.f5416l;
        InterfaceC0289e0 interfaceC0289e0 = this.f5418n;
        int i = 3;
        switch (this.f5415k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s.B()) {
                    float f = 12;
                    b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f6868c, 0.0f, f, 0.0f, 13), 14, 0.0f, 2);
                    C2717s a5 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s, 0);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    b0.p c5 = b0.a.c(c0315s, h3);
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
                    R3.j.e("Featured Leagues", null, "Tap to select a competition", ((AquaSpotlightLeagueUiState) interfaceC0289e0.getValue()).getLeagu_par_eRows().size() + " leagues", AbstractC0444a.M(), 1, c0315s, 196998, 2);
                    AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f));
                    b0.p b3 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                    D.d dVar = R3.j.f5219b;
                    C2681E c2681e = AbstractC0232c.f3301a;
                    long j7 = V3.a.f;
                    long j8 = V3.a.f5975d;
                    long j9 = i0.p.f17293g;
                    C0249u c0249u = (C0249u) c0315s.j(AbstractC0251w.f3578a);
                    C0231b c0231b = c0249u.f3523L;
                    if (c0231b == null) {
                        float f5 = O.f.f3865a;
                        c0231b = new C0231b(AbstractC0251w.c(c0249u, 32), AbstractC0251w.c(c0249u, O.f.f), i0.p.b(0.12f, AbstractC0251w.c(c0249u, O.f.f3866b)), i0.p.b(0.38f, AbstractC0251w.c(c0249u, O.f.f3867c)));
                        c0249u.f3523L = c0231b;
                    }
                    C0231b a6 = c0231b.a(j7, j8, j9, j9);
                    X.d dVar2 = f0.f5485a;
                    M.g0.b((InterfaceC2015a) obj7, b3, false, dVar, a6, null, null, c0315s, 805309488);
                    AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f));
                    AbstractC2036a.N(0, c0315s);
                    float f6 = 8;
                    AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f6));
                    if (((AquaSpotlightLeagueUiState) interfaceC0289e0.getValue()).getBusy_arg()) {
                        c0315s.X(-1411526148);
                        G4.l.n(AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    } else if (((AquaSpotlightLeagueUiState) interfaceC0289e0.getValue()).getFaul_par_tText() != null) {
                        c0315s.X(-1411523110);
                        String faul_par_tText = ((AquaSpotlightLeagueUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                        kotlin.jvm.internal.l.c(faul_par_tText);
                        G4.l.w(faul_par_tText, AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    } else if (((AquaSpotlightLeagueUiState) interfaceC0289e0.getValue()).getLeagu_par_eRows().isEmpty()) {
                        c0315s.X(-1411519050);
                        G4.l.k("No leagues available.", AbstractC2107A.B(), c0315s, 6);
                        c0315s.q(false);
                    } else {
                        c0315s.X(-807246313);
                        C2681E a7 = androidx.compose.foundation.layout.b.a(0.0f, f6, 1);
                        C2703e c2703e = new C2703e(f6);
                        b0.p B5 = AbstractC2107A.B();
                        c0315s.X(-1411506754);
                        boolean f7 = c0315s.f(interfaceC0289e0) | c0315s.f(obj4);
                        Object M5 = c0315s.M();
                        InterfaceC0289e0 interfaceC0289e02 = (InterfaceC0289e0) obj5;
                        if (f7 || M5 == obj6) {
                            M5 = new B1.b(interfaceC0289e0, obj4, interfaceC0289e02, 3);
                            c0315s.i0(M5);
                        }
                        c0315s.q(false);
                        G4.d.c(B5, null, a7, c2703e, null, null, false, (i4.c) M5, c0315s, 24960);
                        Integer num = (Integer) interfaceC0289e02.getValue();
                        if (num != null) {
                            c0315s.X(-1411464546);
                            boolean f8 = c0315s.f(interfaceC0289e0) | c0315s.f(num) | c0315s.f(obj4);
                            Object M6 = c0315s.M();
                            if (f8 || M6 == obj6) {
                                M6 = new C0304m(obj4, num, interfaceC0289e0, 2);
                                c0315s.i0(M6);
                            }
                            c0315s.q(false);
                            M.g0.a((InterfaceC2015a) M6, androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 0.0f, f6, 1), false, dVar, AbstractC0232c.a(j8, V3.a.f5981l, c0315s), null, null, f0.f5486b, c0315s, 805309488, 484);
                        }
                        c0315s.q(false);
                    }
                    c0315s.q(true);
                    break;
                } else {
                    c0315s.S();
                    break;
                }
            case 1:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s2.B()) {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6868c;
                    float f9 = 8;
                    b0.p h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(fillElement, 0.0f, f9, 0.0f, 13), 12, 0.0f, 2);
                    C2717s a8 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
                    int p6 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l6 = c0315s2.l();
                    b0.p c6 = b0.a.c(c0315s2, h4);
                    InterfaceC2753j.f21834j.getClass();
                    InterfaceC2015a interfaceC2015a = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(interfaceC2015a);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21833e, a8);
                    AbstractC0329z.y(c0315s2, C2752i.f21832d, l6);
                    C2751h c2751h2 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s2, p6, c2751h2);
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21831c, c6);
                    G4.l.L("Team Squad", (InterfaceC2015a) obj7, null, 6, c0315s2, 3078, 4);
                    Z.c(obj5, c0315s2, 0);
                    if (((AquaSquadRosterUiState) interfaceC0289e0.getValue()).getBusy_arg()) {
                        c0315s2.X(-512369635);
                        G4.l.n(AbstractC2107A.B(), c0315s2, 0);
                        c0315s2.q(false);
                    } else if (((AquaSquadRosterUiState) interfaceC0289e0.getValue()).getFaul_par_tText() != null) {
                        c0315s2.X(-512366597);
                        String faul_par_tText2 = ((AquaSquadRosterUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                        kotlin.jvm.internal.l.c(faul_par_tText2);
                        G4.l.w(faul_par_tText2, AbstractC2107A.B(), c0315s2, 0);
                        c0315s2.q(false);
                    } else if (((AquaSquadRosterUiState) interfaceC0289e0.getValue()).getRoster_par_Bundle() != null) {
                        c0315s2.X(1296833775);
                        AquaRosterDigest roster_par_Bundle = ((AquaSquadRosterUiState) interfaceC0289e0.getValue()).getRoster_par_Bundle();
                        kotlin.jvm.internal.l.c(roster_par_Bundle);
                        Object featur_par_edClub = roster_par_Bundle.getFeatur_par_edClub();
                        C2681E a9 = androidx.compose.foundation.layout.b.a(0.0f, f9, 1);
                        C2703e c2703e2 = new C2703e(f9);
                        c0315s2.X(-512343444);
                        boolean f10 = c0315s2.f(featur_par_edClub) | c0315s2.h(roster_par_Bundle) | c0315s2.f(obj4);
                        Object M7 = c0315s2.M();
                        if (f10 || M7 == obj6) {
                            M7 = new B1.b(roster_par_Bundle, featur_par_edClub, obj4, 4);
                            c0315s2.i0(M7);
                        }
                        c0315s2.q(false);
                        G4.d.c(fillElement, null, a9, c2703e2, null, null, false, (i4.c) M7, c0315s2, 24966);
                        c0315s2.q(false);
                    } else {
                        c0315s2.X(1303211405);
                        c0315s2.q(false);
                    }
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
                    float f11 = 12;
                    b0.p h5 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f6868c, 0.0f, f11, 0.0f, 13), 14, 0.0f, 2);
                    C2717s a10 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s3, 0);
                    int p7 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l7 = c0315s3.l();
                    b0.p c7 = b0.a.c(c0315s3, h5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z2);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21833e, a10);
                    AbstractC0329z.y(c0315s3, C2752i.f21832d, l7);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s3, p7, c2751h3);
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21831c, c7);
                    R3.j.e("Competition Catalog", null, "Search & explore global leagues", ((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getFilter_par_edRows().size() + " found", G4.d.x(), 2, c0315s3, 196998, 2);
                    AbstractC2701c.b(c0315s3, androidx.compose.foundation.layout.c.c(mVar, f11));
                    String searc_par_hText = ((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getSearc_par_hText();
                    c0315s3.X(-1992005584);
                    AquaTournamentCatalogViewModel aquaTournamentCatalogViewModel = (AquaTournamentCatalogViewModel) obj7;
                    boolean h6 = c0315s3.h(aquaTournamentCatalogViewModel);
                    Object M8 = c0315s3.M();
                    if (h6 || M8 == obj6) {
                        M8 = new q0(1, aquaTournamentCatalogViewModel, AquaTournamentCatalogViewModel.class, "reviseSemeansarchDraft", "reviseSemeansarchDraft(Ljava/lang/String;)V", 0, 1);
                        c0315s3.i0(M8);
                    }
                    c0315s3.q(false);
                    i4.c cVar = (i4.c) ((InterfaceC2102e) M8);
                    b0.p b5 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                    X.d dVar3 = h0.f5496a;
                    X.d dVar4 = h0.f5497b;
                    X.d d5 = X.e.d(-135756844, new C0419w(i, aquaTournamentCatalogViewModel, interfaceC0289e0), c0315s3);
                    D.d a11 = D.e.a(4);
                    M.N n5 = M.N.f3188a;
                    long j10 = V3.a.f5962A;
                    long j11 = V3.a.f5975d;
                    long b6 = i0.p.b(0.5f, V3.a.f5995z);
                    long j12 = V3.a.f5977g;
                    long j13 = i0.p.f17293g;
                    C0249u c0249u2 = (C0249u) c0315s3.j(AbstractC0251w.f3578a);
                    M.q0 q0Var = c0249u2.f3526O;
                    c0315s3.X(1540400102);
                    if (q0Var == null) {
                        long c8 = AbstractC0251w.c(c0249u2, 18);
                        long c9 = AbstractC0251w.c(c0249u2, 18);
                        j5 = b6;
                        long b7 = i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 18));
                        long c10 = AbstractC0251w.c(c0249u2, 18);
                        long j14 = i0.p.f;
                        j6 = j11;
                        obj3 = obj6;
                        q0Var = new M.q0(c8, c9, b7, c10, j14, j14, j14, j14, AbstractC0251w.c(c0249u2, 26), AbstractC0251w.c(c0249u2, 2), (I.W) c0315s3.j(I.X.f2457a), AbstractC0251w.c(c0249u2, 26), AbstractC0251w.c(c0249u2, 24), i0.p.b(0.12f, AbstractC0251w.c(c0249u2, 18)), AbstractC0251w.c(c0249u2, 2), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 18)), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 18)), AbstractC0251w.c(c0249u2, 2), AbstractC0251w.c(c0249u2, 26), AbstractC0251w.c(c0249u2, 19), i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 18)), AbstractC0251w.c(c0249u2, 2), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 18)), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 18)), AbstractC0251w.c(c0249u2, 2), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 19)), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), AbstractC0251w.c(c0249u2, 19), i0.p.b(0.38f, AbstractC0251w.c(c0249u2, 19)), AbstractC0251w.c(c0249u2, 19));
                        c0249u2.f3526O = q0Var;
                    } else {
                        j5 = b6;
                        j6 = j11;
                        obj3 = obj6;
                    }
                    c0315s3.q(false);
                    M.V.a(searc_par_hText, cVar, b5, false, null, dVar3, dVar4, d5, null, null, null, true, 0, 0, a11, new M.q0(j12 != 16 ? j12 : q0Var.f3457a, j12 != 16 ? j12 : q0Var.f3458b, j13 != 16 ? j13 : q0Var.f3459c, j13 != 16 ? j13 : q0Var.f3460d, j10 != 16 ? j10 : q0Var.f3461e, j10 != 16 ? j10 : q0Var.f, j13 != 16 ? j13 : q0Var.f3462g, j13 != 16 ? j13 : q0Var.f3463h, j6 != 16 ? j6 : q0Var.i, j13 != 16 ? j13 : q0Var.f3464j, q0Var.f3465k, j6 != 16 ? j6 : q0Var.f3466l, j5 != 16 ? j5 : q0Var.f3467m, j13 != 16 ? j13 : q0Var.f3468n, j13 != 16 ? j13 : q0Var.f3469o, j13 != 16 ? j13 : q0Var.f3470p, j13 != 16 ? j13 : q0Var.f3471q, j13 != 16 ? j13 : q0Var.f3472r, j13 != 16 ? j13 : q0Var.f3473s, j13 != 16 ? j13 : q0Var.f3474t, j13 != 16 ? j13 : q0Var.f3475u, j13 != 16 ? j13 : q0Var.f3476v, j13 != 16 ? j13 : q0Var.f3477w, j13 != 16 ? j13 : q0Var.f3478x, j13 != 16 ? j13 : q0Var.f3479y, j13 != 16 ? j13 : q0Var.f3480z, j13 != 16 ? j13 : q0Var.f3442A, j13 != 16 ? j13 : q0Var.f3443B, j13 != 16 ? j13 : q0Var.f3444C, j13 != 16 ? j13 : q0Var.f3445D, j13 != 16 ? j13 : q0Var.f3446E, j13 != 16 ? j13 : q0Var.f3447F, j13 != 16 ? j13 : q0Var.f3448G, j13 != 16 ? j13 : q0Var.f3449H, j13 != 16 ? j13 : q0Var.f3450I, j13 != 16 ? j13 : q0Var.J, j13 != 16 ? j13 : q0Var.K, j13 != 16 ? j13 : q0Var.f3451L, j13 != 16 ? j13 : q0Var.f3452M, j13 != 16 ? j13 : q0Var.f3453N, j13 != 16 ? j13 : q0Var.f3454O, j13 != 16 ? j13 : q0Var.f3455P, j13 != 16 ? j13 : q0Var.f3456Q), c0315s3, 918552960);
                    float f12 = 8;
                    AbstractC2701c.b(c0315s3, androidx.compose.foundation.layout.c.c(mVar, f12));
                    AbstractC2346c.f(obj5, c0315s3, 0);
                    if (((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getBusy_arg() && ((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getAll_par_Rows().isEmpty()) {
                        c0315s3.X(-1991958185);
                        G4.l.n(AbstractC2107A.B(), c0315s3, 0);
                        c0315s3.q(false);
                    } else if (((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getFaul_par_tText() != null) {
                        c0315s3.X(-1991955147);
                        String faul_par_tText3 = ((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                        kotlin.jvm.internal.l.c(faul_par_tText3);
                        G4.l.w(faul_par_tText3, AbstractC2107A.B(), c0315s3, 0);
                        c0315s3.q(false);
                    } else if (((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getVisib_par_leRows().isEmpty()) {
                        c0315s3.X(-1991951042);
                        G4.l.k("No competitions match your filter.", AbstractC2107A.B(), c0315s3, 6);
                        c0315s3.q(false);
                    } else {
                        c0315s3.X(-1620799540);
                        C2681E a12 = androidx.compose.foundation.layout.b.a(0.0f, f12, 1);
                        C2703e c2703e3 = new C2703e(f12);
                        b0.p B6 = AbstractC2107A.B();
                        c0315s3.X(-1991939003);
                        boolean f13 = c0315s3.f(interfaceC0289e0) | c0315s3.f(obj4);
                        Object M9 = c0315s3.M();
                        if (f13 || M9 == obj3) {
                            M9 = new O3.f(7, interfaceC0289e0, obj4);
                            c0315s3.i0(M9);
                        }
                        c0315s3.q(false);
                        G4.d.c(B6, null, a12, c2703e3, null, null, false, (i4.c) M9, c0315s3, 24960);
                        if (((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getPage_par_Count() > 1) {
                            int pageN_par_umber = ((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getPageN_par_umber();
                            int page_par_Count = ((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getPage_par_Count();
                            int size = ((AquaTournamentCatalogUiState) interfaceC0289e0.getValue()).getFilter_par_edRows().size();
                            c0315s3.X(-1991911957);
                            boolean h7 = c0315s3.h(aquaTournamentCatalogViewModel);
                            Object M10 = c0315s3.M();
                            if (h7 || M10 == obj3) {
                                M10 = new C0058t(0, aquaTournamentCatalogViewModel, AquaTournamentCatalogViewModel.class, "stepBameansckPage", "stepBameansckPage()V", 0, 7);
                                c0315s3.i0(M10);
                            }
                            c0315s3.q(false);
                            InterfaceC2015a interfaceC2015a2 = (InterfaceC2015a) ((InterfaceC2102e) M10);
                            c0315s3.X(-1991909714);
                            boolean h8 = c0315s3.h(aquaTournamentCatalogViewModel);
                            Object M11 = c0315s3.M();
                            if (h8 || M11 == obj3) {
                                M11 = new C0058t(0, aquaTournamentCatalogViewModel, AquaTournamentCatalogViewModel.class, "stepFormeanswardPage", "stepFormeanswardPage()V", 0, 8);
                                c0315s3.i0(M11);
                            }
                            z3 = false;
                            c0315s3.q(false);
                            AbstractC2346c.g(pageN_par_umber, page_par_Count, size, interfaceC2015a2, (InterfaceC2015a) ((InterfaceC2102e) M11), c0315s3, 0);
                        } else {
                            z3 = false;
                        }
                        c0315s3.q(z3);
                    }
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

    public V(InterfaceC2015a interfaceC2015a, InterfaceC0289e0 interfaceC0289e0, i4.e eVar, InterfaceC0289e0 interfaceC0289e02) {
        this.f5416l = interfaceC2015a;
        this.f5418n = interfaceC0289e0;
        this.f5417m = eVar;
        this.f5419o = interfaceC0289e02;
    }

    public V(InterfaceC2015a interfaceC2015a, Object obj, i4.e eVar, InterfaceC0289e0 interfaceC0289e0) {
        this.f5416l = interfaceC2015a;
        this.f5419o = obj;
        this.f5417m = eVar;
        this.f5418n = interfaceC0289e0;
    }
}
