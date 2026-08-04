package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzauf implements Runnable {
    final /* synthetic */ zzaug zza;

    public zzauf(zzaug zzaugVar) {
        this.zza = zzaugVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzo) {
            if (this.zza.zzp) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzaug.zzj(this.zza);
            } catch (Exception e7) {
                this.zza.zzh.zzc(2023, -1L, e7);
            }
            synchronized (this.zza.zzo) {
                this.zza.zzp = false;
            }
        }
    }
}
