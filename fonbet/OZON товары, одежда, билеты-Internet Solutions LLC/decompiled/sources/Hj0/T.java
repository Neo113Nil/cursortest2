package Hj0;

import java.io.IOException;
import p3.InterfaceC8846f;

/* loaded from: classes7.dex */
public final class T {
    public static final void a(long j11, long j12) {
        if (e(j11) || e(j12)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (Z1.v.b(Z1.u.d(j11), Z1.u.d(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) Z1.v.c(Z1.u.d(j11))) + " and " + ((Object) Z1.v.c(Z1.u.d(j12)))).toString());
    }

    public static void b(InterfaceC8846f interfaceC8846f) {
        if (interfaceC8846f != null) {
            try {
                interfaceC8846f.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final long c(double d11) {
        return f((float) d11, 4294967296L);
    }

    public static final long d(int i11) {
        return f(i11, 4294967296L);
    }

    public static final boolean e(long j11) {
        int i11 = Z1.u.f35335d;
        return (j11 & 1095216660480L) == 0;
    }

    public static final long f(float f7, long j11) {
        long floatToIntBits = j11 | (Float.floatToIntBits(f7) & 4294967295L);
        int i11 = Z1.u.f35335d;
        return floatToIntBits;
    }
}
