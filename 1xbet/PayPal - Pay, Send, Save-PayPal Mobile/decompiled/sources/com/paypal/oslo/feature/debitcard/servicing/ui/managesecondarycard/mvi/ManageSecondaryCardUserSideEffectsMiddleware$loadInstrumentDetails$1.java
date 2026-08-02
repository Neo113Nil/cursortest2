package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserSideEffectsMiddleware", f = "ManageSecondaryCardUserSideEffectsMiddleware.kt", i = {0, 0, 0}, l = {99}, m = "loadInstrumentDetails", n = {"postLoadAction", "eventDispatcher", "request"}, nl = {100}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class ManageSecondaryCardUserSideEffectsMiddleware$loadInstrumentDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserSideEffectsMiddleware getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageSecondaryCardUserSideEffectsMiddleware$loadInstrumentDetails$1(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserSideEffectsMiddleware manageSecondaryCardUserSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserSideEffectsMiddleware$loadInstrumentDetails$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = manageSecondaryCardUserSideEffectsMiddleware;
    }
}
