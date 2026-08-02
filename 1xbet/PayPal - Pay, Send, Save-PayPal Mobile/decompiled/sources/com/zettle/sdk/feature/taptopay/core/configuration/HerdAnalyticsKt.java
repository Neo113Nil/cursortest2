package com.zettle.sdk.feature.taptopay.core.configuration;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics$Companion;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "createForAttestation", "(Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics$Companion;Lcom/zettle/sdk/analytics/Analytics;)Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "createForCvmLimit", "createForInitConfiguration"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HerdAnalyticsKt {
    public static final com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics createForCvmLimit(com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.Companion companion, com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        return new com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalyticsImpl(analytics, com.zettle.sdk.analytics.Herd.Type.TapToPayCVMLimits.INSTANCE);
    }

    public static final com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics createForInitConfiguration(com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.Companion companion, com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        return new com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalyticsImpl(analytics, com.zettle.sdk.analytics.Herd.Type.TapToPayConfiguration.INSTANCE);
    }

    public static final com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics createForAttestation(com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.Companion companion, com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        return new com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalyticsImpl(analytics, com.zettle.sdk.analytics.Herd.Type.TapToPayAttestation.INSTANCE);
    }
}
