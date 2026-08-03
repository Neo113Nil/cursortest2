package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamo implements com.google.android.gms.internal.ads.zzamv {
    private final com.google.android.gms.internal.ads.zzamu zza;
    private final long zzb;
    private final long zzc;
    private final com.google.android.gms.internal.ads.zzamz zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzamo(com.google.android.gms.internal.ads.zzamz zzamzVar, long j, long j2, long j3, long j4, boolean z) {
        com.google.android.gms.internal.ads.zzgtj.zza(j >= 0 && j2 > j);
        this.zzd = zzamzVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new com.google.android.gms.internal.ads.zzamu();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzh = java.lang.Math.max(0L, java.lang.Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzahb zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new com.google.android.gms.internal.ads.zzamn(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzamz zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        long max;
        int i = this.zze;
        if (i == 0) {
            long zzn = zzafzVar.zzn();
            this.zzg = zzn;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > zzn) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.zzi;
                long j3 = this.zzj;
                if (j2 != j3) {
                    long zzn2 = zzafzVar.zzn();
                    com.google.android.gms.internal.ads.zzamu zzamuVar = this.zza;
                    if (zzamuVar.zzb(zzafzVar, j3)) {
                        zzamuVar.zzc(zzafzVar, false);
                        zzafzVar.zzl();
                        long j4 = this.zzh;
                        long j5 = zzamuVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzamuVar.zzd + zzamuVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = zzn2;
                                this.zzl = j5;
                            } else {
                                this.zzi = i2 + zzafzVar.zzn();
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.zzj = j8;
                                max = j8;
                            } else {
                                long j10 = i2;
                                long j11 = j6 <= 0 ? 2L : 1L;
                                java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                                max = java.lang.Math.max(j8, java.lang.Math.min((zzafzVar.zzn() - (j10 * j11)) + ((j6 * j9) / (this.zzl - this.zzk)), j7 - 1));
                            }
                        }
                    } else {
                        max = this.zzi;
                        if (max == zzn2) {
                            throw new java.io.IOException("No ogg page can be found.");
                        }
                    }
                    if (max == -1) {
                        return max;
                    }
                    this.zze = 3;
                }
                max = -1;
                if (max == -1) {
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                com.google.android.gms.internal.ads.zzamu zzamuVar2 = this.zza;
                zzamuVar2.zzb(zzafzVar, -1L);
                zzamuVar2.zzc(zzafzVar, false);
                if (zzamuVar2.zzb > this.zzh) {
                    zzafzVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                zzafzVar.zzf(zzamuVar2.zzd + zzamuVar2.zze);
                this.zzi = zzafzVar.zzn();
                this.zzk = zzamuVar2.zzb;
            }
        }
        com.google.android.gms.internal.ads.zzamu zzamuVar3 = this.zza;
        zzamuVar3.zza();
        if (!zzamuVar3.zzb(zzafzVar, -1L)) {
            throw new java.io.EOFException();
        }
        zzamuVar3.zzc(zzafzVar, false);
        zzafzVar.zzf(zzamuVar3.zzd + zzamuVar3.zze);
        long j12 = zzamuVar3.zzb;
        while ((zzamuVar3.zza & 4) != 4 && zzamuVar3.zzb(zzafzVar, -1L) && zzafzVar.zzn() < this.zzc && zzamuVar3.zzc(zzafzVar, true) && com.google.android.gms.internal.ads.zzagc.zzd(zzafzVar, zzamuVar3.zzd + zzamuVar3.zze)) {
            j12 = zzamuVar3.zzb;
        }
        this.zzf = j12;
        this.zze = 4;
        return this.zzg;
    }
}
