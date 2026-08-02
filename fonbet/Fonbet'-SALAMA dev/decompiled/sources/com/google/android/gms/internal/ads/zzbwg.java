package com.google.android.gms.internal.ads;

import S2.c;
import S2.d;

/* loaded from: classes.dex */
public final class zzbwg extends zzbvz {
    private final d zza;
    private final c zzb;

    public zzbwg(d dVar, c cVar) {
        this.zza = dVar;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.k());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg() {
        d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdLoaded(this.zzb);
        }
    }
}
