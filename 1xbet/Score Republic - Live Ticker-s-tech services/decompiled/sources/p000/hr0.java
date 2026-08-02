package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hr0 implements ThreadFactory {

    /* JADX INFO: renamed from: j */
    public final String f3297j;

    /* JADX INFO: renamed from: k */
    public final ThreadFactory f3298k = Executors.defaultThreadFactory();

    public hr0(String str) {
        this.f3297j = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f3298k.newThread(new RunnableC0825w2(runnable, 4));
        threadNewThread.setName(this.f3297j);
        return threadNewThread;
    }
}
