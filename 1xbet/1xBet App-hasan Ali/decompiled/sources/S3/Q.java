package S3;

import M.p0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.d1;
import a.AbstractC0444a;
import androidx.lifecycle.InterfaceC0482k;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSeasonChoiceViewModel;
import i4.InterfaceC2015a;
import r3.AbstractC2349a;
import u.AbstractC2453d;
import v.AbstractC2527w;

/* loaded from: classes.dex */
public abstract class Q {
    public static final void a(final int i, final boolean z3, final InterfaceC2015a interfaceC2015a, C0315s c0315s, final int i5) {
        float f;
        long b3;
        c0315s.Z(365204643);
        if ((((c0315s.d(i) ? 4 : 2) | i5 | (c0315s.g(z3) ? 32 : 16) | (c0315s.h(interfaceC2015a) ? 256 : 128)) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            d1 a5 = t.K.a(z3 ? i0.p.b(0.15f, V3.a.f5975d) : V3.a.f5962A, AbstractC2453d.m(300, 6, null), c0315s, 432, 8);
            b0.p b5 = androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f);
            D.d dVar = R3.j.f5218a;
            b0.p d5 = androidx.compose.foundation.a.d(AbstractC0444a.n(b5, dVar), false, null, interfaceC2015a, 7);
            float f5 = 10;
            long j5 = ((i0.p) a5.getValue()).f17295a;
            float f6 = z3 ? 6 : 2;
            if (z3) {
                f = 2;
                b3 = V3.a.f5975d;
            } else {
                f = 1;
                b3 = i0.p.b(0.35f, V3.a.f5995z);
            }
            p0.a(d5, dVar, j5, f6, f5, AbstractC2527w.a(f, b3), X.e.d(1360335656, new N(i, z3), c0315s), c0315s, 12779568, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e(i, z3, interfaceC2015a, i5) { // from class: S3.M

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f5395k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f5396l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2015a f5397m;

                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(1);
                    boolean z5 = this.f5396l;
                    InterfaceC2015a interfaceC2015a2 = this.f5397m;
                    Q.a(this.f5395k, z5, interfaceC2015a2, (C0315s) obj, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final void b(int i, i4.e eVar, AquaSeasonChoiceViewModel aquaSeasonChoiceViewModel, C0315s c0315s, int i5) {
        kotlin.jvm.internal.l.f("onConfirm", eVar);
        c0315s.Z(1507510644);
        if ((((c0315s.d(i) ? 4 : 2) | i5 | (c0315s.h(eVar) ? 32 : 16) | 128) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.U();
            if ((i5 & 1) == 0 || c0315s.z()) {
                androidx.lifecycle.U makeFmeansactory = AquaSeasonChoiceViewModel.Companion.makeFmeansactory(i);
                androidx.lifecycle.Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaSeasonChoiceViewModel = (AquaSeasonChoiceViewModel) G4.d.N(kotlin.jvm.internal.x.a(AquaSeasonChoiceViewModel.class), a5, makeFmeansactory, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
            }
            c0315s.r();
            InterfaceC0289e0 l5 = AbstractC0329z.l(aquaSeasonChoiceViewModel.getFr_par_ame(), c0315s);
            c0315s.X(1044925149);
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = AbstractC0329z.t(null);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            R3.j.d(null, X.e.d(1655358476, new C0403f(l5, (InterfaceC0289e0) M5, eVar, i), c0315s), c0315s, 48);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new O3.p(i, eVar, aquaSeasonChoiceViewModel, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(int i, C0315s c0315s) {
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(-51906579);
        if (i == 0 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (!kotlin.jvm.internal.l.a(str, "adMarkerQureka")) {
                if (kotlin.jvm.internal.l.a(str, "adMarkerAdx")) {
                    c0315s.X(1656399110);
                    c0315s.X(1656400070);
                    Object M5 = c0315s.M();
                    if (M5 == C0302l.f4480a) {
                        M5 = new B1.h(13);
                        c0315s.i0(M5);
                    }
                    c0315s.q(false);
                    c0315s2 = c0315s;
                    N4.b.M((InterfaceC2015a) M5, null, null, c0315s2, 6, 6);
                    c0315s2.q(false);
                } else {
                    c0315s2 = c0315s;
                    c0315s2.X(-191196514);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new L(i, 0);
                    return;
                }
                return;
            }
            c0315s.X(1656397748);
            O3.s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }
}
