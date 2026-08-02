package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes10.dex */
public final class m extends g<Float> {
    public m(float f7) {
        super(Float.valueOf(f7));
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y x11 = module.n().x();
        Intrinsics.checkNotNullExpressionValue(x11, "getFloatType(...)");
        return x11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().floatValue() + ".toFloat()";
    }
}
