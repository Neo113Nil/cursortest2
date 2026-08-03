package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzxc implements com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzxh {
    public final com.google.android.gms.internal.ads.zzxk zza;
    private final long zzb;
    private final com.google.android.gms.internal.ads.zzabl zzc;
    private com.google.android.gms.internal.ads.zzxm zzd;
    private com.google.android.gms.internal.ads.zzxi zze;
    private com.google.android.gms.internal.ads.zzxh zzf;
    private long zzg = -9223372036854775807L;

    public zzxc(com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzabl zzablVar, long j) {
        this.zza = zzxkVar;
        this.zzc = zzablVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzg;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(com.google.android.gms.internal.ads.zzxh zzxhVar, long j) {
        this.zzf = zzxhVar;
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        if (zzxiVar != null) {
            zzxiVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        if (zzxiVar != null) {
            zzxiVar.zzc();
            return;
        }
        com.google.android.gms.internal.ads.zzxm zzxmVar = this.zzd;
        if (zzxmVar != null) {
            zzxmVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final com.google.android.gms.internal.ads.zzzn zzd() {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return zzxiVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(com.google.android.gms.internal.ads.zzaba[] zzabaVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzzc[] zzzcVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzg;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzg = -9223372036854775807L;
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return zzxiVar.zze(zzabaVarArr, zArr, zzzcVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j, boolean z) {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzxiVar.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j) {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzxiVar.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return zzxiVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return zzxiVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j) {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return zzxiVar.zzj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j, com.google.android.gms.internal.ads.zzni zzniVar) {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return zzxiVar.zzk(j, zzniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return zzxiVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(com.google.android.gms.internal.ads.zzma zzmaVar) {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        return zzxiVar != null && zzxiVar.zzm(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        return zzxiVar != null && zzxiVar.zzn();
    }

    public final void zzo(long j) {
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzf;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzxhVar.zzp(this);
    }

    public final long zzq() {
        return this.zzg;
    }

    public final void zzr(com.google.android.gms.internal.ads.zzxm zzxmVar) {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzd == null);
        this.zzd = zzxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzze zzzeVar) {
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzf;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzxhVar.zzs(this);
    }

    public final void zzt(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        long zzv = zzv(this.zzb);
        com.google.android.gms.internal.ads.zzxm zzxmVar = this.zzd;
        zzxmVar.getClass();
        com.google.android.gms.internal.ads.zzxi zzG = zzxmVar.zzG(zzxkVar, this.zzc, zzv);
        this.zze = zzG;
        if (this.zzf != null) {
            zzG.zzb(this, zzv);
        }
    }

    public final void zzu() {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zze;
        if (zzxiVar != null) {
            com.google.android.gms.internal.ads.zzxm zzxmVar = this.zzd;
            zzxmVar.getClass();
            zzxmVar.zzD(zzxiVar);
        }
    }
}
