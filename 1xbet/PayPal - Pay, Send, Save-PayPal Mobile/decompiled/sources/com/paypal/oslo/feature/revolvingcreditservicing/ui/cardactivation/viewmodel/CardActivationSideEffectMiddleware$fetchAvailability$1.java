package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware", f = "CardActivationSideEffectMiddleware.kt", i = {0}, l = {103}, m = "fetchAvailability", n = {"eventDispatcher"}, nl = {134}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class CardActivationSideEffectMiddleware$fetchAvailability$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware.access$fetchAvailability(this.getHighSpeedVideoFpsRangesFor, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardActivationSideEffectMiddleware$fetchAvailability$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware cardActivationSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$fetchAvailability$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = cardActivationSideEffectMiddleware;
    }
}
