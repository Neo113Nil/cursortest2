package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface ImageReaderProxy {

    public interface OnImageAvailableListener {
        void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy);
    }

    androidx.camera.core.ImageProxy acquireLatestImage();

    androidx.camera.core.ImageProxy acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    android.view.Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor);
}
