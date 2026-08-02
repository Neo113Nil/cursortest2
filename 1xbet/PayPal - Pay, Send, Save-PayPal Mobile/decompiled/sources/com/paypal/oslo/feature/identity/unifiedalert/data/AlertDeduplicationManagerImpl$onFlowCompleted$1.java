package com.paypal.oslo.feature.identity.unifiedalert.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl", f = "AlertDeduplicationManagerImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "onFlowCompleted", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class AlertDeduplicationManagerImpl$onFlowCompleted$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.onFlowCompleted(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDeduplicationManagerImpl$onFlowCompleted$1(com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl alertDeduplicationManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFlowCompleted$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = alertDeduplicationManagerImpl;
    }
}
