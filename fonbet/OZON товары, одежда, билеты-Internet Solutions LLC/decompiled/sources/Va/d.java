package Va;

import J4.C;
import Wa.e;
import com.vk.knet.cornet.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f28486a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedBlockingDeque<a> f28487b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f28488c;

    public d(int i11) {
        this.f28487b = new LinkedBlockingDeque<>(i11);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new b());
        this.f28488c = newSingleThreadExecutor;
        if (newSingleThreadExecutor instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) newSingleThreadExecutor).allowCoreThreadTimeOut(true);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            LinkedBlockingDeque<a> linkedBlockingDeque = this.f28487b;
            TimeUnit unit = TimeUnit.MILLISECONDS;
            LinkedBlockingQueue workQueue = new LinkedBlockingQueue();
            ThreadFactory factory = new ThreadFactory() { // from class: Va.c
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return d.a(d.this, runnable);
                }
            };
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(workQueue, "workQueue");
            Intrinsics.checkNotNullParameter(factory, "factory");
            a aVar = new a(0, 1, 1000L, unit, workQueue, factory);
            new AtomicBoolean(true);
            aVar.allowCoreThreadTimeOut(true);
            linkedBlockingDeque.add(aVar);
        }
    }

    public static Thread a(d this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Thread(runnable, Ej.b.a(this$0.f28486a.getAndIncrement(), "Cronet-Requests-Executor-"));
    }

    public static void b(d this$0, a executor) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        LinkedBlockingDeque<a> linkedBlockingDeque = this$0.f28487b;
        linkedBlockingDeque.add(executor);
        e.a(b.a.EXEC_POOL, Ej.b.a(linkedBlockingDeque.size(), "recycle "));
    }

    @NotNull
    public final a c() {
        b.a aVar = b.a.EXEC_POOL;
        LinkedBlockingDeque<a> linkedBlockingDeque = this.f28487b;
        e.a(aVar, Ej.b.a(linkedBlockingDeque.size(), "obtain "));
        a takeLast = linkedBlockingDeque.takeLast();
        Intrinsics.checkNotNullExpressionValue(takeLast, "takeLast(...)");
        return takeLast;
    }

    public final void d(@NotNull a executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f28488c.execute(new C(this, executor, 1));
    }
}
