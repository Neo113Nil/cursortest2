package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes.dex */
public final class x extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull String value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y N11 = module.n().N();
        Intrinsics.checkNotNullExpressionValue(N11, "getStringType(...)");
        return N11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("\""), b(), '\"');
    }
}
