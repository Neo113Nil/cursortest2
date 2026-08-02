package K1;

import Kk.C3532b;
import k1.C7459e;
import l1.AbstractC7799Q;
import l1.H0;
import l1.InterfaceC7802U;
import n1.AbstractC8413f;
import n1.C8408a;
import n1.C8409b;
import n1.InterfaceC8412e;

/* loaded from: classes8.dex */
public final class P {
    public static void a(InterfaceC8412e interfaceC8412e, K k11, long j11, long j12) {
        H0 t2 = k11.k().i().t();
        V1.i w11 = k11.k().i().w();
        AbstractC8413f g10 = k11.k().i().g();
        C8408a.b w02 = interfaceC8412e.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            C8409b f7 = w02.f();
            f7.g(C7459e.g(j12), C7459e.h(j12));
            if (k11.h() && k11.k().f() != 3) {
                f7.b(0.0f, 0.0f, (int) (k11.A() >> 32), (int) (k11.A() & 4294967295L), 1);
            }
            AbstractC7799Q e12 = k11.k().i().e();
            if (e12 == null || j11 != 16) {
                k11.v().C(interfaceC8412e.w0().a(), V1.k.c(Float.NaN, j11 != 16 ? j11 : k11.k().i().f()), t2, w11, g10);
            } else {
                C3433m v11 = k11.v();
                InterfaceC7802U a11 = interfaceC8412e.w0().a();
                float d11 = Float.isNaN(Float.NaN) ? k11.k().i().d() : Float.NaN;
                v11.getClass();
                S1.b.a(v11, a11, e12, d11, t2, w11, g10);
            }
            C3532b.b(w02, e11);
        } catch (Throwable th2) {
            C3532b.b(w02, e11);
            throw th2;
        }
    }
}
