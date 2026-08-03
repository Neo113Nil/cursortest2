package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgzc {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final java.lang.String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzgzc(java.lang.String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            com.google.android.gms.internal.ads.zzgtj.zzc(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            com.google.android.gms.internal.ads.zzgtj.zzc(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzgzc) {
            com.google.android.gms.internal.ads.zzgzc zzgzcVar = (com.google.android.gms.internal.ads.zzgzc) obj;
            if (this.zzi == zzgzcVar.zzi && java.util.Arrays.equals(this.zzf, zzgzcVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return this.zze;
    }

    final char zza(int i) {
        return this.zzf[i];
    }

    final boolean zzb(int i) {
        return this.zzh[i % this.zzc];
    }

    final int zzc(char c) throws com.google.android.gms.internal.ads.zzgzf {
        if (c > 127) {
            java.lang.String hexString = java.lang.Integer.toHexString(c);
            java.lang.String.valueOf(hexString);
            throw new com.google.android.gms.internal.ads.zzgzf("Unrecognized character: 0x".concat(java.lang.String.valueOf(hexString)));
        }
        byte b = this.zzg[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            java.lang.String hexString2 = java.lang.Integer.toHexString(c);
            java.lang.String.valueOf(hexString2);
            throw new com.google.android.gms.internal.ads.zzgzf("Unrecognized character: 0x".concat(java.lang.String.valueOf(hexString2)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(c).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c);
        throw new com.google.android.gms.internal.ads.zzgzf(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    final com.google.android.gms.internal.ads.zzgzc zzd() {
        boolean z;
        int i = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i >= length) {
                return this;
            }
            if (com.google.android.gms.internal.ads.zzgss.zzd(cArr[i])) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (com.google.android.gms.internal.ads.zzgss.zzc(cArr[i2])) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                com.google.android.gms.internal.ads.zzgtj.zzj(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i3 = 0; i3 < cArr.length; i3++) {
                    char c = cArr[i3];
                    if (com.google.android.gms.internal.ads.zzgss.zzd(c)) {
                        c ^= 32;
                    }
                    cArr2[i3] = (char) c;
                }
                com.google.android.gms.internal.ads.zzgzc zzgzcVar = new com.google.android.gms.internal.ads.zzgzc(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgzcVar.zzi) {
                    return zzgzcVar;
                }
                byte[] bArr = zzgzcVar.zzg;
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                for (int i4 = 65; i4 <= 90; i4++) {
                    int i5 = i4 | 32;
                    byte b = bArr[i4];
                    byte b2 = bArr[i5];
                    if (b == -1) {
                        copyOf[i4] = b2;
                    } else {
                        char c2 = (char) i4;
                        char c3 = (char) i5;
                        if (b2 != -1) {
                            throw new java.lang.IllegalStateException(com.google.android.gms.internal.ads.zzgua.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", java.lang.Character.valueOf(c2), java.lang.Character.valueOf(c3)));
                        }
                        copyOf[i5] = b;
                    }
                }
                return new com.google.android.gms.internal.ads.zzgzc(zzgzcVar.zze.concat(".ignoreCase()"), zzgzcVar.zzf, copyOf, true);
            }
            i++;
        }
    }

    public final boolean zze(char c) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzgzc(java.lang.String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zza = com.google.android.gms.internal.ads.zzgzz.zza(length, java.math.RoundingMode.UNNECESSARY);
            this.zzb = zza;
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(zza);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i;
            this.zzd = zza >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[com.google.android.gms.internal.ads.zzgzz.zzb(i2 * 8, this.zzb, java.math.RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z;
        } catch (java.lang.ArithmeticException e) {
            int length2 = cArr.length;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length2).length() + 24);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }
}
