package C;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: C.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RejectedExecutionHandlerC2691k implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        S.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
