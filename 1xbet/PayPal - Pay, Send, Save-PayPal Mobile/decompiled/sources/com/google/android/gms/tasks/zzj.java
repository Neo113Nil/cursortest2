package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzj implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb = new java.lang.Object();

    @javax.annotation.Nullable
    private com.google.android.gms.tasks.OnCompleteListener zzc;

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(com.google.android.gms.tasks.Task task) {
        synchronized (this.zzb) {
            if (this.zzc == null) {
                return;
            }
            this.zza.execute(new com.google.android.gms.tasks.zzi(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    final /* synthetic */ com.google.android.gms.tasks.OnCompleteListener zzd() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Object zzc() {
        return this.zzb;
    }

    public zzj(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCompleteListener onCompleteListener) {
        this.zza = executor;
        this.zzc = onCompleteListener;
    }
}
