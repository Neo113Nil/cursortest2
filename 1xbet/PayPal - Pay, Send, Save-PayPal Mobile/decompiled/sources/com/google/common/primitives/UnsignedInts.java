package com.google.common.primitives;

/* loaded from: classes4.dex */
public final class UnsignedInts {
    static final long INT_MASK = 4294967295L;

    static int flip(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static int saturatedCast(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 4294967296L) {
            return -1;
        }
        return (int) j;
    }

    public static long toLong(int i) {
        return i & 4294967295L;
    }

    private UnsignedInts() {
    }

    public static int compare(int i, int i2) {
        return com.google.common.primitives.Ints.compare(flip(i), flip(i2));
    }

    public static int checkedCast(long j) {
        com.google.common.base.Preconditions.checkArgument((j >> 32) == 0, "out of range: %s", j);
        return (int) j;
    }

    public static int min(int... iArr) {
        com.google.common.base.Preconditions.checkArgument(iArr.length > 0);
        int flip = flip(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int flip2 = flip(iArr[i]);
            if (flip2 < flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    public static int max(int... iArr) {
        com.google.common.base.Preconditions.checkArgument(iArr.length > 0);
        int flip = flip(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int flip2 = flip(iArr[i]);
            if (flip2 > flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    public static java.lang.String join(java.lang.String str, int... iArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(iArr.length * 5);
        sb.append(toString(iArr[0]));
        for (int i = 1; i < iArr.length; i++) {
            sb.append(str);
            sb.append(toString(iArr[i]));
        }
        return sb.toString();
    }

    public static java.util.Comparator<int[]> lexicographicalComparator() {
        return com.google.common.primitives.UnsignedInts.LexicographicalComparator.INSTANCE;
    }

    /* loaded from: classes9.dex */
    enum LexicographicalComparator implements java.util.Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int min = java.lang.Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                if (i2 != i3) {
                    return com.google.common.primitives.UnsignedInts.compare(i2, i3);
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    public static void sort(int[] iArr) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        sort(iArr, 0, iArr.length);
    }

    public static void sort(int[] iArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, iArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            iArr[i3] = flip(iArr[i3]);
        }
        java.util.Arrays.sort(iArr, i, i2);
        while (i < i2) {
            iArr[i] = flip(iArr[i]);
            i++;
        }
    }

    public static void sortDescending(int[] iArr) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(iArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, iArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            iArr[i3] = Integer.MAX_VALUE ^ iArr[i3];
        }
        java.util.Arrays.sort(iArr, i, i2);
        while (i < i2) {
            iArr[i] = iArr[i] ^ Integer.MAX_VALUE;
            i++;
        }
    }

    public static int divide(int i, int i2) {
        return (int) (toLong(i) / toLong(i2));
    }

    public static int remainder(int i, int i2) {
        return (int) (toLong(i) % toLong(i2));
    }

    public static int decode(java.lang.String str) {
        com.google.common.primitives.ParseRequest fromString = com.google.common.primitives.ParseRequest.fromString(str);
        try {
            return parseUnsignedInt(fromString.rawValue, fromString.radix);
        } catch (java.lang.NumberFormatException e) {
            java.lang.NumberFormatException numberFormatException = new java.lang.NumberFormatException("Error parsing value: ".concat(java.lang.String.valueOf(str)));
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public static int parseUnsignedInt(java.lang.String str) {
        return parseUnsignedInt(str, 10);
    }

    public static int parseUnsignedInt(java.lang.String str, int i) {
        com.google.common.base.Preconditions.checkNotNull(str);
        long parseLong = java.lang.Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i);
        sb.append(" is not in the range of an unsigned integer");
        throw new java.lang.NumberFormatException(sb.toString());
    }

    public static java.lang.String toString(int i) {
        return toString(i, 10);
    }

    public static java.lang.String toString(int i, int i2) {
        return java.lang.Long.toString(i & 4294967295L, i2);
    }
}
