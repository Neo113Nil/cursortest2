package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_CaptureNode_In extends androidx.camera.core.imagecapture.CaptureNode.In {
    private final androidx.camera.core.imagecapture.PostviewSettings getHighSpeedVideoSizesFor;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> getInputFormats;
    private final java.util.List<java.lang.Integer> getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final androidx.camera.core.ImageReaderProxyProvider getOutputMinFrameDuration;
    private final boolean getOutputMinFrameDurationlomOqCM;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getOutputStallDuration;
    private final android.util.Size getOutputStallDurationlomOqCM;

    AutoValue_CaptureNode_In(android.util.Size size, int i, java.util.List<java.lang.Integer> list, boolean z, androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider, androidx.camera.core.imagecapture.PostviewSettings postviewSettings, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> edge, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> edge2) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.getOutputStallDurationlomOqCM = size;
        this.getOutputFormats = i;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outputFormats");
        }
        this.getInputSizeshNQ4ISI = list;
        this.getOutputMinFrameDurationlomOqCM = z;
        this.getOutputMinFrameDuration = imageReaderProxyProvider;
        this.getHighSpeedVideoSizesFor = postviewSettings;
        this.getOutputStallDuration = edge;
        this.getInputFormats = edge2;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final android.util.Size getOutputFormats() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final int getHighSpeedVideoFpsRanges() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final java.util.List<java.lang.Integer> Camera2StreamConfigurationMap() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final boolean getOutputMinFrameDuration() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final androidx.camera.core.ImageReaderProxyProvider getHighResolutionOutputSizeshNQ4ISI() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final androidx.camera.core.imagecapture.PostviewSettings getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getInputSizeshNQ4ISI() {
        return this.getOutputStallDuration;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> getHighSpeedVideoFpsRangesFor() {
        return this.getInputFormats;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{size=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", inputFormat=");
        sb.append(this.getOutputFormats);
        sb.append(", outputFormats=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", virtualCamera=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(", imageReaderProxyProvider=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", postviewSettings=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", requestEdge=");
        sb.append(this.getOutputStallDuration);
        sb.append(", errorEdge=");
        sb.append(this.getInputFormats);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.CaptureNode.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.CaptureNode.In in = (androidx.camera.core.imagecapture.CaptureNode.In) obj;
        if (!this.getOutputStallDurationlomOqCM.equals(in.getOutputFormats()) || this.getOutputFormats != in.getHighSpeedVideoFpsRanges() || !this.getInputSizeshNQ4ISI.equals(in.Camera2StreamConfigurationMap()) || this.getOutputMinFrameDurationlomOqCM != in.getOutputMinFrameDuration()) {
            return false;
        }
        androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider = this.getOutputMinFrameDuration;
        if (imageReaderProxyProvider == null) {
            if (in.getHighResolutionOutputSizeshNQ4ISI() != null) {
                return false;
            }
        } else if (!imageReaderProxyProvider.equals(in.getHighResolutionOutputSizeshNQ4ISI())) {
            return false;
        }
        androidx.camera.core.imagecapture.PostviewSettings postviewSettings = this.getHighSpeedVideoSizesFor;
        if (postviewSettings == null) {
            if (in.getHighSpeedVideoSizes() != null) {
                return false;
            }
        } else if (!postviewSettings.equals(in.getHighSpeedVideoSizes())) {
            return false;
        }
        return this.getOutputStallDuration.equals(in.getInputSizeshNQ4ISI()) && this.getInputFormats.equals(in.getHighSpeedVideoFpsRangesFor());
    }

    public final int hashCode() {
        int hashCode = this.getOutputStallDurationlomOqCM.hashCode();
        int i = this.getOutputFormats;
        int hashCode2 = this.getInputSizeshNQ4ISI.hashCode();
        int i2 = this.getOutputMinFrameDurationlomOqCM ? 1231 : 1237;
        androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider = this.getOutputMinFrameDuration;
        int hashCode3 = imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode();
        androidx.camera.core.imagecapture.PostviewSettings postviewSettings = this.getHighSpeedVideoSizesFor;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ hashCode3) * 1000003) ^ (postviewSettings != null ? postviewSettings.hashCode() : 0)) * 1000003) ^ this.getOutputStallDuration.hashCode()) * 1000003) ^ this.getInputFormats.hashCode();
    }
}
