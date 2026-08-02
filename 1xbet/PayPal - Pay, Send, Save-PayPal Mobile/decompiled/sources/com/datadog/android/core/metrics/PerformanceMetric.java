package com.datadog.android.core.metrics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/metrics/PerformanceMetric;", "", "", "isSuccessful", "", "stopAndSend", "(Z)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PerformanceMetric {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.metrics.PerformanceMetric.Companion INSTANCE = com.datadog.android.core.metrics.PerformanceMetric.Companion.getHighSpeedVideoFpsRangesFor;
    public static final java.lang.String METRIC_TYPE = "metric_type";

    void stopAndSend(boolean isSuccessful);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/metrics/PerformanceMetric$Companion;", "", "<init>", "()V", "", "METRIC_TYPE", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String METRIC_TYPE = "metric_type";
        static final /* synthetic */ com.datadog.android.core.metrics.PerformanceMetric.Companion getHighSpeedVideoFpsRangesFor = new com.datadog.android.core.metrics.PerformanceMetric.Companion();

        private Companion() {
        }
    }
}
