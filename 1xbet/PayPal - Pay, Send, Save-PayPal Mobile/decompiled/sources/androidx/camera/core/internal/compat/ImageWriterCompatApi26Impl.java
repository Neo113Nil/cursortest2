package androidx.camera.core.internal.compat;

/* loaded from: classes6.dex */
final class ImageWriterCompatApi26Impl {
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    static {
        try {
            getHighSpeedVideoSizes = android.media.ImageWriter.class.getMethod("newInstance", android.view.Surface.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    static android.media.ImageWriter Camera2StreamConfigurationMap(android.view.Surface surface, int i, int i2) {
        try {
            return (android.media.ImageWriter) androidx.core.util.Preconditions.checkNotNull(getHighSpeedVideoSizes.invoke(null, surface, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e);
        }
    }

    private ImageWriterCompatApi26Impl() {
    }
}
