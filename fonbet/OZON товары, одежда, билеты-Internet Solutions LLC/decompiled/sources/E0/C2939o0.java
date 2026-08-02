package E0;

import k1.C7459e;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2939o0 {
    private static final float a(long j11, C7460f c7460f) {
        if (I0.B0.c(j11, c7460f)) {
            return 0.0f;
        }
        float f7 = C7459e.f(C7459e.j(c7460f.s(), j11));
        if (f7 >= Float.MAX_VALUE) {
            f7 = Float.MAX_VALUE;
        }
        float f11 = C7459e.f(C7459e.j(c7460f.t(), j11));
        if (f11 < f7) {
            f7 = f11;
        }
        float f12 = C7459e.f(C7459e.j(c7460f.j(), j11));
        if (f12 < f7) {
            f7 = f12;
        }
        float f13 = C7459e.f(C7459e.j(c7460f.k(), j11));
        return f13 < f7 ? f13 : f7;
    }

    public static final int b(long j11, @NotNull C7460f c7460f, @NotNull C7460f c7460f2) {
        float a11 = a(j11, c7460f);
        float a12 = a(j11, c7460f2);
        if (a11 == a12) {
            return 0;
        }
        return a11 < a12 ? -1 : 1;
    }
}
