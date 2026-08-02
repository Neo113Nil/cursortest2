package Sc;

import Sc.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s {
    @NotNull
    public static final r.b a(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new r.b(exception);
    }

    public static final void b(@NotNull Object obj) {
        if (obj instanceof r.b) {
            throw ((r.b) obj).f26107a;
        }
    }
}
