package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzbzw implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcaa zzc;

    public zzbzw(zzcaa zzcaaVar, int i7, int i8) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaa zzcaaVar = this.zzc;
        if (zzcaaVar.zzr != null) {
            zzcaaVar.zzr.zzj(this.zza, this.zzb);
        }
    }
}
