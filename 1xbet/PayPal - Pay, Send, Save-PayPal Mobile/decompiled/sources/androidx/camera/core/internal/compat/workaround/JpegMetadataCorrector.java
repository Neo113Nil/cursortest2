package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes6.dex */
public class JpegMetadataCorrector {
    private final androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk getHighSpeedVideoSizes;

    public JpegMetadataCorrector(androidx.camera.core.impl.Quirks quirks) {
        this.getHighSpeedVideoSizes = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) quirks.get(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class);
    }

    public boolean needCorrectJpegMetadata() {
        return this.getHighSpeedVideoSizes != null;
    }

    public byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.getHighSpeedVideoSizes;
        if (incorrectJpegMetadataQuirk == null) {
            java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.capacity()];
            buffer.rewind();
            buffer.get(bArr);
            return bArr;
        }
        return incorrectJpegMetadataQuirk.jpegImageToJpegByteArray(imageProxy);
    }
}
