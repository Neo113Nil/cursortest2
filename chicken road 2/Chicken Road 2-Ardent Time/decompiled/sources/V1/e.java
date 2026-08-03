package V1;

/* loaded from: classes.dex */
public class e extends V1.y {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f1753h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.locks.Condition f1754i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f1755j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f1756k;

    /* renamed from: l, reason: collision with root package name */
    public static V1.e f1757l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1758e;

    /* renamed from: f, reason: collision with root package name */
    public V1.e f1759f;

    /* renamed from: g, reason: collision with root package name */
    public long f1760g;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        f1753h = reentrantLock;
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.i.d(newCondition, "lock.newCondition()");
        f1754i = newCondition;
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        f1755j = millis;
        f1756k = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        V1.e eVar;
        long j2 = this.f1803c;
        boolean z2 = this.f1801a;
        if (j2 != 0 || z2) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = f1753h;
            reentrantLock.lock();
            try {
                if (this.f1758e) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit");
                }
                this.f1758e = true;
                if (f1757l == null) {
                    f1757l = new V1.e();
                    V1.b bVar = new V1.b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = java.lang.System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f1760g = java.lang.Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f1760g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new java.lang.AssertionError();
                    }
                    this.f1760g = c();
                }
                long j3 = this.f1760g - nanoTime;
                V1.e eVar2 = f1757l;
                kotlin.jvm.internal.i.b(eVar2);
                while (true) {
                    eVar = eVar2.f1759f;
                    if (eVar == null || j3 < eVar.f1760g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f1759f = eVar;
                eVar2.f1759f = this;
                if (eVar2 == f1757l) {
                    f1754i.signal();
                }
                reentrantLock.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = f1753h;
        reentrantLock.lock();
        try {
            if (!this.f1758e) {
                return false;
            }
            this.f1758e = false;
            V1.e eVar = f1757l;
            while (eVar != null) {
                V1.e eVar2 = eVar.f1759f;
                if (eVar2 == this) {
                    eVar.f1759f = this.f1759f;
                    this.f1759f = null;
                    return false;
                }
                eVar = eVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
