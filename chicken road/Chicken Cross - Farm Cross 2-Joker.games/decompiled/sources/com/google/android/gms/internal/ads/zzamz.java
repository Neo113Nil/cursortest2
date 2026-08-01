package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzamz {
    public final zzamw zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final int[] zzh;
    public final long zzi;
    public final boolean zzj;

    public zzamz(zzamw zzamwVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzguk.zza(length == length2);
        zzguk.zza(jArr.length == length2);
        int length3 = iArr2.length;
        zzguk.zza(length3 == length2);
        this.zza = zzamwVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = iArr3;
        this.zzj = z;
        this.zzi = j;
        this.zzb = i2;
        if (length3 > 0) {
            int i3 = length3 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }

    public final boolean zza() {
        return this.zzf.length > 0;
    }

    public final int zzb(long j) {
        if (zza()) {
            int i = 0;
            if (this.zzj) {
                return zzfm.zzo(this.zzf, j, true, false);
            }
            int[] iArr = this.zzh;
            int length = iArr.length - 1;
            int i2 = -1;
            while (i <= length) {
                int i3 = ((length - i) / 2) + i;
                if (this.zzf[iArr[i3]] <= j) {
                    i = i3 + 1;
                    i2 = i3;
                } else {
                    length = i3 - 1;
                }
            }
            if (i2 != -1) {
                long[] jArr = this.zzf;
                long j2 = jArr[iArr[i2]];
                if (j2 == j) {
                    while (i2 > 0) {
                        int i4 = i2 - 1;
                        if (jArr[iArr[i4]] != j2) {
                            break;
                        }
                        i2 = i4;
                    }
                }
                return iArr[i2];
            }
        }
        return -1;
    }

    public final int zzc(long j) {
        if (zza()) {
            int i = 0;
            if (this.zzj) {
                return zzfm.zzq(this.zzf, j, true, false);
            }
            int[] iArr = this.zzh;
            int length = iArr.length - 1;
            int i2 = -1;
            while (i <= length) {
                int i3 = ((length - i) / 2) + i;
                if (this.zzf[iArr[i3]] >= j) {
                    length = i3 - 1;
                    i2 = i3;
                } else {
                    i = i3 + 1;
                }
            }
            if (i2 != -1) {
                long[] jArr = this.zzf;
                long j2 = jArr[iArr[i2]];
                if (j2 == j) {
                    while (i2 < iArr.length - 1) {
                        int i4 = i2 + 1;
                        if (jArr[iArr[i4]] != j2) {
                            break;
                        }
                        i2 = i4;
                    }
                }
                return iArr[i2];
            }
        }
        return -1;
    }
}
