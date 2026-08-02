package b1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5499b {
    @NotNull
    public static final C5517t a(@NotNull Function2 function2, @NotNull Function1 function1) {
        C5498a c5498a = new C5498a(function2);
        Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        U.g(1, function1);
        int i11 = C5516s.f55469b;
        return new C5517t(c5498a, function1);
    }
}
