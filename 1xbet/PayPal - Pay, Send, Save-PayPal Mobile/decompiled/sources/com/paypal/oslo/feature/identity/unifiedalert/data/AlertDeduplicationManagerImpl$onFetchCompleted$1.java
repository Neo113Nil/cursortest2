package com.paypal.oslo.feature.identity.unifiedalert.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl", f = "AlertDeduplicationManagerImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, 106}, m = "onFetchCompleted", n = {"alert", "$this$withLock_u24default$iv", "$i$f$withLock", "alert", "$this$withLock_u24default$iv", "finalSource", "checking", "previousDocId", "$this$onFetchCompleted_u24lambda_u240_u240", "$i$f$withLock", "$i$a$-withLock$default-AlertDeduplicationManagerImpl$onFetchCompleted$2", "$i$a$-runCatching-AlertDeduplicationManagerImpl$onFetchCompleted$2$isHandled$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, 110}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes5.dex */
final class AlertDeduplicationManagerImpl$onFetchCompleted$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.onFetchCompleted(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDeduplicationManagerImpl$onFetchCompleted$1(com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl alertDeduplicationManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchCompleted$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = alertDeduplicationManagerImpl;
    }
}
