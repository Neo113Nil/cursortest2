package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import com.google.common.util.concurrent.m;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class w {

    public static class a extends e {
        public final ExecutorService a;

        public a(ExecutorService executorService) {
            executorService.getClass();
            this.a = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.a + "]";
        }
    }

    public static v a(ExecutorService executorService) {
        return executorService instanceof v ? (v) executorService : executorService instanceof ScheduledExecutorService ? new b((ScheduledExecutorService) executorService) : new a(executorService);
    }

    public static final class b extends a implements ScheduledExecutorService {
        public final ScheduledExecutorService b;

        public static final class a<V> extends m.a<V> implements ScheduledFuture {
            public final ScheduledFuture<?> b;

            public a(com.google.common.util.concurrent.a aVar, ScheduledFuture scheduledFuture) {
                super(aVar);
                this.b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.l, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.b.cancel(z);
                }
                return cancel;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Delayed delayed) {
                return this.b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.b.getDelay(timeUnit);
            }
        }

        /* renamed from: com.google.common.util.concurrent.w$b$b, reason: collision with other inner class name */
        public static final class RunnableC0140b extends a.i<Void> implements Runnable {
            public final Runnable a;

            public RunnableC0140b(Runnable runnable) {
                runnable.getClass();
                this.a = runnable;
            }

            @Override // com.google.common.util.concurrent.a
            public final String pendingToString() {
                return "task=[" + this.a + "]";
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    setException(th);
                    throw th;
                }
            }
        }

        public b(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.b = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            y yVar = new y(callable);
            return new a(yVar, this.b.schedule(yVar, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0140b runnableC0140b = new RunnableC0140b(runnable);
            return new a(runnableC0140b, this.b.scheduleAtFixedRate(runnableC0140b, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0140b runnableC0140b = new RunnableC0140b(runnable);
            return new a(runnableC0140b, this.b.scheduleWithFixedDelay(runnableC0140b, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            y yVar = new y(Executors.callable(runnable, null));
            return new a(yVar, this.b.schedule(yVar, j, timeUnit));
        }
    }
}
