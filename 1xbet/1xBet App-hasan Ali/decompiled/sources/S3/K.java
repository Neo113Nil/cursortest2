package S3;

import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import androidx.lifecycle.InterfaceC0482k;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaDuelCard;
import game.betting133.sports1xbet.aqua_network.AquaGoalBoard;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaPulseCard;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureScheduleUiState;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureScheduleViewModel;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n.AbstractC2107A;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import v.AbstractC2527w;
import v.C2526v;
import x0.C2623i;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5393a = X3.C.Q("LIVE", "1H", "2H");

    public static final void a(final String str, final int i, C0315s c0315s, final int i5) {
        c0315s.Z(1533092349);
        int i6 = (c0315s.f(str) ? 4 : 2) | i5 | (c0315s.d(i) ? 32 : 16);
        if ((i6 & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            R3.j.e(str, androidx.compose.foundation.layout.b.h(b0.m.f7161k, 0.0f, 4, 1), i + " fixtures", "Matchday", AbstractC2346c.n(), 4, c0315s, (i6 & 14) | 199728, 0);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e(i, i5, str) { // from class: S3.G

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ String f5376k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f5377l;

                {
                    this.f5376k = str;
                }

                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(1);
                    K.a(this.f5376k, this.f5377l, (C0315s) obj, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final void b(AquaMatchTicket aquaMatchTicket, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        AquaClubBadge aquaClubBadge;
        float f;
        C2526v a5;
        int i5;
        AquaPulseCard pu_par_lse;
        AquaMatchTicket aquaMatchTicket2 = aquaMatchTicket;
        c0315s.Z(-2073196919);
        if (((i | (c0315s.f(aquaMatchTicket2) ? 4 : 2) | (c0315s.h(interfaceC2015a) ? 32 : 16)) & 19) == 18 && c0315s.B()) {
            c0315s.S();
            i5 = i;
        } else {
            AquaDuelCard duel_arg = aquaMatchTicket2.getDuel_arg();
            AquaClubBadge host_arg = duel_arg != null ? duel_arg.getHost_arg() : null;
            AquaDuelCard duel_arg2 = aquaMatchTicket2.getDuel_arg();
            AquaClubBadge gu_par_est = duel_arg2 != null ? duel_arg2.getGu_par_est() : null;
            AquaGoalBoard bo_par_ard = aquaMatchTicket2.getBo_par_ard();
            AquaMatchCard ma_par_tch = aquaMatchTicket2.getMa_par_tch();
            String code_arg = (ma_par_tch == null || (pu_par_lse = ma_par_tch.getPu_par_lse()) == null) ? null : pu_par_lse.getCode_arg();
            boolean V4 = X3.m.V(f5393a, code_arg);
            b0.p b3 = androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f);
            String str = code_arg;
            D.d dVar = R3.j.f5218a;
            b0.p d5 = androidx.compose.foundation.a.d(AbstractC0444a.n(b3, dVar), false, null, interfaceC2015a, 7);
            float f5 = 10;
            long b5 = V4 ? i0.p.b(0.12f, V3.a.f5975d) : V3.a.f5962A;
            float f6 = 4;
            if (V4) {
                aquaClubBadge = host_arg;
                a5 = AbstractC2527w.a(2, V3.a.f5975d);
                f = f6;
            } else {
                aquaClubBadge = host_arg;
                f = f6;
                a5 = AbstractC2527w.a(1, i0.p.b(0.35f, V3.a.f5995z));
            }
            C2526v c2526v = a5;
            aquaMatchTicket2 = aquaMatchTicket;
            i5 = i;
            p0.a(d5, dVar, b5, f, f5, c2526v, X.e.d(-1154508700, new H(aquaMatchTicket2, str, V4, aquaClubBadge, gu_par_est, bo_par_ard), c0315s), c0315s, 12804144, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new O3.o(i5, 4, aquaMatchTicket2, interfaceC2015a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Object obj, C0315s c0315s, int i) {
        Object obj2;
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(420795955);
        int i5 = (c0315s.h(obj) ? 4 : 2) | i;
        if ((i5 & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (!kotlin.jvm.internal.l.a(str, "adMarkerQureka")) {
                if (kotlin.jvm.internal.l.a(str, "adMarkerAdx")) {
                    c0315s.X(-1840565619);
                    c0315s.X(-1840564690);
                    Object M5 = c0315s.M();
                    if (M5 == C0302l.f4480a) {
                        M5 = new B1.h(6);
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
                    c0315s2.X(-1222890922);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new C0398a(i, 3, obj2);
                    return;
                }
                return;
            }
            c0315s.X(-1840567012);
            O3.s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        obj2 = obj;
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final void d(final int i, final int i5, final InterfaceC2015a interfaceC2015a, final i4.c cVar, final Object obj, AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel, C0315s c0315s, final int i6) {
        AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel2;
        final AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel3;
        kotlin.jvm.internal.l.f("onBack", interfaceC2015a);
        kotlin.jvm.internal.l.f("onFixtureSelect", cVar);
        c0315s.Z(-2078072140);
        if (((i6 | (c0315s.d(i) ? 4 : 2) | (c0315s.d(i5) ? 32 : 16) | (c0315s.h(interfaceC2015a) ? 256 : 128) | (c0315s.h(cVar) ? 2048 : 1024) | (c0315s.h(obj) ? 16384 : 8192) | 65536) & 74899) == 74898 && c0315s.B()) {
            c0315s.S();
            aquaFixtureScheduleViewModel3 = aquaFixtureScheduleViewModel;
        } else {
            c0315s.U();
            if ((i6 & 1) == 0 || c0315s.z()) {
                androidx.lifecycle.U makeFmeansactory = AquaFixtureScheduleViewModel.Companion.makeFmeansactory(i, i5);
                androidx.lifecycle.Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaFixtureScheduleViewModel2 = (AquaFixtureScheduleViewModel) G4.d.N(kotlin.jvm.internal.x.a(AquaFixtureScheduleViewModel.class), a5, makeFmeansactory, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
                aquaFixtureScheduleViewModel2 = aquaFixtureScheduleViewModel;
            }
            c0315s.r();
            InterfaceC0289e0 l5 = AbstractC0329z.l(aquaFixtureScheduleViewModel2.getFr_par_ame(), c0315s);
            List<AquaMatchTicket> matc_par_hRows = ((AquaFixtureScheduleUiState) l5.getValue()).getMatc_par_hRows();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<AquaMatchTicket> it = matc_par_hRows.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AquaMatchTicket next = it.next();
                AquaMatchCard ma_par_tch = next.getMa_par_tch();
                String renderKimeansckoffDay = AquaDisplayFormattersKt.renderKimeansckoffDay(ma_par_tch != null ? ma_par_tch.getKick_par_offAt() : null);
                Object obj2 = linkedHashMap.get(renderKimeansckoffDay);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(renderKimeansckoffDay, obj2);
                }
                ((List) obj2).add(next);
            }
            Set entrySet = linkedHashMap.entrySet();
            kotlin.jvm.internal.l.e("<get-entries>(...)", entrySet);
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(X3.o.S(set, 10));
            for (Map.Entry entry : set) {
                arrayList.add(new W3.h(entry.getKey(), entry.getValue()));
            }
            R3.j.d(null, X.e.d(-631621860, new J(i5, interfaceC2015a, obj, arrayList, cVar, l5), c0315s), c0315s, 48);
            aquaFixtureScheduleViewModel3 = aquaFixtureScheduleViewModel2;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e(i, i5, interfaceC2015a, cVar, obj, aquaFixtureScheduleViewModel3, i6) { // from class: S3.F

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f5370k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f5371l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2015a f5372m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ i4.c f5373n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Object f5374o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ AquaFixtureScheduleViewModel f5375p;

                @Override // i4.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int B5 = AbstractC0329z.B(1);
                    Object obj5 = this.f5374o;
                    AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel4 = this.f5375p;
                    K.d(this.f5370k, this.f5371l, this.f5372m, this.f5373n, obj5, aquaFixtureScheduleViewModel4, (C0315s) obj3, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final void e(String str, String str2, b0.p pVar, C0315s c0315s, int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-786013114);
        int i5 = i | (c0315s2.f(str) ? 4 : 2) | (c0315s2.f(str2) ? 32 : 16) | (c0315s2.f(pVar) ? 256 : 128);
        if ((i5 & 147) == 146 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.g gVar = b0.c.f7147u;
            C2700b c2700b = AbstractC2706h.f21534a;
            float f = 6;
            C2686J a5 = AbstractC2685I.a(new C2703e(f), gVar, c0315s2, 54);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, pVar);
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
            R3.l.a(str, androidx.compose.foundation.a.b(AbstractC0444a.n(androidx.compose.foundation.layout.c.f(mVar, 32), D.e.a(f)), V3.a.f, i0.F.f17222a), C2623i.f21001b, null, c0315s2, (i5 & 14) | 3120);
            u0.b(str2, null, 0L, 0L, O0.l.f4030p, 0L, null, 0L, 2, false, 2, 0, ((v0) c0315s2.j(w0.f3580a)).f3576n, c0315s, ((i5 >> 3) & 14) | 196608, 3120, 55262);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new O3.g(str, str2, pVar, i, 3);
        }
    }
}
