package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzchz implements zzdrt {
    private final Long zza;
    private final String zzb;
    private final zzchl zzc;
    private final zzcib zzd;

    public zzchz(zzchl zzchlVar, zzcib zzcibVar, Long l7, String str) {
        this.zzc = zzchlVar;
        this.zzd = zzcibVar;
        this.zza = l7;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdrt
    public final zzdsd zza() {
        Context context;
        zzcib zzcibVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcibVar.zze;
        return zzdse.zza(longValue, context, zzcibVar.zzc(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdrt
    public final zzdsh zzb() {
        Context context;
        zzcib zzcibVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcibVar.zze;
        return zzdsi.zza(longValue, context, zzcibVar.zzc(), this.zzc, this.zzb);
    }
}
