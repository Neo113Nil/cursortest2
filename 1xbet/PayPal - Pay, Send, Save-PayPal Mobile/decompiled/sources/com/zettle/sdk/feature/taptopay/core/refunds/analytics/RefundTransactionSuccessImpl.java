package com.zettle.sdk.feature.taptopay.core.refunds.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionSuccessImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionSuccess;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "", "transactionId", "", "amount", "", "invoke", "(Ljava/lang/String;J)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/AppInfo;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundTransactionSuccessImpl implements com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionSuccess {
    private final com.zettle.sdk.analytics.Analytics getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo Camera2StreamConfigurationMap;

    public RefundTransactionSuccessImpl(com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighResolutionOutputSizeshNQ4ISI = analytics;
        this.Camera2StreamConfigurationMap = appInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.Long l) {
        invoke(str, l.longValue());
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionSuccess
    public final void invoke(java.lang.String transactionId, long amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("refundAmount", kotlin.jvm.internal.LongCompanionObject.INSTANCE);
        jSONObject.putOpt("transactionId", transactionId);
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.Camera2StreamConfigurationMap.getSdkVersion());
        this.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "Refunds", "RefundTransactionSuccess", jSONObject));
    }
}
