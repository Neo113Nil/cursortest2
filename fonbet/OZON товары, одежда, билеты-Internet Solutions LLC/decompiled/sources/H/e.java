package H;

import I.k;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.m;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
final class e extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f10334a;

    final class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return h.a();
            }
            if (Looper.myLooper() != null) {
                return new e(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    final class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f10335a;

        b(Runnable runnable) {
            this.f10335a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            this.f10335a.run();
            return null;
        }
    }

    private static class c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<b.a<V>> f10336a = new AtomicReference<>(null);

        /* renamed from: b, reason: collision with root package name */
        private final long f10337b;

        /* renamed from: c, reason: collision with root package name */
        private final Callable<V> f10338c;

        /* renamed from: d, reason: collision with root package name */
        private final m<V> f10339d;

        final class a implements b.c<V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f10340a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f10341b;

            /* renamed from: H.e$c$a$a, reason: collision with other inner class name */
            final class RunnableC0213a implements Runnable {
                RunnableC0213a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    if (c.this.f10336a.getAndSet(null) != null) {
                        aVar.f10340a.removeCallbacks(c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f10340a = handler;
                this.f10341b = callable;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object c(@NonNull b.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC0213a(), d.a());
                c.this.f10336a.set(aVar);
                return "HandlerScheduledFuture-" + this.f10341b.toString();
            }
        }

        c(Handler handler, long j11, Callable<V> callable) {
            this.f10337b = j11;
            this.f10338c = callable;
            this.f10339d = androidx.concurrent.futures.b.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z11) {
            return this.f10339d.cancel(z11);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return this.f10339d.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f10337b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f10339d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f10339d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            b.a andSet = this.f10336a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f10338c.call());
                } catch (Exception e11) {
                    andSet.e(e11);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public final V get(long j11, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f10339d.get(j11, timeUnit);
        }
    }

    static {
        new a();
    }

    e(@NonNull Handler handler) {
        this.f10334a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j11, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        Handler handler = this.f10334a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
        return schedule(new b(runnable), j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final ScheduledFuture<?> scheduleAtFixedRate(@NonNull Runnable runnable, long j11, long j12, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final ScheduledFuture<?> scheduleWithFixedDelay(@NonNull Runnable runnable, long j11, long j12, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final <V> ScheduledFuture<V> schedule(@NonNull Callable<V> callable, long j11, @NonNull TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j11, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f10334a;
        c cVar = new c(handler, convert, callable);
        if (handler.postAtTime(cVar, convert)) {
            return cVar;
        }
        return k.g(new RejectedExecutionException(handler + " is shutting down"));
    }
}
