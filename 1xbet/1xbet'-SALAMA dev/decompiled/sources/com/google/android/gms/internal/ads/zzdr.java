package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr {
    private int zza;
    private long[] zzb;

    public zzdr() {
        throw null;
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i7) {
        if (i7 < 0 || i7 >= this.zza) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, this.zza, "Invalid index ", ", size is "));
        }
        return this.zzb[i7];
    }

    public final void zzc(long j) {
        int i7 = this.zza;
        long[] jArr = this.zzb;
        if (i7 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i7 + i7);
        }
        long[] jArr2 = this.zzb;
        int i8 = this.zza;
        this.zza = i8 + 1;
        jArr2[i8] = j;
    }

    public final void zzd(long[] jArr) {
        int i7 = this.zza;
        int length = jArr.length;
        int i8 = i7 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i8 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i8));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i8;
    }

    public zzdr(int i7) {
        this.zzb = new long[i7];
    }
}
