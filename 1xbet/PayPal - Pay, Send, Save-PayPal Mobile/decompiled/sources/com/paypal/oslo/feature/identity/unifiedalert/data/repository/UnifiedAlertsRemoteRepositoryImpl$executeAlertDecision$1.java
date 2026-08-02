package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl", f = "UnifiedAlertsRemoteRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "executeAlertDecision", n = {"documentId", "action", "source", "acceptableClaims", "mutation", "authType"}, nl = {127}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class UnifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor(null, null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1(com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl unifiedAlertsRemoteRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1> continuation) {
        super(continuation);
        this.getOutputFormats = unifiedAlertsRemoteRepositoryImpl;
    }
}
