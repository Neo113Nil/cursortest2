package n1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l4.x;

/* renamed from: n1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1453h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f15312b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f15314d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f15311a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f15313c = new Object();

    public ExecutorC1453h(ExecutorService executorService) {
        this.f15312b = executorService;
    }

    public final void a() {
        synchronized (this.f15313c) {
            try {
                Runnable runnable = (Runnable) this.f15311a.poll();
                this.f15314d = runnable;
                if (runnable != null) {
                    this.f15312b.execute(this.f15314d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f15313c) {
            try {
                this.f15311a.add(new x(3, this, runnable, false));
                if (this.f15314d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
