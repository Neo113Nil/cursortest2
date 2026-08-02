package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* renamed from: Xd.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4887d extends r<Byte> {
    public C4887d(byte b11) {
        super(Byte.valueOf(b11));
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y s11 = module.n().s();
        Intrinsics.checkNotNullExpressionValue(s11, "getByteType(...)");
        return s11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().intValue() + ".toByte()";
    }
}
