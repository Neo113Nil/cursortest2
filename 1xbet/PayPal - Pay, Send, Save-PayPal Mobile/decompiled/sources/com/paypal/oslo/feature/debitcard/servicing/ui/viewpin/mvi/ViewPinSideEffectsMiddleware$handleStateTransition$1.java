package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware", f = "ViewPinSideEffectsMiddleware.kt", i = {0, 0, 0}, l = {60}, m = "handleStateTransition", n = {"preState", "currentState", "eventDispatcher"}, nl = {61}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class ViewPinSideEffectsMiddleware$handleStateTransition$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputFormats.handleStateTransition2((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState) null, (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPinSideEffectsMiddleware$handleStateTransition$1(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware viewPinSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$handleStateTransition$1> continuation) {
        super(continuation);
        this.getOutputFormats = viewPinSideEffectsMiddleware;
    }
}
