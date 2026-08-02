package P4;

import O4.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g implements c.InterfaceC0397c {
    @Override // O4.c.InterfaceC0397c
    @NotNull
    public final O4.c a(@NotNull c.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new d(configuration.f19937a, configuration.f19938b, configuration.f19939c, configuration.f19940d, configuration.f19941e);
    }
}
