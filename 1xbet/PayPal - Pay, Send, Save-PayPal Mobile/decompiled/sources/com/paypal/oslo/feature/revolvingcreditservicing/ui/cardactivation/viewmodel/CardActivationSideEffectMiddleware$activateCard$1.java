package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware", f = "CardActivationSideEffectMiddleware.kt", i = {0, 0, 0}, l = {86}, m = "activateCard", n = {"state", "eventDispatcher", "request"}, nl = {134}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class CardActivationSideEffectMiddleware$activateCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware.access$activateCard(this.getHighSpeedVideoSizesFor, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardActivationSideEffectMiddleware$activateCard$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware cardActivationSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$activateCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = cardActivationSideEffectMiddleware;
    }
}
