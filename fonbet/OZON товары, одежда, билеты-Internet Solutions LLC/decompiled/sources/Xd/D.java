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
public final class D extends E<Short> {
    public D(short s11) {
        super(Short.valueOf(s11));
    }

    @Override // Xd.g
    @NotNull
    public final N a(@NotNull InterfaceC9815F module) {
        Y q11;
        Intrinsics.checkNotNullParameter(module, "module");
        InterfaceC9839e a11 = C9856v.a(module, s.a.f81890T);
        return (a11 == null || (q11 = a11.q()) == null) ? le.l.c(le.k.NOT_FOUND_UNSIGNED_TYPE, "UShort") : q11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().intValue() + ".toUShort()";
    }
}
