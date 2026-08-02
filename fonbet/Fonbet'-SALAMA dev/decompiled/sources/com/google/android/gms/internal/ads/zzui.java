package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzui implements zzuo, zzun {
    public final zzuq zza;
    private final long zzb;
    private zzus zzc;
    private zzuo zzd;
    private zzun zze;
    private long zzf = -9223372036854775807L;
    private final zzyw zzg;

    public zzui(zzuq zzuqVar, zzyw zzywVar, long j) {
        this.zza = zzuqVar;
        this.zzg = zzywVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j3 = this.zzf;
        return j3 != -9223372036854775807L ? j3 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zza(long j, zzls zzlsVar) {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        return zzuoVar.zza(j, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzb() {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        return zzuoVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        return zzuoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzd() {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        return zzuoVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zze(long j) {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        return zzuoVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzf(zzyh[] zzyhVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j) {
        long j3 = this.zzf;
        long j7 = (j3 == -9223372036854775807L || j != this.zzb) ? j : j3;
        this.zzf = -9223372036854775807L;
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        return zzuoVar.zzf(zzyhVarArr, zArr, zzwkVarArr, zArr2, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final zzwv zzg() {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        return zzuoVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzh(zzwm zzwmVar) {
        zzun zzunVar = this.zze;
        int i7 = zzen.zza;
        zzunVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(long j, boolean z4) {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        zzuoVar.zzi(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzj(zzuo zzuoVar) {
        zzun zzunVar = this.zze;
        int i7 = zzen.zza;
        zzunVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzk() {
        zzuo zzuoVar = this.zzd;
        if (zzuoVar != null) {
            zzuoVar.zzk();
            return;
        }
        zzus zzusVar = this.zzc;
        if (zzusVar != null) {
            zzusVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzl(zzun zzunVar, long j) {
        this.zze = zzunVar;
        zzuo zzuoVar = this.zzd;
        if (zzuoVar != null) {
            zzuoVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
        zzuo zzuoVar = this.zzd;
        int i7 = zzen.zza;
        zzuoVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        zzuo zzuoVar = this.zzd;
        return zzuoVar != null && zzuoVar.zzo(zzkmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzp() {
        zzuo zzuoVar = this.zzd;
        return zzuoVar != null && zzuoVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzuq zzuqVar) {
        long zzv = zzv(this.zzb);
        zzus zzusVar = this.zzc;
        zzusVar.getClass();
        zzuo zzI = zzusVar.zzI(zzuqVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzt() {
        zzuo zzuoVar = this.zzd;
        if (zzuoVar != null) {
            zzus zzusVar = this.zzc;
            zzusVar.getClass();
            zzusVar.zzG(zzuoVar);
        }
    }

    public final void zzu(zzus zzusVar) {
        zzcv.zzf(this.zzc == null);
        this.zzc = zzusVar;
    }
}
