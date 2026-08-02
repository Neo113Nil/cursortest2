package S0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3942b {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final void b(@NotNull C3969l c3969l, @NotNull Function2 function2) {
        Intrinsics.g(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        kotlin.jvm.internal.U.g(2, function2);
        function2.invoke(c3969l, 1);
    }
}
