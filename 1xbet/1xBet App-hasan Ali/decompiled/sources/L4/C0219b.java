package L4;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: L4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219b extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3074k = 0;

    public /* synthetic */ C0219b(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.f3074k) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C0222e.f3081h;
                reentrantLock = C0222e.f3081h;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                C0222e f = j3.i.f();
                if (f == C0222e.f3084l) {
                    C0222e.f3084l = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (f != null) {
                        f.j();
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ C0219b(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
