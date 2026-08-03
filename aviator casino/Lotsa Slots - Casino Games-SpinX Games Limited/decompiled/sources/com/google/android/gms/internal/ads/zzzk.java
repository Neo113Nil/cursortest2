package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzzk implements com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzxh {
    private final com.google.android.gms.internal.ads.zzxi zza;
    private final long zzb;
    private com.google.android.gms.internal.ads.zzxh zzc;

    public zzzk(com.google.android.gms.internal.ads.zzxi zzxiVar, long j) {
        this.zza = zzxiVar;
        this.zzb = j;
    }

    public final com.google.android.gms.internal.ads.zzxi zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(com.google.android.gms.internal.ads.zzxh zzxhVar, long j) {
        this.zzc = zzxhVar;
        this.zza.zzb(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() throws java.io.IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final com.google.android.gms.internal.ads.zzzn zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(com.google.android.gms.internal.ads.zzaba[] zzabaVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzzc[] zzzcVarArr, boolean[] zArr2, long j) {
        com.google.android.gms.internal.ads.zzzc[] zzzcVarArr2 = new com.google.android.gms.internal.ads.zzzc[zzzcVarArr.length];
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzzc zzzcVar = null;
            if (i >= zzzcVarArr.length) {
                break;
            }
            com.google.android.gms.internal.ads.zzzj zzzjVar = (com.google.android.gms.internal.ads.zzzj) zzzcVarArr[i];
            if (zzzjVar != null) {
                zzzcVar = zzzjVar.zza();
            }
            zzzcVarArr2[i] = zzzcVar;
            i++;
        }
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zza;
        long j2 = this.zzb;
        long zze = zzxiVar.zze(zzabaVarArr, zArr, zzzcVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzzcVarArr.length; i2++) {
            com.google.android.gms.internal.ads.zzzc zzzcVar2 = zzzcVarArr2[i2];
            if (zzzcVar2 == null) {
                zzzcVarArr[i2] = null;
            } else {
                com.google.android.gms.internal.ads.zzzc zzzcVar3 = zzzcVarArr[i2];
                if (zzzcVar3 == null || ((com.google.android.gms.internal.ads.zzzj) zzzcVar3).zza() != zzzcVar2) {
                    zzzcVarArr[i2] = new com.google.android.gms.internal.ads.zzzj(zzzcVar2, j2);
                }
            }
        }
        return zze + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j) {
        this.zza.zzg(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        long zzh = this.zza.zzh();
        if (zzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j) {
        long j2 = this.zzb;
        return this.zza.zzj(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j, com.google.android.gms.internal.ads.zzni zzniVar) {
        long j2 = this.zzb;
        return this.zza.zzk(j - j2, zzniVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(com.google.android.gms.internal.ads.zzma zzmaVar) {
        long j = zzmaVar.zza;
        long j2 = this.zzb;
        com.google.android.gms.internal.ads.zzlz zza = zzmaVar.zza();
        zza.zza(j - j2);
        return this.zza.zzm(zza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzze zzzeVar) {
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzc;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzc;
        zzxhVar.getClass();
        zzxhVar.zzp(this);
    }
}
