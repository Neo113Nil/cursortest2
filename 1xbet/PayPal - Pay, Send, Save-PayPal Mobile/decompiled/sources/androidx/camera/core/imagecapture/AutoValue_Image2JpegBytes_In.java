package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_Image2JpegBytes_In extends androidx.camera.core.imagecapture.Image2JpegBytes.In {
    private final androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    AutoValue_Image2JpegBytes_In(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet, int i) {
        if (packet == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.getHighSpeedVideoFpsRanges = packet;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.In
    final androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.In
    final int getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{packet=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", jpegQuality=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.Image2JpegBytes.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.Image2JpegBytes.In in = (androidx.camera.core.imagecapture.Image2JpegBytes.In) obj;
        return this.getHighSpeedVideoFpsRanges.equals(in.getHighResolutionOutputSizeshNQ4ISI()) && this.getHighSpeedVideoSizes == in.getHighSpeedVideoSizes();
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRanges.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoSizes;
    }
}
