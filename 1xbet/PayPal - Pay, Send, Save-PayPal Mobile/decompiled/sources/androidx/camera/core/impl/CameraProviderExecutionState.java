package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class CameraProviderExecutionState implements androidx.camera.core.RetryPolicy.ExecutionState {
    private final int Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Throwable getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public CameraProviderExecutionState(long j, int i, java.lang.Throwable th) {
        this.getHighResolutionOutputSizeshNQ4ISI = android.os.SystemClock.elapsedRealtime() - j;
        this.Camera2StreamConfigurationMap = i;
        if (th instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) {
            this.getHighSpeedVideoFpsRangesFor = 2;
            this.getHighSpeedVideoFpsRanges = th;
            return;
        }
        if (th instanceof androidx.camera.core.InitializationException) {
            java.lang.Throwable cause = th.getCause();
            th = cause != null ? cause : th;
            this.getHighSpeedVideoFpsRanges = th;
            if (th instanceof androidx.camera.core.CameraUnavailableException) {
                this.getHighSpeedVideoFpsRangesFor = 2;
                return;
            } else if (th instanceof java.lang.IllegalArgumentException) {
                this.getHighSpeedVideoFpsRangesFor = 1;
                return;
            } else {
                this.getHighSpeedVideoFpsRangesFor = 0;
                return;
            }
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = th;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final int getStatus() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final long getExecutedTimeInMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final int getNumOfAttempts() {
        return this.Camera2StreamConfigurationMap;
    }
}
