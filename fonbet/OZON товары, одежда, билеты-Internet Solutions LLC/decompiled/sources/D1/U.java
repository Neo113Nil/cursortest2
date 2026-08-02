package D1;

import B1.AbstractC2531a;
import D1.L;
import java.util.Map;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class U extends AbstractC2789a {
    public U(@NotNull L.a aVar) {
        super(aVar);
    }

    @Override // D1.AbstractC2789a
    protected final long c(@NotNull AbstractC2810k0 abstractC2810k0, long j11) {
        Y c22 = abstractC2810k0.c2();
        Intrinsics.f(c22);
        long l12 = c22.l1();
        return C7459e.k(P9.a.a((int) (l12 >> 32), (int) (l12 & 4294967295L)), j11);
    }

    @Override // D1.AbstractC2789a
    @NotNull
    protected final Map<AbstractC2531a, Integer> d(@NotNull AbstractC2810k0 abstractC2810k0) {
        Y c22 = abstractC2810k0.c2();
        Intrinsics.f(c22);
        return c22.g1().s();
    }

    @Override // D1.AbstractC2789a
    protected final int h(@NotNull AbstractC2810k0 abstractC2810k0, @NotNull AbstractC2531a abstractC2531a) {
        Y c22 = abstractC2810k0.c2();
        Intrinsics.f(c22);
        return c22.E(abstractC2531a);
    }
}
