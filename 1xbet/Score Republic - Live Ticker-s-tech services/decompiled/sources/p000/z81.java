package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z81 extends wm1 {

    /* JADX INFO: renamed from: f */
    public static final ReentrantLock f9682f;

    /* JADX INFO: renamed from: d */
    public boolean f9683d;

    /* JADX INFO: renamed from: e */
    public z81 f9684e;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f9682f = reentrantLock;
        reentrantLock.newCondition().getClass();
    }

    public z81(Socket socket) {
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5868o() {
        ReentrantLock reentrantLock = f9682f;
        reentrantLock.lock();
        try {
            if (!this.f9683d) {
                return false;
            }
            this.f9683d = false;
            z81 z81Var = null;
            while (z81Var != null) {
                z81 z81Var2 = z81Var.f9684e;
                if (z81Var2 == this) {
                    z81Var.f9684e = this.f9684e;
                    this.f9684e = null;
                    return false;
                }
                z81Var = z81Var2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: p */
    public final IOException m5869p(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
