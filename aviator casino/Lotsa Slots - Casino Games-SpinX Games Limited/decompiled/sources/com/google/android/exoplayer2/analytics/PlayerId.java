package com.google.android.exoplayer2.analytics;

/* loaded from: classes3.dex */
public final class PlayerId {
    public static final com.google.android.exoplayer2.analytics.PlayerId UNSET;
    private final com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31;

    static {
        UNSET = com.google.android.exoplayer2.util.Util.SDK_INT < 31 ? new com.google.android.exoplayer2.analytics.PlayerId() : new com.google.android.exoplayer2.analytics.PlayerId(com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31.UNSET);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerId() {
        this((com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31) null);
        com.google.android.exoplayer2.util.Assertions.checkState(com.google.android.exoplayer2.util.Util.SDK_INT < 31);
    }

    public PlayerId(android.media.metrics.LogSessionId logSessionId) {
        this(new com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31(logSessionId));
    }

    private PlayerId(com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31) {
        this.logSessionIdApi31 = logSessionIdApi31;
    }

    public android.media.metrics.LogSessionId getLogSessionId() {
        return ((com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.logSessionIdApi31)).logSessionId;
    }

    private static final class LogSessionIdApi31 {
        public static final com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31 UNSET = new com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE);
        public final android.media.metrics.LogSessionId logSessionId;

        public LogSessionIdApi31(android.media.metrics.LogSessionId logSessionId) {
            this.logSessionId = logSessionId;
        }
    }
}
