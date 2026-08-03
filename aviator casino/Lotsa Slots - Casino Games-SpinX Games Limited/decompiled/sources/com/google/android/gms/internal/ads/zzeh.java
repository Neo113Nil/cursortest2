package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeh {
    private int zza;
    private long[] zzb;

    public zzeh() {
        this(32);
    }

    public final void zza(long j) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = java.util.Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i2 = this.zza;
        this.zza = i2 + 1;
        jArr2[i2] = 0;
    }

    public final void zzb(long[] jArr) {
        int i = this.zza;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.zzb = java.util.Arrays.copyOf(jArr2, java.lang.Math.max(length2 + length2, i2));
        }
        java.lang.System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i2;
    }

    public final long zzc(int i) {
        if (i >= 0 && i < this.zza) {
            return this.zzb[i];
        }
        int i2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 24 + java.lang.String.valueOf(i2).length());
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final int zzd() {
        return this.zza;
    }

    public zzeh(int i) {
        this.zzb = new long[i];
    }
}
