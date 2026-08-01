package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzsa {
    private final zzv zza;
    private zzhbf zzb = null;
    private zzbf zzc = zzbf.zza;
    private zzxo zzd = null;

    public zzsa(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzsa zza(zzhbf zzhbfVar) {
        this.zzb = zzhbfVar;
        return this;
    }

    public final zzsa zzb(zzbf zzbfVar) {
        this.zzc = zzbfVar;
        return this;
    }

    public final zzsa zzc(zzxo zzxoVar) {
        this.zzd = zzxoVar;
        return this;
    }

    public final zzsb zzd() {
        zzxo zzxoVar;
        if (!this.zzc.zzg() && (zzxoVar = this.zzd) != null) {
            zzguk.zza(this.zzc.zze(zzxoVar.zza) != -1);
        }
        return new zzsb(this, null);
    }

    final /* synthetic */ zzv zze() {
        return this.zza;
    }

    final /* synthetic */ zzhbf zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbf zzg() {
        return this.zzc;
    }

    final /* synthetic */ zzxo zzh() {
        return this.zzd;
    }
}
