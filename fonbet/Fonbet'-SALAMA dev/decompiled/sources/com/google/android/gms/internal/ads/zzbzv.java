package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbzv implements Runnable {
    final /* synthetic */ zzcaa zza;

    public zzbzv(zzcaa zzcaaVar) {
        this.zza = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcab zzcabVar;
        zzcab zzcabVar2;
        zzcaa zzcaaVar = this.zza;
        zzcabVar = zzcaaVar.zzr;
        if (zzcabVar != null) {
            zzcabVar2 = zzcaaVar.zzr;
            zzcabVar2.zzh();
        }
    }
}
