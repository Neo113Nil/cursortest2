package p094n;

import W5.E0;
import android.support.v4.media.session.t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15289b;

    public c(t tVar) {
        this.f15288a = 2;
        this.f15289b = tVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15288a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f15289b).getAndIncrement());
                return thread;
            case 1:
                return new Thread(runnable, "ModernAsyncTask #" + ((AtomicInteger) this.f15289b).getAndIncrement());
            default:
                ((t) this.f15289b).getClass();
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("FirebaseDatabaseWorker");
                threadNewThread.setDaemon(true);
                threadNewThread.setUncaughtExceptionHandler(new E0(this, 1));
                return threadNewThread;
        }
    }

    public c(int i7) {
        this.f15288a = i7;
        switch (i7) {
            case 1:
                this.f15289b = new AtomicInteger(1);
                break;
            default:
                this.f15289b = new AtomicInteger(0);
                break;
        }
    }
}
