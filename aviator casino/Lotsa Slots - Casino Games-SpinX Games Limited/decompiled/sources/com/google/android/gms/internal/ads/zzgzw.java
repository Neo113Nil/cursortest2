package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgzw {
    public static final /* synthetic */ int zza = 0;

    static {
        java.lang.Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r9 - r4) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zza(double d, java.math.RoundingMode roundingMode) {
        double d2;
        long j;
        long j2;
        if (!com.google.android.gms.internal.ads.zzgzx.zzb(d)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (com.google.android.gms.internal.ads.zzgzv.zza[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.ads.zzhac.zzb(zzd(d));
                d2 = d;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                java.lang.String valueOf = java.lang.String.valueOf(roundingMode);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(d).length() + 59 + java.lang.String.valueOf(valueOf).length());
                sb.append("rounded value is out of range for input ");
                sb.append(d);
                sb.append(" and rounding mode ");
                sb.append(valueOf);
                throw new java.lang.ArithmeticException(sb.toString());
            case 2:
                if (d < 0.0d && !zzd(d)) {
                    j = (long) d;
                    j2 = -1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d > 0.0d && !zzd(d)) {
                    j = (long) d;
                    j2 = 1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!zzd(d)) {
                    j = (long) d;
                    j2 = d > 0.0d ? 1 : -1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = java.lang.Math.rint(d);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = java.lang.Math.rint(d);
                if (java.lang.Math.abs(d - d2) == 0.5d) {
                    d2 = d + java.lang.Math.copySign(0.5d, d);
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = java.lang.Math.rint(d);
                break;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean zzb(double d) {
        if (d > 0.0d && com.google.android.gms.internal.ads.zzgzx.zzb(d)) {
            long zza2 = com.google.android.gms.internal.ads.zzgzx.zza(d);
            if ((zza2 & ((-1) + zza2)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(double d, java.math.RoundingMode roundingMode) {
        boolean z;
        boolean z2;
        boolean zzb;
        com.google.android.gms.internal.ads.zzgtj.zzb(d > 0.0d && com.google.android.gms.internal.ads.zzgzx.zzb(d), "x must be positive and finite");
        int exponent = java.lang.Math.getExponent(d);
        if (java.lang.Math.getExponent(d) < -1022) {
            return zzc(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (com.google.android.gms.internal.ads.zzgzv.zza[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.ads.zzhac.zzb(zzb(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !zzb(d);
                if (!z) {
                    return exponent;
                }
                return exponent + 1;
            case 4:
                z2 = exponent < 0;
                zzb = zzb(d);
                z = (!zzb) & z2;
                if (!z) {
                }
                return exponent + 1;
            case 5:
                z2 = exponent >= 0;
                zzb = zzb(d);
                z = (!zzb) & z2;
                if (!z) {
                }
                return exponent + 1;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = java.lang.Double.longBitsToDouble((java.lang.Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble <= 2.0d) {
                    return exponent;
                }
                return exponent + 1;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean zzd(double d) {
        if (com.google.android.gms.internal.ads.zzgzx.zzb(d)) {
            return d == 0.0d || 52 - java.lang.Long.numberOfTrailingZeros(com.google.android.gms.internal.ads.zzgzx.zza(d)) <= java.lang.Math.getExponent(d);
        }
        return false;
    }
}
