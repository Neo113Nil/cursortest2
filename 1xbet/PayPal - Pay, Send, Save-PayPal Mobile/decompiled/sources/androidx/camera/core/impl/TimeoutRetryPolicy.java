package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class TimeoutRetryPolicy implements androidx.camera.core.RetryPolicy {
    private final long getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.RetryPolicy getHighSpeedVideoSizes;

    public TimeoutRetryPolicy(long j, androidx.camera.core.RetryPolicy retryPolicy) {
        androidx.core.util.Preconditions.checkArgument(j >= 0, "Timeout must be non-negative.");
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
        androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested = this.getHighSpeedVideoSizes.onRetryDecisionRequested(executionState);
        return (getTimeoutInMillis() <= 0 || executionState.getExecutedTimeInMillis() < getTimeoutInMillis() - onRetryDecisionRequested.getRetryDelayInMillis()) ? onRetryDecisionRequested : androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
