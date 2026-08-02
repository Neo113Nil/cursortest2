package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzchy implements zzdrs {
    private final zzchl zza;
    private final zzcib zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzchy(zzchl zzchlVar, zzcib zzcibVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
        this.zzb = zzcibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrs
    public final /* bridge */ /* synthetic */ zzdrs zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrs
    public final /* bridge */ /* synthetic */ zzdrs zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrs
    public final zzdrt zzc() {
        zzheo.zzc(this.zzc, Long.class);
        zzheo.zzc(this.zzd, String.class);
        return new zzchz(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
