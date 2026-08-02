package K3;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ExecutorService f15167a;

    a(ExecutorService executorService, Ej.b bVar) {
        this.f15167a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15167a.execute(runnable);
    }

    @Override // K3.b
    public final void release() {
        this.f15167a.shutdown();
    }
}
