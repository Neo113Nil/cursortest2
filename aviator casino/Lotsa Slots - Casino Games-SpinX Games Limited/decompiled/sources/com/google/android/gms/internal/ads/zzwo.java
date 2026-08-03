package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzwo implements com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzxh {
    public final com.google.android.gms.internal.ads.zzxi zza;
    long zzb;
    private com.google.android.gms.internal.ads.zzxh zzc;
    private com.google.android.gms.internal.ads.zzwn[] zzd = new com.google.android.gms.internal.ads.zzwn[0];
    private long zze = 0;
    private long zzf = -9223372036854775807L;

    public zzwo(com.google.android.gms.internal.ads.zzxi zzxiVar, boolean z, long j, long j2) {
        this.zza = zzxiVar;
        this.zzb = j2;
    }

    private static long zzt(long j, long j2, long j3) {
        long max = java.lang.Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? java.lang.Math.min(max, j3) : max;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(com.google.android.gms.internal.ads.zzxh zzxhVar, long j) {
        this.zzc = zzxhVar;
        this.zza.zzb(this, j);
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
        int length = zzzcVarArr.length;
        this.zzd = new com.google.android.gms.internal.ads.zzwn[length];
        com.google.android.gms.internal.ads.zzzc[] zzzcVarArr2 = new com.google.android.gms.internal.ads.zzzc[length];
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzzc zzzcVar = null;
            if (i >= zzzcVarArr.length) {
                break;
            }
            com.google.android.gms.internal.ads.zzwn[] zzwnVarArr = this.zzd;
            com.google.android.gms.internal.ads.zzwn zzwnVar = (com.google.android.gms.internal.ads.zzwn) zzzcVarArr[i];
            zzwnVarArr[i] = zzwnVar;
            if (zzwnVar != null) {
                zzzcVar = zzwnVar.zza;
            }
            zzzcVarArr2[i] = zzzcVar;
            i++;
        }
        long zze = this.zza.zze(zzabaVarArr, zArr, zzzcVarArr2, zArr2, j);
        long zzt = zzt(zze, j, this.zzb);
        long j2 = -9223372036854775807L;
        if (zzo()) {
            if (zze >= j) {
                if (zze != 0) {
                    for (com.google.android.gms.internal.ads.zzaba zzabaVar : zzabaVarArr) {
                        if (zzabaVar != null) {
                            com.google.android.gms.internal.ads.zzv zzc = zzabaVar.zzc();
                            if (!com.google.android.gms.internal.ads.zzas.zzd(zzc.zzp, zzc.zzk)) {
                            }
                        }
                    }
                }
            }
            j2 = zzt;
            break;
        }
        this.zze = j2;
        for (int i2 = 0; i2 < zzzcVarArr.length; i2++) {
            com.google.android.gms.internal.ads.zzzc zzzcVar2 = zzzcVarArr2[i2];
            if (zzzcVar2 == null) {
                this.zzd[i2] = null;
            } else {
                com.google.android.gms.internal.ads.zzwn[] zzwnVarArr2 = this.zzd;
                com.google.android.gms.internal.ads.zzwn zzwnVar2 = zzwnVarArr2[i2];
                if (zzwnVar2 == null || zzwnVar2.zza != zzzcVar2) {
                    zzwnVarArr2[i2] = new com.google.android.gms.internal.ads.zzwn(this, zzzcVar2);
                }
            }
            zzzcVarArr[i2] = this.zzd[i2];
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            this.zzf = j;
            long zzh = zzh();
            return zzh != -9223372036854775807L ? zzh : j;
        }
        long zzh2 = this.zza.zzh();
        if (zzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long zzt = zzt(zzh2, 0L, this.zzb);
        if (zzt == this.zzf) {
            return -9223372036854775807L;
        }
        this.zzf = zzt;
        return zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzi < j) {
                return zzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j) {
        this.zze = -9223372036854775807L;
        for (com.google.android.gms.internal.ads.zzwn zzwnVar : this.zzd) {
            if (zzwnVar != null) {
                zzwnVar.zza();
            }
        }
        return zzt(this.zza.zzj(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j, com.google.android.gms.internal.ads.zzni zzniVar) {
        com.google.android.gms.internal.ads.zzni zzniVar2 = zzniVar;
        if (j == 0) {
            return 0L;
        }
        long j2 = zzniVar2.zzd;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        long max = java.lang.Math.max(0L, java.lang.Math.min(j2, j));
        long j3 = zzniVar2.zze;
        long j4 = this.zzb;
        long max2 = java.lang.Math.max(0L, java.lang.Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (max != j2 || max2 != j3) {
            zzniVar2 = new com.google.android.gms.internal.ads.zzni(max, max2);
        }
        return this.zza.zzk(j, zzniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzl < j) {
                return zzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(com.google.android.gms.internal.ads.zzma zzmaVar) {
        return this.zza.zzm(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zza.zzn();
    }

    final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    final /* synthetic */ long zzq() {
        return this.zzf;
    }

    final /* synthetic */ void zzr(long j) {
        this.zzf = -9223372036854775807L;
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
