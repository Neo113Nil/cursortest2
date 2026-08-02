package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_SurfaceRequest_TransformationInfo extends androidx.camera.core.SurfaceRequest.TransformationInfo {
    private final int Camera2StreamConfigurationMap;
    private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final android.graphics.Matrix getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final boolean getOutputMinFrameDuration;

    AutoValue_SurfaceRequest_TransformationInfo(android.graphics.Rect rect, int i, int i2, boolean z, android.graphics.Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new java.lang.NullPointerException("Null getCropRect");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = rect;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoSizes = z;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null getSensorToBufferTransform");
        }
        this.getHighSpeedVideoFpsRangesFor = matrix;
        this.getOutputMinFrameDuration = z2;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final android.graphics.Rect getCropRect() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final int getRotationDegrees() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final int getTargetRotation() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final boolean hasCameraTransform() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final android.graphics.Matrix getSensorToBufferTransform() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final boolean isMirroring() {
        return this.getOutputMinFrameDuration;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getRotationDegrees=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getTargetRotation=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", hasCameraTransform=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", isMirroring=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceRequest.TransformationInfo)) {
            return false;
        }
        androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = (androidx.camera.core.SurfaceRequest.TransformationInfo) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(transformationInfo.getCropRect()) && this.getHighSpeedVideoFpsRanges == transformationInfo.getRotationDegrees() && this.Camera2StreamConfigurationMap == transformationInfo.getTargetRotation() && this.getHighSpeedVideoSizes == transformationInfo.hasCameraTransform() && this.getHighSpeedVideoFpsRangesFor.equals(transformationInfo.getSensorToBufferTransform()) && this.getOutputMinFrameDuration == transformationInfo.isMirroring();
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoSizes ? 1231 : 1237;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode()) * 1000003) ^ (this.getOutputMinFrameDuration ? 1231 : 1237);
    }
}
