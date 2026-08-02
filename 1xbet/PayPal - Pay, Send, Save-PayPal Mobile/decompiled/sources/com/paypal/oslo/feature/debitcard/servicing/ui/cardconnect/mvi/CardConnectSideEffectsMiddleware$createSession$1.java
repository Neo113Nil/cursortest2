package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware", f = "CardConnectSideEffectsMiddleware.kt", i = {0}, l = {59}, m = "createSession", n = {"eventDispatcher"}, nl = {58}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CardConnectSideEffectsMiddleware$createSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardConnectSideEffectsMiddleware$createSession$1(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware cardConnectSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware$createSession$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = cardConnectSideEffectsMiddleware;
    }
}
