package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware", f = "ManageWalletMiddleware.kt", i = {0, 0}, l = {146}, m = "handleLoadWalletData", n = {"eventDispatcher", "request"}, nl = {147}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class ManageWalletMiddleware$handleLoadWalletData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageWalletMiddleware$handleLoadWalletData$1(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware manageWalletMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleLoadWalletData$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = manageWalletMiddleware;
    }
}
