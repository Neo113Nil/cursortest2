package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v80 implements ThreadFactory {

    /* JADX INFO: renamed from: j */
    public final ThreadFactoryC0862x2 f8128j;

    /* JADX INFO: renamed from: k */
    public final String f8129k;

    /* JADX INFO: renamed from: l */
    public final nc1 f8130l;

    /* JADX INFO: renamed from: m */
    public final boolean f8131m;

    /* JADX INFO: renamed from: n */
    public final AtomicInteger f8132n;

    public v80(ThreadFactoryC0862x2 threadFactoryC0862x2, String str, boolean z) {
        nc1 nc1Var = nc1.f5374m;
        this.f8132n = new AtomicInteger();
        this.f8128j = threadFactoryC0862x2;
        this.f8129k = str;
        this.f8130l = nc1Var;
        this.f8131m = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC0529o2 runnableC0529o2 = new RunnableC0529o2(17, this, runnable);
        this.f8128j.getClass();
        u80 u80Var = new u80(runnableC0529o2);
        u80Var.setName("glide-" + this.f8129k + "-thread-" + this.f8132n.getAndIncrement());
        return u80Var;
    }
}
