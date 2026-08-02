package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_DngImage2Disk_In extends androidx.camera.core.imagecapture.DngImage2Disk.In {
    private final androidx.camera.core.ImageCapture.OutputFileOptions getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.ImageProxy getHighSpeedVideoFpsRangesFor;

    AutoValue_DngImage2Disk_In(androidx.camera.core.ImageProxy imageProxy, int i, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        if (imageProxy == null) {
            throw new java.lang.NullPointerException("Null imageProxy");
        }
        this.getHighSpeedVideoFpsRangesFor = imageProxy;
        this.getHighSpeedVideoFpsRanges = i;
        if (outputFileOptions == null) {
            throw new java.lang.NullPointerException("Null outputFileOptions");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.DngImage2Disk.In
    final androidx.camera.core.ImageProxy getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.imagecapture.DngImage2Disk.In
    final int getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.imagecapture.DngImage2Disk.In
    final androidx.camera.core.ImageCapture.OutputFileOptions getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{imageProxy=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", rotationDegrees=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", outputFileOptions=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.DngImage2Disk.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.DngImage2Disk.In in = (androidx.camera.core.imagecapture.DngImage2Disk.In) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(in.getHighSpeedVideoSizes()) && this.getHighSpeedVideoFpsRanges == in.getHighSpeedVideoFpsRangesFor() && this.getHighResolutionOutputSizeshNQ4ISI.equals(in.getHighResolutionOutputSizeshNQ4ISI());
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoFpsRangesFor.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
