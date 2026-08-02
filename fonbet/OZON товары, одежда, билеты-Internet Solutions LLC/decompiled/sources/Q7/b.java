package Q7;

import Bl0.k0;

/* loaded from: classes9.dex */
final class b {
    static long a(double d11) {
        k0.d("not a normal value", b(d11));
        int exponent = Math.getExponent(d11);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d11) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d11) {
        return Math.getExponent(d11) <= 1023;
    }

    static boolean c(double d11) {
        return Math.getExponent(d11) >= -1022;
    }

    static double d(double d11) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d11) & 4503599627370495L) | 4607182418800017408L);
    }
}
