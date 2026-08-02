package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        zzcab zzcabVar;
        zzcab zzcabVar2;
        zzcaa zzcaaVar = this.zzc;
        zzcabVar = zzcaaVar.zzr;
        if (zzcabVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcabVar2 = zzcaaVar.zzr;
            zzcabVar2.zzb(str, str2);
        }
    }
}
