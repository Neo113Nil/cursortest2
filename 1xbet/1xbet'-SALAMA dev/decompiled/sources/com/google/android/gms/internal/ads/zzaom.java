package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzaom implements Runnable {
    final /* synthetic */ zzapb zza;
    final /* synthetic */ zzaon zzb;

    public zzaom(zzaon zzaonVar, zzapb zzapbVar) {
        this.zza = zzapbVar;
        this.zzb = zzaonVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
