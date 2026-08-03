package V1;

/* loaded from: classes.dex */
public final class b extends java.lang.Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        V1.e a2;
        while (true) {
            try {
                reentrantLock = V1.e.f1753h;
                reentrantLock.lock();
                try {
                    a2 = u0.AbstractC0995a.a();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (java.lang.InterruptedException unused) {
            }
            if (a2 == V1.e.f1757l) {
                V1.e.f1757l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (a2 != null) {
                    a2.j();
                }
            }
        }
    }
}
