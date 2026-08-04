package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzbzz implements Runnable {
    final /* synthetic */ zzcaa zza;

    public zzbzz(zzcaa zzcaaVar) {
        this.zza = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaa zzcaaVar = this.zza;
        if (zzcaaVar.zzr != null) {
            zzcaaVar.zzr.zzd();
        }
    }
}
