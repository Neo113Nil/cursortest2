package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase$Companion;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase$Companion;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationInitFailedAnalyticsUseCaseKt {
    public static final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase create(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase.Companion companion, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        return new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCaseImpl(analytics, appInfo);
    }
}
