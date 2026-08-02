package W2;

import R2.C3918l;
import R2.L;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* loaded from: classes.dex */
public final class e {
    @NotNull
    public static c a(S2.b bVar, @NotNull List migrations, @NotNull M scope, @NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        L storage = new L(new d(produceFile));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(new c(C3918l.a(storage, bVar, migrations, scope)));
    }
}
