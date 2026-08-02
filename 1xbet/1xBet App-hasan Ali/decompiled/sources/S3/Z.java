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
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import androidx.lifecycle.InterfaceC0482k;
import game.betting133.sports1xbet.aqua_network.AquaPlayerCard;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import game.betting133.sports1xbet.aqua_network.AquaSeasonLedger;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSquadRosterViewModel;
import i4.InterfaceC2015a;
import java.util.List;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import r3.AbstractC2349a;
import v.AbstractC2527w;
import z.AbstractC2685I;
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
public abstract class Z {
    public static final void a(AquaPlayerSheet aquaPlayerSheet, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        c0315s.Z(-19763498);
        if ((((c0315s.h(aquaPlayerSheet) ? 4 : 2) | i | (c0315s.h(interfaceC2015a) ? 32 : 16)) & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            AquaPlayerCard ath_par_lete = aquaPlayerSheet.getAth_par_lete();
            List<AquaSeasonLedger> led_par_gers = aquaPlayerSheet.getLed_par_gers();
            AquaSeasonLedger aquaSeasonLedger = led_par_gers != null ? (AquaSeasonLedger) X3.m.Z(led_par_gers) : null;
            b0.p b3 = androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f);
            D.d dVar = R3.j.f5218a;
            p0.a(androidx.compose.foundation.a.d(AbstractC0444a.n(b3, dVar), false, null, interfaceC2015a, 7), dVar, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, i0.p.b(0.3f, V3.a.f5995z)), X.e.d(764526833, new C0419w(2, ath_par_lete, aquaSeasonLedger), c0315s), c0315s, 14377392, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new O3.o(i, 5, aquaPlayerSheet, interfaceC2015a);
        }
    }

    public static final void b(int i, InterfaceC2015a interfaceC2015a, i4.e eVar, Object obj, AquaSquadRosterViewModel aquaSquadRosterViewModel, C0315s c0315s, int i5) {
        AquaSquadRosterViewModel aquaSquadRosterViewModel2;
        kotlin.jvm.internal.l.f("onBack", interfaceC2015a);
        kotlin.jvm.internal.l.f("onAthleteTap", eVar);
        c0315s.Z(-632783041);
        if ((((c0315s.d(i) ? 4 : 2) | i5 | (c0315s.h(interfaceC2015a) ? 32 : 16) | (c0315s.h(eVar) ? 256 : 128) | (c0315s.h(obj) ? 2048 : 1024) | 8192) & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
            aquaSquadRosterViewModel2 = aquaSquadRosterViewModel;
        } else {
            c0315s.U();
            if ((i5 & 1) == 0 || c0315s.z()) {
                androidx.lifecycle.U makeFmeansactory = AquaSquadRosterViewModel.Companion.makeFmeansactory(i);
                androidx.lifecycle.Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaSquadRosterViewModel2 = (AquaSquadRosterViewModel) G4.d.N(kotlin.jvm.internal.x.a(AquaSquadRosterViewModel.class), a5, makeFmeansactory, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
                aquaSquadRosterViewModel2 = aquaSquadRosterViewModel;
            }
            c0315s.r();
            R3.j.d(null, X.e.d(-1373771353, new V(interfaceC2015a, obj, eVar, AbstractC0329z.l(aquaSquadRosterViewModel2.getFr_par_ame(), c0315s)), c0315s), c0315s, 48);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B1.a(i, interfaceC2015a, eVar, obj, aquaSquadRosterViewModel2, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Object obj, C0315s c0315s, int i) {
        Object obj2;
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(798733029);
        int i5 = (c0315s.h(obj) ? 4 : 2) | i;
        if ((i5 & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (!kotlin.jvm.internal.l.a(str, "adMarkerQureka")) {
                if (kotlin.jvm.internal.l.a(str, "adMarkerAdx")) {
                    c0315s.X(720545068);
                    c0315s.X(720545997);
                    Object M5 = c0315s.M();
                    if (M5 == C0302l.f4480a) {
                        M5 = new B1.h(13);
                        c0315s.i0(M5);
                    }
                    c0315s.q(false);
                    obj2 = obj;
                    c0315s2 = c0315s;
                    N4.b.M((InterfaceC2015a) M5, obj2, null, c0315s2, ((i5 << 3) & 112) | 6, 4);
                    c0315s2.q(false);
                } else {
                    obj2 = obj;
                    c0315s2 = c0315s;
                    c0315s2.X(862129047);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new C0398a(i, 4, obj2);
                    return;
                }
                return;
            }
            c0315s.X(720543675);
            O3.s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        obj2 = obj;
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final void d(String str, Integer num, C2201e c2201e, C0315s c0315s, int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-586491984);
        int i5 = i | (c0315s2.f(num) ? 32 : 16) | (c0315s2.f(c2201e) ? 256 : 128);
        if ((i5 & 147) == 146 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.f fVar = b0.c.f7149w;
            b0.m mVar = b0.m.f7161k;
            C2717s a5 = AbstractC2716r.a(AbstractC2706h.f21535b, fVar, c0315s2, 48);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, mVar);
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
            C2686J a6 = AbstractC2685I.a(new C2703e(2), b0.c.f7147u, c0315s2, 54);
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
            M.G.a(c2201e, null, androidx.compose.foundation.layout.c.f(mVar, 10), j5, c0315s2, ((i5 >> 6) & 14) | 3504, 0);
            u0.b((num == null ? "--" : num).toString(), null, j5, AbstractC2036a.H(13), O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 200064, 0, 131026);
            c0315s.q(true);
            u0.b(str, null, ((C0249u) c0315s.j(AbstractC0251w.f3578a)).f3543s, AbstractC2036a.H(9), null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s.j(w0.f3580a)).f3577o, c0315s, 3078, 0, 65522);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new O3.g(str, num, c2201e, i, 5);
        }
    }
}
