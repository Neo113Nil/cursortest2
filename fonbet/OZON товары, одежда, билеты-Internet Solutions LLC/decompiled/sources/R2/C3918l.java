package R2;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: R2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3918l {
    @NotNull
    public static C3922p a(@NotNull h0 storage, S2.b bVar, @NotNull List migrations, @NotNull xe.M scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        InterfaceC3910d interfaceC3910d = bVar;
        if (bVar == null) {
            interfaceC3910d = new S2.a();
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new C3922p(storage, C7714v.a0(new C3913g(migrations, null)), interfaceC3910d, scope);
    }
}
