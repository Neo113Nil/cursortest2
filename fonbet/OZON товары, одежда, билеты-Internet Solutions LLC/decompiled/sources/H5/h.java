package H5;

import K1.Q;
import K1.S;

/* loaded from: classes8.dex */
public final class h implements u5.f {
    public static final long b(long j11, long j12) {
        int f7;
        int h11 = Q.h(j11);
        int g10 = Q.g(j11);
        if (Q.h(j12) >= Q.g(j11) || Q.h(j11) >= Q.g(j12)) {
            if (g10 > Q.h(j12)) {
                h11 -= Q.f(j12);
                f7 = Q.f(j12);
                g10 -= f7;
            }
        } else if (Q.c(j12, j11)) {
            h11 = Q.h(j12);
            g10 = h11;
        } else {
            if (Q.c(j11, j12)) {
                f7 = Q.f(j12);
            } else {
                int h12 = Q.h(j12);
                if (h11 >= Q.g(j12) || h12 > h11) {
                    g10 = Q.h(j12);
                } else {
                    h11 = Q.h(j12);
                    f7 = Q.f(j12);
                }
            }
            g10 -= f7;
        }
        return S.a(h11, g10);
    }

    @Override // u5.f
    public boolean a() {
        return true;
    }

    @Override // u5.f
    public void shutdown() {
    }
}
