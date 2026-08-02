package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/analytics/SessionImpl;", "Lcom/zettle/sdk/analytics/Gdp$Session;", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lcom/zettle/sdk/analytics/Gdp$DataFormatter;", "formatter", "<init>", "(JLjava/util/concurrent/TimeUnit;Lcom/zettle/sdk/analytics/Gdp$DataFormatter;)V", "timestamp", "", io.ktor.http.LinkHeader.Rel.Next, "(J)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Gdp$DataFormatter;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SessionImpl implements com.zettle.sdk.analytics.Gdp.Session {
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Gdp.DataFormatter getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    public SessionImpl(long j, java.util.concurrent.TimeUnit timeUnit, com.zettle.sdk.analytics.Gdp.DataFormatter dataFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataFormatter, "");
        this.getHighSpeedVideoSizes = dataFormatter;
        this.getHighSpeedVideoFpsRanges = timeUnit.toMillis(j);
        this.getHighResolutionOutputSizeshNQ4ISI = "";
    }

    public /* synthetic */ SessionImpl(long j, java.util.concurrent.TimeUnit timeUnit, com.zettle.sdk.analytics.Gdp.DataFormatter dataFormatter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, timeUnit, (i & 4) != 0 ? com.zettle.sdk.analytics.Gdp.DataFormatter.Companion.create() : dataFormatter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
    
        if ((r5 - r4.Camera2StreamConfigurationMap) > r4.getHighSpeedVideoFpsRanges) goto L8;
     */
    @Override // com.zettle.sdk.analytics.Gdp.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String next(long timestamp) {
        java.lang.String str;
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.length() != 0) {
            }
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.format(timestamp);
            this.Camera2StreamConfigurationMap = timestamp;
            str = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return str;
    }
}
