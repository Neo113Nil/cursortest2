package Y5;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static final long f34592b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f34593c;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f34594a;

    /* renamed from: Y5.a$a, reason: collision with other inner class name */
    public static final class C0635a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34595a;

        /* renamed from: b, reason: collision with root package name */
        private int f34596b;

        /* renamed from: c, reason: collision with root package name */
        private int f34597c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        private ThreadFactory f34598d = new b();

        /* renamed from: e, reason: collision with root package name */
        private String f34599e;

        C0635a(boolean z11) {
            this.f34595a = z11;
        }

        public final a a() {
            if (!TextUtils.isEmpty(this.f34599e)) {
                return new a(new ThreadPoolExecutor(this.f34596b, this.f34597c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new c(this.f34598d, this.f34599e, this.f34595a)));
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f34599e);
        }

        public final void b(String str) {
            this.f34599e = str;
        }

        public final void c(int i11) {
            this.f34596b = i11;
            this.f34597c = i11;
        }
    }

    private static final class b implements ThreadFactory {

        /* renamed from: Y5.a$b$a, reason: collision with other inner class name */
        final class C0636a extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new C0636a(runnable);
        }
    }

    private static final class c implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f34600a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34601b;

        /* renamed from: c, reason: collision with root package name */
        final d f34602c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f34603d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f34604e;

        /* renamed from: Y5.a$c$a, reason: collision with other inner class name */
        final class RunnableC0637a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f34605a;

            RunnableC0637a(Runnable runnable) {
                this.f34605a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                if (cVar.f34603d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f34605a.run();
                } catch (Throwable th2) {
                    ((d.C0638a) cVar.f34602c).getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                    }
                }
            }
        }

        c(ThreadFactory threadFactory, String str, boolean z11) {
            d dVar = d.f34607a;
            this.f34604e = new AtomicInteger();
            this.f34600a = threadFactory;
            this.f34601b = str;
            this.f34602c = dVar;
            this.f34603d = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            RunnableC0637a runnableC0637a = new RunnableC0637a(runnable);
            ((b) this.f34600a).getClass();
            b.C0636a c0636a = new b.C0636a(runnableC0637a);
            c0636a.setName("glide-" + this.f34601b + "-thread-" + this.f34604e.getAndIncrement());
            return c0636a;
        }
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f34607a = new C0638a();

        /* renamed from: Y5.a$d$a, reason: collision with other inner class name */
        final class C0638a implements d {
        }
    }

    a(ThreadPoolExecutor threadPoolExecutor) {
        this.f34594a = threadPoolExecutor;
    }

    public static a a() {
        if (f34593c == 0) {
            f34593c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i11 = f34593c >= 4 ? 2 : 1;
        C0635a c0635a = new C0635a(true);
        c0635a.c(i11);
        c0635a.b("animation");
        return c0635a.a();
    }

    public static a b() {
        C0635a c0635a = new C0635a(true);
        c0635a.c(1);
        c0635a.b("disk-cache");
        return c0635a.a();
    }

    public static a c() {
        C0635a c0635a = new C0635a(false);
        if (f34593c == 0) {
            f34593c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        c0635a.c(f34593c);
        c0635a.b("source");
        return c0635a.a();
    }

    public static a d() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f34592b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new c(new b(), "source-unlimited", false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f34594a.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f34594a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f34594a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f34594a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f34594a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f34594a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f34594a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.f34594a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.f34594a.submit(runnable);
    }

    public final String toString() {
        return this.f34594a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f34594a.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f34594a.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t2) {
        return this.f34594a.submit(runnable, t2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f34594a.submit(callable);
    }
}
