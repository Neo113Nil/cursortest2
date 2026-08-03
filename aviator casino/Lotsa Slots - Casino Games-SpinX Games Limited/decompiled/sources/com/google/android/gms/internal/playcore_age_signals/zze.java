package com.google.android.gms.internal.playcore_age_signals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public abstract class zze implements java.lang.Runnable {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zze() {
        this.zza = null;
    }

    public zze(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzb();
        } catch (java.lang.Exception e) {
            zza(e);
        }
    }

    public void zza(java.lang.Exception exc) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void zzb();

    final com.google.android.gms.tasks.TaskCompletionSource zzc() {
        return this.zza;
    }
}
