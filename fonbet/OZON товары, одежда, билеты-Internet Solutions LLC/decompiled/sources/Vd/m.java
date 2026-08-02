package Vd;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;

/* loaded from: classes.dex */
public abstract class m {
    public abstract void a(@NotNull InterfaceC9836b interfaceC9836b);

    protected abstract void b(@NotNull InterfaceC9836b interfaceC9836b, @NotNull InterfaceC9836b interfaceC9836b2);

    public void c(@NotNull InterfaceC9836b member, @NotNull Collection overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.S(overridden);
    }
}
