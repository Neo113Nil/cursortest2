package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzfza {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(double d7, RoundingMode roundingMode) {
        boolean zzd;
        zzfth.zzf(d7 > 0.0d && zzfzb.zzb(d7), "x must be positive and finite");
        int exponent = Math.getExponent(d7);
        if (Math.getExponent(d7) < -1022) {
            return zza(d7 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzfyz.zza[roundingMode.ordinal()]) {
            case 1:
                zzfzg.zzb(zzd(d7));
                return exponent;
            case 2:
                return exponent;
            case 3:
                r1 = !zzd(d7);
                return !r1 ? exponent + 1 : exponent;
            case 4:
                r1 = exponent < 0;
                zzd = zzd(d7);
                r1 &= !zzd;
                if (!r1) {
                }
                break;
            case 5:
                r1 = exponent >= 0;
                zzd = zzd(d7);
                r1 &= !zzd;
                if (!r1) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d7) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r1 = true;
                }
                if (!r1) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zzb(double d7, RoundingMode roundingMode) {
        double d8;
        long j;
        long j3;
        if (!zzfzb.zzb(d7)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzfyz.zza[roundingMode.ordinal()]) {
            case 1:
                zzfzg.zzb(zzc(d7));
                d8 = d7;
                if (!((-9.223372036854776E18d) - d8 >= 1.0d) || !(d8 < 9.223372036854776E18d)) {
                    return (long) d8;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d7 < 0.0d && !zzc(d7)) {
                    j = (long) d7;
                    j3 = -1;
                    d8 = j + j3;
                    if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                    }
                }
                d8 = d7;
                if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d7 > 0.0d && !zzc(d7)) {
                    j = (long) d7;
                    j3 = 1;
                    d8 = j + j3;
                    if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                    }
                }
                d8 = d7;
                if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d8 = d7;
                if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!zzc(d7)) {
                    d8 = ((long) d7) + (d7 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                    }
                }
                d8 = d7;
                if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d8 = Math.rint(d7);
                if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d8 = Math.rint(d7);
                if (Math.abs(d7 - d8) == 0.5d) {
                    d8 = Math.copySign(0.5d, d7) + d7;
                }
                if (!(((-9.223372036854776E18d) - d8 >= 1.0d) & (d8 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d8 = Math.rint(d7);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzc(double d7) {
        if (zzfzb.zzb(d7)) {
            return d7 == 0.0d || 52 - Long.numberOfTrailingZeros(zzfzb.zza(d7)) <= Math.getExponent(d7);
        }
        return false;
    }

    public static boolean zzd(double d7) {
        if (d7 > 0.0d && zzfzb.zzb(d7)) {
            long zza2 = zzfzb.zza(d7);
            if ((zza2 & ((-1) + zza2)) == 0) {
                return true;
            }
        }
        return false;
    }
}
