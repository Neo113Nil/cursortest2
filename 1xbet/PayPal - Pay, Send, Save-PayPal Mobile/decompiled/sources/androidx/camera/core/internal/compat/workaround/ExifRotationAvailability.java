package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes6.dex */
public class ExifRotationAvailability {
    public boolean isRotationOptionSupported() {
        androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.isSupported(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION);
    }

    public boolean shouldUseExifOrientation(androidx.camera.core.ImageProxy imageProxy) {
        return isRotationOptionSupported() && androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(imageProxy.getFormat());
    }
}
