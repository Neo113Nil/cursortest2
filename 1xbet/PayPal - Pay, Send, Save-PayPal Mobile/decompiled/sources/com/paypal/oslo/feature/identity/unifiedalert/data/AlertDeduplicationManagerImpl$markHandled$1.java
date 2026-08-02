package com.paypal.oslo.feature.identity.unifiedalert.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl", f = "AlertDeduplicationManagerImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "markHandled", n = {"documentId", "userId", "$this$withLock_u24default$iv", "expiresAtEpoch", "$i$f$withLock", "documentId", "userId", "$this$withLock_u24default$iv", "expiresAtEpoch", "$i$f$withLock", "$i$a$-withLock$default-AlertDeduplicationManagerImpl$markHandled$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, 211}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class AlertDeduplicationManagerImpl$markHandled$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.markHandled(null, null, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertDeduplicationManagerImpl$markHandled$1(com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl alertDeduplicationManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$markHandled$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = alertDeduplicationManagerImpl;
    }
}
