package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzei {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzei() {
        throw null;
    }

    public zzei(int i) {
        int i2 = 16;
        if (java.lang.Integer.bitCount(16) != 1) {
            int highestOneBit = java.lang.Integer.highestOneBit(15);
            i2 = highestOneBit + highestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new long[i2];
        this.zze = r3.length - 1;
    }

    public final void zza(long j) {
        int i = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i == length) {
            int i2 = length + length;
            if (i2 < 0) {
                throw new java.lang.IllegalStateException();
            }
            long[] jArr2 = new long[i2];
            int i3 = this.zza;
            int i4 = length - i3;
            java.lang.System.arraycopy(jArr, i3, jArr2, 0, i4);
            java.lang.System.arraycopy(this.zzd, 0, jArr2, i4, i3);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i5 = (this.zzb + 1) & this.zze;
        this.zzb = i5;
        jArr[i5] = j;
        this.zzc++;
    }

    public final long zzb() {
        int i = this.zzc;
        if (i == 0) {
            throw new java.util.NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i2 = this.zza;
        long j = jArr[i2];
        this.zza = this.zze & (i2 + 1);
        this.zzc = i - 1;
        return j;
    }

    public final long zzc() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new java.util.NoSuchElementException();
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }

    public final void zze() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }
}
