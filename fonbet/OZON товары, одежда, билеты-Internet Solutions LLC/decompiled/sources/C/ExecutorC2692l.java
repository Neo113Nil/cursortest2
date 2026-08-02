package C;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: C.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ExecutorC2692l implements Executor {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f4201c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f4202a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private ThreadPoolExecutor f4203b;

    /* renamed from: C.l$a */
    final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f4204a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.f4204a.getAndIncrement());
            return thread;
        }
    }

    public ExecutorC2692l() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f4201c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC2691k());
        this.f4203b = threadPoolExecutor;
    }

    final void a(@NonNull androidx.camera.core.impl.G g10) {
        ThreadPoolExecutor threadPoolExecutor;
        g10.getClass();
        synchronized (this.f4202a) {
            try {
                if (this.f4203b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f4201c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC2691k());
                    this.f4203b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f4203b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int max = Math.max(1, g10.c().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        runnable.getClass();
        synchronized (this.f4202a) {
            this.f4203b.execute(runnable);
        }
    }
}
