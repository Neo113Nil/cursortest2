package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhbe {
    private int[] zza;
    private int zzb = 0;

    zzhbe(int i) {
        this.zza = new int[i];
    }

    public final zzhbe zza(int i) {
        int i2 = this.zzb;
        int i3 = i2 + 1;
        int[] iArr = this.zza;
        int length = iArr.length;
        if (i3 > length) {
            int i4 = length + (length >> 1) + 1;
            if (i4 < i3) {
                int highestOneBit = Integer.highestOneBit(i2);
                i4 = highestOneBit + highestOneBit;
            }
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(iArr, i4);
        }
        int[] iArr2 = this.zza;
        int i5 = this.zzb;
        iArr2[i5] = i;
        this.zzb = i5 + 1;
        return this;
    }

    public final zzhbf zzb() {
        zzhbf zzhbfVar;
        int i = this.zzb;
        if (i != 0) {
            return new zzhbf(this.zza, 0, i, null);
        }
        zzhbfVar = zzhbf.zza;
        return zzhbfVar;
    }
}
