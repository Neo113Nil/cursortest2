package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public abstract class zzv implements java.lang.Runnable {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzc();
        } catch (java.lang.Exception e) {
            zzb(e);
        }
    }

    public final void zzb(java.lang.Exception exc) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void zzc();

    final com.google.android.gms.tasks.TaskCompletionSource zza() {
        return this.zza;
    }

    public zzv(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    zzv() {
        this.zza = null;
    }
}
