package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_CameraThreadConfig extends androidx.camera.core.impl.CameraThreadConfig {
    private final android.os.Handler getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

    AutoValue_CameraThreadConfig(java.util.concurrent.Executor executor, android.os.Handler handler) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Null cameraExecutor");
        }
        this.getHighSpeedVideoFpsRangesFor = executor;
        if (handler == null) {
            throw new java.lang.NullPointerException("Null schedulerHandler");
        }
        this.getHighSpeedVideoFpsRanges = handler;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public final java.util.concurrent.Executor getCameraExecutor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public final android.os.Handler getSchedulerHandler() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraThreadConfig{cameraExecutor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", schedulerHandler=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.CameraThreadConfig)) {
            return false;
        }
        androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig = (androidx.camera.core.impl.CameraThreadConfig) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(cameraThreadConfig.getCameraExecutor()) && this.getHighSpeedVideoFpsRanges.equals(cameraThreadConfig.getSchedulerHandler());
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRangesFor.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges.hashCode();
    }
}
