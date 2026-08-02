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
import P.C0326x0;
import P.C0328y0;
import P.D0;
import P.InterfaceC0314r0;
import androidx.lifecycle.InterfaceC0482k;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import game.betting133.sports1xbet.aqua_network.AquaDuelCard;
import game.betting133.sports1xbet.aqua_network.AquaGoalBoard;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchDigest;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaShapeBundle;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureInsightViewModel;
import i4.InterfaceC2015a;
import java.util.Iterator;
import n.AbstractC2107A;
import o0.C2201e;
import v.AbstractC2527w;
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

/* renamed from: S3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0412o {
    public static final void a(final int i, final InterfaceC2015a interfaceC2015a, final InterfaceC2015a interfaceC2015a2, final InterfaceC2015a interfaceC2015a3, final i4.c cVar, final i4.e eVar, final Object obj, AquaFixtureInsightViewModel aquaFixtureInsightViewModel, C0315s c0315s, final int i5) {
        AquaFixtureInsightViewModel aquaFixtureInsightViewModel2;
        kotlin.jvm.internal.l.f("onBack", interfaceC2015a);
        kotlin.jvm.internal.l.f("onMetricsTap", interfaceC2015a2);
        kotlin.jvm.internal.l.f("onTimelineTap", interfaceC2015a3);
        kotlin.jvm.internal.l.f("onClubTap", cVar);
        kotlin.jvm.internal.l.f("onCompetitionTap", eVar);
        c0315s.Z(-2122422708);
        if (((i5 | (c0315s.d(i) ? 4 : 2) | (c0315s.h(interfaceC2015a) ? 32 : 16) | (c0315s.h(interfaceC2015a2) ? 256 : 128) | (c0315s.h(interfaceC2015a3) ? 2048 : 1024) | (c0315s.h(cVar) ? 16384 : 8192) | (c0315s.h(eVar) ? 131072 : 65536) | (c0315s.h(obj) ? 1048576 : 524288) | 4194304) & 4793491) == 4793490 && c0315s.B()) {
            c0315s.S();
            aquaFixtureInsightViewModel2 = aquaFixtureInsightViewModel;
        } else {
            c0315s.U();
            if ((i5 & 1) == 0 || c0315s.z()) {
                androidx.lifecycle.U makeFmeansactory = AquaFixtureInsightViewModel.Companion.makeFmeansactory(i);
                androidx.lifecycle.Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaFixtureInsightViewModel2 = (AquaFixtureInsightViewModel) G4.d.N(kotlin.jvm.internal.x.a(AquaFixtureInsightViewModel.class), a5, makeFmeansactory, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
                aquaFixtureInsightViewModel2 = aquaFixtureInsightViewModel;
            }
            c0315s.r();
            R3.j.d(null, X.e.d(711315684, new C0409l(interfaceC2015a, obj, interfaceC2015a2, interfaceC2015a3, cVar, eVar, AbstractC0329z.l(aquaFixtureInsightViewModel2.getFr_par_ame(), c0315s)), c0315s), c0315s, 48);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            final AquaFixtureInsightViewModel aquaFixtureInsightViewModel3 = aquaFixtureInsightViewModel2;
            s2.f4578d = new i4.e(i, interfaceC2015a, interfaceC2015a2, interfaceC2015a3, cVar, eVar, obj, aquaFixtureInsightViewModel3, i5) { // from class: S3.j

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f5501k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2015a f5502l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2015a f5503m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2015a f5504n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ i4.c f5505o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ i4.e f5506p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ Object f5507q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AquaFixtureInsightViewModel f5508r;

                @Override // i4.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int B5 = AbstractC0329z.B(1);
                    Object obj4 = this.f5507q;
                    AquaFixtureInsightViewModel aquaFixtureInsightViewModel4 = this.f5508r;
                    AbstractC0412o.a(this.f5501k, this.f5502l, this.f5503m, this.f5504n, this.f5505o, this.f5506p, obj4, aquaFixtureInsightViewModel4, (C0315s) obj2, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final void b(AquaMatchDigest aquaMatchDigest, i4.c cVar, i4.e eVar, b0.p pVar, C0315s c0315s, int i) {
        Object obj;
        Object obj2;
        c0315s.Z(1698093179);
        int i5 = i | (c0315s.h(aquaMatchDigest) ? 4 : 2) | (c0315s.h(cVar) ? 32 : 16) | (c0315s.h(eVar) ? 256 : 128) | (c0315s.f(pVar) ? 2048 : 1024);
        if ((i5 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            AquaMatchTicket focus_par_Match = aquaMatchDigest.getFocus_par_Match();
            AquaDuelCard duel_arg = focus_par_Match.getDuel_arg();
            AquaClubBadge host_arg = duel_arg != null ? duel_arg.getHost_arg() : null;
            AquaDuelCard duel_arg2 = focus_par_Match.getDuel_arg();
            AquaClubBadge gu_par_est = duel_arg2 != null ? duel_arg2.getGu_par_est() : null;
            AquaCompetitionPocket compe_par_tition = focus_par_Match.getCompe_par_tition();
            AquaMatchCard ma_par_tch = focus_par_Match.getMa_par_tch();
            Iterator<T> it = aquaMatchDigest.getShape_par_Cards().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AquaClubBadge sq_par_uad = ((AquaShapeBundle) obj).getSq_par_uad();
                if (kotlin.jvm.internal.l.a(sq_par_uad != null ? Integer.valueOf(sq_par_uad.getCode_arg()) : null, host_arg != null ? Integer.valueOf(host_arg.getCode_arg()) : null)) {
                    break;
                }
            }
            AquaShapeBundle aquaShapeBundle = (AquaShapeBundle) obj;
            Iterator<T> it2 = aquaMatchDigest.getShape_par_Cards().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it2.next();
                AquaClubBadge sq_par_uad2 = ((AquaShapeBundle) next).getSq_par_uad();
                if (kotlin.jvm.internal.l.a(sq_par_uad2 != null ? Integer.valueOf(sq_par_uad2.getCode_arg()) : null, gu_par_est != null ? Integer.valueOf(gu_par_est.getCode_arg()) : null)) {
                    obj2 = next;
                    break;
                }
            }
            AquaShapeBundle aquaShapeBundle2 = (AquaShapeBundle) obj2;
            C2681E a5 = androidx.compose.foundation.layout.b.a(0.0f, 4, 1);
            C2700b c2700b = AbstractC2706h.f21534a;
            C2703e c2703e = new C2703e(10);
            b0.p c5 = pVar.c(androidx.compose.foundation.layout.c.f6868c);
            c0315s.X(372094655);
            boolean f = ((i5 & 896) == 256) | c0315s.f(compe_par_tition) | c0315s.f(ma_par_tch) | c0315s.f(host_arg) | ((i5 & 112) == 32) | c0315s.f(focus_par_Match) | c0315s.f(gu_par_est) | c0315s.f(aquaShapeBundle) | c0315s.f(aquaShapeBundle2);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                Object d02 = new D0(focus_par_Match, compe_par_tition, eVar, ma_par_tch, host_arg, cVar, gu_par_est, aquaShapeBundle, aquaShapeBundle2);
                c0315s.i0(d02);
                M5 = d02;
            }
            c0315s.q(false);
            G4.d.c(c5, null, a5, c2703e, null, null, false, (i4.c) M5, c0315s, 24960);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0415s(aquaMatchDigest, cVar, eVar, pVar, i, 2);
        }
    }

    public static final void c(String str, String str2, C2201e c2201e, C0315s c0315s, int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-714135334);
        int i5 = i | (c0315s2.f(str2) ? 32 : 16) | (c0315s2.f(c2201e) ? 256 : 128);
        if ((i5 & 147) == 146 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 0.0f, 2, 1);
            O3.m mVar2 = AbstractC2706h.f21538e;
            b0.g gVar = b0.c.f7147u;
            C2686J a5 = AbstractC2685I.a(mVar2, gVar, c0315s2, 54);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, h3);
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
            C2686J a6 = AbstractC2685I.a(new C2703e(6), gVar, c0315s2, 54);
            int p6 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l6 = c0315s2.l();
            b0.p c6 = b0.a.c(c0315s2, mVar);
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, c2751h, a6);
            AbstractC0329z.y(c0315s2, c2751h2, l6);
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s2, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s2, c2751h4, c6);
            long j5 = V3.a.f5975d;
            R3.j.b(c2201e, null, j5, 14, c0315s2, ((i5 >> 6) & 14) | 3456);
            u0.b(str, null, ((C0249u) c0315s2.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(w0.f3580a)).f3574l, c0315s, 6, 0, 65530);
            c0315s.q(true);
            C2686J a7 = AbstractC2685I.a(new C2703e(4), gVar, c0315s, 54);
            int p7 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l7 = c0315s.l();
            b0.p c7 = b0.a.c(c0315s, mVar);
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
            R3.j.c(str2, null, V3.a.f, j5, c0315s, ((i5 >> 3) & 14) | 3456, 2);
            c0315s2 = c0315s;
            c0315s2.q(true);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C0400c(str, str2, c2201e, i, 1);
        }
    }

    public static final void d(int i, long j5, C0315s c0315s, b0.p pVar, String str, String str2, C2201e c2201e) {
        c0315s.Z(-1681397261);
        int i5 = (c0315s.f(str) ? 4 : 2) | i | (c0315s.f(str2) ? 32 : 16) | (c0315s.f(c2201e) ? 2048 : 1024) | (c0315s.f(pVar) ? 16384 : 8192);
        if ((i5 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
        } else {
            p0.a(pVar, R3.j.f5219b, i0.p.b(0.15f, j5), 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.4f, j5)), X.e.d(-1488364786, new C0405h(j5, str, str2, c2201e, 1), c0315s), c0315s, ((i5 >> 12) & 14) | 12582960, 56);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0399b(str, str2, j5, c2201e, pVar, i);
        }
    }

    public static final void e(final String str, final AquaGoalBoard aquaGoalBoard, C0315s c0315s, final int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-603811136);
        if ((((c0315s2.f(aquaGoalBoard) ? 32 : 16) | i) & 19) == 18 && c0315s2.B()) {
            c0315s2.S();
        } else {
            if ((aquaGoalBoard != null ? aquaGoalBoard.getHost_arg() : null) == null) {
                if ((aquaGoalBoard != null ? aquaGoalBoard.getGu_par_est() : null) == null) {
                    C0326x0 s2 = c0315s2.s();
                    if (s2 != null) {
                        final int i5 = 0;
                        s2.f4578d = new i4.e(str, aquaGoalBoard, i, i5) { // from class: S3.k

                            /* renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ int f5509k;

                            /* renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ String f5510l;

                            /* renamed from: m, reason: collision with root package name */
                            public final /* synthetic */ AquaGoalBoard f5511m;

                            {
                                this.f5509k = i5;
                            }

                            @Override // i4.e
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = this.f5509k;
                                C0315s c0315s3 = (C0315s) obj;
                                ((Integer) obj2).getClass();
                                switch (i6) {
                                    case 0:
                                        AbstractC0412o.e(this.f5510l, this.f5511m, c0315s3, AbstractC0329z.B(7));
                                        break;
                                    default:
                                        AbstractC0412o.e(this.f5510l, this.f5511m, c0315s3, AbstractC0329z.B(7));
                                        break;
                                }
                                return W3.o.f6046a;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f), 0.0f, 2, 1);
            C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21538e, b0.c.f7147u, c0315s2, 54);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, h3);
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
            u0.b(str, null, ((C0249u) c0315s2.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(w0.f3580a)).f3574l, c0315s, 6, 0, 65530);
            Object host_arg = aquaGoalBoard.getHost_arg();
            if (host_arg == null) {
                host_arg = "--";
            }
            Integer gu_par_est = aquaGoalBoard.getGu_par_est();
            u0.b(host_arg + " : " + (gu_par_est != null ? gu_par_est : "--"), null, V3.a.f5975d, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 196992, 0, 131034);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s5 = c0315s2.s();
        if (s5 != null) {
            final int i6 = 1;
            s5.f4578d = new i4.e(str, aquaGoalBoard, i, i6) { // from class: S3.k

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f5509k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ String f5510l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AquaGoalBoard f5511m;

                {
                    this.f5509k = i6;
                }

                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.f5509k;
                    C0315s c0315s3 = (C0315s) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            AbstractC0412o.e(this.f5510l, this.f5511m, c0315s3, AbstractC0329z.B(7));
                            break;
                        default:
                            AbstractC0412o.e(this.f5510l, this.f5511m, c0315s3, AbstractC0329z.B(7));
                            break;
                    }
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final void f(AquaClubBadge aquaClubBadge, i4.c cVar, b0.p pVar, C0315s c0315s, int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-245766641);
        int i5 = i | (c0315s2.f(aquaClubBadge) ? 4 : 2) | (c0315s2.h(cVar) ? 32 : 16) | (c0315s2.f(pVar) ? 256 : 128);
        if ((i5 & 147) == 146 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.f fVar = b0.c.f7149w;
            c0315s2.X(230647786);
            boolean z3 = ((i5 & 112) == 32) | ((i5 & 14) == 4);
            Object M5 = c0315s2.M();
            if (z3 || M5 == C0302l.f4480a) {
                M5 = new C0328y0(1, aquaClubBadge, cVar);
                c0315s2.i0(M5);
            }
            c0315s2.q(false);
            b0.p d5 = androidx.compose.foundation.a.d(pVar, false, null, (InterfaceC2015a) M5, 7);
            C2717s a5 = AbstractC2716r.a(AbstractC2706h.f21535b, fVar, c0315s2, 48);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, d5);
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
            p0.a(androidx.compose.foundation.layout.c.f(mVar, 56), D.e.a(8), V3.a.f5962A, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.4f, V3.a.f5995z)), X.e.d(-534920418, new P.r(6, aquaClubBadge), c0315s2), c0315s2, 14156166, 56);
            AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, 6));
            String ti_par_tle = aquaClubBadge != null ? aquaClubBadge.getTi_par_tle() : null;
            if (ti_par_tle == null) {
                ti_par_tle = "";
            }
            u0.b(ti_par_tle, null, 0L, 0L, O0.l.f4030p, 0L, new V0.k(3), 0L, 2, false, 2, 0, ((v0) c0315s2.j(w0.f3580a)).f3573k, c0315s, 196608, 3120, 54750);
            R3.j.c("TEAM", null, V3.a.f, V3.a.f5975d, c0315s, 3462, 2);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new O3.g(aquaClubBadge, cVar, pVar, i, 1);
        }
    }
}
