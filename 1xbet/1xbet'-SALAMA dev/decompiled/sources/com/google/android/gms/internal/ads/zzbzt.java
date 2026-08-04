package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzbzt implements Runnable {
    final /* synthetic */ zzcaa zza;

    public zzbzt(zzcaa zzcaaVar) {
        this.zza = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaa zzcaaVar = this.zza;
        if (zzcaaVar.zzr != null) {
            zzcaaVar.zzr.zza();
        }
    }
}
