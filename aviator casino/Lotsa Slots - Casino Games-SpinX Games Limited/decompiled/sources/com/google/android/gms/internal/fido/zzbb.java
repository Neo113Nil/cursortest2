package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
final class zzbb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final java.lang.String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzbb(java.lang.String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            com.google.android.gms.internal.fido.zzam.zzd(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            com.google.android.gms.internal.fido.zzam.zzd(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.fido.zzbb) {
            com.google.android.gms.internal.fido.zzbb zzbbVar = (com.google.android.gms.internal.fido.zzbb) obj;
            boolean z = zzbbVar.zzh;
            if (java.util.Arrays.equals(this.zzf, zzbbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zzf) + 1237;
    }

    public final java.lang.String toString() {
        return this.zze;
    }

    final char zza(int i) {
        return this.zzf[i];
    }

    public final boolean zzb(char c) {
        return this.zzg[61] != -1;
    }

    private zzbb(java.lang.String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = com.google.android.gms.internal.fido.zzbh.zzb(length, java.math.RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(zzb);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[com.google.android.gms.internal.fido.zzbh.zza(i2 * 8, this.zzb, java.math.RoundingMode.CEILING)] = true;
            }
            this.zzh = false;
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }
}
