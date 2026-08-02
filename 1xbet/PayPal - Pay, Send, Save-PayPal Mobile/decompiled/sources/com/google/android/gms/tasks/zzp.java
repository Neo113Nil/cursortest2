package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzp<TResult, TContinuationResult> implements com.google.android.gms.tasks.OnSuccessListener<TContinuationResult>, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCanceledListener, com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.SuccessContinuation zzb;
    private final com.google.android.gms.tasks.zzw zzc;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        this.zzc.zzc(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.zzc.zza(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(com.google.android.gms.tasks.Task task) {
        this.zza.execute(new com.google.android.gms.tasks.zzo(this, task));
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        throw new java.lang.UnsupportedOperationException();
    }

    final /* synthetic */ com.google.android.gms.tasks.SuccessContinuation zzc() {
        return this.zzb;
    }

    public zzp(java.util.concurrent.Executor executor, com.google.android.gms.tasks.SuccessContinuation successContinuation, com.google.android.gms.tasks.zzw zzwVar) {
        this.zza = executor;
        this.zzb = successContinuation;
        this.zzc = zzwVar;
    }
}
