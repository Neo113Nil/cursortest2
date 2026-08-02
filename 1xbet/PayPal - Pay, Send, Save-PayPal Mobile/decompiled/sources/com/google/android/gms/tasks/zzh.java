package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzh implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb = new java.lang.Object();

    @javax.annotation.Nullable
    private com.google.android.gms.tasks.OnCanceledListener zzc;

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(com.google.android.gms.tasks.Task task) {
        if (task.isCanceled()) {
            synchronized (this.zzb) {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new com.google.android.gms.tasks.zzg(this));
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    final /* synthetic */ com.google.android.gms.tasks.OnCanceledListener zzd() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Object zzc() {
        return this.zzb;
    }

    public zzh(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        this.zza = executor;
        this.zzc = onCanceledListener;
    }
}
