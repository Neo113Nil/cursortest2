package com.google.mlkit.common.sdkinternal;

/* loaded from: classes.dex */
public abstract class ModelResource {
    protected final com.google.mlkit.common.sdkinternal.TaskQueue taskQueue;
    private final java.util.concurrent.atomic.AtomicInteger zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;

    public ModelResource() {
        this.zza = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.taskQueue = new com.google.mlkit.common.sdkinternal.TaskQueue();
    }

    public <T> com.google.android.gms.tasks.Task<T> callAfterLoad(final java.util.concurrent.Executor executor, final java.util.concurrent.Callable<T> callable, final com.google.android.gms.tasks.CancellationToken cancellationToken) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return com.google.android.gms.tasks.Tasks.forCanceled();
        }
        final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationTokenSource.getToken());
        this.taskQueue.submit(new java.util.concurrent.Executor() { // from class: com.google.mlkit.common.sdkinternal.zzm
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (java.lang.RuntimeException e) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e);
                    }
                    throw e;
                }
            }
        }, new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzn
            @Override // java.lang.Runnable
            public final void run() {
                com.google.mlkit.common.sdkinternal.ModelResource.this.zza(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public boolean isLoaded() {
        return this.zzb.get();
    }

    public abstract void load() throws com.google.mlkit.common.MlKitException;

    public void pin() {
        this.zza.incrementAndGet();
    }

    protected abstract void release();

    public void unpin(java.util.concurrent.Executor executor) {
        unpinWithTask(executor);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unpinWithTask(java.util.concurrent.Executor executor) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza.get() > 0);
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.taskQueue.submit(executor, new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzl
            @Override // java.lang.Runnable
            public final void run() {
                com.google.mlkit.common.sdkinternal.ModelResource.this.zzb(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void zza(com.google.android.gms.tasks.CancellationToken cancellationToken, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, java.util.concurrent.Callable callable, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.zzb.get()) {
                    load();
                    this.zzb.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                java.lang.Object call = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(call);
                }
            } catch (java.lang.RuntimeException e) {
                throw new com.google.mlkit.common.MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (java.lang.Exception e2) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e2);
            }
        }
    }

    final /* synthetic */ void zzb(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        int decrementAndGet = this.zza.decrementAndGet();
        com.google.android.gms.common.internal.Preconditions.checkState(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            release();
            this.zzb.set(false);
        }
        com.google.android.gms.internal.mlkit_common.zzrr.zza();
        taskCompletionSource.setResult(null);
    }

    protected ModelResource(com.google.mlkit.common.sdkinternal.TaskQueue taskQueue) {
        this.zza = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.taskQueue = taskQueue;
    }
}
