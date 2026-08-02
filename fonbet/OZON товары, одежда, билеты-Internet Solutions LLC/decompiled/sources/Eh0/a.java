package Eh0;

import Gh0.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final d a(int i11) {
        d dVar = d.DELIVERY;
        if (i11 == dVar.a()) {
            return dVar;
        }
        d dVar2 = d.OPEN;
        if (i11 == dVar2.a()) {
            return dVar2;
        }
        throw new IllegalStateException("Unsupported push status");
    }

    public static final int b(@NotNull d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.a();
    }
}
