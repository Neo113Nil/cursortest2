package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_OutputSurfaceConfiguration extends androidx.camera.core.impl.OutputSurfaceConfiguration {
    private final androidx.camera.core.impl.OutputSurface Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.OutputSurface getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.OutputSurface getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.OutputSurface getHighSpeedVideoFpsRangesFor;

    AutoValue_OutputSurfaceConfiguration(androidx.camera.core.impl.OutputSurface outputSurface, androidx.camera.core.impl.OutputSurface outputSurface2, androidx.camera.core.impl.OutputSurface outputSurface3, androidx.camera.core.impl.OutputSurface outputSurface4) {
        if (outputSurface == null) {
            throw new java.lang.NullPointerException("Null previewOutputSurface");
        }
        this.Camera2StreamConfigurationMap = outputSurface;
        if (outputSurface2 == null) {
            throw new java.lang.NullPointerException("Null imageCaptureOutputSurface");
        }
        this.getHighSpeedVideoFpsRangesFor = outputSurface2;
        this.getHighSpeedVideoFpsRanges = outputSurface3;
        this.getHighResolutionOutputSizeshNQ4ISI = outputSurface4;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final androidx.camera.core.impl.OutputSurface getPreviewOutputSurface() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final androidx.camera.core.impl.OutputSurface getImageCaptureOutputSurface() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final androidx.camera.core.impl.OutputSurface getImageAnalysisOutputSurface() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final androidx.camera.core.impl.OutputSurface getPostviewOutputSurface() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputSurfaceConfiguration{previewOutputSurface=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", imageCaptureOutputSurface=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", imageAnalysisOutputSurface=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", postviewOutputSurface=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.OutputSurfaceConfiguration)) {
            return false;
        }
        androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration = (androidx.camera.core.impl.OutputSurfaceConfiguration) obj;
        if (!this.Camera2StreamConfigurationMap.equals(outputSurfaceConfiguration.getPreviewOutputSurface()) || !this.getHighSpeedVideoFpsRangesFor.equals(outputSurfaceConfiguration.getImageCaptureOutputSurface())) {
            return false;
        }
        androidx.camera.core.impl.OutputSurface outputSurface = this.getHighSpeedVideoFpsRanges;
        if (outputSurface == null) {
            if (outputSurfaceConfiguration.getImageAnalysisOutputSurface() != null) {
                return false;
            }
        } else if (!outputSurface.equals(outputSurfaceConfiguration.getImageAnalysisOutputSurface())) {
            return false;
        }
        androidx.camera.core.impl.OutputSurface outputSurface2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (outputSurface2 == null) {
            if (outputSurfaceConfiguration.getPostviewOutputSurface() != null) {
                return false;
            }
        } else if (!outputSurface2.equals(outputSurfaceConfiguration.getPostviewOutputSurface())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        androidx.camera.core.impl.OutputSurface outputSurface = this.getHighSpeedVideoFpsRanges;
        int hashCode3 = outputSurface == null ? 0 : outputSurface.hashCode();
        androidx.camera.core.impl.OutputSurface outputSurface2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (outputSurface2 != null ? outputSurface2.hashCode() : 0);
    }
}
