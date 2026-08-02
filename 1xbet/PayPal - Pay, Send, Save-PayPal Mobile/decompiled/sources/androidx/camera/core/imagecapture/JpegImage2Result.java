package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class JpegImage2Result implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, androidx.camera.core.ImageProxy> {
    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.ImageProxy apply(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.ImageProxy data = packet.getData();
        androidx.camera.core.SettableImageProxy settableImageProxy = new androidx.camera.core.SettableImageProxy(data, packet.getSize(), androidx.camera.core.ImmutableImageInfo.create(data.getImageInfo().getTagBundle(), data.getImageInfo().getTimestamp(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), data.getImageInfo().getFlashState()));
        settableImageProxy.setCropRect(packet.getCropRect());
        return settableImageProxy;
    }
}
