package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
public class TaskCompletionSource<TResult> {
    private final com.google.android.gms.tasks.zzw zza = new com.google.android.gms.tasks.zzw();

    public TaskCompletionSource(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.zzs(this));
    }

    public void setException(java.lang.Exception exc) {
        this.zza.zzc(exc);
    }

    public void setResult(TResult tresult) {
        this.zza.zza(tresult);
    }

    public boolean trySetException(java.lang.Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.zzb(tresult);
    }

    final /* synthetic */ com.google.android.gms.tasks.zzw zza() {
        return this.zza;
    }

    public com.google.android.gms.tasks.Task<TResult> getTask() {
        return this.zza;
    }

    public TaskCompletionSource() {
    }
}
