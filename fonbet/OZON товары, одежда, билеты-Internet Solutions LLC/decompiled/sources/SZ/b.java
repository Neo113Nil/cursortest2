package SZ;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ExecutorService f26075a;

    public b(@NotNull ExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f26075a = executor;
    }

    @Override // SZ.a
    public final <V> void execute(@NotNull Callable<V> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f26075a.submit(callable);
    }
}
