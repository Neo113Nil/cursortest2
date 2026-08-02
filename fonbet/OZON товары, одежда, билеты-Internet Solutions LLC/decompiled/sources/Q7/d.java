package Q7;

import C.C2702w;
import P4.f;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23012a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f23012a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23012a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23012a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23012a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23012a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23012a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23012a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23012a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long a(long j11, long j12) {
        long j13 = j11 + j12;
        if (((j11 ^ j12) < 0) || ((j11 ^ j13) >= 0)) {
            return j13;
        }
        throw new ArithmeticException(f.a(j12, ")", C2702w.d(j11, "overflow: checkedAdd(", ", ")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(long j11, long j12, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j13 = j11 / j12;
        long j14 = j11 - (j12 * j13);
        if (j14 != 0) {
            int i11 = ((int) ((j11 ^ j12) >> 63)) | 1;
            switch (a.f23012a[roundingMode.ordinal()]) {
                case 1:
                    if (j14 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                case 3:
                    break;
                case 4:
                    return j13 + i11;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    long abs = Math.abs(j14);
                    long abs2 = abs - (Math.abs(j12) - abs);
                    return abs2 != 0 ? j13 : j13;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static long c(long j11, long j12) {
        e.a(j11, "a");
        e.a(j12, "b");
        if (j11 == 0) {
            return j12;
        }
        if (j12 == 0) {
            return j11;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
        long j13 = j11 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j12);
        long j14 = j12 >> numberOfTrailingZeros2;
        while (j13 != j14) {
            long j15 = j13 - j14;
            long j16 = (j15 >> 63) & j15;
            long j17 = (j15 - j16) - j16;
            j14 += j16;
            j13 = j17 >> Long.numberOfTrailingZeros(j17);
        }
        return j13 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j11, long j12) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j12) + Long.numberOfLeadingZeros(j12) + Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11);
        if (numberOfLeadingZeros > 65) {
            return j11 * j12;
        }
        long j13 = ((j11 ^ j12) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j12 == Long.MIN_VALUE) & (j11 < 0)))) {
            long j14 = j11 * j12;
            if (j11 == 0 || j14 / j11 == j12) {
                return j14;
            }
        }
        return j13;
    }
}
