package Hi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {
    @NotNull
    public static final d a(@NotNull c cVar, @NotNull h filter) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new d(cVar, filter);
    }
}
