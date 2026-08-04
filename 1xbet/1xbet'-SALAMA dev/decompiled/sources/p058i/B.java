package p058i;

import K5.a;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13611a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13612b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f13613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f13614d;

    public B(C c3) {
        this.f13613c = c3;
    }

    public final void a() {
        synchronized (this.f13611a) {
            try {
                Runnable runnable = (Runnable) this.f13612b.poll();
                this.f13614d = runnable;
                if (runnable != null) {
                    this.f13613c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f13611a) {
            try {
                this.f13612b.add(new a(16, this, runnable));
                if (this.f13614d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
