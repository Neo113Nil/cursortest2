package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzcia implements zzdsa {
    private final zzchl zza;
    private Context zzb;
    private zzbjy zzc;

    public /* synthetic */ zzcia(zzchl zzchlVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsa
    public final /* bridge */ /* synthetic */ zzdsa zza(zzbjy zzbjyVar) {
        zzbjyVar.getClass();
        this.zzc = zzbjyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsa
    public final /* bridge */ /* synthetic */ zzdsa zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsa
    public final zzdsb zzc() {
        zzheo.zzc(this.zzb, Context.class);
        zzheo.zzc(this.zzc, zzbjy.class);
        return new zzcib(this.zza, this.zzb, this.zzc);
    }
}
