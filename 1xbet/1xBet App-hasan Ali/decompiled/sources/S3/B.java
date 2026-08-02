package S3;

import P.AbstractC0329z;
import P.C0315s;
import P.C0326x0;
import androidx.lifecycle.InterfaceC0482k;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureInsightViewModel;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public abstract class B {
    public static final void a(int i, InterfaceC2015a interfaceC2015a, Object obj, AquaFixtureInsightViewModel aquaFixtureInsightViewModel, C0315s c0315s, int i5) {
        kotlin.jvm.internal.l.f("onBack", interfaceC2015a);
        c0315s.Z(366548161);
        if ((((c0315s.d(i) ? 4 : 2) | i5 | (c0315s.h(interfaceC2015a) ? 32 : 16) | (c0315s.h(obj) ? 256 : 128) | 1024) & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.U();
            if ((i5 & 1) == 0 || c0315s.z()) {
                androidx.lifecycle.U makeFmeansactory = AquaFixtureInsightViewModel.Companion.makeFmeansactory(i);
                androidx.lifecycle.Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaFixtureInsightViewModel = (AquaFixtureInsightViewModel) G4.d.N(kotlin.jvm.internal.x.a(AquaFixtureInsightViewModel.class), a5, makeFmeansactory, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
            }
            c0315s.r();
            R3.j.d(null, X.e.d(-229774503, new C0422z(interfaceC2015a, obj, AbstractC0329z.l(aquaFixtureInsightViewModel.getFr_par_ame(), c0315s), 1), c0315s), c0315s, 48);
        }
        AquaFixtureInsightViewModel aquaFixtureInsightViewModel2 = aquaFixtureInsightViewModel;
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0421y(i, interfaceC2015a, obj, aquaFixtureInsightViewModel2, i5, 1);
        }
    }
}
