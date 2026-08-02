package Q7;

import Bl0.k0;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23009a = 0;

    /* renamed from: Q7.a$a, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C0451a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23010a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f23010a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23010a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23010a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23010a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23010a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23010a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23010a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23010a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d11) {
        if (b.b(d11)) {
            return d11 == 0.0d || 52 - Long.numberOfTrailingZeros(b.a(d11)) <= Math.getExponent(d11);
        }
        return false;
    }

    public static boolean b(double d11) {
        if (d11 > 0.0d && b.b(d11)) {
            long a11 = b.a(d11);
            if ((a11 & (a11 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(double d11) {
        boolean b11;
        RoundingMode roundingMode = RoundingMode.CEILING;
        k0.d("x must be positive and finite", d11 > 0.0d && b.b(d11));
        int exponent = Math.getExponent(d11);
        if (!b.c(d11)) {
            return c(d11 * 4.503599627370496E15d) - 52;
        }
        switch (C0451a.f23010a[roundingMode.ordinal()]) {
            case 1:
                if (!b(d11)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                return !r2 ? exponent + 1 : exponent;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !b(d11);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                b11 = b(d11);
                r2 &= !b11;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                b11 = b(d11);
                r2 &= !b11;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double d12 = b.d(d11);
                if (d12 * d12 > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long d(double d11, RoundingMode roundingMode) {
        double d12;
        long j11;
        if (!b.b(d11)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C0451a.f23010a[roundingMode.ordinal()]) {
            case 1:
                if (!a(d11)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                d12 = d11;
                if (!((-9.223372036854776E18d) - d12 >= 1.0d) || !(d12 < 9.223372036854776E18d)) {
                    return (long) d12;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d11 + " and rounding mode " + roundingMode);
            case 2:
                if (d11 < 0.0d && !a(d11)) {
                    j11 = ((long) d11) - 1;
                    d12 = j11;
                    if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                    }
                }
                d12 = d11;
                if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d11 > 0.0d && !a(d11)) {
                    j11 = ((long) d11) + 1;
                    d12 = j11;
                    if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                    }
                }
                d12 = d11;
                if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d12 = d11;
                if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!a(d11)) {
                    d12 = ((long) d11) + (d11 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                    }
                }
                d12 = d11;
                if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d12 = Math.rint(d11);
                if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d12 = Math.rint(d11);
                if (Math.abs(d11 - d12) == 0.5d) {
                    d12 = Math.copySign(0.5d, d11) + d11;
                }
                if (!(((-9.223372036854776E18d) - d12 >= 1.0d) & (d12 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d12 = Math.rint(d11);
                break;
            default:
                throw new AssertionError();
        }
    }
}
