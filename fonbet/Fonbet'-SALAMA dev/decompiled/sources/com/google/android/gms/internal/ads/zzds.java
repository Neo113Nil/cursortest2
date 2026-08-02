package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class zzds {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzds() {
        throw null;
    }

    public final long zza() {
        if (this.zzb != 0) {
            return this.zzc[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i7 = this.zzb;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzc;
        int i8 = this.zza;
        long j = jArr[i8];
        this.zza = this.zzd & (i8 + 1);
        this.zzb = i7 - 1;
        return j;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzd() {
        return this.zzb == 0;
    }

    public zzds(int i7) {
        int i8 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i8 = highestOneBit + highestOneBit;
        }
        this.zza = 0;
        this.zzb = 0;
        this.zzc = new long[i8];
        this.zzd = r3.length - 1;
    }
}
