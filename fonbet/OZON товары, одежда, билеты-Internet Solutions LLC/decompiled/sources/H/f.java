package H;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes8.dex */
final class f implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f10344b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f10345a = Executors.newSingleThreadExecutor(new a());

    final class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    f() {
    }

    static Executor a() {
        if (f10344b != null) {
            return f10344b;
        }
        synchronized (f.class) {
            try {
                if (f10344b == null) {
                    f10344b = new f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10344b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f10345a.execute(runnable);
    }
}
