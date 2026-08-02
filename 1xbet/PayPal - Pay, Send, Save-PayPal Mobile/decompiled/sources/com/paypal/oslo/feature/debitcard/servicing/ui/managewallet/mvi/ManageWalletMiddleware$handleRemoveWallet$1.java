package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware", f = "ManageWalletMiddleware.kt", i = {0, 0}, l = {231}, m = "handleRemoveWallet", n = {"cardId", "eventDispatcher"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class ManageWalletMiddleware$handleRemoveWallet$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageWalletMiddleware$handleRemoveWallet$1(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware manageWalletMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleRemoveWallet$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = manageWalletMiddleware;
    }
}
