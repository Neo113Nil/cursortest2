package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_Bitmap2JpegBytes_In extends androidx.camera.core.imagecapture.Bitmap2JpegBytes.In {
    private final int getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.processing.Packet<android.graphics.Bitmap> getHighSpeedVideoSizes;

    AutoValue_Bitmap2JpegBytes_In(androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet, int i) {
        if (packet == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.getHighSpeedVideoSizes = packet;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    final androidx.camera.core.processing.Packet<android.graphics.Bitmap> getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    final int getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{packet=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", jpegQuality=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.Bitmap2JpegBytes.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.Bitmap2JpegBytes.In in = (androidx.camera.core.imagecapture.Bitmap2JpegBytes.In) obj;
        return this.getHighSpeedVideoSizes.equals(in.getHighSpeedVideoFpsRanges()) && this.getHighSpeedVideoFpsRanges == in.getHighSpeedVideoSizes();
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoSizes.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges;
    }
}
