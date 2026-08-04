package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzchn implements zzcnc {
    private final zzchl zza;
    private zzeya zzb;
    private zzexd zzc;
    private zzdaj zzd;
    private zzctz zze;

    public /* synthetic */ zzchn(zzchl zzchlVar, zzcip zzcipVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final /* bridge */ /* synthetic */ zzcnc zzc(zzdaj zzdajVar) {
        this.zzd = zzdajVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final /* bridge */ /* synthetic */ zzcnc zzd(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzcnd zzh() {
        zzheo.zzc(this.zzd, zzdaj.class);
        zzheo.zzc(this.zze, zzctz.class);
        return new zzcho(this.zza, new zzcrc(), new zzfcf(), new zzctb(), new zzdrf(), this.zzd, this.zze, zzefr.zza(), null, this.zzb, this.zzc);
    }
}
