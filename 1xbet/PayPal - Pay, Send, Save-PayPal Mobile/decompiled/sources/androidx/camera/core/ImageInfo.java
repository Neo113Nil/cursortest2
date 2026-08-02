package androidx.camera.core;

/* loaded from: classes6.dex */
public interface ImageInfo {
    default int getFlashState() {
        return 0;
    }

    int getRotationDegrees();

    androidx.camera.core.impl.TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder);

    default android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return new android.graphics.Matrix();
    }
}
