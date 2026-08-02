package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    private static long flip(long j) {
        return j ^ Long.MIN_VALUE;
    }

    private UnsignedLongs() {
    }

    public static int compare(long j, long j2) {
        return com.google.common.primitives.Longs.compare(flip(j), flip(j2));
    }

    public static long min(long... jArr) {
        com.google.common.base.Preconditions.checkArgument(jArr.length > 0);
        long flip = flip(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long flip2 = flip(jArr[i]);
            if (flip2 < flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    public static long max(long... jArr) {
        com.google.common.base.Preconditions.checkArgument(jArr.length > 0);
        long flip = flip(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long flip2 = flip(jArr[i]);
            if (flip2 > flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    public static java.lang.String join(java.lang.String str, long... jArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(jArr.length * 5);
        sb.append(toString(jArr[0]));
        for (int i = 1; i < jArr.length; i++) {
            sb.append(str);
            sb.append(toString(jArr[i]));
        }
        return sb.toString();
    }

    public static java.util.Comparator<long[]> lexicographicalComparator() {
        return com.google.common.primitives.UnsignedLongs.LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements java.util.Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(long[] jArr, long[] jArr2) {
            int min = java.lang.Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                long j = jArr[i];
                long j2 = jArr2[i];
                if (j != j2) {
                    return com.google.common.primitives.UnsignedLongs.compare(j, j2);
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static void sort(long[] jArr) {
        com.google.common.base.Preconditions.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sort(long[] jArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(jArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, jArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            jArr[i3] = flip(jArr[i3]);
        }
        java.util.Arrays.sort(jArr, i, i2);
        while (i < i2) {
            jArr[i] = flip(jArr[i]);
            i++;
        }
    }

    public static void sortDescending(long[] jArr) {
        com.google.common.base.Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(jArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, jArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            jArr[i3] = Long.MAX_VALUE ^ jArr[i3];
        }
        java.util.Arrays.sort(jArr, i, i2);
        while (i < i2) {
            jArr[i] = jArr[i] ^ Long.MAX_VALUE;
            i++;
        }
    }

    public static long divide(long j, long j2) {
        if (j2 < 0) {
            return compare(j, j2) < 0 ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + (compare(j - (j3 * j2), j2) < 0 ? 0 : 1);
    }

    public static long remainder(long j, long j2) {
        if (j2 < 0) {
            return compare(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (compare(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    public static long parseUnsignedLong(java.lang.String str) {
        return parseUnsignedLong(str, 10);
    }

    public static long parseUnsignedLong(java.lang.String str, int i) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            throw new java.lang.NumberFormatException("empty string");
        }
        if (i < 2 || i > 36) {
            throw new java.lang.NumberFormatException("illegal radix: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits[i];
        long j = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int digit = java.lang.Character.digit(str.charAt(i3), i);
            if (digit == -1) {
                throw new java.lang.NumberFormatException(str);
            }
            if (i3 > i2 - 1 && com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.overflowInParse(j, digit, i)) {
                throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(java.lang.String.valueOf(str)));
            }
            j = (j * i) + digit;
        }
        return j;
    }

    public static long decode(java.lang.String str) {
        com.google.common.primitives.ParseRequest fromString = com.google.common.primitives.ParseRequest.fromString(str);
        try {
            return parseUnsignedLong(fromString.rawValue, fromString.radix);
        } catch (java.lang.NumberFormatException e) {
            java.lang.NumberFormatException numberFormatException = new java.lang.NumberFormatException("Error parsing value: ".concat(java.lang.String.valueOf(str)));
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    static final class ParseOverflowDetection {
        static final long[] maxValueDivs = new long[37];
        static final int[] maxValueMods = new int[37];
        static final int[] maxSafeDigits = new int[37];

        private ParseOverflowDetection() {
        }

        static {
            java.math.BigInteger shiftLeft = java.math.BigInteger.ONE.shiftLeft(64);
            for (int i = 2; i <= 36; i++) {
                long j = i;
                maxValueDivs[i] = com.google.common.primitives.UnsignedLongs.divide(-1L, j);
                maxValueMods[i] = (int) com.google.common.primitives.UnsignedLongs.remainder(-1L, j);
                maxSafeDigits[i] = shiftLeft.toString(i).length() - 1;
            }
        }

        static boolean overflowInParse(long j, int i, int i2) {
            if (j < 0) {
                return true;
            }
            long j2 = maxValueDivs[i2];
            if (j < j2) {
                return false;
            }
            return j > j2 || i > maxValueMods[i2];
        }
    }

    public static java.lang.String toString(long j) {
        return toString(j, 10);
    }

    public static java.lang.String toString(long j, int i) {
        long divide;
        com.google.common.base.Preconditions.checkArgument(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return java.lang.Long.toString(j, i);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = java.lang.Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                divide = (j >>> 1) / (i >>> 1);
            } else {
                divide = divide(j, i);
            }
            long j2 = i;
            int i4 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (j - (divide * j2)), i);
            while (divide > 0) {
                i4--;
                cArr[i4] = java.lang.Character.forDigit((int) (divide % j2), i);
                divide /= j2;
            }
            i2 = i4;
        }
        return new java.lang.String(cArr, i2, 64 - i2);
    }
}
