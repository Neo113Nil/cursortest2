package s1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d extends u {

    /* renamed from: h, reason: collision with root package name */
    public static final long f6610h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f6611i;

    /* renamed from: j, reason: collision with root package name */
    public static d f6612j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6613e;

    /* renamed from: f, reason: collision with root package name */
    public d f6614f;

    /* renamed from: g, reason: collision with root package name */
    public long f6615g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f6610h = millis;
        f6611i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static d h() {
        d dVar = f6612j.f6614f;
        if (dVar == null) {
            long nanoTime = System.nanoTime();
            d.class.wait(f6610h);
            if (f6612j.f6614f != null || System.nanoTime() - nanoTime < f6611i) {
                return null;
            }
            return f6612j;
        }
        long nanoTime2 = dVar.f6615g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / 1000000;
            d.class.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
            return null;
        }
        f6612j.f6614f = dVar.f6614f;
        dVar.f6614f = null;
        return dVar;
    }

    public final void i() {
        d dVar;
        if (this.f6613e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long j2 = this.f6656c;
        boolean z2 = this.f6654a;
        if (j2 != 0 || z2) {
            this.f6613e = true;
            synchronized (d.class) {
                try {
                    if (f6612j == null) {
                        f6612j = new d();
                        c cVar = new c("Okio Watchdog");
                        cVar.setDaemon(true);
                        cVar.start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j2 != 0 && z2) {
                        this.f6615g = Math.min(j2, c() - nanoTime) + nanoTime;
                    } else if (j2 != 0) {
                        this.f6615g = j2 + nanoTime;
                    } else {
                        if (!z2) {
                            throw new AssertionError();
                        }
                        this.f6615g = c();
                    }
                    long j3 = this.f6615g - nanoTime;
                    d dVar2 = f6612j;
                    while (true) {
                        dVar = dVar2.f6614f;
                        if (dVar == null || j3 < dVar.f6615g - nanoTime) {
                            break;
                        } else {
                            dVar2 = dVar;
                        }
                    }
                    this.f6614f = dVar;
                    dVar2.f6614f = this;
                    if (dVar2 == f6612j) {
                        d.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void j(boolean z2) {
        if (k() && z2) {
            throw l(null);
        }
    }

    public final boolean k() {
        if (!this.f6613e) {
            return false;
        }
        this.f6613e = false;
        synchronized (d.class) {
            d dVar = f6612j;
            while (dVar != null) {
                d dVar2 = dVar.f6614f;
                if (dVar2 == this) {
                    dVar.f6614f = this.f6614f;
                    this.f6614f = null;
                    return false;
                }
                dVar = dVar2;
            }
            return true;
        }
    }

    public IOException l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}
