package com.google.common.math;

import java.math.RoundingMode;

/* loaded from: classes4.dex */
public final class d {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(androidx.compose.runtime.collection.a.b("overflow: checkedAdd(", i, i2, ", ", ")"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r5 < 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(int i) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        int i2 = i / 8;
        int i3 = i - (8 * i2);
        if (i3 != 0) {
            int i4 = ((i ^ 8) >> 31) | 1;
            switch (a.a[roundingMode.ordinal()]) {
                case 1:
                    if (i3 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                    return i2;
                case 3:
                    break;
                case 4:
                    return i2 + i4;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i3);
                    int abs2 = abs - (Math.abs(8) - abs);
                    if (abs2 == 0) {
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    }
                    return i2;
                default:
                    throw new AssertionError();
            }
        }
        return i2;
    }

    public static int c(int i) {
        int i2 = i % 65536;
        return i2 >= 0 ? i2 : i2 + 65536;
    }
}
