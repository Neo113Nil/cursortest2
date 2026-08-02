package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware", f = "ManageWalletMiddleware.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {65, 77}, m = "handleStateTransition", n = {"preState", "currentState", "eventDispatcher", "isLockUnlockRetry", "preState", "currentState", "eventDispatcher", "isLockUnlockRetry"}, nl = {73, 82}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class ManageWalletMiddleware$handleStateTransition$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.handleStateTransition2((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) null, (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageWalletMiddleware$handleStateTransition$1(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware manageWalletMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleStateTransition$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = manageWalletMiddleware;
    }
}
