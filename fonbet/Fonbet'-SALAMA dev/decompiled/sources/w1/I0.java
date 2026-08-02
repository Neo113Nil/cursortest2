package w1;

import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class I0 extends ThreadPoolExecutor.DiscardPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f17414a;

    public I0(F0 f02) {
        this.f17414a = f02;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        super.rejectedExecution(runnable, threadPoolExecutor);
        N0 h6 = F0.h(runnable);
        if (h6 == null) {
            return;
        }
        synchronized (((HashMap) this.f17414a.f17375d)) {
            ((HashMap) this.f17414a.f17375d).remove(h6);
        }
        this.f17414a.n(h6);
    }
}
