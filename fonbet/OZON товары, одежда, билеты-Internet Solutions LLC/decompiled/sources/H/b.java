package H;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class b implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f10330b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f10331a = Executors.newFixedThreadPool(2, new a());

    final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f10332a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new H.a(runnable, 0));
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_audio_" + this.f10332a.getAndIncrement());
            return thread;
        }
    }

    static Executor a() {
        if (f10330b != null) {
            return f10330b;
        }
        synchronized (b.class) {
            try {
                if (f10330b == null) {
                    f10330b = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10330b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f10331a.execute(runnable);
    }
}
