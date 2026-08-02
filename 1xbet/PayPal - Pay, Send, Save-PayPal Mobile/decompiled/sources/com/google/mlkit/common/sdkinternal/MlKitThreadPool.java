package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class MlKitThreadPool extends com.google.android.gms.internal.mlkit_common.zzav {
    private static final java.lang.ThreadLocal zza = new java.lang.ThreadLocal();
    private final java.util.concurrent.ThreadPoolExecutor zzb;

    public MlKitThreadPool() {
        final java.util.concurrent.ThreadFactory defaultThreadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new java.util.concurrent.ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.zzj
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(final java.lang.Runnable runnable) {
                return defaultThreadFactory.newThread(new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.mlkit.common.sdkinternal.MlKitThreadPool.zzd(runnable);
                    }
                });
            }
        });
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void zzd(java.lang.Runnable runnable) {
        zza.set(new java.util.ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(java.util.Deque deque, java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (java.lang.Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(final java.lang.Runnable runnable) {
        java.util.Deque deque = (java.util.Deque) zza.get();
        if (deque == null || deque.size() > 1) {
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.mlkit.common.sdkinternal.MlKitThreadPool.zze((java.util.Deque) com.google.mlkit.common.sdkinternal.MlKitThreadPool.zza.get(), runnable);
                }
            });
        } else {
            zze(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    public final java.util.concurrent.ExecutorService zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    public final /* synthetic */ java.lang.Object zza() {
        return this.zzb;
    }
}
