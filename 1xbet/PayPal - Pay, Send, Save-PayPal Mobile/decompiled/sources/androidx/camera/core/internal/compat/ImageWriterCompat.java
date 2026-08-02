package androidx.camera.core.internal.compat;

/* loaded from: classes6.dex */
public final class ImageWriterCompat {
    public static android.media.ImageWriter newInstance(android.view.Surface surface, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.camera.core.internal.compat.ImageWriterCompatApi29Impl.getHighSpeedVideoFpsRanges(surface, i, i2);
        }
        return androidx.camera.core.internal.compat.ImageWriterCompatApi26Impl.Camera2StreamConfigurationMap(surface, i, i2);
    }

    public static android.media.ImageWriter newInstance(android.view.Surface surface, int i) {
        return androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.getHighSpeedVideoFpsRangesFor(surface, i);
    }

    public static android.media.Image dequeueInputImage(android.media.ImageWriter imageWriter) {
        return androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.getHighSpeedVideoFpsRanges(imageWriter);
    }

    public static void queueInputImage(android.media.ImageWriter imageWriter, android.media.Image image) {
        androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.getHighSpeedVideoFpsRangesFor(imageWriter, image);
    }

    public static void setOnImageReleasedListener(android.media.ImageWriter imageWriter, android.media.ImageWriter.OnImageReleasedListener onImageReleasedListener, java.util.concurrent.Executor executor) {
        androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.getHighResolutionOutputSizeshNQ4ISI(imageWriter, onImageReleasedListener, executor);
    }

    public static void close(android.media.ImageWriter imageWriter) {
        androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.Camera2StreamConfigurationMap(imageWriter);
    }

    private ImageWriterCompat() {
    }
}
