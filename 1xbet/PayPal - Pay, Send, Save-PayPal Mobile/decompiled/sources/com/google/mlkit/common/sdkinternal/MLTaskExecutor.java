package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class MLTaskExecutor {
    private static final java.lang.Object zza = new java.lang.Object();
    private static com.google.mlkit.common.sdkinternal.MLTaskExecutor zzb;
    private final android.os.Handler zzc;

    private MLTaskExecutor(android.os.Looper looper) {
        this.zzc = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    public static com.google.mlkit.common.sdkinternal.MLTaskExecutor getInstance() {
        com.google.mlkit.common.sdkinternal.MLTaskExecutor mLTaskExecutor;
        synchronized (zza) {
            if (zzb == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("MLHandler", 9);
                handlerThread.start();
                zzb = new com.google.mlkit.common.sdkinternal.MLTaskExecutor(handlerThread.getLooper());
            }
            mLTaskExecutor = zzb;
        }
        return mLTaskExecutor;
    }

    public <ResultT> com.google.android.gms.tasks.Task<ResultT> scheduleCallable(final java.util.concurrent.Callable<ResultT> callable) {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        scheduleRunnable(new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                java.util.concurrent.Callable callable2 = callable;
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (com.google.mlkit.common.MlKitException e) {
                    taskCompletionSource2.setException(e);
                } catch (java.lang.Exception e2) {
                    taskCompletionSource2.setException(new com.google.mlkit.common.MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public void scheduleRunnable(java.lang.Runnable runnable) {
        workerThreadExecutor().execute(runnable);
    }

    public void scheduleRunnableDelayed(java.lang.Runnable runnable, long j) {
        this.zzc.postDelayed(runnable, j);
    }

    public <ResultT> com.google.android.gms.tasks.Task<ResultT> scheduleTaskCallable(java.util.concurrent.Callable<com.google.android.gms.tasks.Task<ResultT>> callable) {
        return (com.google.android.gms.tasks.Task<ResultT>) scheduleCallable(callable).continueWithTask(com.google.android.gms.internal.mlkit_common.zzaw.zza(), new com.google.android.gms.tasks.Continuation() { // from class: com.google.mlkit.common.sdkinternal.zzg
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return (com.google.android.gms.tasks.Task) task.getResult();
            }
        });
    }

    public android.os.Handler getHandler() {
        return this.zzc;
    }

    public static java.util.concurrent.Executor workerThreadExecutor() {
        return com.google.mlkit.common.sdkinternal.zzh.zza;
    }
}
