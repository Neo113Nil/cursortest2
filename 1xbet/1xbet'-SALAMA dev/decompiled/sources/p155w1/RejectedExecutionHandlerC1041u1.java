package p155w1;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: w1.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RejectedExecutionHandlerC1041u1 implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        runnable.toString();
    }
}
