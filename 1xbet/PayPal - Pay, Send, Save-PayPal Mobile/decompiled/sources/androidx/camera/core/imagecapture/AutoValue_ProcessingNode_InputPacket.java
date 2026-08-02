package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_ProcessingNode_InputPacket extends androidx.camera.core.imagecapture.ProcessingNode.InputPacket {
    private final androidx.camera.core.imagecapture.ProcessingRequest getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.ImageProxy getHighSpeedVideoFpsRangesFor;

    AutoValue_ProcessingNode_InputPacket(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.ImageProxy imageProxy) {
        if (processingRequest == null) {
            throw new java.lang.NullPointerException("Null processingRequest");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = processingRequest;
        if (imageProxy == null) {
            throw new java.lang.NullPointerException("Null imageProxy");
        }
        this.getHighSpeedVideoFpsRangesFor = imageProxy;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.InputPacket
    final androidx.camera.core.imagecapture.ProcessingRequest getHighSpeedVideoSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.InputPacket
    final androidx.camera.core.ImageProxy getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InputPacket{processingRequest=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", imageProxy=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.ProcessingNode.InputPacket)) {
            return false;
        }
        androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket = (androidx.camera.core.imagecapture.ProcessingNode.InputPacket) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(inputPacket.getHighSpeedVideoSizes()) && this.getHighSpeedVideoFpsRangesFor.equals(inputPacket.getHighSpeedVideoFpsRangesFor());
    }

    public final int hashCode() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
