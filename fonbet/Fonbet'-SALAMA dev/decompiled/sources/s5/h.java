package s5;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f16200a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f16201b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16202c = new AtomicBoolean(false);

    public h(ExecutorService executorService) {
        this.f16200a = executorService;
    }

    @Override // s5.d
    public final void a(RunnableC1600b runnableC1600b) {
        this.f16201b.add(runnableC1600b);
        this.f16200a.execute(new g(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f16200a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f16201b;
        AtomicBoolean atomicBoolean = this.f16202c;
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
