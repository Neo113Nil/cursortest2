package p096n1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p083l4.x;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f15318b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Runnable f15320d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f15317a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15319c = new Object();

    public h(ExecutorService executorService) {
        this.f15318b = executorService;
    }

    public final void a() {
        synchronized (this.f15319c) {
            try {
                Runnable runnable = (Runnable) this.f15317a.poll();
                this.f15320d = runnable;
                if (runnable != null) {
                    this.f15318b.execute(this.f15320d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f15319c) {
            try {
                this.f15317a.add(new x(3, this, runnable, false));
                if (this.f15320d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
