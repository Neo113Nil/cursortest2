package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_CameraState_StateError extends androidx.camera.core.CameraState.StateError {
    private final int Camera2StreamConfigurationMap;
    private final java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    AutoValue_CameraState_StateError(int i, java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = th;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public final int getCode() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public final java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StateError{code=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", cause=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.CameraState.StateError)) {
            return false;
        }
        androidx.camera.core.CameraState.StateError stateError = (androidx.camera.core.CameraState.StateError) obj;
        if (this.Camera2StreamConfigurationMap != stateError.getCode()) {
            return false;
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        if (th == null) {
            if (stateError.getCause() != null) {
                return false;
            }
        } else if (!th.equals(stateError.getCause())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.Camera2StreamConfigurationMap;
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        return ((i ^ 1000003) * 1000003) ^ (th == null ? 0 : th.hashCode());
    }
}
