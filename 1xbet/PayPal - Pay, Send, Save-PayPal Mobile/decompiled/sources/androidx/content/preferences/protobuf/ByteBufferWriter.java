package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
final class ByteBufferWriter {
    private static final long Camera2StreamConfigurationMap;
    private static final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> getHighSpeedVideoSizes = new java.lang.ThreadLocal<>();

    private ByteBufferWriter() {
    }

    static {
        java.lang.Class<?> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges("java.io.FileOutputStream");
        getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
    }

    private static java.lang.Class<?> getHighSpeedVideoFpsRanges(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    private static long getHighSpeedVideoFpsRanges(java.lang.Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges()) {
                return androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }
}
