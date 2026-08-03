package com.vungle.ads;

/* compiled from: AnalyticsClient.kt */
@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002Z[B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u00109\u001a\u00020:H\u0003J\b\u0010;\u001a\u00020:H\u0003J2\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\bH\u0002J$\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010AH\u0002J-\u0010H\u001a\u00020:2\u0006\u00102\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\bJJ)\u0010K\u001a\u00020:2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010AH\u0000¢\u0006\u0002\bLJ$\u0010M\u001a\u00020:2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010AH\u0002J-\u0010N\u001a\u00020:2\u0006\u0010O\u001a\u00020P2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\bQJ-\u0010N\u001a\u00020:2\u0006\u0010R\u001a\u00020S2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\bQJ-\u0010N\u001a\u00020:2\u0006\u0010T\u001a\u00020U2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\bQJ-\u0010N\u001a\u00020:2\u0006\u0010V\u001a\u00020W2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\bQJ7\u0010N\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\bQJ2\u0010X\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010Y\u001a\u00020:H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\n8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u000eR$\u0010!\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u000eR\"\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\n8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u000eR$\u0010.\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R&\u00102\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006\\"}, d2 = {"Lcom/vungle/ads/AnalyticsClient;", "", "()V", "MAX_BATCH_SIZE", "", "REFRESH_TIME_MILLIS", "", "TAG", "", "errors", "Ljava/util/concurrent/BlockingQueue;", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Builder;", "getErrors$vungle_ads_release$annotations", "getErrors$vungle_ads_release", "()Ljava/util/concurrent/BlockingQueue;", "executor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "getExecutor$vungle_ads_release$annotations", "getExecutor$vungle_ads_release", "()Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "setExecutor$vungle_ads_release", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;)V", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release$annotations", "isInitialized$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "logLevel", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "metrics", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$Builder;", "getMetrics$vungle_ads_release$annotations", "getMetrics$vungle_ads_release", "metricsEnabled", "", "getMetricsEnabled$vungle_ads_release$annotations", "getMetricsEnabled$vungle_ads_release", "()Z", "setMetricsEnabled$vungle_ads_release", "(Z)V", "pendingErrors", "getPendingErrors$vungle_ads_release$annotations", "getPendingErrors$vungle_ads_release", "pendingMetrics", "getPendingMetrics$vungle_ads_release$annotations", "getPendingMetrics$vungle_ads_release", "refreshEnabled", "getRefreshEnabled$vungle_ads_release$annotations", "getRefreshEnabled$vungle_ads_release", "setRefreshEnabled$vungle_ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient$vungle_ads_release$annotations", "getVungleApiClient$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "setVungleApiClient$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApiClient;)V", "flushErrors", "", "flushMetrics", "genMetric", "metricType", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricValue", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "metaData", "genSDKError", "reason", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "message", "entry", "initOrUpdate", "errorLogLevel", "initOrUpdate$vungle_ads_release", "logError", "logError$vungle_ads_release", "logErrorInSameThread", "logMetric", "oneShotSingleValueMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "logMetric$vungle_ads_release", "oneShotTimeIntervalMetric", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "singleValueMetric", "Lcom/vungle/ads/SingleValueMetric;", "timeIntervalMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "logMetricInSameThread", "report", "LogLevel", "RequestListener", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsClient {
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000;
    private static final java.lang.String TAG = "AnalyticsClient";
    private static com.vungle.ads.internal.executor.VungleThreadPoolExecutor executor;
    private static boolean metricsEnabled;
    private static com.vungle.ads.internal.network.VungleApiClient vungleApiClient;
    public static final com.vungle.ads.AnalyticsClient INSTANCE = new com.vungle.ads.AnalyticsClient();
    private static final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> errors = new java.util.concurrent.LinkedBlockingQueue();
    private static final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> metrics = new java.util.concurrent.LinkedBlockingQueue();
    private static final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> pendingErrors = new java.util.concurrent.LinkedBlockingQueue();
    private static final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> pendingMetrics = new java.util.concurrent.LinkedBlockingQueue();
    private static com.vungle.ads.AnalyticsClient.LogLevel logLevel = com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;
    private static final java.util.concurrent.atomic.AtomicBoolean isInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* compiled from: AnalyticsClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$RequestListener;", "", "onFailure", "", "onSuccess", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface RequestListener {
        void onFailure();

        void onSuccess();
    }

    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    private AnalyticsClient() {
    }

    /* compiled from: AnalyticsClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$LogLevel;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "", "(Ljava/lang/String;II)V", "getLevel", "()I", "ERROR_LOG_LEVEL_OFF", "ERROR_LOG_LEVEL_ERROR", "ERROR_LOG_LEVEL_DEBUG", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LogLevel {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.AnalyticsClient.LogLevel.Companion INSTANCE = new com.vungle.ads.AnalyticsClient.LogLevel.Companion(null);
        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }

        /* compiled from: AnalyticsClient.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$LogLevel$Companion;", "", "()V", "fromValue", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "logLevel", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final com.vungle.ads.AnalyticsClient.LogLevel fromValue(int logLevel) {
                if (logLevel == com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
                    return com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_DEBUG;
                }
                if (logLevel == com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel()) {
                    return com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR;
                }
                if (logLevel == com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_OFF.getLevel()) {
                    return com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_OFF;
                }
                return com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR;
            }
        }
    }

    public final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> getErrors$vungle_ads_release() {
        return errors;
    }

    public final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    public final java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final com.vungle.ads.internal.network.VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final void setVungleApiClient$vungle_ads_release(com.vungle.ads.internal.network.VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }

    public final com.vungle.ads.internal.executor.VungleThreadPoolExecutor getExecutor$vungle_ads_release() {
        return executor;
    }

    public final void setExecutor$vungle_ads_release(com.vungle.ads.internal.executor.VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        executor = vungleThreadPoolExecutor;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z) {
        metricsEnabled = z;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z) {
        refreshEnabled = z;
    }

    public final java.util.concurrent.atomic.AtomicBoolean isInitialized$vungle_ads_release() {
        return isInitialized;
    }

    public final synchronized void initOrUpdate$vungle_ads_release(com.vungle.ads.internal.network.VungleApiClient vungleApiClient2, final com.vungle.ads.internal.executor.VungleThreadPoolExecutor executor2, int errorLogLevel, boolean metricsEnabled2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleApiClient2, "vungleApiClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "executor");
        logLevel = com.vungle.ads.AnalyticsClient.LogLevel.INSTANCE.fromValue(errorLogLevel);
        metricsEnabled = metricsEnabled2;
        if (errorLogLevel == com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.enable$vungle_ads_release(true);
        } else if (errorLogLevel == com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.enable$vungle_ads_release(false);
        } else if (errorLogLevel == com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_OFF.getLevel()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.enable$vungle_ads_release(false);
        }
        if (isInitialized.getAndSet(true)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "AnalyticsClient already initialized");
            return;
        }
        executor = executor2;
        vungleApiClient = vungleApiClient2;
        try {
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> blockingQueue = pendingErrors;
            if (!blockingQueue.isEmpty()) {
                blockingQueue.drainTo(errors);
            }
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to add pendingErrors to errors queue.", e);
        }
        try {
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> blockingQueue2 = pendingMetrics;
            if (!blockingQueue2.isEmpty()) {
                blockingQueue2.drainTo(metrics);
            }
        } catch (java.lang.Exception e2) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to add pendingMetrics to metrics queue.", e2);
        }
        if (refreshEnabled) {
            java.util.concurrent.Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new java.lang.Runnable() { // from class: com.vungle.ads.AnalyticsClient$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.AnalyticsClient.m10383initOrUpdate$lambda1(com.vungle.ads.internal.executor.VungleThreadPoolExecutor.this);
                }
            }, 5000L, 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initOrUpdate$lambda-1, reason: not valid java name */
    public static final void m10383initOrUpdate$lambda1(com.vungle.ads.internal.executor.VungleThreadPoolExecutor executor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "$executor");
        executor2.execute(new java.lang.Runnable() { // from class: com.vungle.ads.AnalyticsClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.AnalyticsClient.m10384initOrUpdate$lambda1$lambda0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initOrUpdate$lambda-1$lambda-0, reason: not valid java name */
    public static final void m10384initOrUpdate$lambda1$lambda0() {
        INSTANCE.report();
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason, java.lang.String str, com.vungle.ads.internal.util.LogEntry logEntry, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logError$vungle_ads_release(reason, str, logEntry);
    }

    public final synchronized void logError$vungle_ads_release(final com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason, final java.lang.String message, final com.vungle.ads.internal.util.LogEntry entry) {
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor vungleThreadPoolExecutor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        try {
            vungleThreadPoolExecutor = executor;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Cannot logError " + reason + ", " + message + ", " + entry, e);
        }
        if (vungleThreadPoolExecutor == null) {
            pendingErrors.put(genSDKError(reason, message, entry));
        } else {
            if (vungleThreadPoolExecutor != null) {
                vungleThreadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.AnalyticsClient$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.vungle.ads.AnalyticsClient.m10385logError$lambda2(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.this, message, entry);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m10385logError$lambda2(com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason, java.lang.String message, com.vungle.ads.internal.util.LogEntry logEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "$reason");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        INSTANCE.logErrorInSameThread(reason, message, logEntry);
    }

    static /* synthetic */ com.vungle.ads.internal.protos.Sdk.SDKError.Builder genSDKError$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason, java.lang.String str, com.vungle.ads.internal.util.LogEntry logEntry, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            logEntry = null;
        }
        return analyticsClient.genSDKError(reason, str, logEntry);
    }

    private final com.vungle.ads.internal.protos.Sdk.SDKError.Builder genSDKError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason, java.lang.String message, com.vungle.ads.internal.util.LogEntry entry) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String headerUa;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Long adLoadType;
        java.lang.Boolean adPoddingEnabled;
        java.lang.Boolean adoEnabled;
        java.lang.Boolean partialDownloadEnabled;
        java.lang.String adapterAdFormat;
        com.vungle.ads.internal.AdInternal.AdState adState;
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder at = com.vungle.ads.internal.protos.Sdk.SDKError.newBuilder().setOs(kotlin.jvm.internal.Intrinsics.areEqual("Amazon", android.os.Build.MANUFACTURER) ? "amazon" : "android").setOsVersion(java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)).setMake(android.os.Build.MANUFACTURER).setModel(android.os.Build.MODEL).setReason(reason).setMessage(message).setAt(java.lang.System.currentTimeMillis());
        java.lang.String str8 = "";
        if (entry == null || (str = entry.getPlacementRefId()) == null) {
            str = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(str);
        if (entry == null || (str2 = entry.getCreativeId()) == null) {
            str2 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(str2);
        if (entry == null || (str3 = entry.getEventId()) == null) {
            str3 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder eventId = creativeId.setEventId(str3);
        if (entry == null || (str4 = entry.getAdSource()) == null) {
            str4 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder adSource = eventId.setAdSource(str4);
        if (entry == null || (str5 = entry.getVmVersion()) == null) {
            str5 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder vmVersion = adSource.setVmVersion(str5);
        if (entry == null || (headerUa = entry.getMediationName()) == null) {
            headerUa = com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa();
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder appState = vmVersion.setMediationName(headerUa).setAppState(com.vungle.ads.internal.util.ActivityManager.INSTANCE.isForeground() ? 0L : 2L);
        if (entry == null || (adState = entry.getAdState()) == null || (str6 = adState.toString()) == null) {
            str6 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder adState2 = appState.setAdState(str6);
        if (entry == null || (str7 = entry.getExperiments()) == null) {
            str7 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder experiments = adState2.setExperiments(str7);
        if (entry != null && (adapterAdFormat = entry.getAdapterAdFormat()) != null) {
            str8 = adapterAdFormat;
        }
        com.vungle.ads.internal.protos.Sdk.SDKError.Builder adapterAdFormat2 = experiments.setAdapterAdFormat(str8);
        if (entry != null && (partialDownloadEnabled = entry.getPartialDownloadEnabled()) != null) {
            adapterAdFormat2.setIsPartialDownloadEnabled(partialDownloadEnabled.booleanValue());
        }
        if (entry != null && (adoEnabled = entry.getAdoEnabled()) != null) {
            adapterAdFormat2.setIsAdoEnabled(adoEnabled.booleanValue());
        }
        if (entry != null && (adPoddingEnabled = entry.getAdPoddingEnabled()) != null) {
            adapterAdFormat2.setIsAdPodding(adPoddingEnabled.booleanValue());
        }
        if (entry != null && (adLoadType = entry.getAdLoadType()) != null) {
            adapterAdFormat2.setAdLoadType(adLoadType.longValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterAdFormat2, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat2;
    }

    static /* synthetic */ void logErrorInSameThread$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason, java.lang.String str, com.vungle.ads.internal.util.LogEntry logEntry, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logErrorInSameThread(reason, str, logEntry);
    }

    private final synchronized void logErrorInSameThread(final com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason, final java.lang.String message, com.vungle.ads.internal.util.LogEntry entry) {
        if (logLevel == com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            final com.vungle.ads.internal.protos.Sdk.SDKError.Builder genSDKError = genSDKError(reason, message, entry);
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> blockingQueue = errors;
            blockingQueue.put(genSDKError);
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.AnalyticsClient$logErrorInSameThread$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    return "Logging error: " + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.this + " with message: " + message + ", mediation: " + genSDKError.getMediationName();
                }
            });
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Cannot logError", e);
        }
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType sDKMetricType, long j, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        analyticsClient.logMetric$vungle_ads_release(sDKMetricType, j, (i & 4) != 0 ? null : logEntry, (i & 8) != 0 ? null : str);
    }

    public final synchronized void logMetric$vungle_ads_release(final com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType metricType, final long metricValue, final com.vungle.ads.internal.util.LogEntry logEntry, final java.lang.String metaData) {
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor vungleThreadPoolExecutor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricType, "metricType");
        try {
            vungleThreadPoolExecutor = executor;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Cannot logMetric " + metricType + ", " + metricValue + ", " + logEntry + ", " + metaData, e);
        }
        if (vungleThreadPoolExecutor == null) {
            pendingMetrics.put(genMetric(metricType, metricValue, logEntry, metaData));
        } else {
            if (vungleThreadPoolExecutor != null) {
                vungleThreadPoolExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.AnalyticsClient$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.vungle.ads.AnalyticsClient.m10386logMetric$lambda8(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.this, metricValue, logEntry, metaData);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logMetric$lambda-8, reason: not valid java name */
    public static final void m10386logMetric$lambda8(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType metricType, long j, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricType, "$metricType");
        INSTANCE.logMetricInSameThread(metricType, j, logEntry, str);
    }

    static /* synthetic */ com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder genMetric$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType sDKMetricType, long j, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return analyticsClient.genMetric(sDKMetricType, j, (i & 4) != 0 ? null : logEntry, (i & 8) != 0 ? null : str);
    }

    private final com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder genMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType metricType, long metricValue, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String metaData) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String headerUa;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Long adLoadType;
        java.lang.Boolean adPoddingEnabled;
        java.lang.Boolean adoEnabled;
        java.lang.Boolean partialDownloadEnabled;
        java.lang.String adapterAdFormat;
        com.vungle.ads.internal.AdInternal.AdState adState;
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder osVersion = com.vungle.ads.internal.protos.Sdk.SDKMetric.newBuilder().setType(metricType).setValue(metricValue).setMake(android.os.Build.MANUFACTURER).setModel(android.os.Build.MODEL).setOs(kotlin.jvm.internal.Intrinsics.areEqual("Amazon", android.os.Build.MANUFACTURER) ? "amazon" : "android").setOsVersion(java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        java.lang.String str8 = "";
        if (logEntry == null || (str = logEntry.getPlacementRefId()) == null) {
            str = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(str);
        if (logEntry == null || (str2 = logEntry.getCreativeId()) == null) {
            str2 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder creativeId = placementReferenceId.setCreativeId(str2);
        if (logEntry == null || (str3 = logEntry.getEventId()) == null) {
            str3 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder eventId = creativeId.setEventId(str3);
        if (metaData == null) {
            metaData = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder meta = eventId.setMeta(metaData);
        if (logEntry == null || (headerUa = logEntry.getMediationName()) == null) {
            headerUa = com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa();
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder mediationName = meta.setMediationName(headerUa);
        if (logEntry == null || (str4 = logEntry.getAdSource()) == null) {
            str4 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder adSource = mediationName.setAdSource(str4);
        if (logEntry == null || (str5 = logEntry.getVmVersion()) == null) {
            str5 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder appState = adSource.setVmVersion(str5).setAppState(com.vungle.ads.internal.util.ActivityManager.INSTANCE.isForeground() ? 0L : 2L);
        if (logEntry == null || (adState = logEntry.getAdState()) == null || (str6 = adState.toString()) == null) {
            str6 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder adState2 = appState.setAdState(str6);
        if (logEntry == null || (str7 = logEntry.getExperiments()) == null) {
            str7 = "";
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder experiments = adState2.setExperiments(str7);
        if (logEntry != null && (adapterAdFormat = logEntry.getAdapterAdFormat()) != null) {
            str8 = adapterAdFormat;
        }
        com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder adapterAdFormat2 = experiments.setAdapterAdFormat(str8);
        if (logEntry != null && (partialDownloadEnabled = logEntry.getPartialDownloadEnabled()) != null) {
            adapterAdFormat2.setIsPartialDownloadEnabled(partialDownloadEnabled.booleanValue());
        }
        if (logEntry != null && (adoEnabled = logEntry.getAdoEnabled()) != null) {
            adapterAdFormat2.setIsAdoEnabled(adoEnabled.booleanValue());
        }
        if (logEntry != null && (adPoddingEnabled = logEntry.getAdPoddingEnabled()) != null) {
            adapterAdFormat2.setIsAdPodding(adPoddingEnabled.booleanValue());
        }
        if (logEntry != null && (adLoadType = logEntry.getAdLoadType()) != null) {
            adapterAdFormat2.setAdLoadType(adLoadType.longValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterAdFormat2, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat2;
    }

    static /* synthetic */ void logMetricInSameThread$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType sDKMetricType, long j, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        analyticsClient.logMetricInSameThread(sDKMetricType, j, (i & 4) != 0 ? null : logEntry, (i & 8) != 0 ? null : str);
    }

    private final synchronized void logMetricInSameThread(final com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType metricType, final long metricValue, final com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String metaData) {
        if (metricsEnabled) {
            try {
                final com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder genMetric = genMetric(metricType, metricValue, logEntry, metaData);
                java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> blockingQueue = metrics;
                blockingQueue.put(genMetric);
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.AnalyticsClient$logMetricInSameThread$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.String invoke() {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Logging Metric ");
                        sb.append(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.this);
                        sb.append(" with value ");
                        sb.append(metricValue);
                        sb.append(" for placement ");
                        com.vungle.ads.internal.util.LogEntry logEntry2 = logEntry;
                        sb.append(logEntry2 != null ? logEntry2.getPlacementRefId() : null);
                        sb.append(" mediation:");
                        sb.append(genMetric.getMediationName());
                        return sb.toString();
                    }
                });
                if (blockingQueue.size() >= 20) {
                    report();
                }
            } catch (java.lang.Exception e) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Cannot logMetrics", e);
            }
        }
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.SingleValueMetric singleValueMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            logEntry = null;
        }
        if ((i & 4) != 0) {
            str = singleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(com.vungle.ads.SingleValueMetric singleValueMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String metaData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleValueMetric, "singleValueMetric");
        logMetric$vungle_ads_release(singleValueMetric.getMetricType(), singleValueMetric.getValue(), logEntry, metaData);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.OneShotSingleValueMetric oneShotSingleValueMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            logEntry = null;
        }
        if ((i & 4) != 0) {
            str = oneShotSingleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotSingleValueMetric, logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(com.vungle.ads.OneShotSingleValueMetric oneShotSingleValueMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String metaData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneShotSingleValueMetric, "oneShotSingleValueMetric");
        if (!oneShotSingleValueMetric.getAlreadyLogged()) {
            logMetric$vungle_ads_release((com.vungle.ads.SingleValueMetric) oneShotSingleValueMetric, logEntry, metaData);
            oneShotSingleValueMetric.markLogged();
        }
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.TimeIntervalMetric timeIntervalMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            logEntry = null;
        }
        if ((i & 4) != 0) {
            str = timeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(timeIntervalMetric, logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(com.vungle.ads.TimeIntervalMetric timeIntervalMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String metaData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeIntervalMetric, "timeIntervalMetric");
        logMetric$vungle_ads_release(timeIntervalMetric.getMetricType(), timeIntervalMetric.getValue(), logEntry, metaData);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient analyticsClient, com.vungle.ads.OneShotTimeIntervalMetric oneShotTimeIntervalMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            logEntry = null;
        }
        if ((i & 4) != 0) {
            str = oneShotTimeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotTimeIntervalMetric, logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(com.vungle.ads.OneShotTimeIntervalMetric oneShotTimeIntervalMetric, com.vungle.ads.internal.util.LogEntry logEntry, java.lang.String metaData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.getAlreadyLogged()) {
            logMetric$vungle_ads_release((com.vungle.ads.TimeIntervalMetric) oneShotTimeIntervalMetric, logEntry, metaData);
            oneShotTimeIntervalMetric.markLogged();
        }
    }

    private final synchronized void report() {
        if (logLevel != com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
            flushErrors();
        }
        if (metricsEnabled && metrics.size() > 0) {
            flushMetrics();
        }
    }

    private final void flushMetrics() {
        com.vungle.ads.internal.network.VungleApiClient vungleApiClient2;
        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Sending ");
        java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKMetric.Builder> blockingQueue = metrics;
        sb.append(blockingQueue.size());
        sb.append(" metrics");
        companion.d(TAG, sb.toString());
        final java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportMetrics(linkedBlockingQueue, new com.vungle.ads.AnalyticsClient.RequestListener() { // from class: com.vungle.ads.AnalyticsClient$flushMetrics$1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("AnalyticsClient", "Sent " + linkedBlockingQueue.size() + " metrics");
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("AnalyticsClient", "Failed to send " + linkedBlockingQueue.size() + " metrics");
                com.vungle.ads.AnalyticsClient.INSTANCE.getMetrics$vungle_ads_release().addAll(linkedBlockingQueue);
            }
        });
    }

    private final void flushErrors() {
        com.vungle.ads.internal.network.VungleApiClient vungleApiClient2;
        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Sending ");
        java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk.SDKError.Builder> blockingQueue = errors;
        sb.append(blockingQueue.size());
        sb.append(" errors");
        companion.d(TAG, sb.toString());
        final java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportErrors(linkedBlockingQueue, new com.vungle.ads.AnalyticsClient.RequestListener() { // from class: com.vungle.ads.AnalyticsClient$flushErrors$1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("AnalyticsClient", "Sent " + linkedBlockingQueue.size() + " errors");
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("AnalyticsClient", "Failed to send " + linkedBlockingQueue.size() + " errors");
                com.vungle.ads.AnalyticsClient.INSTANCE.getErrors$vungle_ads_release().addAll(linkedBlockingQueue);
            }
        });
    }
}
