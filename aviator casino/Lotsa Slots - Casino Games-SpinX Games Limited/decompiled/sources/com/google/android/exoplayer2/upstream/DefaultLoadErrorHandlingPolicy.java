package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public class DefaultLoadErrorHandlingPolicy implements com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy {
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;

    @java.lang.Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;
    private final int minimumLoadableRetryCount;

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public /* synthetic */ void onLoadTaskConcluded(long j) {
        com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.CC.$default$onLoadTaskConcluded(this, j);
    }

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    public DefaultLoadErrorHandlingPolicy(int i) {
        this.minimumLoadableRetryCount = i;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        if (!isEligibleForFallback(loadErrorInfo.exception)) {
            return null;
        }
        if (fallbackOptions.isFallbackAvailable(1)) {
            return new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
        }
        if (fallbackOptions.isFallbackAvailable(2)) {
            return new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        java.io.IOException iOException = loadErrorInfo.exception;
        if ((iOException instanceof com.google.android.exoplayer2.ParserException) || (iOException instanceof java.io.FileNotFoundException) || (iOException instanceof com.google.android.exoplayer2.upstream.HttpDataSource.CleartextNotPermittedException) || (iOException instanceof com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException) || com.google.android.exoplayer2.upstream.DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return java.lang.Math.min((loadErrorInfo.errorCount - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int i) {
        int i2 = this.minimumLoadableRetryCount;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    protected boolean isEligibleForFallback(java.io.IOException iOException) {
        if (!(iOException instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) iOException;
        return invalidResponseCodeException.responseCode == 403 || invalidResponseCodeException.responseCode == 404 || invalidResponseCodeException.responseCode == 410 || invalidResponseCodeException.responseCode == 416 || invalidResponseCodeException.responseCode == 500 || invalidResponseCodeException.responseCode == 503;
    }
}
