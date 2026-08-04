package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzbzu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcaa zzc;

    public zzbzu(zzcaa zzcaaVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaa zzcaaVar = this.zzc;
        if (zzcaaVar.zzr != null) {
            zzcaaVar.zzr.zzb(this.zza, this.zzb);
        }
    }
}
