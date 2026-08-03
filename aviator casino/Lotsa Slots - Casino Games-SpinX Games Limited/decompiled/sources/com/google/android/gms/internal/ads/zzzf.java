package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzf {
    private final java.util.Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzzf(int i) {
        this(0, new java.util.Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final int zzb(int i) {
        int i2 = this.zzc[i] + 1;
        int[] iArr = this.zzb;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int zzc(int i) {
        int i2 = this.zzc[i] - 1;
        if (i2 >= 0) {
            return this.zzb[i2];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final com.google.android.gms.internal.ads.zzzf zzf(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            java.util.Random random = this.zza;
            iArr[i3] = random.nextInt(this.zzb.length + 1);
            int i4 = i3 + 1;
            int nextInt = random.nextInt(i4);
            iArr2[i3] = iArr2[nextInt];
            iArr2[nextInt] = i3;
            i3 = i4;
        }
        java.util.Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr3.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr3[i6];
                iArr4[i7] = i9;
                if (i9 >= 0) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr2[i5];
                i5++;
            }
        }
        return new com.google.android.gms.internal.ads.zzzf(iArr4, new java.util.Random(this.zza.nextLong()));
    }

    public final com.google.android.gms.internal.ads.zzzf zzg() {
        return new com.google.android.gms.internal.ads.zzzf(0, new java.util.Random(this.zza.nextLong()));
    }

    private zzzf(int i, java.util.Random random) {
        this(new int[0], random);
    }

    private zzzf(int[] iArr, java.util.Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.zzc[iArr[i]] = i;
        }
    }
}
