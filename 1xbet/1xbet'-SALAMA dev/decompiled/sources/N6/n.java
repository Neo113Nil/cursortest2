package N6;

import Y4.D;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends D {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ReentrantLock f4821m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f4823l;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f4821m = reentrantLock;
        t6.h.d(reentrantLock.newCondition(), "lock.newCondition()");
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    public n(Socket socket) {
    }

    public final boolean L0() {
        ReentrantLock reentrantLock = f4821m;
        reentrantLock.lock();
        try {
            if (!this.f4822k) {
                return false;
            }
            this.f4822k = false;
            n nVar = null;
            while (nVar != null) {
                n nVar2 = nVar.f4823l;
                if (nVar2 == this) {
                    nVar.f4823l = this.f4823l;
                    this.f4823l = null;
                    return false;
                }
                nVar = nVar2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final IOException M0(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
