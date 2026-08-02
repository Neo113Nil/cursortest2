package Z1;

import Hj0.T;
import a2.InterfaceC4921a;

/* loaded from: classes.dex */
public interface k {
    default long F(float f7) {
        int i11 = a2.b.f36213d;
        if (!(u1() >= 1.03f)) {
            return T.f(f7 / u1(), 4294967296L);
        }
        InterfaceC4921a a11 = a2.b.a(u1());
        return T.f(a11 != null ? a11.a(f7) : f7 / u1(), 4294967296L);
    }

    default float p(long j11) {
        float e11;
        float u12;
        if (!v.b(u.d(j11), 4294967296L)) {
            l.b("Only Sp can convert to Px");
            throw null;
        }
        int i11 = a2.b.f36213d;
        if (u1() >= 1.03f) {
            InterfaceC4921a a11 = a2.b.a(u1());
            e11 = u.e(j11);
            if (a11 != null) {
                return a11.b(e11);
            }
            u12 = u1();
        } else {
            e11 = u.e(j11);
            u12 = u1();
        }
        return u12 * e11;
    }

    float u1();
}
