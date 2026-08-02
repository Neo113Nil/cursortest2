package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzchi implements zzdfm {
    private final zzchl zza;
    private zzeya zzb;
    private zzexd zzc;
    private zzdaj zzd;
    private zzctz zze;
    private zzdfi zzf;
    private zzcnm zzg;

    public /* synthetic */ zzchi(zzchl zzchlVar, zzcip zzcipVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final /* bridge */ /* synthetic */ zzdfm zzc(zzcnm zzcnmVar) {
        this.zzg = zzcnmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final /* bridge */ /* synthetic */ zzdfm zzd(zzdfi zzdfiVar) {
        this.zzf = zzdfiVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final /* bridge */ /* synthetic */ zzdfm zze(zzdaj zzdajVar) {
        this.zzd = zzdajVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final /* bridge */ /* synthetic */ zzdfm zzf(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdfn zzh() {
        zzheo.zzc(this.zzd, zzdaj.class);
        zzheo.zzc(this.zze, zzctz.class);
        zzheo.zzc(this.zzf, zzdfi.class);
        zzheo.zzc(this.zzg, zzcnm.class);
        return new zzchj(this.zza, this.zzg, this.zzf, new zzcrc(), new zzfcf(), new zzctb(), new zzdrf(), this.zzd, this.zze, zzefr.zza(), null, this.zzb, this.zzc);
    }
}
