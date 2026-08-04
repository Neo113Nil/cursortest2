package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzbwm extends zzbvz {
    private final T2.b zza;
    private final zzbwn zzb;

    public zzbwm(T2.b bVar, zzbwn zzbwnVar) {
        this.zza = bVar;
        this.zzb = zzbwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        T2.b bVar = this.zza;
        if (bVar != null) {
            bVar.onAdFailedToLoad(zzeVar.k());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg() {
        zzbwn zzbwnVar;
        T2.b bVar = this.zza;
        if (bVar == null || (zzbwnVar = this.zzb) == null) {
            return;
        }
        bVar.onAdLoaded(zzbwnVar);
    }
}
