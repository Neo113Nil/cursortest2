package Q1;

import K1.C3422b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class L {
    @NotNull
    public static final C3422b a(@NotNull K k11) {
        C3422b c11 = k11.c();
        long e11 = k11.e();
        c11.getClass();
        return c11.subSequence(K1.Q.h(e11), K1.Q.g(e11));
    }

    @NotNull
    public static final C3422b b(@NotNull K k11, int i11) {
        return k11.c().subSequence(K1.Q.g(k11.e()), Math.min(K1.Q.g(k11.e()) + i11, k11.f().length()));
    }

    @NotNull
    public static final C3422b c(@NotNull K k11, int i11) {
        return k11.c().subSequence(Math.max(0, K1.Q.h(k11.e()) - i11), K1.Q.h(k11.e()));
    }
}
