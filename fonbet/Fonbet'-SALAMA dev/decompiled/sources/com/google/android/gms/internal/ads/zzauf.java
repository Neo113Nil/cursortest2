package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzauf implements Runnable {
    final /* synthetic */ zzaug zza;

    public zzauf(zzaug zzaugVar) {
        this.zza = zzaugVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z4;
        zzfmc zzfmcVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z4 = this.zza.zzp;
            if (z4) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzaug.zzj(this.zza);
            } catch (Exception e7) {
                zzfmcVar = this.zza.zzh;
                zzfmcVar.zzc(2023, -1L, e7);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
