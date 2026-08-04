package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzzu {
    final /* synthetic */ zzzw zza;
    private zzz zzb;

    public /* synthetic */ zzzu(zzzw zzzwVar, zzzv zzzvVar) {
        this.zza = zzzwVar;
    }

    public final void zza(zzcc zzccVar) {
        zzx zzxVar = new zzx();
        zzxVar.zzai(zzccVar.zzb);
        zzxVar.zzM(zzccVar.zzc);
        zzxVar.zzad("video/raw");
        this.zzb = zzxVar.zzaj();
    }

    public final void zzb(long j, long j3, boolean z4) {
        zzz zzzVarZzaj = this.zzb;
        if (zzzVarZzaj == null) {
            zzzVarZzaj = new zzx().zzaj();
        }
        zzz zzzVar = zzzVarZzaj;
        zzzw zzzwVar = this.zza;
        zzzwVar.zzg.zza(j3, zzzwVar.zzb.zzc(), zzzVar, null);
        ((zzabm) this.zza.zzd.remove()).zza(j);
    }
}
