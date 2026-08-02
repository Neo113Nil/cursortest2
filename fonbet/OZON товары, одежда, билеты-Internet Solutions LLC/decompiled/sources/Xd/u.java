package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes10.dex */
public final class u extends r<Long> {
    public u(long j11) {
        super(Long.valueOf(j11));
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y A11 = module.n().A();
        Intrinsics.checkNotNullExpressionValue(A11, "getLongType(...)");
        return A11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().longValue() + ".toLong()";
    }
}
