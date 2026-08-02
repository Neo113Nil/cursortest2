package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcib implements zzdsb {
    final zzhep zza;
    final zzhep zzb;
    final zzhep zzc;
    final zzhep zzd;
    private final Context zze;
    private final zzbjy zzf;
    private final zzchl zzg;
    private final zzcib zzh = this;

    public zzcib(zzchl zzchlVar, Context context, zzbjy zzbjyVar) {
        this.zzg = zzchlVar;
        this.zze = context;
        this.zzf = zzbjyVar;
        zzheg zza = zzheh.zza(this);
        this.zza = zza;
        zzheg zza2 = zzheh.zza(zzbjyVar);
        this.zzb = zza2;
        zzdrx zzdrxVar = new zzdrx(zza2);
        this.zzc = zzdrxVar;
        this.zzd = zzhef.zzc(new zzdrz(zza, zzdrxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsb
    public final zzdrs zzb() {
        return new zzchy(this.zzg, this.zzh, null);
    }

    public final zzdrw zzc() {
        return zzdrx.zzc(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdsb
    public final zzdry zzd() {
        return (zzdry) this.zzd.zzb();
    }
}
