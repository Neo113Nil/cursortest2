package Xc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {
    @NotNull
    public static final <E extends Enum<E>> a<E> a(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new c(entries);
    }
}
