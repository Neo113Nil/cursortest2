package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzn implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb = new java.lang.Object();

    @javax.annotation.Nullable
    private com.google.android.gms.tasks.OnSuccessListener zzc;

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(com.google.android.gms.tasks.Task task) {
        if (task.isSuccessful()) {
            synchronized (this.zzb) {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new com.google.android.gms.tasks.zzm(this, task));
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    final /* synthetic */ com.google.android.gms.tasks.OnSuccessListener zzd() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Object zzc() {
        return this.zzb;
    }

    public zzn(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnSuccessListener onSuccessListener) {
        this.zza = executor;
        this.zzc = onSuccessListener;
    }
}
