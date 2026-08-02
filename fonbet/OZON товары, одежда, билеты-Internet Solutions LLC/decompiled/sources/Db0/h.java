package Db0;

import We.B;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class h implements B {
    @NotNull
    public abstract L a(@NotNull B.a aVar);

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Fb0.h.c();
        return a(chain);
    }
}
