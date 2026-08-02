package com.google.common.primitives;

/* loaded from: classes9.dex */
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = Byte.MIN_VALUE;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    private static byte flip(byte b) {
        return (byte) (b ^ 128);
    }

    private UnsignedBytes() {
    }

    public static int toInt(byte b) {
        return java.lang.Byte.toUnsignedInt(b);
    }

    public static byte checkedCast(long j) {
        com.google.common.base.Preconditions.checkArgument((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static byte saturatedCast(long j) {
        if (j > java.lang.Byte.toUnsignedInt((byte) -1)) {
            return (byte) -1;
        }
        if (j < 0) {
            return (byte) 0;
        }
        return (byte) j;
    }

    public static int compare(byte b, byte b2) {
        return java.lang.Byte.toUnsignedInt(b) - java.lang.Byte.toUnsignedInt(b2);
    }

    public static byte min(byte... bArr) {
        com.google.common.base.Preconditions.checkArgument(bArr.length > 0);
        int unsignedInt = java.lang.Byte.toUnsignedInt(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            int unsignedInt2 = java.lang.Byte.toUnsignedInt(bArr[i]);
            if (unsignedInt2 < unsignedInt) {
                unsignedInt = unsignedInt2;
            }
        }
        return (byte) unsignedInt;
    }

    public static byte max(byte... bArr) {
        com.google.common.base.Preconditions.checkArgument(bArr.length > 0);
        int unsignedInt = java.lang.Byte.toUnsignedInt(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            int unsignedInt2 = java.lang.Byte.toUnsignedInt(bArr[i]);
            if (unsignedInt2 > unsignedInt) {
                unsignedInt = unsignedInt2;
            }
        }
        return (byte) unsignedInt;
    }

    public static java.lang.String toString(byte b) {
        return toString(b, 10);
    }

    public static java.lang.String toString(byte b, int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        return java.lang.Integer.toString(java.lang.Byte.toUnsignedInt(b), i);
    }

    public static byte parseUnsignedByte(java.lang.String str) {
        return parseUnsignedByte(str, 10);
    }

    public static byte parseUnsignedByte(java.lang.String str, int i) {
        int parseInt = java.lang.Integer.parseInt((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str), i);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        throw new java.lang.NumberFormatException("out of range: ".concat(java.lang.String.valueOf(parseInt)));
    }

    public static java.lang.String join(java.lang.String str, byte... bArr) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * (str.length() + 3));
        sb.append(java.lang.Byte.toUnsignedInt(bArr[0]));
        for (int i = 1; i < bArr.length; i++) {
            sb.append(str);
            sb.append(toString(bArr[i]));
        }
        return sb.toString();
    }

    public static java.util.Comparator<byte[]> lexicographicalComparator() {
        return com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    static java.util.Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    static final class LexicographicalComparatorHolder {
        static final java.util.Comparator<byte[]> BEST_COMPARATOR;
        static final java.lang.String UNSAFE_COMPARATOR_NAME;

        static {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.class.getName());
            sb.append("$UnsafeComparator");
            UNSAFE_COMPARATOR_NAME = sb.toString();
            BEST_COMPARATOR = getBestComparator();
        }

        enum UnsafeComparator implements java.util.Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = java.nio.ByteOrder.nativeOrder().equals(java.nio.ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final sun.misc.Unsafe theUnsafe;

            static {
                sun.misc.Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int arrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
                if (!java.util.Objects.equals(java.lang.System.getProperty("sun.arch.data.model"), "64") || arrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new java.lang.Error();
                }
            }

            private static sun.misc.Unsafe getUnsafe() {
                try {
                    try {
                        return sun.misc.Unsafe.getUnsafe();
                    } catch (java.security.PrivilegedActionException e) {
                        throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                    }
                } catch (java.lang.SecurityException unused) {
                    return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$$ExternalSyntheticLambda0
                        @Override // java.security.PrivilegedExceptionAction
                        public final java.lang.Object run() {
                            return com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.lambda$getUnsafe$0();
                        }
                    });
                }
            }

            static /* synthetic */ sun.misc.Unsafe lambda$getUnsafe$0() throws java.lang.Exception {
                for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    java.lang.Object obj = field.get(null);
                    if (sun.misc.Unsafe.class.isInstance(obj)) {
                        return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                    }
                }
                throw new java.lang.NoSuchFieldError("the Unsafe");
            }

            @Override // java.util.Comparator
            public final int compare(byte[] bArr, byte[] bArr2) {
                int min = java.lang.Math.min(bArr.length, bArr2.length);
                int i = 0;
                while (i < (min & (-8))) {
                    sun.misc.Unsafe unsafe = theUnsafe;
                    long j = BYTE_ARRAY_BASE_OFFSET + i;
                    long j2 = unsafe.getLong(bArr, j);
                    long j3 = unsafe.getLong(bArr2, j);
                    if (j2 != j3) {
                        if (BIG_ENDIAN) {
                            return java.lang.Long.compareUnsigned(j2, j3);
                        }
                        int numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> numberOfTrailingZeros) & 255)) - ((int) ((j3 >>> numberOfTrailingZeros) & 255));
                    }
                    i += 8;
                }
                while (i < min) {
                    int compare = com.google.common.primitives.UnsignedBytes.compare(bArr[i], bArr2[i]);
                    if (compare != 0) {
                        return compare;
                    }
                    i++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        enum PureJavaComparator implements java.util.Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public final int compare(byte[] bArr, byte[] bArr2) {
                int min = java.lang.Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int compare = com.google.common.primitives.UnsignedBytes.compare(bArr[i], bArr2[i]);
                    if (compare != 0) {
                        return compare;
                    }
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        static java.util.Comparator<byte[]> getBestComparator() {
            try {
                return (java.util.Comparator) ((java.lang.Object[]) java.util.Objects.requireNonNull(java.lang.Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants()))[0];
            } catch (java.lang.Throwable unused) {
                return com.google.common.primitives.UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }

        private LexicographicalComparatorHolder() {
        }
    }

    public static void sort(byte[] bArr) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }

    public static void sort(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, bArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3] = flip(bArr[i3]);
        }
        java.util.Arrays.sort(bArr, i, i2);
        while (i < i2) {
            bArr[i] = flip(bArr[i]);
            i++;
        }
    }

    public static void sortDescending(byte[] bArr) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, bArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ Byte.MAX_VALUE);
        }
        java.util.Arrays.sort(bArr, i, i2);
        while (i < i2) {
            bArr[i] = (byte) (bArr[i] ^ Byte.MAX_VALUE);
            i++;
        }
    }
}
