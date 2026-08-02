package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
enum zzh implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        android.os.Handler handler;
        handler = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance().zzc;
        handler.post(runnable);
    }
}
