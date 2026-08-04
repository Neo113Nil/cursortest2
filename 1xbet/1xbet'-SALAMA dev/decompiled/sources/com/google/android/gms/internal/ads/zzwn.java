package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class zzwn {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwn(int i7) {
        this(0, new Random());
    }

    public final int zza() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int zzb() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zzc() {
        return this.zzb.length;
    }

    public final int zzd(int i7) {
        int i8 = this.zzc[i7] + 1;
        int[] iArr = this.zzb;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    public final int zze(int i7) {
        int i8 = this.zzc[i7] - 1;
        if (i8 >= 0) {
            return this.zzb[i8];
        }
        return -1;
    }

    public final zzwn zzf() {
        return new zzwn(0, new Random(this.zza.nextLong()));
    }

    public final zzwn zzg(int i7, int i8) {
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        int i9 = 0;
        int i10 = 0;
        while (i10 < i8) {
            iArr[i10] = this.zza.nextInt(this.zzb.length + 1);
            int i11 = i10 + 1;
            int iNextInt = this.zza.nextInt(i11);
            iArr2[i10] = iArr2[iNextInt];
            iArr2[iNextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.zzb.length + i8];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr4 = this.zzb;
            if (i9 >= iArr4.length + i8) {
                return new zzwn(iArr3, new Random(this.zza.nextLong()));
            }
            if (i12 >= i8 || i13 != iArr[i12]) {
                int i14 = i13 + 1;
                int i15 = iArr4[i13];
                iArr3[i9] = i15;
                if (i15 >= 0) {
                    iArr3[i9] = i15 + i8;
                }
                i13 = i14;
            } else {
                iArr3[i9] = iArr2[i12];
                i12++;
            }
            i9++;
        }
    }

    public final zzwn zzh(int i7, int i8) {
        int[] iArr = new int[this.zzb.length - i8];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.zzb;
            if (i9 >= iArr2.length) {
                return new zzwn(iArr, new Random(this.zza.nextLong()));
            }
            int i11 = iArr2[i9];
            if (i11 < 0 || i11 >= i8) {
                int i12 = i9 - i10;
                if (i11 >= 0) {
                    i11 -= i8;
                }
                iArr[i12] = i11;
            } else {
                i10++;
            }
            i9++;
        }
    }

    private zzwn(int i7, Random random) {
        this(new int[0], random);
    }

    private zzwn(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.zzc[iArr[i7]] = i7;
        }
    }
}
