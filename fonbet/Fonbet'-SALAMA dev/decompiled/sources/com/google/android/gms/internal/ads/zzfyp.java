package com.google.android.gms.internal.ads;

import e1.k;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzfyp {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzfyp(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c3 = cArr[i7];
            boolean z4 = true;
            zzfth.zzg(c3 < 128, "Non-ASCII character: %s", c3);
            if (bArr[c3] != -1) {
                z4 = false;
            }
            zzfth.zzg(z4, "Duplicate character: %s", c3);
            bArr[c3] = (byte) i7;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyp) {
            zzfyp zzfypVar = (zzfyp) obj;
            if (this.zzi == zzfypVar.zzi && Arrays.equals(this.zzf, zzfypVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i7) {
        return this.zzf[i7];
    }

    public final int zzb(char c3) {
        if (c3 > 127) {
            throw new zzfys("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c3))));
        }
        byte b7 = this.zzg[c3];
        if (b7 != -1) {
            return b7;
        }
        if (c3 <= ' ' || c3 == 127) {
            throw new zzfys("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c3))));
        }
        throw new zzfys("Unrecognized character: " + c3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    public final zzfyp zzc() {
        boolean z4;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i8 >= cArr.length) {
                return this;
            }
            if (zzfsn.zze(cArr[i8])) {
                int i9 = 0;
                while (true) {
                    if (i9 >= cArr.length) {
                        z4 = false;
                        break;
                    }
                    if (zzfsn.zzd(cArr[i9])) {
                        z4 = true;
                        break;
                    }
                    i9++;
                }
                zzfth.zzm(!z4, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i7 >= cArr3.length) {
                        break;
                    }
                    char c3 = cArr3[i7];
                    if (zzfsn.zze(c3)) {
                        c3 ^= 32;
                    }
                    cArr2[i7] = (char) c3;
                    i7++;
                }
                zzfyp zzfypVar = new zzfyp(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzfypVar.zzi) {
                    return zzfypVar;
                }
                byte[] bArr = zzfypVar.zzg;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i10 = 65; i10 <= 90; i10++) {
                    int i11 = i10 | 32;
                    byte[] bArr2 = zzfypVar.zzg;
                    byte b7 = bArr2[i10];
                    byte b8 = bArr2[i11];
                    if (b7 == -1) {
                        copyOf[i10] = b8;
                    } else {
                        char c4 = (char) i10;
                        char c7 = (char) i11;
                        if (b8 != -1) {
                            throw new IllegalStateException(zzfty.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c7)));
                        }
                        copyOf[i11] = b7;
                    }
                }
                return new zzfyp(zzfypVar.zze.concat(".ignoreCase()"), zzfypVar.zzf, copyOf, true);
            }
            i8++;
        }
    }

    public final boolean zzd(int i7) {
        return this.zzh[i7 % this.zzc];
    }

    public final boolean zze(char c3) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzfyp(String str, char[] cArr, byte[] bArr, boolean z4) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzc = zzfzd.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = zzc;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzc);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = zzc >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.zzd; i8++) {
                zArr[zzfzd.zzb(i8 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z4;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(k.d(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
