package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzht {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzht(float f7, float f8, long j, float f9, long j3, long j7, float f10, zzhs zzhsVar) {
        this.zza = j3;
        this.zzb = j7;
    }

    private static long zzf(long j, long j3, float f7) {
        return (long) ((j3 * 9.999871E-4f) + (j * 0.999f));
    }

    private final void zzg() {
        long j;
        long j3 = this.zzc;
        if (j3 != -9223372036854775807L) {
            j = this.zzd;
            if (j == -9223372036854775807L) {
                long j7 = this.zzf;
                if (j7 != -9223372036854775807L && j3 < j7) {
                    j3 = j7;
                }
                j = this.zzg;
                if (j == -9223372036854775807L || j3 <= j) {
                    j = j3;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j, long j3) {
        long j7;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j8 = j - j3;
        long j9 = this.zzm;
        if (j9 == -9223372036854775807L) {
            this.zzm = j8;
            this.zzn = 0L;
        } else {
            long max = Math.max(j8, zzf(j9, j8, 0.999f));
            this.zzm = max;
            this.zzn = zzf(this.zzn, Math.abs(j8 - max), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j10 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j10) {
            float zzs = zzen.zzs(1000L);
            long[] jArr = {j10, this.zze, this.zzh - (((long) ((this.zzk - 1.0f) * zzs)) + ((long) ((this.zzi - 1.0f) * zzs)))};
            j7 = jArr[0];
            for (int i7 = 1; i7 < 3; i7++) {
                long j11 = jArr[i7];
                if (j11 > j7) {
                    j7 = j11;
                }
            }
            this.zzh = j7;
        } else {
            long max2 = j - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j12 = this.zzh;
            int i8 = zzen.zza;
            long max3 = Math.max(j12, Math.min(max2, j10));
            this.zzh = max3;
            long j13 = this.zzg;
            if (j13 == -9223372036854775807L || max3 <= j13) {
                j7 = max3;
            } else {
                this.zzh = j13;
                j7 = j13;
            }
        }
        long j14 = j - j7;
        if (Math.abs(j14) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float max4 = Math.max(this.zzj, Math.min((j14 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = max4;
        return max4;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = j + this.zzb;
        this.zzh = j3;
        long j7 = this.zzg;
        if (j7 != -9223372036854775807L && j3 > j7) {
            this.zzh = j7;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzaj zzajVar) {
        long j = zzajVar.zza;
        this.zzc = zzen.zzs(-9223372036854775807L);
        this.zzf = zzen.zzs(-9223372036854775807L);
        this.zzg = zzen.zzs(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j) {
        this.zzd = j;
        zzg();
    }
}
