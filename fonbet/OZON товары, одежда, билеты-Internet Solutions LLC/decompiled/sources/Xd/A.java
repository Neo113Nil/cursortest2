package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9839e;

/* loaded from: classes10.dex */
public final class A extends E<Byte> {
    public A(byte b11) {
        super(Byte.valueOf(b11));
    }

    @Override // Xd.g
    @NotNull
    public final N a(@NotNull InterfaceC9815F module) {
        Y q11;
        Intrinsics.checkNotNullParameter(module, "module");
        InterfaceC9839e a11 = C9856v.a(module, s.a.f81889S);
        return (a11 == null || (q11 = a11.q()) == null) ? le.l.c(le.k.NOT_FOUND_UNSIGNED_TYPE, "UByte") : q11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().intValue() + ".toUByte()";
    }
}
