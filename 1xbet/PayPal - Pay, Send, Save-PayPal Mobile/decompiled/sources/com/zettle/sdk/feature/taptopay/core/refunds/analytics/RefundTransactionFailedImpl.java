package com.zettle.sdk.feature.taptopay.core.refunds.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionFailedImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionFailed;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "", "reason", "", "invoke", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundTransactionFailedImpl implements com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionFailed {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRanges;

    public RefundTransactionFailedImpl(com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighSpeedVideoFpsRangesFor = analytics;
        this.getHighSpeedVideoFpsRanges = appInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        invoke2(str);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionFailed
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("failureReason", reason);
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.getHighSpeedVideoFpsRanges.getSdkVersion());
        this.getHighSpeedVideoFpsRangesFor.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "Refunds", "RefundTransactionFailed", jSONObject));
    }
}
