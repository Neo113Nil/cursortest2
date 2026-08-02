package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware", f = "ManageCardSideEffectMiddleware.kt", i = {0, 0, 0, 0, 0, 0}, l = {199}, m = "toggleCardLockStatus", n = {"state", "eventDispatcher", "readyInfo", "targetLockState", "creditAccountId", "creditInstrumentId"}, nl = {204}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardSideEffectMiddleware$toggleCardLockStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardSideEffectMiddleware$toggleCardLockStatus$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware manageCardSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$toggleCardLockStatus$1> continuation) {
        super(continuation);
        this.getOutputFormats = manageCardSideEffectMiddleware;
    }
}
