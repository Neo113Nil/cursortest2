package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzd implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.Continuation zzb;
    private final com.google.android.gms.tasks.zzw zzc;

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(com.google.android.gms.tasks.Task task) {
        this.zza.execute(new com.google.android.gms.tasks.zzc(this, task));
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        throw new java.lang.UnsupportedOperationException();
    }

    final /* synthetic */ com.google.android.gms.tasks.zzw zzd() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.tasks.Continuation zzc() {
        return this.zzb;
    }

    public zzd(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation continuation, com.google.android.gms.tasks.zzw zzwVar) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzwVar;
    }
}
