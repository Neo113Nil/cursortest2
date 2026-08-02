package E0;

import k1.C7459e;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a1 {
    public static final long a(long j11, @NotNull C7460f c7460f) {
        return P9.a.a(C7459e.g(j11) < c7460f.n() ? c7460f.n() : C7459e.g(j11) > c7460f.o() ? c7460f.o() : C7459e.g(j11), C7459e.h(j11) < c7460f.q() ? c7460f.q() : C7459e.h(j11) > c7460f.h() ? c7460f.h() : C7459e.h(j11));
    }

    public static final long b(@NotNull Z0 z02, long j11) {
        C7459e c7459e;
        B1.B i11 = z02.i();
        if (i11 != null) {
            B1.B e11 = z02.e();
            if (e11 != null) {
                c7459e = C7459e.a((i11.I() && e11.I()) ? i11.W(e11, j11) : j11);
            } else {
                c7459e = null;
            }
            if (c7459e != null) {
                return c7459e.n();
            }
        }
        return j11;
    }
}
