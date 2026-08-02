package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9815F;

/* loaded from: classes10.dex */
public final class n extends r<Integer> {
    public n(int i11) {
        super(Integer.valueOf(i11));
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y z11 = module.n().z();
        Intrinsics.checkNotNullExpressionValue(z11, "getIntType(...)");
        return z11;
    }
}
