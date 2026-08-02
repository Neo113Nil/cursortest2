package n;

import W5.E0;
import android.support.v4.media.session.t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1443c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15282a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15283b;

    public ThreadFactoryC1443c(t tVar) {
        this.f15282a = 2;
        this.f15283b = tVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15282a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f15283b).getAndIncrement());
                return thread;
            case 1:
                return new Thread(runnable, "ModernAsyncTask #" + ((AtomicInteger) this.f15283b).getAndIncrement());
            default:
                ((t) this.f15283b).getClass();
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("FirebaseDatabaseWorker");
                newThread.setDaemon(true);
                newThread.setUncaughtExceptionHandler(new E0(this, 1));
                return newThread;
        }
    }

    public ThreadFactoryC1443c(int i7) {
        this.f15282a = i7;
        switch (i7) {
            case 1:
                this.f15283b = new AtomicInteger(1);
                break;
            default:
                this.f15283b = new AtomicInteger(0);
                break;
        }
    }
}
