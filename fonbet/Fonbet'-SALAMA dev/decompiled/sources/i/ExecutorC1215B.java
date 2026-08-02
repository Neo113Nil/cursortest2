package i;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: i.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1215B implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13605a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13606b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorC1216C f13607c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f13608d;

    public ExecutorC1215B(ExecutorC1216C executorC1216C) {
        this.f13607c = executorC1216C;
    }

    public final void a() {
        synchronized (this.f13605a) {
            try {
                Runnable runnable = (Runnable) this.f13606b.poll();
                this.f13608d = runnable;
                if (runnable != null) {
                    this.f13607c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f13605a) {
            try {
                this.f13606b.add(new K5.a(16, this, runnable));
                if (this.f13608d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
