package A1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    public static final void a(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final void c(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
