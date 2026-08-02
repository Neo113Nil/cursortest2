package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzr {
    private final java.lang.Object zza = new java.lang.Object();
    private java.util.Queue zzb;
    private boolean zzc;

    public final void zza(com.google.android.gms.tasks.zzq zzqVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new java.util.ArrayDeque();
            }
            this.zzb.add(zzqVar);
        }
    }

    public final void zzb(com.google.android.gms.tasks.Task task) {
        com.google.android.gms.tasks.zzq zzqVar;
        synchronized (this.zza) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (this.zza) {
                        zzqVar = (com.google.android.gms.tasks.zzq) this.zzb.poll();
                        if (zzqVar == null) {
                            this.zzc = false;
                            return;
                        }
                    }
                    zzqVar.zza(task);
                }
            }
        }
    }

    zzr() {
    }
}
