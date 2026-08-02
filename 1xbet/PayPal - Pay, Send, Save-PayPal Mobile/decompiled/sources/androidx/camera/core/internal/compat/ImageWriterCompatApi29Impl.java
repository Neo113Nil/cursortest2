package androidx.camera.core.internal.compat;

/* loaded from: classes6.dex */
final class ImageWriterCompatApi29Impl {
    static android.media.ImageWriter getHighSpeedVideoFpsRanges(android.view.Surface surface, int i, int i2) {
        return android.media.ImageWriter.newInstance(surface, i, i2);
    }

    private ImageWriterCompatApi29Impl() {
    }
}
