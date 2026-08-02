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
import androidx.lifecycle.InterfaceC0482k;
import game.betting133.sports1xbet.aqua_viewmodels.AquaAthleteProfileViewModel;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import o0.C2201e;
import r3.AbstractC2349a;
import v.AbstractC2527w;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.C2686J;
import z.C2703e;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: S3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0406i {
    public static final void a(int i, int i5, InterfaceC2015a interfaceC2015a, Object obj, AquaAthleteProfileViewModel aquaAthleteProfileViewModel, C0315s c0315s, int i6) {
        AquaAthleteProfileViewModel aquaAthleteProfileViewModel2;
        kotlin.jvm.internal.l.f("onBack", interfaceC2015a);
        c0315s.Z(-334668983);
        if ((((c0315s.d(i) ? 4 : 2) | i6 | (c0315s.d(i5) ? 32 : 16) | (c0315s.h(interfaceC2015a) ? 256 : 128) | (c0315s.h(obj) ? 2048 : 1024) | 8192) & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
            aquaAthleteProfileViewModel2 = aquaAthleteProfileViewModel;
        } else {
            c0315s.U();
            if ((i6 & 1) == 0 || c0315s.z()) {
                androidx.lifecycle.U makeFmeansactory = AquaAthleteProfileViewModel.Companion.makeFmeansactory(i, i5);
                androidx.lifecycle.Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaAthleteProfileViewModel2 = (AquaAthleteProfileViewModel) G4.d.N(kotlin.jvm.internal.x.a(AquaAthleteProfileViewModel.class), a5, makeFmeansactory, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
                aquaAthleteProfileViewModel2 = aquaAthleteProfileViewModel;
            }
            c0315s.r();
            R3.j.d(null, X.e.d(2124868577, new C0403f(interfaceC2015a, obj, AbstractC0329z.l(aquaAthleteProfileViewModel2.getFr_par_ame(), c0315s), i5), c0315s), c0315s, 48);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new O3.k(i, i5, interfaceC2015a, obj, aquaAthleteProfileViewModel2, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Object obj, C0315s c0315s, int i) {
        Object obj2;
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(1427449854);
        int i5 = (c0315s.h(obj) ? 4 : 2) | i;
        if ((i5 & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (!kotlin.jvm.internal.l.a(str, "adMarkerQureka")) {
                if (kotlin.jvm.internal.l.a(str, "adMarkerAdx")) {
                    c0315s.X(508024169);
                    c0315s.X(508025098);
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
                    c0315s2.X(-1431051526);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new C0398a(i, 0, obj2);
                    return;
                }
                return;
            }
            c0315s.X(508022776);
            O3.s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        obj2 = obj;
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final void c(int i, long j5, C0315s c0315s, b0.p pVar, String str, String str2, C2201e c2201e) {
        c0315s.Z(-1969268216);
        int i5 = (c0315s.f(str2) ? 32 : 16) | i | (c0315s.f(c2201e) ? 256 : 128) | (c0315s.f(pVar) ? 16384 : 8192);
        if ((i5 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
        } else {
            p0.a(pVar, R3.j.f5219b, V3.a.f5962A, 2, 0.0f, AbstractC2527w.a(1, i0.p.b(0.35f, V3.a.f5995z)), X.e.d(-767794163, new C0405h(j5, str2, str, c2201e, 0), c0315s), c0315s, ((i5 >> 12) & 14) | 14180784, 40);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0399b(str, str2, c2201e, j5, pVar, i);
        }
    }

    public static final void d(String str, String str2, C2201e c2201e, C0315s c0315s, int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(305226724);
        int i5 = i | (c0315s2.f(str2) ? 32 : 16) | (c0315s2.f(c2201e) ? 256 : 128);
        if ((i5 & 147) == 146 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 0.0f, 10, 1);
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
            C2686J a6 = AbstractC2685I.a(new C2703e(8), gVar, c0315s2, 54);
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
            u0.b(str, null, ((C0249u) c0315s2.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(w0.f3580a)).f3573k, c0315s, 6, 0, 65530);
            c0315s.q(true);
            R3.j.c(str2, null, V3.a.f, j5, c0315s, ((i5 >> 3) & 14) | 3456, 2);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C0400c(str, str2, c2201e, i, 0);
        }
    }
}
