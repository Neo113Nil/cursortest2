package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class TaskQueue {
    private boolean zzb;
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.Queue zzc = new java.util.ArrayDeque();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc() {
        synchronized (this.zza) {
            if (this.zzc.isEmpty()) {
                this.zzb = false;
            } else {
                com.google.mlkit.common.sdkinternal.zzv zzvVar = (com.google.mlkit.common.sdkinternal.zzv) this.zzc.remove();
                zzd(zzvVar.zza, zzvVar.zzb);
            }
        }
    }

    private final void zzd(java.util.concurrent.Executor executor, final java.lang.Runnable runnable) {
        try {
            executor.execute(new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.mlkit.common.sdkinternal.zzx zzxVar = new com.google.mlkit.common.sdkinternal.zzx(com.google.mlkit.common.sdkinternal.TaskQueue.this, null);
                    try {
                        runnable.run();
                        zzxVar.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            zzxVar.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            zzc();
        }
    }

    public void checkIsRunningOnCurrentThread() {
        com.google.android.gms.common.internal.Preconditions.checkState(java.lang.Thread.currentThread().equals(this.zzd.get()));
    }

    public void submit(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        synchronized (this.zza) {
            if (this.zzb) {
                this.zzc.add(new com.google.mlkit.common.sdkinternal.zzv(executor, runnable, null));
            } else {
                this.zzb = true;
                zzd(executor, runnable);
            }
        }
    }
}
