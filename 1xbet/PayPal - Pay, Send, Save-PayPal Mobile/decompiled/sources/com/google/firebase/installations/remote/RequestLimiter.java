package com.google.firebase.installations.remote;

/* loaded from: classes4.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = java.util.concurrent.TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);
    private int attemptCount;
    private long nextRequestTime;
    private final com.google.firebase.installations.Utils utils;

    private static boolean isRetryableError(int i) {
        if (i != 429) {
            return i >= 500 && i < 600;
        }
        return true;
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    RequestLimiter(com.google.firebase.installations.Utils utils) {
        this.utils = utils;
    }

    RequestLimiter() {
        this.utils = com.google.firebase.installations.Utils.getInstance();
    }

    public void setNextRequestTime(int i) {
        synchronized (this) {
            if (isSuccessfulOrRequiresNewFidCreation(i)) {
                resetBackoffStrategy();
                return;
            }
            this.attemptCount++;
            this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i);
        }
    }

    private void resetBackoffStrategy() {
        synchronized (this) {
            this.attemptCount = 0;
        }
    }

    private long getBackoffDuration(int i) {
        synchronized (this) {
            if (!isRetryableError(i)) {
                return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
            }
            return (long) java.lang.Math.min(java.lang.Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
        }
    }

    public boolean isRequestAllowed() {
        boolean z;
        synchronized (this) {
            if (this.attemptCount != 0) {
                z = this.utils.currentTimeInMillis() > this.nextRequestTime;
            }
        }
        return z;
    }
}
