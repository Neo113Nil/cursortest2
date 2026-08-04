package p155w1;

import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends ThreadPoolExecutor.DiscardPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f17420a;

    public I0(F0 f7) {
        this.f17420a = f7;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        super.rejectedExecution(runnable, threadPoolExecutor);
        N0 n0H = F0.h(runnable);
        if (n0H == null) {
            return;
        }
        synchronized (((HashMap) this.f17420a.f17381d)) {
            ((HashMap) this.f17420a.f17381d).remove(n0H);
        }
        this.f17420a.n(n0H);
    }
}
