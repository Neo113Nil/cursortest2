package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzb extends com.google.android.gms.tasks.CancellationToken {
    private final com.google.android.gms.tasks.zzw zza = new com.google.android.gms.tasks.zzw();

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.zza.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final com.google.android.gms.tasks.CancellationToken onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener) {
        this.zza.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.zza(this, onTokenCanceledListener));
        return this;
    }

    public final void zza() {
        this.zza.zzb(null);
    }

    zzb() {
    }
}
