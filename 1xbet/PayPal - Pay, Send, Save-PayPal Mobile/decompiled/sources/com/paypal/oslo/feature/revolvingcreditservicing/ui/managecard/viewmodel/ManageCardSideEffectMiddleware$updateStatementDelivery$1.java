package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware", f = "ManageCardSideEffectMiddleware.kt", i = {0, 0, 0, 0}, l = {269}, m = "updateStatementDelivery", n = {"readyInfo", "eventDispatcher", "creditAccountId", "enrollingInPaper"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardSideEffectMiddleware$updateStatementDelivery$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardSideEffectMiddleware$updateStatementDelivery$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware manageCardSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$updateStatementDelivery$1> continuation) {
        super(continuation);
        this.getInputFormats = manageCardSideEffectMiddleware;
    }
}
