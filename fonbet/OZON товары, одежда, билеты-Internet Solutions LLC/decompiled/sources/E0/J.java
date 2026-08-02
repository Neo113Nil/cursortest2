package E0;

/* loaded from: classes8.dex */
public final class J implements M7.a {
    public static final long b(long j11, long j12) {
        int f7;
        int h11 = K1.Q.h(j11);
        int g10 = K1.Q.g(j11);
        if (K1.Q.h(j12) >= K1.Q.g(j11) || K1.Q.h(j11) >= K1.Q.g(j12)) {
            if (g10 > K1.Q.h(j12)) {
                h11 -= K1.Q.f(j12);
                f7 = K1.Q.f(j12);
                g10 -= f7;
            }
        } else if (K1.Q.c(j12, j11)) {
            h11 = K1.Q.h(j12);
            g10 = h11;
        } else {
            if (K1.Q.c(j11, j12)) {
                f7 = K1.Q.f(j12);
            } else {
                int h12 = K1.Q.h(j12);
                if (h11 >= K1.Q.g(j12) || h12 > h11) {
                    g10 = K1.Q.h(j12);
                } else {
                    h11 = K1.Q.h(j12);
                    f7 = K1.Q.f(j12);
                }
            }
            g10 -= f7;
        }
        return K1.S.a(h11, g10);
    }

    @Override // M7.c
    public /* synthetic */ Object a() {
        return new M7.m("IntegrityService");
    }
}
