package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware", f = "DebitCardApplyAndCreateSideEffectsMiddleware.kt", i = {0, 0, 0}, l = {55}, m = "handleProvisionCard", n = {"event", "eventDispatcher", "request"}, nl = {56}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware debitCardApplyAndCreateSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = debitCardApplyAndCreateSideEffectsMiddleware;
    }
}
