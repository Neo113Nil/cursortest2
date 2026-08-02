package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzdps implements zzfff {
    private final Map zza;
    private final zzbaw zzb;

    public zzdps(zzbaw zzbawVar, Map map) {
        this.zza = map;
        this.zzb = zzbawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzd(zzfey zzfeyVar, String str) {
        if (this.zza.containsKey(zzfeyVar)) {
            this.zzb.zzc(((zzdpr) this.zza.get(zzfeyVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdA(zzfey zzfeyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdB(zzfey zzfeyVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfeyVar)) {
            this.zzb.zzc(((zzdpr) this.zza.get(zzfeyVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdC(zzfey zzfeyVar, String str) {
        if (this.zza.containsKey(zzfeyVar)) {
            this.zzb.zzc(((zzdpr) this.zza.get(zzfeyVar)).zza);
        }
    }
}
