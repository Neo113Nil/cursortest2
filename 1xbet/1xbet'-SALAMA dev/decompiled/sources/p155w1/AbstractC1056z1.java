package p155w1;

import com.flurry.android.marketing.messaging.notification.b;

/* JADX INFO: renamed from: w1.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1056z1 extends AbstractC1027p2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f17950y = new ThreadLocal();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Thread f17951x;

    @Override // p155w1.AbstractC1027p2
    public final void e(b bVar) {
        synchronized (this) {
            if (this.f17951x == Thread.currentThread()) {
                bVar.run();
            } else {
                super.e(bVar);
            }
        }
    }

    @Override // p155w1.AbstractC1027p2
    public final boolean g(Runnable runnable) {
        ThreadLocal threadLocal;
        AbstractC1056z1 abstractC1056z1;
        Thread thread;
        synchronized (this) {
            threadLocal = f17950y;
            abstractC1056z1 = (AbstractC1056z1) threadLocal.get();
            threadLocal.set(this);
            thread = this.f17951x;
            this.f17951x = Thread.currentThread();
        }
        try {
            f(runnable);
            synchronized (this) {
                this.f17951x = thread;
                threadLocal.set(abstractC1056z1);
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                this.f17951x = thread;
                f17950y.set(abstractC1056z1);
                throw th;
            }
        }
    }
}
