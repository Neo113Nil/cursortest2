package androidx.camera.core;

/* loaded from: classes6.dex */
public class ImageCaptureLatencyEstimate {
    public static final long UNDEFINED_CAPTURE_LATENCY = -1;
    public static final androidx.camera.core.ImageCaptureLatencyEstimate UNDEFINED_IMAGE_CAPTURE_LATENCY = new androidx.camera.core.ImageCaptureLatencyEstimate(-1, -1);
    public static final long UNDEFINED_PROCESSING_LATENCY = -1;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoSizes;

    public ImageCaptureLatencyEstimate(long j, long j2) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = j2;
        long j3 = -1;
        if (j != -1 && j2 != -1) {
            j3 = j + j2;
        }
        this.getHighSpeedVideoFpsRanges = j3;
    }

    public long getCaptureLatencyMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public long getProcessingLatencyMillis() {
        return this.getHighSpeedVideoSizes;
    }

    public long getTotalCaptureLatencyMillis() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.ImageCaptureLatencyEstimate)) {
            return false;
        }
        androidx.camera.core.ImageCaptureLatencyEstimate imageCaptureLatencyEstimate = (androidx.camera.core.ImageCaptureLatencyEstimate) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == imageCaptureLatencyEstimate.getCaptureLatencyMillis() && this.getHighSpeedVideoSizes == imageCaptureLatencyEstimate.getProcessingLatencyMillis() && this.getHighSpeedVideoFpsRanges == imageCaptureLatencyEstimate.getTotalCaptureLatencyMillis();
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Long.valueOf(this.getHighSpeedVideoSizes), java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("captureLatencyMillis=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", processingLatencyMillis=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", totalCaptureLatencyMillis=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }
}
