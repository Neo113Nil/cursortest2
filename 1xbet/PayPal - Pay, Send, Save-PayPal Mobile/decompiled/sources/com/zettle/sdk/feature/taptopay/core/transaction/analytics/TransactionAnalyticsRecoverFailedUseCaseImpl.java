package com.zettle.sdk.feature.taptopay.core.transaction.analytics;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalyticsRecoverFailedUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalyticsRecoverFailedUseCase;", "Lcom/zettle/sdk/analytics/Analytics;", "p0", "Lcom/zettle/sdk/meta/AppInfo;", "p1", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/analytics/Analytics;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionAnalyticsRecoverFailedUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalyticsRecoverFailedUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRanges;
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRangesFor;

    public TransactionAnalyticsRecoverFailedUseCaseImpl(com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighSpeedVideoFpsRangesFor = analytics;
        this.getHighSpeedVideoFpsRanges = appInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
        invoke2(transactionInfo, failureReason);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalyticsRecoverFailedUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo p0, com.zettle.sdk.feature.taptopay.core.FailureReason p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("paymentSessionId", p0.getGetHighSpeedVideoSizes());
        jSONObject.putOpt("amount", java.lang.Long.valueOf(p0.getGetHighSpeedVideoFpsRangesFor()));
        jSONObject.putOpt("reason", p1.toString());
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.getHighSpeedVideoFpsRanges.getSdkVersion());
        jSONObject.putOpt(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, p0.getGetOutputFormats().getGetHighResolutionOutputSizeshNQ4ISI());
        this.getHighSpeedVideoFpsRangesFor.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "TapOnPhone", "RecoverFailed", jSONObject));
    }
}
