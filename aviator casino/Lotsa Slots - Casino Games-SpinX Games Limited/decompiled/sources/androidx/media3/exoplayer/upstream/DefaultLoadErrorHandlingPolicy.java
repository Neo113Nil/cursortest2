package androidx.media3.exoplayer.upstream;

/* loaded from: classes2.dex */
public class DefaultLoadErrorHandlingPolicy implements androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy {
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;

    @java.lang.Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;
    private final int minimumLoadableRetryCount;

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public /* synthetic */ void onLoadTaskConcluded(long j) {
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.CC.$default$onLoadTaskConcluded(this, j);
    }

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    public DefaultLoadErrorHandlingPolicy(int i) {
        this.minimumLoadableRetryCount = i;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        if (!isEligibleForFallback(loadErrorInfo.exception)) {
            return null;
        }
        if (fallbackOptions.isFallbackAvailable(1)) {
            return new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
        }
        if (fallbackOptions.isFallbackAvailable(2)) {
            return new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        java.io.IOException iOException = loadErrorInfo.exception;
        if ((iOException instanceof androidx.media3.common.ParserException) || (iOException instanceof java.io.FileNotFoundException) || (iOException instanceof androidx.media3.datasource.HttpDataSource.CleartextNotPermittedException) || (iOException instanceof androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException) || androidx.media3.datasource.DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return java.lang.Math.min((loadErrorInfo.errorCount - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int i) {
        int i2 = this.minimumLoadableRetryCount;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    protected boolean isEligibleForFallback(java.io.IOException iOException) {
        if (!(iOException instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) iOException;
        return invalidResponseCodeException.responseCode == 403 || invalidResponseCodeException.responseCode == 404 || invalidResponseCodeException.responseCode == 410 || invalidResponseCodeException.responseCode == 416 || invalidResponseCodeException.responseCode == 500 || invalidResponseCodeException.responseCode == 503;
    }
}
