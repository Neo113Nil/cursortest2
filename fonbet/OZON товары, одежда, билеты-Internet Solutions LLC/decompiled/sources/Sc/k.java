package Sc;

import Sc.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k extends m {
    @NotNull
    public static InterfaceC4008j a(@NotNull n mode, @NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i11 = l.a.f26104a[mode.ordinal()];
        int i12 = 2;
        if (i11 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new u(initializer, defaultConstructorMarker, i12, defaultConstructorMarker);
        }
        if (i11 == 2) {
            return new t(initializer);
        }
        if (i11 == 3) {
            return new I(initializer);
        }
        throw new o();
    }

    @NotNull
    public static InterfaceC4008j b(@NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new u(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    @NotNull
    public static InterfaceC4008j c(C8475a c8475a, @NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new u(c8475a, initializer);
    }
}
