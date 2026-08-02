package com.zettle.sdk.feature.taptopay.core.attestation.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsFullStartedUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsFullStartedUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "proxy", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "Landroid/content/Context;", "context", "", "fullProvisioning", "fullAttestation", "", "invoke", "(Landroid/content/Context;ZZ)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationAnalyticsFullStartedUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsFullStartedUseCase {
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRanges;
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoSizes;

    public AttestationAnalyticsFullStartedUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighResolutionOutputSizeshNQ4ISI = softspaceProxy;
        this.getHighSpeedVideoSizes = analytics;
        this.getHighSpeedVideoFpsRanges = appInfo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(android.content.Context context, java.lang.Boolean bool, java.lang.Boolean bool2) {
        invoke(context, bool.booleanValue(), bool2.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsFullStartedUseCase
    public final void invoke(android.content.Context context, boolean fullProvisioning, boolean fullAttestation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.getHighResolutionOutputSizeshNQ4ISI.getSoftspaceReaderInfo();
        jSONObject.putOpt("softspaceSdkVersion", softspaceReaderInfo != null ? softspaceReaderInfo.getSdkVersion() : null);
        jSONObject.putOpt("cotsId", softspaceReaderInfo != null ? softspaceReaderInfo.getCotsId() : null);
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.getHighSpeedVideoFpsRanges.getSdkVersion());
        jSONObject.putOpt("fullProvisioning", java.lang.Boolean.valueOf(fullProvisioning));
        jSONObject.putOpt("fullAttestation", java.lang.Boolean.valueOf(fullAttestation));
        this.getHighSpeedVideoSizes.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, "AttestationFullStarted", jSONObject));
    }
}
