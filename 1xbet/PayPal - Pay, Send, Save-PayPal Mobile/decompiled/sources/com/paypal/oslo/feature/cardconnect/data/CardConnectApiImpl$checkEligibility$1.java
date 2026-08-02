package com.paypal.oslo.feature.cardconnect.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl", f = "CardConnectApiImpl.kt", i = {0, 0, 0}, l = {75}, m = "checkEligibility", n = {"cardProduct", "instrumentId", "request"}, nl = {76}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes11.dex */
final class CardConnectApiImpl$checkEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.checkEligibility(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardConnectApiImpl$checkEligibility$1(com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl cardConnectApiImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$checkEligibility$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = cardConnectApiImpl;
    }
}
