package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzbzy implements Runnable {
    final /* synthetic */ zzcaa zza;

    public zzbzy(zzcaa zzcaaVar) {
        this.zza = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaa zzcaaVar = this.zza;
        if (zzcaaVar.zzr != null) {
            if (!zzcaaVar.zzs) {
                zzcaaVar.zzr.zzg();
                this.zza.zzs = true;
            }
            this.zza.zzr.zze();
        }
    }
}
