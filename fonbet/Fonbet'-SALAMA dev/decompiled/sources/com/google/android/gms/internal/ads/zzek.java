package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzek {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzek(long j) {
        zzi(0L);
    }

    public static long zzg(long j) {
        return zzen.zzu(j, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzh(long j) {
        return zzen.zzu(j, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!zzj()) {
                long j3 = this.zza;
                if (j3 == 9223372036854775806L) {
                    Long l7 = (Long) this.zzd.get();
                    if (l7 == null) {
                        throw null;
                    }
                    j3 = l7.longValue();
                }
                this.zzb = j3 - j;
                notifyAll();
            }
            this.zzc = j;
            return j + this.zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzb(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.zzc;
            if (j3 != -9223372036854775807L) {
                long zzh = zzh(j3);
                long j7 = (4294967296L + zzh) / 8589934592L;
                long j8 = (((-1) + j7) * 8589934592L) + j;
                long j9 = (j7 * 8589934592L) + j;
                j = Math.abs(j8 - zzh) < Math.abs(j9 - zzh) ? j8 : j9;
            }
            return zza(zzg(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzc(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.zzc;
            if (j3 != -9223372036854775807L) {
                long zzh = zzh(j3);
                long j7 = zzh / 8589934592L;
                long j8 = (j7 * 8589934592L) + j;
                j = j8 >= zzh ? j8 : ((j7 + 1) * 8589934592L) + j;
            }
            return zza(zzg(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzd() {
        long j = this.zza;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zze() {
        long j;
        try {
            j = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        return this.zzb != -9223372036854775807L;
    }
}
