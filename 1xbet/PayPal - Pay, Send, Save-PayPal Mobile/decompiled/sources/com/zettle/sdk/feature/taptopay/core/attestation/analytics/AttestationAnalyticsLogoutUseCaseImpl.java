package com.zettle.sdk.feature.taptopay.core.attestation.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLogoutUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLogoutUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "proxy", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "Landroid/content/Context;", "context", "", "invoke", "(Landroid/content/Context;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/analytics/Analytics;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationAnalyticsLogoutUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLogoutUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoSizes;
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics Camera2StreamConfigurationMap;

    public AttestationAnalyticsLogoutUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighResolutionOutputSizeshNQ4ISI = softspaceProxy;
        this.Camera2StreamConfigurationMap = analytics;
        this.getHighSpeedVideoSizes = appInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.content.Context context) {
        invoke2(context);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLogoutUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.getHighResolutionOutputSizeshNQ4ISI.getSoftspaceReaderInfo();
        jSONObject.putOpt("softspaceSdkVersion", softspaceReaderInfo != null ? softspaceReaderInfo.getSdkVersion() : null);
        jSONObject.putOpt("cotsId", softspaceReaderInfo != null ? softspaceReaderInfo.getCotsId() : null);
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.getHighSpeedVideoSizes.getSdkVersion());
        this.Camera2StreamConfigurationMap.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, "AttestationLogout", jSONObject));
    }
}
