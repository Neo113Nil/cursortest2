package Z1;

import k1.C7464j;
import k1.C7465k;

/* loaded from: classes.dex */
public interface d extends k {
    default float B(int i11) {
        return i11 / g();
    }

    default float C(float f7) {
        return f7 / g();
    }

    default long D0(long j11) {
        if (j11 != 9205357640488583168L) {
            return C7465k.a(v1(j.c(j11)), v1(j.b(j11)));
        }
        return 9205357640488583168L;
    }

    default int Y0(float f7) {
        float v12 = v1(f7);
        if (Float.isInfinite(v12)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(v12);
    }

    default float Z0(long j11) {
        if (v.b(u.d(j11), 4294967296L)) {
            return v1(p(j11));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    float g();

    default long o(long j11) {
        if (j11 != 9205357640488583168L) {
            return Ra.h.d(C(C7464j.f(j11)), C(C7464j.d(j11)));
        }
        return 9205357640488583168L;
    }

    default long r(float f7) {
        return F(C(f7));
    }

    default float v1(float f7) {
        return g() * f7;
    }
}
