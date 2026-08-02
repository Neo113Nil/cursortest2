package com.zettle.sdk.feature.taptopay.core.refunds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalyticInitRefundImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalyticInitRefund;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "", "invoke", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/meta/AppInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundAnalyticInitRefundImpl implements com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticInitRefund {
    private final com.zettle.sdk.meta.AppInfo Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRangesFor;

    public RefundAnalyticInitRefundImpl(com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighSpeedVideoFpsRangesFor = analytics;
        this.Camera2StreamConfigurationMap = appInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticInitRefund
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.Camera2StreamConfigurationMap.getSdkVersion());
        this.getHighSpeedVideoFpsRangesFor.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "Refunds", "InitializeRefund", jSONObject));
    }
}
