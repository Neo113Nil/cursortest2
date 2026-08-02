package androidx.camera.lifecycle;

/* loaded from: classes6.dex */
final class AutoValue_LifecycleCameraRepository_Key extends androidx.camera.lifecycle.LifecycleCameraRepository.Key {
    private final androidx.camera.core.CameraIdentifier Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    AutoValue_LifecycleCameraRepository_Key(int i, androidx.camera.core.CameraIdentifier cameraIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (cameraIdentifier == null) {
            throw new java.lang.NullPointerException("Null cameraIdentifier");
        }
        this.Camera2StreamConfigurationMap = cameraIdentifier;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public final int getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public final androidx.camera.core.CameraIdentifier getHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Key{lifecycleOwnerHash=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", cameraIdentifier=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.lifecycle.LifecycleCameraRepository.Key)) {
            return false;
        }
        androidx.camera.lifecycle.LifecycleCameraRepository.Key key = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == key.getHighSpeedVideoFpsRangesFor() && this.Camera2StreamConfigurationMap.equals(key.getHighSpeedVideoSizes());
    }

    public final int hashCode() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI ^ 1000003) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode();
    }
}
