package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase;", "Lcom/zettle/sdk/analytics/Analytics;", "p0", "Lcom/zettle/sdk/meta/AppInfo;", "p1", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "", "", "invoke", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/analytics/Analytics;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/meta/AppInfo;", "Camera2StreamConfigurationMap", "Companion_"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ConfigurationInitFailedAnalyticsUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo Camera2StreamConfigurationMap;
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRanges;

    public ConfigurationInitFailedAnalyticsUseCaseImpl(com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighSpeedVideoFpsRanges = analytics;
        this.Camera2StreamConfigurationMap = appInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        invoke2(str);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.Camera2StreamConfigurationMap.getSdkVersion());
        jSONObject.put("reason", p0);
        this.getHighSpeedVideoFpsRanges.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, "InitConfigurationFailed", jSONObject));
    }
}
