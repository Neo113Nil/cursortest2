package com.ingo.sdk.kotlin.common.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lcom/ingo/sdk/kotlin/common/analytics/IngoAnalyticsManager;", "", "<init>", "()V", "Lcom/ingo/sdk/kotlin/common/analytics/IngoAnalytics;", "analytics", "Lcom/ingo/sdk/kotlin/common/analytics/IngoAnalytics;", "getAnalytics", "()Lcom/ingo/sdk/kotlin/common/analytics/IngoAnalytics;", "setAnalytics", "(Lcom/ingo/sdk/kotlin/common/analytics/IngoAnalytics;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoAnalyticsManager {
    public static final com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsManager INSTANCE = new com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsManager();
    private static com.ingo.sdk.kotlin.common.analytics.IngoAnalytics analytics = new com.ingo.sdk.kotlin.common.analytics.IngoDefaultAnalytics();

    private IngoAnalyticsManager() {
    }

    public final com.ingo.sdk.kotlin.common.analytics.IngoAnalytics getAnalytics() {
        return analytics;
    }

    public final void setAnalytics(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics ingoAnalytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoAnalytics, "");
        analytics = ingoAnalytics;
    }
}
