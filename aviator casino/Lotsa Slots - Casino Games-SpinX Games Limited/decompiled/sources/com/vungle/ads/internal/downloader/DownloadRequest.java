package com.vungle.ads.internal.downloader;

/* compiled from: DownloadRequest.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u00013B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\r\u0010$\u001a\u00020\tH\u0000¢\u0006\u0002\b%J\u0006\u0010\u0018\u001a\u00020\tJ\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eH\u0000¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\tH\u0000¢\u0006\u0002\b)J\u0006\u0010*\u001a\u00020 J\u0015\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u001cH\u0000¢\u0006\u0002\b-J\u0006\u0010.\u001a\u00020#J\u0006\u0010/\u001a\u00020#J\u0006\u00100\u001a\u00020#J\u0006\u00101\u001a\u00020#J\b\u00102\u001a\u00020\u001cH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R2\u0010\u001a\u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001e0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/vungle/ads/internal/downloader/DownloadRequest;", "", "priority", "Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "asset", "Lcom/vungle/ads/internal/model/AdAsset;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "maxRetries", "", "(Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;Lcom/vungle/ads/internal/model/AdAsset;Lcom/vungle/ads/internal/util/LogEntry;I)V", "getAsset", "()Lcom/vungle/ads/internal/model/AdAsset;", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentRetryAttempt", "Ljava/util/concurrent/atomic/AtomicInteger;", "downloadTemplateDuration", "Lcom/vungle/ads/TimeIntervalMetric;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "getMaxRetries$vungle_ads_release", "()I", "partialDownloadDurationMetric", "getPriority", "()Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "retryReasons", "", "", "kotlin.jvm.PlatformType", "", "canRetry", "", "canRetry$vungle_ads_release", "cancel", "", "getCurrentRetryAttempt", "getCurrentRetryAttempt$vungle_ads_release", "getRetryReasons", "getRetryReasons$vungle_ads_release", "incrementRetryAttempt", "incrementRetryAttempt$vungle_ads_release", "isCancelled", "recordRetryReason", "reason", "recordRetryReason$vungle_ads_release", "startPartialDownloadRecord", "startTemplateRecord", "stopPartialDownloadRecord", "stopTemplateRecord", "toString", "Priority", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DownloadRequest {
    private final com.vungle.ads.internal.model.AdAsset asset;
    private final java.util.concurrent.atomic.AtomicBoolean cancelled;
    private final java.util.concurrent.atomic.AtomicInteger currentRetryAttempt;
    private com.vungle.ads.TimeIntervalMetric downloadTemplateDuration;
    private final com.vungle.ads.internal.util.LogEntry logEntry;
    private final int maxRetries;
    private com.vungle.ads.TimeIntervalMetric partialDownloadDurationMetric;
    private final com.vungle.ads.internal.downloader.DownloadRequest.Priority priority;
    private final java.util.List<java.lang.String> retryReasons;

    public DownloadRequest(com.vungle.ads.internal.downloader.DownloadRequest.Priority priority, com.vungle.ads.internal.model.AdAsset asset, com.vungle.ads.internal.util.LogEntry logEntry, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.logEntry = logEntry;
        this.maxRetries = i;
        this.cancelled = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.currentRetryAttempt = new java.util.concurrent.atomic.AtomicInteger(0);
        this.retryReasons = java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    public /* synthetic */ DownloadRequest(com.vungle.ads.internal.downloader.DownloadRequest.Priority priority, com.vungle.ads.internal.model.AdAsset adAsset, com.vungle.ads.internal.util.LogEntry logEntry, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(priority, adAsset, (i2 & 4) != 0 ? null : logEntry, (i2 & 8) != 0 ? 0 : i);
    }

    public final com.vungle.ads.internal.downloader.DownloadRequest.Priority getPriority() {
        return this.priority;
    }

    public final com.vungle.ads.internal.model.AdAsset getAsset() {
        return this.asset;
    }

    /* renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.util.LogEntry getLogEntry() {
        return this.logEntry;
    }

    /* renamed from: getMaxRetries$vungle_ads_release, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int incrementRetryAttempt$vungle_ads_release() {
        return this.currentRetryAttempt.incrementAndGet();
    }

    public final int getCurrentRetryAttempt$vungle_ads_release() {
        return this.currentRetryAttempt.get();
    }

    public final boolean canRetry$vungle_ads_release() {
        return this.currentRetryAttempt.get() < this.maxRetries;
    }

    public final void recordRetryReason$vungle_ads_release(java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        this.retryReasons.add(reason);
    }

    public final java.util.List<java.lang.String> getRetryReasons$vungle_ads_release() {
        java.util.List<java.lang.String> retryReasons = this.retryReasons;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retryReasons, "retryReasons");
        return kotlin.collections.CollectionsKt.toList(retryReasons);
    }

    public java.lang.String toString() {
        return "DownloadRequest{priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + "', cancelled=" + this.cancelled + ", retryAttempt=" + this.currentRetryAttempt.get() + ", maxRetries=" + this.maxRetries + ", logEntry=" + this.logEntry + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    /* compiled from: DownloadRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority", "()I", "CRITICAL", "HIGHEST", "HIGH", "LOWEST", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Priority {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        Priority(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public final void startPartialDownloadRecord() {
        if (this.partialDownloadDurationMetric != null) {
            return;
        }
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.partialDownloadDurationMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void stopPartialDownloadRecord() {
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric = this.partialDownloadDurationMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, "percentage=" + this.asset.getPercentage() + " url=" + this.asset.getServerPath());
        }
    }

    public final void startTemplateRecord() {
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadTemplateDuration = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void stopTemplateRecord() {
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric = this.downloadTemplateDuration;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, this.asset.getServerPath());
        }
    }
}
