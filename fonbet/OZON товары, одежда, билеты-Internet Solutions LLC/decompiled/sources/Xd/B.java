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
public final class B extends E<Integer> {
    public B(int i11) {
        super(Integer.valueOf(i11));
    }

    @Override // Xd.g
    @NotNull
    public final N a(@NotNull InterfaceC9815F module) {
        Y q11;
        Intrinsics.checkNotNullParameter(module, "module");
        InterfaceC9839e a11 = C9856v.a(module, s.a.f81891U);
        return (a11 == null || (q11 = a11.q()) == null) ? le.l.c(le.k.NOT_FOUND_UNSIGNED_TYPE, "UInt") : q11;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        return b().intValue() + ".toUInt()";
    }
}
