package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b41 extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: j */
    public final String f707j;

    /* JADX INFO: renamed from: k */
    public final int f708k;

    /* JADX INFO: renamed from: l */
    public final boolean f709l;

    public b41(int i, String str, boolean z) {
        this.f707j = str;
        this.f708k = i;
        this.f709l = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f707j + '-' + incrementAndGet();
        Thread u80Var = this.f709l ? new u80(runnable, str) : new Thread(runnable, str);
        u80Var.setPriority(this.f708k);
        u80Var.setDaemon(true);
        return u80Var;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return AbstractC0024an.m285h(new StringBuilder("RxThreadFactory["), this.f707j, "]");
    }

    public b41(String str) {
        this(5, str, false);
    }
}
