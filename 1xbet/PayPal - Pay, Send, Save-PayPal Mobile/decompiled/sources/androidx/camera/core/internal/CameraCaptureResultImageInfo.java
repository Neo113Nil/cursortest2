package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public final class CameraCaptureResultImageInfo implements androidx.camera.core.ImageInfo {
    private final androidx.camera.core.impl.CameraCaptureResult Camera2StreamConfigurationMap;

    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return 0;
    }

    public CameraCaptureResultImageInfo(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        this.Camera2StreamConfigurationMap = cameraCaptureResult;
    }

    @Override // androidx.camera.core.ImageInfo
    public final androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.Camera2StreamConfigurationMap.getTagBundle();
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.Camera2StreamConfigurationMap.getTimestamp();
    }

    @Override // androidx.camera.core.ImageInfo
    public final android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return new android.graphics.Matrix();
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getFlashState() {
        return this.Camera2StreamConfigurationMap.getFlashState().toFlashState();
    }

    @Override // androidx.camera.core.ImageInfo
    public final void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
        this.Camera2StreamConfigurationMap.populateExifData(builder);
    }

    public final androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
        return this.Camera2StreamConfigurationMap;
    }
}
