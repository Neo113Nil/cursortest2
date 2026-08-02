package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_CameraState extends androidx.camera.core.CameraState {
    private final androidx.camera.core.CameraState.StateError Camera2StreamConfigurationMap;
    private final androidx.camera.core.CameraState.Type getHighResolutionOutputSizeshNQ4ISI;

    AutoValue_CameraState(androidx.camera.core.CameraState.Type type, androidx.camera.core.CameraState.StateError stateError) {
        if (type == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = type;
        this.Camera2StreamConfigurationMap = stateError;
    }

    @Override // androidx.camera.core.CameraState
    public final androidx.camera.core.CameraState.Type getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.CameraState
    public final androidx.camera.core.CameraState.StateError getError() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraState{type=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", error=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.CameraState)) {
            return false;
        }
        androidx.camera.core.CameraState cameraState = (androidx.camera.core.CameraState) obj;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.equals(cameraState.getType())) {
            return false;
        }
        androidx.camera.core.CameraState.StateError stateError = this.Camera2StreamConfigurationMap;
        if (stateError == null) {
            if (cameraState.getError() != null) {
                return false;
            }
        } else if (!stateError.equals(cameraState.getError())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        androidx.camera.core.CameraState.StateError stateError = this.Camera2StreamConfigurationMap;
        return ((hashCode ^ 1000003) * 1000003) ^ (stateError == null ? 0 : stateError.hashCode());
    }
}
