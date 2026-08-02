package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class BitmapEffect implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> {
    private final androidx.camera.core.processing.InternalImageProcessor getHighSpeedVideoSizes;

    BitmapEffect(androidx.camera.core.processing.InternalImageProcessor internalImageProcessor) {
        this.getHighSpeedVideoSizes = internalImageProcessor;
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply(androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.ImageProxy outputImage = this.getHighSpeedVideoSizes.safeProcess(new androidx.camera.core.processing.ImageProcessorRequest(new androidx.camera.core.imagecapture.RgbaImageProxy(packet), 1)).getOutputImage();
        return androidx.camera.core.processing.Packet.of(androidx.camera.core.internal.utils.ImageUtil.createBitmapFromPlane(((androidx.camera.core.ImageProxy) java.util.Objects.requireNonNull(outputImage)).getPlanes(), outputImage.getWidth(), outputImage.getHeight()), (androidx.camera.core.impl.utils.Exif) java.util.Objects.requireNonNull(packet.getExif()), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
