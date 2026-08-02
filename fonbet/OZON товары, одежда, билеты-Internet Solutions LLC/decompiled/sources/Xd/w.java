package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes10.dex */
public final class w extends r<Short> {
    public w(short s11) {
        super(Short.valueOf(s11));
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y L11 = module.n().L();
        Intrinsics.checkNotNullExpressionValue(L11, "getShortType(...)");
        return L11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().intValue() + ".toShort()";
    }
}
