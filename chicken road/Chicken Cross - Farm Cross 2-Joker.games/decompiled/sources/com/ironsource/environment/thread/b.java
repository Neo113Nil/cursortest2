package com.ironsource.environment.thread;

import com.ironsource.C4483je;
import com.ironsource.environment.thread.b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class b implements ScheduledExecutorService {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<Thread> f8177a;
    private final ScheduledExecutorService b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(final String threadName) {
            Intrinsics.checkNotNullParameter(threadName, "threadName");
            final AtomicReference atomicReference = new AtomicReference();
            return new b(atomicReference, new C4483je(1, new ThreadFactory() { // from class: com.ironsource.environment.thread.b$a$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread a2;
                    a2 = b.a.a(threadName, atomicReference, runnable);
                    return a2;
                }
            }), null);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread a(String threadName, AtomicReference ref, Runnable runnable) {
            Intrinsics.checkNotNullParameter(threadName, "$threadName");
            Intrinsics.checkNotNullParameter(ref, "$ref");
            Thread thread = new Thread(runnable, threadName);
            ref.set(thread);
            return thread;
        }
    }

    /* renamed from: com.ironsource.environment.thread.b$b, reason: collision with other inner class name */
    /* synthetic */ class C1326b extends FunctionReferenceImpl implements Function0<Unit> {
        C1326b(Object obj) {
            super(0, obj, Runnable.class, "run", "run()V", 0);
        }

        public final void a() {
            ((Runnable) this.receiver).run();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomicReference, scheduledExecutorService);
    }

    public final boolean a() {
        return this.f8177a.get() == Thread.currentThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    public void close() {
        super.close();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.b.submit(runnable);
    }

    private b(AtomicReference<Thread> atomicReference, ScheduledExecutorService scheduledExecutorService) {
        this.f8177a = atomicReference;
        this.b = scheduledExecutorService;
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.ironsource.environment.thread.a aVar = runnable instanceof com.ironsource.environment.thread.a ? (com.ironsource.environment.thread.a) runnable : null;
        if (aVar == null) {
            aVar = com.ironsource.environment.thread.a.f8176a.a(new C1326b(runnable));
        }
        if (a()) {
            aVar.run();
        } else {
            execute(aVar);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.b.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.b.submit(callable);
    }
}
