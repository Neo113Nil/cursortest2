package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        zzcab zzcabVar;
        zzcab zzcabVar2;
        zzcaa zzcaaVar = this.zzc;
        zzcabVar = zzcaaVar.zzr;
        if (zzcabVar != null) {
            int i7 = this.zza;
            int i8 = this.zzb;
            zzcabVar2 = zzcaaVar.zzr;
            zzcabVar2.zzj(i7, i8);
        }
    }
}
