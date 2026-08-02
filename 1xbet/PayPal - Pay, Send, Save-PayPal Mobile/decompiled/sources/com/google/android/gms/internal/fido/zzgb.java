package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzgb {
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
    zzgb(java.lang.String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            com.google.android.gms.internal.fido.zzbm.zzd(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            com.google.android.gms.internal.fido.zzbm.zzd(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.fido.zzgb)) {
            return false;
        }
        com.google.android.gms.internal.fido.zzgb zzgbVar = (com.google.android.gms.internal.fido.zzgb) obj;
        return this.zzh == zzgbVar.zzh && java.util.Arrays.equals(this.zzf, zzgbVar.zzf);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    final char zza(int i) {
        return this.zzf[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    final com.google.android.gms.internal.fido.zzgb zzb() {
        int i;
        boolean z;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i3 >= cArr.length) {
                return this;
            }
            if (com.google.android.gms.internal.fido.zzba.zza(cArr[i3])) {
                int i4 = 0;
                while (true) {
                    if (i4 >= cArr.length) {
                        z = false;
                        break;
                    }
                    char c = cArr[i4];
                    if (c >= 'A' && c <= 'Z') {
                        z = true;
                        break;
                    }
                    i4++;
                }
                com.google.android.gms.internal.fido.zzbm.zzf(!z, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i2 >= cArr3.length) {
                        break;
                    }
                    char c2 = cArr3[i2];
                    if (com.google.android.gms.internal.fido.zzba.zza(c2)) {
                        c2 ^= 32;
                    }
                    cArr2[i2] = (char) c2;
                    i2++;
                }
                com.google.android.gms.internal.fido.zzgb zzgbVar = new com.google.android.gms.internal.fido.zzgb(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzgbVar.zzh) {
                    return zzgbVar;
                }
                byte[] bArr = zzgbVar.zzg;
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                for (i = 65; i <= 90; i++) {
                    int i5 = i | 32;
                    byte[] bArr2 = zzgbVar.zzg;
                    byte b = bArr2[i];
                    byte b2 = bArr2[i5];
                    if (b == -1) {
                        copyOf[i] = b2;
                    } else {
                        char c3 = (char) i;
                        char c4 = (char) i5;
                        if (b2 != -1) {
                            throw new java.lang.IllegalStateException(com.google.android.gms.internal.fido.zzbo.zza("Can't ignoreCase() since '%s' and '%s' encode different values", java.lang.Character.valueOf(c3), java.lang.Character.valueOf(c4)));
                        }
                        copyOf[i5] = b;
                    }
                }
                return new com.google.android.gms.internal.fido.zzgb(zzgbVar.zze.concat(".ignoreCase()"), zzgbVar.zzf, copyOf, true);
            }
            i3++;
        }
    }

    public final boolean zzc(char c) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgb(java.lang.String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = com.google.android.gms.internal.fido.zzgh.zzb(length, java.math.RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(zzb);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[com.google.android.gms.internal.fido.zzgh.zza(i2 * 8, this.zzb, java.math.RoundingMode.CEILING)] = true;
            }
            this.zzh = z;
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final java.lang.String toString() {
        return this.zze;
    }
}
