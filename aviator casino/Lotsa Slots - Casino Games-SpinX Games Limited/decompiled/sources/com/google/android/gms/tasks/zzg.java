package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes4.dex */
final class zzg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzh zza;

    zzg(com.google.android.gms.tasks.zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.google.android.gms.tasks.OnCanceledListener onCanceledListener;
        com.google.android.gms.tasks.OnCanceledListener onCanceledListener2;
        obj = this.zza.zzb;
        synchronized (obj) {
            com.google.android.gms.tasks.zzh zzhVar = this.zza;
            onCanceledListener = zzhVar.zzc;
            if (onCanceledListener != null) {
                onCanceledListener2 = zzhVar.zzc;
                onCanceledListener2.onCanceled();
            }
        }
    }
}
