package B1;

import k1.C7464j;
import k1.C7465k;

/* loaded from: classes.dex */
public final class t0 {
    public static final long a(float f7, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
        int i11 = s0.f2152b;
        return floatToRawIntBits;
    }

    public static final long b(long j11, long j12) {
        return C7465k.a(s0.a(j12) * C7464j.f(j11), s0.b(j12) * C7464j.d(j11));
    }
}
