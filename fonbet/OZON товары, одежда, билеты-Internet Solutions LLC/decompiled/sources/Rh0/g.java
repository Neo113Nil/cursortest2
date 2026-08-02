package Rh0;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g {
    @NotNull
    public static final <T> CompletableFuture<T> a(@NotNull final CompletableFuture<T> completeWithNullOnTimeout, long j11, @NotNull ScheduledThreadPoolExecutor executor) {
        Intrinsics.checkNotNullParameter(completeWithNullOnTimeout, "$this$completeWithNullOnTimeout");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final CompletableFuture completableFuture = new CompletableFuture();
        executor.schedule(new Runnable() { // from class: Rh0.f
            @Override // java.lang.Runnable
            public final void run() {
                CompletableFuture completableFuture2 = completeWithNullOnTimeout;
                if (completableFuture2.isDone() || completableFuture2.isCancelled()) {
                    return;
                }
                completableFuture.complete(null);
            }
        }, kotlin.time.b.h(j11), TimeUnit.MILLISECONDS);
        CompletableFuture<T> applyToEither = completeWithNullOnTimeout.applyToEither((CompletionStage) completableFuture, Function.identity());
        Intrinsics.checkNotNullExpressionValue(applyToEither, "applyToEither(...)");
        return applyToEither;
    }
}
