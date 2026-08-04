package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class zzfza {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static int zza(double d7, RoundingMode roundingMode) {
        boolean zZzd;
        boolean z4 = false;
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
                z4 = !zzd(d7);
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z4 = exponent < 0;
                zZzd = zzd(d7);
                z4 &= !zZzd;
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z4 = exponent >= 0;
                zZzd = zzd(d7);
                z4 &= !zZzd;
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d7) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z4 = true;
                }
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0099, please report this as an issue */
    public static long zzb(double d7, RoundingMode roundingMode) {
        double dRint;
        long j;
        long j3;
        boolean z4;
        if (!zzfzb.zzb(d7)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzfyz.zza[roundingMode.ordinal()]) {
            case 1:
                zzfzg.zzb(zzc(d7));
                dRint = d7;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d7 >= 0.0d || zzc(d7)) {
                    dRint = d7;
                } else {
                    j = (long) d7;
                    j3 = -1;
                    dRint = j + j3;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 3:
                if (d7 <= 0.0d || zzc(d7)) {
                    dRint = d7;
                } else {
                    j = (long) d7;
                    j3 = 1;
                    dRint = j + j3;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 4:
                dRint = d7;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 5:
                if (zzc(d7)) {
                    dRint = d7;
                } else {
                    dRint = ((long) d7) + ((long) (d7 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 6:
                dRint = Math.rint(d7);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 7:
                dRint = Math.rint(d7);
                if (Math.abs(d7 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d7) + d7;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
            case 8:
                dRint = Math.rint(d7);
                if (Math.abs(d7 - dRint) == 0.5d) {
                    dRint = d7;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + String.valueOf(roundingMode));
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
            long jZza = zzfzb.zza(d7);
            if ((jZza & ((-1) + jZza)) == 0) {
                return true;
            }
        }
        return false;
    }
}
