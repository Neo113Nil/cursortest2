package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzl zzb;

    zzk(com.google.android.gms.tasks.zzl zzlVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        java.util.Objects.requireNonNull(zzlVar);
        this.zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.zzl zzlVar = this.zzb;
        synchronized (zzlVar.zzc()) {
            if (zzlVar.zzd() != null) {
                zzlVar.zzd().onFailure((java.lang.Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza.getException()));
            }
        }
    }
}
