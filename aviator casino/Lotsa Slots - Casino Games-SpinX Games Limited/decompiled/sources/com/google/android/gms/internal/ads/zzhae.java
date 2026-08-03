package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhae {
    private int[] zza;
    private int zzb = 0;

    zzhae(int i) {
        this.zza = new int[i];
    }

    public final com.google.android.gms.internal.ads.zzhae zza(int i) {
        int i2 = this.zzb;
        int i3 = i2 + 1;
        int[] iArr = this.zza;
        int length = iArr.length;
        if (i3 > length) {
            int i4 = length + (length >> 1) + 1;
            if (i4 < i3) {
                int highestOneBit = java.lang.Integer.highestOneBit(i2);
                i4 = highestOneBit + highestOneBit;
            }
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            this.zza = java.util.Arrays.copyOf(iArr, i4);
        }
        int[] iArr2 = this.zza;
        int i5 = this.zzb;
        iArr2[i5] = i;
        this.zzb = i5 + 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhaf zzb() {
        com.google.android.gms.internal.ads.zzhaf zzhafVar;
        int i = this.zzb;
        if (i != 0) {
            return new com.google.android.gms.internal.ads.zzhaf(this.zza, 0, i, null);
        }
        zzhafVar = com.google.android.gms.internal.ads.zzhaf.zza;
        return zzhafVar;
    }
}
