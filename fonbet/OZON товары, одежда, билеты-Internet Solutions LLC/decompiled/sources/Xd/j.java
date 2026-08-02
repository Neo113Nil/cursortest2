package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes10.dex */
public final class j extends g<Double> {
    public j(double d11) {
        super(Double.valueOf(d11));
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y w11 = module.n().w();
        Intrinsics.checkNotNullExpressionValue(w11, "getDoubleType(...)");
        return w11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().doubleValue() + ".toDouble()";
    }
}
