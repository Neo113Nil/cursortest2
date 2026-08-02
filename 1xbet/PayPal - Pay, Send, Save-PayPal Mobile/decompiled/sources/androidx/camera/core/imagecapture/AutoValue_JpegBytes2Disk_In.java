package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_JpegBytes2Disk_In extends androidx.camera.core.imagecapture.JpegBytes2Disk.In {
    private final androidx.camera.core.ImageCapture.OutputFileOptions Camera2StreamConfigurationMap;
    private final androidx.camera.core.processing.Packet<byte[]> getHighSpeedVideoFpsRanges;

    AutoValue_JpegBytes2Disk_In(androidx.camera.core.processing.Packet<byte[]> packet, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.getHighSpeedVideoFpsRanges = packet;
        if (outputFileOptions == null) {
            throw new java.lang.NullPointerException("Null outputFileOptions");
        }
        this.Camera2StreamConfigurationMap = outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    final androidx.camera.core.processing.Packet<byte[]> getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    final androidx.camera.core.ImageCapture.OutputFileOptions getHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{packet=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", outputFileOptions=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.JpegBytes2Disk.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.JpegBytes2Disk.In in = (androidx.camera.core.imagecapture.JpegBytes2Disk.In) obj;
        return this.getHighSpeedVideoFpsRanges.equals(in.getHighSpeedVideoFpsRanges()) && this.Camera2StreamConfigurationMap.equals(in.getHighResolutionOutputSizeshNQ4ISI());
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRanges.hashCode() ^ 1000003) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode();
    }
}
