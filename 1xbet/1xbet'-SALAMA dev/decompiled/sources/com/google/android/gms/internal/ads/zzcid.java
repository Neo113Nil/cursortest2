package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzcid implements zzdeq {
    private final zzchl zza;
    private zzeya zzb;
    private zzexd zzc;
    private zzdaj zzd;
    private zzctz zze;
    private zzehm zzf;

    public /* synthetic */ zzcid(zzchl zzchlVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final /* synthetic */ zzctv zza(zzexd zzexdVar) {
        this.zzc = zzexdVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final /* synthetic */ zzctv zzb(zzeya zzeyaVar) {
        this.zzb = zzeyaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final /* bridge */ /* synthetic */ zzdeq zzc(zzehm zzehmVar) {
        this.zzf = zzehmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final /* bridge */ /* synthetic */ zzdeq zzd(zzdaj zzdajVar) {
        this.zzd = zzdajVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final /* bridge */ /* synthetic */ zzdeq zze(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzder zzh() {
        zzheo.zzc(this.zzd, zzdaj.class);
        zzheo.zzc(this.zze, zzctz.class);
        zzheo.zzc(this.zzf, zzehm.class);
        return new zzcie(this.zza, new zzcrc(), new zzfcf(), new zzctb(), new zzdrf(), this.zzd, this.zze, zzefr.zza(), this.zzf, null, this.zzb, this.zzc);
    }
}
