package Z1;

import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p {
    @NotNull
    public static final o a(long j11, long j12) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new o(i11, i12, ((int) (j12 >> 32)) + i11, ((int) (j12 & 4294967295L)) + i12);
    }

    @NotNull
    public static final o b(@NotNull C7460f c7460f) {
        return new o(Math.round(c7460f.n()), Math.round(c7460f.q()), Math.round(c7460f.o()), Math.round(c7460f.h()));
    }
}
