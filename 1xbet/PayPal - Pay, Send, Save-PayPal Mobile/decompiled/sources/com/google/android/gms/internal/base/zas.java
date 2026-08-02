package com.google.android.gms.internal.base;

/* loaded from: classes8.dex */
final class zas implements com.google.android.gms.internal.base.zaq {
    private zas() {
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zaa(java.util.concurrent.ThreadFactory threadFactory, int i) {
        return zac(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zab(int i, int i2) {
        return zac(4, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zac(int i, java.util.concurrent.ThreadFactory threadFactory, int i2) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* synthetic */ zas(com.google.android.gms.internal.base.zar zarVar) {
    }
}
