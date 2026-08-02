package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzgh {
    public static int zzb(int i, java.math.RoundingMode roundingMode) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("x (0) must be > 0");
        }
        switch (com.google.android.gms.internal.fido.zzgg.zza[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.fido.zzgi.zza(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - java.lang.Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i) >>> 31);
            default:
                throw new java.lang.AssertionError();
        }
        return 31 - java.lang.Integer.numberOfLeadingZeros(i);
    }

    public static int zza(int i, int i2, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new java.lang.ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (com.google.android.gms.internal.fido.zzgg.zza[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.fido.zzgi.zza(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = java.lang.Math.abs(i4);
                int abs2 = abs - (java.lang.Math.abs(i2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return i3 + i5;
    }
}
