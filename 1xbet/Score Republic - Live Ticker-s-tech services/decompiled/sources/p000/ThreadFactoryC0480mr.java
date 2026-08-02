package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: mr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0480mr implements ThreadFactory {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5134j;

    /* JADX INFO: renamed from: k */
    public final Object f5135k;

    public ThreadFactoryC0480mr() {
        this.f5134j = 0;
        this.f5135k = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f5134j;
        Object obj = this.f5135k;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
        }
    }

    public ThreadFactoryC0480mr(mw1 mw1Var) {
        this.f5134j = 1;
        this.f5135k = Executors.defaultThreadFactory();
    }
}
