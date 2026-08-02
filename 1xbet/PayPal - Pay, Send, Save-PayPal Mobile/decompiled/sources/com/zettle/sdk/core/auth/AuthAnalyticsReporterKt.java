package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter$Companion;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;", "create", "(Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter$Companion;Lcom/zettle/sdk/analytics/Analytics;)Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthAnalyticsReporterKt {
    public static final com.zettle.sdk.core.auth.AuthAnalyticsReporter create(com.zettle.sdk.core.auth.AuthAnalyticsReporter.Companion companion, com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        return new com.zettle.sdk.core.auth.AuthAnalyticsReporterImpl(analytics);
    }
}
