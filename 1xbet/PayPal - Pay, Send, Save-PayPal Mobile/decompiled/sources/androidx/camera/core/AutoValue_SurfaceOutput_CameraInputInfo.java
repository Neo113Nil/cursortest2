package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_SurfaceOutput_CameraInputInfo extends androidx.camera.core.SurfaceOutput.CameraInputInfo {
    private final android.graphics.Rect Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.CameraInternal getHighSpeedVideoFpsRangesFor;
    private final android.util.Size getHighSpeedVideoSizes;

    AutoValue_SurfaceOutput_CameraInputInfo(android.util.Size size, android.graphics.Rect rect, androidx.camera.core.impl.CameraInternal cameraInternal, int i, boolean z) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null inputSize");
        }
        this.getHighSpeedVideoSizes = size;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null inputCropRect");
        }
        this.Camera2StreamConfigurationMap = rect;
        this.getHighSpeedVideoFpsRangesFor = cameraInternal;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final android.util.Size getInputSize() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final android.graphics.Rect getInputCropRect() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final androidx.camera.core.impl.CameraInternal getCameraInternal() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final int getRotationDegrees() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final boolean getMirroring() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", inputCropRect=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", cameraInternal=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", rotationDegrees=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", mirroring=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceOutput.CameraInputInfo)) {
            return false;
        }
        androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo = (androidx.camera.core.SurfaceOutput.CameraInputInfo) obj;
        if (!this.getHighSpeedVideoSizes.equals(cameraInputInfo.getInputSize()) || !this.Camera2StreamConfigurationMap.equals(cameraInputInfo.getInputCropRect())) {
            return false;
        }
        androidx.camera.core.impl.CameraInternal cameraInternal = this.getHighSpeedVideoFpsRangesFor;
        if (cameraInternal == null) {
            if (cameraInputInfo.getCameraInternal() != null) {
                return false;
            }
        } else if (!cameraInternal.equals(cameraInputInfo.getCameraInternal())) {
            return false;
        }
        return this.getHighSpeedVideoFpsRanges == cameraInputInfo.getRotationDegrees() && this.getHighResolutionOutputSizeshNQ4ISI == cameraInputInfo.getMirroring();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        int hashCode2 = this.Camera2StreamConfigurationMap.hashCode();
        androidx.camera.core.impl.CameraInternal cameraInternal = this.getHighSpeedVideoFpsRangesFor;
        int hashCode3 = cameraInternal == null ? 0 : cameraInternal.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ this.getHighSpeedVideoFpsRanges) * 1000003) ^ (this.getHighResolutionOutputSizeshNQ4ISI ? 1231 : 1237);
    }
}
