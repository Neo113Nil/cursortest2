package Pg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f22524a;

    public b(Executor executor) {
        Intrinsics.checkNotNullParameter("com.vk.id.tracking.tracer", "libraryPackageName");
        if (executor == null) {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            executor = Executors.newCachedThreadPool(new ThreadFactory() { // from class: Pg.a
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    AtomicInteger atomicTid = atomicInteger;
                    Intrinsics.checkNotNullParameter(atomicTid, "$atomicTid");
                    Intrinsics.checkNotNullParameter("com.vk.id.tracking.tracer", "$libraryPackageName");
                    return new Thread(runnable, Ej.b.a(atomicTid.getAndIncrement(), "tracer-io-com.vk.id.tracking.tracer-"));
                }
            });
            Intrinsics.checkNotNullExpressionValue(executor, "newCachedThreadPool {\n  …Name-$tid\")\n            }");
        }
        this.f22524a = executor;
    }

    @NotNull
    public final Executor a() {
        return this.f22524a;
    }
}
