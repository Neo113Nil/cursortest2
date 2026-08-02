package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2192b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18497a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18498b;

    public ThreadFactoryC2192b(int i) {
        this.f18497a = i;
        switch (i) {
            case 1:
                this.f18498b = Executors.defaultThreadFactory();
                break;
            default:
                this.f18498b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f18497a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f18498b).getAndIncrement());
                return thread;
            default:
                Thread newThread = ((ThreadFactory) this.f18498b).newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
        }
    }
}
