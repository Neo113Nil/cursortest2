package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware", f = "ManageWalletMiddleware.kt", i = {0, 0, 0, 1, 1, 1}, l = {181, 183}, m = "toggleWalletLockUnlock", n = {"cardId", "eventDispatcher", "isLockOperation", "cardId", "eventDispatcher", "isLockOperation"}, nl = {183, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class ManageWalletMiddleware$toggleWalletLockUnlock$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, false, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageWalletMiddleware$toggleWalletLockUnlock$1(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware manageWalletMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$toggleWalletLockUnlock$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = manageWalletMiddleware;
    }
}
