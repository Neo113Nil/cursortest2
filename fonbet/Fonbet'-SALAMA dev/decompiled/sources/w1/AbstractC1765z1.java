package w1;

/* renamed from: w1.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1765z1 extends AbstractC1736p2 {

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f17944y = new ThreadLocal();

    /* renamed from: x, reason: collision with root package name */
    public Thread f17945x;

    @Override // w1.AbstractC1736p2
    public final void e(com.flurry.android.marketing.messaging.notification.b bVar) {
        synchronized (this) {
            if (this.f17945x == Thread.currentThread()) {
                bVar.run();
            } else {
                super.e(bVar);
            }
        }
    }

    @Override // w1.AbstractC1736p2
    public final boolean g(Runnable runnable) {
        ThreadLocal threadLocal;
        AbstractC1765z1 abstractC1765z1;
        Thread thread;
        synchronized (this) {
            threadLocal = f17944y;
            abstractC1765z1 = (AbstractC1765z1) threadLocal.get();
            threadLocal.set(this);
            thread = this.f17945x;
            this.f17945x = Thread.currentThread();
        }
        try {
            f(runnable);
            synchronized (this) {
                this.f17945x = thread;
                threadLocal.set(abstractC1765z1);
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                this.f17945x = thread;
                f17944y.set(abstractC1765z1);
                throw th;
            }
        }
    }
}
