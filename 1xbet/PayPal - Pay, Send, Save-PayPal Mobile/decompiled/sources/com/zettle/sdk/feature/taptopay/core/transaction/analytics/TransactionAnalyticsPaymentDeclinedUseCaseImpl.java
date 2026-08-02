package com.zettle.sdk.feature.taptopay.core.transaction.analytics;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalyticsPaymentDeclinedUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalyticsPaymentDeclinedUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "p0", "Lcom/zettle/sdk/analytics/Analytics;", "p1", "Lcom/zettle/sdk/meta/AppInfo;", "p2", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionAnalyticsPaymentDeclinedUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalyticsPaymentDeclinedUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighSpeedVideoFpsRangesFor;

    public TransactionAnalyticsPaymentDeclinedUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighSpeedVideoFpsRangesFor = softspaceProxy;
        this.getHighSpeedVideoSizes = analytics;
        this.getHighSpeedVideoFpsRanges = appInfo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
        invoke2(transactionInfo, onlineHostRequestMessage, failureReason);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalyticsPaymentDeclinedUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo p0, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage p1, com.zettle.sdk.feature.taptopay.core.FailureReason p2) {
        com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType cvmType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.getHighSpeedVideoFpsRangesFor.getSoftspaceReaderInfo();
        jSONObject.putOpt("paymentSessionId", p0.getGetHighSpeedVideoSizes());
        java.lang.String str = null;
        jSONObject.putOpt("softspaceSdkVersion", softspaceReaderInfo != null ? softspaceReaderInfo.getSdkVersion() : null);
        jSONObject.putOpt("cotsId", softspaceReaderInfo != null ? softspaceReaderInfo.getCotsId() : null);
        jSONObject.putOpt("reason", java.lang.String.valueOf(p2));
        jSONObject.putOpt("amount", java.lang.Long.valueOf(p0.getGetHighSpeedVideoFpsRangesFor()));
        if (p1 != null && (cvmType = p1.getCvmType()) != null) {
            str = cvmType.name();
        }
        jSONObject.putOpt("cvm", str);
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.getHighSpeedVideoFpsRanges.getSdkVersion());
        if (p2 instanceof com.zettle.sdk.feature.taptopay.core.ReasonWithTransactionId) {
            jSONObject.putOpt("paymentUuid", ((com.zettle.sdk.feature.taptopay.core.ReasonWithTransactionId) p2).getTransactionId());
        }
        jSONObject.putOpt(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, p0.getGetOutputFormats().getGetHighResolutionOutputSizeshNQ4ISI());
        this.getHighSpeedVideoSizes.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "TapOnPhone", "PaymentDeclined", jSONObject));
    }
}
