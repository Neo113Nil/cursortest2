package androidx.camera.core.internal.compat;

/* loaded from: classes6.dex */
final class ImageWriterCompatApi23Impl {
    static android.media.ImageWriter getHighSpeedVideoFpsRangesFor(android.view.Surface surface, int i) {
        return android.media.ImageWriter.newInstance(surface, i);
    }

    static android.media.Image getHighSpeedVideoFpsRanges(android.media.ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    static void getHighSpeedVideoFpsRangesFor(android.media.ImageWriter imageWriter, android.media.Image image) {
        imageWriter.queueInputImage(image);
    }

    static void Camera2StreamConfigurationMap(android.media.ImageWriter imageWriter) {
        imageWriter.close();
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.media.ImageWriter imageWriter, final android.media.ImageWriter.OnImageReleasedListener onImageReleasedListener, final java.util.concurrent.Executor executor) {
        imageWriter.setOnImageReleasedListener(new android.media.ImageWriter.OnImageReleasedListener() { // from class: androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl$$ExternalSyntheticLambda1
            @Override // android.media.ImageWriter.OnImageReleasedListener
            public final void onImageReleased(android.media.ImageWriter imageWriter2) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r1.onImageReleased(imageWriter2);
                    }
                });
            }
        }, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    private ImageWriterCompatApi23Impl() {
    }
}
