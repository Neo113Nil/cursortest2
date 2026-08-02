package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcik implements zzdmy {
    private final zzchl zza;
    private zzeya zzb;
    private zzexd zzc;
    private zzdaj zzd;
    private zzctz zze;

    public /* synthetic */ zzcik(zzchl zzchlVar, zzcip zzcipVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdmy
    public final /* bridge */ /* synthetic */ zzdmy zzc(zzdaj zzdajVar) {
        this.zzd = zzdajVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmy
    public final /* bridge */ /* synthetic */ zzdmy zzd(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdmz zzh() {
        zzheo.zzc(this.zzd, zzdaj.class);
        zzheo.zzc(this.zze, zzctz.class);
        return new zzcil(this.zza, new zzcrc(), new zzfcf(), new zzctb(), new zzdrf(), this.zzd, this.zze, zzefr.zza(), null, this.zzb, this.zzc);
    }
}
