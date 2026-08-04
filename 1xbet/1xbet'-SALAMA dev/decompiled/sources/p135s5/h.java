package p135s5;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f16206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f16207b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16208c = new AtomicBoolean(false);

    public h(ExecutorService executorService) {
        this.f16206a = executorService;
    }

    @Override // p135s5.d
    public final void a(b bVar) {
        this.f16207b.add(bVar);
        this.f16206a.execute(new g(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f16206a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f16207b;
        AtomicBoolean atomicBoolean = this.f16208c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new g(this, 1));
                }
            }
        }
    }
}
