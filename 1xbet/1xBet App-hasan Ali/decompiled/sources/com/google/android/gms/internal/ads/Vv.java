package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public abstract class Vv {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11965a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(double d5) {
        boolean c5;
        RoundingMode roundingMode = RoundingMode.CEILING;
        AbstractC1400ot.Y("x must be positive and finite", d5 > 0.0d && AbstractC1400ot.E(d5));
        int exponent = Math.getExponent(d5);
        if (Math.getExponent(d5) < -1022) {
            return a(d5 * 4.503599627370496E15d) - 52;
        }
        switch (Uv.f11842a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0952et.J(c(d5));
                return exponent;
            case 2:
                return exponent;
            case 3:
                r2 = !c(d5);
                return !r2 ? exponent + 1 : exponent;
            case 4:
                r2 = exponent < 0;
                c5 = c(d5);
                r2 &= !c5;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                c5 = c(d5);
                r2 &= !c5;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d5) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean b(double d5) {
        if (AbstractC1400ot.E(d5)) {
            return d5 == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC1400ot.b(d5)) <= Math.getExponent(d5);
        }
        return false;
    }

    public static boolean c(double d5) {
        if (d5 > 0.0d && AbstractC1400ot.E(d5)) {
            long b3 = AbstractC1400ot.b(d5);
            if ((b3 & ((-1) + b3)) == 0) {
                return true;
            }
        }
        return false;
    }
}
