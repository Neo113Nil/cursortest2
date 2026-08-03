package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class q implements java.util.concurrent.RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        com.fyber.inneractive.sdk.util.IAlog.a("rejectedExecution received for - %s", runnable);
    }
}
