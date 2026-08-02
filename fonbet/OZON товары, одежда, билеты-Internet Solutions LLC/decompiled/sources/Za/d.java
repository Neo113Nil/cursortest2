package Za;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface d {

    public static final class a {
        @NotNull
        public static d a(@NotNull d dVar, @NotNull Object any) {
            Intrinsics.checkNotNullParameter(any, "any");
            String simpleName = any.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "any::class.java.simpleName");
            return dVar.c(simpleName);
        }
    }

    @NotNull
    d a(@NotNull Object obj);

    void b(@NotNull String str, Throwable th2);

    @NotNull
    d c(@NotNull String str);

    void d();

    void error(@NotNull String str, Throwable th2);

    void info(@NotNull String str);
}
