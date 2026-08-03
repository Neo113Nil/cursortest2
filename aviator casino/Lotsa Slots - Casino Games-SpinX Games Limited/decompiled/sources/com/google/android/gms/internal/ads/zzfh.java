package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfh {
    private long[] zza;
    private java.lang.Object[] zzb;
    private int zzc;
    private int zzd;

    public zzfh() {
        throw null;
    }

    public zzfh(int i) {
        this.zza = new long[10];
        this.zzb = new java.lang.Object[10];
    }

    private final java.lang.Object zzf() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzd > 0);
        java.lang.Object[] objArr = this.zzb;
        int i = this.zzc;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.zzc = (i + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized void zza(long j, java.lang.Object obj) {
        if (this.zzd > 0) {
            if (j <= this.zza[((this.zzc + r0) - 1) % this.zzb.length]) {
                zzb();
            }
        }
        int length = this.zzb.length;
        if (this.zzd >= length) {
            int i = length + length;
            long[] jArr = new long[i];
            java.lang.Object[] objArr = new java.lang.Object[i];
            int i2 = this.zzc;
            int i3 = length - i2;
            java.lang.System.arraycopy(this.zza, i2, jArr, 0, i3);
            java.lang.System.arraycopy(this.zzb, this.zzc, objArr, 0, i3);
            int i4 = this.zzc;
            if (i4 > 0) {
                java.lang.System.arraycopy(this.zza, 0, jArr, i3, i4);
                java.lang.System.arraycopy(this.zzb, 0, objArr, i3, this.zzc);
            }
            this.zza = jArr;
            this.zzb = objArr;
            this.zzc = 0;
        }
        int i5 = this.zzc;
        int i6 = this.zzd;
        java.lang.Object[] objArr2 = this.zzb;
        int length2 = (i5 + i6) % objArr2.length;
        this.zza[length2] = j;
        objArr2[length2] = obj;
        this.zzd = i6 + 1;
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        java.util.Arrays.fill(this.zzb, (java.lang.Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    public final synchronized java.lang.Object zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized java.lang.Object zze(long j) {
        java.lang.Object obj;
        obj = null;
        while (this.zzd > 0 && j - this.zza[this.zzc] >= 0) {
            obj = zzf();
        }
        return obj;
    }
}
