package com.google.android.recaptcha.internal;

import e1.k;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzhv {
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
    public zzhv(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c3 = cArr[i7];
            boolean z4 = true;
            zzgx.zzc(c3 < 128, "Non-ASCII character: %s", c3);
            if (bArr[c3] != -1) {
                z4 = false;
            }
            zzgx.zzc(z4, "Duplicate character: %s", c3);
            bArr[c3] = (byte) i7;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhv) {
            zzhv zzhvVar = (zzhv) obj;
            boolean z4 = zzhvVar.zzi;
            if (Arrays.equals(this.zzf, zzhvVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i7) {
        return this.zzf[i7];
    }

    public final int zzb(char c3) {
        if (c3 > 127) {
            throw new zzhx("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c3))));
        }
        byte b7 = this.zzg[c3];
        if (b7 != -1) {
            return b7;
        }
        if (c3 <= ' ' || c3 == 127) {
            throw new zzhx("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c3))));
        }
        throw new zzhx("Unrecognized character: " + c3);
    }

    public final boolean zzc(int i7) {
        return this.zzh[i7 % this.zzc];
    }

    public final boolean zzd(char c3) {
        return this.zzg[61] != -1;
    }

    private zzhv(String str, char[] cArr, byte[] bArr, boolean z4) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzib.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.zzd; i8++) {
                zArr[zzib.zza(i8 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(k.d(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
