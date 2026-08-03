package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfi {
    private long zza;
    private long zzb;
    private long zzc;
    private final java.lang.ThreadLocal zzd = new java.lang.ThreadLocal();

    public zzfi(long j) {
        zzd(0L);
    }

    public static long zzi(long j) {
        return com.google.android.gms.internal.ads.zzfl.zzv(j, 1000000L, 90000L, java.math.RoundingMode.DOWN);
    }

    public static long zzj(long j) {
        return com.google.android.gms.internal.ads.zzfl.zzv(j, 90000L, 1000000L, java.math.RoundingMode.DOWN);
    }

    public final synchronized long zza() {
        long j = this.zza;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zzb() {
        long j;
        j = this.zzc;
        return j != -9223372036854775807L ? j + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long zzj = zzj(j2);
            long j3 = (4294967296L + zzj) / 8589934592L;
            long j4 = (((-1) + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (java.lang.Math.abs(j4 - zzj) < java.lang.Math.abs(j - zzj)) {
                j = j4;
            }
        }
        return zzg(zzi(j));
    }

    public final synchronized long zzf(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long zzj = zzj(j2);
            long j3 = zzj / 8589934592L;
            java.lang.Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            j += (j3 + 1) * 8589934592L;
            if (j4 >= zzj) {
                j = j4;
            }
        }
        return zzg(zzi(j));
    }

    public final synchronized long zzg(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!zzh()) {
            long j2 = this.zza;
            if (j2 == 9223372036854775806L) {
                java.lang.Long l = (java.lang.Long) this.zzd.get();
                l.getClass();
                java.lang.Long l2 = l;
                j2 = l.longValue();
            }
            this.zzb = j2 - j;
            notifyAll();
        }
        this.zzc = j;
        return j + this.zzb;
    }

    public final synchronized boolean zzh() {
        return this.zzb != -9223372036854775807L;
    }
}
