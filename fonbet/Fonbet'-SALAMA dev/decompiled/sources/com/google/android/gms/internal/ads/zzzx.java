package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzzx {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final long zza() {
        long j = this.zze;
        if (j == 0) {
            return 0L;
        }
        return this.zzf / j;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long j) {
        long j3 = this.zzd;
        if (j3 == 0) {
            this.zza = j;
        } else if (j3 == 1) {
            long j7 = j - this.zza;
            this.zzb = j7;
            this.zzf = j7;
            this.zze = 1L;
        } else {
            long j8 = j - this.zzc;
            int i7 = (int) (j3 % 15);
            if (Math.abs(j8 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j8;
                boolean[] zArr = this.zzg;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i7]) {
                    zArr2[i7] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long j = this.zzd;
        if (j == 0) {
            return false;
        }
        return this.zzg[(int) ((j - 1) % 15)];
    }

    public final boolean zzf() {
        return this.zzd > 15 && this.zzh == 0;
    }
}
