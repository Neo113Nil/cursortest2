package Z1;

import k1.C7459e;

/* loaded from: classes.dex */
public final class n {
    public static final long a(int i11, int i12) {
        return (i12 & 4294967295L) | (i11 << 32);
    }

    public static final long b(long j11) {
        return (Math.round(C7459e.h(j11)) & 4294967295L) | (Math.round(C7459e.g(j11)) << 32);
    }
}
