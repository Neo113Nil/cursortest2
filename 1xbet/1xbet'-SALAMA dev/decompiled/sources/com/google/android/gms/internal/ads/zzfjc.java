package com.google.android.gms.internal.ads;

import J2.j;

/* JADX INFO: loaded from: classes.dex */
final class zzfjc extends zzbvz {
    final /* synthetic */ zzgbw zza;
    final /* synthetic */ zzbvt zzb;
    final /* synthetic */ zzfjd zzc;

    public zzfjc(zzfjd zzfjdVar, zzgbw zzgbwVar, zzbvt zzbvtVar) {
        this.zza = zzgbwVar;
        this.zzb = zzbvtVar;
        this.zzc = zzfjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        j.g("Failed to load rewarded ad with error: " + zzeVar.k().toString() + ", adUnitId: " + this.zzc.zze.f10729a);
        this.zzc.zzC(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg() {
        zzfid.zza(this.zzb, this.zza);
    }
}
