package com.zettle.sdk.feature.taptopay.core.tipping;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics$Companion;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics$Companion;Lcom/zettle/sdk/analytics/Analytics;)Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TippingAnalyticsKt {
    public static final com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics create(com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics.Companion companion, com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        return new com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalyticsImpl(analytics);
    }
}
