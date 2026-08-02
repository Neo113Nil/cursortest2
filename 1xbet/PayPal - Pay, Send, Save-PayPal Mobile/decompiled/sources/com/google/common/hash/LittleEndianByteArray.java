package com.google.common.hash;

/* loaded from: classes9.dex */
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final com.google.common.hash.LittleEndianByteArray.LittleEndianBytes byteArray = makeGetter();

    enum JavaLittleEndianBytes implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public final boolean usesFastPath() {
                return false;
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public final long getLongLittleEndian(byte[] bArr, int i) {
                return com.google.common.primitives.Longs.fromBytes(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public final void putLongLittleEndian(byte[] bArr, int i, long j) {
                long j2 = 255;
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i + i2] = (byte) ((j & j2) >> (i2 * 8));
                    j2 <<= 8;
                }
            }
        }
    }

    interface LittleEndianBytes {
        long getLongLittleEndian(byte[] bArr, int i);

        void putLongLittleEndian(byte[] bArr, int i, long j);

        boolean usesFastPath();
    }

    static long load64(byte[] bArr, int i) {
        return byteArray.getLongLittleEndian(bArr, i);
    }

    static long load64Safely(byte[] bArr, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < java.lang.Math.min(i2, 8); i3++) {
            j |= (bArr[i + i3] & 255) << (i3 * 8);
        }
        return j;
    }

    static void store64(byte[] bArr, int i, long j) {
        byteArray.putLongLittleEndian(bArr, i, j);
    }

    static int load32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static boolean usingFastPath() {
        return byteArray.usesFastPath();
    }

    enum UnsafeByteArray implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public final long getLongLittleEndian(byte[] bArr, int i) {
                return com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.getLong(bArr, i + com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public final void putLongLittleEndian(byte[] bArr, int i, long j) {
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.putLong(bArr, i + com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET, j);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public final long getLongLittleEndian(byte[] bArr, int i) {
                return java.lang.Long.reverseBytes(com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.getLong(bArr, i + com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public final void putLongLittleEndian(byte[] bArr, int i, long j) {
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe.putLong(bArr, i + com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET, java.lang.Long.reverseBytes(j));
            }
        };

        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final sun.misc.Unsafe theUnsafe;

        @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
        public boolean usesFastPath() {
            return true;
        }

        static {
            sun.misc.Unsafe unsafe = getUnsafe();
            theUnsafe = unsafe;
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new java.lang.AssertionError();
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
                return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$$ExternalSyntheticLambda0
                    @Override // java.security.PrivilegedExceptionAction
                    public final java.lang.Object run() {
                        return com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.lambda$getUnsafe$0();
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
    }

    static com.google.common.hash.LittleEndianByteArray.LittleEndianBytes makeGetter() {
        try {
            if (java.util.Objects.equals(java.lang.System.getProperty("os.arch"), "amd64")) {
                if (java.nio.ByteOrder.nativeOrder().equals(java.nio.ByteOrder.LITTLE_ENDIAN)) {
                    return com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_LITTLE_ENDIAN;
                }
                return com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (java.lang.Throwable unused) {
        }
        return com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.INSTANCE;
    }

    private LittleEndianByteArray() {
    }
}
