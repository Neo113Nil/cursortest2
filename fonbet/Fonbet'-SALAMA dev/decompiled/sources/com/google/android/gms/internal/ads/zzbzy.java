package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbzy implements Runnable {
    final /* synthetic */ zzcaa zza;

    public zzbzy(zzcaa zzcaaVar) {
        this.zza = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcab zzcabVar;
        boolean z4;
        zzcab zzcabVar2;
        zzcab zzcabVar3;
        zzcaa zzcaaVar = this.zza;
        zzcabVar = zzcaaVar.zzr;
        if (zzcabVar != null) {
            z4 = zzcaaVar.zzs;
            if (!z4) {
                zzcabVar3 = zzcaaVar.zzr;
                zzcabVar3.zzg();
                this.zza.zzs = true;
            }
            zzcabVar2 = this.zza.zzr;
            zzcabVar2.zze();
        }
    }
}
