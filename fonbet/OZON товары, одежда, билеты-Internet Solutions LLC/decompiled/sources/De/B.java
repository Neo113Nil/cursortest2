package De;

import E0.C2942q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B {
    public static final int a() {
        return C.a();
    }

    public static final long b(long j11, long j12, long j13, @NotNull String str) {
        String c11 = c(str);
        if (c11 == null) {
            return j11;
        }
        Long y02 = kotlin.text.h.y0(c11);
        if (y02 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + c11 + '\'').toString());
        }
        long longValue = y02.longValue();
        if (j12 <= longValue && longValue <= j13) {
            return longValue;
        }
        StringBuilder d11 = C2942q.d(j12, "System property '", str, "' should be in range ");
        C2942q.f(d11, "..", j13, ", but is '");
        d11.append(longValue);
        d11.append('\'');
        throw new IllegalStateException(d11.toString().toString());
    }

    public static final String c(@NotNull String str) {
        int i11 = C.f6601b;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static int d(int i11, int i12, String str) {
        return (int) b(i11, 1, (i12 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }
}
