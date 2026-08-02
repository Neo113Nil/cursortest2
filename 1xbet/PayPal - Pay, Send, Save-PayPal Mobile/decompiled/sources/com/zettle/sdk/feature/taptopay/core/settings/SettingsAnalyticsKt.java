package com.zettle.sdk.feature.taptopay.core.settings;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics$Companion;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics$Companion;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;)Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SettingsAnalyticsKt {
    public static final com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics create(com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics.Companion companion, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        return new com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalyticsImpl(analytics, softspaceProxy);
    }
}
