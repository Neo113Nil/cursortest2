package S3;

import M.AbstractC0232c;
import M.p0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import androidx.compose.foundation.layout.FillElement;
import game.betting133.sports1xbet.aqua_network.AquaFinishingCard;
import game.betting133.sports1xbet.aqua_network.AquaPlayerCard;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import game.betting133.sports1xbet.aqua_network.AquaSeasonLedger;
import game.betting133.sports1xbet.aqua_network.AquaUsageCard;
import game.betting133.sports1xbet.aqua_viewmodels.AquaAthleteProfileUiState;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSeasonChoiceUiState;
import i4.InterfaceC2015a;
import java.util.List;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o4.AbstractC2227e;
import r0.AbstractC2346c;
import t3.AbstractC2425d;
import v.AbstractC2527w;
import v.q0;
import z.AbstractC2685I;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2681E;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: S3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403f implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5480k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f5481l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5482m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5483n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5484o;

    public C0403f(InterfaceC0289e0 interfaceC0289e0, InterfaceC0289e0 interfaceC0289e02, i4.e eVar, int i) {
        this.f5481l = interfaceC0289e0;
        this.f5483n = interfaceC0289e02;
        this.f5484o = eVar;
        this.f5482m = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x03a6, code lost:
    
        if (kotlin.jvm.internal.l.a(r2.M(), java.lang.Integer.valueOf(r12)) == false) goto L67;
     */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        boolean z3;
        AquaFinishingCard fini_par_shing;
        Integer fe_par_eds;
        String num;
        AquaUsageCard us_par_age;
        Integer sh_par_ows;
        String num2;
        AquaFinishingCard fini_par_shing2;
        Integer to_par_tal;
        String num3;
        Integer ye_par_ars;
        String num4;
        W3.o oVar = W3.o.f6046a;
        int i = this.f5482m;
        Object obj4 = this.f5484o;
        Object obj5 = this.f5483n;
        InterfaceC0289e0 interfaceC0289e0 = this.f5481l;
        b0.m mVar = b0.m.f7161k;
        switch (this.f5480k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                    break;
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6868c;
                    float f = 8;
                    b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(fillElement, 0.0f, f, 0.0f, 13), 14, 0.0f, 2);
                    C2700b c2700b = AbstractC2706h.f21535b;
                    b0.f fVar = b0.c.f7148v;
                    C2717s a5 = AbstractC2716r.a(c2700b, fVar, c0315s, 0);
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
                    C2751h c2751h = C2752i.f21833e;
                    AbstractC0329z.y(c0315s, c2751h, a5);
                    C2751h c2751h2 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s, c2751h2, l5);
                    C2751h c2751h3 = C2752i.f;
                    if (!c0315s.f4530S) {
                        obj3 = obj5;
                        break;
                    } else {
                        obj3 = obj5;
                    }
                    AbstractC2107A.y(p5, c0315s, p5, c2751h3);
                    C2751h c2751h4 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s, c2751h4, c5);
                    G4.l.L("Player Profile", (InterfaceC2015a) obj3, null, 7, c0315s, 3078, 4);
                    AbstractC0406i.b(obj4, c0315s, 0);
                    if (!((AquaAthleteProfileUiState) interfaceC0289e0.getValue()).getBusy_arg()) {
                        if (((AquaAthleteProfileUiState) interfaceC0289e0.getValue()).getFaul_par_tText() == null) {
                            if (((AquaAthleteProfileUiState) interfaceC0289e0.getValue()).getAthlet_par_ePacket() != null) {
                                c0315s.X(1327544155);
                                AquaPlayerSheet athlet_par_ePacket = ((AquaAthleteProfileUiState) interfaceC0289e0.getValue()).getAthlet_par_ePacket();
                                kotlin.jvm.internal.l.c(athlet_par_ePacket);
                                AquaPlayerCard ath_par_lete = athlet_par_ePacket.getAth_par_lete();
                                List<AquaSeasonLedger> led_par_gers = athlet_par_ePacket.getLed_par_gers();
                                AquaSeasonLedger aquaSeasonLedger = led_par_gers != null ? (AquaSeasonLedger) X3.m.Z(led_par_gers) : null;
                                b0.p h4 = androidx.compose.foundation.layout.b.h(q0.e(fillElement, q0.c(c0315s)), 0.0f, f, 1);
                                C2717s a6 = AbstractC2716r.a(new C2703e(12), fVar, c0315s, 6);
                                int p6 = AbstractC0329z.p(c0315s);
                                InterfaceC0314r0 l6 = c0315s.l();
                                b0.p c6 = b0.a.c(c0315s, h4);
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
                                b0.p b3 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                                D.d dVar = R3.j.f5218a;
                                float f5 = 10;
                                long j5 = V3.a.f5962A;
                                float f6 = 1;
                                long j6 = V3.a.f5995z;
                                p0.a(b3, dVar, j5, 4, f5, AbstractC2527w.a(f6, i0.p.b(0.45f, j6)), X.e.d(253955560, new C0402e(i, 0, ath_par_lete, aquaSeasonLedger), c0315s), c0315s, 14377398, 8);
                                b0.p b5 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                                C2703e c2703e = new C2703e(6);
                                b0.g gVar = b0.c.f7146t;
                                C2686J a7 = AbstractC2685I.a(c2703e, gVar, c0315s, 6);
                                int p7 = AbstractC0329z.p(c0315s);
                                InterfaceC0314r0 l7 = c0315s.l();
                                b0.p c7 = b0.a.c(c0315s, b5);
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
                                String str = (ath_par_lete == null || (ye_par_ars = ath_par_lete.getYe_par_ars()) == null || (num4 = ye_par_ars.toString()) == null) ? "--" : num4;
                                C2201e w5 = AbstractC2425d.w();
                                long j7 = V3.a.f5975d;
                                AbstractC0406i.c(3078, j7, c0315s, AbstractC2107A.C(mVar, 1.0f), "Age", str, w5);
                                AbstractC0406i.c(3078, j7, c0315s, AbstractC2107A.C(mVar, 1.0f), "Goals", (aquaSeasonLedger == null || (fini_par_shing2 = aquaSeasonLedger.getFini_par_shing()) == null || (to_par_tal = fini_par_shing2.getTo_par_tal()) == null || (num3 = to_par_tal.toString()) == null) ? "--" : num3, AbstractC2346c.u());
                                AbstractC0406i.c(3078, V3.a.f5978h, c0315s, AbstractC2107A.C(mVar, 1.0f), "Apps", (aquaSeasonLedger == null || (us_par_age = aquaSeasonLedger.getUs_par_age()) == null || (sh_par_ows = us_par_age.getSh_par_ows()) == null || (num2 = sh_par_ows.toString()) == null) ? "--" : num2, AbstractC0444a.M());
                                AbstractC0406i.c(3078, j7, c0315s, AbstractC2107A.C(mVar, 1.0f), "Assists", (aquaSeasonLedger == null || (fini_par_shing = aquaSeasonLedger.getFini_par_shing()) == null || (fe_par_eds = fini_par_shing.getFe_par_eds()) == null || (num = fe_par_eds.toString()) == null) ? "--" : num, N4.b.y());
                                c0315s = c0315s;
                                c0315s.q(true);
                                p0.a(androidx.compose.foundation.layout.c.b(mVar, 1.0f), dVar, j5, 2, f5, AbstractC2527w.a(f6, i0.p.b(0.3f, j6)), X.e.d(1565170847, new C0402e(ath_par_lete, aquaSeasonLedger, i), c0315s), c0315s, 14377398, 8);
                                b0.p b6 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                                C2686J a8 = AbstractC2685I.a(AbstractC2706h.f21536c, gVar, c0315s, 6);
                                int p8 = AbstractC0329z.p(c0315s);
                                InterfaceC0314r0 l8 = c0315s.l();
                                b0.p c8 = b0.a.c(c0315s, b6);
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
                                R3.j.g(i + " Season", null, V3.a.f, j7, AbstractC2346c.n(), c0315s, 3456, 2);
                                z3 = true;
                                c0315s.q(true);
                                c0315s.q(true);
                                c0315s.q(false);
                            } else {
                                z3 = true;
                                c0315s.X(1335932197);
                                c0315s.q(false);
                            }
                            c0315s.q(z3);
                            break;
                        } else {
                            c0315s.X(-2035398717);
                            String faul_par_tText = ((AquaAthleteProfileUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                            kotlin.jvm.internal.l.c(faul_par_tText);
                            G4.l.w(faul_par_tText, AbstractC2107A.B(), c0315s, 0);
                            c0315s.q(false);
                        }
                    } else {
                        c0315s.X(-2035401755);
                        G4.l.n(AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    }
                    z3 = true;
                    c0315s.q(z3);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s2.B()) {
                    float f7 = 12;
                    b0.p h5 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f6868c, 0.0f, f7, 0.0f, 13), 14, 0.0f, 2);
                    C2717s a9 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
                    int p9 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l9 = c0315s2.l();
                    b0.p c9 = b0.a.c(c0315s2, h5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21833e, a9);
                    AbstractC0329z.y(c0315s2, C2752i.f21832d, l9);
                    C2751h c2751h5 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p9))) {
                        AbstractC2107A.y(p9, c0315s2, p9, c2751h5);
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21831c, c9);
                    String leagu_par_eTitle = ((AquaSeasonChoiceUiState) interfaceC0289e0.getValue()).getLeagu_par_eTitle();
                    if (AbstractC2227e.H0(leagu_par_eTitle)) {
                        leagu_par_eTitle = "Choose season year";
                    }
                    String str2 = leagu_par_eTitle;
                    C2201e c2201e = N4.b.f3794b;
                    if (c2201e == null) {
                        C2200d c2200d = new C2200d("Filled.DateRange", false);
                        int i5 = o0.z.f18603a;
                        i0.M m5 = new i0.M(i0.p.f17289b);
                        C2202f c2202f = new C2202f(0);
                        c2202f.m(9.0f, 11.0f);
                        c2202f.k(7.0f, 11.0f);
                        c2202f.r(2.0f);
                        c2202f.j(2.0f);
                        c2202f.r(-2.0f);
                        c2202f.e();
                        c2202f.m(13.0f, 11.0f);
                        c2202f.j(-2.0f);
                        c2202f.r(2.0f);
                        c2202f.j(2.0f);
                        c2202f.r(-2.0f);
                        c2202f.e();
                        c2202f.m(17.0f, 11.0f);
                        c2202f.j(-2.0f);
                        c2202f.r(2.0f);
                        c2202f.j(2.0f);
                        c2202f.r(-2.0f);
                        c2202f.e();
                        c2202f.m(19.0f, 4.0f);
                        c2202f.j(-1.0f);
                        c2202f.k(18.0f, 2.0f);
                        c2202f.j(-2.0f);
                        c2202f.r(2.0f);
                        c2202f.k(8.0f, 4.0f);
                        c2202f.k(8.0f, 2.0f);
                        c2202f.k(6.0f, 2.0f);
                        c2202f.r(2.0f);
                        c2202f.k(5.0f, 4.0f);
                        c2202f.g(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        c2202f.k(3.0f, 20.0f);
                        c2202f.g(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        c2202f.j(14.0f);
                        c2202f.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c2202f.k(21.0f, 6.0f);
                        c2202f.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        c2202f.e();
                        c2202f.m(19.0f, 20.0f);
                        c2202f.k(5.0f, 20.0f);
                        c2202f.k(5.0f, 9.0f);
                        c2202f.j(14.0f);
                        c2202f.r(11.0f);
                        c2202f.e();
                        C2200d.a(c2200d, c2202f.f18548a, m5);
                        c2201e = c2200d.b();
                        N4.b.f3794b = c2201e;
                    }
                    C2201e c2201e2 = c2201e;
                    R3.j.e("Pick a Season", null, str2, ((AquaSeasonChoiceUiState) interfaceC0289e0.getValue()).getSeason_par_Choices().size() + " seasons", c2201e2, 2, c0315s2, 196614, 2);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f7));
                    Q.c(0, c0315s2);
                    float f8 = (float) 8;
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f8));
                    if (((AquaSeasonChoiceUiState) interfaceC0289e0.getValue()).getBusy_arg()) {
                        c0315s2.X(1990036124);
                        G4.l.n(AbstractC2107A.B(), c0315s2, 0);
                        c0315s2.q(false);
                    } else if (((AquaSeasonChoiceUiState) interfaceC0289e0.getValue()).getFaul_par_tText() != null) {
                        c0315s2.X(1990039162);
                        String faul_par_tText2 = ((AquaSeasonChoiceUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                        kotlin.jvm.internal.l.c(faul_par_tText2);
                        G4.l.w(faul_par_tText2, AbstractC2107A.B(), c0315s2, 0);
                        c0315s2.q(false);
                    } else if (((AquaSeasonChoiceUiState) interfaceC0289e0.getValue()).getSeason_par_Choices().isEmpty()) {
                        c0315s2.X(1990043318);
                        G4.l.k("No seasons available.", AbstractC2107A.B(), c0315s2, 6);
                        c0315s2.q(false);
                    } else {
                        c0315s2.X(1561936341);
                        C2681E a10 = androidx.compose.foundation.layout.b.a(0.0f, f8, 1);
                        C2703e c2703e2 = new C2703e(f8);
                        b0.p B5 = AbstractC2107A.B();
                        c0315s2.X(1990054851);
                        boolean f9 = c0315s2.f(interfaceC0289e0);
                        Object M5 = c0315s2.M();
                        P.Z z5 = C0302l.f4480a;
                        InterfaceC0289e0 interfaceC0289e02 = (InterfaceC0289e0) obj5;
                        if (f9 || M5 == z5) {
                            M5 = new O3.f(6, interfaceC0289e0, interfaceC0289e02);
                            c0315s2.i0(M5);
                        }
                        c0315s2.q(false);
                        G4.d.c(B5, null, a10, c2703e2, null, null, false, (i4.c) M5, c0315s2, 24960);
                        Integer num5 = (Integer) interfaceC0289e02.getValue();
                        if (num5 != null) {
                            int intValue = num5.intValue();
                            c0315s2.X(-1403553894);
                            i4.e eVar = (i4.e) obj4;
                            boolean f10 = c0315s2.f(eVar) | c0315s2.d(i) | c0315s2.d(intValue);
                            Object M6 = c0315s2.M();
                            if (f10 || M6 == z5) {
                                M6 = new T3.f(eVar, i, intValue, 4);
                                c0315s2.i0(M6);
                            }
                            c0315s2.q(false);
                            b0.p h6 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 0.0f, f8, 1);
                            D.d dVar2 = R3.j.f5219b;
                            C2681E c2681e = AbstractC0232c.f3301a;
                            M.g0.a((InterfaceC2015a) M6, h6, false, dVar2, AbstractC0232c.a(V3.a.f5975d, V3.a.f5981l, c0315s2), null, null, X.e.d(1603279869, new P(intValue), c0315s2), c0315s2, 805309488, 484);
                        }
                        c0315s2.q(false);
                    }
                    c0315s2.q(true);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
                break;
        }
        return oVar;
    }

    public C0403f(InterfaceC2015a interfaceC2015a, Object obj, InterfaceC0289e0 interfaceC0289e0, int i) {
        this.f5483n = interfaceC2015a;
        this.f5484o = obj;
        this.f5481l = interfaceC0289e0;
        this.f5482m = i;
    }
}
