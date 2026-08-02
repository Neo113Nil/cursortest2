package com.sun.jna;

/* loaded from: classes5.dex */
public class NativeMappedConverter implements com.sun.jna.TypeConverter {
    private static final java.util.Map<java.lang.Class<?>, java.lang.ref.Reference<com.sun.jna.NativeMappedConverter>> getHighSpeedVideoFpsRanges = new java.util.WeakHashMap();
    private final java.lang.Class<?> Camera2StreamConfigurationMap;
    private final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
    private final com.sun.jna.NativeMapped getHighSpeedVideoFpsRangesFor;

    public static com.sun.jna.NativeMappedConverter getInstance(java.lang.Class<?> cls) {
        com.sun.jna.NativeMappedConverter nativeMappedConverter;
        java.util.Map<java.lang.Class<?>, java.lang.ref.Reference<com.sun.jna.NativeMappedConverter>> map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            java.lang.ref.Reference<com.sun.jna.NativeMappedConverter> reference = map.get(cls);
            nativeMappedConverter = reference != null ? reference.get() : null;
            if (nativeMappedConverter == null) {
                nativeMappedConverter = new com.sun.jna.NativeMappedConverter(cls);
                map.put(cls, new java.lang.ref.SoftReference(nativeMappedConverter));
            }
        }
        return nativeMappedConverter;
    }

    public NativeMappedConverter(java.lang.Class<?> cls) {
        if (!com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Type must derive from ");
            sb.append(com.sun.jna.NativeMapped.class);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.Camera2StreamConfigurationMap = cls;
        com.sun.jna.NativeMapped defaultValue = defaultValue();
        this.getHighSpeedVideoFpsRangesFor = defaultValue;
        this.getHighResolutionOutputSizeshNQ4ISI = defaultValue.nativeType();
    }

    public com.sun.jna.NativeMapped defaultValue() {
        if (this.Camera2StreamConfigurationMap.isEnum()) {
            return (com.sun.jna.NativeMapped) this.Camera2StreamConfigurationMap.getEnumConstants()[0];
        }
        return (com.sun.jna.NativeMapped) com.sun.jna.Klass.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
    }

    @Override // com.sun.jna.FromNativeConverter
    public java.lang.Object fromNative(java.lang.Object obj, com.sun.jna.FromNativeContext fromNativeContext) {
        return this.getHighSpeedVideoFpsRangesFor.fromNative(obj, fromNativeContext);
    }

    @Override // com.sun.jna.FromNativeConverter, com.sun.jna.ToNativeConverter
    public java.lang.Class<?> nativeType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.sun.jna.ToNativeConverter
    public java.lang.Object toNative(java.lang.Object obj, com.sun.jna.ToNativeContext toNativeContext) {
        if (obj == null) {
            if (com.sun.jna.Pointer.class.isAssignableFrom(this.getHighResolutionOutputSizeshNQ4ISI)) {
                return null;
            }
            obj = defaultValue();
        }
        return ((com.sun.jna.NativeMapped) obj).toNative();
    }
}
