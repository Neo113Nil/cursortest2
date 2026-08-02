package androidx.lifecycle;

import Sc.InterfaceC3999a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* loaded from: classes.dex */
public abstract class B implements xe.M {
    @NotNull
    public abstract AbstractC5434v a();

    @InterfaceC3999a
    @NotNull
    public final void b(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C10727i.c(this, null, null, new C5437y(this, block, null), 3);
    }

    @InterfaceC3999a
    @NotNull
    public final void c(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C10727i.c(this, null, null, new C5438z(this, block, null), 3);
    }

    @InterfaceC3999a
    @NotNull
    public final void d(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C10727i.c(this, null, null, new A(this, block, null), 3);
    }
}
