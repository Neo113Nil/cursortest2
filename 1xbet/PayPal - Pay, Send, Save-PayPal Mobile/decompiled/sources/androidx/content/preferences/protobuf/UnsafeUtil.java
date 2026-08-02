package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class UnsafeUtil {
    private static final long ArtificialStackFrames;
    private static final long Camera2StreamConfigurationMap;
    private static final sun.misc.Unsafe CoroutineDebuggingKt;
    private static final long accessartificialFrame;
    private static final long getHighResolutionOutputSizeshNQ4ISI;
    private static final long getHighSpeedVideoFpsRanges;
    static final long getHighSpeedVideoFpsRangesFor;
    static final boolean getHighSpeedVideoSizes;
    private static final long getHighSpeedVideoSizesFor;
    private static final long getInputFormats;
    private static final long getInputSizeshNQ4ISI;
    private static final long getOutputFormats;
    private static final int getOutputMinFrameDuration;
    private static final boolean getOutputMinFrameDurationlomOqCM;
    private static final long getOutputSizes;
    private static final long getOutputSizeshNQ4ISI;
    private static final boolean getOutputStallDuration;
    private static final boolean getOutputStallDurationlomOqCM;
    private static final long getValidOutputFormatsForInputhNQ4ISI;
    private static final boolean isOutputSupportedFor;
    private static final java.lang.Class<?> isOutputSupportedForhNQ4ISI;
    private static final androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor toString;
    private static final long unwrapAs;

    static {
        sun.misc.Unsafe highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        CoroutineDebuggingKt = highResolutionOutputSizeshNQ4ISI;
        isOutputSupportedForhNQ4ISI = androidx.content.preferences.protobuf.Android.getHighResolutionOutputSizeshNQ4ISI();
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(java.lang.Long.TYPE);
        isOutputSupportedFor = highSpeedVideoFpsRanges;
        boolean highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(java.lang.Integer.TYPE);
        getOutputStallDuration = highSpeedVideoFpsRanges2;
        androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor memoryAccessor = null;
        if (highResolutionOutputSizeshNQ4ISI != null) {
            if (!androidx.content.preferences.protobuf.Android.getHighSpeedVideoFpsRangesFor()) {
                memoryAccessor = new androidx.datastore.preferences.protobuf.UnsafeUtil.JvmMemoryAccessor(highResolutionOutputSizeshNQ4ISI);
            } else if (highSpeedVideoFpsRanges) {
                memoryAccessor = new androidx.datastore.preferences.protobuf.UnsafeUtil.Android64MemoryAccessor(highResolutionOutputSizeshNQ4ISI);
            } else if (highSpeedVideoFpsRanges2) {
                memoryAccessor = new androidx.datastore.preferences.protobuf.UnsafeUtil.Android32MemoryAccessor(highResolutionOutputSizeshNQ4ISI);
            }
        }
        toString = memoryAccessor;
        getOutputStallDurationlomOqCM = memoryAccessor == null ? false : memoryAccessor.getHighSpeedVideoSizes();
        boolean Camera2StreamConfigurationMap2 = memoryAccessor == null ? false : memoryAccessor.Camera2StreamConfigurationMap();
        getOutputMinFrameDurationlomOqCM = Camera2StreamConfigurationMap2;
        long arrayBaseOffset = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayBaseOffset(byte[].class) : -1;
        getHighSpeedVideoFpsRangesFor = arrayBaseOffset;
        getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayBaseOffset(boolean[].class) : -1;
        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayIndexScale(boolean[].class) : -1;
        getOutputSizes = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayBaseOffset(int[].class) : -1;
        getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayIndexScale(int[].class) : -1;
        getValidOutputFormatsForInputhNQ4ISI = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayBaseOffset(long[].class) : -1;
        unwrapAs = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayIndexScale(long[].class) : -1;
        getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayBaseOffset(float[].class) : -1;
        getOutputFormats = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayIndexScale(float[].class) : -1;
        getInputSizeshNQ4ISI = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayBaseOffset(double[].class) : -1;
        getInputFormats = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayIndexScale(double[].class) : -1;
        accessartificialFrame = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayBaseOffset(java.lang.Object[].class) : -1;
        ArtificialStackFrames = Camera2StreamConfigurationMap2 ? memoryAccessor.getHighSpeedVideoFpsRangesFor.arrayIndexScale(java.lang.Object[].class) : -1;
        java.lang.reflect.Field Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap3 == null || memoryAccessor == null) ? -1L : memoryAccessor.getHighSpeedVideoFpsRangesFor.objectFieldOffset(Camera2StreamConfigurationMap3);
        getOutputMinFrameDuration = (int) (7 & arrayBaseOffset);
        getHighSpeedVideoSizes = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    static boolean getHighSpeedVideoFpsRanges() {
        return getOutputMinFrameDurationlomOqCM;
    }

    static boolean getHighSpeedVideoSizes() {
        return getOutputStallDurationlomOqCM;
    }

    static <T> T getHighSpeedVideoFpsRangesFor(java.lang.Class<T> cls) {
        try {
            return (T) CoroutineDebuggingKt.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static long Camera2StreamConfigurationMap(java.lang.reflect.Field field) {
        return toString.getHighSpeedVideoFpsRangesFor.objectFieldOffset(field);
    }

    static int getOutputMinFrameDuration(java.lang.Object obj, long j) {
        return toString.getHighSpeedVideoFpsRangesFor.getInt(obj, j);
    }

    static void getHighSpeedVideoFpsRanges(java.lang.Object obj, long j, int i) {
        toString.getHighSpeedVideoFpsRangesFor.putInt(obj, j, i);
    }

    static long getHighSpeedVideoSizesFor(java.lang.Object obj, long j) {
        return toString.getHighSpeedVideoFpsRangesFor.getLong(obj, j);
    }

    static void getHighSpeedVideoFpsRanges(java.lang.Object obj, long j, long j2) {
        toString.getHighSpeedVideoFpsRangesFor.putLong(obj, j, j2);
    }

    static boolean getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j) {
        return toString.getHighSpeedVideoFpsRanges(obj, j);
    }

    static void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, boolean z) {
        toString.getHighSpeedVideoFpsRangesFor(obj, j, z);
    }

    static float getInputFormats(java.lang.Object obj, long j) {
        return toString.getHighSpeedVideoFpsRangesFor(obj, j);
    }

    static void Camera2StreamConfigurationMap(java.lang.Object obj, long j, float f) {
        toString.Camera2StreamConfigurationMap(obj, j, f);
    }

    static double getInputSizeshNQ4ISI(java.lang.Object obj, long j) {
        return toString.getHighSpeedVideoSizes(obj, j);
    }

    static void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, double d) {
        toString.getHighSpeedVideoFpsRangesFor(obj, j, d);
    }

    static java.lang.Object getOutputFormats(java.lang.Object obj, long j) {
        return toString.getHighSpeedVideoFpsRangesFor.getObject(obj, j);
    }

    static void getHighSpeedVideoSizes(java.lang.Object obj, long j, java.lang.Object obj2) {
        toString.getHighSpeedVideoFpsRangesFor.putObject(obj, j, obj2);
    }

    static byte getHighSpeedVideoSizes(byte[] bArr, long j) {
        return toString.Camera2StreamConfigurationMap(bArr, getHighSpeedVideoFpsRangesFor + j);
    }

    static void getHighSpeedVideoFpsRangesFor(byte[] bArr, long j, byte b) {
        toString.Camera2StreamConfigurationMap((java.lang.Object) bArr, getHighSpeedVideoFpsRangesFor + j, b);
    }

    static void getHighSpeedVideoSizes(byte[] bArr, long j, long j2, long j3) {
        toString.getHighSpeedVideoFpsRanges(bArr, j, j2, j3);
    }

    static void getHighSpeedVideoFpsRanges(long j, byte[] bArr, long j2, long j3) {
        toString.Camera2StreamConfigurationMap(j, bArr, j2, j3);
    }

    static byte getHighSpeedVideoFpsRangesFor(long j) {
        return toString.getHighSpeedVideoSizes(j);
    }

    static void getHighSpeedVideoFpsRanges(long j, byte b) {
        toString.Camera2StreamConfigurationMap(j, b);
    }

    static long getHighSpeedVideoSizes(long j) {
        return toString.Camera2StreamConfigurationMap(j);
    }

    static long getHighSpeedVideoSizes(java.nio.ByteBuffer byteBuffer) {
        androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor memoryAccessor = toString;
        return memoryAccessor.getHighSpeedVideoFpsRangesFor.getLong(byteBuffer, getHighResolutionOutputSizeshNQ4ISI);
    }

    static sun.misc.Unsafe getHighResolutionOutputSizeshNQ4ISI() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: androidx.datastore.preferences.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public /* synthetic */ sun.misc.Unsafe run() throws java.lang.Exception {
                    for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        java.lang.Object obj = field.get(null);
                        if (sun.misc.Unsafe.class.isInstance(obj)) {
                            return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.Class<?> cls) {
        if (!androidx.content.preferences.protobuf.Android.getHighSpeedVideoFpsRangesFor()) {
            return false;
        }
        try {
            java.lang.Class<?> cls2 = isOutputSupportedForhNQ4ISI;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field Camera2StreamConfigurationMap() {
        java.lang.reflect.Field highSpeedVideoFpsRanges;
        if (androidx.content.preferences.protobuf.Android.getHighSpeedVideoFpsRangesFor() && (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((java.lang.Class<?>) java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return highSpeedVideoFpsRanges;
        }
        java.lang.reflect.Field highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges((java.lang.Class<?>) java.nio.Buffer.class, "address");
        if (highSpeedVideoFpsRanges2 == null || highSpeedVideoFpsRanges2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return highSpeedVideoFpsRanges2;
    }

    private static java.lang.reflect.Field getHighSpeedVideoFpsRanges(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static abstract class MemoryAccessor {
        sun.misc.Unsafe getHighSpeedVideoFpsRangesFor;

        public abstract byte Camera2StreamConfigurationMap(java.lang.Object obj, long j);

        public abstract long Camera2StreamConfigurationMap(long j);

        public abstract void Camera2StreamConfigurationMap(long j, byte b);

        public abstract void Camera2StreamConfigurationMap(long j, byte[] bArr, long j2, long j3);

        public abstract void Camera2StreamConfigurationMap(java.lang.Object obj, long j, byte b);

        public abstract void Camera2StreamConfigurationMap(java.lang.Object obj, long j, float f);

        public abstract void getHighSpeedVideoFpsRanges(byte[] bArr, long j, long j2, long j3);

        public abstract boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, long j);

        public abstract float getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j);

        public abstract void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, double d);

        public abstract void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, boolean z);

        public abstract byte getHighSpeedVideoSizes(long j);

        public abstract double getHighSpeedVideoSizes(java.lang.Object obj, long j);

        MemoryAccessor(sun.misc.Unsafe unsafe) {
            this.getHighSpeedVideoFpsRangesFor = unsafe;
        }

        public boolean Camera2StreamConfigurationMap() {
            sun.misc.Unsafe unsafe = this.getHighSpeedVideoFpsRangesFor;
            if (unsafe == null) {
                return false;
            }
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls.getMethod("arrayIndexScale", java.lang.Class.class);
                cls.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(th);
                return false;
            }
        }

        public boolean getHighSpeedVideoSizes() {
            sun.misc.Unsafe unsafe = this.getHighSpeedVideoFpsRangesFor;
            if (unsafe == null) {
                return false;
            }
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                return androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap() != null;
            } catch (java.lang.Throwable th) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(th);
                return false;
            }
        }
    }

    static final class JvmMemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        JvmMemoryAccessor(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean Camera2StreamConfigurationMap() {
            if (!super.Camera2StreamConfigurationMap()) {
                return false;
            }
            try {
                java.lang.Class<?> cls = this.getHighSpeedVideoFpsRangesFor.getClass();
                cls.getMethod("getByte", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putByte", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Byte.TYPE);
                cls.getMethod("getBoolean", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
                cls.getMethod("getFloat", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putFloat", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Float.TYPE);
                cls.getMethod("getDouble", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putDouble", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Double.TYPE);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte Camera2StreamConfigurationMap(java.lang.Object obj, long j) {
            return this.getHighSpeedVideoFpsRangesFor.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(java.lang.Object obj, long j, byte b) {
            this.getHighSpeedVideoFpsRangesFor.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, long j) {
            return this.getHighSpeedVideoFpsRangesFor.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, boolean z) {
            this.getHighSpeedVideoFpsRangesFor.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j) {
            return this.getHighSpeedVideoFpsRangesFor.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(java.lang.Object obj, long j, float f) {
            this.getHighSpeedVideoFpsRangesFor.putFloat(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double getHighSpeedVideoSizes(java.lang.Object obj, long j) {
            return this.getHighSpeedVideoFpsRangesFor.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, double d) {
            this.getHighSpeedVideoFpsRangesFor.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getHighSpeedVideoSizes() {
            if (!super.getHighSpeedVideoSizes()) {
                return false;
            }
            try {
                java.lang.Class<?> cls = this.getHighSpeedVideoFpsRangesFor.getClass();
                cls.getMethod("getByte", java.lang.Long.TYPE);
                cls.getMethod("putByte", java.lang.Long.TYPE, java.lang.Byte.TYPE);
                cls.getMethod("getInt", java.lang.Long.TYPE);
                cls.getMethod("putInt", java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.Long.TYPE);
                cls.getMethod("putLong", java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls.getMethod("copyMemory", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls.getMethod("copyMemory", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte getHighSpeedVideoSizes(long j) {
            return this.getHighSpeedVideoFpsRangesFor.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(long j, byte b) {
            this.getHighSpeedVideoFpsRangesFor.putByte(j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long Camera2StreamConfigurationMap(long j) {
            return this.getHighSpeedVideoFpsRangesFor.getLong(j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(long j, byte[] bArr, long j2, long j3) {
            this.getHighSpeedVideoFpsRangesFor.copyMemory((java.lang.Object) null, j, bArr, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor + j2, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, long j, long j2, long j3) {
            this.getHighSpeedVideoFpsRangesFor.copyMemory(bArr, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor + j, (java.lang.Object) null, j2, j3);
        }
    }

    static final class Android64MemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getHighSpeedVideoSizes() {
            return false;
        }

        Android64MemoryAccessor(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte Camera2StreamConfigurationMap(java.lang.Object obj, long j) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(obj, j);
            }
            return androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(java.lang.Object obj, long j, byte b) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(obj, j, b);
            } else {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, long j) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(obj, j);
            }
            return androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, boolean z) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(obj, j, z);
            } else {
                androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(java.lang.Object obj, long j, float f) {
            this.getHighSpeedVideoFpsRangesFor.putInt(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, double d) {
            this.getHighSpeedVideoFpsRangesFor.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte getHighSpeedVideoSizes(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(long j, byte b) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long Camera2StreamConfigurationMap(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(long j, byte[] bArr, long j2, long j3) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, long j, long j2, long j3) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double getHighSpeedVideoSizes(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(this.getHighSpeedVideoFpsRangesFor.getLong(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(this.getHighSpeedVideoFpsRangesFor.getInt(obj, j));
        }
    }

    static final class Android32MemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getHighSpeedVideoSizes() {
            return false;
        }

        Android32MemoryAccessor(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte Camera2StreamConfigurationMap(java.lang.Object obj, long j) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(obj, j);
            }
            return androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(java.lang.Object obj, long j, byte b) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI(obj, j, b);
            } else {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, long j) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(obj, j);
            }
            return androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, boolean z) {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes) {
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(obj, j, z);
            } else {
                androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(java.lang.Object obj, long j, float f) {
            this.getHighSpeedVideoFpsRangesFor.putInt(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j, double d) {
            this.getHighSpeedVideoFpsRangesFor.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte getHighSpeedVideoSizes(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(long j, byte b) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long Camera2StreamConfigurationMap(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void Camera2StreamConfigurationMap(long j, byte[] bArr, long j2, long j3) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void getHighSpeedVideoFpsRanges(byte[] bArr, long j, long j2, long j3) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double getHighSpeedVideoSizes(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(this.getHighSpeedVideoFpsRangesFor.getLong(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(this.getHighSpeedVideoFpsRangesFor.getInt(obj, j));
        }
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(androidx.content.preferences.protobuf.UnsafeUtil.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(java.lang.String.valueOf(th)));
    }

    static /* synthetic */ byte getHighSpeedVideoSizes(java.lang.Object obj, long j) {
        return (byte) ((toString.getHighSpeedVideoFpsRangesFor.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    static /* synthetic */ byte getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, long j) {
        return (byte) ((toString.getHighSpeedVideoFpsRangesFor.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, long j) {
        return ((byte) ((toString.getHighSpeedVideoFpsRangesFor.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(java.lang.Object obj, long j) {
        return ((byte) ((toString.getHighSpeedVideoFpsRangesFor.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(java.lang.Object obj, long j, boolean z) {
        getHighResolutionOutputSizeshNQ4ISI(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(java.lang.Object obj, long j, boolean z) {
        getHighSpeedVideoFpsRanges(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor memoryAccessor = toString;
        int i = memoryAccessor.getHighSpeedVideoFpsRangesFor.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        memoryAccessor.getHighSpeedVideoFpsRangesFor.putInt(obj, j2, ((~(255 << i2)) & i) | ((b & 255) << i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighSpeedVideoFpsRanges(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor memoryAccessor = toString;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        memoryAccessor.getHighSpeedVideoFpsRangesFor.putInt(obj, j2, ((~(255 << i)) & memoryAccessor.getHighSpeedVideoFpsRangesFor.getInt(obj, j2)) | i2);
    }
}
