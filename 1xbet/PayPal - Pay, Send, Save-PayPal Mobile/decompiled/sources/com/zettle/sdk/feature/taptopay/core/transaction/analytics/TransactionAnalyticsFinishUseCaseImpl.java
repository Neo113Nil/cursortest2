package com.zettle.sdk.feature.taptopay.core.transaction.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalyticsFinishUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalyticsFinishUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "p0", "Lcom/zettle/sdk/analytics/Analytics;", "p1", "Lcom/zettle/sdk/meta/AppInfo;", "p2", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "", "", "invoke", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/meta/AppInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionAnalyticsFinishUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalyticsFinishUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo Camera2StreamConfigurationMap;

    public TransactionAnalyticsFinishUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighSpeedVideoFpsRanges = softspaceProxy;
        this.getHighSpeedVideoFpsRangesFor = analytics;
        this.Camera2StreamConfigurationMap = appInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        invoke2(str);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalyticsFinishUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.String p0) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.getHighSpeedVideoFpsRanges.getSoftspaceReaderInfo();
        jSONObject.putOpt("softspaceSdkVersion", softspaceReaderInfo != null ? softspaceReaderInfo.getSdkVersion() : null);
        jSONObject.putOpt("cotsId", softspaceReaderInfo != null ? softspaceReaderInfo.getCotsId() : null);
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.Camera2StreamConfigurationMap.getSdkVersion());
        jSONObject.putOpt(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, p0);
        this.getHighSpeedVideoFpsRangesFor.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, "Finish", jSONObject));
    }
}
