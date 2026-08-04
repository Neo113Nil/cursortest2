package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzchs implements zzcos {
    private final zzchl zza;
    private zzeya zzb;
    private zzexd zzc;
    private zzdaj zzd;
    private zzctz zze;
    private zzehm zzf;
    private zzcpo zzg;
    private zzefp zzh;
    private zzcnm zzi;
    private zzdfi zzj;

    public /* synthetic */ zzchs(zzchl zzchlVar, zzcip zzcipVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcos
    public final /* bridge */ /* synthetic */ zzcos zzc(zzcnm zzcnmVar) {
        this.zzi = zzcnmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcos
    public final /* bridge */ /* synthetic */ zzcos zzd(zzdfi zzdfiVar) {
        this.zzj = zzdfiVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcos
    public final /* bridge */ /* synthetic */ zzcos zze(zzehm zzehmVar) {
        this.zzf = zzehmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcos
    public final /* bridge */ /* synthetic */ zzcos zzf(zzdaj zzdajVar) {
        this.zzd = zzdajVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcos
    public final /* bridge */ /* synthetic */ zzcos zzg(zzcpo zzcpoVar) {
        this.zzg = zzcpoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcos
    public final /* bridge */ /* synthetic */ zzcos zzi(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcos
    public final /* bridge */ /* synthetic */ zzcos zzj(zzefp zzefpVar) {
        this.zzh = zzefpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final zzcot zzh() {
        zzheo.zzc(this.zzd, zzdaj.class);
        zzheo.zzc(this.zze, zzctz.class);
        zzheo.zzc(this.zzf, zzehm.class);
        zzheo.zzc(this.zzg, zzcpo.class);
        if (this.zzh == null) {
            this.zzh = zzefr.zza();
        }
        zzheo.zzc(this.zzi, zzcnm.class);
        zzheo.zzc(this.zzj, zzdfi.class);
        return new zzcht(this.zza, this.zzi, this.zzj, new zzcrc(), new zzfcf(), new zzctb(), new zzdrf(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc);
    }
}
