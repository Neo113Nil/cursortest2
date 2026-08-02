package Dc;

import Kc.C3493a;

/* loaded from: classes.dex */
public final class j extends AbstractC2850a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f6321b = Thread.currentThread();
        try {
            this.f6320a.run();
            this.f6321b = null;
        } catch (Throwable th2) {
            this.f6321b = null;
            lazySet(AbstractC2850a.f6318c);
            C3493a.f(th2);
        }
    }
}
