package Wh0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f33872a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33873b = 0;

    @NotNull
    public static final void a(@NotNull Function0 callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        ExecutorService executor = f33872a;
        Intrinsics.checkNotNullExpressionValue(executor, "executor");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullExpressionValue(executor.submit(new b(callable)), "submit(...)");
    }
}
