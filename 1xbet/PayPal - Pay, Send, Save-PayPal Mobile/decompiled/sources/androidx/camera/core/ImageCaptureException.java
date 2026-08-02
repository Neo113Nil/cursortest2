package androidx.camera.core;

/* loaded from: classes6.dex */
public class ImageCaptureException extends java.lang.Exception {
    private final int Camera2StreamConfigurationMap;

    public ImageCaptureException(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.Camera2StreamConfigurationMap = i;
    }

    public int getImageCaptureError() {
        return this.Camera2StreamConfigurationMap;
    }
}
