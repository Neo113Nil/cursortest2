package S6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class p implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f25937a;

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f25938a;

        a(Runnable runnable) {
            this.f25938a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f25938a.run();
            } catch (Exception e11) {
                W6.a.c("Executor", "Background execution failure.", e11);
            }
        }
    }

    p(ExecutorService executorService) {
        this.f25937a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f25937a.execute(new a(runnable));
    }
}
