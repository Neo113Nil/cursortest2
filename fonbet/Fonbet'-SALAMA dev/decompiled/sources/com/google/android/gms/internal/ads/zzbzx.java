package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbzx implements Runnable {
    final /* synthetic */ zzcaa zza;

    public zzbzx(zzcaa zzcaaVar) {
        this.zza = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcab zzcabVar;
        zzcab zzcabVar2;
        zzcab zzcabVar3;
        zzcaa zzcaaVar = this.zza;
        zzcabVar = zzcaaVar.zzr;
        if (zzcabVar != null) {
            zzcabVar2 = zzcaaVar.zzr;
            zzcabVar2.zzd();
            zzcabVar3 = this.zza.zzr;
            zzcabVar3.zzi();
        }
    }
}
