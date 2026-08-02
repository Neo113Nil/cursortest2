package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzh zza;

    zzg(com.google.android.gms.tasks.zzh zzhVar) {
        java.util.Objects.requireNonNull(zzhVar);
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.zzh zzhVar = this.zza;
        synchronized (zzhVar.zzc()) {
            if (zzhVar.zzd() != null) {
                zzhVar.zzd().onCanceled();
            }
        }
    }
}
