package androidx.camera.core;

/* loaded from: classes6.dex */
public interface RetryPolicy {
    public static final long DEFAULT_RETRY_TIMEOUT_IN_MILLIS = 6000;
    public static final androidx.camera.core.RetryPolicy NEVER = new androidx.camera.core.RetryPolicy() { // from class: androidx.camera.core.RetryPolicy$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.RetryPolicy
        public final androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
            androidx.camera.core.RetryPolicy.RetryConfig retryConfig;
            retryConfig = androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY;
            return retryConfig;
        }
    };
    public static final androidx.camera.core.RetryPolicy DEFAULT = new androidx.camera.core.impl.CameraProviderInitRetryPolicy.Legacy(getDefaultRetryTimeoutInMillis());
    public static final androidx.camera.core.RetryPolicy RETRY_UNAVAILABLE_CAMERA = new androidx.camera.core.impl.CameraProviderInitRetryPolicy(getDefaultRetryTimeoutInMillis());

    public interface ExecutionState {
        public static final int STATUS_CAMERA_UNAVAILABLE = 2;
        public static final int STATUS_CONFIGURATION_FAIL = 1;
        public static final int STATUS_UNKNOWN_ERROR = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Status {
        }

        java.lang.Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    static long getDefaultRetryTimeoutInMillis() {
        return DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
    }

    default long getTimeoutInMillis() {
        return 0L;
    }

    androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState);

    public static final class Builder {
        private long Camera2StreamConfigurationMap;
        private final androidx.camera.core.RetryPolicy getHighSpeedVideoFpsRanges;

        public Builder(androidx.camera.core.RetryPolicy retryPolicy) {
            this.getHighSpeedVideoFpsRanges = retryPolicy;
            this.Camera2StreamConfigurationMap = retryPolicy.getTimeoutInMillis();
        }

        public final androidx.camera.core.RetryPolicy.Builder setTimeoutInMillis(long j) {
            this.Camera2StreamConfigurationMap = j;
            return this;
        }

        public final androidx.camera.core.RetryPolicy build() {
            androidx.camera.core.RetryPolicy retryPolicy = this.getHighSpeedVideoFpsRanges;
            if (retryPolicy instanceof androidx.camera.core.impl.RetryPolicyInternal) {
                return ((androidx.camera.core.impl.RetryPolicyInternal) retryPolicy).copy(this.Camera2StreamConfigurationMap);
            }
            return new androidx.camera.core.impl.TimeoutRetryPolicy(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }
    }

    public static final class RetryConfig {
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoFpsRangesFor;
        private final long getHighSpeedVideoSizes;
        public static final androidx.camera.core.RetryPolicy.RetryConfig NOT_RETRY = new androidx.camera.core.RetryPolicy.RetryConfig(false, 0);
        public static final androidx.camera.core.RetryPolicy.RetryConfig DEFAULT_DELAY_RETRY = new androidx.camera.core.RetryPolicy.RetryConfig();
        public static final androidx.camera.core.RetryPolicy.RetryConfig MINI_DELAY_RETRY = new androidx.camera.core.RetryPolicy.RetryConfig(true, 100);
        public static androidx.camera.core.RetryPolicy.RetryConfig COMPLETE_WITHOUT_FAILURE = new androidx.camera.core.RetryPolicy.RetryConfig(false, 0L, true);

        public static long getDefaultRetryDelayInMillis() {
            return 500L;
        }

        /* synthetic */ RetryConfig(boolean z, long j, byte b) {
            this(z, j);
        }

        private RetryConfig() {
            this(true, getDefaultRetryDelayInMillis());
        }

        private RetryConfig(boolean z, long j) {
            this(z, j, false);
        }

        private RetryConfig(boolean z, long j, boolean z2) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoSizes = j;
            if (z2) {
                androidx.core.util.Preconditions.checkArgument(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.getHighSpeedVideoFpsRangesFor = z2;
        }

        public final boolean shouldRetry() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final long getRetryDelayInMillis() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean shouldCompleteWithoutFailure() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public static final class Builder {
            private boolean getHighResolutionOutputSizeshNQ4ISI = true;
            private long Camera2StreamConfigurationMap = androidx.camera.core.RetryPolicy.RetryConfig.getDefaultRetryDelayInMillis();

            public final androidx.camera.core.RetryPolicy.RetryConfig.Builder setShouldRetry(boolean z) {
                this.getHighResolutionOutputSizeshNQ4ISI = z;
                return this;
            }

            public final androidx.camera.core.RetryPolicy.RetryConfig.Builder setRetryDelayInMillis(long j) {
                this.Camera2StreamConfigurationMap = j;
                return this;
            }

            public final androidx.camera.core.RetryPolicy.RetryConfig build() {
                return new androidx.camera.core.RetryPolicy.RetryConfig(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, (byte) 0);
            }
        }
    }
}
