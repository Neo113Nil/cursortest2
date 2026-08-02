package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public interface ImageCaptureControl {
    void lockFlashMode();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list);

    void unlockFlashMode();
}
