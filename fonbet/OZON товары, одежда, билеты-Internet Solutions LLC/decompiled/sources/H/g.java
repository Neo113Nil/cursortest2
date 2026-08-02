package H;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
final class g implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f10346b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f10347a = Executors.newFixedThreadPool(2, new a());

    final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f10348a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_io_" + this.f10348a.getAndIncrement());
            return thread;
        }
    }

    g() {
    }

    static Executor a() {
        if (f10346b != null) {
            return f10346b;
        }
        synchronized (g.class) {
            try {
                if (f10346b == null) {
                    f10346b = new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10346b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f10347a.execute(runnable);
    }
}
