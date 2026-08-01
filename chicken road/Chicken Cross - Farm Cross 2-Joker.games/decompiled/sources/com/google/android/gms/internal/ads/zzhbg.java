package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhbg {
    private long[] zza;
    private int zzb = 0;

    zzhbg(int i) {
        this.zza = new long[i];
    }

    public final zzhbg zza(long j) {
        int i = this.zzb;
        int i2 = i + 1;
        long[] jArr = this.zza;
        int length = jArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(jArr, i3);
        }
        long[] jArr2 = this.zza;
        int i4 = this.zzb;
        jArr2[i4] = j;
        this.zzb = i4 + 1;
        return this;
    }

    public final zzhbh zzb() {
        zzhbh zzhbhVar;
        int i = this.zzb;
        if (i != 0) {
            return new zzhbh(this.zza, 0, i, null);
        }
        zzhbhVar = zzhbh.zza;
        return zzhbhVar;
    }
}
