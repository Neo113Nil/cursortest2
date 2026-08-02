package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class CameraProviderInitRetryPolicy implements androidx.camera.core.impl.RetryPolicyInternal {
    private final androidx.camera.core.RetryPolicy getHighResolutionOutputSizeshNQ4ISI;

    public CameraProviderInitRetryPolicy(final long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.TimeoutRetryPolicy(j, new androidx.camera.core.RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            @Override // androidx.camera.core.RetryPolicy
            public androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
                if (executionState.getStatus() == 1) {
                    return androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY;
                }
                return androidx.camera.core.RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }

            @Override // androidx.camera.core.RetryPolicy
            public long getTimeoutInMillis() {
                return j;
            }
        });
    }

    @Override // androidx.camera.core.RetryPolicy
    public final androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onRetryDecisionRequested(executionState);
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTimeoutInMillis();
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public final androidx.camera.core.RetryPolicy copy(long j) {
        return new androidx.camera.core.impl.CameraProviderInitRetryPolicy(j);
    }

    public static final class Legacy implements androidx.camera.core.impl.RetryPolicyInternal {
        private final androidx.camera.core.RetryPolicy getHighSpeedVideoFpsRanges;

        public Legacy(long j) {
            this.getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.CameraProviderInitRetryPolicy(j);
        }

        @Override // androidx.camera.core.RetryPolicy
        public final androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
            if (!this.getHighSpeedVideoFpsRanges.onRetryDecisionRequested(executionState).shouldRetry()) {
                java.lang.Throwable cause = executionState.getCause();
                if (cause instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) {
                    androidx.camera.core.Logger.e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) cause).getAvailableCameraCount() > 0) {
                        return androidx.camera.core.RetryPolicy.RetryConfig.COMPLETE_WITHOUT_FAILURE;
                    }
                }
                return androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY;
            }
            return androidx.camera.core.RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
        }

        @Override // androidx.camera.core.RetryPolicy
        public final long getTimeoutInMillis() {
            return this.getHighSpeedVideoFpsRanges.getTimeoutInMillis();
        }

        @Override // androidx.camera.core.impl.RetryPolicyInternal
        public final androidx.camera.core.RetryPolicy copy(long j) {
            return new androidx.camera.core.impl.CameraProviderInitRetryPolicy.Legacy(j);
        }
    }
}
